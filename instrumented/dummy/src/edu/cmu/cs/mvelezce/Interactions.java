package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Interactions {

    static boolean A = Source.getOptionA(true);

    private transient Object a = null;

    protected Interactions(boolean x) {
        if(x == false) {
            a = x;
        }
    }

    public static void main(String[] args) {
        Sink.init();

        boolean a = false;

        if(A) {
            a = true;
        }

        Interactions i = new Interactions(a);
        i.moo();
    }

    public void foo() {
        if(a != null) {
            System.out.println();
        }
    }

    public void moo() {
        System.out.println();
    }
}
