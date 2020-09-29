package edu.cmu.cs.mvelezce.perf;

public class ExpensiveCalls {

  public static void getFactors() {
    int num = 500_000_000;
    while (num % 2 == 0) {
      num /= 2;
    }
    int j = 3;
    while (j <= Math.sqrt(num) + 1) {
      if (num % j == 0) {
        num /= j;
      } else {
        j += 2;
      }
    }
  }
}
