package edu.cmu.cs.mvelezce.analysis;

public class Return2Example {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);

    if (A || !A) {
      return;
    }
  }
}
