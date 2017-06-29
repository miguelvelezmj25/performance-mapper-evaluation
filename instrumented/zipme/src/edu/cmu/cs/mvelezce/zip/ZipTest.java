package edu.cmu.cs.mvelezce.zip;

import edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation;
import edu.cmu.cs.mvelezce.zip.featureHouse.FeatureSwitchID;
import edu.cmu.cs.mvelezce.zip.zipme.*;

import java.io.*;
import java.util.ArrayList;

import static edu.cmu.cs.mvelezce.zip.ZipMain.FEATUREGZIP;

//import edu.cmu.cs.mvelezce.zip.zipme.GZIPInputStream;
//import edu.cmu.cs.mvelezce.zip.zipme.GZIPOutputStream;

public class ZipTest {

    //private static File fileToZip = new File("/home/rhein/ZipMeTestDir","master-thesis-rhein.pdf");
    public static File fileToZip = new File("/home/rhein/ZipMeTestDir", "hallo.txt");


    @FeatureAnnotation(name = "ZipMeTest")
    private static DeflaterOutputStream getZipOutStream__before__GZIP(OutputStream out, File forFile) throws IOException {
        //return new GZIPOutputStream(out);
        ZipOutputStream zos = new ZipOutputStream(out);
        //zos.putNextEntry((new ZipEntry(forFile.getPath())));
        zos.putNextEntry((new ZipEntry("/some/dir/hallo.txt")));
        return zos;

    }


    @FeatureAnnotation(name = "GZIP")
    private static DeflaterOutputStream getZipOutStream__role__GZIP(OutputStream out, File forFile) throws IOException {
        return new GZIPOutputStream(out);
		/*
		ZipOutputStream zos = new ZipOutputStream(out);
		zos.putNextEntry((new ZipEntry(forFile.getPath())));
		return zos;*/

    }


    @FeatureAnnotation(name = "featureSwitch")
    @FeatureSwitchID(id = 1, thenFeature = "GZIP", elseFeature = "ZipMeTest")
    private static DeflaterOutputStream
    getZipOutStream(OutputStream out, File forFile) throws IOException {
        if (FEATUREGZIP) {
            return getZipOutStream__role__GZIP(out, forFile);
        }
        else {
            return getZipOutStream__before__GZIP(out, forFile);
        }
    }


    @FeatureAnnotation(name = "ZipMeTest")
    private static InflaterInputStream getZipInStream__before__GZIP(InputStream in) throws IOException {
        //return new GZIPInputStream(in);
        ZipInputStream zi = new ZipInputStream(in);
        ZipEntry entry = zi.getNextEntry();
        if (entry != null) {
            //System.out.println("opening entry: " + entry.getName());
        }
        else {
            throw new IOException("zip archive stream does not contain an entry.");
        }
        return zi;
    }


    @FeatureAnnotation(name = "GZIP")
    private static InflaterInputStream getZipInStream__role__GZIP(InputStream in) throws IOException {
        return new GZIPInputStream(in);
        //return new ZipInputStream(in);
    }


    @FeatureAnnotation(name = "featureSwitch")
    @FeatureSwitchID(id = 2, thenFeature = "GZIP", elseFeature = "ZipMeTest")
    private static InflaterInputStream
    getZipInStream(InputStream in) throws IOException {
        if (FEATUREGZIP) {
            return getZipInStream__role__GZIP(in);
        }
        else {
            return getZipInStream__before__GZIP(in);
        }
    }


    @FeatureAnnotation(name = "ZipMeTest")
    public static void main(String[] argv) throws IOException {
        String message = "Hallo\n";
        if (argv.length > 0) {
            message = argv[0];
        }
        final ArrayList<Integer> fileBuffer = new ArrayList<Integer>(5000);
        {
            // zip
            FileInputStream inStream1 = new FileInputStream(fileToZip);
            //InputStream inStream1 = new ByteArrayInputStream(message.getBytes());
            DeflaterOutputStream outStream1 =
                    getZipOutStream(new OutputStream() {
                        @Override
                        public void write(int arg0) throws IOException {
                            fileBuffer.add(arg0 & 0xff);
                        }

                        @Override
                        public void write(byte[] b) throws IOException {
                            for (int i = 0; i < b.length; i++) {
                                int input = b[i];
                                input = input & 0xff;
                                fileBuffer.add(input);
                            }
                        }
                    }, fileToZip);
            byte[] buffer1 = new byte[0xFFFF];
            for (int len; (len = inStream1.read(buffer1)) != -1; ) {
                outStream1.write(buffer1, 0, len);
            }
            inStream1.close();
            outStream1.close();
        }
        //System.out.println("read " + fileBuffer.size() + " bytes");
        {
            //unzip
            InflaterInputStream inStream2 = getZipInStream(new InputStream() {
                int index = 0;

                @Override
                public int read() throws IOException {
                    if (index < fileBuffer.size()) {
                        int b = fileBuffer.get(index);
                        //System.out.println("index = " + index + " read byte " + b);
                        index++;
                        return b;
                    }
                    else {
                        return 0;
                    }
                }
            });
            //System.out.println("before reading");
            String contents = "";
            byte[] buffer2 = new byte[0xFFFF];
            for (int len; (len = inStream2.read(buffer2)) != -1; ) {

                contents += new String(buffer2, 0, len);
            }
            //System.out.print("read contents: " + contents);
            System.out.println(message);
            assert (contents.equals(message));
            //System.out.println("after reading");
            inStream2.close();
        }
    }


}
