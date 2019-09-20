package edu.cmu.cs.mvelezce.analysis;

public class Implicit {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    int x = 0;

    if (A) {
      x++;
    }

    if (B) {
      x++;
    }

    if (x > 0) {
      System.out.println();
    }
  }
}
