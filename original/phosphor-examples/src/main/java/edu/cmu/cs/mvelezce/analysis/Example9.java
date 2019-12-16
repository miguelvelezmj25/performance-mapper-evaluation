package edu.cmu.cs.mvelezce.analysis;

public class Example9 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);

    int i;

    if (A) {
      i = 1;
    } else {
      i = 2;
    }

    foo(i);

    if (A) {
      if (B) {
        i = 3;
      } else {
        i = 4;
      }

      foo(i);
    }

    if (!A && !B) {
      if (C) {
        i = 5;
      } else {
        i = 6;
      }

      foo(i);
    }
  }

  private static void foo(int x) {
    if (x > 0) {
      System.out.println(x);
    }
  }
}
