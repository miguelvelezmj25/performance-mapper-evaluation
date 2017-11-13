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

package berkeley.com.sleepycat.je.utilint;

import berkeley.com.sleepycat.je.Environment;
import berkeley.com.sleepycat.je.EnvironmentConfig;

import java.io.File;
import java.util.Map;

/**
 * Interface for opening a ReplicatedEnvironment from a JE standalone utility,
 * DbCacheSize.  Implemented by com.sleepycat.je.rep.utilint.DbCacheSizeRepEnv,
 * which must be instantiated from standalone JE using Class.forName.
 */
public interface DbCacheSizeRepEnv {
    public Environment open(File envHome,
                            EnvironmentConfig envConfig,
                            Map<String, String> repParams);
}
