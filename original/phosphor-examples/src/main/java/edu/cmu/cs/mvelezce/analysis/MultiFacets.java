package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class MultiFacets {

  public static void main(String[] args) throws InterruptedException {
    boolean x = Sources.A_0(Boolean.valueOf(args[0]));

    boolean y = true;
    boolean z = true;

    if (x) { // 1
      y = false;
    }

    if (y) { // 2
      z = false;
    }

    if (z) { // 3
      Thread.sleep(1);
    }

  }
}
