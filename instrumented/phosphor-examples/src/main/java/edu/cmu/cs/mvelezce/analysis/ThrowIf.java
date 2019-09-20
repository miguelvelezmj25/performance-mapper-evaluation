package edu.cmu.cs.mvelezce.analysis;

public class ThrowIf {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    if (A) {
      throw new RuntimeException("A is enabled");
    }

    if (B) {
      System.out.println();
    }
  }

}
