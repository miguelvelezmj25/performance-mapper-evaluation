package edu.cmu.cs.mvelezce.analysis;

public class IGenExample {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);
    boolean D = Boolean.parseBoolean(args[3]);
    boolean E = Boolean.parseBoolean(args[4]);
    boolean F = Boolean.parseBoolean(args[5]);
    boolean G = Boolean.parseBoolean(args[6]);

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
  }
}
