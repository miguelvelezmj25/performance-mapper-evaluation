package edu.cmu.cs.mvelezce.analysis;

public class ReturnExample {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    if (A) {
      return;
    }

    if (B) {
      return;
    }
  }
}
