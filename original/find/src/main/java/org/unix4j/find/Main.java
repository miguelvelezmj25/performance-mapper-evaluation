package org.unix4j.find;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.unix4j.find.context.DefaultExecutionContext;
import org.unix4j.find.io.StdOutput;
import org.unix4j.find.processor.LineProcessor;
import org.unix4j.find.unix.find.FindArguments;
import org.unix4j.find.unix.find.FindCommand;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Sink.init();

        long start = System.nanoTime();

        boolean isTypeDirectory = Source.getIsTypeDirectory(Boolean.valueOf(args[0]));
        boolean isTypeFile = Source.getIsTypeFile(Boolean.valueOf(args[1]));
        boolean isTypeSymlink = Source.getIsTypeSymlink(Boolean.valueOf(args[2]));
        boolean isTypeOther = Source.getIsTypeOther(Boolean.valueOf(args[3]));
        boolean isRegex = Source.getIsRegex(Boolean.valueOf(args[4]));
        boolean isIgnoreCase = Source.getIsIgnoreCase(Boolean.valueOf(args[5]));
        boolean isTimeNewer = Source.getIsTimeNewer(Boolean.valueOf(args[6]));
        boolean isTimeOlder = Source.getIsTimeOlder(Boolean.valueOf(args[7]));
        boolean isTimeCreate = Source.getIsTimeCreate(Boolean.valueOf(args[8]));
        boolean isTimeAccess = Source.getIsTimeAccess(Boolean.valueOf(args[9]));
        boolean isTimeModified = Source.getIsTimeModified(Boolean.valueOf(args[10]));
        boolean isPrint0 = Source.getIsPrint0(Boolean.valueOf(args[11]));

//        boolean isTypeDirectory = Source.getIsTypeDirectory(false);
//        boolean isTypeFile = Source.getIsTypeFile(false);
//        boolean isTypeSymlink = Source.getIsTypeSymlink(false);
//        boolean isTypeOther = Source.getIsTypeOther(false);
//        boolean isRegex = Source.getIsRegex(false);
//        boolean isIgnoreCase = Source.getIsIgnoreCase(false);
//        boolean isTimeNewer = Source.getIsTimeNewer(false);
//        boolean isTimeOlder = Source.getIsTimeOlder(false);
//        boolean isTimeCreate = Source.getIsTimeCreate(false);
//        boolean isTimeAccess = Source.getIsTimeAccess(false);
//        boolean isTimeModified = Source.getIsTimeModified(false);
//        boolean isPrint0 = Source.getIsPrint0(false);

        FindArguments findArgs = new FindArguments(isTypeDirectory, isTypeFile, isTypeSymlink,
        isTypeOther,  isRegex, isIgnoreCase, isTimeNewer, isTimeOlder,
        isTimeCreate, isTimeAccess, isTimeModified, isPrint0);
        findArgs.setPath("/DATA/energy/sac_results/nbody100c");
        findArgs.setSize(25000);

        String name = "*E*";

        if(isRegex) {
            name = ".*E.*";
        }

        findArgs.setName(name);
        Date date = new GregorianCalendar(2017, Calendar.JUNE, 11).getTime();
        findArgs.setTime(date);
        FindCommand find = new FindCommand(findArgs);

        DefaultExecutionContext executionContext = new DefaultExecutionContext();

        StdOutput out = new StdOutput();
        LineProcessor exec = find.execute(executionContext, out);

        exec.finish();

        long end = System.nanoTime();

//        org.unix4j.find.testing.Main.main(args);

        System.out.println((end - start) / 1000000000.0);
    }
}
