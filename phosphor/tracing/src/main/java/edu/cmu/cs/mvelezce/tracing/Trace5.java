package edu.cmu.cs.mvelezce.tracing;

public class Trace5 {

  public static void main(String[] args) {
    boolean A = true;
//    boolean x = A ? true : false;
//    boolean y = x ? true : false;
//
//    if (y) {
//      //      ...
//      //      ...
//      //      ...
//      //      ...
//      z = ...
//    } else {
//      //      ...
//      //      ...
//      //      ...
//      //      ...
//      z = ...
//    }
//    foo(z);
  }

  private static void foo(boolean x) {
    int i = moo(x); // differences in data-flow // i <- x AND x == A // i <- A

//    i <- (this arrow jumps to moo) x <- A
    bar(i);
    if (i > 0) {
      System.out.println("1 sec");
    }
  }

  private static void bar(int i) {
    System.out.println(i);
    if (i > 0) {
      //            Thread.sleep(5000);
      System.out.println("5 seconds");
    } else {
      //            Thread.sleep(2000);
      System.out.println("2 seconds");
    }
  }

  private static int moo(boolean x) {
    System.out.println(x);
    if (x) {
      int y = x ? 5 : 2;
      System.out.println(y);
      return 5;
    } else {
      return 2;
    }
  }
}
