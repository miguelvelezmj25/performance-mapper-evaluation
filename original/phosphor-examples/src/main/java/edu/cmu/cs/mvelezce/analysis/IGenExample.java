package edu.cmu.cs.mvelezce.analysis;

public class IGenExample {

  public static void main(String[] args) {
    boolean S = Boolean.parseBoolean(args[0]);
    boolean T = Boolean.parseBoolean(args[1]);
    boolean U = Boolean.parseBoolean(args[2]);
    boolean V = Boolean.parseBoolean(args[3]);
    boolean X = Boolean.parseBoolean(args[4]);
    boolean Y = Boolean.parseBoolean(args[5]);
    boolean Z = Boolean.parseBoolean(args[6]);

    int z = Z ? 4 : 0;

    int max_z = 3;

    if (X && Y) {
      System.out.println("L0");

      if (!(0 < z && z < max_z)) {
        System.out.println("L1");
      }
    } else {
      System.out.println("L2");
    }

    System.out.println("L3");

    if (U && V) {
      System.out.println("L4");

      if (S || T) {
        System.out.println("L5");
      }
    }
  }
}
