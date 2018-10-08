package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions26 {

    static boolean A;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));

        boolean a = false;

        if(A) { // A
            a = true;
        }

        System.out.println("1");
        moo(a);

        System.out.println("2");
    }

    private static void moo(boolean a) {
        System.out.println("3");

        if(a) {
            System.out.println("4");
        }

        System.out.println("5");
    }


}
