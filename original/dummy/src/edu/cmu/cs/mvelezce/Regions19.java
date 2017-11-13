package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions19 {

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

        if(C) {
            c = true;
        }

        if(A) { // A
            a = true;
        }

        if(B) { // B
            b = true;
        }

        if(Math.random() == 0) {
            while(a) {
                double d = Math.random();

                if(d == 0) {
                    a = false;
                }
            }
        }

        if(b) {
            System.out.println();
        }
    }
}