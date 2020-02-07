package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class MethodCall {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(MethodCall.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    new MethodCall().foo(A, B);

    SinkManager.postProcessSinks();
  }

  private void foo(boolean a, boolean b) {
    moo();

    if (a) {
      bar(b);
    }
  }

  private void moo() {
    System.out.println();
  }

  private void bar(boolean b) {
    if (b) {
      System.out.println();
    }
  }
}
