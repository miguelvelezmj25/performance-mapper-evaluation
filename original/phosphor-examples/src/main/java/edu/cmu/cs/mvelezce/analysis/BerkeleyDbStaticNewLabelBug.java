package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Trivial {

  public static void main(String[] args) {
    Sinks.preProcessSinks("Trivial");

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    if (A) {
      System.out.println();
    }

    if (B) {
      System.out.println();
    }
  }
}
