package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class ContextDataTaintsEqual {

  public static void main(String[] args) throws InterruptedException {
    Sinks.preProcessSinks(ContextDataTaintsEqual.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));

    if (A) {
      if (A) {
        System.out.println();
      }
    }

    Sinks.postProcessSinks();
  }
}
