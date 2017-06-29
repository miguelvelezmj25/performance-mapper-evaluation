//

/**
 */
package edu.cmu.cs.mvelezce.zip.zipme;

import java.io.IOException;
import java.io.InputStream;

public class ZipArchive_InflaterInputStream extends InflaterInputStream {

    private final int sz;


    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Base")
    public ZipArchive_InflaterInputStream(InputStream in, Inflater inf, int sz) {
        super(in, inf);
        this.sz = sz;
    }


    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "Base")
    public int available() throws IOException {
        if (sz == -1) {
            return super.available();
        }
        if (super.available() != 0) {
            return sz - inf.getTotalOut();
        }
        return 0;
    }


}
