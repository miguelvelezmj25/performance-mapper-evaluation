package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class CleanConstraints {

  public static void main(String[] args) {
    Sinks.preProcessSinks(CleanConstraints.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    if (A) {
      System.out.println();
    }

    foo(A, B);

    Sinks.postProcessSinks();
  }

  private static void foo(boolean a, boolean b) {
    if (a || b) {
      System.out.println();
    }
  }
}
