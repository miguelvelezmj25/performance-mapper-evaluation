/*-
 * Copyright (C) 2002, 2017, Oracle and/or its affiliates. All rights reserved.
 *
 * This file was distributed by Oracle as part of a version of Oracle Berkeley
 * DB Java Edition made available at:
 *
 * http://www.oracle.com/technetwork/database/database-technologies/berkeleydb/downloads/index.html
 *
 * Please see the LICENSE file included in the top-level directory of the
 * appropriate version of Oracle Berkeley DB Java Edition for a copy of the
 * license and additional information.
 */

package berkeley.com.sleepycat.je.rep.vlsn;

import berkeley.com.sleepycat.bind.tuple.LongBinding;
import berkeley.com.sleepycat.je.*;
import berkeley.com.sleepycat.je.dbi.DatabaseImpl;
import berkeley.com.sleepycat.je.dbi.EnvironmentImpl;
import berkeley.com.sleepycat.je.rep.vlsn.VLSNRange.VLSNRangeBinding;
import berkeley.com.sleepycat.je.txn.BasicLocker;
import berkeley.com.sleepycat.je.txn.Locker;
import berkeley.com.sleepycat.je.txn.Txn;
import berkeley.com.sleepycat.je.utilint.DbLsn;
import berkeley.com.sleepycat.je.utilint.LongStat;
import berkeley.com.sleepycat.je.utilint.StatGroup;
import berkeley.com.sleepycat.je.utilint.VLSN;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;

import static berkeley.com.sleepycat.je.utilint.VLSN.NULL_VLSN;

/**
 * See @link{VLSNIndex} for an overview of the mapping system. The VLSNTracker
 * packages the VLSNRange and the cached, in-memory VLSNBuckets.
 * <p>
 * The tracker has a notion of the "currentBucket", which is the one receiving
 * updates. All other cached buckets are finished and are awaiting a write to
 * the database. Those finished buckets will only be updated in special
 * circumstances, such as log cleaning or replication stream truncation, when
 * we can assume that there will no readers viewing the buckets.
 */
class VLSNTracker {
    private final EnvironmentImpl envImpl;
    /*
     * In the future, we may want to vary stride, maxMappings and maxDistance
     * dynamically, in reaction to efficient the mappings look.
     */
    private final int stride;
    private final int maxMappings;
    private final int maxDistance;
    private final LongStat nBucketsCreated;
    /*
     * The range should always be updated through assignment to a new
     * VLSNRange, to ensure that the values stay consistent. The current bucket
     * mutex must be taken in order to update this value, so that the current
     * bucket is updated before the range is updated.  When reading range
     * fields, the caller must be sure to get a reference to a single range
     * instance, so that there's no danger of getting inconsistent values.
     */
    protected volatile VLSNRange range;
    /*
     * A cache of buckets that are not on disk. The map key is the bucket's
     * first VLSN.
     */
    SortedMap<Long, VLSNBucket> bucketCache;
    /* The first mapping that is is the tracker cache.  */
    private VLSN firstTrackedVLSN = NULL_VLSN;
    /* The last VLSN that is stored on disk. */
    private VLSN lastOnDiskVLSN = NULL_VLSN;
    private boolean rangeTruncated;

    /*
     * Create an VLSNTracker, with the range initialized from the mapping db.
     */
    VLSNTracker(EnvironmentImpl envImpl,
                DatabaseImpl mappingDbImpl,
                int stride,
                int maxMappings,
                int maxDistance,
                StatGroup statistics)
            throws DatabaseException {

        this.stride = stride;
        this.maxMappings = maxMappings;
        this.maxDistance = maxDistance;
        this.envImpl = envImpl;
        nBucketsCreated =
                new LongStat(statistics, VLSNIndexStatDefinition.N_BUCKETS_CREATED);

        bucketCache = new TreeMap<Long, VLSNBucket>();

        /* Read the current range information. */
        DatabaseEntry key = new DatabaseEntry();
        DatabaseEntry data = new DatabaseEntry();
        LongBinding.longToEntry(VLSNRange.RANGE_KEY, key);

        Cursor cursor = null;
        Locker locker = null;
        try {
            locker = BasicLocker.createBasicLocker(envImpl);
            cursor = DbInternal.makeCursor(mappingDbImpl,
                    locker,
                    CursorConfig.DEFAULT);
            DbInternal.getCursorImpl(cursor).setAllowEviction(false);

            OperationStatus status = cursor.getSearchKey(key, data,
                    LockMode.DEFAULT);
            if(status == OperationStatus.SUCCESS) {
                /* initialize the range from the database. */
                VLSNRangeBinding rangeBinding = new VLSNRangeBinding();
                range = rangeBinding.entryToObject(data);
                lastOnDiskVLSN = range.getLast();
            }
            else if(status == OperationStatus.NOTFOUND) {
                /* No mappings exist before. */
                range = VLSNRange.EMPTY;
            }
            else {
                throw EnvironmentFailureException.unexpectedState
                        ("VLSNTracker init: status=" + status);
            }
        } finally {
            if(cursor != null) {
                cursor.close();
            }

            if(locker != null) {
                locker.operationEnd(true);
            }
        }
    }

