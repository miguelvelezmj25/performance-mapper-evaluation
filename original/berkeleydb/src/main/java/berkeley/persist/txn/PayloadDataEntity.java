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

package berkeley.persist.txn;

import berkeley.com.sleepycat.persist.model.Entity;
import berkeley.com.sleepycat.persist.model.PrimaryKey;
import berkeley.com.sleepycat.persist.model.SecondaryKey;

import static berkeley.com.sleepycat.persist.model.Relationship.MANY_TO_ONE;

@Entity
public class PayloadDataEntity {
    @PrimaryKey
    private int oID;

    @SecondaryKey(relate = MANY_TO_ONE)
    private String threadName;

    private double doubleData;

    PayloadDataEntity() {
    }

    public double getDoubleData() {
        return doubleData;
    }

    public void setDoubleData(double dd) {
        doubleData = dd;
    }

    public int getID() {
        return oID;
    }

    public void setID(int id) {
        oID = id;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String tn) {
        threadName = tn;
    }
}
