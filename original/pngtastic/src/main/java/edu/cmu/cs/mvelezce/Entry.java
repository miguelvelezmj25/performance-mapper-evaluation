package edu.cmu.cs.mvelezce;

import com.googlecode.pngtastic.PngtasticColorCounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mvelezce on 6/20/17.
 */
public class Entry {

    public static boolean FREQTHRESHOLD = false;
    public static boolean DISTTHRESHOLD = false;
    public static boolean MINALPHA = false;
    public static boolean TIMEOUT = false;
    public static boolean LOGLEVEL = false;

    /** */
    private static final String HELP = "java -jar pngtastic-x.x.jar com.googlecode.pngtastic.PngtasticColorCounter [options] file1 [file2 ..]\n"
            + "Options:\n"
            + "  --distThreshold    the distance below which two colors are considered similar (0.0 to 1.0)\n"
            + "  --freqThreshold    the percentage a color must be represented in the overall image (0.0 to 1.0)\n"
            + "  --minAlpha         the minimum alpha channel value a pixel must have\n"
            + "  --timeout          the number of milliseconds after which color counting will be aborted\n"
            + "  --logLevel         the level of logging output (none, debug, info, or error)\n";

    /** */
    public static void main(String[] args) {
        Map<String, String> options = new HashMap<>();
        int last = 0;
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.startsWith("--")) {
                int next = i + 1;
                if (next < args.length) {
                    options.put(arg, args[next]);
                    last = next + 1;
                } else {
                    options.put(arg, null);
                    last = next;
                }
            }
        }
        String[] files = Arrays.copyOfRange(args, last, args.length);

        if (files.length == 0) {
            System.out.println("No files to process");
            System.out.println(HELP);
            return;
        }

//            Double distThreshold = safeDouble(options.get("--distThreshold"), 0.005D);  // min @8bit: 0.000005
//      	  Double freqThreshold = safeDouble(options.get("--freqThreshold"), 0.0005D);
//            Integer minAlpha = safeInteger(options.get("--minAlpha"), 30);
//            Integer timeout = safeInteger(options.get("--timeout"), 0);
//            String logLevel = options.get("--logLevel");

        Double freqThreshold;
        Double distThreshold;
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
            timeout = 1000;
        }

        if(LOGLEVEL) {
            logLevel = "none";
        }
        else {
            logLevel = "debug";
        }

        new PngtasticColorCounter(files, logLevel, distThreshold, freqThreshold, minAlpha, timeout);
    }

}
