package edu.cmu.cs.mvelezce.zip;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation;
import edu.cmu.cs.mvelezce.zip.verificationClasses.FeatureSwitches;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ZipMain implements PL_Interface {

    public static boolean FEATUREBase = true;
    public static boolean FEATUREZipMeTest = true;
    public static boolean FEATURECompress = true;
    public static boolean FEATUREExtract = true;

    public static boolean FEATUREGZIP = true;

    public static boolean FEATURECRC;
    public static boolean FEATUREArchiveCheck;
    public static boolean FEATUREAdlerThreeTwoChecksum;
    public static boolean FEATUREDerivativeGZIPCRC;
    public static boolean FEATUREDerivativeCompressCRC;
    public static boolean FEATUREDerivativeExtractCRC;
    public static boolean FEATUREDerivativeCompressGZIP;
    public static boolean FEATUREDerivativeCompressAdlerThreeTwoChecksum;
    public static boolean FEATUREDerivativeCompressGZIPCRC;


    public static boolean executedUnimplementedAction = false;


    public static List<String> actionHistory = new ArrayList<String>();


    public static boolean verbose = false;


    private static boolean isAbortedRun = false;


    public static void main(String[] args) {
        try {
//			edu.cmu.cs.mvelezce.zip.verificationClasses.FeatureSwitches.select_features();

            FEATURECRC = Source.getOptionFEATURECRC(Boolean.valueOf(args[0]));
            FEATUREArchiveCheck = Source.getOptionFEATUREArchiveCheck(Boolean.valueOf(args[1]));
            FEATUREAdlerThreeTwoChecksum = Source.getOptionFEATUREAdlerThreeTwoChecksum(Boolean.valueOf(args[2]));
            FEATUREDerivativeGZIPCRC = Source.getOptionFEATUREDerivativeGZIPCRC(Boolean.valueOf(args[4]));
            FEATUREDerivativeCompressCRC = Source.getOptionFEATUREDerivativeCompressCRC(Boolean.valueOf(args[5]));
            FEATUREDerivativeExtractCRC = Source.getOptionFEATUREDerivativeExtractCRC(Boolean.valueOf(args[5]));
            FEATUREDerivativeCompressGZIP = Source.getOptionFEATUREDerivativeCompressGZIP(Boolean.valueOf(args[6]));
            FEATUREDerivativeCompressAdlerThreeTwoChecksum = Source.getOptionFEATUREDerivativeCompressAdlerThreeTwoChecksum(Boolean.valueOf(args[7]));
            FEATUREDerivativeCompressGZIPCRC = Source.getOptionFEATUREDerivativeCompressGZIPCRC(Boolean.valueOf(args[8]));

//            FEATURECRC = Source.getOptionFEATURECRC(true);
//            FEATUREArchiveCheck = Source.getOptionFEATUREArchiveCheck(true);
//            FEATUREAdlerThreeTwoChecksum = Source.getOptionFEATUREAdlerThreeTwoChecksum(true);
//            FEATUREDerivativeGZIPCRC = Source.getOptionFEATUREDerivativeGZIPCRC(true);
//            FEATUREDerivativeCompressCRC = Source.getOptionFEATUREDerivativeCompressCRC(true);
//            FEATUREDerivativeExtractCRC = Source.getOptionFEATUREDerivativeExtractCRC(true);
//            FEATUREDerivativeCompressGZIP = Source.getOptionFEATUREDerivativeCompressGZIP(true);
//            FEATUREDerivativeCompressAdlerThreeTwoChecksum = Source.getOptionFEATUREDerivativeCompressAdlerThreeTwoChecksum(true);
//            FEATUREDerivativeCompressGZIPCRC = Source.getOptionFEATUREDerivativeCompressGZIPCRC(true);

//            FEATURECRC = true;
//            FEATUREArchiveCheck = true;
//            FEATUREAdler32Checksum = true;
//            FEATUREDerivativeGZIPCRC = true;
//            FEATUREDerivativeCompressCRC = true;
//            FEATUREDerivativeExtractCRC = true;
//            FEATUREDerivativeCompressGZIP = true;
//            FEATUREDerivativeCompressAdler32Checksum = true;
//            FEATUREDerivativeCompressGZIPCRC = true;

            if(Sink.getDecision(!FeatureSwitches.valid_product())) {
//                throw new RuntimeException("Illegal config");
                System.out.println("Illegal config");
            }

            ZipMain impl = new ZipMain();
            args = new String[1];
            verbose = true;
            impl.start(1, 3);
            ZipMain.println("no Exception");
        } catch (Throwable e) {
            ZipMain.println("Caught Exception: " + e.getClass() + " "
                    + e.getMessage());
            e.printStackTrace();
        }
    }

    @FeatureAnnotation(name = "Base")
    static String listToString(List<String> list) {
        String ret = "";
        for(String s : list) {
            ret = ret + " " + s;
        }
        return ret;
    }

    public static void println(String s) {
        if(Sink.getDecision(ZipMain.verbose)) {
            System.out.println(s);
        }
    }

    public static void println() {
        if(Sink.getDecision(ZipMain.verbose)) {
            System.out.println();
        }
    }

    public static void print(String s) {
        if(Sink.getDecision(ZipMain.verbose)) {
            System.out.print(s);
        }
    }


    // this method is used as hook for the liveness properties.

    public void start(int specification, int variation) throws Throwable {
        try {
            if(Sink.getDecision(verbose)) {
                ZipMain.print("Started with Specification " + specification + ", Variation: " + variation);
            }
            test(specification, variation);
        } catch (Throwable e) {
            throw e;
        } finally {
        }
    }

    @FeatureAnnotation(name = "Base")
    public void checkOnlySpecification(int specID) {
        ZipMain.println("Specifications not implemented");
    }

    @FeatureAnnotation(name = "Base")
    public List<String> getExecutedActions() {
        return actionHistory;
    }

    @FeatureAnnotation(name = "Base")
    public boolean isAbortedRun() {
        return isAbortedRun;
    }

    public void test(int specification, int variation) throws Throwable {
        String[] args = new String[1];


        args[0] = "irrelevant";
        ZipTest.fileToZip = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/zipme/uiq2testfile");
        //edu.cmu.cs.mvelezce.zip.ZipTest.fileToZip = new File("testfile.c");
        try {
            ZipTest.main(args);
        } catch (Throwable e) {
//            ZipMain.println("Caught Exception: " + e.getClass() + " "
//                    + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }


}