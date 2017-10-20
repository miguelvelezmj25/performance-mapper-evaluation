package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 1 region is left
 */

public class Regions8 {

    static boolean A = Source.getOptionA(true);
    static boolean B = Source.getOptionB(true);

    public static void main(String[] args) {
        Sink.init();

        if(A) { // A
            foo();
        }

        if(A) { // A
            foo();
        }
    }

    private static void foo() {
        if(B) { // AB
            System.out.println();
        }
    }
}
