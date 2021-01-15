package edu.cmu.cs.mvelezce.tracing;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Trace2 {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(Trace2.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    foo(A);

    SinkManager.postProcessSinks();
  }

  private static void foo(boolean x) {
    int i = moo(x);
    bar(i);
  }

  private static void bar(int i) {
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
    }

    return 0;
  }
}
