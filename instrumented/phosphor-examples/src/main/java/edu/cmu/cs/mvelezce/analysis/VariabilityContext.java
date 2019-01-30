package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class VariabilityContext {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));
    boolean D = Sources.D_3(Boolean.valueOf(args[3]));
    boolean E = Sources.E_4(Boolean.valueOf(args[4]));

    if (A) {
      foo(B);
      foo(C);
    }

    if (D) {
      foo(E);
    }
  }

  static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
