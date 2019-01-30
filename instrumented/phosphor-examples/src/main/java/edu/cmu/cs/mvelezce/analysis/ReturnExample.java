package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class ReturnExample {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));

    if (A) {
      return;
    }
    if (!A) {
      return;
    }
  }
}
