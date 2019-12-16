package edu.cmu.cs.mvelezce.analysis;

public class VariabilityContext2 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);

    if (A) {
      foo(C);
    }

    if (B) {
      foo(C);
    }
  }

  static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
