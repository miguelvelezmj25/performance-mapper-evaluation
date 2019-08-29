package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleExample1 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    boolean x = false;

    if (A) { // 1
      if (x) { // 2
        System.out.println(1);
      }
    }

    int i = 5;

    while (i > 0) { // 3
      if (i > 3) { // 4
        System.out.println(1);
      }

      i--;
    }

    int j;

    if (B) { // 5
      j = 5;
    }
    else {
      j = 2;
    }

    if (j > 0) { // 6
      System.out.println(1);
    }

    while (j > 0) { // 7
      if (j > 2) { // 8
        System.out.println(1);
      }

      j--;
    }

    if (A) { // 9
      foo();
    }

    if (B) { // 10
      foo();
    }

    if (A) { // 11
      moo(A);
    }

    if (B) { // 12
      moo(B);
    }

    if (A) { // 13
      bar(true);
    }

    if (B) { // 14
      bar(true);
    }

    if (A) { // 15
      cow(B);
    }

    if (B) { // 16
      cow(A);
    }
  }

  private static void foo() {
    int x = 0;

    if (x >= 0) { // 1
      System.out.println(1);
    }
  }

  private static void moo(boolean x) {
    if (x) { // 1
      System.out.println(1);
    }
  }

  private static void bar(boolean x) {
    if (x) { // 1
      System.out.println(1);
    }
  }

  private static void cow(boolean x) {
    if (x) { // 1
      System.out.println(1);
    }
  }
}
