package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Exceptions {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    exceptions(A);

    Sinks.postProcessSinks("exceptions");
  }

  private static void exceptions(boolean b) {
    if (b) {
      throw new RuntimeException("Exception");
    }

    System.out.println("hello");
  }
}
