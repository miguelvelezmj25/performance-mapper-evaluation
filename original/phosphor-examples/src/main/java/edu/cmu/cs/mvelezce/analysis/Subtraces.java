package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Subtraces {

  public static void main(String[] args) throws InterruptedException {
    Sinks.preProcessSinks(Subtraces.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    int x = 0;

    if (A) {
      Thread.sleep(1000);
      x = 1;
      foo(C);
    }

    if (B) {
      Thread.sleep(2000);
      x = 2;
      foo(C);
    }

    if (x > 0) {
      Thread.sleep(3000);
    }

    Sinks.postProcessSinks();
  }

  private static void foo(boolean x) throws InterruptedException {
    if (x) {
      Thread.sleep(4000);
    }
  }
}
