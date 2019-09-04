package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

/**
 * This program shows why we need to track the beginning and end of a control flow decision for
 * accurate results.
 */
public class Subtraces2 {

  public static void main(String[] args) {
    Sinks.preProcessSinks(Subtraces2.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    if (A) {
      System.out.println(1);
      foo(B);
      foo(C);
    }
  }

  private static void foo(boolean x) {
    if (x) {
      System.out.println(4);
    }
  }
}