    /*
     * Create an empty VLSNTracker. Used during recovery.
     */
    VLSNTracker(EnvironmentImpl envImpl,
                int stride,
                int maxMappings,
                int maxDistance) {

        this.envImpl = envImpl;
        this.stride = stride;
        this.maxMappings = maxMappings;
        this.maxDistance = maxDistance;

        /* Set up a temporary stat group for use during recovery */
        StatGroup statistics =
                new StatGroup(VLSNIndexStatDefinition.GROUP_NAME,
                        VLSNIndexStatDefinition.GROUP_DESC);
        nBucketsCreated =
                new LongStat(statistics,
                        VLSNIndexStatDefinition.N_BUCKETS_CREATED);

        initEmpty();
    }

    /*
     * Used to check bucket boundaries for both the in-memory flush list and
     * the on-disk database buckets. Buckets may not be adjacent, but must be
     * in order.
     */
    static boolean verifyBucketBoundaries(ArrayList<VLSN> firstVLSN,
                                          ArrayList<VLSN> lastVLSN) {
        for(int i = 1; i < firstVLSN.size(); i++) {
            VLSN first = firstVLSN.get(i);
            VLSN prevLast = lastVLSN.get(i - 1);
            if(first.compareTo(prevLast.getNext()) < 0) {
                System.out.println("Boundary problem: bucket " + i +
                        " first " + first +
                        " follows bucket.last " + prevLast);
                return false;
            }
        }
        return true;
    }

    void initEmpty() {
        bucketCache = new TreeMap<Long, VLSNBucket>();
        range = VLSNRange.EMPTY;
    }

    /**
     * Return a bucket for reading a mapping for this VLSN. If vlsn is >
     * lastOnDisk, a bucket is guaranteed to be returned.
     */
    synchronized VLSNBucket getGTEBucket(VLSN vlsn) {

        if(lastOnDiskVLSN.compareTo(vlsn) >= 0) {
            /* The bucket is in the database, not the cache. */
            return null;
        }

        Long pivot = vlsn.getSequence() + 1;
        SortedMap<Long, VLSNBucket> head = bucketCache.headMap(pivot);
        VLSNBucket prevBucket = null;
        if(head.size() > 0) {
            prevBucket = head.get(head.lastKey());
            if(prevBucket.owns(vlsn)) {
                return prevBucket;
            }
        }

        /*
         * If the key is not in the headMap, we must return the next bucket
         * with mappings that follow on.
         */
        SortedMap<Long, VLSNBucket> tail = bucketCache.tailMap(pivot);
        if(tail.size() > 0) {
            VLSNBucket bucket = tail.get(tail.firstKey());
            assert (bucket.owns(vlsn) || bucket.follows(vlsn)) :
                    "VLSN " + vlsn + " got wrong bucket " + bucket;
            return bucket;
        }

        throw EnvironmentFailureException.unexpectedState
                (envImpl, "VLSN " + vlsn + " should be held within this tracker. " +
                        this + " prevBucket=" + prevBucket);
    }

