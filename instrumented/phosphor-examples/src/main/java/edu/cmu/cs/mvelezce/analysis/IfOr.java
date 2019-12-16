package edu.cmu.cs.mvelezce.analysis;

public class IfOr {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A || B) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    System.out.println("End");
  }
}
