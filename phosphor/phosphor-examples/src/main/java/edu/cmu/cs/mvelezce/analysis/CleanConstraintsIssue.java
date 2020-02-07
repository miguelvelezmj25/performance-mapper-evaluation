package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class CleanConstraintsIssue {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(CleanConstraintsIssue.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));
    boolean C = Sources.C_2(Boolean.parseBoolean(args[2]));

    if (A) {
      foo(B);
      bar(C);
    }

    SinkManager.postProcessSinks();
  }

  private static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }

  private static void bar(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
