package edu.cmu.cs.mvelezce.analysis;

public class AndContext {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);
    boolean D = Boolean.parseBoolean(args[3]);

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
