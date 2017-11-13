package weka;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import weka.classifiers.rules.PART;

public class Test {

    public static boolean FOLDS;
    public static boolean BINARYSPLITS;
    public static boolean CONFIDENCEFACTOR;
    public static boolean DONOTMAKESPLITPOINTACTUALVALUE;
    public static boolean MINNUM;
    public static boolean REDUCEDERRORPRUNING;
    public static boolean SEED;
    public static boolean UNPRUNED;
    public static boolean USEMDL;

    public static boolean BATCHSIZE;
    public static boolean NOCHECKCAPABILITIES;
    public static boolean NUMDECIMAL;

    public static void main(String[] args) {
        Sink.init();
        System.out.println("Original");

        FOLDS = Source.getOptionFOLDS(Boolean.valueOf(args[0]));
        BINARYSPLITS = Source.getOptionBINARYSPLITS(Boolean.valueOf(args[1]));
        CONFIDENCEFACTOR = Source.getOptionCONFIDENCEFACTOR(Boolean.valueOf(args[2]));
        DONOTMAKESPLITPOINTACTUALVALUE = Source.getOptionDONOTMAKESPLITPOINTACTUALVALUE(Boolean.valueOf(args[3]));
        MINNUM = Source.getOptionMINNUM(Boolean.valueOf(args[4]));
        REDUCEDERRORPRUNING = Source.getOptionREDUCEDERRORPRUNING(Boolean.valueOf(args[5]));
        SEED = Source.getOptionSEED(Boolean.valueOf(args[6]));
        UNPRUNED = Source.getOptionUNPRUNED(Boolean.valueOf(args[7]));
        USEMDL = Source.getOptionUSEMDL(Boolean.valueOf(args[8]));

        BATCHSIZE = Source.getOptionBATCHSIZE(Boolean.valueOf(args[9]));
        NOCHECKCAPABILITIES = Source.getOptionNOCHECKCAPABILITIES(Boolean.valueOf(args[10]));
        NUMDECIMAL = Source.getOptionNUMDECIMAL(Boolean.valueOf(args[11]));

//        FOLDS = Source.getOptionFOLDS(false);
//        BINARYSPLITS = Source.getOptionBINARYSPLITS(true);
//        CONFIDENCEFACTOR = Source.getOptionCONFIDENCEFACTOR(true);
//        DONOTMAKESPLITPOINTACTUALVALUE = Source.getOptionDONOTMAKESPLITPOINTACTUALVALUE(true);
//        MINNUM = Source.getOptionMINNUM(true);
//        REDUCEDERRORPRUNING = Source.getOptionREDUCEDERRORPRUNING(true);
//        SEED = Source.getOptionSEED(true);
//        UNPRUNED = Source.getOptionUNPRUNED(true);
//        USEMDL = Source.getOptionUSEMDL(true);
//
//        BATCHSIZE = Source.getOptionBATCHSIZE(true);
//        NOCHECKCAPABILITIES = Source.getOptionNOCHECKCAPABILITIES(true);
//        NUMDECIMAL = Source.getOptionNUMDECIMAL(true);

        args = new String[2];
        args[0] = "-t";
        args[1] = "/Users/mvelezce/Documents/Programming/Machine Learning/Projects/turtlebot-configurations-validity/datasets/dataset_cross_validation.arff";

        int folds = 3;
        boolean binarySplits = false;
        float confidenceFactor = 0.25f;
        boolean doNotMakeSplitPointActualValue = false;
        int minNumObj = 2;
        boolean reducedErrorPruning = false;
        int seed = 1;
        boolean unpruned = false;
        boolean useMDL = false;

        String batchSize = "100";
        boolean noCheckCapabilities = false;
        int numDecimal = 2;

        if(FOLDS) {
            folds = 10;
        }

        if(BINARYSPLITS) {
            binarySplits = true;
        }

        if(CONFIDENCEFACTOR) {
            confidenceFactor = 0.25f;
        }

        if(DONOTMAKESPLITPOINTACTUALVALUE) {
            doNotMakeSplitPointActualValue = true;
        }

        if(MINNUM) {
            minNumObj = 10;
        }

        if(REDUCEDERRORPRUNING) {
            reducedErrorPruning = true;
        }

        if(SEED) {
            seed = 10;
        }

        if(UNPRUNED) {
            unpruned = true;
        }

        if(USEMDL) {
            useMDL = true;
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

        PART part = new PART();
        part.setBinarySplits(binarySplits);
        part.setConfidenceFactor(confidenceFactor);
        part.setDoNotMakeSplitPointActualValue(doNotMakeSplitPointActualValue);
        part.setMinNumObj(minNumObj);
        part.setNumFolds(folds);
        part.setReducedErrorPruning(reducedErrorPruning);
        part.setSeed(seed);
        part.setUnpruned(unpruned);
        part.setUseMDLcorrection(useMDL);

        part.setBatchSize(batchSize);
        part.setDoNotCheckCapabilities(noCheckCapabilities);
        part.setNumDecimalPlaces(numDecimal);

        PART.runClassifier(part, args);
    }
}
