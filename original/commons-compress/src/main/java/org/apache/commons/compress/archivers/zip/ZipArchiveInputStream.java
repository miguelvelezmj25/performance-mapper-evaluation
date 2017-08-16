/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.zip.*;

import static org.apache.commons.compress.archivers.zip.ZipConstants.*;

/**
 * Implements an input stream that can read Zip archives.
 * <p>
 * <p>As of Apache Commons Compress it transparently supports Zip64
 * extensions and thus individual entries and archives larger than 4
 * GB or with more than 65536 entries.</p>
 * <p>
 * <p>The {@link ZipFile} class is preferred when reading from files
 * as {@link ZipArchiveInputStream} is limited by not being able to
 * read the central directory header before returning entries.  In
 * particular {@link ZipArchiveInputStream}</p>
 * <p>
 * <ul>
 * <p>
 * <li>may return entries that are not part of the central directory
 * at all and shouldn't be considered part of the archive.</li>
 * <p>
 * <li>may return several entries with the same name.</li>
 * <p>
 * <li>will not return internal or external attributes.</li>
 * <p>
 * <li>may return incomplete extra field data.</li>
 * <p>
 * <li>may return unknown sizes and CRC values for entries until the
 * next entry has been reached if the archive uses the data
 * descriptor feature.</li>
 * <p>
 * </ul>
 *
 * @NotThreadSafe
 * @see ZipFile
 */
public class ZipArchiveInputStream extends ArchiveInputStream {

    private static final int LFH_LEN = 30;
    private static final int CFH_LEN = 46;
    private static final long TWO_EXP_32 = ZIP64_MAGIC + 1;
    private static final byte[] LFH = ZipLong.LFH_SIG.getBytes();
    private static final byte[] CFH = ZipLong.CFH_SIG.getBytes();
    private static final byte[] DD = ZipLong.DD_SIG.getBytes();
    // the provided encoding (for unit tests)
    final String encoding;
    /**
     * The zip encoding to use for filenames and the file comment.
     */
    private final ZipEncoding zipEncoding;
    /**
     * Whether to look for and use Unicode extra fields.
     */
    private final boolean useUnicodeExtraFields;
    /**
     * Wrapped stream, will always be a PushbackInputStream.
     */
    private final InputStream in;
    /**
     * Inflater used for all deflated entries.
     */
    private final Inflater inf = new Inflater(true);
    /**
     * Buffer used to read from the wrapped stream.
     */
    private final ByteBuffer buf = ByteBuffer.allocate(ZipArchiveOutputStream.BUFFER_SIZE);
    /*
      local file header signature     WORD
      version needed to extract       SHORT
      general purpose bit flag        SHORT
      compression method              SHORT
      last mod file time              SHORT
      last mod file date              SHORT
      crc-32                          WORD
      compressed size                 WORD
      uncompressed size               WORD
      file name length                SHORT
      extra field length              SHORT
    */
    // cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)
    private final byte[] lfhBuf = new byte[LFH_LEN];
    /*
        central file header signature   WORD
        version made by                 SHORT
        version needed to extract       SHORT
        general purpose bit flag        SHORT
        compression method              SHORT
        last mod file time              SHORT
        last mod file date              SHORT
        crc-32                          WORD
        compressed size                 WORD
        uncompressed size               WORD
        file name length                SHORT
        extra field length              SHORT
        file comment length             SHORT
        disk number start               SHORT
        internal file attributes        SHORT
        external file attributes        WORD
        relative offset of local header WORD
    */
    private final byte[] skipBuf = new byte[1024];
    private final byte[] shortBuf = new byte[SHORT];
    private final byte[] wordBuf = new byte[WORD];
    private final byte[] twoDwordBuf = new byte[2 * DWORD];
    /**
     * The entry that is currently being read.
     */
    private CurrentEntry current = null;
    /**
     * Whether the stream has been closed.
     */
    private boolean closed = false;
    /**
     * Whether the stream has reached the central directory - and thus found all entries.
     */
    private boolean hitCentralDirectory = false;
    /**
     * When reading a stored entry that uses the data descriptor this
     * stream has to read the full entry and caches it.  This is the
     * cache.
     */
    private ByteArrayInputStream lastStoredEntry = null;
    /**
     * Whether the stream will try to read STORED entries that use a data descriptor.
     */
    private boolean allowStoredEntriesWithDataDescriptor = false;
    private int entriesRead = 0;

