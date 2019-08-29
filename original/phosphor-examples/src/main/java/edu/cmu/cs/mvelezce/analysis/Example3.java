package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Example3 {

  public static void main(String[] args) {
    Sinks.preProcessSinks(Example3.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    foo(A);

    if (A) { // 1
      foo(B);
      foo(C);
    }
  }

  public static void foo(boolean x) {
    if (x) {
      System.out.println(5);
    }
  }
}
