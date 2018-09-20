package edu.cmu.cs.mvelezce.taints;

public class Sources {

  private final char value[];

  private Sources() {
    this.value = new char[]{'c'};
  }

  public static boolean A_0(boolean option) {
    return option;
  }

  public static String A_0(String s) {
    return s;
  }

  public static boolean B_1(boolean option) {
    return option;
  }

}
