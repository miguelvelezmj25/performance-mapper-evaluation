package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class TestPrintExample {

  public static void main(String[] args) {
    boolean z = Sources.L_11(Boolean.valueOf(args[0]));

    int i = 0;
    if (z) {
      i++;
    }
    if (z) {
      System.out.println(i);
    }
    else {
      System.out.println(i);
    }
  }
}
