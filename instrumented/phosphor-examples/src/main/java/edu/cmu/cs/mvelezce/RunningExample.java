package edu.cmu.cs.mvelezce;

public class RunningExample {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    if (A && B) {
      System.out.println();
    }

    System.out.println();

    if (A) {
      System.out.println();

      if (B) {
        System.out.println();
      }

      System.out.println();
    }

    //    boolean x = false;
    //    System.out.println(1);
    //
    //    if (A) { // 1
    //      System.out.println(2);
    //      x = true;
    //      foo(B);
    //    }
    //
    //    if (x) { // 2
    //      System.out.println(3);
    //    }

  }

//  private static void foo(boolean b) {
//    if (b) { // 1
//      System.out.println(4);
//    } else {
//      System.out.println();
//    }
//  }
}
