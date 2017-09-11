package com.googlecode.pngtastic;

import com.googlecode.pngtastic.core.PngColorCounter;
import com.googlecode.pngtastic.core.PngException;
import com.googlecode.pngtastic.core.PngImage;
import edu.cmu.cs.mvelezce.analysis.option.Sink;

import java.io.IOException;

/**
 * Gives a count of colors in a given image
 *
 * @author rayvanderborght
 */
public class PngtasticColorCounter {
    /** */
    private static final String HELP = "java -jar pngtastic-x.x.jar com.googlecode.pngtastic.PngtasticColorCounter [options] file1 [file2 ..]\n"
            + "Options:\n"
            + "  --distThreshold    the distance below which two colors are considered similar (0.0 to 1.0)\n"
            + "  --freqThreshold    the percentage a color must be represented in the overall image (0.0 to 1.0)\n"
            + "  --minAlpha         the minimum alpha channel value a pixel must have\n"
            + "  --timeout          the number of milliseconds after which color counting will be aborted\n"
            + "  --logLevel         the level of logging output (none, debug, info, or error)\n";

    /** */


    public static boolean FREQTHRESHOLD;
    public static boolean DISTTHRESHOLD;
    public static boolean MINALPHA;
    public static boolean TIMEOUT;
    public static boolean LOGLEVEL;

    public PngtasticColorCounter(String[] fileNames, String logLevel, double distThreshold, double freqThreshold,
                                 int minAlpha, long timeout) {

//        Sink.getDecision(logLevel == null);
//        Sink.getDecision(distThreshold > 0));
//        Sink.getDecision(freqThreshold > 0));
//        Sink.getDecision(minAlpha > 0));
//        Sink.getDecision(timeout > 0));


        long start = System.currentTimeMillis();
        PngColorCounter counter = new PngColorCounter(logLevel, distThreshold, freqThreshold, minAlpha, timeout);

        for(String file : fileNames) {
            try {
                PngImage image = new PngImage(file, logLevel);
                counter.count(image);

                System.out.println(counter.getResult());

            } catch (PngException | IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Processed in %d milliseconds", System.currentTimeMillis() - start));
    }

//    /** */
//    public static void main(String[] args) {
//        Map<String, String> options = new HashMap<>();
//        int last = 0;
//        for(int i = 0; i < args.length; i++) {
//            String arg = args[i];
//            if(Sink.getDecision(Sink.getDecision(arg.startsWith("--"))) {
//                int next = i + 1;
//                if(Sink.getDecision(Sink.getDecision(next < args.length)) {
//                    options.put(arg, args[next]);
//                    last = next + 1;
//                }
//                else {
//                    options.put(arg, null);
//                    last = next;
//                }
//            }
//        }
//        String[] files = Arrays.copyOfRange(args, last, args.length);
//
//        files = new String[1];
//        files[0] = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/instrumented/pngtastic/images/optimizer/1px.png";
//
//        if(Sink.getDecision(Sink.getDecision(files.length == 0)) {
//            System.out.println("No files to process");
//            System.out.println(HELP);
//            return;
//        }
//
////        Double distThreshold = safeDouble(options.get("--distThreshold"), 0.005D);  // min @8bit: 0.000005
////        Double freqThreshold = safeDouble(options.get("--freqThreshold"), 0.0005D);
////        Integer minAlpha = safeInteger(options.get("--minAlpha"), 30);
////        Integer timeout = safeInteger(options.get("--timeout"), 0);
////        String logLevel = options.get("--logLevel");
//
//        FREQTHRESHOLD = Source.getOptionFreqThreshold(Boolean.valueOf(args[0]));
//        DISTTHRESHOLD = Source.getOptionDistThreshold(Boolean.valueOf(args[1]));
//        MINALPHA = Source.getOptionMinAlpha(Boolean.valueOf(args[2]));
//        TIMEOUT = Source.getOptionTimeout(Boolean.valueOf(args[3]));
//        LOGLEVEL = Source.getOptionLogLevel(Boolean.valueOf(args[4]));
//
////        FREQTHRESHOLD = Source.getOptionFreqThreshold(true);
////        DISTTHRESHOLD = Source.getOptionDistThreshold(true);
////        MINALPHA = Source.getOptionMinAlpha(true);
////        TIMEOUT = Source.getOptionTimeout(true);
////        LOGLEVEL = Source.getOptionLogLevel(true);
//
//        Double distThreshold;
//        Double freqThreshold;
//        Integer minAlpha;
//        Integer timeout;
//        String logLevel;
//
//        if(Sink.getDecision(Sink.getDecision(Sink.getDecision1(DISTTHRESHOLD))) {
//            distThreshold = 0.0D;
//        }
//        else {
//            distThreshold = 1.0D;
//        }
//
//        if(Sink.getDecision(Sink.getDecision(Sink.getDecision1(FREQTHRESHOLD))) {
//            freqThreshold = 0.0D;
//        }
//        else {
//            freqThreshold = 1.0D;
//        }
//
//        if(Sink.getDecision(Sink.getDecision(Sink.getDecision1(MINALPHA))) {
//            minAlpha = 10;
//        }
//        else {
//            minAlpha = 50;
//        }
//
//        if(Sink.getDecision(Sink.getDecision(Sink.getDecision1(TIMEOUT))) {
//            timeout = 0;
//        }
//        else {
//            timeout = 1_000_000;
//        }
//
//        if(Sink.getDecision(Sink.getDecision(Sink.getDecision1(LOGLEVEL))) {
//            logLevel = "debug";
//        }
//        else {
//            logLevel = "none";
//        }
//
//        Sink.getDecision(minAlpha == null));
//
//        new PngtasticColorCounter(files, logLevel, distThreshold, freqThreshold, minAlpha, timeout);
//    }

    private static Integer safeInteger(String input, Integer dflt) {
        try {
            return Integer.valueOf(input);
        } catch (Exception e) {
            return dflt;
        }
    }

    private static Double safeDouble(String input, Double dflt) {
        try {
            return Double.valueOf(input);
        } catch (Exception e) {
            return dflt;
        }
    }
}