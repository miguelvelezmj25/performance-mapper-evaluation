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

package berkeley.com.sleepycat.je.cleaner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import berkeley.com.sleepycat.je.CacheMode;
import berkeley.com.sleepycat.je.DatabaseEntry;
import berkeley.com.sleepycat.je.DatabaseException;
import berkeley.com.sleepycat.je.DbInternal;
import berkeley.com.sleepycat.je.EnvironmentFailureException;
import berkeley.com.sleepycat.je.OperationResult;
import berkeley.com.sleepycat.je.dbi.CursorImpl;
import berkeley.com.sleepycat.je.dbi.DatabaseId;
import berkeley.com.sleepycat.je.dbi.DatabaseImpl;
import berkeley.com.sleepycat.je.dbi.DbTree;
import berkeley.com.sleepycat.je.dbi.DbType;
import berkeley.com.sleepycat.je.dbi.EnvironmentImpl;
import berkeley.com.sleepycat.je.dbi.MemoryBudget;
import berkeley.com.sleepycat.je.dbi.StartupTracker;
import berkeley.com.sleepycat.je.log.LogManager;
import berkeley.com.sleepycat.je.log.ReplicationContext;
import berkeley.com.sleepycat.je.log.entry.LNLogEntry;
import berkeley.com.sleepycat.je.tree.BIN;
import berkeley.com.sleepycat.je.tree.FileSummaryLN;
import berkeley.com.sleepycat.je.tree.MapLN;
import berkeley.com.sleepycat.je.tree.Tree;
import berkeley.com.sleepycat.je.tree.TreeLocation;
import berkeley.com.sleepycat.je.txn.BasicLocker;
import berkeley.com.sleepycat.je.txn.LockType;
import berkeley.com.sleepycat.je.txn.Locker;
import berkeley.com.sleepycat.je.utilint.DbLsn;
import berkeley.com.sleepycat.je.utilint.LoggerUtils;

/**
 * The UP tracks utilization summary information for all log files.
 *
 * <p>Unlike the UtilizationTracker, the UP is not accessed under the log write
 * latch and is instead synchronized on itself for protecting the cache.  It is
 * not accessed during the primary data access path, except for when flushing
 * (writing) file summary LNs.  This occurs in the following cases:
 * <ol>
 * <li>The summary information is flushed at the end of a checkpoint.  This
 * allows tracking to occur in memory in between checkpoints, and replayed
 * during recovery.</li>
 * <li>When committing the truncateDatabase and removeDatabase operations, the
 * summary information is flushed because detail tracking for those operations
 * is not replayed during recovery</li>
 * <li>The evictor will ask the UtilizationTracker to flush the largest summary
 * if the memory taken by the tracker exeeds its budget.</li>
 * </ol>
 *
 * <p>The cache is populated by the RecoveryManager just before performing the
 * initial checkpoint.  The UP must be open and populated in order to respond
 * to requests to flush summaries and to evict tracked detail, even if the
 * cleaner is disabled.</p>
 *
 * <p>WARNING: While synchronized on this object, eviction is not permitted.
 * If it were, this could cause deadlocks because the order of locking would be
 * the UP object and then the evictor.  During normal eviction the order is to
 * first lock the evictor and then the UP, when evicting tracked detail.</p>
 *
 * <p>The methods in this class synchronize to protect the cached summary
 * information.  Some methods also access the UP database.  However, because
 * eviction must not occur while synchronized, UP database access is not
 * performed while synchronized except in one case: when inserting a new
 * summary record.  In that case we disallow eviction during the database
 * operation.</p>
 */
public class UtilizationProfile {

    private final EnvironmentImpl env;
    private final UtilizationTracker tracker;
    private DatabaseImpl fileSummaryDb;
    private SortedMap<Long, FileSummary> fileSummaryMap;
    private boolean cachePopulated;
    private final Logger logger;

    /**
     * Creates an empty UP.
     */
    public UtilizationProfile(EnvironmentImpl env,
                              UtilizationTracker tracker) {
        this.env = env;
        this.tracker = tracker;
        fileSummaryMap = new TreeMap<>();

        logger = LoggerUtils.getLogger(getClass());
    }

