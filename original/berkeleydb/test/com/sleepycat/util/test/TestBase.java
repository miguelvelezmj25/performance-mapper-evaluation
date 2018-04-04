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

package com.sleepycat.util.test;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * The base class for all JE unit tests. 
 */
public abstract class TestBase {

    private static final boolean copySucceeded =
        Boolean.getBoolean("test.copySucceeded");

    /*
     * Need to provide a customized name suffix for those tests which are 
     * Parameterized.
     *
     * This is because we need to provide a unique directory name for those 
     * failed tests. Parameterized class would reuse test cases, so class name 
     * plus the test method is not unique. User should set the customName
     * in the constructor of a Parameterized test. 
     */
    protected String customName;
    
    /**
     * The rule we use to control every test case, the core of this rule is 
     * copy the testing environment, files, sub directories to another place
     * for future investigation, if any of test failed. But we do have a limit
     * to control how many times we copy because of disk space. So once the 
     * failure counter exceed limit, it won't copy the environment any more.
     */
    @Rule
    public TestRule watchman = new TestWatcher() {

        /* Copy Environments when the test failed. */
        @Override
        protected void failed(Throwable t, Description desc) {
            doCopy(desc);
        }
        
        @Override
        protected void succeeded(Description desc){
            if (copySucceeded) {
                doCopy(desc);
            }
        }

        private void doCopy(Description desc) {
            String dirName = makeFileName(desc);
            try {
                copyEnvironments(dirName);
            } catch (Exception e) {
                throw new RuntimeException
                    ("can't copy env dir to " + dirName  + " after failure", e);
            }
        }
    };
    
    @Before
    public void setUp() 
        throws Exception {
        
        SharedTestUtils.cleanUpTestDir(SharedTestUtils.getTestDir());
    }
    
    @After
    public void tearDown() throws Exception {
        // Provision for future use
    }
    
    /**
     *  Copy the testing directory to other place. 
     */
    private void copyEnvironments(String path) throws Exception{
        
        File failureDir = SharedTestUtils.getFailureCopyDir();
        if (failureDir.list().length < SharedTestUtils.getCopyLimit()) {
            SharedTestUtils.copyDir(SharedTestUtils.getTestDir(),
                                    new File(failureDir, path));
        }
    }
    
    /**
     * Get failure copy directory name. 
     */
    private String makeFileName(Description desc) {
        String name = desc.getClassName() + "-" + desc.getMethodName();
        if (customName != null) {
            name = name + "-" + customName;
        }
        return name;
    }
}
