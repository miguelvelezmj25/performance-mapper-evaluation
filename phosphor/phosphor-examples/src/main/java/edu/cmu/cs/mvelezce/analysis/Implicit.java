package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Implicit {

  public static void main(String[] args) {
    Sinks.preProcessSinks(Implicit.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    int x = 0;

    if (A) {
      x++;
    }

    if (B) {
      x++;
    }

    if (x > 0) {
      System.out.println();
    }
  }
}