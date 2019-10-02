package edu.cmu.cs.mvelezce.analysis;

public class IGenExample {

  public static void main(String[] args) {
    boolean s = Boolean.parseBoolean(args[0]);
    boolean t = Boolean.parseBoolean(args[1]);
    boolean u = Boolean.parseBoolean(args[2]);
    boolean v = Boolean.parseBoolean(args[3]);
    boolean x = Boolean.parseBoolean(args[4]);
    boolean y = Boolean.parseBoolean(args[5]);
    int z = Integer.parseInt(args[6]);

    int max_z = 3;

    if (x && y) {
      System.out.println("L0");

      if (!(0 < z && z < max_z)) {
        System.out.println("L1");
      }
    } else {
      System.out.println("L2");
    }

    System.out.println("L3");

    if (u && v) {
      System.out.println("L4");

      if (s || t) {
        System.out.println("L5");
      }
    }
  }
}
