package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class CanRemoveNestedConstraintsMultipleCallSites {

  public static void main(String[] args) {
    Sinks.preProcessSinks(CanRemoveNestedConstraintsMultipleCallSites.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    if (A) {
      foo(B);
    }

    if (A) {
      foo(B);
    }

    Sinks.postProcessSinks();
  }

  private static void foo(boolean a) {
    if (a) {
      bar();
    }
  }

  private static void bar() {
    System.out.println();
  }
}
