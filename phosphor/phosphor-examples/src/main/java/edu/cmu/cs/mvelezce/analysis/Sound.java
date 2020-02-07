package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Sound {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(Sound.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    int x = 0;

    if (A) {
      x = 1;
    }
    else {
      x = 2;
    }

    if (B) {
      x = x - 1;
    }
    else {
      x = x - 2;
    }

    if (x == 0) {
      System.out.println(3);
    }
  }
}
