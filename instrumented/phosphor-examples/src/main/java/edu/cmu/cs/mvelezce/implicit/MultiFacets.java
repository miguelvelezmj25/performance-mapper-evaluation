package edu.cmu.cs.mvelezce.implicit;

public class MultiFacets {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);

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
