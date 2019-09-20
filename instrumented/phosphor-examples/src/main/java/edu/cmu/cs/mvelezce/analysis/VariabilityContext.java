package edu.cmu.cs.mvelezce.analysis;

public class VariabilityContext {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);
    boolean C = Boolean.valueOf(args[2]);
    boolean D = Boolean.valueOf(args[3]);
    boolean E = Boolean.valueOf(args[4]);

    if (A) {
      foo(B);
      foo(C);
    }

    if (D) {
      foo(E);
    }
  }

  static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
