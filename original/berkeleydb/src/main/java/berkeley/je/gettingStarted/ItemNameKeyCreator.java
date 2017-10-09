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

// file ItemNameKeyCreator.java

package berkeley.je.gettingStarted;

import berkeley.com.sleepycat.bind.tuple.TupleBinding;
import berkeley.com.sleepycat.je.DatabaseEntry;
import berkeley.com.sleepycat.je.SecondaryDatabase;
import berkeley.com.sleepycat.je.SecondaryKeyCreator;

import java.io.IOException;

public class ItemNameKeyCreator implements SecondaryKeyCreator {

    private final TupleBinding theBinding;

    // Use the constructor to set the tuple binding
    ItemNameKeyCreator(TupleBinding binding) {
        theBinding = binding;
    }

    // Abstract method that we must implement
    public boolean createSecondaryKey(SecondaryDatabase secDb,
                                      DatabaseEntry keyEntry,      // From the primary
                                      DatabaseEntry dataEntry,     // From the primary
                                      DatabaseEntry resultEntry) { // set the key data on this.
        if(dataEntry != null) {
            // Convert dataEntry to an Inventory object
            Inventory inventoryItem =
                    (Inventory) theBinding.entryToObject(dataEntry);
            // Get the item name and use that as the key
            String theItem = inventoryItem.getItemName();
            try {
                resultEntry.setData(theItem.getBytes("UTF-8"));
            } catch (IOException willNeverOccur) {
            }
        }
        return true;
    }
}
