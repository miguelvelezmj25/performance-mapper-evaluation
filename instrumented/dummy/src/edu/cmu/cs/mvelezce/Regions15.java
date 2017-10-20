package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 5 regions are left
 */
public class Regions15 {

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

        if(a) { // A
            if(b) { // AB
                System.out.println();
            }

            if(c) { // AC
                System.out.println();
            }
        }
    }

}