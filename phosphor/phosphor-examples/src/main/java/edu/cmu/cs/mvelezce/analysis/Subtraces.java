package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Subtraces {

  public static void main(String[] args) throws InterruptedException {
    Sinks.preProcessSinks(Subtraces.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));
    boolean C = Sources.C_2(Boolean.parseBoolean(args[2]));

    int x = 0;

    if (A) {
      int time = 1000;
      System.out.println(time);
      Thread.sleep(time);
      x = 1;
      foo(C);
    }

    if (B) {
      int time = 2000;
      System.out.println(time);
      Thread.sleep(time);
      x = 2;
      foo(C);
    }

    if (x > 0) {
      int time = 3000;
      System.out.println(time);
      Thread.sleep(time);
    }

    Sinks.postProcessSinks();
  }

  private static void foo(boolean x) throws InterruptedException {
    if (x) {
      int time = 4000;
      System.out.println(time);
      Thread.sleep(time);
    }
  }
}
