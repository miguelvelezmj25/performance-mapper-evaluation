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
package com.sleepycat.persist.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.sleepycat.util.test.SharedTestUtils;

/**
 * Runs part one of the EvolveTest.  This part is run with the old/original
 * version of EvolveClasses in the classpath.  It creates a fresh environment
 * and store containing instances of the original class.  When EvolveTest is
 * run, it will read/write/evolve these objects from the store created here.
 *
 * @author Mark Hayes
 */
public class EvolveTestInit extends EvolveTestBase {

    public EvolveTestInit(String originalClsName, String evolvedClsName)
            throws Exception {
        super(originalClsName, evolvedClsName);
    }

    @Override
    boolean useEvolvedClass() {
        return false;
    }

    @Before
    public void setUp() {

        envHome = getTestInitHome(false /*evolved*/);
        envHome.mkdirs();
        SharedTestUtils.emptyDir(envHome);
    }

    @Test
    public void testInit()
        throws Exception {

        openEnv();
        if (!openStoreReadWrite()) {
            fail();
        }
        caseObj.writeObjects(store);
        caseObj.checkUnevolvedModel(store.getModel(), env);
        closeAll();
    }
}
