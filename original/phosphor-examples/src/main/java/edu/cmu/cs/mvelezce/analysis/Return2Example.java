package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Return2Example {

  public static void main(String[] args) {
    boolean x = Sources.L_11(Boolean.valueOf(args[0]));

    if (x || !x) {
      return;
    }

    Sinks.postProcessSinks("return2Example");
  }
}
