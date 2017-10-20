package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 4 regions are left
 */
public class Regions13 {

    static boolean A;
    static boolean B;

    public static void main(String[] args) throws InterruptedException {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));
        B = Source.getOptionB(Boolean.valueOf(args[1]));

        boolean a = false;
        boolean b = false;

        if(A) { // A
            a = true;
        }

        if(B) { // B
            b = true;
        }

        foo(a, b);
        moo(false);
    }

    public static void foo(boolean x, boolean y) throws InterruptedException {
        if(x) { // A
            Thread.sleep(1000);
            moo(y);
        }
    }

    private static void moo(boolean l) throws InterruptedException {
        if(l) { // AB
            Thread.sleep(2000);
            System.out.println();
        }
    }

}
