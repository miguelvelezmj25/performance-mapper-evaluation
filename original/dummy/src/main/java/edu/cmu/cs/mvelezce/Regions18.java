package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.util.LinkedList;
import java.util.List;

public class Regions18 {

    static boolean A;
    static boolean B;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));
        B = Source.getOptionB(Boolean.valueOf(args[0]));

        boolean a = false;
        boolean b = false;

        if(A) { // A
            a = true;
        }

        if(B) { // B
            b = true;
        }

        if(b) {
            System.out.println("b");
        }

        if(Math.random() == 0) {

            if(Math.random() == 0) {
                if(a) {
                    return;
                }
            }
            else {
                System.out.println("some");
            }
        }
    }
}