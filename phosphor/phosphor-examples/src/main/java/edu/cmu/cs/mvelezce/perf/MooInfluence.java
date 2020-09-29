package edu.cmu.cs.mvelezce.perf;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

import java.util.ArrayList;
import java.util.List;

public class MooInfluence {

  private static final List<String> LIST = new ArrayList<>();

  public static void main(String[] args) {
    SinkManager.preProcessSinks(MooInfluence.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    foo(A);

    SinkManager.postProcessSinks();
  }

  private static void foo(boolean x) {
    int bound;
    if (x) {
      //      bound = 50_000_000;
      bound = 50;
    } else {
      //      bound = 500_000_000;
      bound = 500;
    }
    bar(bound);
  }

  private static void bar(int bound) {
    moo(bound);
  }

  private static void moo(int bound) {
    start();
    for (int i = 0; i < bound; i++) {
      ExpensiveCalls.getFactors();
      checkProgress();
    }
    end();
  }

  private static void end() {
    System.out.println("END");
  }

  private static void start() {
    System.out.println("START");
  }

  private static void checkProgress() {
    for (String s : LIST) {
      System.out.println(s);
    }
  }
}
