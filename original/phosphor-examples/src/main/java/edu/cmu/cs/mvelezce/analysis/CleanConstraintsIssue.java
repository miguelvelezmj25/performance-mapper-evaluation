package edu.cmu.cs.mvelezce.analysis;

public class CleanConstraintsIssue {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);

    if (A) {
      foo(B);
      bar(C);
    }
  }

  private static void foo(boolean x) {
    if (x) {
      System.out.println();
    }
  }

  private static void bar(boolean x) {
    if (x) {
      System.out.println();
    }
  }
}
