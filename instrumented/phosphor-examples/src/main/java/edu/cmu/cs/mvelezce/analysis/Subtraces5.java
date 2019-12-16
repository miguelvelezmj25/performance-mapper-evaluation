package edu.cmu.cs.mvelezce.analysis;

public class Subtraces5 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    int x = 1;

    if (A) {
      x = 2;
    }

    if (x > 0) {
      System.out.println();
    }

    if (B) {
      System.out.println();
    }
  }
}