    /**
     * Create an instance using UTF-8 encoding
     *
     * @param inputStream the stream to wrap
     */
    public ZipArchiveInputStream(final InputStream inputStream) {
        this(inputStream, ZipEncodingHelper.UTF8);
    }

    /**
     * Create an instance using the specified encoding
     *
     * @param inputStream the stream to wrap
     * @param encoding    the encoding to use for file names, use null
     *                    for the platform's default encoding
     * @since 1.5
     */
    public ZipArchiveInputStream(final InputStream inputStream, final String encoding) {
        this(inputStream, encoding, true);
    }

    /**
     * Create an instance using the specified encoding
     *
     * @param inputStream           the stream to wrap
     * @param encoding              the encoding to use for file names, use null
     *                              for the platform's default encoding
     * @param useUnicodeExtraFields whether to use InfoZIP Unicode
     *                              Extra Fields (if present) to set the file names.
     */
    public ZipArchiveInputStream(final InputStream inputStream, final String encoding, final boolean useUnicodeExtraFields) {
        this(inputStream, encoding, useUnicodeExtraFields, false);
    }

    /**
     * Create an instance using the specified encoding
     *
     * @param inputStream                          the stream to wrap
     * @param encoding                             the encoding to use for file names, use null
     *                                             for the platform's default encoding
     * @param useUnicodeExtraFields                whether to use InfoZIP Unicode
     *                                             Extra Fields (if present) to set the file names.
     * @param allowStoredEntriesWithDataDescriptor whether the stream
     *                                             will try to read STORED entries that use a data descriptor
     * @since 1.1
     */
    public ZipArchiveInputStream(final InputStream inputStream,
                                 final String encoding,
                                 final boolean useUnicodeExtraFields,
                                 final boolean allowStoredEntriesWithDataDescriptor) {
        this.encoding = encoding;
        zipEncoding = ZipEncodingHelper.getZipEncoding(encoding);
        this.useUnicodeExtraFields = useUnicodeExtraFields;
        in = new PushbackInputStream(inputStream, buf.capacity());
        this.allowStoredEntriesWithDataDescriptor =
                allowStoredEntriesWithDataDescriptor;
        // haven't read anything so far
        buf.limit(0);
    }

