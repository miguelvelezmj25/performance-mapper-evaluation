package edu.cmu.cs.mvelezce.analysis;

/**
 * This program shows why we need to track the beginning and end of a control flow decision for
 * accurate results.
 */
public class Subtraces2 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);
    boolean C = Boolean.valueOf(args[2]);

    if (A) {
      System.out.println(1);
      foo(B);
      foo(C);
    }
  }

  private static void foo(boolean x) {
    if (x) {
      System.out.println(4);
    }
  }
}
