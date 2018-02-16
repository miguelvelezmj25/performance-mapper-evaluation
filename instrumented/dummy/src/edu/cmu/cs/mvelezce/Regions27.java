package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 2 regions are left
 */
public class Regions27 {

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

        }

        if(C) {
            if(D) {
                i++;
            }
        }
    }
}