    /**
     * Checks if the signature matches what is expected for a zip file.
     * Does not currently handle self-extracting zips which may have arbitrary
     * leading content.
     *
     * @param signature the bytes to check
     * @param length    the number of bytes to check
     * @return true, if this stream is a zip archive stream, false otherwise
     */
    public static boolean matches(final byte[] signature, final int length) {
        if(length < ZipArchiveOutputStream.LFH_SIG.length) {
            return false;
        }

        return checksig(signature, ZipArchiveOutputStream.LFH_SIG) // normal file
                || checksig(signature, ZipArchiveOutputStream.EOCD_SIG) // empty zip
                || checksig(signature, ZipArchiveOutputStream.DD_SIG) // split zip
                || checksig(signature, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
    }

    private static boolean checksig(final byte[] signature, final byte[] expected) {
        for(int i = 0; i < expected.length; i++) {
            if(signature[i] != expected[i]) {
                return false;
            }
        }
        return true;
    }

    public ZipArchiveEntry getNextZipEntry() throws IOException {
        boolean firstEntry = true;
        if(closed || hitCentralDirectory) {
            return null;
        }
        if(current != null) {
            closeEntry();
            firstEntry = false;
        }

        long currentHeaderOffset = getBytesRead();
        try {
            if(firstEntry) {
                // split archives have a special signature before the
                // first local file header - look for it and fail with
                // the appropriate error message if this is a split
                // archive.
                readFirstLocalFileHeader(lfhBuf);
            }
            else {
                readFully(lfhBuf);
            }
        } catch (final EOFException e) {
            return null;
        }

        final ZipLong sig = new ZipLong(lfhBuf);
        if(sig.equals(ZipLong.CFH_SIG) || sig.equals(ZipLong.AED_SIG)) {
            hitCentralDirectory = true;
            skipRemainderOfArchive();
            return null;
        }
        if(!sig.equals(ZipLong.LFH_SIG)) {
            throw new ZipException(String.format("Unexpected record signature: 0X%X", sig.getValue()));
        }

        int off = WORD;
        current = new CurrentEntry();

        final int versionMadeBy = ZipShort.getValue(lfhBuf, off);
        off += SHORT;
        current.entry.setPlatform((versionMadeBy >> ZipFile.BYTE_SHIFT) & ZipFile.NIBLET_MASK);

        final GeneralPurposeBit gpFlag = GeneralPurposeBit.parse(lfhBuf, off);
        final boolean hasUTF8Flag = gpFlag.usesUTF8ForNames();
        final ZipEncoding entryEncoding = hasUTF8Flag ? ZipEncodingHelper.UTF8_ZIP_ENCODING : zipEncoding;
        current.hasDataDescriptor = gpFlag.usesDataDescriptor();
        current.entry.setGeneralPurposeBit(gpFlag);

        off += SHORT;

        current.entry.setMethod(ZipShort.getValue(lfhBuf, off));
        off += SHORT;

        final long time = ZipUtil.dosToJavaTime(ZipLong.getValue(lfhBuf, off));
        current.entry.setTime(time);
        off += WORD;

        ZipLong size = null, cSize = null;
        if(!current.hasDataDescriptor) {
            current.entry.setCrc(ZipLong.getValue(lfhBuf, off));
            off += WORD;

            cSize = new ZipLong(lfhBuf, off);
            off += WORD;

            size = new ZipLong(lfhBuf, off);
            off += WORD;
        }
        else {
            off += 3 * WORD;
        }

        final int fileNameLen = ZipShort.getValue(lfhBuf, off);

        off += SHORT;

        final int extraLen = ZipShort.getValue(lfhBuf, off);
        off += SHORT;

        final byte[] fileName = new byte[fileNameLen];
        readFully(fileName);
        current.entry.setName(entryEncoding.decode(fileName), fileName);

        final byte[] extraData = new byte[extraLen];
        readFully(extraData);
        current.entry.setExtra(extraData);

        if(!hasUTF8Flag && useUnicodeExtraFields) {
            ZipUtil.setNameAndCommentFromExtraFields(current.entry, fileName, null);
        }

        processZip64Extra(size, cSize);

        current.entry.setLocalHeaderOffset(currentHeaderOffset);
        current.entry.setDataOffset(getBytesRead());
        current.entry.setStreamContiguous(true);

        if(current.entry.getCompressedSize() != ArchiveEntry.SIZE_UNKNOWN) {
            if(current.entry.getMethod() == ZipMethod.UNSHRINKING.getCode()) {
                current.in = new UnshrinkingInputStream(new BoundedInputStream(in, current.entry.getCompressedSize()));
            }
            else if(current.entry.getMethod() == ZipMethod.IMPLODING.getCode()) {
                current.in = new ExplodingInputStream(
                        current.entry.getGeneralPurposeBit().getSlidingDictionarySize(),
                        current.entry.getGeneralPurposeBit().getNumberOfShannonFanoTrees(),
                        new BoundedInputStream(in, current.entry.getCompressedSize()));
            }
            else if(current.entry.getMethod() == ZipMethod.BZIP2.getCode()) {
                current.in = new BZip2CompressorInputStream(new BoundedInputStream(in, current.entry.getCompressedSize()));
            }
        }

        entriesRead++;
        return current.entry;
    }

    /**
     * Fills the given array with the first local file header and
     * deals with splitting/spanning markers that may prefix the first
     * LFH.
     */
    private void readFirstLocalFileHeader(final byte[] lfh) throws IOException {
        readFully(lfh);
        final ZipLong sig = new ZipLong(lfh);
        if(sig.equals(ZipLong.DD_SIG)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.SPLITTING);
        }

        if(sig.equals(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER)) {
            // The archive is not really split as only one segment was
            // needed in the end.  Just skip over the marker.
            final byte[] missedLfhBytes = new byte[4];
            readFully(missedLfhBytes);
            System.arraycopy(lfh, 4, lfh, 0, LFH_LEN - 4);
            System.arraycopy(missedLfhBytes, 0, lfh, LFH_LEN - 4, 4);
        }
    }

    /**
     * Records whether a Zip64 extra is present and sets the size
     * information from it if sizes are 0xFFFFFFFF and the entry
     * doesn't use a data descriptor.
     */
    private void processZip64Extra(final ZipLong size, final ZipLong cSize) {
        final Zip64ExtendedInformationExtraField z64 =
                (Zip64ExtendedInformationExtraField)
                        current.entry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        current.usesZip64 = z64 != null;
        if(!current.hasDataDescriptor) {
            if(z64 != null // same as current.usesZip64 but avoids NPE warning
                    && (cSize.equals(ZipLong.ZIP64_MAGIC) || size.equals(ZipLong.ZIP64_MAGIC))) {
                current.entry.setCompressedSize(z64.getCompressedSize().getLongValue());
                current.entry.setSize(z64.getSize().getLongValue());
            }
            else {
                current.entry.setCompressedSize(cSize.getValue());
                current.entry.setSize(size.getValue());
            }
        }
    }

