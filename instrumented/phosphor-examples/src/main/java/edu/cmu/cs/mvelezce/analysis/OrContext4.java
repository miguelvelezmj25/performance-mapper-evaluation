package edu.cmu.cs.mvelezce.analysis;

public class OrContext4 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);
    boolean C = Boolean.valueOf(args[2]);

    int x = 0;

    if (!A) {
      x = 1;
    }

    if (!B) {
      x = 1;
    }

    if (x > 0) {
      if (C) {
        System.out.println();
      }
    }
  }
}
