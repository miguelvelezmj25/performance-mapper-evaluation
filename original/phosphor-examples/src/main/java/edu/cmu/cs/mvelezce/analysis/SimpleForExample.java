package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class SimpleForExample {

  public static void main(String[] args) {
    boolean z = Sources.A_0(Boolean.valueOf(args[0]));
    boolean y = Sources.B_1(Boolean.valueOf(args[1]));

    int rounds = 1;
    if (z) {
      rounds = 4;
    }
    if (y) {
      rounds = 2;
    }

    int a = 0;

    for (int start = 0; start <= rounds; start++) {
      a++;
    }

    Sinks.postProcessSinks("simpleForExample");
  }
}
