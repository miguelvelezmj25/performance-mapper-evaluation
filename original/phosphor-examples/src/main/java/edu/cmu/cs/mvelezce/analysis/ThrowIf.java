package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class ThrowIf {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    if (A) {
      throw new RuntimeException("A is enabled");
    }

    if (B) {
      System.out.println();
    }
  }

}
