package edu.cmu.cs.mvelezce.analysis;

public class AndContext {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);
    boolean C = Boolean.valueOf(args[2]);
    boolean D = Boolean.valueOf(args[3]);

    if (A && B) {
      foo(D);
    }

    if (A && C) {
      foo(D);
    }
  }
  private static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
