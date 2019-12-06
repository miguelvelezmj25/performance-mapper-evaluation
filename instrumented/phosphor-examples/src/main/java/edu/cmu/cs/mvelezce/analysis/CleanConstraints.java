package edu.cmu.cs.mvelezce.analysis;

public class CleanConstraints {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A) {
      System.out.println();
    }

    foo(A, B);
  }

  private static void foo(boolean a, boolean b) {
    if (a || b) {
      System.out.println();
    }
  }
}
