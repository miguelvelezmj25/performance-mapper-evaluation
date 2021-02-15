package edu.cmu.cs.mvelezce.tracing;

import edu.cmu.cs.mvelezce.taints.Sources;

public class DiffControlDiffData {

  public static void main(String[] args) throws InterruptedException {
    int A = Sources.N_25(Integer.parseInt(args[0])); // Source
    foo(A);
  }

  private static void foo(int x) throws InterruptedException {
    int i = moo(x);
    int j = x * 5;
    System.out.println(j);
    bar(i);
    if (Integer.SIZE > 0) {
      if (j > 10) {
        baz(i);
      }
    }
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
    int k;
    if (z > 10) {
      k = z * 2;
    } else {
      k = z / 2;
    }
    return k;
  }

  private static void baz(int w) throws InterruptedException {
    bar(w);
  }
}
