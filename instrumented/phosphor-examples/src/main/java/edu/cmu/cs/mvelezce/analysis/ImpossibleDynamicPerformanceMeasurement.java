package edu.cmu.cs.mvelezce.analysis;

public class ImpossibleDynamicPerformanceMeasurement {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    int x;
    int y;

    if (A) {
      x = 3;
    }
    else {
      x = 1;
    }

    if (B) {
      y = 4;
    }
    else {
      y = 2;
    }

    foo(x);
    foo(y);
  }

  static void foo(int i) throws InterruptedException {
    while (i > 0) {
      Thread.sleep(1);
      i--;
    }
  }
}
