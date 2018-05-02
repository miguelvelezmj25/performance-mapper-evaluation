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

package com.sleepycat.collections.test;

import com.sleepycat.bind.EntityBinding;
import com.sleepycat.bind.RecordNumberBinding;
import com.sleepycat.je.DatabaseEntry;

/**
 * @author Mark Hayes
 */
class TestEntityBinding implements EntityBinding {

    private boolean isRecNum;

    TestEntityBinding(boolean isRecNum) {

        this.isRecNum = isRecNum;
    }

    public Object entryToObject(DatabaseEntry key, DatabaseEntry value) {

        byte keyByte;
        if (isRecNum) {
            if (key.getSize() != 4) {
                throw new IllegalStateException();
            }
            keyByte = (byte) RecordNumberBinding.entryToRecordNumber(key);
        } else {
            if (key.getSize() != 1) {
                throw new IllegalStateException();
            }
            keyByte = key.getData()[key.getOffset()];
        }
        if (value.getSize() != 1) {
            throw new IllegalStateException();
        }
        byte valByte = value.getData()[value.getOffset()];
        return new TestEntity(keyByte, valByte);
    }

    public void objectToKey(Object object, DatabaseEntry key) {

        byte val = (byte) ((TestEntity) object).key;
        if (isRecNum) {
            RecordNumberBinding.recordNumberToEntry(val, key);
        } else {
            key.setData(new byte[] { val }, 0, 1);
        }
    }

    public void objectToData(Object object, DatabaseEntry value) {

        byte val = (byte) ((TestEntity) object).value;
        value.setData(new byte[] { val }, 0, 1);
    }
}
