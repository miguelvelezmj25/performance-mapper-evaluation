package edu.cmu.cs.mvelezce.analysis;

public class ExpensiveLoopExample {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);

    int x;

    if (A) {
      x = 100_000;
    } else {
      x = 10_000_000;
    }

    int count = 0;

    for (int i = 0; i < x; i++) {
      count++;
    }

    System.out.println(count);
  }
}
