package edu.cmu.cs.mvelezce.analysis;

public class StaticMethodCall {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A) {
      foo(B);
    }
  }

  private static void foo(boolean b) {
    if (b) {
      System.out.println();
    }
  }
}
