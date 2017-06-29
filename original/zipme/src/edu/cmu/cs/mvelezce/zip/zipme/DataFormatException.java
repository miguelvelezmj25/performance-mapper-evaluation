//

package edu.cmu.cs.mvelezce.zip.zipme;

/**
 * Exception thrown when compressed data is corrupt.
 *
 * @author Tom Tromey
 * @author John Leuner
 * @status updated to 1.4
 * @since 1.1
 */
public class DataFormatException extends Exception {

    /**
     * Compatible with JDK 1.1+.
     */
    private static final long serialVersionUID = 2219632870893641452L;


    /**
     * Create an exception without a message.
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Base")
    public DataFormatException() {
    }


    /**
     * Create an exception with a message.
     *
     * @param msg the message
     */
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Base")
    public DataFormatException(String msg) {
        super(msg);
    }


}