    /**
     * Returns an approximation of the total log size.  Used for stats.
     */
    public long getTotalLogSize() {

        /* Start with the size from the profile. */
        long size = 0;
        synchronized (this) {
            for (FileSummary summary : fileSummaryMap.values()) {
                size += summary.totalSize;
            }
        }

        /*
         * Add sizes that are known to the tracker but are not yet in the
         * profile.  The FileSummary.totalSize field is the delta for new
         * log entries added.  Typically the last log file is only one that
         * will have a delta, but previous files may also not have been added
         * to the profile yet.
         */
        for (TrackedFileSummary summary : tracker.getTrackedFiles()) {
            size += summary.totalSize;
        }

        return size;
    }

    /**
     * Gets the base summary from the cached map.  Add the tracked summary, if
     * one exists, to the base summary.  Sets all entries obsolete, if the file
     * is in the migrateFiles set.
     */
    synchronized FileSummary getFileSummary(Long file) {

        /* Get base summary. */
        FileSummary summary = fileSummaryMap.get(file);

        /* Add tracked summary */
        TrackedFileSummary trackedSummary = tracker.getTrackedFile(file);
        if (trackedSummary != null) {
            FileSummary totals = new FileSummary();
            totals.add(summary);
            totals.add(trackedSummary);
            summary = totals;
        }

        return summary;
    }

    /**
     * Count the given locally tracked info as obsolete and then log the file
     * and database info.
     */
    public void flushLocalTracker(LocalUtilizationTracker localTracker)
        throws DatabaseException {

        /* Count tracked info under the log write latch. */
        env.getLogManager().transferToUtilizationTracker(localTracker);

        /* Write out the modified file and database info. */
        flushFileUtilization(localTracker.getTrackedFiles());
        flushDbUtilization(localTracker);
    }

    /**
     * Flush a FileSummaryLN node for each given TrackedFileSummary.
     */
    public void flushFileUtilization
        (Collection<TrackedFileSummary> activeFiles)
        throws DatabaseException {

        /* Utilization flushing may be disabled for unittests. */
        if (!DbInternal.getCheckpointUP
            (env.getConfigManager().getEnvironmentConfig())) {
            return;
        }

        /* Write out the modified file summaries. */
        for (TrackedFileSummary activeFile : activeFiles) {
            long fileNum = activeFile.getFileNumber();
            TrackedFileSummary tfs = tracker.getTrackedFile(fileNum);
            if (tfs != null) {
                flushFileSummary(tfs);
            }
        }
    }

    /**
     * Flush a MapLN for each database that has dirty utilization in the given
     * tracker.
     */
    private void flushDbUtilization(LocalUtilizationTracker localTracker)
        throws DatabaseException {

        /* Utilization flushing may be disabled for unittests. */
        if (!DbInternal.getCheckpointUP
            (env.getConfigManager().getEnvironmentConfig())) {
            return;
        }

        /* Write out the modified MapLNs. */
        for (Object o : localTracker.getTrackedDbs()) {
            DatabaseImpl db = (DatabaseImpl) o;
            if (!db.isDeleted() && db.isDirty()) {
                env.getDbTree().modifyDbRoot(db);
            }
        }
    }

    /**
     * Returns a copy of the current file summary map, optionally including
     * tracked summary information, for use by the DbSpace utility and by unit
     * tests.  The returned map's key is a Long file number and its value is a
     * FileSummary.
     */
    public synchronized SortedMap<Long, FileSummary>
        getFileSummaryMap(boolean includeTrackedFiles) {

        assert cachePopulated;

        if (includeTrackedFiles) {

            /*
             * Copy the fileSummaryMap to a new map, adding in the tracked
             * summary information for each entry.
             */
            TreeMap<Long, FileSummary> map = new TreeMap<>();
            for (Long file : fileSummaryMap.keySet()) {
                FileSummary summary = getFileSummary(file);
                map.put(file, summary);
            }

            /* Add tracked files that are not in fileSummaryMap yet. */
            for (TrackedFileSummary summary : tracker.getTrackedFiles()) {
                Long fileNum = summary.getFileNumber();
                if (!map.containsKey(fileNum)) {
                    map.put(fileNum, summary);
                }
            }
            return map;
        } else {
            return new TreeMap<>(fileSummaryMap);
        }
    }

    /**
     * Clears the cache of file summary info.  The cache is not automatically
     * repopulated, so this method should currently be called only by close.
     */
    private synchronized void clearCache() {

        int memorySize = fileSummaryMap.size() *
            MemoryBudget.UTILIZATION_PROFILE_ENTRY;
        MemoryBudget mb = env.getMemoryBudget();
        mb.updateAdminMemoryUsage(0 - memorySize);

        fileSummaryMap = new TreeMap<>();
        cachePopulated = false;
    }

