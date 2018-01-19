package org.unix4j.find;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.unix4j.find.context.DefaultExecutionContext;
import org.unix4j.find.io.StdOutput;
import org.unix4j.find.processor.LineProcessor;
import org.unix4j.find.unix.find.FindArguments;
import org.unix4j.find.unix.find.FindCommand;

public class Main {

    public static void main(String[] args) {
        Sink.init();

        boolean isTypeDirectory = Source.getIsTypeDirectory(false);
        boolean isTypeFile = Source.getIsTypeFile(false);
        boolean isTypeSymlink = Source.getIsTypeSymlink(false);
        boolean isTypeOther = Source.getIsTypeOther(false);
        boolean isRegex = Source.getIsRegex(false);
        boolean isIgnoreCase = Source.getIsIgnoreCase(false);
        boolean isTimeNewer = Source.getIsTimeNewer(false);
        boolean isTimeOlder = Source.getIsTimeOlder(false);
        boolean isTimeCreate = Source.getIsTimeCreate(false);
        boolean isTimeAccess = Source.getIsTimeAccess(false);
        boolean isTimeModified = Source.getIsTimeModified(false);
        boolean isPrint0 = Source.getIsPrint0(false);

        FindArguments findArgs = new FindArguments(isTypeDirectory, isTypeFile, isTypeSymlink,
        isTypeOther,  isRegex, isIgnoreCase, isTimeNewer, isTimeOlder,
        isTimeCreate, isTimeAccess, isTimeModified, isPrint0);
        findArgs.setPath(".");
        FindCommand find = new FindCommand(findArgs);

        DefaultExecutionContext executionContext = new DefaultExecutionContext();

        StdOutput out = new StdOutput();
        LineProcessor exec = find.execute(executionContext, out);

        exec.finish();
    }
}
