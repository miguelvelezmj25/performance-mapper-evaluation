//

package edu.cmu.cs.mvelezce.zip.zipme;

/**
 * Interface to compute a data checksum used by checked input/output streams.
 * A data checksum can be updated by one byte or with a byte array. After each
 * update the value of the current checksum can be returned by calling
 * <code>getValue</code>. The complete checksum object can also be reset
 * so it can be used again with new data.
 *
 * @author Per Bothner
 * @author Jochen Hoenicke
 * @see CheckedInputStream
 * @see CheckedOutputStream
 */
public interface Checksum {

    /**
     * Returns the data checksum computed so far.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Base")
    long getValue();


    /**
     * Resets the data checksum as if no update was ever called.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Base")
    void reset();


    /**
     * Adds one byte to the data checksum.
     *
     * @param bval the data value to add. The high byte of the int is ignored.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Base")
    void update(int bval);


    /**
     * Adds the byte array to the data checksum.
     *
     * @param buf the buffer which contains the data
     * @param off the offset in the buffer where the data starts
     * @param len the length of the data
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Base")
    void update(byte[] buf, int off, int len);


}
