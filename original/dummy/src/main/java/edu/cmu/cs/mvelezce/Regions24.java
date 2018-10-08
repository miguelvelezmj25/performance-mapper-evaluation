package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.io.ByteArrayOutputStream;

public class Regions24 {

    static boolean A;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));

        boolean a = false;

        if(A) { // A
            a = true;
        }

        String s = "miguel";
        boolean x = false;

        Args as = new Args(a);

        if(as == null) {
            System.out.println();
        }

        as.exec(s, x);

    }

}