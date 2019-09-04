package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Implicit2 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    int x = 0;

    if (A) {
      x = 1;
    }

    if (B) {
      x = 2;
    }

    if (x > 0) {
      System.out.println();
    }
  }
}
