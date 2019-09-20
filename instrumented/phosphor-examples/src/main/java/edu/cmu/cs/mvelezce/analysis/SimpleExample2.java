package edu.cmu.cs.mvelezce.analysis;

public class SimpleExample2 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);
    boolean C = Boolean.valueOf(args[2]);
    boolean D = Boolean.valueOf(args[3]);

    if (A) { //
      moo(D);
      moo(C && D);
      moo(C);
      moo(C || D);
    }

    if (B) { //
      moo(C);
      moo(D);
      moo(C && D);
      moo(C || D);
    }
  }

  private static void moo(boolean x) {
    if (x) { //
      System.out.println(1);
    }
  }
}