    /**
     * Get the bucket which holds a mapping for this VLSN. If there is no such
     * bucket, get the one directly preceding it. If this VLSN is >=
     * firstTrackedVLSN, then we should be able to guarantee that a bucket is
     * returned.
     */
    synchronized VLSNBucket getLTEBucket(VLSN vlsn) {

        if(firstTrackedVLSN.equals(NULL_VLSN) ||
                (firstTrackedVLSN.compareTo(vlsn) > 0)) {
            return null;
        }

        Long pivot = vlsn.getSequence() + 1;
        SortedMap<Long, VLSNBucket> head = bucketCache.headMap(pivot);
        if(head.size() > 0) {
            return head.get(head.lastKey());
        }

        /*
         * We shouldn't get here. Get the tail purely for creating a debugging
         * message.
         */
        SortedMap<Long, VLSNBucket> tail = bucketCache.tailMap(pivot);
        VLSNBucket nextBucket = null;
        if(tail.size() > 0) {
            nextBucket = tail.get(tail.firstKey());
        }
        throw EnvironmentFailureException.unexpectedState
                (envImpl, "VLSN " + vlsn + " should be held within this tracker. " +
                        this + " nextBucket=" + nextBucket);
    }

    /**
     * Record a new VLSN->LSN mapping. We guarantee that the first and last
     * VLSNs in the range have a mapping. If a VLSN comes out of order, we will
     * discard it, and will not update the range.
     */
    synchronized void track(VLSN vlsn, long lsn, byte entryTypeNum) {

        VLSNBucket currentBucket = null;

        if(vlsn.compareTo(lastOnDiskVLSN) < 0) {

            /*
             * This VLSN is a laggard. It belongs to a bucket that has already
             * gone to disk. Since on disk buckets can't be modified, throw
             * this mapping away. Do be sure to update the range in case
             * lastSync or lastTxnEnd should be updated as a result of this
             * mapping.
             */
            updateRange(vlsn, entryTypeNum);
            return;
        }

        if(bucketCache.size() == 0) {
            /* Nothing in the tracker, add a new bucket. */
            currentBucket = new VLSNBucket(DbLsn.getFileNumber(lsn), stride,
                    maxMappings, maxDistance, vlsn);
            nBucketsCreated.increment();

            bucketCache.put(currentBucket.getFirst().getSequence(),
                    currentBucket);
        }
        else {
            /* Find the last bucket. Only the last bucket is updateable. */
            currentBucket = bucketCache.get(bucketCache.lastKey());
        }

        /*
         * This VLSN is a laggard that was preceded by an earlier mapping which
         * came unseasonably early. This VLSN can't fit into the current
         * bucket, and since we only want to update the last bucket, we'll
         * throw this mapping away.
         */
        if(currentBucket.follows(vlsn)) {
            updateRange(vlsn, entryTypeNum);
            return;
        }

        if(!currentBucket.put(vlsn, lsn)) {

            /*
             * Couldn't put the mapping in this bucket. Close it and move to a
             * new one.
             */
            currentBucket =
                    new VLSNBucket(DbLsn.getFileNumber(lsn), stride,
                            maxMappings, maxDistance, vlsn);
            nBucketsCreated.increment();
            bucketCache.put(currentBucket.getFirst().getSequence(),
                    currentBucket);
            if(!currentBucket.put(vlsn, lsn)) {
                throw EnvironmentFailureException.unexpectedState
                        (envImpl, "Couldn't put VLSN " + vlsn + " into " +
                                currentBucket);
            }
        }

        updateRange(vlsn, entryTypeNum);

        /*
         * Only update the firstTrackedVLSN if this mapping is really resident
         * in a bucket. Don't update it if it's an out-of-order, skipped
         * mapping.
         */
        if(firstTrackedVLSN == NULL_VLSN) {
            firstTrackedVLSN = vlsn;
        }
    }

    /**
     * Update the range with a newly arrived VLSN.
     */
    private void updateRange(VLSN vlsn, byte entryTypeNum) {

        /*
         * Get a reference to the volatile range field so that we always see
         * consistent values.
         */
        VLSNRange currentRange = range;
        range = currentRange.getUpdateForNewMapping(vlsn, entryTypeNum);
    }

