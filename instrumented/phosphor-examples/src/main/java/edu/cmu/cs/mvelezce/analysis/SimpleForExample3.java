package edu.cmu.cs.mvelezce.analysis;

public class SimpleForExample3 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);

    int x;

    if (A) {
      x = 4;
    } else {
      x = 2;
    }

    while (x > 0) {
      x--;
    }

    System.out.println();
  }
}
