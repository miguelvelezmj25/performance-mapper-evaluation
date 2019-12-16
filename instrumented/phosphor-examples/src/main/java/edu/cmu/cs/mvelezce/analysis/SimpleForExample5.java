package edu.cmu.cs.mvelezce.analysis;

public class SimpleForExample5 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    int x = 0;

    if (A) {
      x = 1;
    }

    if (B) {
      x = 2;
    }

    while (x > 0) {
      x--;
    }
  }
}
