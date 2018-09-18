package edu.cmu.cs.mvelezce.taints;

public class A extends Taint {

  private static final A INSTANCE = new A();

  private final int hashCode = 0;

  private A() {}

  public static A getInstance() { return INSTANCE; }

  @Override
  public int hashCode() {
    return hashCode;
  }

  @Override
  public String toString() {
    return "A";
  }
}
