package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.unix4j.Unix4j;
import org.unix4j.builder.Unix4jCommandBuilder;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.unix.Find;
import org.unix4j.unix.find.*;

import java.util.Calendar;
import java.util.Date;

/**
 * CAT
 * FIND
 * GREP
 * LS
 * SED
 * SORT
 * UNIQ
 * XARGS
 */
public class FindMain {

    public static boolean D = true;
    public static boolean I = true;
    public static boolean O = true;

    public static void main(String[] args) {

        D = Source.getOptionD(Boolean.valueOf(args[0]));
        I = Source.getOptionI(Boolean.valueOf(args[1]));
        O = Source.getOptionO(Boolean.valueOf(args[2]));

        Unix4jCommandBuilder res;
        FindOptions.Default findOptions = new FindOptions.Default();

        if(D) {
            findOptions.set(FindOption.typeDirectory);
        }

        if(I) {
            findOptions.set(FindOption.ignoreCase);
        }

        if(O) {
            findOptions.set(FindOption.timeOlder);
        }


//        if(Sink.getDecision(D)) {
//            System.out.println(":");
//        }
//
//        if(Sink.getDecision(I)) {
//            System.out.println(":");
//        }
//
//        if(Sink.getDecision(O)) {
//            System.out.println(":");
//        }

        if(Sink.getDecision(findOptions.asSet() == null)) {
            System.out.println(":");
        }

        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 1); // to get previous year add -1
        Date tomorrow = cal.getTime();

        res = Unix4j.find(findOptions, ".", tomorrow, "find");
//        res = Unix4j.find(Find.Options.ignoreCase, ".", new Date(), "find");


//        if(Sink.getDecision(D)) {
//            System.out.println(":");
//        }
//
//        if(Sink.getDecision(I)) {
//            System.out.println(":");
//        }
//
//        if(Sink.getDecision(O)) {
//            System.out.println(":");
//        }
//
//        if(Sink.getDecision(findOptions == null)) {
//            System.out.println(":");
//        }

//        res = Unix4j.find(Find.Options.typeDirectory, ".", "find");
//        res = Unix4j.find(".", "find");
        res.toStdOut();


//        if(Sink.getDecision(D)) {
//            System.out.println(":");
//        }
//
//        if(Sink.getDecision(I)) {
//            System.out.println(":");
//        }
//
//        if(Sink.getDecision(O)) {
//            System.out.println(":");
//        }
//
//        if(Sink.getDecision(findOptions == null)) {
//            System.out.println(":");
//        }

    }
}
