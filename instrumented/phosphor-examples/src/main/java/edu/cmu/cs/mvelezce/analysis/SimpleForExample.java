package edu.cmu.cs.mvelezce.analysis;

public class SimpleForExample {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    int rounds = 1;
    if (A) {
      rounds = 4;
    }
    if (B) {
      rounds = 2;
    }

    int a = 0;

    for (int start = 0; start <= rounds; start++) {
      a++;
    }
  }
}
