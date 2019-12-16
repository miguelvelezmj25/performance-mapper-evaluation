package edu.cmu.cs.mvelezce.analysis;

public class MultiFacets {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);

    boolean y = true;
    boolean z = true;

    if (A) { // 1
      y = false;
    }

    if (y) { // 2
      z = false;
    }

    if (z) { // 3
      System.out.println(1);
    }
  }
}
