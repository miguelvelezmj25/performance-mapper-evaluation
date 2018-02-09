package org.unix4j.sed;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.unix4j.sed.context.DefaultExecutionContext;
import org.unix4j.sed.io.StdOutput;
import org.unix4j.sed.processor.LineProcessor;
import org.unix4j.sed.unix.sed.SedArguments;
import org.unix4j.sed.unix.sed.SedCommand;

public class Main {

    public static boolean CHECK;
    public static boolean MERGE;
    public static boolean UNIQUE;
    public static boolean IGNORELEADINGBLANKS;
    public static boolean DICTIONARYORDER;
    public static boolean IGNORECASE;
    public static boolean NUMERICSORT;
    public static boolean GENERALNUMERICSORT;
    public static boolean HUMANNUMERICSORT;
    public static boolean MONTHSORT;
    public static boolean VERSIONSORT;
    public static boolean REVERSE;

    public static void main(String[] args) throws InterruptedException {
        Sink.init();

//        args = new String[] {
//                "true",
//                "false",
//                "true",
//                "true",
//                "false",
//                "true",
//                "true",
//                "false",
//                "true",
//                "true",
//                "false",
//                "true"};




        Thread.sleep(1500);

        CHECK = Source.getIsCheck(Boolean.valueOf(args[0]));
        MERGE = Source.getIsMerge(Boolean.valueOf(args[1]));
        UNIQUE = Source.getIsUnique(Boolean.valueOf(args[2]));
        IGNORELEADINGBLANKS = Source.getIsIgnoreLeadingBlanks(Boolean.valueOf(args[3]));
        DICTIONARYORDER = Source.getIsDictionaryOrder(Boolean.valueOf(args[4]));
        IGNORECASE = Source.getIsIgnoreCase(Boolean.valueOf(args[5]));
        NUMERICSORT = Source.getIsNumericSort(Boolean.valueOf(args[6]));
        GENERALNUMERICSORT = Source.getIsGeneralNumericSort(Boolean.valueOf(args[7]));
        HUMANNUMERICSORT = Source.getIsHumanNumericSort(Boolean.valueOf(args[8]));
        MONTHSORT = Source.getIsMonthSort(Boolean.valueOf(args[9]));
        VERSIONSORT = Source.getIsVersionSort(Boolean.valueOf(args[10]));
        REVERSE = Source.getIsReverse(Boolean.valueOf(args[11]));

//        CHECK = Source.getIsCheck(false);
//        MERGE = Source.getIsMerge(false);
//        UNIQUE = Source.getIsUnique(false);
//        IGNORELEADINGBLANKS = Source.getIsIgnoreLeadingBlanks(false);
//        DICTIONARYORDER = Source.getIsDictionaryOrder(false);
//        IGNORECASE = Source.getIsIgnoreCase(false);
//        NUMERICSORT = Source.getIsNumericSort(false);
//        GENERALNUMERICSORT = Source.getIsGeneralNumericSort(false);
//        HUMANNUMERICSORT = Source.getIsHumanNumericSort(false);
//        MONTHSORT = Source.getIsMonthSort(false);
//        VERSIONSORT = Source.getIsVersionSort(false);
//        REVERSE = Source.getIsReverse(false);

        boolean isCheck = CHECK;
        boolean isMerge = MERGE;
        boolean isUnique = UNIQUE;
        boolean isIgnoreLeadingBlanks = IGNORELEADINGBLANKS;
        boolean isDictionaryOrder = DICTIONARYORDER;
        boolean isIgnoreCase = IGNORECASE;
        boolean isNumericSort = NUMERICSORT;
        boolean isGeneralNumericSort = GENERALNUMERICSORT;
        boolean isHumanNumericSort = HUMANNUMERICSORT;
        boolean isMonthSort = MONTHSORT;
        boolean isVersionSort = VERSIONSORT;
        boolean isReverse = REVERSE;

        SedArguments sedArgs = new SedArguments(false, false, false, false, false, false, false, false, false, false, false);
        sedArgs.setPaths(System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/sort/files/*.txt");
//        sortArgs.setPaths(System.getProperty("user.home") + "/Documents/performance-mapper-evaluation/original/sort/files/*.txt");
        SedCommand sed = new SedCommand(sedArgs);
Unix4j.
        sedArgs.set

        DefaultExecutionContext executionContext = new DefaultExecutionContext();

        StdOutput out = new StdOutput();
        LineProcessor exec = sed.execute(executionContext, out);

        exec.finish();
    }
}
