package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class MethodCall {

  public static void main(String[] args) {
    Sinks.preProcessSinks(MethodCall.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    new MethodCall().foo(A, B);

    Sinks.postProcessSinks();
  }

  private void foo(boolean a, boolean b) {
    if (a) {
      bar(b);
    }
  }

  private void bar(boolean b) {
    if (b) {
      System.out.println();
    }
  }
}
