package edu.cmu.cs.mvelezce.tracing;

public class Trace2 {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    foo(A);
  }

  private static void foo(boolean x) throws InterruptedException {
    boolean y = moo(x);
    bar(y);
  }

  private static void bar(boolean x) throws InterruptedException {
    if (x) {
      Thread.sleep(5000);
      System.out.println("5 seconds");
    } else {
      Thread.sleep(2000);
      System.out.println("2 seconds");
    }
  }

  private static boolean moo(boolean x) {
    return x;
  }
}
