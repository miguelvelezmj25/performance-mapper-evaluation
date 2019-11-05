package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class OverrideJREMethod {

  private final boolean a;

  public OverrideJREMethod(boolean a) {
    this.a = a;
  }

  public static void main(String[] args) {
    Sinks.preProcessSinks(OverrideJREMethod.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));

    OverrideJREMethod o = new OverrideJREMethod(A);
    o.implicitCall();
    o.explicitCall();

    Sinks.postProcessSinks();
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
