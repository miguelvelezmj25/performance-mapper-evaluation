package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class AssertTest2Example {

  public static void main(String[] args) {
    boolean z = Sources.L_11(Boolean.valueOf(args[0]));

    if (z) {
      if (!z) {
        System.out.println(false);
      }
    }
  }
}
