package edu.cmu.cs.mvelezce.tracing;

public class Trace2 {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    foo(A);
  }

  private static void foo(boolean x) {
    int i = moo(x);
    bar(i);
  }

  private static void bar(int i) {
    if (i > 0) {
      //            Thread.sleep(5000);
      System.out.println("5 seconds");
    } else {
      //            Thread.sleep(2000);
      System.out.println("2 seconds");
    }
  }

  private static int moo(boolean x) {
    if (x) {
      return 1;
    }

    return 0;
  }
}
