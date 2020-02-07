package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class CanExpandConstraintsDown {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(CanExpandConstraintsDown.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    if (A && B) {
      System.out.println("1");
    }

    if (A) {
      System.out.println("2");
    }

    SinkManager.postProcessSinks();
  }
}
