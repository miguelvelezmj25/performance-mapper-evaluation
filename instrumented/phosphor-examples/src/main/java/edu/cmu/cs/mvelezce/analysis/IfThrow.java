package edu.cmu.cs.mvelezce.analysis;

public class IfThrow {

  public static void main(String[] args) throws Exception {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A) {
      throw new Exception("Sad");
    }

    if (B) {
      System.out.println("time");
    }
  }
}
