package edu.cmu.cs.mvelezce.analysis;

public class Nesting {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    if (A) {
      if (B) {
        System.out.println();
      } else {
        System.out.println();
      }
    }
  }
}
