package edu.cmu.cs.mvelezce.perf;

import java.util.ArrayList;
import java.util.List;

public class EarlyReturn {

  private static final List<String> LIST = new ArrayList<>();

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    foo(A);
  }

  private static void foo(boolean x) {
    start();
    moo(x);
    bar();
    end();
  }

  private static void bar() {
    for (int i = 0; i < 50_000_000; i++) {
      ExpensiveCalls.getFactors();
      checkProgress();
    }
  }

  private static void moo(boolean x) {
    if (x) {
      return;
    }
    for (int i = 0; i < 50_000_000; i++) {
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
