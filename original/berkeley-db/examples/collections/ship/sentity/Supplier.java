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

package collections.ship.sentity;

import java.io.Serializable;

/**
 * A Supplier represents the combined key/data pair for a supplier entity.
 * <p>
 * <p> In this sample, Supplier is created from the stored key/data entry
 * using TupleSerialEntityBinding.  See {@link SampleViews.PartBinding} for
 * details.
 * </p>
 * <p>
 * <p> The binding is "tricky" in that it uses this class for both the stored
 * data entry and the combined entity object.  To do this, the key field(s) are
 * transient and are set by the binding after the data object has been
 * deserialized. This avoids the use of a SupplierData class completely. </p>
 * <p>
 * <p> Since this class is used directly for data storage, it must be
 * Serializable. </p>
 *
 * @author Mark Hayes
 */
public class Supplier implements Serializable {

    private transient String number;
    private String name;
    private int status;
    private String city;

    public Supplier(String number, String name, int status, String city) {

        this.number = number;
        this.name = name;
        this.status = status;
        this.city = city;
    }

    /**
     * Set the transient key fields after deserializing.  This method is only
     * called by data bindings.
     */
    void setKey(String number) {

        this.number = number;
    }

    public final String getNumber() {

        return number;
    }

    public final String getName() {

        return name;
    }

    public final int getStatus() {

        return status;
    }

    public final String getCity() {

        return city;
    }

    public String toString() {

        return "[Supplier: number=" + number +
                " name=" + name +
                " status=" + status +
                " city=" + city + ']';
    }
}
