package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Interactions {

    static boolean A = Source.getOptionA(true);

    private transient Object a = null;

    public static void main(String[] args) {
        Sink.init();

        boolean a = false;

        if(A) {
            a = true;
        }

        Interactions i = new Interactions(a);
        i.moo();
    }

    protected Interactions(boolean x) {
        if(x == false) {
            a = x;
        }
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
