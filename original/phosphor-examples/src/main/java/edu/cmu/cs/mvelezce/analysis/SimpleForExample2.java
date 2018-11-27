package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleForExample2 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));

    int count = 1;

    if (A) {
      count = 4;
    }

    for (int i = 0; i <= count; i++) {
      System.out.print("");
    }
  }
}
