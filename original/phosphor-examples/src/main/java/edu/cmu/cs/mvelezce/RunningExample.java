package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class RunningExample {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    boolean x = false;
    Thread.sleep(100);

    if (A) {
      Thread.sleep(100);
      x = true;
      foo(B);
    }

    if (x) {
      Thread.sleep(100);
    }

    Sinks.postProcessSinks("phosphor-examples");
  }

  private static void foo(boolean b) throws InterruptedException {
    if (b) {
      Thread.sleep(100);
    }
  }
}
