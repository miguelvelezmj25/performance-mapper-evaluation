package com.googlecode.pngtastic;

import com.googlecode.pngtastic.core.PngException;
import com.googlecode.pngtastic.core.PngImage;
import com.googlecode.pngtastic.core.PngOptimizer;
import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Optimizes PNG images to reduce filesize
 *
 * @author rayvanderborght
 * @see <a href="http://www.w3.org/TR/PNG">PNG spec</a>
 * @see <a href="http://optipng.sourceforge.net/pngtech/">PNG related articles</a>
 * @see <a href="http://www.schaik.com/pngsuite/">PNG reference images</a>
 */
public class PngtasticOptimizer {

    public static boolean REMOVEGAMMA;
    public static boolean COMPRESSIONLEVEL;
    public static boolean COMPRESSOR;
    public static boolean ITERATIONS;
    public static boolean LOGLEVEL;

    /** */
    private static final String HELP = "java -cp pngtastic-x.x.jar com.googlecode.pngtastic.PngtasticOptimizer [options] file1 [file2 ..]\n"
            + "Options:\n"
            + "  --toDir            the directory where optimized files go (will be created if it doesn't exist)\n"
            + "  --fileSuffix       string appended to the optimized files (file.png can become file.png.optimized.png)\n"
            + "  --removeGamma      remove gamma correction info if found\n"
            + "  --compressionLevel the compression level; 0-9 allowed (default is to try them all by brute force)\n"
            + "  --compressor       path to an alternate compressor (e.g. zopfli)\n"
            + "  --iterations       number of compression iterations (useful for zopfli)\n"
            + "  --logLevel         the level of logging output (none, debug, info, or error)\n";

    /** */
//    public PngtasticOptimizer(String toDir, String[] fileNames, String fileSuffix, Boolean removeGamma,
//                              Integer compressionLevel, String compressor, Integer iterations, String logLevel) {
//
//        long start = System.currentTimeMillis();
//
//        PngOptimizer optimizer = new PngOptimizer(logLevel);
//
//        Sink.getDecision(compressor == null);
//        Sink.getDecision(iterations == 0);
//
//        optimizer.setCompressor(compressor, iterations);
//
//        for(String file : fileNames) {
//            try {
//                String outputPath = toDir + "/" + file;
//                makeDirs(outputPath.substring(0, outputPath.lastIndexOf('/')));
//
//                PngImage image = new PngImage(file, logLevel);
//                optimizer.optimize(image, outputPath + fileSuffix, removeGamma, compressionLevel);
//
//            } catch (PngException | IOException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(String.format("Processed %d files in %d milliseconds, saving %d bytes", optimizer.getResults().size(), System.currentTimeMillis() - start, optimizer.getTotalSavings()));
//    }

    public PngtasticOptimizer(String toDir, String[] fileNames, String fileSuffix, Boolean removeGamma,
                              Integer compressionLevel, String compressor, Integer iterations, String logLevel, String s) {

        long start = System.currentTimeMillis();

        PngOptimizer optimizer = new PngOptimizer(logLevel);

        Sink.getDecision(compressor == null);
        Sink.getDecision(iterations == 0);

        optimizer.setCompressor(compressor, iterations);

        for(String file : fileNames) {
            try {
                String outputPath = toDir + "/" + file;
                makeDirs(outputPath.substring(0, outputPath.lastIndexOf('/')));

                PngImage image = new PngImage(file, logLevel);
                optimizer.optimize(image, outputPath + fileSuffix, removeGamma, compressionLevel);

            } catch (PngException | IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Processed %d files in %d milliseconds, saving %d bytes", optimizer.getResults().size(), System.currentTimeMillis() - start, optimizer.getTotalSavings()));
    }

    /** */
    public static void main(String[] args) {
        Map<String, String> options = new HashMap<>();
        int last = 0;
        for(int i = 0; i < args.length; i++) {
            String arg = args[i];
            if(Sink.getDecision1(arg.startsWith("--"))) {
                int next = i + 1;
                if(Sink.getDecision1(next < args.length)) {
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
        files[0] = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/instrumented/pngtastic/images/optimizer/1px.png";

        if(Sink.getDecision1(files.length == 0)) {
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

        REMOVEGAMMA = Source.getOptionREMOVEGAMMA(Boolean.valueOf(args[0]));
        COMPRESSIONLEVEL = Source.getOptionCOMPRESSIONLEVEL(Boolean.valueOf(args[1]));
        COMPRESSOR = Source.getOptionCOMPRESSOR(Boolean.valueOf(args[2]));
        ITERATIONS = Source.getOptionITERATIONS(Boolean.valueOf(args[3]));
        LOGLEVEL = Source.getOptionLOGLEVEL(Boolean.valueOf(args[4]));

//        REMOVEGAMMA = Source.getOptionREMOVEGAMMA(true);
//        COMPRESSIONLEVEL = Source.getOptionCOMPRESSIONLEVEL(true);
//        COMPRESSOR = Source.getOptionCOMPRESSOR(true);
//        ITERATIONS = Source.getOptionITERATIONS(true);
//        LOGLEVEL = Source.getOptionLOGLEVEL(true);

        Boolean removeGamma;
        Integer compressionLevel;
        String logLevel;
        String compressor;
        Integer iterations;

        if(Sink.getDecision1(REMOVEGAMMA)) {
            removeGamma = true;
        }
        else {
            removeGamma = false;
        }

        if(Sink.getDecision1(COMPRESSIONLEVEL)) {
            compressionLevel = 9;
        }
        else {
            compressionLevel = 0;
        }

        if(Sink.getDecision1(COMPRESSOR)) {
            compressor = "zopfli";
        }
        else {
            compressor = "none";
        }

        if(Sink.getDecision1(ITERATIONS)) {
            iterations = 10;
        }
        else {
            iterations = 0;
        }

        if(Sink.getDecision1(LOGLEVEL)) {
            logLevel = "debug";
        }
        else {
            logLevel = "none";
        }

        Sink.getDecision(compressor == null);
        Sink.getDecision(iterations == 0);

        new PngtasticOptimizer(toDir, files, fileSuffix, removeGamma, compressionLevel, compressor, iterations, logLevel, "");
    }

    /* */
    private static Integer safeInteger(String input) {
        try {
            return Integer.valueOf(input);
        } catch (Exception e) {
            return null;
        }
    }

    /* */
    private String makeDirs(String path) throws IOException {
        File out = new File(path);
        if(Sink.getDecision1(!out.exists())) {
            if(Sink.getDecision1(!out.mkdirs())) {
                throw new IOException("Couldn't create path: " + path);
            }
        }
        return out.getCanonicalPath();
    }
}
