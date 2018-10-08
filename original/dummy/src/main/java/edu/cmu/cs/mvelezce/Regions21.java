package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Regions21 {

    static boolean A;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));

        int m = 5;

        if(A) { // A
            m = 20;
        }

        for(int i = 0; i < m; i++) {
            if(m % 2 == 0) {
                System.out.println();
            }
        }
    }
}