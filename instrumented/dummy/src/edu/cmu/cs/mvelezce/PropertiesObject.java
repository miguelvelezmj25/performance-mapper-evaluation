package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class PropertiesObject {

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

        Fields f = new Fields(a, b);

        Sink.sink(f);
        Sink.sink(f.isA());
        Sink.sink(f.isB());
        Sink.sink(f.isC());

        Fields f1;

        if(f != null) {
            f1 = f.clone();
        }
        else {
            f1 = PropertiesObject.DEFAULT;
        }

        Sink.sink(f1);
        Sink.sink(f1.isA());
        Sink.sink(f1.isB());
        Sink.sink(f1.isC());

    }


}
