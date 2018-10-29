package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Example2 {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    boolean x = false;

    if (A) { // A
      x = true;
    }

    if (!B) { // B
      if (x) { // A -> !B
        Thread.sleep(300);
      }
    }

    Sinks.postProcessSinks("phosphorExample2");
  }
}
