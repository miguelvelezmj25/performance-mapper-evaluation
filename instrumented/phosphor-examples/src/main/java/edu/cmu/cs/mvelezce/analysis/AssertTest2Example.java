package edu.cmu.cs.mvelezce.analysis;

public class AssertTest2Example {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean x = true;

    if (!A) {
      if (A) {
        System.out.println(false);
      }
    }
  }
}
