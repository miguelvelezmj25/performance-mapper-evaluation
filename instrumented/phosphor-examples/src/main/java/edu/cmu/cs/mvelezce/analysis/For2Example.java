package edu.cmu.cs.mvelezce.analysis;

public class For2Example {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    int rounds = 1;
    int increment = 1;
    if (A) {
      rounds = 4;
    }
    if (B) {
      increment = -1;
    }
    int a = 0;
    for (int start = 1; start <= rounds; start++) {
      a += increment;
    }

    if (A) {
      System.out.println(a * a == 16);
      if (B) {
        System.out.println(a == -4);
      } else {
        System.out.println(a == 4);
      }
    } else {
      System.out.println(a * a == 1);
      if (B) {
        System.out.println(a == 1);
      } else {
        System.out.println(a == 1);
      }
    }
  }
}
