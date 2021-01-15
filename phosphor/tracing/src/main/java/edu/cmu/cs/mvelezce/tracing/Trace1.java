package edu.cmu.cs.mvelezce.tracing;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Trace1 {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(Trace1.class.getSimpleName());

    boolean A = Sources.A_0(false);

    if (A) {
      System.out.println("Hello");
    }

    SinkManager.postProcessSinks();
  }
}
