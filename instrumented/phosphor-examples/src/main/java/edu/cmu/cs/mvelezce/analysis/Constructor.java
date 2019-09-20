package edu.cmu.cs.mvelezce.analysis;

public class Constructor {
  static {
    System.out.println();
  }

  public static void main(String[] args) {
    new Constructor(args);
  }

  private Constructor(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    if (A) {
      System.out.println();
    }

    if (B) {
      System.out.println();
    }
  }
}
