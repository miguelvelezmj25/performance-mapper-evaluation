package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions22 {

    static boolean A;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));

        boolean a = false;

        if(A) { // A
            a = true;
        }

        moo();
    }

    private static void moo() {
        System.out.println("Test");
    }


}