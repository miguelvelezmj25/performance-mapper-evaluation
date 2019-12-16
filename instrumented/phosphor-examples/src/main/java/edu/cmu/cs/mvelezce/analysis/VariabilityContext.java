package edu.cmu.cs.mvelezce.analysis;

public class VariabilityContext {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);
    boolean D = Boolean.parseBoolean(args[3]);
    boolean E = Boolean.parseBoolean(args[4]);

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
