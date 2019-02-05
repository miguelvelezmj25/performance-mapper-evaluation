package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Subtraces {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    int x = 0;

    if (A) {
      System.out.println(1);
      x = 1;
      foo(C);
    }

    if (B) {
      System.out.println(2);
      x = 2;
      foo(C);
    }

    if (x > 0) {
      System.out.println(3);
    }
  }

  private static void foo(boolean x) {
    if (x) {
      System.out.println(4);
    }
  }
}
