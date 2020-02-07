package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class CallStaticField {

  static{
    System.out.println();
  }

  public static void main(String[] args) {
    SinkManager.preProcessSinks(CallStaticField.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    if (A) {
      foo(B);
    }

    if (A) {
      foo(B);
    }

    SinkManager.postProcessSinks();
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
