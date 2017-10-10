package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions5 {

    static boolean A = Source.getOptionA(true);

    public static void main(String[] args) {
        Sink.init();

        int x = 0;

        if(A) {
            x = 20;
        }
        else {
            x = 10;
        }

        int i = 0;

        while(i < x) {
            System.out.println();
            i++;
        }

    }

}
