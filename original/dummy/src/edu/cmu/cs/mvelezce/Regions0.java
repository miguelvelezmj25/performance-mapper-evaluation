package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 *  Tested that the inner regions B,B,C,D cannot be removed since they have different options affecting them.
 *  Region D can be removed since it is inside C and the options in C are a subset of the options in D.
 */
public class Regions0 {

    public static void main(String[] args) {
        Sink.init();

        boolean A = Source.getOptionA(true);
        boolean B = Source.getOptionB(true);
        boolean C = Source.getOptionC(true);
        boolean D = Source.getOptionD(true);

        int i = 0;

        if(A) {
            i++;

            if(B) {
                i++;
            }

            if(B) {
                i++;
            }

            if(C) {
                i++;
                if(D) {
                    i++;
                }
            }
        }
    }

}
