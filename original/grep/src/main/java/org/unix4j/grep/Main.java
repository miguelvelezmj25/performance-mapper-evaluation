package org.unix4j.grep;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.unix4j.grep.context.DefaultExecutionContext;
import org.unix4j.grep.io.StdOutput;
import org.unix4j.grep.processor.LineProcessor;
import org.unix4j.grep.unix.grep.GrepArguments;
import org.unix4j.grep.unix.grep.GrepCommand;

public class Main {

    public static void main(String[] args) {
        Sink.init();

        boolean isIgnoreCase = Source.getIsIgnoreCase(true);
        boolean isInvertMatch = Source.getIsInvertMatch(false);
        boolean isFixedStrings = Source.getIsFixedStrings(false);
        boolean isLineNumber = Source.getIsLineNumber(false);
        boolean isCount = Source.getIsCount(true);
        boolean isMatchingFiles = Source.getIsMatchingFiles(false);
        boolean isWholeLine = Source.getIsWholeLine(false);

//        DefaultUnix4jCommandBuilder u = new DefaultUnix4jCommandBuilder();
////        Unix4jCommandBuilder res = u.grep("name", "pom.xml");
//        Unix4jCommandBuilder res = u.grep(isIgnoreCase, isInvertMatch, isFixedStrings, isLineNumber, isCount,
//                isMatchingFiles, isWholeLine, "Name", "pom.xml");
//        res.toStdOut();

        String regexp = "heaven";
        String anna = "anna.txt";
        String bible = "bible.txt";
        String big = "big.txt";
        String don = "don.txt";
        String shak = "shak.txt";
        String war = "war.txt";

        GrepArguments grepArgs = new GrepArguments(isIgnoreCase, isInvertMatch, isFixedStrings, isLineNumber, isCount,
                isMatchingFiles, isWholeLine);
        grepArgs.setRegexp(regexp);
        grepArgs.setPaths(anna, bible, big, don, shak, war);
        GrepCommand grep = new GrepCommand(grepArgs);

        DefaultExecutionContext executionContext = new DefaultExecutionContext();

        StdOutput out = new StdOutput();
        LineProcessor exec = grep.execute(executionContext, out);

        exec.finish();
    }
}
