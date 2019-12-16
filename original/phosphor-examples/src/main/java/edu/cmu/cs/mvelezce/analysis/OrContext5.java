package edu.cmu.cs.mvelezce.analysis;

public class OrContext5 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);

    int x = 0;

    if (A) {
      x = 1;
    }

    if (B) {
      x = 2;
    }

    if (x > 0) {
      foo(A);
    }

    if (x > 1) {
      foo(B);
      foo(C);
    }
  }

  private static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
