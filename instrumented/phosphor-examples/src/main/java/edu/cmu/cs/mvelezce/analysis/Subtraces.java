package edu.cmu.cs.mvelezce.analysis;

public class Subtraces {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);

    int x = 0;

    if (A) {
      int time = 1000;
      System.out.println(time);
      Thread.sleep(time);
      x = 1;
      foo(C);
    }

    if (B) {
      int time = 2000;
      System.out.println(time);
      Thread.sleep(time);
      x = 2;
      foo(C);
    }

    if (x > 0) {
      int time = 3000;
      System.out.println(time);
      Thread.sleep(time);
    }
  }

  private static void foo(boolean x) throws InterruptedException {
    if (x) {
      int time = 4000;
      System.out.println(time);
      Thread.sleep(time);
    }
  }
}
