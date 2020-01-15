package edu.cmu.cs.mvelezce.analysis;

import java.util.Arrays;

/**
 * Program showing the case that the constraints in a hotspot (method foo) do not include the
 * options that make the hotspot take a long time to execute (A and B). All of options that reach
 * the sink in the hotspot are A and B. When foo(B) is called, the control taints are empty and the
 * data taints are B; hence we derive the constraints B and not B. When foo(B) is called within the
 * loop that depends both on A and B, the control taints and data taints are the same (i.e., A and
 * B). We originally removed the control taints from the data flow taints as there is an outer
 * control-flow decision that encompasses those taints. This interpretation, however, leads to not
 * catch in the hotspot that its execution time depends on A and B, and the 4 corresponding
 * constraints should be explored.
 */
public class Performance {

  public static void main(String[] args) {
    try {
      Thread.sleep(1500);
      run(args);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void run(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    foo(B);

    int x = A ? 1 : 10_000;
    x *= B ? 1 : 10_000;

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
