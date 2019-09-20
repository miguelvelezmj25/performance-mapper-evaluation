package edu.cmu.cs.mvelezce.analysis;

public class VariabilityContext1 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean x = true;

    if (A) {
      foo(x);
      foo(x);
    }
  }

  private static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
