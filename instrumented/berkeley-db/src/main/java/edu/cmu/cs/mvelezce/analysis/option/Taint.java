package edu.cmu.cs.mvelezce.analysis.option;

public final class Taint {

  private static final Taint NOT = new Taint();
  private static final Taint TAINTED = new Taint(1);

  private final int value;

  public static Taint createTaint() {
    return NOT;
  }

  public static Taint createTaint(int i) {
    return TAINTED;
  }

  private Taint() {
    this.value = 0;
  }

  private Taint(int i) {
    this.value = 1;
  }
}
