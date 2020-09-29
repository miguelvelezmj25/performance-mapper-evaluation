package edu.cmu.cs.mvelezce.perf;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

import java.util.ArrayList;
import java.util.List;

public class BarInfluence2 {

  private static final List<String> LIST = new ArrayList<>();

  public static void main(String[] args) {
    SinkManager.preProcessSinks(BarInfluence2.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    foo(A);

    SinkManager.postProcessSinks();
  }

  private static void foo(boolean x) {
    if (x) {
      //      bar(50_000_000);
      bar(50);
    } else {
      //      bar(500_000_000);
      bar(500);
    }
  }

  private static void bar(int bound) {
    start();
    for (int i = 0; i < bound; i++) {
      moo();
    }
    end();
  }

  private static void moo() {
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
