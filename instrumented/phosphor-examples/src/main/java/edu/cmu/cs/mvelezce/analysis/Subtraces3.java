package edu.cmu.cs.mvelezce.analysis;

public class Subtraces3 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    if (A) {
      foo(4);
    }

    if (B) {
      foo(2);
    }
  }

  private static void foo(int x) {
    for (int i = 0; i < x; i++) {
      System.out.println();
    }
  }
}
