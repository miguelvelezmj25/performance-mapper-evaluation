package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions7 {

    static boolean A = Source.getOptionA(true);

    public static void main(String[] args) {
        Sink.init();

        boolean x = false;
        boolean y = false;

        if(A) {
            x = true;
        }
        else {
            x = false;
        }

        if(x) {
            y = !x;
        }

        if(y) {
            System.out.println();
        }

    }


}
