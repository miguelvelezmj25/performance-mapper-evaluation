package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;
import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;

public class Exceptions {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    exceptions(A, B);

    MultiTainter.taintedBoolean(false, "A");
    MultiTainter.taintedBoolean(false, "B");

    Sinks.postProcessSinks("exceptions");
  }

  private static void exceptions(boolean b, boolean e) {
    if (e) {
      //            throw new RuntimeException("Exception");
      System.out.println("error");
    } else {

      if (b) {
        System.out.println("hello");
      }

      if (b) {
        System.out.println("hello");
      }

      if (b) {
        System.out.println("hello");
      }

      if (b) {
        System.out.println("hello");
      }
    }
  }
}
