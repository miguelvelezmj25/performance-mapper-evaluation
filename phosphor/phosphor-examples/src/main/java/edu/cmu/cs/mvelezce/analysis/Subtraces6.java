package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Subtraces6 {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(Subtraces6.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    int x = 0;

    if (A) {
      x = 1;
    }

    if (B) {
      x = 1;
    }

    if (x > 0) {
      if (C) {
        System.out.println();
      }
    }
  }
}
