package edu.cmu.cs.mvelezce.analysis;

public class CanExpandConstraintsDown {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A && B) {
      System.out.println("time");
    }

    if (A) {
      System.out.println("time");
    }
  }
}