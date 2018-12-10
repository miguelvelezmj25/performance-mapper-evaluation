package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class OrContext3 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    int x = 0;

    if (A) {
      x = 1;
    }

    if (B) {
      x = 1;
    }

    while (x > 0) {
      if (C) {
        System.out.println();
      }

      x--;
    }
  }
}
