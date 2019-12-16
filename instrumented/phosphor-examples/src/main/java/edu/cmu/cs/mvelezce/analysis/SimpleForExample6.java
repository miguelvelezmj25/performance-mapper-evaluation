package edu.cmu.cs.mvelezce.analysis;

public class SimpleForExample6 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    int rounds = 0;

    if (A) {
      rounds = 4;
    } else {
      rounds = 2;
    }

    for (int i = 0; i <= rounds; i++) {
      if (i % 2 == 0) {
        B = !B;
      }

      foo(B);
    }
  }

  static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
