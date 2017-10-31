package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;

public class B implements I {
    @Override
    public void recieve(boolean a) {
        Sink.sink(a);
    }
}
