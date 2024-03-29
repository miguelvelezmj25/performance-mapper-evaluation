//

package net.sf.zipme; 
public 
class  Inflater {
	
  private static final int CPLENS[]={3,4,5,6,7,8,9,10,11,13,15,17,19,23,27,31,35,43,51,59,67,83,99,115,131,163,195,227,258};

	
  private static final int CPLEXT[]={0,0,0,0,0,0,0,0,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,0};

	
  private static final int CPDIST[]={1,2,3,4,5,7,9,13,17,25,33,49,65,97,129,193,257,385,513,769,1025,1537,2049,3073,4097,6145,8193,12289,16385,24577};

	
  private static final int CPDEXT[]={0,0,0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13};

	
  private static final int DECODE_HEADER=0;

	
  private static final int DECODE_DICT=1;

	
  private static final int DECODE_BLOCKS=2;

	
  private static final int DECODE_STORED_LEN1=3;

	
  private static final int DECODE_STORED_LEN2=4;

	
  private static final int DECODE_STORED=5;

	
  private static final int DECODE_DYN_HEADER=6;

	
  private static final int DECODE_HUFFMAN=7;

	
  private static final int DECODE_HUFFMAN_LENBITS=8;

	
  private static final int DECODE_HUFFMAN_DIST=9;

	
  private static final int DECODE_HUFFMAN_DISTBITS=10;

	
  private static final int DECODE_CHKSUM=11;

	
  private static final int FINISHED=12;

	
  /** 
 * This variable contains the current state. 
 */
  private int mode;

	
  /** 
 * The adler checksum of the dictionary or of the decompressed
 * stream, as it is written in the header resp. footer of the
 * compressed stream.  <br>
 * Only valid if mode is DECODE_DICT or DECODE_CHKSUM.
 */
  private int readAdler;

	
  /** 
 * The number of bits needed to complete the current state.  This
 * is valid, if mode is DECODE_DICT, DECODE_CHKSUM,
 * DECODE_HUFFMAN_LENBITS or DECODE_HUFFMAN_DISTBITS.  
 */
  private int neededBits;

	
  private int repLength, repDist;

	
  private int uncomprLen;

	
  /** 
 * True, if the last block flag was set in the last block of the
 * inflated stream.  This means that the stream ends after the
 * current block.  
 */
  private boolean isLastBlock;

	
  /** 
 * The total number of inflated bytes.
 */
  private long totalOut;

	
  /** 
 * The total number of bytes set with setInput().  This is not the
 * value returned by getTotalIn(), since this also includes the 
 * unprocessed input.
 */
  private long totalIn;

	
  /** 
 * This variable stores the nowrap flag that was given to the constructor.
 * True means, that the inflated stream doesn't contain a header nor the
 * checksum in the footer.
 */
  private boolean nowrap;

	
  private StreamManipulator input;

	
  private OutputWindow outputWindow;

	
  private InflaterDynHeader dynHeader;

	
  private InflaterHuffmanTree litlenTree, distTree;

	
  /** 
 * Creates a new inflater.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public Inflater(){
    this(false);
  }

	
  /** 
 * Creates a new inflater.
 * @param nowrap true if no header and checksum field appears in the
 * stream.  This is used for GZIPed input.  For compatibility with
 * Sun JDK you should provide one byte of input more than needed in
 * this case.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public Inflater(  boolean nowrap){
    this.nowrap=nowrap;
    this.hook32();
    input=new StreamManipulator();
    outputWindow=new OutputWindow();
    mode=nowrap ? DECODE_BLOCKS : DECODE_HEADER;
  }

	
  /** 
 * Frees all objects allocated by the inflater.  There's no reason
 * to call this, since you can just rely on garbage collection (even
 * for the Sun implementation).  Exists only for compatibility
 * with Sun's JDK, where the compressor allocates native memory.
 * If you call any method (even reset) afterwards the behaviour is
 * <i>undefined</i>.  
 */
  @featureHouse.FeatureAnnotation (name="Base")
public void end__before__Adler32Checksum(){
    outputWindow=null;
    input=null;
    dynHeader=null;
    litlenTree=null;
    distTree=null;
  }

	
  /** 
 * Frees all objects allocated by the inflater.  There's no reason
 * to call this, since you can just rely on garbage collection (even
 * for the Sun implementation).  Exists only for compatibility
 * with Sun's JDK, where the compressor allocates native memory.
 * If you call any method (even reset) afterwards the behaviour is
 * <i>undefined</i>.  
 */
  @featureHouse.FeatureAnnotation(name="Adler32Checksum")
public void  end__role__Adler32Checksum(){
    end__before__Adler32Checksum();
    adler=null;
  }

	
  /** 
 * Frees all objects allocated by the inflater.  There's no reason
 * to call this, since you can just rely on garbage collection (even
 * for the Sun implementation).  Exists only for compatibility
 * with Sun's JDK, where the compressor allocates native memory.
 * If you call any method (even reset) afterwards the behaviour is
 * <i>undefined</i>.  
 */
   @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=3, thenFeature="Adler32Checksum", elseFeature="Base")
