package edu.cmu.cs.mvelezce.analysis;

public class ProjectExample {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    int x = 1;
    int y = 1;
    if (A) {
      y = 0;
    }
    if (x * y < 3) {
      x = x + 1;
    }
    if (y == 1) {
      x = -1;
    }
    if (B) {
      x = 0;
    }
    while (x > 0) {
      x = x - 1;
    }

    System.out.println(x == 0);
  }
}
