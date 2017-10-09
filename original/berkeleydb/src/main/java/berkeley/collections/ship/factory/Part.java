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

import berkeley.com.sleepycat.bind.tuple.MarshalledTupleKeyEntity;
import berkeley.com.sleepycat.bind.tuple.TupleInput;
import berkeley.com.sleepycat.bind.tuple.TupleOutput;

import java.io.Serializable;

/**
 * A Part represents the combined key/data pair for a part entity.
 * <p>
 * <p> In this sample, Part is bound to the stored key/data entry by
 * implementing the MarshalledTupleKeyEntity interface. </p>
 * <p>
 * <p> The binding is "tricky" in that it uses this class for both the stored
 * data entry and the combined entity object.  To do this, the key field(s)
 * are transient and are set by the binding after the data object has been
 * deserialized. This avoids the use of a PartData class completely. </p>
 * <p>
 * <p> Since this class is used directly for data storage, it must be
 * Serializable. </p>
 *
 * @author Mark Hayes
 */
public class Part implements Serializable, MarshalledTupleKeyEntity {

    private transient String number;
    private String name;
    private String color;
    private Weight weight;
    private String city;

    public Part(String number, String name, String color, Weight weight,
                String city) {

        this.number = number;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.city = city;
    }

    public final String getNumber() {

        return number;
    }

    public final String getName() {

        return name;
    }

    public final String getColor() {

        return color;
    }

    public final Weight getWeight() {

        return weight;
    }

    public final String getCity() {

        return city;
    }

    public String toString() {

        return "[Part: number=" + number +
                " name=" + name +
                " color=" + color +
                " weight=" + weight +
                " city=" + city + ']';
    }

    // --- MarshalledTupleKeyEntity implementation ---

    public void marshalPrimaryKey(TupleOutput keyOutput) {

        keyOutput.writeString(this.number);
    }

    public void unmarshalPrimaryKey(TupleInput keyInput) {

        this.number = keyInput.readString();
    }

    public boolean marshalSecondaryKey(String keyName, TupleOutput keyOutput) {

        throw new UnsupportedOperationException(keyName);
    }

    public boolean nullifyForeignKey(String keyName) {

        throw new UnsupportedOperationException(keyName);
    }
}
