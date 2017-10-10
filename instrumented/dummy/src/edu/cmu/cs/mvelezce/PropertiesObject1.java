package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class PropertiesObject1 {

    public static final Fields DEFAULT = new Fields();

    public static void main(String[] args) {
        Sink.init();

        boolean A = Source.getOptionA(true);
        boolean B = Source.getOptionB(true);

        boolean a = false;
        boolean b = false;

        if(A) {
            a = true;
        }

        if(B) {
            b = true;
        }

        Fields f = null;

        if(A && B) {
            f = new Fields();
        }

        if(f != null) {
            Sink.sink(f);
            Sink.sink(f.isA());
            Sink.sink(f.isB());
            Sink.sink(f.isC());

        }

    }

}
