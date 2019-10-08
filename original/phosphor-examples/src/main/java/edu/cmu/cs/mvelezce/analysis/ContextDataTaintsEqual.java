package edu.cmu.cs.mvelezce.analysis;

public class ContextDataTaintsEqual {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);

    if (A) {
      if (A) {
        System.out.println();
      }
    }
  }
}