public void
end() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Adler32Checksum) {
        end__role__Adler32Checksum();
    } else {
        end__before__Adler32Checksum();
    }
}



	
  /** 
 * Returns true, if the inflater has finished.  This means, that no
 * input is needed and no output can be produced.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public boolean finished(){
    return mode == FINISHED && outputWindow.getAvailable() == 0;
  }

	
  /** 
 * Gets the number of unprocessed input.  Useful, if the end of the
 * stream is reached and you want to further process the bytes after
 * the deflate stream.  
 * @return the number of bytes of the input which were not processed.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public int getRemaining(){
    return input.getAvailableBytes();
  }

	
  /** 
 * Gets the total number of processed compressed input bytes.
 * @return the total number of bytes of processed input bytes.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public int getTotalIn(){
    return (int)(totalIn - getRemaining());
  }

	
  /** 
 * Gets the total number of processed compressed input bytes.
 * @return the total number of bytes of processed input bytes.
 * @since 1.5
 */
  @featureHouse.FeatureAnnotation(name="Base")
public long getBytesRead(){
    return totalIn - getRemaining();
  }

	
  /** 
 * Gets the total number of output bytes returned by inflate().
 * @return the total number of output bytes.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public int getTotalOut(){
    return (int)totalOut;
  }

	
  /** 
 * Gets the total number of output bytes returned by inflate().
 * @return the total number of output bytes.
 * @since 1.5
 */
  @featureHouse.FeatureAnnotation(name="Base")
public long getBytesWritten(){
    return totalOut;
  }

	
  /** 
 * Inflates the compressed stream to the output buffer.  If this
 * returns 0, you should check, whether needsDictionary(),
 * needsInput() or finished() returns true, to determine why no 
 * further output is produced.
 * @param buf the output buffer.
 * @return the number of bytes written to the buffer, 0 if no further
 * output can be produced.  
 * @exception DataFormatException if deflated stream is invalid.
 * @exception IllegalArgumentException if buf has length 0.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public int inflate(  byte[] buf) throws DataFormatException {
    return inflate(buf,0,buf.length);
  }

	
  /** 
 * Inflates the compressed stream to the output buffer.  If this
 * returns 0, you should check, whether needsDictionary(),
 * needsInput() or finished() returns true, to determine why no 
 * further output is produced.
 * @param buf the output buffer.
 * @param off the offset into buffer where the output should start.
 * @param len the maximum length of the output.
 * @return the number of bytes written to the buffer, 0 if no further
 * output can be produced.  
 * @exception DataFormatException if deflated stream is invalid.
 * @exception IndexOutOfBoundsException if the off and/or len are wrong.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public int inflate(  byte[] buf,  int off,  int len) throws DataFormatException {
    if (len == 0)     return 0;
    if (0 > off || off > off + len || off + len > buf.length)     throw new ArrayIndexOutOfBoundsException();
    int count=0;
    int more;
    do {
      if (mode != DECODE_CHKSUM) {
        more=outputWindow.copyOutput(buf,off,len);
        this.hook33(buf,off,more);
        off+=more;
        count+=more;
        totalOut+=more;
        len-=more;
        if (len == 0)         return count;
      }
    }
 while (decode() || (outputWindow.getAvailable() > 0 && mode != DECODE_CHKSUM));
    return count;
  }

	
  /** 
 * Returns true, if a preset dictionary is needed to inflate the input.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public boolean needsDictionary(){
    return mode == DECODE_DICT && neededBits == 0;
  }

	
  /** 
 * Returns true, if the input buffer is empty.
 * You should then call setInput(). <br>
 * <em>NOTE</em>: This method also returns true when the stream is finished.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public boolean needsInput(){
    return input.needsInput();
  }

	
  /** 
 * Resets the inflater so that a new stream can be decompressed.  All
 * pending input and output will be discarded.
 */
  @featureHouse.FeatureAnnotation (name="Base")
