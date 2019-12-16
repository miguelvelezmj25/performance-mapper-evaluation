package edu.cmu.cs.mvelezce.implicit;

public class Nested {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A) {
      if (B) {
        System.out.println("Some");
      }
    }
  }
}
