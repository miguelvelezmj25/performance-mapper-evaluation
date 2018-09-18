package edu.cmu.cs.mvelezce.taints;

public class B extends Taint {

  private static final B INSTANCE = new B();

  private final int hashCode = 1;

  private B() {}

  public static B getInstance() { return INSTANCE; }

  @Override
  public int hashCode() {
    return hashCode;
  }

  @Override
  public String toString() {
    return "B";
  }
}
