package weka;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import weka.classifiers.rules.JRip;

public class Test {

    public static boolean FOLDS;
    public static boolean OPTIMIZATIONS;
    public static boolean SEED;
    public static boolean MINNO;
    public static boolean DEBUG;
    public static boolean CHECKERROR;
    public static boolean PRUNE;

    public static boolean BATCHSIZE;
    public static boolean NOCHECKCAPABILITIES;
    public static boolean NUMDECIMAL;

    /**
     * Main method.
     *
     * @param args the options for the classifier
     */
    public static void main(String[] args) {
        Sink.init();
        System.out.println("Original");

        FOLDS = Source.getOptionFOLDS(Boolean.valueOf(args[0]));
        OPTIMIZATIONS = Source.getOptionOPTIMIZATIONS(Boolean.valueOf(args[1]));
        PRUNE = Source.getOptionPRUNE(Boolean.valueOf(args[2]));
        SEED = Source.getOptionSEED(Boolean.valueOf(args[3]));
        MINNO = Source.getOptionMINNO(Boolean.valueOf(args[4]));
        DEBUG = Source.getOptionDEBUG(Boolean.valueOf(args[5]));
        CHECKERROR = Source.getOptionCHECKERROR(Boolean.valueOf(args[6]));

        BATCHSIZE = Source.getOptionBATCHSIZE(Boolean.valueOf(args[8]));
        NOCHECKCAPABILITIES = Source.getOptionNOCHECKCAPABILITIES(Boolean.valueOf(args[9]));
        NUMDECIMAL = Source.getOptionNUMDECIMAL(Boolean.valueOf(args[10]));


//        FOLDS = Source.getOptionFOLDS(true);
//        OPTIMIZATIONS = Source.getOptionOPTIMIZATIONS(true);
//        MAXDLSURPLUS = Source.getOptionMAXDLSURPLUS(true);
//        SEED = Source.getOptionSEED(true);
//        MINNO = Source.getOptionMINNO(true);
//        DEBUG = Source.getOptionDEBUG(true);
//        CHECKERROR = Source.getOptionCHECKERROR(true);
//        PRUNE = Source.getOptionPRUNE(true);
//        BATCHSIZE = Source.getOptionBATCHSIZE(true);
//        NOCHECKCAPABILITIES = Source.getOptionNOCHECKCAPABILITIES(true);
//        NUMDECIMAL = Source.getOptionNUMDECIMAL(true);



//    /** Random object used in this class */
//    private Random m_Random = null;

//    /** # of all the possible conditions in a rule */
//    private double m_Total = 0;

//    /** The filter used to randomize the class order */
//    private Filter m_Filter = null;

//    /** The RuleStats for the ruleset of each class value */
//    private ArrayList<RuleStats> m_RulesetStats;

        args = new String[2];

        args[0] = "-t";
        args[1] = "/Users/mvelezce/Documents/Programming/Machine Learning/Projects/turtlebot-configurations-validity/datasets/dataset_cross_validation.arff";

        int folds = 3;
        int optimizations = 2;
        long seed = 1;
        double minNo = 2.0;
        boolean debug = false;
        boolean checkError = false;
        boolean prune = false;

        String batchSize = "100";
        boolean noCheckCapabilities = false;
        int numDecimal = 2;

        if(FOLDS) {
            folds = 10;
        }

        if(OPTIMIZATIONS) {
            optimizations = 10;
        }

        if(SEED) {
            seed = 100;
        }

        if(MINNO) {
            minNo = 10.0;
        }

        if(DEBUG) {
            debug = true;
        }

        if(CHECKERROR) {
            checkError = true;
        }

        if(PRUNE) {
            prune = true;
        }

        if(BATCHSIZE) {
            batchSize = "10";
        }

        if(NOCHECKCAPABILITIES) {
            noCheckCapabilities = true;
        }

        if(NUMDECIMAL) {
            numDecimal = 5;
        }

        JRip jrip = new JRip();
        jrip.setFolds(folds);
        jrip.setOptimizations(optimizations);
        jrip.setSeed(seed);
        jrip.setMinNo(minNo);
        jrip.setDebug(debug);
        jrip.setCheckErrorRate(checkError);
        jrip.setUsePruning(prune);

        jrip.setBatchSize(batchSize);
        jrip.setDoNotCheckCapabilities(noCheckCapabilities);
        jrip.setNumDecimalPlaces(numDecimal);

        JRip.runClassifier(jrip, args);
    }

}
