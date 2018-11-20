package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Trace {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    if (A) {
      foo();
      foo();
    }

  }

  private static void foo() {
    boolean x = true;

    if (x) {
      System.out.println();
    }
  }
}
