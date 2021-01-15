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
    boolean y = moo(x);
    bar(y);
  }

  private static void bar(boolean x) {
    if (x) {
      //            Thread.sleep(5000);
      System.out.println("5 seconds");
    } else {
      //            Thread.sleep(2000);
      System.out.println("2 seconds");
    }
  }

  private static boolean moo(boolean x) {
    return x;
  }
}
