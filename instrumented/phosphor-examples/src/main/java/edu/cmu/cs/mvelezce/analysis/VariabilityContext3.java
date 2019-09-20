package edu.cmu.cs.mvelezce.analysis;

public class VariabilityContext3 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);
    boolean C = Boolean.valueOf(args[2]);

    int x = 0;

    if (A) {
      if (B) {
        foo(2);
      }
      if (C) {
        foo(4);
      }
    }
  }

  private static void foo(int x) {
    while (x > 0) {
      System.out.println(1);
      x--;
    }
  }
}
