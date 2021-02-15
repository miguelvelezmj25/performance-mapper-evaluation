package edu.cmu.cs.mvelezce.tracing;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Trace3 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));
    foo(A, B);
  }

  private static void foo(boolean x, boolean y) {
    int i = moo(x);
    if (y) {
      bar(i);
    }
    if (i > 0) {
      System.out.println("1 sec");
    }
  }

  private static void bar(int i) {
    System.out.println(i);
    if (i > 0) {
      //            Thread.sleep(5000);
      System.out.println("5 seconds");
    } else {
      //            Thread.sleep(2000);
      System.out.println("2 seconds");
    }
  }

  private static int moo(boolean x) {
    if (x) {
      return 1;
    } else {
      return 0;
    }
  }
}
