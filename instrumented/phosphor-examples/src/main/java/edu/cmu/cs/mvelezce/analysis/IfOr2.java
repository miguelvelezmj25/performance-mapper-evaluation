package edu.cmu.cs.mvelezce.analysis;

public class IfOr2 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    boolean x = false;

    if (A || B) {
      x = true;
    }

    if (x) {
      System.out.println(1);
    }
  }
}
