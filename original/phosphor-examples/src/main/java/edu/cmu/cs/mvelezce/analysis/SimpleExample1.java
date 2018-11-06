package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleExample1 {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));

    boolean x = false;

    if (A) {
      if (x) {
        Thread.sleep(1);
      }
    }

    int i = 5;

    while (i > 0) {
      if (i > 3) {
        Thread.sleep(1);
      }

      i--;
    }
  }
}
