// DerivativeCompressGZIPCRC

package edu.cmu.cs.mvelezce.zip.zipme;

import static edu.cmu.cs.mvelezce.zip.ZipMain.FEATUREDerivativeCompressGZIPCRC;

class GZIPOutputStream_hook22 {

    protected GZIPOutputStream _this;
    protected byte[] gzipFooter;
    protected int crcval;


    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeCompressGZIP")
    GZIPOutputStream_hook22(GZIPOutputStream _this, byte[] gzipFooter) {
        this._this = _this;
        this.gzipFooter = gzipFooter;
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeCompressGZIP")
    void execute__before__DerivativeCompressGZIPCRC() {
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "DerivativeCompressGZIPCRC")
    void execute__role__DerivativeCompressGZIPCRC() {
        crcval = (int) (_this.crc.getValue() & 0xffffffff);
        gzipFooter[0] = (byte) crcval;
        gzipFooter[1] = (byte) (crcval >> 8);
        gzipFooter[2] = (byte) (crcval >> 16);
        gzipFooter[3] = (byte) (crcval >> 24);
        execute__before__DerivativeCompressGZIPCRC();
    }

    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation(name = "featureSwitch")
    @edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID(id = 35, thenFeature = "DerivativeCompressGZIPCRC", elseFeature = "DerivativeCompressGZIP")
    void
    execute() {
        if (FEATUREDerivativeCompressGZIPCRC) {
            execute__role__DerivativeCompressGZIPCRC();
        }
        else {
            execute__before__DerivativeCompressGZIPCRC();
        }
    }


}
