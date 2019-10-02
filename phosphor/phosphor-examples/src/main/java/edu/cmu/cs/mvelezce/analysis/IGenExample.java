package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class IGenExample {

  public static void main(String[] args) {
    Sinks.preProcessSinks(IGenExample.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));
    boolean C = Sources.C_2(Boolean.parseBoolean(args[2]));
    boolean D = Sources.D_3(Boolean.parseBoolean(args[3]));
    boolean E = Sources.E_4(Boolean.parseBoolean(args[4]));
    boolean F = Sources.F_5(Boolean.parseBoolean(args[5]));
    boolean G = Sources.G_6(Boolean.parseBoolean(args[6]));

    int z = G ? 4 : 0;

    int max_z = 3;

    if (E && F) {
      System.out.println("L0");

      if (!(0 < z && z < max_z)) {
        System.out.println("L1");
      }
    } else {
      System.out.println("L2");
    }

    System.out.println("L3");

    if (C && D) {
      System.out.println("L4");

      if (A || B) {
        System.out.println("L5");
      }
    }

    Sinks.postProcessSinks();
  }
}
