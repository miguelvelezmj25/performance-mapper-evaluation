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

package berkeley.com.sleepycat.je.log;

import berkeley.com.sleepycat.je.log.entry.DbOperationType;
import berkeley.com.sleepycat.je.utilint.VLSN;

/**
 * ReplicationContext provides context about high-level operations so that the
 * logging level can determine which replication related actions are required
 * for a given Loggable item.
 *
 * Those lower level actions are:
 * - does a log entry need to be logged with a VLSN generated by this
 * (master) node?
 * - does the log entry need to be logged with the VLSN which accompanied a
 *   replication message?
 * - do we need to wait for PERM acks after logging an entry?
 * - do we need to record the client VLSN that was just written to the log?
 *
 * ReplicationContext subclasses may hold additional information about the
 * logical operation which instigated logging, so that this can be added
 * to the log entry.
 *
 * All LogEntryType(s) have a "replicationPossible" attribute. For example,
 * INs will never be replicated, but LN_TX's may or may not be replicated,
 * depending on whether the owning database is replicated.
 *
 * If a LogEntryType will never be replicated, it should be logged with
 * the static ReplicationContext.NO_REPLICATE instance.
 * If replication is possible, the replication context may be:
 *   - one allocated for this operation, as the result of client apply
 *   - the static instance MASTER, if this node is the replication master
 *   - the static instance NO_REPLICATE, if this is a local operation
 *
 */
public class ReplicationContext {

    /*
     * Convenience static instance used when you know this operation is
     * executing on a replication master node.
     */
    public static final ReplicationContext MASTER =
        new ReplicationContext(true /* inReplicationStream */);

    /*
     * Convenience static instance used when you know this operation will not
     * be replicated, either because it's executing on a non-replicated node,
     * it's a local operation for a local database, it's a read only operation,
     * or because this loggable item is the type that is never replicated.
     */
    public static final ReplicationContext NO_REPLICATE =
        new ReplicationContext(false /* inReplicationStream */);

    /*
     * If true, this Loggable item is part of the replication stream, and
     * needs to be logged with a VLSN.
     */
    private final boolean inReplicationStream;

    /*
     * The VLSN value passed in from a replication message directed at
     * this replication client.
     */
    private final VLSN clientVLSN;

    protected ReplicationContext(boolean inReplicationStream) {
        this.inReplicationStream = inReplicationStream;
        clientVLSN = null;
    }

    /**
     * Used to pass the VLSN held in an arriving message down to the logging
     * levels.
     */
    public ReplicationContext(VLSN clientVLSN) {
        this.inReplicationStream = true;
        this.clientVLSN = clientVLSN;
    }

    /**
     * Used to pass the VLSN held in a migrated LN down to the logging levels.
     */
    public ReplicationContext(VLSN clientVLSN, boolean inReplicationStream) {
        this.clientVLSN = clientVLSN;
        this.inReplicationStream = inReplicationStream;
    }

    /**
     * @return the VLSN that arrived in the replication message which
     * instigated this Loggable item.
     */
    public VLSN getClientVLSN() {
        return clientVLSN;
    }

    /**
     * @return true if this loggable item is part of the replication stream
     */
    public boolean inReplicationStream() {
        return inReplicationStream;
    }

    /**
     * @return true if this node is the master, and should
     * generate a VLSN for this log entry
     */
    public boolean mustGenerateVLSN() {
        return (inReplicationStream && (clientVLSN == null));
    }

    /**
     * @return the type of database operation in progress. For the default
     * case, we return DbOperationType.NONE.
     */
    public DbOperationType getDbOperationType() {
        return DbOperationType.NONE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("inRepStream=").append(inReplicationStream);
        sb.append(" clientVLSN=").append(clientVLSN);
        return sb.toString();
    }
}