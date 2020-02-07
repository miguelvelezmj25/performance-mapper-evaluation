package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleForExample6 {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(SimpleForExample6.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    int rounds = 0;

    if (A) {
      rounds = 4;
    }
    else {
      rounds = 2;
    }

    for (int i = 0; i <= rounds; i++) {
      if (i % 2 == 0) {
        B = !B;
      }

      foo(B);
    }
  }

  static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