    /**
     * Flush the tracker cache to disk.
     * Ideally, we'd allow concurrent VLSN put() calls while a flush to database
     * is happening. To do that, we need a more sophisticated synchronization
     * scheme that defines the immutable vs. mutable portion of the tracker
     * cache. See SR [#17689]
     */
    synchronized void flushToDatabase(DatabaseImpl mappingDbImpl, Txn txn) {

        VLSNRange flushRange = range;

        if(bucketCache.size() == 0) {
            /*
             * No mappings to write out, but it's possible that the range
             * changed due to a truncation, in which case we must update the
             * database. RangeTruncated is used to reduce the chance that
             * we are doing unnecessary writes of the range record to the db.
             */
            if(rangeTruncated) {
                lastOnDiskVLSN = flushRange.writeToDatabase(envImpl,
                        mappingDbImpl, txn);
                rangeTruncated = false;
            }
            return;
        }

        /*
         * Save information about the portion of the cache that we are trying
         * to flush. Close off the last bucket, so the flush portion becomes
         * immutable. In the past, this was in a synchronization block.
         * This isn't strictly needed right now, since the method is currently
         * fully synchronized, but is a good practice, and will be
         * necessary if future changes make it possible to have concurrent
         * puts.
         */
        VLSNBucket lastBucket = bucketCache.get(bucketCache.lastKey());
        lastBucket.close();

        /*
         * Write the flush portion to disk. Ideally, this portion would be done
         * without synchronization on the tracker, to permit concurrent reads
         * and writes to the tracker. Note that because there is no
         * synchronization, the buckets must be flushed to disk in vlsn order,
         * so that the vlsn index always looks consistent. There should be no
         * gaps in the bucket range. This assumption permits concurrent access
         * by VLSNIndex.getGTEBucketFromDatabase.
         */
        VLSN currentLastVLSN = lastOnDiskVLSN;
        for(Long key : bucketCache.keySet()) {

            VLSNBucket target = bucketCache.get(key);

            /* Do some sanity checking before we write this bucket to disk. */
            validateBeforeWrite(target,
                    flushRange,
                    currentLastVLSN,
                    target == lastBucket);
            target.writeToDatabase(envImpl, mappingDbImpl, txn);
            currentLastVLSN = target.getLast();
        }

        lastOnDiskVLSN = flushRange.writeToDatabase(envImpl,
                mappingDbImpl, txn);
        rangeTruncated = false;

        /*
         * Update the tracker to remove the parts that have been written to
         * disk. Update firstTrackedVLSN, lastOnDiskVLSN, and clear the bucket
         * cache.
         *
         * In the current implementation, bucketCache is guaranteed not to
         * change, so we can just clear the cache. If we had written the
         * buckets out without synchronization, the cache might have gained
         * mappings, and we wouuld have to be careful to set the
         * firstTrackedVLSN to be the first VLSN of the remaining buckets, and
         * to set lastTrackedVLSN to be the last VLSN in flushRange.
         *
         * We would also have to explicitly call SortedMap.remove() to remove
         * the written buckets. Do not use TreeMap.tailSet, which would
         * inadvertently leave us with the semantics of a SubMap, which has
         * mandated key ranges. With rollbacks, we may end up adding buckets
         * that are "repeats" in the future.
         */
        bucketCache.clear();
        firstTrackedVLSN = NULL_VLSN;
    }

    /**
     * Do some sanity checking before the write, to help prevent any corruption.
     */
    private void validateBeforeWrite(VLSNBucket target,
                                     VLSNRange flushRange,
                                     VLSN currentLastVLSN,
                                     boolean isLastBucket) {

        if(!(currentLastVLSN.equals(NULL_VLSN)) &&
                (target.getFirst().compareTo(currentLastVLSN) <= 0)) {
            throw EnvironmentFailureException.unexpectedState
                    (envImpl, "target bucket overlaps previous bucket. " +
                            "currentLastVLSN= " + currentLastVLSN + " target=" +
                            target);
        }

        if(target.getLast().compareTo(flushRange.getLast()) > 0) {
            throw EnvironmentFailureException.unexpectedState
                    (envImpl, "target bucket exceeds flush range. " +
                            "range= " + flushRange + " target=" +
                            target);
        }

        if(isLastBucket) {
            if(target.getLast().compareTo(flushRange.getLast()) != 0) {
                throw EnvironmentFailureException.unexpectedState
                        (envImpl, "end of last bucket should match end of range. " +
                                "range= " + flushRange + " target=" + target);
            }
        }
    }

