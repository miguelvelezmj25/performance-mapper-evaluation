package org.unix4j.grep;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import org.unix4j.grep.context.DefaultExecutionContext;
import org.unix4j.grep.io.StdOutput;
import org.unix4j.grep.processor.LineProcessor;
import org.unix4j.grep.unix.grep.GrepArguments;
import org.unix4j.grep.unix.grep.GrepCommand;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.function.BooleanSupplier;

public class Main {

    public static boolean ISIGNORECASE;
    public static boolean ISINVERTMATCH;
    public static boolean ISFIXEDSTRINGS;
    public static boolean ISLINENUMBER;
    public static boolean ISCOUNT;
    public static boolean ISMATCHINGFILES;
    public static boolean ISWHOLELINE;

    private Stack<String> stack;
    private Set<String> options;

    public Main(Stack<String> stack) {
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
//        long start = System.nanoTime();
//        System.out.println("Original");
//        Sink.init();
//
//        ISIGNORECASE = Source.getIsIgnoreCase(Boolean.valueOf(args[0]));
//        ISINVERTMATCH = Source.getIsInvertMatch(Boolean.valueOf(args[1]));
//        ISFIXEDSTRINGS = Source.getIsFixedStrings(Boolean.valueOf(args[2]));
//        ISLINENUMBER = Source.getIsLineNumber(Boolean.valueOf(args[3]));
//        ISCOUNT = Source.getIsCount(Boolean.valueOf(args[4]));
//        ISMATCHINGFILES = Source.getIsMatchingFiles(Boolean.valueOf(args[5]));
//        ISWHOLELINE = Source.getIsWholeLine(Boolean.valueOf(args[6]));
//
////      ISIGNORECASE = Source.getIsIgnoreCase(false);
////      ISINVERTMATCH = Source.getIsInvertMatch(false);
////      ISFIXEDSTRINGS = Source.getIsFixedStrings(false);
////      ISLINENUMBER = Source.getIsLineNumber(true);
////      ISCOUNT = Source.getIsCount(true);
////      ISMATCHINGFILES = Source.getIsMatchingFiles(true);
////      ISWHOLELINE = Source.getIsWholeLine(false);
//
//        boolean isIgnoreCase = false;
//        boolean isInvertMatch = false;
//        boolean isFixedStrings = false;
//        boolean isLineNumber = false;
//        boolean isCount = false;
//        boolean isMatchingFiles = false;
//        boolean isWholeLine = false;
//
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
//
//        String regexp = "A.*C.*I.*K.*L.*W";
////        String regexp = "wood";
//
//        GrepArguments grepArgs = new GrepArguments(isIgnoreCase, isInvertMatch, isFixedStrings, isLineNumber, isCount,
//                isMatchingFiles, isWholeLine);
//        grepArgs.setRegexp(regexp);
//        grepArgs.setPaths("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/grep/files/*.txt");
//        GrepCommand grep = new GrepCommand(grepArgs);
//
//        DefaultExecutionContext executionContext = new DefaultExecutionContext();
//
//        StdOutput out = new StdOutput();
//        LineProcessor exec = grep.execute(executionContext, out);
//
//        exec.finish();
//
//        long end = System.nanoTime();
//
//        System.out.println((end - start) / 1000000000.0);
        splat(args, new Stack<>());
    }

