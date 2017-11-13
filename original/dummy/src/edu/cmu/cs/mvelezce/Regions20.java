package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions20 {

    static boolean A;
    static boolean B;
    static boolean C;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));
        B = Source.getOptionB(Boolean.valueOf(args[0]));
        C = Source.getOptionC(Boolean.valueOf(args[0]));

        boolean a = false;
        boolean b = false;
        boolean c = false;


        if(A) { // A
            a = true;
        }

        if(B) { // B
            b = true;
        }

        if(C) {
            c = true;
        }

        foo(a, b, c);
    }

    private static void foo(boolean a, boolean b, boolean c) {
        if(a) {
            moo(a, b, c);
        }

        bar(a, c);
    }

    private static void moo(boolean a, boolean b, boolean c) {
        if(a) {
            bar(a, c);
        }

        if(a && b) {
            System.out.println();
        }
    }

    private static void bar(boolean a, boolean c) {
        if(a) {
            System.out.println();
        }

        if(a && c) {
            System.out.println();
        }
    }
}