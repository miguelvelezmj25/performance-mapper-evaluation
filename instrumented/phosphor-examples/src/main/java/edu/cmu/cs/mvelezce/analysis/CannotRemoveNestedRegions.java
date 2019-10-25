package edu.cmu.cs.mvelezce.analysis;

public class CannotRemoveNestedRegions {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    foo(A);

    if (B) {
      System.out.println();
    }
  }

  private static void foo(boolean a) {
    if (a) {
      System.out.println();
    }
  }
}
