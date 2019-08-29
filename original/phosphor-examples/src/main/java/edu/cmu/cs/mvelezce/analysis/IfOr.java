package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class IfOr {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    if (A || B) {
      System.out.println("True");
    }
    else {
      System.out.println("False");
    }

    System.out.println("End");
  }
}
