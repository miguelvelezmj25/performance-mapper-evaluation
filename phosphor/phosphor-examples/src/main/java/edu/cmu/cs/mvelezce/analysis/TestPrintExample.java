package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class TestPrintExample {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));

    int i = 0;
    if (A) {
      i++;
    }
    if (A) {
      System.out.println(i);
    }
    else {
      System.out.println(i);
    }
  }
}
