package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleForExample {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

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