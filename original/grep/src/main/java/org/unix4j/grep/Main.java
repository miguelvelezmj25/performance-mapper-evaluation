package org.unix4j.grep;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.unix4j.grep.context.DefaultExecutionContext;
import org.unix4j.grep.io.StdOutput;
import org.unix4j.grep.processor.LineProcessor;
import org.unix4j.grep.unix.grep.GrepArguments;
import org.unix4j.grep.unix.grep.GrepCommand;

public class Main {

    public static boolean ISIGNORECASE;
    public static boolean ISINVERTMATCH;
    public static boolean ISFIXEDSTRINGS;
    public static boolean ISLINENUMBER;
    public static boolean ISCOUNT;
    public static boolean ISMATCHINGFILES;
    public static boolean ISWHOLELINE;

    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        System.out.println("Original");
        Sink.init();

        Thread.sleep(1500);

        ISIGNORECASE = Source.getIsIgnoreCase(Boolean.valueOf(args[0]));
        ISINVERTMATCH = Source.getIsInvertMatch(Boolean.valueOf(args[1]));
        ISFIXEDSTRINGS = Source.getIsFixedStrings(Boolean.valueOf(args[2]));
        ISLINENUMBER = Source.getIsLineNumber(Boolean.valueOf(args[3]));
        ISCOUNT = Source.getIsCount(Boolean.valueOf(args[4]));
        ISMATCHINGFILES = Source.getIsMatchingFiles(Boolean.valueOf(args[5]));
        ISWHOLELINE = Source.getIsWholeLine(Boolean.valueOf(args[6]));

//      ISIGNORECASE = Source.getIsIgnoreCase(true);
//      ISINVERTMATCH = Source.getIsInvertMatch(true);
//      ISFIXEDSTRINGS = Source.getIsFixedStrings(false);
//      ISLINENUMBER = Source.getIsLineNumber(false);
//      ISCOUNT = Source.getIsCount(true);
//      ISMATCHINGFILES = Source.getIsMatchingFiles(false);
//      ISWHOLELINE = Source.getIsWholeLine(true);

        boolean isIgnoreCase = ISIGNORECASE;
        boolean isInvertMatch = ISINVERTMATCH;
        boolean isFixedStrings = ISFIXEDSTRINGS;
        boolean isLineNumber = ISLINENUMBER;
        boolean isCount = ISCOUNT;
        boolean isMatchingFiles = ISMATCHINGFILES;
        boolean isWholeLine = ISWHOLELINE;

//        if(ISIGNORECASE) {
//            isIgnoreCase = true;
//        }
//
//        if(ISINVERTMATCH) {
//            isInvertMatch = true;
//        }
//
//        if(ISFIXEDSTRINGS) {
//            isFixedStrings = true;
//        }
//
//        if(ISLINENUMBER) {
//            isLineNumber = true;
//        }
//
//        if(ISCOUNT) {
//            isCount = true;
//        }
//
//        if(ISMATCHINGFILES) {
//            isMatchingFiles = true;
//        }
//
//        if(ISWHOLELINE) {
//            isWholeLine = true;
//        }

        String regexp = "A.*C.*I.*K.*L.*W";
//        String regexp = "wood";

        GrepArguments grepArgs = new GrepArguments(isIgnoreCase, isInvertMatch, isFixedStrings, isLineNumber, isCount,
                isMatchingFiles, isWholeLine);
        grepArgs.setRegexp(regexp);
        grepArgs.setPaths("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/grep/files/*.txt");
        GrepCommand grep = new GrepCommand(grepArgs);

        DefaultExecutionContext executionContext = new DefaultExecutionContext();

        StdOutput out = new StdOutput();
        LineProcessor exec = grep.execute(executionContext, out);

        exec.finish();

        long end = System.nanoTime();

        System.out.println((end - start) / 1000000000.0);
    }
}
