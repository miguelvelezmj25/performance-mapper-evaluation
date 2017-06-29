//

package edu.cmu.cs.mvelezce.zip.zipme;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import static edu.cmu.cs.mvelezce.zip.ZipMain.FEATUREDerivativeExtractCRC;

public class ZipInputStream extends InflaterInputStream implements ZipConstants {

    private ZipEntry entry = null;


    private int csize;


    private int size;


    private int method;


    private int flags;


    private int avail;


    private boolean entryAtEOF;
    private CRC32 crc = new CRC32();


    /**
     * Creates a new Zip input stream, reading a zip archive.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    public ZipInputStream(InputStream in) {
        super(in, new Inflater(true));
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    private void fillBuf() throws IOException {
        avail = len = in.read(buf, 0, buf.length);
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    private int readBuf(byte[] out, int offset, int length) throws IOException {
        if (avail <= 0) {
            fillBuf();
            if (avail <= 0) {
                return -1;
            }
        }
        if (length > avail) {
            length = avail;
        }
        System.arraycopy(buf, len - avail, out, offset, length);
        avail -= length;
        return length;
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    private void readFully(byte[] out) throws IOException {
        int off = 0;
        int len = out.length;
        while (len > 0) {
            int count = readBuf(out, off, len);
            if (count == -1) {
                throw new EOFException();
            }
            off += count;
            len -= count;
        }
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    private int readLeByte() throws IOException {
        if (avail <= 0) {
            fillBuf();
            if (avail <= 0) {
                throw new ZipException("EOF in header");
            }
        }
        return buf[len - avail--] & 0xff;
    }

    /**
     * Read an unsigned short in little endian byte order.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    private int readLeShort() throws IOException {
        return readLeByte() | (readLeByte() << 8);
    }

    /**
     * Read an int in little endian byte order.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    private int readLeInt() throws IOException {
        return readLeShort() | (readLeShort() << 16);
    }

    /**
     * Open the next entry from the zip archive, and return its description.
     * If the previous entry wasn't closed, this method will close it.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    public ZipEntry getNextEntry__before__DerivativeExtractCRC() throws IOException {
        if (entry != null) {
            closeEntry();
        }
        int header = readLeInt();
        if (header == CENSIG) {
            close();
            return null;
        }
        if (header != LOCSIG) {
            throw new ZipException("Wrong Local header signature: " + Integer.toHexString(header));
        }
        readLeShort();
        flags = readLeShort();
        method = readLeShort();
        int dostime = readLeInt();
        int crc = readLeInt();
        csize = readLeInt();
        size = readLeInt();
        int nameLen = readLeShort();
        int extraLen = readLeShort();
        if (method == ZipOutputStream.STORED && csize != size) {
            throw new ZipException("Stored, but compressed != uncompressed");
        }
        byte[] buffer = new byte[nameLen];
        readFully(buffer);
        String name;
        //try {
        //name=new String(buffer,"UTF-8");
        name = new String(buffer); // ALEX: changed by me, because JPF does not implement the method with encoding
        //}
        //catch (    UnsupportedEncodingException uee) {
        //   throw new Error(uee.toString());
        //}
        entry = createZipEntry(name);
        entryAtEOF = false;
        entry.setMethod(method);
        if ((flags & 8) == 0) {
            entry.setCrc(crc & 0xffffffffL);
            entry.setSize(size & 0xffffffffL);
            entry.setCompressedSize(csize & 0xffffffffL);
        }
        entry.setDOSTime(dostime);
        if (extraLen > 0) {
            byte[] extra = new byte[extraLen];
            readFully(extra);
            entry.setExtra(extra);
        }
        if (method == ZipOutputStream.DEFLATED && avail > 0) {
            System.arraycopy(buf, len - avail, buf, 0, avail);
            len = avail;
            avail = 0;
            inf.setInput(buf, 0, len);
        }
        return entry;
    }

    /**
     * Open the next entry from the zip archive, and return its description.
     * If the previous entry wasn't closed, this method will close it.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeExtractCRC")
    public ZipEntry getNextEntry__role__DerivativeExtractCRC() throws IOException {
        if (crc == null) {
            throw new IOException("Stream closed.");
        }
        return getNextEntry__before__DerivativeExtractCRC();
    }

    /**
     * Open the next entry from the zip archive, and return its description.
     * If the previous entry wasn't closed, this method will close it.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "featureSwitch")
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID(id = 22, thenFeature = "DerivativeExtractCRC", elseFeature = "Extract")
    public ZipEntry
    getNextEntry() throws IOException {
        if (FEATUREDerivativeExtractCRC) {
            return getNextEntry__role__DerivativeExtractCRC();
        }
        else {
            return getNextEntry__before__DerivativeExtractCRC();
        }
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    private void readDataDescr() throws IOException {
        if (readLeInt() != EXTSIG) {
            throw new ZipException("Data descriptor signature not found");
        }
        entry.setCrc(readLeInt() & 0xffffffffL);
        csize = readLeInt();
        size = readLeInt();
        entry.setSize(size & 0xffffffffL);
        entry.setCompressedSize(csize & 0xffffffffL);
    }

    /**
     * Closes the current zip entry and moves to the next one.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    public void closeEntry__before__DerivativeExtractCRC() throws IOException {
        if (entry == null) {
            return;
        }
        if (method == ZipOutputStream.DEFLATED) {
            if ((flags & 8) != 0) {
                byte[] tmp = new byte[2048];
                while (read(tmp) > 0) ;
                return;
            }
            csize -= inf.getTotalIn();
            avail = inf.getRemaining();
        }
        if (avail > csize && csize >= 0) {
            avail -= csize;
        }
        else {
            csize -= avail;
            avail = 0;
            while (csize != 0) {
                long skipped = in.skip(csize & 0xffffffffL);
                if (skipped <= 0) {
                    throw new ZipException("zip archive ends early.");
                }
                csize -= skipped;
            }
        }
        size = 0;
        this.hook36();
        if (method == ZipOutputStream.DEFLATED) {
            inf.reset();
        }
        entry = null;
        entryAtEOF = true;
    }

    /**
     * Closes the current zip entry and moves to the next one.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeExtractCRC")
    public void closeEntry__role__DerivativeExtractCRC() throws IOException {
        if (crc == null) {
            throw new IOException("Stream closed.");
        }
        closeEntry__before__DerivativeExtractCRC();
    }

    /**
     * Closes the current zip entry and moves to the next one.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "featureSwitch")
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID(id = 23, thenFeature = "DerivativeExtractCRC", elseFeature = "Extract")
    public void
    closeEntry() throws IOException {
        if (FEATUREDerivativeExtractCRC) {
            closeEntry__role__DerivativeExtractCRC();
        }
        else {
            closeEntry__before__DerivativeExtractCRC();
        }
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    public int available() throws IOException {
        return entryAtEOF ? 0 : 1;
    }

    /**
     * Reads a byte from the current zip entry.
     *
     * @return the byte or -1 on EOF.
     * @throws IOException  if a i/o error occured.
     * @throws ZipException if the deflated stream is corrupted.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    public int read() throws IOException {
        byte[] b = new byte[1];
        if (read(b, 0, 1) <= 0) {
            return -1;
        }
        return b[0] & 0xff;
    }

    /**
     * Reads a block of bytes from the current zip entry.
     *
     * @return the number of bytes read (may be smaller, even before
     * EOF), or -1 on EOF.
     * @throws IOException  if a i/o error occured.
     * @throws ZipException if the deflated stream is corrupted.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    public int read(byte[] b, int off, int len) throws IOException {
        if (len == 0) {
            return 0;
        }
        this.hook38();
        if (entry == null) {
            return -1;
        }
        boolean finished = false;
        switch (method) {
            case ZipOutputStream.DEFLATED:
                len = super.read(b, off, len);
                if (len < 0) {
                    if (!inf.finished()) {
                        throw new ZipException("Inflater not finished!?");
                    }
                    avail = inf.getRemaining();
                    if ((flags & 8) != 0) {
                        readDataDescr();
                    }
                    if (inf.getTotalIn() != csize || inf.getTotalOut() != size) {
                        throw new ZipException("size mismatch: " + csize + ";" + size + " <-> " + inf.getTotalIn() + ";" + inf.getTotalOut());
                    }
                    inf.reset();
                    finished = true;
                }
                break;
            case ZipOutputStream.STORED:
                if (len > csize && csize >= 0) {
                    len = csize;
                }
                len = readBuf(b, off, len);
                if (len > 0) {
                    csize -= len;
                    size -= len;
                }
                if (csize == 0) {
                    finished = true;
                }
                else if (len < 0) {
                    throw new ZipException("EOF in stored block");
                }
                break;
        }
        this.hook37(b, off, len);
        if (finished) {
            this.hook39();
            entry = null;
            entryAtEOF = true;
        }
        return len;
    }

    /**
     * Closes the zip file.
     *
     * @throws IOException if a i/o error occured.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    public void close() throws IOException {
        super.close();
        this.hook40();
        entry = null;
        entryAtEOF = true;
    }

    /**
     * Creates a new zip entry for the given name.  This is equivalent
     * to new ZipEntry(name).
     *
     * @param name the name of the zip entry.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    protected ZipEntry createZipEntry(String name) {
        return new ZipEntry(name);
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    protected void hook36__before__DerivativeExtractCRC() throws IOException {
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeExtractCRC")
    protected void hook36__role__DerivativeExtractCRC() throws IOException {
        crc.reset();
        hook36__before__DerivativeExtractCRC();
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "featureSwitch")
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID(id = 24, thenFeature = "DerivativeExtractCRC", elseFeature = "Extract")
    protected void
    hook36() throws IOException {
        if (FEATUREDerivativeExtractCRC) {
            hook36__role__DerivativeExtractCRC();
        }
        else {
            hook36__before__DerivativeExtractCRC();
        }
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    protected void hook37__before__DerivativeExtractCRC(byte[] b, int off, int len) throws IOException {
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeExtractCRC")
    protected void hook37__role__DerivativeExtractCRC(byte[] b, int off, int len) throws IOException {
        if (len > 0) {
            crc.update(b, off, len);
        }
        hook37__before__DerivativeExtractCRC(b, off, len);
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "featureSwitch")
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID(id = 25, thenFeature = "DerivativeExtractCRC", elseFeature = "Extract")
    protected void
    hook37(byte[] b, int off, int len) throws IOException {
        if (FEATUREDerivativeExtractCRC) {
            hook37__role__DerivativeExtractCRC(b, off, len);
        }
        else {
            hook37__before__DerivativeExtractCRC(b, off, len);
        }
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    protected void hook38__before__DerivativeExtractCRC() throws IOException {
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeExtractCRC")
    protected void hook38__role__DerivativeExtractCRC() throws IOException {
        if (crc == null) {
            throw new IOException("Stream closed.");
        }
        hook38__before__DerivativeExtractCRC();
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "featureSwitch")
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID(id = 26, thenFeature = "DerivativeExtractCRC", elseFeature = "Extract")
    protected void
    hook38() throws IOException {
        if (FEATUREDerivativeExtractCRC) {
            hook38__role__DerivativeExtractCRC();
        }
        else {
            hook38__before__DerivativeExtractCRC();
        }
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    protected void hook39__before__DerivativeExtractCRC() throws IOException {
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeExtractCRC")
    protected void hook39__role__DerivativeExtractCRC() throws IOException {
        if ((crc.getValue() & 0xffffffffL) != entry.getCrc()) {
            throw new ZipException("CRC mismatch");
        }
        crc.reset();
        hook39__before__DerivativeExtractCRC();
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "featureSwitch")
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID(id = 27, thenFeature = "DerivativeExtractCRC", elseFeature = "Extract")
    protected void
    hook39() throws IOException {
        if (FEATUREDerivativeExtractCRC) {
            hook39__role__DerivativeExtractCRC();
        }
        else {
            hook39__before__DerivativeExtractCRC();
        }
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Extract")
    protected void hook40__before__DerivativeExtractCRC() throws IOException {
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeExtractCRC")
    protected void hook40__role__DerivativeExtractCRC() throws IOException {
        crc = null;
        hook40__before__DerivativeExtractCRC();
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "featureSwitch")
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID(id = 28, thenFeature = "DerivativeExtractCRC", elseFeature = "Extract")
    protected void
    hook40() throws IOException {
        if (FEATUREDerivativeExtractCRC) {
            hook40__role__DerivativeExtractCRC();
        }
        else {
            hook40__before__DerivativeExtractCRC();
        }
    }


}
