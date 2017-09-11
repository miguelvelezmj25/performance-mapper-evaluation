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

package collections.ship.marshal;

import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;

import java.io.Serializable;

/**
 * A Shipment represents the combined key/data pair for a shipment entity.
 * <p>
 * <p> In this sample, Shipment is bound to the stored key/data entry by
 * implementing the MarshalledEntity interface, which is called by {@link
 * SampleViews.MarshalledEntityBinding}. </p>
 * <p>
 * <p> The binding is "tricky" in that it uses this class for both the stored
 * data entry and the combined entity object.  To do this, the key field(s) are
 * transient and are set by the binding after the data object has been
 * deserialized. This avoids the use of a ShipmentData class completely. </p>
 * <p>
 * <p> Since this class is used directly for data storage, it must be
 * Serializable. </p>
 *
 * @author Mark Hayes
 */
public class Shipment implements Serializable, MarshalledEntity {

    static final String PART_KEY = "part";
    static final String SUPPLIER_KEY = "supplier";

    private transient String partNumber;
    private transient String supplierNumber;
    private int quantity;

    public Shipment(String partNumber, String supplierNumber, int quantity) {

        this.partNumber = partNumber;
        this.supplierNumber = supplierNumber;
        this.quantity = quantity;
    }

    Shipment() {

        // A no-argument constructor is necessary only to allow the binding to
        // instantiate objects of this class.
    }

    /**
     * Set the transient key fields after deserializing.  This method is only
     * called by data bindings.
     */
    void setKey(String partNumber, String supplierNumber) {

        this.partNumber = partNumber;
        this.supplierNumber = supplierNumber;
    }

    public final String getPartNumber() {

        return partNumber;
    }

    public final String getSupplierNumber() {

        return supplierNumber;
    }

    public final int getQuantity() {

        return quantity;
    }

    // --- MarshalledEntity implementation ---

    public String toString() {

        return "[Shipment: part=" + partNumber +
                " supplier=" + supplierNumber +
                " quantity=" + quantity + ']';
    }

    public void unmarshalPrimaryKey(TupleInput keyInput) {

        this.partNumber = keyInput.readString();
        this.supplierNumber = keyInput.readString();
    }

    public void marshalPrimaryKey(TupleOutput keyOutput) {

        keyOutput.writeString(this.partNumber);
        keyOutput.writeString(this.supplierNumber);
    }

    public boolean marshalSecondaryKey(String keyName, TupleOutput keyOutput) {

        if(keyName.equals(PART_KEY)) {
            keyOutput.writeString(this.partNumber);
            return true;
        }
        else if(keyName.equals(SUPPLIER_KEY)) {
            keyOutput.writeString(this.supplierNumber);
            return true;
        }
        else {
            throw new UnsupportedOperationException(keyName);
        }
    }
}
