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

package berkeley.com.sleepycat.je.rep.impl;

import berkeley.com.sleepycat.je.DatabaseException;
import berkeley.com.sleepycat.je.rep.ReplicationMutableConfig;

/**
 * Implemented by observers of mutable rep config changes.
 */
public interface RepEnvConfigObserver {

    /**
     * Notifies the observer that one or more mutable rep properties have been
     * changed.
     */
    void repEnvConfigUpdate(RepConfigManager configMgr,
                            ReplicationMutableConfig newConfig)
        throws DatabaseException;
}