public void reset__before__Adler32Checksum(){
    mode=nowrap ? DECODE_BLOCKS : DECODE_HEADER;
    totalIn=totalOut=0;
    input.reset();
    outputWindow.reset();
    dynHeader=null;
    litlenTree=null;
    distTree=null;
    isLastBlock=false;
  }

	
  /** 
 * Resets the inflater so that a new stream can be decompressed.  All
 * pending input and output will be discarded.
 */
  @featureHouse.FeatureAnnotation(name="Adler32Checksum")
public void  reset__role__Adler32Checksum(){
    reset__before__Adler32Checksum();
    adler.reset();
  }

	
  /** 
 * Resets the inflater so that a new stream can be decompressed.  All
 * pending input and output will be discarded.
 */
   @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=4, thenFeature="Adler32Checksum", elseFeature="Base")
public void
reset() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Adler32Checksum) {
        reset__role__Adler32Checksum();
    } else {
        reset__before__Adler32Checksum();
    }
}



	
  /** 
 * Sets the preset dictionary.  This should only be called, if
 * needsDictionary() returns true and it should set the same
 * dictionary, that was used for deflating.  The getAdler()
 * function returns the checksum of the dictionary needed.
 * @param buffer the dictionary.
 * @exception IllegalStateException if no dictionary is needed.
 * @exception IllegalArgumentException if the dictionary checksum is
 * wrong.  
 */
  @featureHouse.FeatureAnnotation(name="Base")
public void setDictionary(  byte[] buffer){
    setDictionary(buffer,0,buffer.length);
  }

	
  /** 
 * Sets the preset dictionary.  This should only be called, if
 * needsDictionary() returns true and it should set the same
 * dictionary, that was used for deflating.  The getAdler()
 * function returns the checksum of the dictionary needed.
 * @param buffer the dictionary.
 * @param off the offset into buffer where the dictionary starts.
 * @param len the length of the dictionary.
 * @exception IllegalStateException if no dictionary is needed.
 * @exception IllegalArgumentException if the dictionary checksum is
 * wrong.  
 * @exception IndexOutOfBoundsException if the off and/or len are wrong.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public void setDictionary(  byte[] buffer,  int off,  int len){
    if (!needsDictionary())     throw new IllegalStateException();
    this.hook34(buffer,off,len);
    outputWindow.copyDict(buffer,off,len);
    mode=DECODE_BLOCKS;
  }

	
  /** 
 * Sets the input.  This should only be called, if needsInput()
 * returns true.
 * @param buf the input.
 * @exception IllegalStateException if no input is needed.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public void setInput(  byte[] buf){
    setInput(buf,0,buf.length);
  }

	
  /** 
 * Sets the input.  This should only be called, if needsInput()
 * returns true.
 * @param buf the input.
 * @param off the offset into buffer where the input starts.
 * @param len the length of the input.  
 * @exception IllegalStateException if no input is needed.
 * @exception IndexOutOfBoundsException if the off and/or len are wrong.
 */
  @featureHouse.FeatureAnnotation(name="Base")
public void setInput(  byte[] buf,  int off,  int len){
    input.setInput(buf,off,len);
    totalIn+=len;
  }

	
  /** 
 * Decodes the deflate header.
 * @return false if more input is needed. 
 * @exception DataFormatException if header is invalid.
 */
  @featureHouse.FeatureAnnotation(name="Base")
private boolean decodeHeader() throws DataFormatException {
    int header=input.peekBits(16);
    if (header < 0)     return false;
    input.dropBits(16);
    header=((header << 8) | (header >> 8)) & 0xffff;
    if (header % 31 != 0)     throw new DataFormatException("Header checksum illegal");
    if ((header & 0x0f00) != (Deflater.DEFLATED << 8))     throw new DataFormatException("Compression Method unknown");
    if ((header & 0x0020) == 0) {
      mode=DECODE_BLOCKS;
    }
 else {
      mode=DECODE_DICT;
      neededBits=32;
    }
    return true;
  }

	
  /** 
 * Decodes the dictionary checksum after the deflate header.
 * @return false if more input is needed. 
 */
  @featureHouse.FeatureAnnotation(name="Base")
private boolean decodeDict(){
    while (neededBits > 0) {
      int dictByte=input.peekBits(8);
      if (dictByte < 0)       return false;
      input.dropBits(8);
      readAdler=(readAdler << 8) | dictByte;
      neededBits-=8;
    }
    return false;
  }

	
  /** 
 * Decodes the huffman encoded symbols in the input stream.
 * @return false if more input is needed, true if output window is
 * full or the current block ends.
 * @exception DataFormatException if deflated stream is invalid.  
 */
  @featureHouse.FeatureAnnotation(name="Base")
