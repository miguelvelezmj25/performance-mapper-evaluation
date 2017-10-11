package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 *  Removing regions. 2 regions are left
 */
public class Regions9 {

    public static void main(String[] args) {
        Sink.init();

        boolean A = Source.getOptionA(true);
        boolean B = Source.getOptionB(true);

        if(A) { // A
            System.out.println();
        }

        if(A) { // A
            System.out.println();
        }

        if(B) { // B
            System.out.println();
        }

        if(B) { // B
            System.out.println();
        }

        if(B) { // B
            System.out.println();
        }
    }

}
