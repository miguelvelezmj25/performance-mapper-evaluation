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

package berkeley.persist.gettingStarted;

import berkeley.com.sleepycat.je.DatabaseException;
import berkeley.com.sleepycat.je.Environment;
import berkeley.com.sleepycat.je.EnvironmentConfig;
import berkeley.com.sleepycat.persist.EntityStore;
import berkeley.com.sleepycat.persist.StoreConfig;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.io.File;

import static com.sun.jmx.snmp.SnmpStatusException.readOnly;

public class MyDbEnv {


    private static boolean ALLOWCREATE = false;
    private static boolean READONLY = false;
    private static boolean TRANSACTIONAL = false;

    private Environment myEnv;
    private EntityStore store;

    // Our constructor does nothing
    public MyDbEnv() {
    }

    // The setup() method opens the environment and store
    // for us.
    public void setup(File envHome, String[] args) throws DatabaseException {

//        ALLOWCREATE = Source.getOptionALLOWCREATE(Boolean.valueOf(args[0]));
//        READONLY = Source.getOptionREADONLY(Boolean.valueOf(args[1]));

        ALLOWCREATE = Source.getOptionALLOWCREATE(true);
        READONLY = Source.getOptionREADONLY(true);
        TRANSACTIONAL = Source.getOptionTRANSACTIONAL(true);

        boolean allowCreate = false;
        boolean readOnly = false;
        boolean transactional = false;

        EnvironmentConfig myEnvConfig = new EnvironmentConfig();
        StoreConfig storeConfig = new StoreConfig();

        if(ALLOWCREATE) {
            allowCreate = true;
        }

        if(READONLY) {
            readOnly = true;
        }

        if(TRANSACTIONAL) {
            transactional = true;
        }

        myEnvConfig.setAllowCreateVoid(allowCreate);
//        myEnvConfig.setClassLoaderVoid();
//        myEnvConfig.setCustomStatsVoid();
//        myEnvConfig.setCacheModeVoid();
//        myEnvConfig.setCachePercentVoid();
//        myEnvConfig.setCacheSizeVoid();
//        myEnvConfig.setDurabilityVoid();
//        myEnvConfig.setDupConvertPreloadConfigVoid();
//        myEnvConfig.setExceptionListenerVoid();
//        myEnvConfig.setLoggingHandlerVoid();
//        myEnvConfig.setLockTimeoutVoid();
//        myEnvConfig.setLockingVoid();
//        myEnvConfig.setNodeNameVoid();
//        myEnvConfig.setOffHeapCacheSizeVoid();
        myEnvConfig.setReadOnlyVoid(readOnly);
//        myEnvConfig.setRecoveryProgressListenerVoid();
        myEnvConfig.setTransactionalVoid(transactional);
//        myEnvConfig.setTxnSerializableIsolationVoid();
//        myEnvConfig.setTxnTimeoutVoid();
//        myEnvConfig.setTxnNoSyncVoid();
//        myEnvConfig.setTxnWriteNoSyncVoid();
//
//
//        myEnvConfig.setReadOnly(readOnly);
//        storeConfig.setReadOnly(readOnly);
//
//        // If the environment is opened for write, then we want to be
//        // able to create the environment and entity store if
//        // they do not exist.
//        myEnvConfig.setAllowCreate(!readOnly);
//        storeConfig.setAllowCreate(!readOnly);

        storeConfig.setReadOnly(readOnly);
        storeConfig.setAllowCreate(allowCreate);

        // Open the environment and entity store
        myEnv = new Environment(envHome, myEnvConfig);
        store = new EntityStore(myEnv, "EntityStore", storeConfig);
    }

    // The setup() method opens the environment and store
    // for us.
    public void setup(File envHome, boolean readOnly)
            throws DatabaseException {

        EnvironmentConfig myEnvConfig = new EnvironmentConfig();
        StoreConfig storeConfig = new StoreConfig();



        myEnvConfig.setReadOnly(readOnly);
        storeConfig.setReadOnly(readOnly);

        // If the environment is opened for write, then we want to be 
        // able to create the environment and entity store if 
        // they do not exist.
        myEnvConfig.setAllowCreate(!readOnly);
        storeConfig.setAllowCreate(!readOnly);

        // Open the environment and entity store
        myEnv = new Environment(envHome, myEnvConfig);
        store = new EntityStore(myEnv, "EntityStore", storeConfig);

    }

    // Return a handle to the entity store
    public EntityStore getEntityStore() {
        return store;
    }

    // Return a handle to the environment
    public Environment getEnv() {
        return myEnv;
    }

    // Close the store and environment
    public void close() {
        if(store != null) {
            try {
                store.close();
            } catch (DatabaseException dbe) {
                System.err.println("Error closing store: " +
                        dbe.toString());
                System.exit(-1);
            }
        }

        if(myEnv != null) {
            try {
                // Finally, close the store and environment.
                myEnv.close();
            } catch (DatabaseException dbe) {
                System.err.println("Error closing MyDbEnv: " +
                        dbe.toString());
                System.exit(-1);
            }
        }
    }
}
