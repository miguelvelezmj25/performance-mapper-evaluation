package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.io.ByteArrayOutputStream;

public class Regions23 {

    static boolean A;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));

        boolean a = false;

        if(A) { // A
            a = true;
        }

        moo(a);
    }

    private static void moo(boolean a) {
        Object d = new Object();
        
        if(Math.random() == 0) {
            d = 0;
        }
        try {
            Sink.sink(a);
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            byte[] b = bytes.toByteArray();
        } catch (Exception exception) {
            throw new Error("Unable to serialize transaction", exception);
        }
    }


}