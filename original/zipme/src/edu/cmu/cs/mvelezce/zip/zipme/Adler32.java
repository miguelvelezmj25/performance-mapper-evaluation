//

package edu.cmu.cs.mvelezce.zip.zipme;

/**
 * Computes Adler32 checksum for a stream of data. An Adler32
 * checksum is not as reliable as a CRC32 checksum, but a lot faster to
 * compute.
 * <p>
 * The specification for Adler32 may be found in RFC 1950.
 * (ZLIB Compressed Data Format Specification version 3.3)
 * <p>
 * <p>
 * From that document:
 * <p>
 * "ADLER32 (Adler-32 checksum)
 * This contains a checksum value of the uncompressed data
 * (excluding any dictionary data) computed according to Adler-32
 * algorithm. This algorithm is a 32-bit extension and improvement
 * of the Fletcher algorithm, used in the ITU-T X.224 / ISO 8073
 * standard.
 * <p>
 * Adler-32 is composed of two sums accumulated per byte: s1 is
 * the sum of all bytes, s2 is the sum of all s1 values. Both sums
 * are done modulo 65521. s1 is initialized to 1, s2 to zero.  The
 * Adler-32 checksum is stored as s2*65536 + s1 in most-
 * significant-byte first (network) order."
 * <p>
 * "8.2. The Adler-32 algorithm
 * <p>
 * The Adler-32 algorithm is much faster than the CRC32 algorithm yet
 * still provides an extremely low probability of undetected errors.
 * <p>
 * The modulo on unsigned long accumulators can be delayed for 5552
 * bytes, so the modulo operation time is negligible.  If the bytes
 * are a, b, c, the second sum is 3a + 2b + c + 3, and so is position
 * and order sensitive, unlike the first sum, which is just a
 * checksum.  That 65521 is prime is important to avoid a possible
 * large class of two-byte errors that leave the check unchanged.
 * (The Fletcher checksum uses 255, which is not prime and which also
 * makes the Fletcher check insensitive to single byte changes 0 <->
 * 255.)
 * <p>
 * The sum s1 is initialized to 1 instead of zero to make the length
 * of the sequence part of s2, so that the length does not have to be
 * checked separately. (Any sequence of zeroes has a Fletcher
 * checksum of zero.)"
 *
 * @author John Leuner, Per Bothner
 * @see InflaterInputStream
 * @see DeflaterOutputStream
 * @since JDK 1.1
 */
public class Adler32 implements Checksum {

    /**
     * largest prime smaller than 65536
     */
    private static final int BASE = 65521;


    private int checksum;


    /**
     * Creates a new instance of the <code>Adler32</code> class.
     * The checksum starts off with a value of 1.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Adler32Checksum")
    public Adler32() {
        reset();
    }


    /**
     * Resets the Adler32 checksum to the initial value.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Adler32Checksum")
    public void reset() {
        checksum = 1;
    }


    /**
     * Updates the checksum with the byte b.
     *
     * @param bval the data value to add. The high byte of the int is ignored.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Adler32Checksum")
    public void update(int bval) {
        int s1 = checksum & 0xffff;
        int s2 = checksum >>> 16;
        s1 = (s1 + (bval & 0xFF)) % BASE;
        s2 = (s1 + s2) % BASE;
        checksum = (s2 << 16) + s1;
    }


    /**
     * Updates the checksum with the bytes taken from the array.
     *
     * @param buffer an array of bytes
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Adler32Checksum")
    public void update(byte[] buffer) {
        update(buffer, 0, buffer.length);
    }


    /**
     * Updates the checksum with the bytes taken from the array.
     *
     * @param buf an array of bytes
     * @param off the start of the data used for this update
     * @param len the number of bytes to use for this update
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Adler32Checksum")
    public void update(byte[] buf, int off, int len) {
        int s1 = checksum & 0xffff;
        int s2 = checksum >>> 16;
        while (len > 0) {
            int n = 3800;
            if(n > len) {
                n = len;
            }
            len -= n;
            while (--n >= 0) {
                s1 = s1 + (buf[off++] & 0xFF);
                s2 = s2 + s1;
            }
            s1 %= BASE;
            s2 %= BASE;
        }
        checksum = (s2 << 16) | s1;
    }


    /**
     * Returns the Adler32 data checksum computed so far.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Adler32Checksum")
    public long getValue() {
        return (long) checksum & 0xffffffffL;
    }


}
