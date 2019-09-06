package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Trivial {

  public static void main(String[] args) throws InterruptedException {
    Sinks.preProcessSinks(Trivial.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    if (A) {
      int time = 1000;
      System.out.println(time);
      Thread.sleep(time);
    }

    if (B) {
      int time = 2000;
      System.out.println(time);
      Thread.sleep(time);
    }

    Sinks.postProcessSinks();
  }
}
