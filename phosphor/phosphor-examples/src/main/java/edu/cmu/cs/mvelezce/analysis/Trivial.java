package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Trivial {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(Trivial.class.getSimpleName());

    try {
      //      Thread.sleep(1500);
      run(args);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    SinkManager.postProcessSinks();
  }

  public static void run(String[] args) throws InterruptedException {
    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));

    foo(A);
    bar(B);
  }

  private static void bar(boolean x) throws InterruptedException {
    if (x) {
      int time = 2000;
      System.out.println(time);
      Thread.sleep(time);
    }
  }

  private static void foo(boolean x) throws InterruptedException {
    if (x) {
      int time = 1000;
      System.out.println(time);
      Thread.sleep(time);
    }
  }
}