    /**
     * Removes a file from the MapLN utilization info, the utilization database
     * and the profile, after it has been determined that the file does not
     * exist.
     */
    void removeFile(Long fileNum, Set<DatabaseId> databases)
        throws DatabaseException {

        removePerDbMetadata(Collections.singleton(fileNum), databases);
        removePerFileMetadata(fileNum);
    }

    /**
     * Removes a file from the utilization database and the profile.
     *
     * For a given file, this method should be called after calling
     * removePerDbMetadata.  We update the MapLNs before deleting
     * FileSummaryLNs in case there is an error during this process.  If a
     * FileSummaryLN exists, we will redo this process during the next recovery
     * (populateCache).
     */
    void removePerFileMetadata(Long fileNum)
        throws DatabaseException {

        /* Synchronize to update the cache. */
        synchronized (this) {
            assert cachePopulated;

            /* Remove from the cache. */
            FileSummary oldSummary = fileSummaryMap.remove(fileNum);
            if (oldSummary != null) {
                MemoryBudget mb = env.getMemoryBudget();
                mb.updateAdminMemoryUsage
                    (0 - MemoryBudget.UTILIZATION_PROFILE_ENTRY);
            }
        }

        /* Do not synchronize during LN deletion, to permit eviction. */
        deleteFileSummary(fileNum);
    }

    /**
     * Updates all MapLNs to remove the DbFileSummary for the given set of
     * file.  This method performs eviction and is not synchronized.
     *
     * This method is optimally called with a set of files that will
     * subsequently be passed to removePerFileMetadata.  When a set of files is
     * being deleted, this prevents writing a MapLN more than once when more
     * than one file contains entries for that database.
     *
     * For a given file, this method should be called before calling
     * removePerFileMetadata.  We update the MapLNs before deleting
     * FileSummaryLNs in case there is an error during this process.  If a
     * FileSummaryLN exists, we will redo this process during the next recovery
     * (populateCache).
     */
    void removePerDbMetadata(final Collection<Long> fileNums,
                             final Set<DatabaseId> databases)
        throws DatabaseException {

        final LogManager logManager = env.getLogManager();
        final DbTree dbTree = env.getDbTree();
        /* Only call logMapTreeRoot once for ID and NAME DBs. */
        DatabaseImpl idDatabase = dbTree.getDb(DbTree.ID_DB_ID);
        DatabaseImpl nameDatabase = dbTree.getDb(DbTree.NAME_DB_ID);
        boolean logRoot = false;
        if (logManager.removeDbFileSummaries(idDatabase, fileNums)) {
            logRoot = true;
        }
        if (logManager.removeDbFileSummaries(nameDatabase, fileNums)) {
            logRoot = true;
        }
        if (logRoot) {
            env.logMapTreeRoot();
        }
        /* Use DB ID set if available to avoid full scan of ID DB. */
        if (databases != null) {
            for (DatabaseId dbId : databases) {
                if (!dbId.equals(DbTree.ID_DB_ID) &&
                    !dbId.equals(DbTree.NAME_DB_ID)) {
                    DatabaseImpl db = dbTree.getDb(dbId);
                    try {
                        if (db != null &&
                            logManager.removeDbFileSummaries(db, fileNums)) {
                            dbTree.modifyDbRoot(db);
                        }
                    } finally {
                        dbTree.releaseDb(db);
                    }
                }
            }
        } else {

            /*
             * Use LockType.NONE for traversing the ID DB so that a lock is not
             * held when calling modifyDbRoot, which must release locks to
             * handle deadlocks.
             */
            CursorImpl.traverseDbWithCursor(idDatabase,
                                            LockType.NONE,
                                            true /*allowEviction*/,
                                            new CursorImpl.WithCursor() {
                public boolean withCursor(CursorImpl cursor,
                                          DatabaseEntry key,
                                          DatabaseEntry data)
                    throws DatabaseException {

                    MapLN mapLN =
                        (MapLN) cursor.lockAndGetCurrentLN(LockType.NONE);

                    if (mapLN != null) {
                        DatabaseImpl db = mapLN.getDatabase();
                        if (logManager.removeDbFileSummaries(db, fileNums)) {

                            /*
                             * Because we're using dirty-read, silently do
                             * nothing if the DB does not exist
                             * (mustExist=false).
                             */
                            dbTree.modifyDbRoot
                                (db, DbLsn.NULL_LSN /*ifBeforeLsn*/,
                                 false /*mustExist*/);
                        }
                    }
                    return true;
                }
            });
        }
    }

