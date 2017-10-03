package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions3 {

    static boolean A = Source.getOptionA(true);
    static boolean B = Source.getOptionB(true);
    static boolean C = Source.getOptionC(true);
    static boolean D = Source.getOptionD(true);

    public static void main(String[] args) {
        Sink.init();

        if(A) { // A
            foo();
        }
    }

    private static void foo() {
        if(B) { // AB
            moo();
        }

        if(C) { // AC
            moo();
        }
    }

    private static void moo() {
        if(D) { // ABCD
            System.out.println();
        }
    }
}
