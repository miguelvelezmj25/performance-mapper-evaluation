package edu.cmu.cs.mvelezce.analysis;

public class Example8 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);

    if (A) {
      if (C) {
        System.out.println();
      }
    }

    boolean x = false;

    if (B) {
      x = true;
    }

    if (x) {
      System.out.println();
    }
  }
}
