package edu.cmu.cs.mvelezce.tracing;

public class FieldDependence {

  private static int VALUE = 0;

  public static void main(String[] args) throws InterruptedException {
    int A = Integer.parseInt(args[0]); // Source
    foo(A);
  }

  private static void foo(int x) throws InterruptedException {
    VALUE = moo(x);
    baz(5);
  }

  // Option hotspot
  private static void bar(int y) throws InterruptedException {
    System.out.println(y);
    if (VALUE > 0) {
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
