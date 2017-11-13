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

package berkeley.com.sleepycat.bind.tuple;

import berkeley.com.sleepycat.je.DatabaseEntry;

import java.math.BigInteger;

/**
 * A concrete <code>TupleBinding</code> for a <code>BigInteger</code> value.
 * <p>
 * <p>This class produces byte array values that by default (without a custom
 * comparator) sort correctly.</p>
 *
 * @see <a href="package-summary.html#integerFormats">Integer Formats</a>
 */
public class BigIntegerBinding extends TupleBinding<BigInteger> {

    /**
     * Converts an entry buffer into a <code>BigInteger</code> value.
     *
     * @param entry is the source entry buffer.
     * @return the resulting value.
     */
    public static BigInteger entryToBigInteger(DatabaseEntry entry) {

        return entryToInput(entry).readBigInteger();
    }

    /**
     * Converts a <code>BigInteger</code> value into an entry buffer.
     *
     * @param val   is the source value.
     * @param entry is the destination entry buffer.
     */
    public static void bigIntegerToEntry(BigInteger val, DatabaseEntry entry) {

        outputToEntry(sizedOutput(val).writeBigInteger(val), entry);
    }

    /**
     * Returns a tuple output object of the exact size needed, to avoid
     * wasting space when a single primitive is output.
     */
    private static TupleOutput sizedOutput(BigInteger val) {

        int len = TupleOutput.getBigIntegerByteLength(val);
        return new TupleOutput(new byte[len]);
    }

    // javadoc is inherited
    public BigInteger entryToObject(TupleInput input) {

        return input.readBigInteger();
    }

    // javadoc is inherited
    public void objectToEntry(BigInteger object, TupleOutput output) {

        output.writeBigInteger(object);
    }

    // javadoc is inherited
    protected TupleOutput getTupleOutput(BigInteger object) {

        return sizedOutput(object);
    }
}
