package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class VariabilityContext2 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    if (A) {
      foo(C);
    }

    if (B) {
      foo(C);
    }
  }

  static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
