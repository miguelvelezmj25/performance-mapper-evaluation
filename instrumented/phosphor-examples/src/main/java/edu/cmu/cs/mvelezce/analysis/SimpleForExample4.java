package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleForExample4 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    int x;

    if (A) {
      x = 4;
    } else {
      x = 2;
    }

    while (x > 0) {
      if (B) {
        System.out.println();
      }

      x--;
    }
  }
}
