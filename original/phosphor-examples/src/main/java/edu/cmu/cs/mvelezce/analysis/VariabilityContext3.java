package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class VariabilityContext3 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    int x = 0;

    if (A) {
      if (B) {
        foo(2);
      }
      if (C) {
        foo(4);
      }
    }
  }

  private static void foo(int x) {
    while (x > 0) {
      System.out.println(1);
      x--;
    }
  }
}
