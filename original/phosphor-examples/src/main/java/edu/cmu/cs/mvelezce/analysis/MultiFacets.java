package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class MultiFacets {

  public static void main(String[] args) throws InterruptedException {
    boolean x = Sources.A_0(Boolean.valueOf(args[0]));

    boolean y = true;
    boolean z = true;

    if (x) { // A
      y = false;
    }

    if (y) { // A
      z = false;
    }

    if (z) { // A
      Thread.sleep(100);
    }

  }
}
