package edu.cmu.cs.mvelezce.analysis;

public class CanRemoveNestedConstraintsMultipleCallSites {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A) {
      foo(B);
    }

    if (A) {
      foo(B);
    }
  }

  private static void foo(boolean a) {
    if (a) {
      bar();
    }
  }

  private static void bar() {
    System.out.println();
  }
}
