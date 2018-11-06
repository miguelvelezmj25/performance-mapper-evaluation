package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Example4 {

  public static void main(String[] args) {
    boolean green = Sources.A_0(Boolean.valueOf(args[0]));
    boolean yellow = Sources.B_1(Boolean.valueOf(args[1]));
    boolean blue = Sources.C_2(Boolean.valueOf(args[2]));

    Integer err = null;
    boolean ipv4 = true;
    boolean flag = true;

    if (green) {
      flag = false;
    }

    if (yellow && flag) {
      err = -1;
    }

    if (blue && ipv4) {
      System.out.println(err);

      return;
    }

    System.out.println(1);
  }
}
