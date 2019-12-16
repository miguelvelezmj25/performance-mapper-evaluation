package edu.cmu.cs.mvelezce.analysis;

public class Trivial {

  public static void main(String[] args) {
    try {
      Thread.sleep(1500);
      run(args);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void run(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    foo(A);
    bar(B);
  }

  private static void bar(boolean x) throws InterruptedException {
    if (x) {
      int time = 2000;
      System.out.println(time);
      Thread.sleep(time);
    }
  }

  private static void foo(boolean x) throws InterruptedException {
    if (x) {
      int time = 1000;
      System.out.println(time);
      Thread.sleep(time);
    }
  }
}
