package edu.cmu.cs.mvelezce.taints;

public abstract class Taint {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    return o != null && getClass() == o.getClass();
  }

  @Override
  public int hashCode() {
    throw new UnsupportedOperationException("Your taint should override the hashCode method.");
  }

  @Override
  public String toString() {
    throw new UnsupportedOperationException("Your taint should override the toString method.");
  }
}
