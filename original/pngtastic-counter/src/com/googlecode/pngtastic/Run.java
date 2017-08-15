package com.googlecode.pngtastic;

import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Run {
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

    public static void main(String[] args) {
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
        files[0] = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/instrumented/pngtastic/images/optimizer/1px.png";

        if(files.length == 0) {
            System.out.println("No files to process");
            System.out.println(HELP);
            return;
        }

//        Double distThreshold = safeDouble(options.get("--distThreshold"), 0.005D);  // min @8bit: 0.000005
//        Double freqThreshold = safeDouble(options.get("--freqThreshold"), 0.0005D);
//        Integer minAlpha = safeInteger(options.get("--minAlpha"), 30);
//        Integer timeout = safeInteger(options.get("--timeout"), 0);
//        String logLevel = options.get("--logLevel");

        FREQTHRESHOLD = Source.getOptionFreqThreshold(Boolean.valueOf(args[0]));
        DISTTHRESHOLD = Source.getOptionDistThreshold(Boolean.valueOf(args[1]));
        MINALPHA = Source.getOptionMinAlpha(Boolean.valueOf(args[2]));
        TIMEOUT = Source.getOptionTimeout(Boolean.valueOf(args[3]));
        LOGLEVEL = Source.getOptionLogLevel(Boolean.valueOf(args[4]));

//        FREQTHRESHOLD = Source.getOptionFreqThreshold(true);
//        DISTTHRESHOLD = Source.getOptionDistThreshold(true);
//        MINALPHA = Source.getOptionMinAlpha(true);
//        TIMEOUT = Source.getOptionTimeout(true);
//        LOGLEVEL = Source.getOptionLogLevel(true);

        Double distThreshold;
        Double freqThreshold;
        Integer minAlpha;
        Integer timeout;
        String logLevel;

        if(DISTTHRESHOLD) {
            distThreshold = 0.0D;
        }
        else {
            distThreshold = 1.0D;
        }

        if(FREQTHRESHOLD) {
            freqThreshold = 0.0D;
        }
        else {
            freqThreshold = 1.0D;
        }

        if(MINALPHA) {
            minAlpha = 10;
        }
        else {
            minAlpha = 50;
        }

        if(TIMEOUT) {
            timeout = 0;
        }
        else {
            timeout = 1_000_000;
        }

        if(LOGLEVEL) {
            logLevel = "debug";
        }
        else {
            logLevel = "none";
        }

//        Sink.getDecision(logLevel == null);
//        Sink.getDecision(distThreshold == null);
//        Sink.getDecision(freqThreshold == null);
//        Sink.getDecision(minAlpha == null);
//        Sink.getDecision(timeout == null);

        new PngtasticColorCounter(files, logLevel, distThreshold, freqThreshold, minAlpha, timeout);
    }
}
