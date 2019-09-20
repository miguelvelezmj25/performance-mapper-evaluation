package edu.cmu.cs.mvelezce.analysis;

public class Sound {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    int x = 0;

    if (A) {
      x = 1;
    }
    else {
      x = 2;
    }

    if (B) {
      x = x - 1;
    }
    else {
      x = x - 2;
    }

    if (x == 0) {
      System.out.println(3);
    }
  }
}