    public static Stack<String> splat(String[] args, Stack<String> stack) {
        long start = System.nanoTime();
        System.out.println("Splat");
        Sink.init();

        Main main = new Main(stack);

//        ISIGNORECASE = Source.getIsIgnoreCase(Boolean.valueOf(args[0]));
//        ISINVERTMATCH = Source.getIsInvertMatch(Boolean.valueOf(args[1]));
//        ISFIXEDSTRINGS = Source.getIsFixedStrings(Boolean.valueOf(args[2]));
//        ISLINENUMBER = Source.getIsLineNumber(Boolean.valueOf(args[3]));
//        ISCOUNT = Source.getIsCount(Boolean.valueOf(args[4]));
//        ISMATCHINGFILES = Source.getIsMatchingFiles(Boolean.valueOf(args[5]));
//        ISWHOLELINE = Source.getIsWholeLine(Boolean.valueOf(args[6]));

//      ISIGNORECASE = Source.getIsIgnoreCase(false);
//      ISINVERTMATCH = Source.getIsInvertMatch(false);
//      ISFIXEDSTRINGS = Source.getIsFixedStrings(false);
//      ISLINENUMBER = Source.getIsLineNumber(true);
//      ISCOUNT = Source.getIsCount(true);
//      ISMATCHINGFILES = Source.getIsMatchingFiles(true);
//      ISWHOLELINE = Source.getIsWholeLine(false);

//        BooleanSupplier isIgnoreCase = () -> main.getIsIgnoreCase(Boolean.valueOf(true));
//        BooleanSupplier isInvertMatch = () -> main.getIsInvertMatch(Boolean.valueOf(true));
//        BooleanSupplier isFixedStrings = () -> main.getIsFixedStrings(Boolean.valueOf(false));
//        BooleanSupplier isLineNumber = () -> main.getIsLineNumber(Boolean.valueOf(false));
//        BooleanSupplier isCount = () -> main.getIsCount(Boolean.valueOf(true));
//        BooleanSupplier isMatchingFiles = () -> main.getIsMatchingFiles(Boolean.valueOf(false));
//        BooleanSupplier isWholeLine = () -> main.getIsWholeLine(Boolean.valueOf(true));

        BooleanSupplier isIgnoreCase = () -> main.getIsIgnoreCase(Boolean.valueOf(args[0]));
        BooleanSupplier isInvertMatch = () -> main.getIsInvertMatch(Boolean.valueOf(args[1]));
        BooleanSupplier isFixedStrings = () -> main.getIsFixedStrings(Boolean.valueOf(args[2]));
        BooleanSupplier isLineNumber = () -> main.getIsLineNumber(Boolean.valueOf(args[3]));
        BooleanSupplier isCount = () -> main.getIsCount(Boolean.valueOf(args[4]));
        BooleanSupplier isMatchingFiles = () -> main.getIsMatchingFiles(Boolean.valueOf(args[5]));
        BooleanSupplier isWholeLine = () -> main.getIsWholeLine(Boolean.valueOf(args[6]));

        String regexp = "A.*C.*I.*K.*L.*W";
//        String regexp = "wood";

        GrepArguments grepArgs = new GrepArguments(isIgnoreCase, isInvertMatch, isFixedStrings, isLineNumber, isCount,
                isMatchingFiles, isWholeLine);
        grepArgs.setRegexp(regexp);
        grepArgs.setPaths("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/splat/grep/files/*.txt");
        GrepCommand grep = new GrepCommand(grepArgs);

        DefaultExecutionContext executionContext = new DefaultExecutionContext();

        StdOutput out = new StdOutput();
        LineProcessor exec = grep.execute(executionContext, out);

        exec.finish();

        long end = System.nanoTime();

        System.out.println((end - start) / 1000000000.0);

        return main.stack;
    }

    private boolean getIsWholeLine(boolean option) {
        this.push("WHOLELINE");

        if(option) {
            return true;
        }

        return false;
    }

    private boolean getIsMatchingFiles(boolean option) {
        this.push("MATCHINGFILES");

        return option;

    }

    private boolean getIsCount(boolean option) {
        this.push("COUNT");

        return option;

    }

    private boolean getIsLineNumber(boolean option) {
        this.push("LINENUMBER");

        return option;

    }

    private boolean getIsFixedStrings(boolean option) {
        this.push("FIXEDSTRINGS");

        return option;

    }

    private boolean getIsInvertMatch(boolean option) {
        this.push("INVERTMATCH");

        return option;

    }

    private boolean getIsIgnoreCase(boolean option) {
        this.push("IGNORECASE");

        return option;

    }
}