    synchronized void truncateFromHead(VLSN deleteEnd, long deleteFileNum) {
        /*
         * Update range first, to prevent others from attempting to read the
         * truncated portions. Update the firstTrackedLSN last, after the
         * buckets are removed; getLTEBucket relies on the firstTrackedLSN
         * value.
         */
        VLSNRange oldRange = range;
        range = oldRange.shortenFromHead(deleteEnd);

        /*
         * Ensure that the range is written to the db even if the resulting
         * number of buckets is 0.
         */
        rangeTruncated = true;

        /*
         * afterDelete may not == range.getFirst, becayse range.getFirst may
         * be NULL_VLSN if the entire vlsn index has been deleted.
         */
        VLSN afterDelete = deleteEnd.getNext();

        /**
         * Check if the cached buckets needs to be modified. Suppose vlsns 1-8
         * are on disk, and vlsns 12->40 are in the tracker cache, with an out
         * of order gap from 9 - 11.
         *
         * case 1: deleteEnd <= 8, Do not need to truncate anything in the
         *  bucket cacke, but we may have to make a ghost bucket to fill the
         *  gap.
         * case 2: deleteEnd == 11, we don't need to modify the cache or
         *         create a ghost bucket.
         * case 3: deleteEnd >8 and < 11 is in the gap, we need to create a
         *         ghost bucket to hold the beginning of the range..
         * case 4: deleteEnd >= 12, we need to modify the bucket cache.
         */
        if(!lastOnDiskVLSN.equals(VLSN.NULL_VLSN) &&
                (lastOnDiskVLSN.compareTo(deleteEnd) >= 0)) {

            /*
             * case 1:  the buckets in the tracker cache are unaffected, all
             * the pertinent mappings are on disk.
             */
            if(lastOnDiskVLSN.equals(deleteEnd)) {
                if(firstTrackedVLSN.compareTo(afterDelete) > 0) {
                    checkForGhostBucket(bucketCache, deleteFileNum);
                }
                lastOnDiskVLSN = NULL_VLSN;
            }
            return;
        }

        assert (!firstTrackedVLSN.equals(NULL_VLSN));

        if(firstTrackedVLSN.equals(afterDelete)) {
            /* case 2: The tracker is lined up perfectly with the new range. */
            lastOnDiskVLSN = NULL_VLSN;
            return;
        }

        if(firstTrackedVLSN.compareTo(afterDelete) > 0) {
            /*
             * case 3: we have to make a ghost bucket.
             */
            checkForGhostBucket(bucketCache, deleteFileNum);
            lastOnDiskVLSN = NULL_VLSN;
            return;
        }

        /*
         * case 4: we have to prune the buckets.
         */
        VLSNBucket owningBucket = getLTEBucket(deleteEnd);
        Long retainBucketKey = owningBucket.getFirst().getNext().getSequence();
        SortedMap<Long, VLSNBucket> tail;
        try {
            /*
             * We need to chop off part of the bucket cache. Find the portion
             * to retain.
             */
            tail = bucketCache.tailMap(retainBucketKey);
            checkForGhostBucket(tail, deleteFileNum);
            bucketCache = tail;
        } catch(NoSuchElementException e) {
            firstTrackedVLSN = NULL_VLSN;
            bucketCache = new TreeMap<Long, VLSNBucket>();
        }

        lastOnDiskVLSN = NULL_VLSN;
    }

    private void checkForGhostBucket(SortedMap<Long, VLSNBucket> buckets,
                                     long deleteFileNum) {
        /*
         * The range has just been truncated. If the first bucket's first vlsn
         * != the first in range, insert a GhostBucket.
         */
        Long firstKey = buckets.firstKey();
        VLSNBucket firstBucket = buckets.get(firstKey);
        VLSN firstRangeVLSN = range.getFirst();
        VLSN firstBucketVLSN = firstBucket.getFirst();
        if(!firstBucketVLSN.equals(firstRangeVLSN)) {
            long nextFile =
                    envImpl.getFileManager().getFollowingFileNum(deleteFileNum,
                            true /* forward */);
            long lastPossibleLsn = firstBucket.getLsn(firstBucketVLSN);
            VLSNBucket placeholder = new GhostBucket(firstRangeVLSN,
                    DbLsn.makeLsn(nextFile, 0),
                    lastPossibleLsn);
            buckets.put(firstRangeVLSN.getSequence(), placeholder);
        }
    }

