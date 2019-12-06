package edu.cmu.cs.mvelezce.analysis;

public class Trivial {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    foo();
  }

  private static void foo() throws InterruptedException {
    // Start region
    Thread.sleep(3000);
    bar();
    mow();
    // End region
  }

  private static void mow() throws InterruptedException {
    // Start region
    Thread.sleep(2000);
    // End region
  }

  private static void bar() throws InterruptedException {
    Thread.sleep(1000);
  }
}
