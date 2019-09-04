package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class OrContext {

  public static void main(String[] args) {
    Sinks.preProcessSinks(OrContext.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    int x = 1;

    if (A) {
      x = -1;
    }

    if (B) {
      x = 0;
    }

    if (x > 0) {
      if (C) {
        System.out.println();
      }
    }
  }
}
