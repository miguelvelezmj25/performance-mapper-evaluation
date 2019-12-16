package edu.cmu.cs.mvelezce.analysis;

public class SimpleExample2 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);
    boolean D = Boolean.parseBoolean(args[3]);

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
