package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 *  Tested that the inner regions B,B,C,D cannot be removed since they have different options affecting them.
 *  Region D can be removed since it is inside C and the options in C are a subset of the options in D.
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