    @Override
    public ArchiveEntry getNextEntry() throws IOException {
        return getNextZipEntry();
    }

    /**
     * Whether this class is able to read the given entry.
     * <p>
     * <p>May return false if it is set up to use encryption or a
     * compression method that hasn't been implemented yet.</p>
     *
     * @since 1.1
     */
    @Override
    public boolean canReadEntryData(final ArchiveEntry ae) {
        if(ae instanceof ZipArchiveEntry) {
            final ZipArchiveEntry ze = (ZipArchiveEntry) ae;
            return ZipUtil.canHandleEntryData(ze)
                    && supportsDataDescriptorFor(ze);

        }
        return false;
    }

    @Override
    public int read(final byte[] buffer, final int offset, final int length) throws IOException {
        if(closed) {
            throw new IOException("The stream is closed");
        }

        if(current == null) {
            return -1;
        }

        // avoid int overflow, check null buffer
        if(offset > buffer.length || length < 0 || offset < 0 || buffer.length - offset < length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        ZipUtil.checkRequestedFeatures(current.entry);
        if(!supportsDataDescriptorFor(current.entry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR,
                    current.entry);
        }

        int read;
        if(current.entry.getMethod() == ZipArchiveOutputStream.STORED) {
            read = readStored(buffer, offset, length);
        }
        else if(current.entry.getMethod() == ZipArchiveOutputStream.DEFLATED) {
            read = readDeflated(buffer, offset, length);
        }
        else if(current.entry.getMethod() == ZipMethod.UNSHRINKING.getCode()
                || current.entry.getMethod() == ZipMethod.IMPLODING.getCode()
                || current.entry.getMethod() == ZipMethod.BZIP2.getCode()) {
            read = current.in.read(buffer, offset, length);
        }
        else {
            throw new UnsupportedZipFeatureException(ZipMethod.getMethodByCode(current.entry.getMethod()),
                    current.entry);
        }

        if(read >= 0) {
            current.crc.update(buffer, offset, read);
        }

        return read;
    }

    /**
     * Implementation of read for STORED entries.
     */
    private int readStored(final byte[] buffer, final int offset, final int length) throws IOException {

        if(current.hasDataDescriptor) {
            if(lastStoredEntry == null) {
                readStoredEntry();
            }
            return lastStoredEntry.read(buffer, offset, length);
        }

        final long csize = current.entry.getSize();
        if(current.bytesRead >= csize) {
            return -1;
        }

        if(buf.position() >= buf.limit()) {
            buf.position(0);
            final int l = in.read(buf.array());
            if(l == -1) {
                return -1;
            }
            buf.limit(l);

            count(l);
            current.bytesReadFromStream += l;
        }

        int toRead = Math.min(buf.remaining(), length);
        if((csize - current.bytesRead) < toRead) {
            // if it is smaller than toRead then it fits into an int
            toRead = (int) (csize - current.bytesRead);
        }
        buf.get(buffer, offset, toRead);
        current.bytesRead += toRead;
        return toRead;
    }

    /**
     * Implementation of read for DEFLATED entries.
     */
    private int readDeflated(final byte[] buffer, final int offset, final int length) throws IOException {
        final int read = readFromInflater(buffer, offset, length);
        if(read <= 0) {
            if(inf.finished()) {
                return -1;
            }
            else if(inf.needsDictionary()) {
                throw new ZipException("This archive needs a preset dictionary"
                        + " which is not supported by Commons"
                        + " Compress.");
            }
            else if(read == -1) {
                throw new IOException("Truncated ZIP file");
            }
        }
        return read;
    }

    /**
     * Potentially reads more bytes to fill the inflater's buffer and
     * reads from it.
     */
    private int readFromInflater(final byte[] buffer, final int offset, final int length) throws IOException {
        int read = 0;
        do {
            if(inf.needsInput()) {
                final int l = fill();
                if(l > 0) {
                    current.bytesReadFromStream += buf.limit();
                }
                else if(l == -1) {
                    return -1;
                }
                else {
                    break;
                }
            }
            try {
                read = inf.inflate(buffer, offset, length);
            } catch (final DataFormatException e) {
                throw (IOException) new ZipException(e.getMessage()).initCause(e);
            }
        } while (read == 0 && inf.needsInput());
        return read;
    }

    @Override
    public void close() throws IOException {
        if(!closed) {
            closed = true;
            try {
                in.close();
            } finally {
                inf.end();
            }
        }
    }

    /**
     * Skips over and discards value bytes of data from this input
     * stream.
     * <p>
     * <p>This implementation may end up skipping over some smaller
     * number of bytes, possibly 0, if and only if it reaches the end
     * of the underlying stream.</p>
     * <p>
     * <p>The actual number of bytes skipped is returned.</p>
     *
     * @param value the number of bytes to be skipped.
     * @return the actual number of bytes skipped.
     * @throws IOException              - if an I/O error occurs.
     * @throws IllegalArgumentException - if value is negative.
     */
    @Override
    public long skip(final long value) throws IOException {
        if(value >= 0) {
            long skipped = 0;
            while (skipped < value) {
                final long rem = value - skipped;
                final int x = read(skipBuf, 0, (int) (skipBuf.length > rem ? rem : skipBuf.length));
                if(x == -1) {
                    return skipped;
                }
                skipped += x;
            }
            return skipped;
        }
        throw new IllegalArgumentException();
    }

    /**
     * Closes the current ZIP archive entry and positions the underlying
     * stream to the beginning of the next entry. All per-entry variables
     * and data structures are cleared.
     * <p>
     * If the compressed size of this entry is included in the entry header,
     * then any outstanding bytes are simply skipped from the underlying
     * stream without uncompressing them. This allows an entry to be safely
     * closed even if the compression method is unsupported.
     * <p>
     * In case we don't know the compressed size of this entry or have
     * already buffered too much data from the underlying stream to support
     * uncompression, then the uncompression process is completed and the
     * end position of the stream is adjusted based on the result of that
     * process.
     *
     * @throws IOException if an error occurs
     */
    private void closeEntry() throws IOException {
        if(closed) {
            throw new IOException("The stream is closed");
        }
        if(current == null) {
            return;
        }

        // Ensure all entry bytes are read
        if(currentEntryHasOutstandingBytes()) {
            drainCurrentEntryData();
        }
        else {
            // this is guaranteed to exhaust the stream
            skip(Long.MAX_VALUE); //NOSONAR

            final long inB = current.entry.getMethod() == ZipArchiveOutputStream.DEFLATED
                    ? getBytesInflated() : current.bytesRead;

            // this is at most a single read() operation and can't
            // exceed the range of int
            final int diff = (int) (current.bytesReadFromStream - inB);

            // Pushback any required bytes
            if(diff > 0) {
                pushback(buf.array(), buf.limit() - diff, diff);
                current.bytesReadFromStream -= diff;
            }

            // Drain remainder of entry if not all data bytes were required
            if(currentEntryHasOutstandingBytes()) {
                drainCurrentEntryData();
            }
        }

        if(lastStoredEntry == null && current.hasDataDescriptor) {
            readDataDescriptor();
        }

        inf.reset();
        buf.clear().flip();
        current = null;
        lastStoredEntry = null;
    }

    /**
     * If the compressed size of the current entry is included in the entry header
     * and there are any outstanding bytes in the underlying stream, then
     * this returns true.
     *
     * @return true, if current entry is determined to have outstanding bytes, false otherwise
     */
    private boolean currentEntryHasOutstandingBytes() {
        return current.bytesReadFromStream <= current.entry.getCompressedSize()
                && !current.hasDataDescriptor;
    }

    /**
     * Read all data of the current entry from the underlying stream
     * that hasn't been read, yet.
     */
    private void drainCurrentEntryData() throws IOException {
        long remaining = current.entry.getCompressedSize() - current.bytesReadFromStream;
        while (remaining > 0) {
            final long n = in.read(buf.array(), 0, (int) Math.min(buf.capacity(), remaining));
            if(n < 0) {
                throw new EOFException("Truncated ZIP entry: "
                        + ArchiveUtils.sanitize(current.entry.getName()));
            }
            count(n);
            remaining -= n;
        }
    }

    /**
     * Get the number of bytes Inflater has actually processed.
     * <p>
     * <p>for Java &lt; Java7 the getBytes* methods in
     * Inflater/Deflater seem to return unsigned ints rather than
     * longs that start over with 0 at 2^32.</p>
     * <p>
     * <p>The stream knows how many bytes it has read, but not how
     * many the Inflater actually consumed - it should be between the
     * total number of bytes read for the entry and the total number
     * minus the last read operation.  Here we just try to make the
     * value close enough to the bytes we've read by assuming the
     * number of bytes consumed must be smaller than (or equal to) the
     * number of bytes read but not smaller by more than 2^32.</p>
     */
    private long getBytesInflated() {
        long inB = inf.getBytesRead();
        if(current.bytesReadFromStream >= TWO_EXP_32) {
            while (inB + TWO_EXP_32 <= current.bytesReadFromStream) {
                inB += TWO_EXP_32;
            }
        }
        return inB;
    }

    private int fill() throws IOException {
        if(closed) {
            throw new IOException("The stream is closed");
        }
        final int length = in.read(buf.array());
        if(length > 0) {
            buf.limit(length);
            count(buf.limit());
            inf.setInput(buf.array(), 0, buf.limit());
        }
        return length;
    }

    private void readFully(final byte[] b) throws IOException {
        final int count = IOUtils.readFully(in, b);
        count(count);
        if(count < b.length) {
            throw new EOFException();
        }
    }

    private void readDataDescriptor() throws IOException {
        readFully(wordBuf);
        ZipLong val = new ZipLong(wordBuf);
        if(ZipLong.DD_SIG.equals(val)) {
            // data descriptor with signature, skip sig
            readFully(wordBuf);
            val = new ZipLong(wordBuf);
        }
        current.entry.setCrc(val.getValue());

        // if there is a ZIP64 extra field, sizes are eight bytes
        // each, otherwise four bytes each.  Unfortunately some
        // implementations - namely Java7 - use eight bytes without
        // using a ZIP64 extra field -
        // http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=7073588

        // just read 16 bytes and check whether bytes nine to twelve
        // look like one of the signatures of what could follow a data
        // descriptor (ignoring archive decryption headers for now).
        // If so, push back eight bytes and assume sizes are four
        // bytes, otherwise sizes are eight bytes each.
        readFully(twoDwordBuf);
        final ZipLong potentialSig = new ZipLong(twoDwordBuf, DWORD);
        if(potentialSig.equals(ZipLong.CFH_SIG) || potentialSig.equals(ZipLong.LFH_SIG)) {
            pushback(twoDwordBuf, DWORD, DWORD);
            current.entry.setCompressedSize(ZipLong.getValue(twoDwordBuf));
            current.entry.setSize(ZipLong.getValue(twoDwordBuf, WORD));
        }
        else {
            current.entry.setCompressedSize(ZipEightByteInteger.getLongValue(twoDwordBuf));
            current.entry.setSize(ZipEightByteInteger.getLongValue(twoDwordBuf, DWORD));
        }
    }

    /**
     * Whether this entry requires a data descriptor this library can work with.
     *
     * @return true if allowStoredEntriesWithDataDescriptor is true,
     * the entry doesn't require any data descriptor or the method is
     * DEFLATED.
     */
    private boolean supportsDataDescriptorFor(final ZipArchiveEntry entry) {
        return !entry.getGeneralPurposeBit().usesDataDescriptor()

                || (allowStoredEntriesWithDataDescriptor && entry.getMethod() == ZipEntry.STORED)
                || entry.getMethod() == ZipEntry.DEFLATED;
    }

    /**
     * Caches a stored entry that uses the data descriptor.
     * <p>
     * <ul>
     * <li>Reads a stored entry until the signature of a local file
     * header, central directory header or data descriptor has been
     * found.</li>
     * <li>Stores all entry data in lastStoredEntry.</p>
     * <li>Rewinds the stream to position at the data
     * descriptor.</li>
     * <li>reads the data descriptor</li>
     * </ul>
     * <p>
     * <p>After calling this method the entry should know its size,
     * the entry's data is cached and the stream is positioned at the
     * next local file or central directory header.</p>
     */
    private void readStoredEntry() throws IOException {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int off = 0;
        boolean done = false;

        // length of DD without signature
        final int ddLen = current.usesZip64 ? WORD + 2 * DWORD : 3 * WORD;

        while (!done) {
            final int r = in.read(buf.array(), off, ZipArchiveOutputStream.BUFFER_SIZE - off);
            if(r <= 0) {
                // read the whole archive without ever finding a
                // central directory
                throw new IOException("Truncated ZIP file");
            }
            if(r + off < 4) {
                // buffer too small to check for a signature, loop
                off += r;
                continue;
            }

            done = bufferContainsSignature(bos, off, r, ddLen);
            if(!done) {
                off = cacheBytesRead(bos, off, r, ddLen);
            }
        }

        final byte[] b = bos.toByteArray();
        lastStoredEntry = new ByteArrayInputStream(b);
    }

    /**
     * Checks whether the current buffer contains the signature of a
     * &quot;data descriptor&quot;, &quot;local file header&quot; or
     * &quot;central directory entry&quot;.
     * <p>
     * <p>If it contains such a signature, reads the data descriptor
     * and positions the stream right after the data descriptor.</p>
     */
    private boolean bufferContainsSignature(final ByteArrayOutputStream bos, final int offset, final int lastRead, final int expectedDDLen)
            throws IOException {

        boolean done = false;
        int readTooMuch = 0;
        for(int i = 0; !done && i < lastRead - 4; i++) {
            if(buf.array()[i] == LFH[0] && buf.array()[i + 1] == LFH[1]) {
                if((buf.array()[i + 2] == LFH[2] && buf.array()[i + 3] == LFH[3])
                        || (buf.array()[i] == CFH[2] && buf.array()[i + 3] == CFH[3])) {
                    // found a LFH or CFH:
                    readTooMuch = offset + lastRead - i - expectedDDLen;
                    done = true;
                }
                else if(buf.array()[i + 2] == DD[2] && buf.array()[i + 3] == DD[3]) {
                    // found DD:
                    readTooMuch = offset + lastRead - i;
                    done = true;
                }
                if(done) {
                    // * push back bytes read in excess as well as the data
                    //   descriptor
                    // * copy the remaining bytes to cache
                    // * read data descriptor
                    pushback(buf.array(), offset + lastRead - readTooMuch, readTooMuch);
                    bos.write(buf.array(), 0, i);
                    readDataDescriptor();
                }
            }
        }
        return done;
    }

    /**
     * If the last read bytes could hold a data descriptor and an
     * incomplete signature then save the last bytes to the front of
     * the buffer and cache everything in front of the potential data
     * descriptor into the given ByteArrayOutputStream.
     * <p>
     * <p>Data descriptor plus incomplete signature (3 bytes in the
     * worst case) can be 20 bytes max.</p>
     */
    private int cacheBytesRead(final ByteArrayOutputStream bos, int offset, final int lastRead, final int expecteDDLen) {
        final int cacheable = offset + lastRead - expecteDDLen - 3;
        if(cacheable > 0) {
            bos.write(buf.array(), 0, cacheable);
            System.arraycopy(buf.array(), cacheable, buf.array(), 0, expecteDDLen + 3);
            offset = expecteDDLen + 3;
        }
        else {
            offset += lastRead;
        }
        return offset;
    }

    private void pushback(final byte[] buf, final int offset, final int length) throws IOException {
        ((PushbackInputStream) in).unread(buf, offset, length);
        pushedBackBytes(length);
    }

    // End of Central Directory Record
    //   end of central dir signature    WORD
    //   number of this disk             SHORT
    //   number of the disk with the
    //   start of the central directory  SHORT
    //   total number of entries in the
    //   central directory on this disk  SHORT
    //   total number of entries in
    //   the central directory           SHORT
    //   size of the central directory   WORD
    //   offset of start of central
    //   directory with respect to
    //   the starting disk number        WORD
    //   .ZIP file comment length        SHORT
    //   .ZIP file comment               up to 64KB
    //

    /**
     * Reads the stream until it find the "End of central directory
     * record" and consumes it as well.
     */
    private void skipRemainderOfArchive() throws IOException {
        // skip over central directory. One LFH has been read too much
        // already.  The calculation discounts file names and extra
        // data so it will be too short.
        realSkip((long) entriesRead * CFH_LEN - LFH_LEN);
        findEocdRecord();
        realSkip((long) ZipFile.MIN_EOCD_SIZE - WORD /* signature */ - SHORT /* comment len */);
        readFully(shortBuf);
        // file comment
        realSkip(ZipShort.getValue(shortBuf));
    }

    /**
     * Reads forward until the signature of the &quot;End of central
     * directory&quot; record is found.
     */
    private void findEocdRecord() throws IOException {
        int currentByte = -1;
        boolean skipReadCall = false;
        while (skipReadCall || (currentByte = readOneByte()) > -1) {
            skipReadCall = false;
            if(!isFirstByteOfEocdSig(currentByte)) {
                continue;
            }
            currentByte = readOneByte();
            if(currentByte != ZipArchiveOutputStream.EOCD_SIG[1]) {
                if(currentByte == -1) {
                    break;
                }
                skipReadCall = isFirstByteOfEocdSig(currentByte);
                continue;
            }
            currentByte = readOneByte();
            if(currentByte != ZipArchiveOutputStream.EOCD_SIG[2]) {
                if(currentByte == -1) {
                    break;
                }
                skipReadCall = isFirstByteOfEocdSig(currentByte);
                continue;
            }
            currentByte = readOneByte();
            if(currentByte == -1
                    || currentByte == ZipArchiveOutputStream.EOCD_SIG[3]) {
                break;
            }
            skipReadCall = isFirstByteOfEocdSig(currentByte);
        }
    }

    /**
     * Skips bytes by reading from the underlying stream rather than
     * the (potentially inflating) archive stream - which {@link
     * #skip} would do.
     * <p>
     * Also updates bytes-read counter.
     */
    private void realSkip(final long value) throws IOException {
        if(value >= 0) {
            long skipped = 0;
            while (skipped < value) {
                final long rem = value - skipped;
                final int x = in.read(skipBuf, 0, (int) (skipBuf.length > rem ? rem : skipBuf.length));
                if(x == -1) {
                    return;
                }
                count(x);
                skipped += x;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /**
     * Reads bytes by reading from the underlying stream rather than
     * the (potentially inflating) archive stream - which {@link #read} would do.
     * <p>
     * Also updates bytes-read counter.
     */
    private int readOneByte() throws IOException {
        final int b = in.read();
        if(b != -1) {
            count(1);
        }
        return b;
    }

    private boolean isFirstByteOfEocdSig(final int b) {
        return b == ZipArchiveOutputStream.EOCD_SIG[0];
    }

    /**
     * Structure collecting information for the entry that is
     * currently being read.
     */
    private static final class CurrentEntry {

        /**
         * Current ZIP entry.
         */
        private final ZipArchiveEntry entry = new ZipArchiveEntry();
        /**
         * The checksum calculated as the current entry is read.
         */
        private final CRC32 crc = new CRC32();
        /**
         * Does the entry use a data descriptor?
         */
        private boolean hasDataDescriptor;
        /**
         * Does the entry have a ZIP64 extended information extra field.
         */
        private boolean usesZip64;
        /**
         * Number of bytes of entry content read by the client if the
         * entry is STORED.
         */
        private long bytesRead;
        /**
         * Number of bytes of entry content read so from the stream.
         * <p>
         * <p>This may be more than the actual entry's length as some
         * stuff gets buffered up and needs to be pushed back when the
         * end of the entry has been reached.</p>
         */
        private long bytesReadFromStream;
        /**
         * The input stream decompressing the data for shrunk and imploded entries.
         */
        private InputStream in;
    }

    /**
     * Bounded input stream adapted from commons-io
     */
    private class BoundedInputStream extends InputStream {

        /**
         * the wrapped input stream
         */
        private final InputStream in;

        /**
         * the max length to provide
         */
        private final long max;

        /**
         * the number of bytes already returned
         */
        private long pos = 0;

        /**
         * Creates a new <code>BoundedInputStream</code> that wraps the given input
         * stream and limits it to a certain size.
         *
         * @param in   The wrapped input stream
         * @param size The maximum number of bytes to return
         */
        public BoundedInputStream(final InputStream in, final long size) {
            this.max = size;
            this.in = in;
        }

        @Override
        public int read() throws IOException {
            if(max >= 0 && pos >= max) {
                return -1;
            }
            final int result = in.read();
            pos++;
            count(1);
            current.bytesReadFromStream++;
            return result;
        }

        @Override
        public int read(final byte[] b) throws IOException {
            return this.read(b, 0, b.length);
        }

        @Override
        public int read(final byte[] b, final int off, final int len) throws IOException {
            if(max >= 0 && pos >= max) {
                return -1;
            }
            final long maxRead = max >= 0 ? Math.min(len, max - pos) : len;
            final int bytesRead = in.read(b, off, (int) maxRead);

            if(bytesRead == -1) {
                return -1;
            }

            pos += bytesRead;
            count(bytesRead);
            current.bytesReadFromStream += bytesRead;
            return bytesRead;
        }

        @Override
        public long skip(final long n) throws IOException {
            final long toSkip = max >= 0 ? Math.min(n, max - pos) : n;
            final long skippedBytes = in.skip(toSkip);
            pos += skippedBytes;
            return skippedBytes;
        }

        @Override
        public int available() throws IOException {
            if(max >= 0 && pos >= max) {
                return 0;
            }
            return in.available();
        }
    }
}
