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

package berkeley.je.rep.quote;

import berkeley.com.sleepycat.persist.model.Entity;
import berkeley.com.sleepycat.persist.model.PrimaryKey;

import java.io.Serializable;

@Entity
class Quote implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @PrimaryKey
    String stockSymbol;

    float lastTrade;

    Quote(String symbol, float price) {
        this.stockSymbol = symbol;
        this.lastTrade = price;
    }

    @SuppressWarnings("unused")
    private Quote() {
    }  // Needed for DPL deserialization
}
