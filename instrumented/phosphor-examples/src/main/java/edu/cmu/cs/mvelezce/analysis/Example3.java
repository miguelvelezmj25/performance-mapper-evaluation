package edu.cmu.cs.mvelezce.analysis;

public class Example3 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);
    boolean C = Boolean.valueOf(args[2]);

    foo(A);

    if (A) { // 1
      foo(B);
      foo(C);
    }
  }

  public static void foo(boolean x) {
    if (x) {
      System.out.println(5);
    }
  }
}
