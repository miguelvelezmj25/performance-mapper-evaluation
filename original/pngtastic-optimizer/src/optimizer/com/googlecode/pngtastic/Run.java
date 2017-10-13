package optimizer.com.googlecode.pngtastic;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Run {

    /** */
    private static final String HELP = "java -cp pngtastic-x.x.jar optimizer.com.googlecode.pngtastic.PngtasticOptimizer [options] file1 [file2 ..]\n"
            + "Options:\n"
            + "  --toDir            the directory where optimized files go (will be created if it doesn't exist)\n"
            + "  --fileSuffix       string appended to the optimized files (file.png can become file.png.optimized.png)\n"
            + "  --removeGamma      remove gamma correction info if found\n"
            + "  --compressionLevel the compression level; 0-9 allowed (default is to try them all by brute force)\n"
            + "  --compressor       path to an alternate compressor (e.g. zopfli)\n"
            + "  --iterations       number of compression iterations (useful for zopfli)\n"
            + "  --logLevel         the level of logging output (none, debug, info, or error)\n";
    public static boolean REMOVEGAMMA;
    public static boolean COMPRESSIONLEVEL;
    public static boolean COMPRESSOR;
    public static boolean ITERATIONS;
    public static boolean LOGLEVEL;

    /** */

    public static void main(String[] args) {
        System.out.println("Original");
        Sink.init();

        Map<String, String> options = new HashMap<>();
        int last = 0;
        for(int i = 0; i < args.length; i++) {
            String arg = args[i];
            if(arg.startsWith("--")) {
                int next = i + 1;
                if(next < args.length) {
                    options.put(arg, args[next]);
                    last = next + 1;
                }
                else {
                    options.put(arg, null);
                    last = next;
                }
            }
        }
        String[] files = Arrays.copyOfRange(args, last, args.length);
        files = new String[1];
        files[0] = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic-optimizer/images/optimizer/car.png";
//        files[0] = "/home/mvelezce/programming/java/projects/systems/orignal/pngtastic-optimizer/images/optimizer/lena.png";

        if(files.length == 0) {
            System.out.println("No files to process");
            System.out.println(HELP);
            return;
        }

        String toDir = (options.get("--toDir") == null) ? "." : options.get("--toDir");
        String fileSuffix = (options.get("--fileSuffix") == null) ? "" : options.get("--fileSuffix");
//        Boolean removeGamma = Boolean.valueOf(options.get("--removeGamma"));
//        Integer compressionLevel = safeInteger(options.get("--compressionLevel"));
//        String logLevel = options.get("--logLevel");
//        String compressor = options.get("--compressor");
//        Integer iterations = safeInteger(options.get("--iterations"));

//        REMOVEGAMMA = Source.getOptionREMOVEGAMMA(Boolean.valueOf(args[0]));
//        COMPRESSIONLEVEL = Source.getOptionCOMPRESSIONLEVEL(Boolean.valueOf(args[1]));
//        COMPRESSOR = Source.getOptionCOMPRESSOR(Boolean.valueOf(args[2]));
//        ITERATIONS = Source.getOptionITERATIONS(Boolean.valueOf(args[3]));
//        LOGLEVEL = Source.getOptionLOGLEVEL(Boolean.valueOf(args[4]));

        REMOVEGAMMA = Source.getOptionREMOVEGAMMA(false);
        COMPRESSIONLEVEL = Source.getOptionCOMPRESSIONLEVEL(false);
        COMPRESSOR = Source.getOptionCOMPRESSOR(true);
        ITERATIONS = Source.getOptionITERATIONS(false);
        LOGLEVEL = Source.getOptionLOGLEVEL(false);

        Boolean removeGamma = false;
        Integer compressionLevel = 0;
        String logLevel = "none";
        String compressor = "none";
        Integer iterations = 1;

        if(REMOVEGAMMA) {
            removeGamma = true;
        }

        if(COMPRESSIONLEVEL) {
            compressionLevel = 9;
        }

        if(COMPRESSOR) {
            compressor = "zopfli";
        }

        if(ITERATIONS) {
            iterations = 32;
        }

        if(LOGLEVEL) {
            logLevel = "debug";
        }

        new PngtasticOptimizer(toDir, files, fileSuffix, removeGamma, compressionLevel, compressor, iterations, logLevel);
    }

}
