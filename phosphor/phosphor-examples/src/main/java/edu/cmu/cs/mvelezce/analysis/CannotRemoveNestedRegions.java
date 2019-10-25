package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class CannotRemoveNestedRegions {

  public static void main(String[] args) {
    Sinks.preProcessSinks(CannotRemoveNestedRegions.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    foo(A);

    if (B) {
      System.out.println();
    }

    Sinks.postProcessSinks();
  }

  private static void foo(boolean a) {
    if (a) {
      System.out.println();
    }
  }
}
