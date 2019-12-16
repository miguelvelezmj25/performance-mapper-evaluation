package edu.cmu.cs.mvelezce.analysis;

public class OrContext3 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);

    int x = 0;

    if (A) {
      x = 1;
    }

    if (B) {
      x = 1;
    }

    while (x > 0) {
      if (C) {
        System.out.println();
      }

      x--;
    }
  }
}
