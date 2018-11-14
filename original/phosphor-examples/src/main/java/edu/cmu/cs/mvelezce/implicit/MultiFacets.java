package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.taints.Sources;

public class MultiFacets {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));

    boolean x = A;
    boolean y = true;
    boolean z = true;

    if (x) {
      y = false;
    }

    if (y) {
      z = false;
    }

  }
}
