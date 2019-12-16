package edu.cmu.cs.mvelezce.analysis;

public class Constructor {

  private Constructor(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A) {
      System.out.println();
    }

    if (B) {
      System.out.println();
    }
  }

  public static void main(String[] args) {
    new Constructor(args);
  }
}
