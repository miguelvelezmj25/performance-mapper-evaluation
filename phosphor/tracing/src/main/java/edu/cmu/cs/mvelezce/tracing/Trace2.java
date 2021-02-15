package edu.cmu.cs.mvelezce.tracing;

public class Trace2 {

  public static void main(String[] args) {
    boolean A = true;
    foo(A);
  }

  private static void foo(boolean x) {
    int i = moo(x);
    bar(i);
    if (i > 0) {
      System.out.println("1 sec");
    }
  }

  private static void bar(int i) {
    System.out.println(i);
    if (i > 0) {
      //            Thread.sleep(5000);
      System.out.println("5 seconds");
    } else {
      //            Thread.sleep(2000);
      System.out.println("2 seconds");
    }
  }

  private static int moo(boolean x) {
    System.out.println(x);
    if (x) {
      return 5;
    } else {
      return 2;
    }
  }
}