private boolean decodeHuffman() throws DataFormatException {
    int free=outputWindow.getFreeSpace();
    while (free >= 258) {
      int symbol;
switch (mode) {
case DECODE_HUFFMAN:
        while (((symbol=litlenTree.getSymbol(input)) & ~0xff) == 0) {
          outputWindow.write(symbol);
          if (--free < 258)           return true;
        }
      if (symbol < 257) {
        if (symbol < 0)         return false;
 else {
          distTree=null;
          litlenTree=null;
          mode=DECODE_BLOCKS;
          return true;
        }
      }
    try {
      repLength=CPLENS[symbol - 257];
      neededBits=CPLEXT[symbol - 257];
    }
 catch (    ArrayIndexOutOfBoundsException ex) {
      throw new DataFormatException("Illegal rep length code");
    }
case DECODE_HUFFMAN_LENBITS:
  if (neededBits > 0) {
    mode=DECODE_HUFFMAN_LENBITS;
    int i=input.peekBits(neededBits);
    if (i < 0)     return false;
    input.dropBits(neededBits);
    repLength+=i;
  }
mode=DECODE_HUFFMAN_DIST;
case DECODE_HUFFMAN_DIST:
symbol=distTree.getSymbol(input);
if (symbol < 0) return false;
try {
repDist=CPDIST[symbol];
neededBits=CPDEXT[symbol];
}
 catch (ArrayIndexOutOfBoundsException ex) {
throw new DataFormatException("Illegal rep dist code");
}
case DECODE_HUFFMAN_DISTBITS:
if (neededBits > 0) {
mode=DECODE_HUFFMAN_DISTBITS;
int i=input.peekBits(neededBits);
if (i < 0) return false;
input.dropBits(neededBits);
repDist+=i;
}
outputWindow.repeat(repLength,repDist);
free-=repLength;
mode=DECODE_HUFFMAN;
break;
default :
throw new IllegalStateException();
}
}
return true;
}

	
/** 
 * Decodes the adler checksum after the deflate stream.
 * @return false if more input is needed. 
 * @exception DataFormatException if checksum doesn't match.
 */
@featureHouse.FeatureAnnotation(name="Base")
private boolean decodeChksum() throws DataFormatException {
while (neededBits > 0) {
int chkByte=input.peekBits(8);
if (chkByte < 0) return false;
input.dropBits(8);
readAdler=(readAdler << 8) | chkByte;
neededBits-=8;
}
this.hook35();
mode=FINISHED;
return false;
}

	
/** 
 * Decodes the deflated stream.
 * @return false if more input is needed, or if finished. 
 * @exception DataFormatException if deflated stream is invalid.
 */
@featureHouse.FeatureAnnotation(name="Base")
private boolean decode() throws DataFormatException {
switch (mode) {
case DECODE_HEADER:
return decodeHeader();
case DECODE_DICT:
return decodeDict();
case DECODE_CHKSUM:
return decodeChksum();
case DECODE_BLOCKS:
if (isLastBlock) {
if (nowrap) {
mode=FINISHED;
return false;
}
 else {
input.skipToByteBoundary();
neededBits=32;
mode=DECODE_CHKSUM;
return true;
}
}
int type=input.peekBits(3);
if (type < 0) return false;
input.dropBits(3);
if ((type & 1) != 0) isLastBlock=true;
switch (type >> 1) {
case DeflaterConstants.STORED_BLOCK:
input.skipToByteBoundary();
mode=DECODE_STORED_LEN1;
break;
case DeflaterConstants.STATIC_TREES:
litlenTree=InflaterHuffmanTree.defLitLenTree;
distTree=InflaterHuffmanTree.defDistTree;
mode=DECODE_HUFFMAN;
break;
case DeflaterConstants.DYN_TREES:
dynHeader=new InflaterDynHeader();
mode=DECODE_DYN_HEADER;
break;
default :
throw new DataFormatException("Unknown block type " + type);
}
return true;
case DECODE_STORED_LEN1:
{
if ((uncomprLen=input.peekBits(16)) < 0) return false;
input.dropBits(16);
mode=DECODE_STORED_LEN2;
}
case DECODE_STORED_LEN2:
{
int nlen=input.peekBits(16);
if (nlen < 0) return false;
input.dropBits(16);
if (nlen != (uncomprLen ^ 0xffff)) throw new DataFormatException("broken uncompressed block");
mode=DECODE_STORED;
}
case DECODE_STORED:
{
int more=outputWindow.copyStored(input,uncomprLen);
uncomprLen-=more;
if (uncomprLen == 0) {
mode=DECODE_BLOCKS;
return true;
}
return !input.needsInput();
}
case DECODE_DYN_HEADER:
if (!dynHeader.decode(input)) return false;
litlenTree=dynHeader.buildLitLenTree();
distTree=dynHeader.buildDistTree();
mode=DECODE_HUFFMAN;
case DECODE_HUFFMAN:
case DECODE_HUFFMAN_LENBITS:
case DECODE_HUFFMAN_DIST:
case DECODE_HUFFMAN_DISTBITS:
return decodeHuffman();
case FINISHED:
return false;
default :
throw new IllegalStateException();
}
}

	
@featureHouse.FeatureAnnotation (name="Base")
protected void hook32__before__Adler32Checksum(){
}

	
@featureHouse.FeatureAnnotation(name="Adler32Checksum")
protected void  hook32__role__Adler32Checksum(){
    this.adler=new Adler32();
    hook32__before__Adler32Checksum();
  }

	
   @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=5, thenFeature="Adler32Checksum", elseFeature="Base")
