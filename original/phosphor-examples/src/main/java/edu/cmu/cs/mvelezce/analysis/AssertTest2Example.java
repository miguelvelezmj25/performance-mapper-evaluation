package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class AssertTest2Example {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean x = true;

    if (!A) {
      if (A) {
        System.out.println(false);
      }
    }
  }
}
