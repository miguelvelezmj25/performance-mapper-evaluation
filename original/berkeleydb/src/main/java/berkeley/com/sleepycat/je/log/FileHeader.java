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

package berkeley.com.sleepycat.je.log;

import berkeley.com.sleepycat.je.DatabaseException;
import berkeley.com.sleepycat.je.EnvironmentFailureException;
import berkeley.com.sleepycat.je.VersionMismatchException;
import berkeley.com.sleepycat.je.dbi.EnvironmentFailureReason;
import berkeley.com.sleepycat.je.dbi.EnvironmentImpl;
import berkeley.com.sleepycat.je.utilint.Timestamp;

import java.nio.ByteBuffer;
import java.util.Calendar;

/**
 * A FileHeader embodies the header information at the beginning of each log
 * file.
 */
public class FileHeader implements Loggable {

    /*
     * fileNum is the number of file, starting at 0. An unsigned int, so stored
     * in a long in memory, but in 4 bytes on disk
     */
    private long fileNum;
    private long lastEntryInPrevFileOffset;
    private Timestamp time;
    private int logVersion;

    FileHeader(long fileNum, long lastEntryInPrevFileOffset) {
        this.fileNum = fileNum;
        this.lastEntryInPrevFileOffset = lastEntryInPrevFileOffset;
        Calendar now = Calendar.getInstance();
        time = new Timestamp(now.getTimeInMillis());
        logVersion = LogEntryType.LOG_VERSION;
    }

    /**
     * For logging only.
     */
    public FileHeader() {
    }

    /**
     * A header is always a known size.
     */
    public static int entrySize() {
        return
                LogUtils.LONG_BYTES +                // time
                        LogUtils.UNSIGNED_INT_BYTES +        // file number
                        LogUtils.LONG_BYTES +                // lastEntryInPrevFileOffset
                        LogUtils.INT_BYTES;                  // logVersion
    }

    public int getLogVersion() {
        return logVersion;
    }

    /**
     * @return file header log version.
     */
    int validate(EnvironmentImpl envImpl,
                 String fileName,
                 long expectedFileNum)
            throws DatabaseException {

        if(logVersion > LogEntryType.LOG_VERSION) {
            throw new VersionMismatchException
                    (envImpl,
                            "Expected log version " + LogEntryType.LOG_VERSION +
                                    " or earlier but found " + logVersion);
        }

        if(fileNum != expectedFileNum) {
            throw new EnvironmentFailureException
                    (envImpl, EnvironmentFailureReason.LOG_INTEGRITY,
                            "Wrong filenum in header for file " +
                                    fileName + " expected " +
                                    expectedFileNum + " got " + fileNum);
        }

        return logVersion;
    }

    /*
     * Logging support
     */

    /**
     * @return the offset of the last entry in the previous file.
     */
    long getLastEntryInPrevFileOffset() {
        return lastEntryInPrevFileOffset;
    }

    /**
     * @return number of bytes used to store this object
     * @see Loggable#getLogSize
     */
    public int getLogSize() {
        return entrySize();
    }

    /**
     * @param logBuffer is the destination buffer
     * @see Loggable#writeToLog
     * Serialize this object into the buffer. Update cksum with all
     * the bytes used by this object
     */
    public void writeToLog(ByteBuffer logBuffer) {
        LogUtils.writeLong(logBuffer, time.getTime());
        LogUtils.writeUnsignedInt(logBuffer, fileNum);
        LogUtils.writeLong(logBuffer, lastEntryInPrevFileOffset);
        LogUtils.writeInt(logBuffer, logVersion);
    }

    /**
     * @param itemBuf the source buffer
     * @see Loggable#readFromLog
     * Initialize this object from the data in itemBuf.
     */
    public void readFromLog(ByteBuffer logBuffer, int unusableEntryVersion) {

        /* Timestamp is always unpacked. */
        time = LogUtils.readTimestamp(logBuffer, true/*unpacked*/);
        fileNum = LogUtils.readUnsignedInt(logBuffer);
        lastEntryInPrevFileOffset = LogUtils.readLong(logBuffer);
        logVersion = LogUtils.readInt(logBuffer);

        /*
         * The log version is unknown until reading it.  If there are
         * version-specific fields in this entry, they must follow the log
         * version and use it, not the entryVersion param, for conditionals.
         */
    }

    /**
     * @param sb      destination string buffer
     * @param verbose if true, dump the full, verbose version
     * @see Loggable#dumpLog
     */
    public void dumpLog(StringBuilder sb, boolean verbose) {
        sb.append("<FileHeader num=\"0x");
        sb.append(Long.toHexString(fileNum));
        sb.append("\" lastEntryInPrevFileOffset=\"0x");
        sb.append(Long.toHexString(lastEntryInPrevFileOffset));
        sb.append("\" logVersion=\"0x");
        sb.append(Integer.toHexString(logVersion));
        sb.append("\" time=\"").append(time);
        sb.append("\"/>");
    }

    /**
     * @see Loggable#getTransactionId
     */
    public long getTransactionId() {
        return 0;
    }

    /**
     * @see Loggable#logicalEquals
     * Always return false, this item should never be compared.
     */
    public boolean logicalEquals(Loggable other) {
        return false;
    }

    /**
     * Print in xml format
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        dumpLog(sb, true);
        return sb.toString();
    }
}
