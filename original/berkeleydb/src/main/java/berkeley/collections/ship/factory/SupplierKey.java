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

package berkeley.collections.ship.factory;

import berkeley.com.sleepycat.bind.tuple.MarshalledTupleEntry;
import berkeley.com.sleepycat.bind.tuple.TupleInput;
import berkeley.com.sleepycat.bind.tuple.TupleOutput;

/**
 * A SupplierKey serves as the key in the key/data pair for a supplier entity.
 * <p>
 * <p>In this sample, SupplierKey is bound to the stored key tuple entry by
 * implementing the MarshalledTupleEntry interface.</p>
 *
 * @author Mark Hayes
 */
public class SupplierKey implements MarshalledTupleEntry {

    private String number;

    public SupplierKey(String number) {

        this.number = number;
    }

    public SupplierKey() {

        // A no-argument constructor is necessary only to allow the binding to
        // instantiate objects of this class.
    }

    public final String getNumber() {

        return number;
    }

    // --- MarshalledTupleEntry implementation ---

    public String toString() {

        return "[SupplierKey: number=" + number + ']';
    }

    public void marshalEntry(TupleOutput keyOutput) {

        keyOutput.writeString(this.number);
    }

    public void unmarshalEntry(TupleInput keyInput) {

        this.number = keyInput.readString();
    }
}
