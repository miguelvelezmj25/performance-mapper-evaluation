package edu.cmu.cs.mvelezce.analysis;

public class MethodCall {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    new MethodCall().foo(A, B);
  }

  private void foo(boolean a, boolean b) {
    if (a) {
      bar(b);
    }
  }

  private void bar(boolean b) {
    if (b) {
      System.out.println();
    }
  }
}
