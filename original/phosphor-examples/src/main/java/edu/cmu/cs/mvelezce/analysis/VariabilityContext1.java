package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class VariabilityContext1 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));

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
