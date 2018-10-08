package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions25 {

    static boolean A;
    static boolean B;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));
        B = Source.getOptionB(Boolean.valueOf(args[1]));

        boolean a = false;
        boolean b = false;

        if(A) { // A
            a = true;
        }

//        if(B) {
//            b = false;
//        }

        System.out.println("1");
        moo(a/*, b*/);

        if(B) {
            b = false;
        }

        System.out.println(b);
    }

    private static void moo(boolean a/*, boolean b*/) {
        System.out.println("3");

        if(a) {
            System.out.println("4");
        }

        System.out.println("5");

//        if(b) {
//            System.out.println("6");
//        }
//
//        System.out.println("7");
    }


}