protected void
hook32() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Adler32Checksum) {
        hook32__role__Adler32Checksum();
    } else {
        hook32__before__Adler32Checksum();
    }
}



	
@featureHouse.FeatureAnnotation (name="Base")
protected void hook33__before__Adler32Checksum(byte[] buf,int off,int more) throws DataFormatException {
}

	
@featureHouse.FeatureAnnotation(name="Adler32Checksum")
protected void  hook33__role__Adler32Checksum(  byte[] buf,  int off,  int more) throws DataFormatException {
    adler.update(buf,off,more);
    hook33__before__Adler32Checksum(buf,off,more);
  }

	
   @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=6, thenFeature="Adler32Checksum", elseFeature="Base")
protected void
hook33(byte[] buf,int off,int more) throws DataFormatException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Adler32Checksum) {
        hook33__role__Adler32Checksum(buf, off, more);
    } else {
        hook33__before__Adler32Checksum(buf, off, more);
    }
}



	
@featureHouse.FeatureAnnotation (name="Base")
protected void hook34__before__Adler32Checksum(byte[] buffer,int off,int len){
}

	
@featureHouse.FeatureAnnotation(name="Adler32Checksum")
protected void  hook34__role__Adler32Checksum(  byte[] buffer,  int off,  int len){
    adler.update(buffer,off,len);
    if ((int)adler.getValue() != readAdler)     throw new IllegalArgumentException("Wrong adler checksum");
    adler.reset();
    hook34__before__Adler32Checksum(buffer,off,len);
  }

	
   @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=7, thenFeature="Adler32Checksum", elseFeature="Base")
protected void
hook34(byte[] buffer,int off,int len) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Adler32Checksum) {
        hook34__role__Adler32Checksum(buffer, off, len);
    } else {
        hook34__before__Adler32Checksum(buffer, off, len);
    }
}



	
@featureHouse.FeatureAnnotation (name="Base")
protected void hook35__before__Adler32Checksum() throws DataFormatException {
}

	
@featureHouse.FeatureAnnotation(name="Adler32Checksum")
protected void  hook35__role__Adler32Checksum() throws DataFormatException {
    if ((int)adler.getValue() != readAdler)     throw new DataFormatException("Adler chksum doesn't match: " + Integer.toHexString((int)adler.getValue()) + " vs. "+ Integer.toHexString(readAdler));
    hook35__before__Adler32Checksum();
  }

	
   @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=8, thenFeature="Adler32Checksum", elseFeature="Base")
protected void
hook35() throws DataFormatException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Adler32Checksum) {
        hook35__role__Adler32Checksum();
    } else {
        hook35__before__Adler32Checksum();
    }
}



	
  private Adler32 adler;

	
  /** 
 * Gets the adler checksum.  This is either the checksum of all
 * uncompressed bytes returned by inflate(), or if needsDictionary()
 * returns true (and thus no output was yet produced) this is the
 * adler checksum of the expected dictionary.
 * @return the adler checksum.
 */
   @featureHouse.FeatureAnnotation(name="Adler32Checksum")
public int getAdler(){
    return needsDictionary() ? readAdler : (int)adler.getValue();
  }


}
