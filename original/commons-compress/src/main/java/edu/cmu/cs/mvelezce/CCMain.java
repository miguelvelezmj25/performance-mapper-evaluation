package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipParameters;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;
import org.apache.commons.compress.utils.IOUtils;

import java.io.*;
import java.util.zip.Deflater;

public class CCMain {

//    public static void main(String[] args) throws FileNotFoundException {
//        File output = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/commons-compress/src/main/resources/output/bla.tar");
//        File file1 = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/commons-compress/src/test/resources/test1.xml");
//        OutputStream out = new FileOutputStream(output);
//
//
//
//        ArchiveOutputStream os = new ArchiveStreamFactory().createArchiveOutputStream("tar", out);
//        TarArchiveEntry entry = new TarArchiveEntry("testdata/test1.xml");
//        entry.setModTime(0);
//        entry.setSize(file1.length());
//        entry.setUserId(0);
//        entry.setGroupId(0);
//        entry.setUserName("avalon");
//        entry.setGroupName("excalibur");
//        entry.setMode(0100000);
//        os.putArchiveEntry(entry);
//        IOUtils.copy(new FileInputStream(file1), os);
//        os.closeArchiveEntry();
//        os.close();
//    }


    private static boolean GZIPCOMPRESSOR;
    private static boolean DECOMPRESSUNTILEOF;
    private static boolean MEMORYLIMITINKB;
    private static boolean GZIPBESTCOMPRESSION;
    private static boolean XZBESTPRESET;

    public static void main(String[] args) throws IOException, ArchiveException, CompressorException {
        GZIPCOMPRESSOR = Source.getOptionGZIPCOMPRESSOR(true);
        DECOMPRESSUNTILEOF = Source.getOptionDECOMPRESSUNTILEOF(true);
        MEMORYLIMITINKB = Source.getOptionMEMORYLIMITINKB(true);
        GZIPBESTCOMPRESSION = Source.getOptionGZIPBESTCOMPRESSION(true);
        XZBESTPRESET = Source.getOptionXZBESTPRESET(true);

        String compressor;
        boolean decompressConcatenated = false;
        int memoryLimitInKb = -1;
        int deflater = Deflater.BEST_SPEED;
        int preset = 0;

        File input = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/commons-compress/src/main/resources/output/bla.tar");
        File output = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/commons-compress/src/main/resources/output/");

        if(DECOMPRESSUNTILEOF) {
            decompressConcatenated = true;
        }

        if(MEMORYLIMITINKB) {
            memoryLimitInKb = 10_000;
        }

        if(GZIPBESTCOMPRESSION) {
            deflater = Deflater.BEST_COMPRESSION;
        }

        if(XZBESTPRESET) {
            preset = 5;
        }

        OutputStream cos;
        OutputStream out;

        if(GZIPCOMPRESSOR) {
//            compressor = "gz";
            output = new File(output, "bla.tar.gz");
            GzipParameters parameters = new GzipParameters();
            parameters.setCompressionLevel(deflater);
            out = new FileOutputStream(output);
            cos = new GzipCompressorOutputStream(out, parameters);

        }
        else {
//            compressor = "xz";
            output = new File(output, "bla.tar.xz");
            out = new FileOutputStream(output);
            cos = new XZCompressorOutputStream(out, preset);
        }

        IOUtils.copy(new FileInputStream(input), cos);
        out.flush();
        out.close();


////        CompressorOutputStream cos = new CompressorStreamFactory(decompressConcatenated, memoryLimitInKb).createCompressorOutputStream(compressor, out);
//        IOUtils.copy(new FileInputStream(input), cos);
//        out.flush();
//        out.close();


//        GZIPCOMPRESSOR = Source.getOptionGZIPCOMPRESSOR(true);
//        DECOMPRESSUNTILEOF = Source.getOptionDECOMPRESSUNTILEOF(true);
//        MEMORYLIMITINKB = Source.getOptionMEMORYLIMITINKB(true);
//
//        String compressor;
//        boolean decompressConcatenated = false;
//        int memoryLimitInKb = -1;
//
//        File input = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/commons-compress/src/test/resources/");
//        File output = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/commons-compress/src/main/resources/output/bla.tar");
//
//        if(DECOMPRESSUNTILEOF) {
//            decompressConcatenated = true;
//        }
//
//        if(MEMORYLIMITINKB) {
//            memoryLimitInKb = 10_000;
//        }
//
//        if(GZIPCOMPRESSOR) {
//            compressor = "gz";
//            input = new File(input, "bla.tgz");
//        }
//        else {
//            compressor = "xz";
//            input = new File(input, "bla.tar.xz");
//        }
//
//        InputStream is = new FileInputStream(input);
//        CompressorInputStream in = new CompressorStreamFactory(decompressConcatenated, memoryLimitInKb).createCompressorInputStream(compressor, is);
//        FileOutputStream os = new FileOutputStream(output);
//        IOUtils.copy(in, os);
//        is.close();
//        os.close();
    }
}
