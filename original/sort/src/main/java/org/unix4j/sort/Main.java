package org.unix4j.sort;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.unix4j.sort.context.DefaultExecutionContext;
import org.unix4j.sort.io.StdOutput;
import org.unix4j.sort.processor.LineProcessor;
import org.unix4j.sort.unix.sort.SortArguments;
import org.unix4j.sort.unix.sort.SortCommand;

public class Main {

    public static void main(String[] args) {
        Sink.init();

        boolean isCheck = Source.getIsCheck(false);
        boolean isMerge = Source.getIsMerge(false);
        boolean isUnique = Source.getIsUnique(false);
        boolean isIgnoreLeadingBlanks = Source.getIsIgnoreLeadingBlanks(false);
        boolean isDictionaryOrder = Source.getIsDictionaryOrder(false);
        boolean isIgnoreCase = Source.getIsIgnoreCase(false);
        boolean isNumericSort = Source.getIsNumericSort(false);
        boolean isGeneralNumericSort = Source.getIsGeneralNumericSort(false);
        boolean isHumanNumericSort = Source.getIsHumanNumericSort(false);
        boolean isMonthSort = Source.getIsMonthSort(false);
        boolean isVersionSort = Source.getIsVersionSort(false);
        boolean isReverse = Source.getIsReverse(false);

        String anna = "anna.txt";
        String bible = "bible.txt";
        String big = "big.txt";
        String don = "don.txt";
        String shak = "shak.txt";
        String war = "war.txt";
        String test = "test.txt";

        SortArguments sortArgs = new SortArguments(isCheck, isMerge, isUnique, isIgnoreLeadingBlanks,
                isDictionaryOrder, isIgnoreCase, isNumericSort,
                isGeneralNumericSort, isHumanNumericSort, isMonthSort,
                isVersionSort, isReverse);
        sortArgs.setPaths(anna, bible, big);
        SortCommand sort = new SortCommand(sortArgs);

        DefaultExecutionContext executionContext = new DefaultExecutionContext();

        StdOutput out = new StdOutput();
        LineProcessor exec = sort.execute(executionContext, out);

        exec.finish();
    }
}
