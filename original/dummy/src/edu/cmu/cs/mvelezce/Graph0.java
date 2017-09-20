package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Graph0 {

    public static boolean A = false;
    public static boolean B = false;
    public static boolean C = false;
    public static boolean D = false;
    public static boolean E = false;

    public static void main(String[] args) throws InterruptedException {
        Sink.init();
        boolean A = Source.getOptionA(Boolean.valueOf(args[0]));

        if(A) {
            Thread.sleep(1);
            return;
        }

        Thread.sleep(2);
    }

}
