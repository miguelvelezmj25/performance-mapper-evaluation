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

package berkeley.com.sleepycat.je;

import berkeley.com.sleepycat.je.utilint.StatGroup;

import java.io.Serializable;

import static berkeley.com.sleepycat.je.latch.LatchStatDefinition.*;
import static berkeley.com.sleepycat.je.txn.LockStatDefinition.*;

/**
 * Lock statistics for a database environment.
 * <p>
 * <p> Note that some of the lock statistics may be expensive to obtain because
 * the lock table is unavailable to other operations while the statistics are
 * gathered. These expensive statistics are only provided if {@link
 * com.sleepycat.je.Environment#getLockStats Environment.getLockStats} is
 * called with a StatsConfig parameter that has been configured for "slow"
 * stats.
 *
 * @deprecated as of 4.0.10, replaced by {@link
 * Environment#getStats(StatsConfig)}.</p>
 */
public class LockStats implements Serializable {

    private static final long serialVersionUID = 172109534L;

    /* Basic stats on lock requests. */
    private final StatGroup basicStats;

    /* Stats on lock table latch access. */
    private final StatGroup latchStats;

    /* Stats on the types of locks in the lock table; expensive to collect. */
    private final StatGroup tableStats;

    /**
     * @hidden For internal use only. Create a stat api instance to house lock related
     * information.
     */
    public LockStats(StatGroup basicStats,
                     StatGroup latchStats,
                     StatGroup tableStats) {
        this.basicStats = basicStats;
        this.latchStats = latchStats;
        this.tableStats = tableStats;
    }

    /**
     * Total lock owners in lock table.  Only provided when {@link
     * com.sleepycat.je.Environment#getLockStats Environment.getLockStats} is
     * called in "slow" mode.
     */
    public int getNOwners() {
        return tableStats.getInt(LOCK_OWNERS);
    }

    /**
     * Total read locks currently held.  Only provided when {@link
     * com.sleepycat.je.Environment#getLockStats Environment.getLockStats} is
     * called in "slow" mode.
     */
    public int getNReadLocks() {
        return tableStats.getInt(LOCK_READ_LOCKS);
    }

    /**
     * Total locks currently in lock table.  Only provided when {@link
     * com.sleepycat.je.Environment#getLockStats Environment.getLockStats} is
     * called in "slow" mode.
     */
    public int getNTotalLocks() {
        return tableStats.getInt(LOCK_TOTAL);
    }

    /**
     * Total transactions waiting for locks.  Only provided when {@link
     * com.sleepycat.je.Environment#getLockStats Environment.getLockStats} is
     * called in "slow" mode.
     */
    public int getNWaiters() {
        return tableStats.getInt(LOCK_WAITERS);
    }

    /**
     * Total write locks currently held.  Only provided when {@link
     * com.sleepycat.je.Environment#getLockStats Environment.getLockStats} is
     * called in "slow" mode.
     */
    public int getNWriteLocks() {
        return tableStats.getInt(LOCK_WRITE_LOCKS);
    }

    /**
     * Total number of lock requests to date.
     */
    public long getNRequests() {
        return basicStats.getLong(LOCK_REQUESTS);
    }

    /**
     * Total number of lock waits to date.
     */
    public long getNWaits() {
        return basicStats.getLong(LOCK_WAITS);
    }

    /**
     * Number of acquires of lock table latch with no contention.
     */
    public int getNAcquiresNoWaiters() {
        return tableStats.getInt(LATCH_NO_WAITERS);
    }

    /**
     * Number of acquires of lock table latch when it was already owned
     * by the caller.
     */
    public int getNAcquiresSelfOwned() {
        return tableStats.getInt(LATCH_SELF_OWNED);
    }

    /**
     * Number of acquires of lock table latch when it was already owned by
     * another thread.
     */
    public int getNAcquiresWithContention() {
        return tableStats.getInt(LATCH_CONTENTION);
    }

    /**
     * Number of successful no-wait acquires of the lock table latch.
     */
    public int getNAcquiresNoWaitSuccessful() {
        return tableStats.getInt(LATCH_NOWAIT_SUCCESS);
    }

    /**
     * Number of unsuccessful no-wait acquires of the lock table latch.
     */
    public int getNAcquiresNoWaitUnSuccessful() {
        return tableStats.getInt(LATCH_NOWAIT_UNSUCCESS);
    }

    /**
     * Number of releases of the lock table latch.
     */
    public int getNReleases() {
        return tableStats.getInt(LATCH_RELEASES);
    }

    /**
     * For convenience, LockTable.toString will display all stats in
     * an easily readable format.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(basicStats);
        sb.append(latchStats);
        sb.append(tableStats);
        return sb.toString();
    }

    /**
     * Like #toString, display all stats. Includes a description of each
     * stat.
     */
    public String toStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(basicStats.toStringVerbose());
        sb.append(latchStats.toStringVerbose());
        sb.append(tableStats.toStringVerbose());
        return sb.toString();
    }
}
