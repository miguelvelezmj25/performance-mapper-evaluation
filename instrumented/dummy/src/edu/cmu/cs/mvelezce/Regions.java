package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 1 Region is left in the main method
 */
public class Regions {

    static boolean A;
    static boolean B;
    static boolean C;
    static boolean D;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(true);
        B = Source.getOptionB(true);
        C = Source.getOptionC(true);
        D = Source.getOptionD(true);

        if(A) { // A
            foo();
        }
    }

    private static void foo() {
        if(B) { // AB
            woo();
        }
    }

    private static void woo() {
        if(C) { // ABC
            bar();
        }
    }

    private static void bar() {
        if(D) { // ABCD
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
