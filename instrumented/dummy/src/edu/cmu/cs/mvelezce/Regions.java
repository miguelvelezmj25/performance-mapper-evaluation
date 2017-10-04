package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions {

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
