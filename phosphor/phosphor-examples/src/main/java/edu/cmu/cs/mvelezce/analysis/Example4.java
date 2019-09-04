package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Example4 {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    //    boolean C = Sources.C_2(Boolean.valueOf(args[2]));
    //
    //    Integer err = null;
    //    boolean ipv4 = true;
    //    boolean flag = true;
    //
    //    if (A) {
    //      flag = false;
    //    }
    //
    //    if (B && flag) {
    //      err = -1;
    //    }
    //
    //    if (C && ipv4) {
    //      System.out.println(err);
    //
    //      return;
    //    }
    //
    //    System.out.println(1);

    if (A && B) {
      System.out.println();
    }
  }
}
