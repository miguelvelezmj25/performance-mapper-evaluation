package org.unix4j.sort;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.unix4j.sort.command.ExitValueException;
import org.unix4j.sort.context.DefaultExecutionContext;
import org.unix4j.sort.io.StdOutput;
import org.unix4j.sort.processor.LineProcessor;
import org.unix4j.sort.unix.sort.SortArguments;
import org.unix4j.sort.unix.sort.SortCommand;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.function.BooleanSupplier;

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

    private Stack<String> stack;
    private Set<String> options;

    public Main(Stack<String> stack) {
        System.out.println(stack.size());
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

    public static Stack<String> splat(String[] args, Stack<String> stack) {
        Sink.init();

        Main main = new Main(stack);

        BooleanSupplier isCheck = () -> main.getIsCheck(Boolean.valueOf(args[0]));
        BooleanSupplier isMerge = () -> main.getIsMerge(Boolean.valueOf(args[1]));
        BooleanSupplier isUnique = () -> main.getIsUnique(Boolean.valueOf(args[2]));
        BooleanSupplier isIgnoreLeadingBlanks = () -> main.getIsIgnoreLeadingBlanks(Boolean.valueOf(args[3]));
        BooleanSupplier isDictionaryOrder = () -> main.getIsDictionaryOrder(Boolean.valueOf(args[4]));
        BooleanSupplier isIgnoreCase = () -> main.getIsIgnoreCase(Boolean.valueOf(args[5]));
        BooleanSupplier isNumericSort = () -> main.getIsNumericSort(Boolean.valueOf(args[6]));
        BooleanSupplier isGeneralNumericSort = () -> main.getIsGeneralNumericSort(Boolean.valueOf(args[7]));
        BooleanSupplier isHumanNumericSort = () -> main.getIsHumanNumericSort(Boolean.valueOf(args[8]));
        BooleanSupplier isMonthSort = () -> main.getIsMonthSort(Boolean.valueOf(args[9]));
        BooleanSupplier isVersionSort = () -> main.getIsVersionSort(Boolean.valueOf(args[10]));
        BooleanSupplier isReverse = () -> main.getIsReverse(Boolean.valueOf(args[11]));

//        CHECK = Source.getIsCheck(false);
//        MERGE = Source.getIsMerge(true);
//        UNIQUE = Source.getIsUnique(false);
//        IGNORELEADINGBLANKS = Source.getIsIgnoreLeadingBlanks(false);
//        DICTIONARYORDER = Source.getIsDictionaryOrder(false);
//        IGNORECASE = Source.getIsIgnoreCase(false);
//        NUMERICSORT = Source.getIsNumericSort(false);
//        GENERALNUMERICSORT = Source.getIsGeneralNumericSort(false);
//        HUMANNUMERICSORT = Source.getIsHumanNumericSort(false);
//        MONTHSORT = Source.getIsMonthSort(true);
//        VERSIONSORT = Source.getIsVersionSort(true);
//        REVERSE = Source.getIsReverse(true);

//        boolean isCheck = CHECK;
//        boolean isMerge = MERGE;
//        boolean isUnique = UNIQUE;
//        boolean isIgnoreLeadingBlanks = IGNORELEADINGBLANKS;
//        boolean isDictionaryOrder = DICTIONARYORDER;
//        boolean isIgnoreCase = IGNORECASE;
//        boolean isNumericSort = NUMERICSORT;
//        boolean isGeneralNumericSort = GENERALNUMERICSORT;
//        boolean isHumanNumericSort = HUMANNUMERICSORT;
//        boolean isMonthSort = MONTHSORT;
//        boolean isVersionSort = VERSIONSORT;
//        boolean isReverse = REVERSE;

        SortArguments sortArgs = new SortArguments(isCheck, isMerge, isUnique, isIgnoreLeadingBlanks,
                isDictionaryOrder, isIgnoreCase, isNumericSort,
                isGeneralNumericSort, isHumanNumericSort, isMonthSort,
                isVersionSort, isReverse);
        sortArgs.setPaths(System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/sort/files/*.txt");
        SortCommand sort = new SortCommand(sortArgs);

        DefaultExecutionContext executionContext = new DefaultExecutionContext();

        StdOutput out = new StdOutput();
        LineProcessor exec = sort.execute(executionContext, out);

        try {
            exec.finish();
        }
        catch(ExitValueException eve) {
            eve.printStackTrace();
        }

        return main.stack;
    }

    private boolean getIsMonthSort(boolean option) {
        this.push("MONTHSORT");

        return option;
    }

    private boolean getIsHumanNumericSort(boolean option) {
        this.push("HUMANNUMERICSORT");

        return option;
    }

    private boolean getIsGeneralNumericSort(boolean option) {
        this.push("GENERALNUMRICSORT");

        return option;
    }

    private boolean getIsReverse(boolean option) {
        this.push("REVERSE");

        return option;
    }

    private boolean getIsVersionSort(boolean option) {
        this.push("VERSIONSORT");

        return option;
    }

    private boolean getIsNumericSort(boolean option) {
        this.push("NUMBERICSORT");

        return option;
    }

    private boolean getIsIgnoreCase(boolean option) {
        this.push("IGNORECASE");

        return option;
    }

    private boolean getIsDictionaryOrder(boolean option) {
        this.push("DICTIONARYORDER");

        return option;
    }

    private boolean getIsIgnoreLeadingBlanks(boolean option) {
        this.push("IGNORELEADINGBLANKS");

        return option;
    }

    private boolean getIsUnique(boolean option) {
        this.push("UNIQUE");

        return option;
    }

    private boolean getIsMerge(boolean option) {
        this.push("MERGE");

        return option;
    }

    private boolean getIsCheck(boolean option) {
        this.push("CHECK");

        return option;
    }

    public static void main(String[] args) throws InterruptedException {
//        Sink.init();
//
//        Thread.sleep(1500);
//
//        CHECK = Source.getIsCheck(Boolean.valueOf(args[0]));
//        MERGE = Source.getIsMerge(Boolean.valueOf(args[1]));
//        UNIQUE = Source.getIsUnique(Boolean.valueOf(args[2]));
//        IGNORELEADINGBLANKS = Source.getIsIgnoreLeadingBlanks(Boolean.valueOf(args[3]));
//        DICTIONARYORDER = Source.getIsDictionaryOrder(Boolean.valueOf(args[4]));
//        IGNORECASE = Source.getIsIgnoreCase(Boolean.valueOf(args[5]));
//        NUMERICSORT = Source.getIsNumericSort(Boolean.valueOf(args[6]));
//        GENERALNUMERICSORT = Source.getIsGeneralNumericSort(Boolean.valueOf(args[7]));
//        HUMANNUMERICSORT = Source.getIsHumanNumericSort(Boolean.valueOf(args[8]));
//        MONTHSORT = Source.getIsMonthSort(Boolean.valueOf(args[9]));
//        VERSIONSORT = Source.getIsVersionSort(Boolean.valueOf(args[10]));
//        REVERSE = Source.getIsReverse(Boolean.valueOf(args[11]));
//
////        CHECK = Source.getIsCheck(false);
////        MERGE = Source.getIsMerge(true);
////        UNIQUE = Source.getIsUnique(false);
////        IGNORELEADINGBLANKS = Source.getIsIgnoreLeadingBlanks(false);
////        DICTIONARYORDER = Source.getIsDictionaryOrder(false);
////        IGNORECASE = Source.getIsIgnoreCase(false);
////        NUMERICSORT = Source.getIsNumericSort(false);
////        GENERALNUMERICSORT = Source.getIsGeneralNumericSort(false);
////        HUMANNUMERICSORT = Source.getIsHumanNumericSort(false);
////        MONTHSORT = Source.getIsMonthSort(true);
////        VERSIONSORT = Source.getIsVersionSort(true);
////        REVERSE = Source.getIsReverse(true);
//
//        boolean isCheck = CHECK;
//        boolean isMerge = MERGE;
//        boolean isUnique = UNIQUE;
//        boolean isIgnoreLeadingBlanks = IGNORELEADINGBLANKS;
//        boolean isDictionaryOrder = DICTIONARYORDER;
//        boolean isIgnoreCase = IGNORECASE;
//        boolean isNumericSort = NUMERICSORT;
//        boolean isGeneralNumericSort = GENERALNUMERICSORT;
//        boolean isHumanNumericSort = HUMANNUMERICSORT;
//        boolean isMonthSort = MONTHSORT;
//        boolean isVersionSort = VERSIONSORT;
//        boolean isReverse = REVERSE;
//
//        SortArguments sortArgs = new SortArguments(isCheck, isMerge, isUnique, isIgnoreLeadingBlanks,
//                isDictionaryOrder, isIgnoreCase, isNumericSort,
//                isGeneralNumericSort, isHumanNumericSort, isMonthSort,
//                isVersionSort, isReverse);
//        sortArgs.setPaths(System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/sort/files/*.txt");
//        SortCommand sort = new SortCommand(sortArgs);
//
//        DefaultExecutionContext executionContext = new DefaultExecutionContext();
//
//        StdOutput out = new StdOutput();
//        LineProcessor exec = sort.execute(executionContext, out);
//
//        try {
//            exec.finish();
//        }
//        catch(ExitValueException eve) {
//            eve.printStackTrace();
//        }
    }
}
