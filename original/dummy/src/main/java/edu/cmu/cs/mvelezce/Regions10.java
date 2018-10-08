package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions10 {

    private static boolean A = Source.getOptionA(true);
    private static boolean B = Source.getOptionB(true);
    private static boolean C = Source.getOptionC(true);

    public static void main(String[] args) {
        Sink.init();

        if(A) { // A
            foo();
        }

        if(B) { // B
            System.out.println();
        }

        foo();
    }

    private static void foo() {
        if(C) { // AC
            System.out.println();
        }
    }

}
