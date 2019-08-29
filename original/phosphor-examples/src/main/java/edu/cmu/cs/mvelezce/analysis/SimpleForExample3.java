package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleForExample3 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));

    int x;

    if (A) {
      x = 4;
    }
    else {
      x = 2;
    }

    while (x > 0) {
      x--;
    }

    System.out.println();
  }
}
