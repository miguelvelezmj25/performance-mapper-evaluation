package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Subtraces5 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    int x = 1;

    if (A) {
      x = 2;
    }

    if (x > 0) {
      System.out.println();
    }

    if (B) {
      System.out.println();
    }
  }
}
