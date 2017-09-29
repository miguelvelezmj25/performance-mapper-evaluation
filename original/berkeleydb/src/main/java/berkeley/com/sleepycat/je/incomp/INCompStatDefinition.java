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

package berkeley.com.sleepycat.je.incomp;

import berkeley.com.sleepycat.je.utilint.StatDefinition;

/**
 * Per-stat Metadata for JE INCompressor statistics.
 */
public class INCompStatDefinition {
    public static final String GROUP_NAME = "Node Compression";
    public static final String GROUP_DESC = 
        "Removal and compression of internal btree nodes.";

    public static final StatDefinition INCOMP_SPLIT_BINS =
        new StatDefinition("splitBins", 
                           "Number of BINs encountered by the INCompressor " +
                           "that were split between the time they were put " +
                           "on the comprssor queue and when the compressor " +
                           "ran.");

    public static final StatDefinition INCOMP_DBCLOSED_BINS =
        new StatDefinition("dbClosedBins", 
                           "Number of BINs encountered by the INCompressor " +
                           "that had their database closed between the time " +
                           "they were put on the compressor queue and when " +
                           "the compressor ran.");

    public static final StatDefinition INCOMP_CURSORS_BINS =
        new StatDefinition("cursorsBins",
                           "Number of BINs encountered by the INComprssor " + 
                           "that had cursors referring to them when the " +
                           "compresor ran.");

    public static final StatDefinition INCOMP_NON_EMPTY_BINS =
        new StatDefinition("nonEmptyBins",
                           "Number of BINs encountered by the INCompressor " +
                           "that were not actually empty when the " +
                           "compressor ran.");

    public static final StatDefinition INCOMP_PROCESSED_BINS =
        new StatDefinition("processedBins", 
                           "Number of BINs that were successfully " +
                           "processed by the INCompressor.");

    public static final StatDefinition INCOMP_QUEUE_SIZE =
        new StatDefinition("inCompQueueSize",
                           "Number of entries in the INCompressor queue " +
                           "when the getStats() call was made.");
}