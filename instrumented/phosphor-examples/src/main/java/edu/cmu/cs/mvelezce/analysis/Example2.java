package edu.cmu.cs.mvelezce.analysis;

public class Example2 {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    boolean x = false;

    if (A) { // 1
      x = true;
    }

    if (!B) { // 2
      if (x) { // 3
        System.out.println(1);
      }
    }
  }
}
