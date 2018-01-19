// DerivativeCompressGZIPCRC

package net.sf.zipme; 
import java.io.IOException; 
import java.io.OutputStream; 
 
class  GZIPOutputStream_hook22 {
	
  @featureHouse.FeatureAnnotation(name="DerivativeCompressGZIP")
GZIPOutputStream_hook22(  GZIPOutputStream _this,  byte[] gzipFooter){
    this._this=_this;
    this.gzipFooter=gzipFooter;
  }

	
  @featureHouse.FeatureAnnotation (name="DerivativeCompressGZIP")
void execute__before__DerivativeCompressGZIPCRC(){
  }

	
  @featureHouse.FeatureAnnotation(name="DerivativeCompressGZIPCRC")
void  execute__role__DerivativeCompressGZIPCRC(){
    crcval=(int)(_this.crc.getValue() & 0xffffffff);
    gzipFooter[0]=(byte)crcval;
    gzipFooter[1]=(byte)(crcval >> 8);
    gzipFooter[2]=(byte)(crcval >> 16);
    gzipFooter[3]=(byte)(crcval >> 24);
    execute__before__DerivativeCompressGZIPCRC();
  }

	
   @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=35, thenFeature="DerivativeCompressGZIPCRC", elseFeature="DerivativeCompressGZIP")
void
execute() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DerivativeCompressGZIPCRC) {
        execute__role__DerivativeCompressGZIPCRC();
    } else {
        execute__before__DerivativeCompressGZIPCRC();
    }
}



	
  protected GZIPOutputStream _this;

	
  protected byte[] gzipFooter;

	
  protected int crcval;


}
