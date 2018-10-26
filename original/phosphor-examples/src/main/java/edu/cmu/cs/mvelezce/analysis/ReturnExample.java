package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class ReturnExample {

  public static void main(String[] args) {
    boolean z = Sources.L_11(Boolean.valueOf(args[0]));

    if (z) {
      return;
    }
    if (!z) {
      return;
    }

    Sinks.postProcessSinks("returnExample");
  }
}
