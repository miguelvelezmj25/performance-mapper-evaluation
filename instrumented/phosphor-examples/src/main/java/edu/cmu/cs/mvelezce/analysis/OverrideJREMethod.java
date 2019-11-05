package edu.cmu.cs.mvelezce.analysis;

public class OverrideJREMethod {

  private final boolean a;

  public OverrideJREMethod(boolean a) {
    this.a = a;
  }

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);

    OverrideJREMethod o = new OverrideJREMethod(A);
    o.implicitCall();
    o.explicitCall();
  }

  private void explicitCall() {
    System.out.println(this.toString());
  }

  private void implicitCall() {
    System.out.println();
  }

  @Override
  public String toString() {
    return a ? "true" : "false";
  }
}