    /**
     * Remove the mappings for VLSNs >= deleteStart.  This should only be used
     * at syncup, or recovery. We can assume no new mappings are coming in, but
     * the VLSNIndex may be read during this time; checkpoints continue to
     * happen during rollbacks. Since syncup is always at a sync-able log
     * entry, and since we don't roll back past a commit, we can assume that
     * the lastSync can be changed to deleteStart.getPrev(), and lastTxnEnd is
     * unchanged.  The VLSNRange itself is updated before the tracker and
     * on-disk buckets are pruned.
     * <p>
     * The VLSNIndex guarantees that the beginning and end vlsns in the range
     * have mappings so LTE and GTE search operations work. When truncating the
     * mappings in the tracker, check to see if the new end vlsn has a mapping,
     * since that may not happen if the buckets are cut in the middle, or have
     * a gap due to out of order mapping. For example, suppose mapping for vlsn
     * 20 came before the mappings for vlsn 17, 18 and 19. The buckets would
     * have this gap:
     * Bucket A: vlsns 10-16
     * Bucket B: vlsns 20-25
     * Bucket C: vlsns 26 - 30
     * If the new end of vlsn range is 11-14, 17, 18, 19, 21 - 24, or 27-29,
     * we have to end the vlsn tracker with a new mapping of
     * (vlsn (deleteStart-1) ->  prevLsn) to cap off the buckets.
     * <p>
     * Cases:
     * End of range is in the gap -- either 17, 18, 19
     * 1. on disk buckets exist, but don't encompass the gap: bucket A on disk
     * 2. all buckets are in the tracker cache: bucket A in tracker
     * 3. on disk buckets encompass the gap: bucket A and B on disk.
     */
    synchronized void truncateFromTail(VLSN deleteStart, long prevLsn) {

        /*
         * Update the range first, it will define the range that the vlsnIndex
         * covers. Then adjust any mappings held in the bucket cache. Don't
         * update the lastOnDiskVLSN marker, which says what is on disk. Since
         * the on-disk portion may also get truncated, the caller will update
         * the lastOnDiskVLSN field when it inspects the database.
         */
        VLSNRange oldRange = range;
        range = oldRange.shortenFromEnd(deleteStart);

        /*
         * Ensure that the range is written to the db even if the resulting
         * number of buckets is 0.
         */
        rangeTruncated = true;

        if(firstTrackedVLSN.equals(NULL_VLSN)) {
            /* No mappings in this tracker */
            return;
        }

        if(firstTrackedVLSN.compareTo(deleteStart) >= 0) {

            /*
             * Everything in this tracker should be removed. In addition, the
             * caller may be removing some items from the database.
             */
            bucketCache.clear();
            firstTrackedVLSN = NULL_VLSN;
            return;
        }

        /*
         * We need to do some pruning of the bucket in the cache. Find the
         * buckets in the bucketCache that have mappings >= deleteStart, and
         * remove their mappings. First establish the headset of buckets that
         * should be preserved.
         */
        VLSNBucket targetBucket = getGTEBucket(deleteStart);
        Long targetKey = targetBucket.getFirst().getSequence();

        /* The newCache has buckets that should be preserved. */
        SortedMap<Long, VLSNBucket> newCache =
                new TreeMap<Long, VLSNBucket>(bucketCache.headMap(targetKey));

        /*
         * Prune any mappings >= deleteStart out of targetBucket. If it has any
         * mappings left, add it to newCache.
         */
        targetBucket.removeFromTail(deleteStart, prevLsn);
        if(!targetBucket.empty()) {
            newCache.put(targetBucket.getFirst().getSequence(),
                    targetBucket);
        }

        bucketCache = newCache;

        /*
         * Now all truncated mappings have been removed from the index. Check
         * that the end point of the vlsn range is represented in this
         * tracker. Since vlsn mappings can  come out of order, it's
         * possible that the buckets have a gap, and that truncation will
         * cleave the bucket cache just at a point where a mapping is
         * missing. For example, vlsn mappings come in this order:
         *           vlsn 16, vlsn 18, vlsn 17
         * causing the buckets to have this gap:
         *           bucket N: vlsn 10 - 16
         *           bucket N+1: vlsn 18 - 20
         * and that the vlsn range is truncated with a deleteStart of vlsn 18.
         * The new end range becomes 17, but the buckets do not have a
         * mapping for vlsn 17. If so, create a mapping now.
         *
         * If we are at this point, we know that the tracker should contain
         * a mapping for the last VLSN in the range. Fix it now, so the
         * datastructure is as tidy as possible.
         */
        boolean needEndMapping = false;
        if(bucketCache.isEmpty()) {
            needEndMapping = true;
        }
        else {
            VLSNBucket lastBucket = bucketCache.get(bucketCache.lastKey());
            needEndMapping =
                    (lastBucket.getLast().compareTo(range.getLast()) < 0);
        }

        if(needEndMapping) {
            addEndMapping(range.getLast(), prevLsn);
        }
    }

