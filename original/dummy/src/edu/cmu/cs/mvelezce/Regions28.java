package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 3 regions are left
 */
public class Regions28 {

    public static void main(String[] args) {
        Sink.init();

        boolean a = Source.getOptionA(true);
        boolean b = Source.getOptionB(true);

        foo(a, b);
        bar(a);
    }

    public static void foo(boolean a, boolean b) {
        moo(a);

        if(b) {
            System.out.println();
        }
    }

    public static void bar(boolean a) {
        if(a) {
            moo(a);
        }
    }


    public static void moo(boolean a) {
        if(a) {
            System.out.println();
        }
    }
}
