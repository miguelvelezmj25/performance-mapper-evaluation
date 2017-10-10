package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions11 {

    public static void main(String[] args) {
        Sink.init();

        boolean A = Source.getOptionA(true);
        boolean B = Source.getOptionB(true);

        foo(A, B);
    }


    private static void foo(boolean a, boolean b) {
        moo(a, b);
    }

    private static void moo(boolean a, boolean b) {
        if(a) {
            boo(b);
        }
    }

    private static void boo(boolean b) {
        if(b) {
            System.out.println();
        }
    }


}
