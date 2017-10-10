package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Can remove all inner regions and left 1 outer region
 */
public class Regions1 {

    public static void main(String[] args) {
        Sink.init();

        boolean A = Source.getOptionA(true);
        boolean B = Source.getOptionB(true);
        boolean C = Source.getOptionC(true);
        boolean D = Source.getOptionD(true);

        int i = 0;

        if(A) { // A
            i++;

            if(B) { // AB
                i++;
                if(C) { // ABC
                    i++;
                }
            }

            if(B) { // AB
                i++;
            }
        }
    }

}
