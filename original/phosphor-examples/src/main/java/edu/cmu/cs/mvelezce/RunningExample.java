package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.taints.Sources;

public class RunningExample {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    boolean x = false;
    System.out.println(100);

    if (A) { // 1
      System.out.println(100);
      x = true;
      foo(B);
    }

    if (x) { // 2
      System.out.println(100);
    }

  }

  private static void foo(boolean b) {
    if (b) { // 1
      System.out.println(100);
    }
  }
}
