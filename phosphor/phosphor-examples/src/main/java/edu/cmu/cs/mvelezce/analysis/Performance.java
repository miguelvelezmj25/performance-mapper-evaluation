package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

import java.util.Arrays;

public class Performance {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(Performance.class.getSimpleName());

    try {
      Thread.sleep(1500);
      run(args);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    SinkManager.postProcessSinks();
  }

  public static void run(String[] args) throws InterruptedException {
    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    foo(B);

    int x = A ? 1 : 10;
    x += B ? 1 : 10;

    for (int i = 0; i < x; i++) {
      foo(B);
    }
  }

  private static int foo(boolean x) throws InterruptedException {
    int y = 100_000_000;

    if (x) {
      getFactors(y);
    } else {
      getFactors(y);
    }

    return y;
  }

  static int[] getFactors(int value) {
    int[] a = new int[31]; // 2^31
    int i = 0, j;
    int num = value;
    while (num % 2 == 0) {
      a[i++] = 2;
      num /= 2;
    }
    j = 3;
    while (j <= Math.sqrt(num) + 1) {
      if (num % j == 0) {
        a[i++] = j;
        num /= j;
      } else {
        j += 2;
      }
    }
    if (num > 1) {
      a[i++] = num;
    }
    int[] b = Arrays.copyOf(a, i);
    return b;
  }
}