    /**
     * Called by the VLSNIndex to see if we have to add a bucket in the tracker
     * after pruning the on-disk storage. The get{LTE,GTE}Bucket methods
     * assume that there are mappings for the first and last VLSN in the range.
     * But since out of order vlsn mappings can cause non-contiguous buckets,
     * the pruning may have lost the end mapping. [#23491]
     */
    synchronized void ensureRangeEndIsMapped(VLSN lastVLSN, long lastLsn) {

        /**
         * if lastOnDiskVLSN < lastVLSN < firstTrackedVLSN or
         *    lastOnDiskVLSN < lastVLSN and firstTrackedVLSN is null
         * then we need to add a mapping for lastVLSN->lastLsn. Otherwise a
         * mapping already exists.
         */
        if(lastOnDiskVLSN.compareTo(lastVLSN) < 0) {

            /*
             * The on-disk vlsn mappings aren't sufficient to cover the
             * lastVLSN. There needs to be a mapping in the tracker for the
             * end point of the range.
             */
            if(!firstTrackedVLSN.equals(NULL_VLSN)) {

                /*
                 * There are mappings in the tracker, so we can assume
                 * that they cover the end point, because truncateFromTail()
                 * should have adjusted for that. But assert to be sure!
                 */
                if(lastVLSN.compareTo(firstTrackedVLSN) < 0) {
                    throw EnvironmentFailureException.unexpectedState
                            (envImpl,
                                    "Expected this tracker to cover vlsn " + lastVLSN +
                                            " after truncateFromTail. LastOnDiskVLSN= " +
                                            lastOnDiskVLSN + " tracker=" + this);
                }

                return;
            }

            /*
             * There are no mappings in the tracker. The on disk mappings were
             * pruned, and a gap was created between what was on disk and what
             * is in the tracker cache. Add a mapping.
             */
            addEndMapping(lastVLSN, lastLsn);
        }
    }

    /**
     * Add a bucket holding a lastVLSN -> lastLsn mapping
     */
    private void addEndMapping(VLSN lastVLSN, long lastLsn) {
        /* Assert that it's in the range */
        assert (lastVLSN.compareTo(range.getLast()) == 0) :
                "lastVLSN=" + lastVLSN + " lastLsn = " + lastLsn +
                        " range=" + range;

        VLSNBucket addBucket =
                new VLSNBucket(DbLsn.getFileNumber(lastLsn), stride,
                        maxMappings, maxDistance, lastVLSN);
        addBucket.put(lastVLSN, lastLsn);
        nBucketsCreated.increment();
        bucketCache.put(addBucket.getFirst().getSequence(), addBucket);
        if(firstTrackedVLSN.equals(NULL_VLSN)) {
            firstTrackedVLSN = lastVLSN;
        }
    }

    /**
     * Attempt to replace the mappings in this vlsnIndex for
     * deleteStart->lastVLSN with those from the recovery mapper.
     * Since we do not supply a prevLsn argument, we may not be able to "cap"
     * the truncated vlsn bucket the same what that we can in
     * truncateFromTail. Because of that, we may need to remove mappings that
     * are < deleteStart.
     * <p>
     * For example, suppose a bucket holds mappings
     * 10 -> 101
     * 15 -> 201
     * 18 -> 301
     * If deleteStart == 17, we will have to delete all the way to vlsn 15.
     * <p>
     * The maintenance of VLSNRange.lastSync and lastTxnEnd are simplified
     * because of assumptions we can make because we are about to append
     * mappings found by the recovery tracker that begin at deleteStart. If
     * lastSync and lastTxnEnd are <= deleteStart, we know that they will
     * either stay the same, or be replaced by lastSync and lastTxnEnd from the
     * recoveryTracker. Even we delete mappings that are < deleteStart, we know
     * that we did not roll back past an abort or commit, so that we do not
     * have to updated the lastSync or lastTxnEnd value.
     */
    void merge(VLSN prunedLastOnDiskVLSN, VLSNRecoveryTracker recoveryTracker) {

        VLSNRange oldRange = range;
        range = oldRange.merge(recoveryTracker.range);
        VLSN recoveryFirst = recoveryTracker.getRange().getFirst();

        lastOnDiskVLSN = prunedLastOnDiskVLSN;

        /*
         * Find the buckets in the bucketCache that have mappings >=
         * recoveryFirst, and remove their mappings. First establish the
         * headset of buckets that should be preserved. At this point, we
         * have already pruned the database, so the bucket set may not
         * be fully contiguous -- we may have pruned away mappings that
         * would normally be in the database.
         */
        if(bucketCache.size() == 0) {
            /* Just take all the recovery tracker's mappings */
            bucketCache = recoveryTracker.bucketCache;
        }
        else {
            VLSNBucket targetBucket = getGTEBucket(recoveryFirst);
            Long targetKey = targetBucket.getFirst().getSequence();

            /* The newCache holds buckets that should be preserved. */
            SortedMap<Long, VLSNBucket> newCache =
                    new TreeMap<Long, VLSNBucket>(bucketCache.headMap(targetKey));

            /*
             * Prune any mappings >= recoveryFirst out of targetBucket. If it
             * has any mappings left, add it to newCache.
             */
            targetBucket.removeFromTail(recoveryFirst, DbLsn.NULL_LSN);
            if(!targetBucket.empty()) {
                newCache.put(targetBucket.getFirst().getSequence(),
                        targetBucket);
            }

            newCache.putAll(recoveryTracker.bucketCache);
            bucketCache = newCache;
        }

        if(bucketCache.size() > 0) {
            VLSNBucket firstBucket = bucketCache.get(bucketCache.firstKey());
            firstTrackedVLSN = firstBucket.getFirst();
        }
    }

