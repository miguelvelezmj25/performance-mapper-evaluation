package kanzi;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import kanzi.app.BlockCompressor;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Run {

    public static boolean VERBOSE;
    public static boolean FORCE;
    public static boolean BLOCKSIZE;
    public static boolean LEVEL;
    public static boolean ENTROPY;
    public static boolean TRANSFORM;
    public static boolean CHECKSUM;

    private Stack<String> stack;
    private Set<String> options;

    public Run(Stack<String> stack) {
        this.stack = stack;
        this.options = new HashSet<>(stack);
    }

    public void push(String option) {
        if(this.options.contains(option)) {
            return;
        }

        this.stack.push(option);
        this.options.add(option);
    }

    public static void main(String[] args) throws IOException {
//        System.out.println("Original");
//        Sink.init();
//
//        String dir = System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/splat/kanzi/src/main/resources/rt.knz";
//        File output = new File(dir);
//
//        if(output.exists()) {
//            System.out.println("Deleting " + output);
//            FileUtils.forceDelete(output);
//        }
//
//        VERBOSE = Source.getOptionVERBOSE(Boolean.valueOf(args[0]));
//        FORCE = Source.getOptionFORCE(Boolean.valueOf(args[1]));
//        BLOCKSIZE = Source.getOptionBLOCKSIZE(Boolean.valueOf(args[2]));
//        LEVEL = Source.getOptionLEVEL(Boolean.valueOf(args[3]));
//        ENTROPY = Source.getOptionENTROPY(Boolean.valueOf(args[4]));
//        TRANSFORM = Source.getOptionTRANSFORM(Boolean.valueOf(args[5]));
//        CHECKSUM = Source.getOptionCHECKSUM(Boolean.valueOf(args[6]));
//
////        VERBOSE = Source.getOptionVERBOSE(true);
////        FORCE = Source.getOptionFORCE(true);
////        BLOCKSIZE = Source.getOptionBLOCKSIZE(true);
////        LEVEL = Source.getOptionLEVEL(false);
////        ENTROPY = Source.getOptionENTROPY(true);
////        TRANSFORM = Source.getOptionTRANSFORM(true);
////        CHECKSUM = Source.getOptionCHECKSUM(true);
//
//        int verbose = 0;
//        boolean force = FORCE;
//        int blockSize = 1024 * 1024;
//        int level = 1;
//        String entropy = "Huffman";
//        String transform = "BWT+MTFT+ZRLT";
//        boolean checksum = CHECKSUM;
//
//        if(VERBOSE) {
//            verbose = 4;
//        }
//
////        if(FORCE) {
////            force = true;
////        }
//
//        if(BLOCKSIZE) {
//            blockSize = 1024 * 1024 * 1024;
//        }
//
//        if(LEVEL) {
//            level = 5;
//        }
//
//        if(ENTROPY) {
//            entropy = "PAQ";
//        }
//
//        if(TRANSFORM) {
//            transform = "LZ4";
//        }
//
////        if(CHECKSUM) {
////            checksum = true;
////        }
//
//        Map<String, Object> map = new HashMap<>();
//        map.put("inputName", System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/splat/kanzi/src/main/resources/rt.jar");
//        map.put("outputName", System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/splat/kanzi/src/main/resources/rt.knz");
//
//        BlockCompressor bc = null;
//
//        try {
//            bc = new BlockCompressor(verbose, force, blockSize, level, entropy, transform, checksum, 1, map, null);
//        } catch(Exception e) {
//            System.err.println("Could not create the compressor: " + e.getMessage());
//            System.exit(kanzi.io.Error.ERR_CREATE_COMPRESSOR);
//        }
//
//        int code = bc.call();
//
//        if(code != 0) {
//            bc.dispose();
//        }
//
////        System.exit(code);
    }

    public static Stack<String> splat(String[] args, Stack<String> stack) throws IOException {
        System.out.println("Original");
        Sink.init();

        String dir = System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/splat/kanzi/src/main/resources/rt.knz";
        File output = new File(dir);

        if(output.exists()) {
            System.out.println("Deleting " + output);
            FileUtils.forceDelete(output);
        }

//        VERBOSE = Source.getOptionVERBOSE(Boolean.valueOf(args[0]));
//        FORCE = Source.getOptionFORCE(Boolean.valueOf(args[1]));
//        BLOCKSIZE = Source.getOptionBLOCKSIZE(Boolean.valueOf(args[2]));
//        LEVEL = Source.getOptionLEVEL(Boolean.valueOf(args[3]));
//        ENTROPY = Source.getOptionENTROPY(Boolean.valueOf(args[4]));
//        TRANSFORM = Source.getOptionTRANSFORM(Boolean.valueOf(args[5]));
//        CHECKSUM = Source.getOptionCHECKSUM(Boolean.valueOf(args[6]));

//        VERBOSE = Source.getOptionVERBOSE(true);
//        FORCE = Source.getOptionFORCE(true);
//        BLOCKSIZE = Source.getOptionBLOCKSIZE(true);
//        LEVEL = Source.getOptionLEVEL(false);
//        ENTROPY = Source.getOptionENTROPY(true);
//        TRANSFORM = Source.getOptionTRANSFORM(true);
//        CHECKSUM = Source.getOptionCHECKSUM(true);

        Run run = new Run(stack);

        IntSupplier verbose = () -> run.getOptionVERBOSE(Boolean.valueOf(args[0]));
        BooleanSupplier force = () -> run.getOptionFORCE(Boolean.valueOf(args[1]));
        IntSupplier blockSize = () -> run.getOptionBLOCKSIZE(Boolean.valueOf(args[2]));
        IntSupplier level = () -> run.getOptionLEVEL(Boolean.valueOf(args[3]));
        Supplier<String> entropy = () -> run.getOptionENTROPY(Boolean.valueOf(args[4]));
        Supplier<String> transform = () -> run.getOptionTRANSFORM(Boolean.valueOf(args[5]));
        BooleanSupplier checksum = () -> run.getOptionCHECKSUM(Boolean.valueOf(args[6]));

//        if(CHECKSUM) {
//            checksum = true;
//        }

        Map<String, Object> map = new HashMap<>();
        map.put("inputName", System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/splat/kanzi/src/main/resources/rt.jar");
        map.put("outputName", System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/splat/kanzi/src/main/resources/rt.knz");

        BlockCompressor bc = null;

        try {
            bc = new BlockCompressor(verbose, force, blockSize, level, entropy, transform, checksum, 1, map, null);
        } catch(Exception e) {
            System.err.println("Could not create the compressor: " + e.getMessage());
            System.exit(kanzi.io.Error.ERR_CREATE_COMPRESSOR);
        }

        int code = bc.call();

        if(code != 0) {
            bc.dispose();
        }

        return stack;
//        System.exit(code);
    }

    private int getOptionVERBOSE(boolean option) {
        this.push("VERBOSE");

        if(option) {
            return 4;
        }

        return 0;
    }

    private boolean getOptionFORCE(boolean option) {
        this.push("FORCE");

        return option;
    }

    private int getOptionBLOCKSIZE(boolean option) {
        this.push("BLOCKSIZE");

        if(option) {
            return 1024 * 1024 * 1024;
        }

        return 1024 * 1024;
    }

    private int getOptionLEVEL(boolean option) {
        this.push("LEVEL");

        if(option) {
            return 5;
        }

        return 1;
    }

    private String getOptionENTROPY(boolean option) {
        this.push("ENTROPY");

        if(option) {
            return "PAQ";
        }

        return "Huffman";
    }

    private String getOptionTRANSFORM(boolean option) {
        this.push("TRANSFORM");

        if(option) {
            return "LZ4";
        }

        return "BWT+MTFT+ZRLT";
    }

    private boolean getOptionCHECKSUM(boolean option) {
        this.push("CHECKSUM");

        return option;
    }


}
