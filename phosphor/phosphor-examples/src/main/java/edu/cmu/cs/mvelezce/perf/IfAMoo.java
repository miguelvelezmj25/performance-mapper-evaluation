package edu.cmu.cs.mvelezce.perf;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;

import java.util.ArrayList;
import java.util.List;

public class IfAMoo {

  private static final List<String> LIST = new ArrayList<>();

  public static void main(String[] args) {
    SinkManager.preProcessSinks(IfAMoo.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    foo(A);

    SinkManager.postProcessSinks();
  }

  private static void foo(boolean x) {
    start();
    if (x) {
      moo();
    }
    bar();
    end();
  }

  private static void bar() {
    //    for (int i = 0; i < 50_000_000; i++) {
    for (int i = 0; i < 50; i++) {
      ExpensiveCalls.getFactors();
      checkProgress();
    }
  }

  private static void moo() {
    //    for (int i = 0; i < 50_000_000; i++) {
    for (int i = 0; i < 50; i++) {
      ExpensiveCalls.getFactors();
      checkProgress();
    }
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
