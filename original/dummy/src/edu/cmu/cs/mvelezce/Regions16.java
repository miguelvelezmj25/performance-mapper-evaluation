package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 5 regions are left
 */
public class Regions16 {

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

        moo(a, b);
    }

    private static void moo(boolean a, boolean b) {
        foo(a, b);
    }

    private static void foo(boolean a, boolean b) {
        mar(a);
        bar(b);
    }

    private static void mar(boolean x) {
        if(x) { // A
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void bar(boolean x) {
        if(x) { // B
            try {
                Thread.sleep(5000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}