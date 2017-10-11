package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Remove regions. 3 regions are left
 */
public class Regions11 {

    static boolean A;
    static boolean B;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(true);
        B = Source.getOptionB(true);

        boolean a = false;
        boolean b = false;

        if(A) { // A
            a = true;
        }

        if(B) { // B
            b = true;
        }

        foo(a, b);
    }

    public static void foo(boolean x, boolean y) {
        if(x) { // A
            boo(y);
        }
    }

    public static void boo(boolean decision) {
        if(decision) { // AB
            System.out.println();
        }
    }

}
