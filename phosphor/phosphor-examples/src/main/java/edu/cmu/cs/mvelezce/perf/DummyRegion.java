package edu.cmu.cs.mvelezce.perf;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

import java.util.ArrayList;
import java.util.List;

public class DummyRegion {

  private static final List<String> LIST = new ArrayList<>();

  public static void main(String[] args) {
    SinkManager.preProcessSinks(DummyRegion.class.getSimpleName());

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
    start();
    for (int i = 0; i < bound; i++) {
      moo(bound);
    }
    end();
  }

  private static void moo(int bound) {
    if (bound > 0) {}
    ExpensiveCalls.getFactors();
    checkProgress();
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
