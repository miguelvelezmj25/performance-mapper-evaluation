package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 5 regions are left
 */
public class Regions12 {

    static boolean A;
    static boolean B;
    static boolean C;

    public static void main(String[] args) throws InterruptedException {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));
        B = Source.getOptionB(Boolean.valueOf(args[1]));
        C = Source.getOptionC(Boolean.valueOf(args[2]));

        boolean a = false;
        boolean b = false;
        boolean c = false;

        if(A) { // A
            a = true;
        }

        if(B) { // B
            b = true;
        }

        if(C) { // C
            c = true;
        }

        foo(a, b, c);
    }

    public static void foo(boolean x, boolean y, boolean z) throws InterruptedException {
        if(x) { // A
            Thread.sleep(1000);
            moo(z);
            boo(y);
        }
    }

    private static void moo(boolean l) throws InterruptedException {
        if(l) { // AC
            Thread.sleep(2000);
            System.out.println();
        }
    }

    public static void boo(boolean decision) throws InterruptedException {
        if(decision) { // AB
            Thread.sleep(3000);
            System.out.println();
        }
    }

}