    void append(VLSNRecoveryTracker recoveryTracker) {

        /*
         * This method assume that there is no overlap between this tracker
         * and the recovery tracker. Everything in this tracker should precede
         * the recovery tracker.
         */
        if(!range.getLast().isNull()) {
            if(range.getLast().compareTo
                    (recoveryTracker.getFirstTracked()) >= 0) {

                throw EnvironmentFailureException.unexpectedState
                        (envImpl,
                                "Expected this tracker to precede recovery tracker. " +
                                        "This tracker= " + this + " recoveryTracker = " +
                                        recoveryTracker);
            }
        }

        bucketCache.putAll(recoveryTracker.bucketCache);
        VLSNRange currentRange = range;
        range = currentRange.getUpdate(recoveryTracker.getRange());
        if(bucketCache.size() > 0) {
            VLSNBucket firstBucket = bucketCache.get(bucketCache.firstKey());
            firstTrackedVLSN = firstBucket.getFirst();
        }
    }

    VLSNRange getRange() {
        return range;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(range);
        sb.append(" firstTracked=").append(firstTrackedVLSN);
        sb.append(" lastOnDiskVLSN=").append(lastOnDiskVLSN);

        for(VLSNBucket bucket : bucketCache.values()) {
            sb.append("\n");
            sb.append(bucket);
        }
        return sb.toString();
    }

    /**
     * For unit test support.
     */
    synchronized boolean verify(boolean verbose) {

        if(!range.verify(verbose)) {
            return false;
        }

        /* Check that all the buckets are in order. */
        ArrayList<VLSN> firstVLSN = new ArrayList<VLSN>();
        ArrayList<VLSN> lastVLSN = new ArrayList<VLSN>();

        for(VLSNBucket b : bucketCache.values()) {
            firstVLSN.add(b.getFirst());
            lastVLSN.add(b.getLast());
        }

        if(!verifyBucketBoundaries(firstVLSN, lastVLSN)) {
            return false;
        }

        if(firstVLSN.size() > 0) {
            if(!firstVLSN.get(0).equals(firstTrackedVLSN)) {
                if(verbose) {
                    System.err.println("firstBucketVLSN = " +
                            firstVLSN.get(0) + " should equal " +
                            firstTrackedVLSN);
                }
                return false;
            }

            VLSN lastBucketVLSN = lastVLSN.get(lastVLSN.size() - 1);
            if(!lastBucketVLSN.equals(range.getLast())) {
                if(verbose) {
                    System.err.println("lastBucketVLSN = " + lastBucketVLSN +
                            " should equal " + range.getLast());
                }
                return false;
            }
        }

        return true;
    }

    VLSN getFirstTracked() {
        return firstTrackedVLSN;
    }

    VLSN getLastOnDisk() {
        return lastOnDiskVLSN;
    }

    void setLastOnDiskVLSN(VLSN lastOnDisk) {
        lastOnDiskVLSN = lastOnDisk;
    }

    /*
     * For unit test support only. Can only be called when replication stream
     * is quiescent.
     */
    boolean isFlushedToDisk() {
        return lastOnDiskVLSN.equals(range.getLast());
    }
}
