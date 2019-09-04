package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Nested {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    if (A) {
      if (B) {
        System.out.println("Some");
      }
    }
  }
}
