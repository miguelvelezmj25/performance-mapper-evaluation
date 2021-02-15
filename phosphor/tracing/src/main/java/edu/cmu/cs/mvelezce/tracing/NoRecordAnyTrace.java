package edu.cmu.cs.mvelezce.tracing;

import edu.cmu.cs.mvelezce.taints.Sources;

public class NoRecordAnyTrace {

  public static void main(String[] args) throws InterruptedException {
    int A = Sources.N_25(Integer.parseInt(args[0])); // Source
    foo(A);
  }

  private static void foo(int x) throws InterruptedException {
    int i = moo(x);
    System.out.println(i);
    bar(x);
  }

  // Option hotspot
  private static void bar(int y) throws InterruptedException {
    System.out.println(y);
    if (y > 0) {
      Thread.sleep(5000);
    } else {
      Thread.sleep(2000);
    }
  }

  private static int moo(int z) {
    int j;
    if (z > 10) {
      j = z * 2;
    } else {
      j = z / 2;
    }
    int k = 0;
    while (j > 0) {
      k++;
      j--;
    }
    return k;
  }
}
