package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class ContextDataTaintsEqual {

  public static void main(String[] args) throws InterruptedException {
    SinkManager.preProcessSinks(ContextDataTaintsEqual.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));

    if (A) {
      if (A) {
        System.out.println();
      }
    }

    SinkManager.postProcessSinks();
  }
}
