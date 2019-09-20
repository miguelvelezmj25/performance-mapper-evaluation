package edu.cmu.cs.mvelezce.analysis;

public class TestPrintExample {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);

    int i = 0;
    if (A) {
      i++;
    }
    if (A) {
      System.out.println(i);
    } else {
      System.out.println(i);
    }
  }
}
