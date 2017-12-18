package kanzi;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import kanzi.app.BlockCompressor;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Run {

    public static boolean VERBOSE;
    public static boolean FORCE;
    public static boolean BLOCKSIZE;
    public static boolean LEVEL;
    public static boolean ENTROPY;
    public static boolean TRANSFORM;
    public static boolean CHECKSUM;

    public static void main(String[] args) throws IOException {
        System.out.println("Instrument");
        Sink.init();

        String dir = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/instrumented/kanzi/src/main/resources/rt.knz";
        File output = new File(dir);

        if(output.exists()) {
            FileUtils.forceDelete(output);
        }

        VERBOSE = Source.getOptionVERBOSE(Boolean.valueOf(args[0]));
        FORCE = Source.getOptionFORCE(Boolean.valueOf(args[1]));
        BLOCKSIZE = Source.getOptionBLOCKSIZE(Boolean.valueOf(args[2]));
        LEVEL = Source.getOptionLEVEL(Boolean.valueOf(args[3]));
        ENTROPY = Source.getOptionENTROPY(Boolean.valueOf(args[4]));
        TRANSFORM = Source.getOptionTRANSFORM(Boolean.valueOf(args[5]));
        CHECKSUM = Source.getOptionCHECKSUM(Boolean.valueOf(args[6]));

//        VERBOSE = Source.getOptionVERBOSE(true);
//        FORCE = Source.getOptionFORCE(false);
//        BLOCKSIZE = Source.getOptionBLOCKSIZE(false);
//        LEVEL = Source.getOptionLEVEL(true);
//        ENTROPY = Source.getOptionENTROPY(false);
//        TRANSFORM = Source.getOptionTRANSFORM(false);
//        CHECKSUM = Source.getOptionCHECKSUM(false);

        int verbose = 0;
        boolean force = false;
        int blockSize = 1024 * 1024;
        int level = 0;
        String entropy = "Huffman";
        String transform = "BWT+MTFT+ZRLT";
        boolean checksum = false;

        if(VERBOSE) {
            verbose = 4;
        }

        if(FORCE) {
            force = true;
        }

        if(BLOCKSIZE) {
            blockSize = 1024 * 1024 * 1024;
        }

        if(LEVEL) {
            level = 5;
        }

        if(ENTROPY) {
            entropy = "PAQ";
        }

        if(TRANSFORM) {
            transform = "LZ4";
        }

        if(CHECKSUM) {
            checksum = true;
        }

        Map<String, Object> map = new HashMap<>();
        map.put("inputName", "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/instrumented/kanzi/src/main/resources/rt.jar");
        map.put("outputName", "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/instrumented/kanzi/src/main/resources/rt.knz");

        BlockCompressor bc = null;

        try {
            bc = new BlockCompressor(verbose, force, blockSize, level, entropy, transform, checksum, 1, map, null);
        } catch (Exception e) {
            System.err.println("Could not create the compressor: " + e.getMessage());
            System.exit(kanzi.io.Error.ERR_CREATE_COMPRESSOR);
        }

        int code = bc.call();

        if(code != 0) {
            bc.dispose();
        }

//        System.exit(code);
    }


}