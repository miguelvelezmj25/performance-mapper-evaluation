package counter.com.googlecode.pngtastic;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

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

    public static void main(String[] args) {
//        System.out.println("Original");
//        Sink.init();
//        Map<String, String> options = new HashMap<>();
//        int last = 0;
//        for(int i = 0; i < args.length; i++) {
//            String arg = args[i];
//            if(arg.startsWith("--")) {
//                int next = i + 1;
//                if(next < args.length) {
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
//        files[0] = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic-counter/images/optimizer/us.png";
//
//        if(files.length == 0) {
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
////        FREQTHRESHOLD = Source.getOptionFreqThreshold(false);
////        DISTTHRESHOLD = Source.getOptionDistThreshold(false);
////        MINALPHA = Source.getOptionMinAlpha(false);
////        TIMEOUT = Source.getOptionTimeout(true);
////        LOGLEVEL = Source.getOptionLogLevel(true);
//
//        Double distThreshold;
//        Double freqThreshold;
//        Integer minAlpha;
//        Integer timeout;
//        String logLevel;
//
//        if(DISTTHRESHOLD) {
//            distThreshold = 0.005D;
//        }
//        else {
//            distThreshold = 1.0D;
//        }
//
//        if(FREQTHRESHOLD) {
//            freqThreshold = 0.005D;
//        }
//        else {
//            freqThreshold = 1.0D;
//        }
//
//        if(MINALPHA) {
//            minAlpha = 1;
//        }
//        else {
//            minAlpha = 50;
//        }
//
//        if(TIMEOUT) {
//            timeout = 0;
//        }
//        else {
//            timeout = 1_000_000;
//        }
//
//        if(LOGLEVEL) {
//            logLevel = "debug";
//        }
//        else {
//            logLevel = "none";
//        }
//
//        new PngtasticColorCounter(files, logLevel, distThreshold, freqThreshold, minAlpha, timeout);
    }

    public static Stack<String> splat(String[] args, Stack<String> stack) {
        System.out.println("SPLat");
        Sink.init();

        Run run = new Run(stack);

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
        files[0] = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic-counter/images/optimizer/us.png";

        if(files.length == 0) {
            System.out.println("No files to process");
            System.out.println(HELP);
            return null;
        }

//        Double distThreshold = safeDouble(options.get("--distThreshold"), 0.005D);  // min @8bit: 0.000005
//        Double freqThreshold = safeDouble(options.get("--freqThreshold"), 0.0005D);
//        Integer minAlpha = safeInteger(options.get("--minAlpha"), 30);
//        Integer timeout = safeInteger(options.get("--timeout"), 0);
//        String logLevel = options.get("--logLevel");

//        FREQTHRESHOLD = Source.getOptionFreqThreshold(Boolean.valueOf(args[0]));
//        DISTTHRESHOLD = Source.getOptionDistThreshold(Boolean.valueOf(args[1]));
//        MINALPHA = Source.getOptionMinAlpha(Boolean.valueOf(args[2]));
//        TIMEOUT = Source.getOptionTimeout(Boolean.valueOf(args[3]));
//        LOGLEVEL = Source.getOptionLogLevel(Boolean.valueOf(args[4]));

//        FREQTHRESHOLD = Source.getOptionFreqThreshold(false);
//        DISTTHRESHOLD = Source.getOptionDistThreshold(false);
//        MINALPHA = Source.getOptionMinAlpha(false);
//        TIMEOUT = Source.getOptionTimeout(true);
//        LOGLEVEL = Source.getOptionLogLevel(true);

//        FREQTHRESHOLD = Source.getOptionFreqThreshold(Boolean.valueOf(args[0]));
//        DISTTHRESHOLD = Source.getOptionDistThreshold(Boolean.valueOf(args[1]));
//        MINALPHA = Source.getOptionMinAlpha(Boolean.valueOf(args[2]));
//        TIMEOUT = Source.getOptionTimeout(Boolean.valueOf(args[3]));
//        LOGLEVEL = Source.getOptionLogLevel(Boolean.valueOf(args[4]));

        DoubleSupplier distThreshold = () -> run.getOptionFreqThreshold(Boolean.valueOf(args[0]));
        DoubleSupplier freqThreshold = () -> run.getOptionDistThreshold(Boolean.valueOf(args[1]));
        IntSupplier minAlpha = () -> run.getOptionMinAlpha(Boolean.valueOf(args[2]));
        IntSupplier timeout = () -> run.getOptionTimeout(Boolean.valueOf(args[3]));
        Supplier<String> logLevel = () -> run.getOptionLogLevel(Boolean.valueOf(args[4]));

        new PngtasticColorCounter(files, logLevel, distThreshold, freqThreshold, minAlpha, timeout);

        return stack;
    }

    private String getOptionLogLevel(boolean option) {
        this.push("LOGLEVEL");

        if(option) {
            return "debug";
        }
        else {
            return "none";
        }
    }

    private int getOptionTimeout(boolean option) {
        this.push("TIMEOUT");

        if(option) {
            return 0;
        }
        else {
            return 1_000_000;
        }
    }

    private int getOptionMinAlpha(boolean option) {
        this.push("MINALPHA");

        if(option) {
            return 1;
        }
        else {
            return 50;
        }
    }

    private double getOptionDistThreshold(boolean option) {
        this.push("DISTTHRESHOLD");

        if(option) {
            return 0.005D;
        }
        else {
            return 1.0D;
        }
    }

    private double getOptionFreqThreshold(boolean option) {
        this.push("FREQTHRESHOLD");

        if(option) {
            return 0.005D;
        }
        else {
            return 1.0D;
        }
    }
}
