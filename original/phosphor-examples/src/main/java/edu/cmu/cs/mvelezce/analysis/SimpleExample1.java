package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleExample1 {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    boolean x = false;

    if (A) { // 1
      if (x) { // 2
        Thread.sleep(1);
      }
    }

    int i = 5;

    while (i > 0) { // 3
      if (i > 3) { // 4
        Thread.sleep(1);
      }

      i--;
    }

    int j;

    if (B) { // 5
      j = 5;
    }
    else {
      j = 2;
    }

    if (j > 0) { // 6
      Thread.sleep(1);
    }

    while (j > 0) { // 7
      if (j > 2) { // 8
        Thread.sleep(1);
      }

      j--;
    }

  }
}