    /**
     * Deletes all FileSummaryLNs for the file.  This method performs eviction
     * and is not synchronized.
     */
    private void deleteFileSummary(final Long fileNum)
        throws DatabaseException {

        Locker locker = null;
        CursorImpl cursor = null;
        try {
            locker = BasicLocker.createBasicLocker(env, false /*noWait*/);
            cursor = new CursorImpl(fileSummaryDb, locker);
            /* Perform eviction in unsynchronized methods. */
            cursor.setAllowEviction(true);

            DatabaseEntry keyEntry = new DatabaseEntry();
            DatabaseEntry dataEntry = new DatabaseEntry();

            /* Do not return data to avoid a fetch of the existing LN. */
            dataEntry.setPartial(0, 0, true);

            /* Search by file number. */
            OperationResult result = null;
            if (getFirstFSLN(
                cursor, fileNum, keyEntry, dataEntry, LockType.WRITE)) {
                result = DbInternal.DEFAULT_RESULT;
            }

            /* Delete all LNs for this file number. */
            while (result != null &&
                   fileNum ==
                   FileSummaryLN.getFileNumber(keyEntry.getData())) {

                /* Perform eviction once per operation. */
                env.daemonEviction(true /*backgroundIO*/);

                /*
                 * Eviction after deleting is not necessary since we did not
                 * fetch the LN.
                 */
                cursor.deleteCurrentRecord(ReplicationContext.NO_REPLICATE);

                result = cursor.getNext(
                    keyEntry, dataEntry, LockType.WRITE,
                    false /*dirtyReadAll*/, true /*forward*/,
                    false /*isLatched*/, null /*rangeConstraint*/);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            if (locker != null) {
                locker.operationEnd();
            }
        }

        /* Explicitly remove the file from the tracker.  */
        TrackedFileSummary tfs = tracker.getTrackedFile(fileNum);
        if (tfs != null) {
            env.getLogManager().removeTrackedFile(tfs);
        }
    }

    /**
     * Updates and stores the FileSummary for a given tracked file, if flushing
     * of the summary is allowed.
     */
    public void flushFileSummary(TrackedFileSummary tfs)
        throws DatabaseException {

        if (tfs.getAllowFlush()) {
            putFileSummary(tfs);
        }
    }

    /**
     * Updates and stores the FileSummary for a given tracked file.  This
     * method is synchronized and may not perform eviction.
     */
    private synchronized PackedOffsets putFileSummary(TrackedFileSummary tfs)
        throws DatabaseException {

        if (env.isReadOnly()) {
            throw EnvironmentFailureException.unexpectedState
                ("Cannot write file summary in a read-only environment");
        }

        if (tfs.isEmpty()) {
            return null; // no delta
        }

        if (!cachePopulated) {
            /* Db does not exist and this is a read-only environment. */
            return null;
        }

        long fileNum = tfs.getFileNumber();
        Long fileNumLong = fileNum;

        /* Get existing file summary or create an empty one. */
        FileSummary summary = fileSummaryMap.get(fileNumLong);
        if (summary == null) {

            /*
             * An obsolete node may have been counted after its file was
             * deleted, for example, when compressing a BIN.  Do not insert a
             * new profile record if no corresponding log file exists.  But if
             * the file number is greater than the last known file, this is a
             * new file that has been buffered but not yet flushed to disk; in
             * that case we should insert a new profile record.
             */
            if (!fileSummaryMap.isEmpty() &&
                fileNum < fileSummaryMap.lastKey() &&
                !env.getFileManager().isFileValid(fileNum)) {

                /*
                 * File was deleted by the cleaner.  Remove it from the
                 * UtilizationTracker and return.  Note that a file is normally
                 * removed from the tracker by FileSummaryLN.writeToLog method
                 * when it is called via insertFileSummary below. [#15512]
                 */
                env.getLogManager().removeTrackedFile(tfs);
                return null;
            }

            summary = new FileSummary();
        }

        /*
         * The key discriminator is a sequence that must be increasing over the
         * life of the file.  We use the sum of all entries counted.  We must
         * add the tracked and current summaries here to calculate the key.
         */
        FileSummary tmp = new FileSummary();
        tmp.add(summary);
        tmp.add(tfs);
        int sequence = tmp.getEntriesCounted();

        /* Insert an LN with the existing and tracked summary info. */
        FileSummaryLN ln = new FileSummaryLN(summary);
        ln.setTrackedSummary(tfs);
        insertFileSummary(ln, fileNum, sequence);

        /* Cache the updated summary object.  */
        summary = ln.getBaseSummary();

        if (fileSummaryMap.put(fileNumLong, summary) == null) {
            MemoryBudget mb = env.getMemoryBudget();
            mb.updateAdminMemoryUsage(MemoryBudget.UTILIZATION_PROFILE_ENTRY);
        }

        return ln.getObsoleteOffsets();
    }

    /**
     * Returns the stored/packed obsolete offsets offsets for the given file.
     *
     * @param logUpdate if true, log any updates to the utilization profile. If
     * false, only retrieve the new information.
     */
    PackedOffsets getObsoleteDetail(Long fileNum, boolean logUpdate)
        throws DatabaseException {

        final PackedOffsets packedOffsets = new PackedOffsets();

        /* Return if no detail is being tracked. */
        if (!env.getCleaner().trackDetail) {
            return packedOffsets;
        }

        assert cachePopulated;

        final long fileNumVal = fileNum;
        final List<long[]> list = new ArrayList<>();

        /*
         * Get a TrackedFileSummary that cannot be flushed (evicted) while we
         * gather obsolete offsets.
         */
        final TrackedFileSummary tfs =
            env.getLogManager().getUnflushableTrackedSummary(fileNumVal);
        try {
            /* Read the summary db. */
            final Locker locker =
                BasicLocker.createBasicLocker(env, false /*noWait*/);
            final CursorImpl cursor = new CursorImpl(fileSummaryDb, locker);
            try {
                /* Perform eviction in unsynchronized methods. */
                cursor.setAllowEviction(true);

                final DatabaseEntry keyEntry = new DatabaseEntry();
                final DatabaseEntry dataEntry = new DatabaseEntry();

                /* Search by file number. */
                OperationResult result = null;
                if (getFirstFSLN(cursor, fileNumVal, keyEntry, dataEntry,
                                  LockType.NONE)) {
                    result = DbInternal.DEFAULT_RESULT;
                }

                /* Read all LNs for this file number. */
                while (result != null) {

                    /* Perform eviction once per operation. */
                    env.daemonEviction(true /*backgroundIO*/);

                    final FileSummaryLN ln = (FileSummaryLN)
                        cursor.lockAndGetCurrentLN(LockType.NONE);

                    if (ln != null) {
                        /* Stop if the file number changes. */
                        if (fileNumVal !=
                            FileSummaryLN.getFileNumber(keyEntry.getData())) {
                            break;
                        }

                        final PackedOffsets offsets = ln.getObsoleteOffsets();
                        if (offsets != null) {
                            list.add(offsets.toArray());
                        }

                        /* Always evict after using a file summary LN. */
                        cursor.evictLN();
                    }

                    result = cursor.getNext(
                        keyEntry, dataEntry, LockType.NONE,
                        false /*dirtyReadAll*/, true /*forward*/,
                        false /*isLatched*/, null /*rangeConstraint*/);
                }
            } finally {
                cursor.close();
                locker.operationEnd();
            }

            /*
             * Write out tracked detail, if any, and add its offsets to the
             * list.
             */
            if (!tfs.isEmpty()) {
                if (logUpdate) {
                    final PackedOffsets offsets = putFileSummary(tfs);
                    if (offsets != null) {
                        list.add(offsets.toArray());
                    }
                } else {
                    final long[] offsetList = tfs.getObsoleteOffsets();
                    if (offsetList != null) {
                        list.add(offsetList);
                    }
                }
            }
        } finally {
            /* Allow flushing of TFS when all offsets have been gathered. */
            tfs.setAllowFlush(true);
        }

        /* Merge all offsets into a single array and pack the result. */
        int size = 0;
        for (final long[] a : list) {
            size += a.length;
        }
        final long[] offsets = new long[size];
        int index = 0;
        for (long[] a : list) {
            System.arraycopy(a, 0, offsets, index, a.length);
            index += a.length;
        }
        assert index == offsets.length;

        packedOffsets.pack(offsets);
        return packedOffsets;
    }

    /**
     * Populate the profile for file selection.  This method performs eviction
     * and is not synchronized.  It must be called before recovery is complete
     * so that synchronization is unnecessary.  It must be called before the
     * recovery checkpoint so that the checkpoint can flush file summary
     * information.
     */
    public boolean populateCache(StartupTracker.Counter counter)
        throws DatabaseException {

        assert !cachePopulated;

        /* Open the file summary db on first use. */
        if (!openFileSummaryDatabase()) {
            /* Db does not exist and this is a read-only environment. */
            return false;
        }

        int oldMemorySize = fileSummaryMap.size() *
            MemoryBudget.UTILIZATION_PROFILE_ENTRY;

        /*
         * It is possible to have an undeleted FileSummaryLN in the database
         * for a deleted log file if we crash after deleting a file but before
         * deleting the FileSummaryLN.  Iterate through all FileSummaryLNs and
         * add them to the cache if their corresponding log file exists.  But
         * delete those records that have no corresponding log file.
         */
        Long[] existingFiles = env.getFileManager().getAllFileNumbers();
        Locker locker = null;
        CursorImpl cursor = null;
        try {
            locker = BasicLocker.createBasicLocker(env, false /*noWait*/);
            cursor = new CursorImpl(fileSummaryDb, locker);
            /* Perform eviction in unsynchronized methods. */
            cursor.setAllowEviction(true);

            DatabaseEntry keyEntry = new DatabaseEntry();
            DatabaseEntry dataEntry = new DatabaseEntry();

            if (cursor.positionFirstOrLast(true)) {

                /* Retrieve the first record. */
                OperationResult result = cursor.lockAndGetCurrent(
                    keyEntry, dataEntry, LockType.NONE,
                    false /*dirtyReadAll*/,
                    true /*isLatched*/, true /*unlatch*/);

                if (result == null) {
                    /* The record we're pointing at may be deleted. */
                    result = cursor.getNext(
                        keyEntry, dataEntry, LockType.NONE,
                        false /*dirtyReadAll*/, true /*forward*/,
                        false /*isLatched*/, null /*rangeConstraint*/);
                }

                while (result != null) {
                    counter.incNumRead();

                    /*
                     * Perform eviction once per operation.  Pass false for
                     * backgroundIO because this is done during recovery and
                     * there is no reason to sleep.
                     */
                    env.daemonEviction(false /*backgroundIO*/);

                    FileSummaryLN ln = (FileSummaryLN)
                        cursor.lockAndGetCurrentLN(LockType.NONE);

                    if (ln == null) {
                        /* Advance past a cleaned record. */
                        result = cursor.getNext(
                            keyEntry, dataEntry, LockType.NONE,
                            false /*dirtyReadAll*/,
                            true /*forward*/, false /*isLatched*/,
                            null /*rangeConstraint*/);
                        continue;
                    }

                    byte[] keyBytes = keyEntry.getData();
                    boolean isOldVersion = FileSummaryLN.hasStringKey(keyBytes);
                    long fileNum = FileSummaryLN.getFileNumber(keyBytes);
                    Long fileNumLong = fileNum;

                    if (Arrays.binarySearch(existingFiles, fileNumLong) >= 0) {
                        counter.incNumProcessed();

                        /* File exists, cache the FileSummaryLN. */
                        FileSummary summary = ln.getBaseSummary();
                        fileSummaryMap.put(fileNumLong, summary);

                        /*
                         * Update old version records to the new version.  A
                         * zero sequence number is used to distinguish the
                         * converted records and to ensure that later records
                         * will have a greater sequence number.
                         */
                        if (isOldVersion && !env.isReadOnly()) {
                            insertFileSummary(ln, fileNum, 0);
                            cursor.deleteCurrentRecord(
                                ReplicationContext.NO_REPLICATE);
                        } else {
                            /* Always evict after using a file summary LN. */
                            cursor.evictLN();
                        }
                    } else {

                        /*
                         * File does not exist, remove the summary from the map
                         * and delete all FileSummaryLN records.
                         */
                        counter.incNumDeleted();

                        fileSummaryMap.remove(fileNumLong);

                        if (!env.isReadOnly()) {
                            removePerDbMetadata
                                (Collections.singleton(fileNumLong),
                                 null /*databases*/);
                            if (isOldVersion) {
                                cursor.latchBIN();
                                cursor.deleteCurrentRecord(
                                    ReplicationContext.NO_REPLICATE);
                            } else {
                                deleteFileSummary(fileNumLong);
                            }
                        }

                        /*
                         * Do not evict after deleting since the compressor
                         * would have to fetch it again.
                         */
                    }

                    /* Go on to the next entry. */
                    if (isOldVersion) {

                        /* Advance past the single old version record. */
                        result = cursor.getNext(
                            keyEntry, dataEntry, LockType.NONE,
                            false /*dirtyReadAll*/,
                            true /*forward*/, false /*isLatched*/,
                            null /*rangeConstraint*/);
                    } else {

                        /*
                         * Skip over other records for this file by adding one
                         * to the file number and doing a range search.
                         */
                        if (!getFirstFSLN
                            (cursor,
                             fileNum + 1,
                             keyEntry, dataEntry,
                             LockType.NONE)) {
                            result = null;
                        }
                    }
                }
            }
        } finally {
            if (cursor != null) {
                /* positionFirstOrLast may leave BIN latched. */
                cursor.close();
            }
            if (locker != null) {
                locker.operationEnd();
            }

            int newMemorySize = fileSummaryMap.size() *
                MemoryBudget.UTILIZATION_PROFILE_ENTRY;
            MemoryBudget mb = env.getMemoryBudget();
            mb.updateAdminMemoryUsage(newMemorySize - oldMemorySize);
        }

        cachePopulated = true;
        return true;
    }

    /**
     * Positions at the most recent LN for the given file number.
     */
    private boolean getFirstFSLN(CursorImpl cursor,
                                 long fileNum,
                                 DatabaseEntry keyEntry,
                                 DatabaseEntry dataEntry,
                                 LockType lockType)
        throws DatabaseException {

        byte[] keyBytes = FileSummaryLN.makePartialKey(fileNum);
        keyEntry.setData(keyBytes);

        cursor.reset();

        try {
            int result = cursor.searchRange(keyEntry, null /*comparator*/);

            if ((result & CursorImpl.FOUND) == 0) {
                return false;
            }

            boolean exactKeyMatch = ((result & CursorImpl.EXACT_KEY) != 0);

            if (exactKeyMatch &&
                cursor.lockAndGetCurrent(
                    keyEntry, dataEntry, lockType, false /*dirtyReadAll*/,
                    true /*isLatched*/, false /*unlatch*/) != null) {
                return true;
            }
        } finally {
            cursor.releaseBIN();
        }

        /* Always evict after using a file summary LN. */
        cursor.evictLN();

        OperationResult result = cursor.getNext(
            keyEntry, dataEntry, lockType, false /*dirtyReadAll*/,
            true /*forward*/, false /*isLatched*/, null /*rangeConstraint*/);

        return result != null;
    }

    /**
     * If the file summary db is already open, return, otherwise attempt to
     * open it.  If the environment is read-only and the database doesn't
     * exist, return false.  If the environment is read-write the database will
     * be created if it doesn't exist.
     */
    private boolean openFileSummaryDatabase()
        throws DatabaseException {

        if (fileSummaryDb != null) {
            return true;
        }

        fileSummaryDb =
            env.getDbTree().openNonRepInternalDB(DbType.UTILIZATION);

        return (fileSummaryDb != null);
    }

    /**
     * For unit testing.
     */
    public DatabaseImpl getFileSummaryDb() {
        return fileSummaryDb;
    }

    /**
     * Insert the given LN with the given key values.  This method is
     * synchronized and may not perform eviction.
     * 
     * Is public only for unit testing.
     */
    synchronized boolean insertFileSummary(
        FileSummaryLN ln,
        long fileNum,
        int sequence)
        throws DatabaseException {

        byte[] keyBytes = FileSummaryLN.makeFullKey(fileNum, sequence);

        Locker locker = null;
        CursorImpl cursor = null;
        try {
            locker = BasicLocker.createBasicLocker(env, false /*noWait*/);
            cursor = new CursorImpl(fileSummaryDb, locker);

            /* Insert the LN. */
            boolean inserted = cursor.insertRecord(
                keyBytes, ln, false /*blindInsertion*/,
                ReplicationContext.NO_REPLICATE);

            if (!inserted) {
                LoggerUtils.traceAndLog
                    (logger, env, Level.SEVERE,
                     "Cleaner duplicate key sequence file=0x" +
                     Long.toHexString(fileNum) + " sequence=0x" +
                     Long.toHexString(sequence));
                return false;
            }

            /* Always evict after using a file summary LN. */
            cursor.evictLN();
            return true;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            if (locker != null) {
                locker.operationEnd();
            }
        }
    }

    /**
     * Checks that all FSLN offsets are indeed obsolete.  Assumes that the
     * system is quiesent (does not lock LNs).  This method is not synchronized
     * (because it doesn't access fileSummaryMap) and eviction is allowed.
     *
     * @return true if no verification failures.
     */
    public boolean verifyFileSummaryDatabase()
        throws DatabaseException {

        DatabaseEntry key = new DatabaseEntry();
        DatabaseEntry data = new DatabaseEntry();

        openFileSummaryDatabase();
        Locker locker = null;
        CursorImpl cursor = null;
        boolean ok = true;

        try {
            locker = BasicLocker.createBasicLocker(env, false /*noWait*/);
            cursor = new CursorImpl(fileSummaryDb, locker);
            cursor.setAllowEviction(true);

            if (cursor.positionFirstOrLast(true)) {

                OperationResult result = cursor.lockAndGetCurrent(
                    key, data, LockType.NONE, false /*dirtyReadAll*/,
                    true /*isLatched*/, true /*unlatch*/);

                /* Iterate over all file summary lns. */
                while (result != null) {

                    /* Perform eviction once per operation. */
                    env.daemonEviction(true /*backgroundIO*/);

                    FileSummaryLN ln = (FileSummaryLN)
                        cursor.lockAndGetCurrentLN(LockType.NONE);

                    if (ln != null) {
                        long fileNumVal =
                            FileSummaryLN.getFileNumber(key.getData());
                        PackedOffsets offsets = ln.getObsoleteOffsets();

                        /*
                         * Check every offset in the fsln to make sure it's
                         * truly obsolete.
                         */
                        if (offsets != null) {
                            long[] vals = offsets.toArray();
                            for (long val : vals) {
                                long lsn = DbLsn.makeLsn(fileNumVal, val);
                                if (!verifyLsnIsObsolete(lsn)) {
                                    ok = false;
                                }
                            }
                        }

                        cursor.evictLN();
                    }

                    result = cursor.getNext(
                        key, data, LockType.NONE, false /*dirtyReadAll*/,
                        true /*forward*/, false /*isLatched*/,
                        null /*rangeConstraint*/);
                }
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            if (locker != null) {
                locker.operationEnd();
            }
        }

        return ok;
    }

    /*
     * Return true if the LN at this lsn is obsolete.
     */
    private boolean verifyLsnIsObsolete(long lsn)
        throws DatabaseException {

        /* Read the whole entry out of the log. */
        Object o = env.getLogManager().getLogEntryHandleFileNotFound(lsn);
        if (!(o instanceof LNLogEntry)) {
            return true;
        }
        LNLogEntry<?> entry = (LNLogEntry<?>) o;

        /* Find the owning database. */
        DatabaseId dbId = entry.getDbId();
        DatabaseImpl db = env.getDbTree().getDb(dbId);

        /*
         * Search down to the bottom most level for the parent of this LN.
         */
        BIN bin = null;
        try {
            /*
             * The whole database is gone, so this LN is obsolete. No need
             * to worry about delete cleanup; this is just verification and
             * no cleaning is done.
             */
            if (db == null || db.isDeleted()) {
                return true;
            }

            if (entry.isImmediatelyObsolete(db)) {
                return true;
            }

            entry.postFetchInit(db);

            Tree tree = db.getTree();
            TreeLocation location = new TreeLocation();
            boolean parentFound = tree.getParentBINForChildLN(
                location, entry.getKey(), false /*splitsAllowed*/,
                false /*blindDeltaOps*/, CacheMode.UNCHANGED);

            bin = location.bin;
            int index = location.index;

            /* Is bin latched ? */
            if (!parentFound) {
                return true;
            }

            /*
             * Now we're at the BIN parent for this LN.  If knownDeleted, LN is
             * deleted and can be purged.
             */
            if (bin.isEntryKnownDeleted(index)) {
                return true;
            }

            if (bin.getLsn(index) != lsn) {
                return true;
            }

            /* Oh no -- this lsn is in the tree. */
            /* should print, or trace? */
            System.err.println("lsn " + DbLsn.getNoFormatString(lsn)+
                               " was found in tree.");
            return false;
        } finally {
            env.getDbTree().releaseDb(db);
            if (bin != null) {
                bin.releaseLatch();
            }
        }
    }

    /**
     * Update memory budgets when this profile is closed and will never be
     * accessed again.
     */
    void close() {
        clearCache();
        if (fileSummaryDb != null) {
            fileSummaryDb.releaseTreeAdminMemory();
        }
    }
}