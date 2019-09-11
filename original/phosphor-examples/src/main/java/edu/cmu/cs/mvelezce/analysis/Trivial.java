package edu.cmu.cs.mvelezce.analysis;

public class Trivial {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A) {
      int time = 1000;
      System.out.println(time);
      Thread.sleep(time);
    }

    if (B) {
      int time = 2000;
      System.out.println(time);
      Thread.sleep(time);
    }

  }
}
