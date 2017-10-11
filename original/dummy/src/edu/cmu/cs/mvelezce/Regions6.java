package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions6 {

    static boolean A = Source.getOptionA(true);

    public static void main(String[] args) {
        Sink.init();

        boolean x = false;

        if(A) {
            x = true;
        }
        else {
            x = false;
        }

        if(x) {
            x = !x;
        }

        if(x) {
            System.out.println();
        }

    }


}
