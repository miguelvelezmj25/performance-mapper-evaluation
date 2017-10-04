package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions2 {

    static boolean A = Source.getOptionA(true);
    static boolean B = Source.getOptionB(true);
    static boolean C = Source.getOptionC(true);

    public static void main(String[] args) {
        Sink.init();

        if(A) { // A
            foo();
        }

        if(B) { // B
            foo();
        }
    }

    private static void foo() {
        if(C) { // ABC
            System.out.println();
        }
    }

}
