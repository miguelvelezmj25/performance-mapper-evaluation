package edu.cmu.cs.mvelezce.analysis;

public class CallStaticField {

  static {
    System.out.println("Hello");
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println(ClassWithStaticFields.GOODBYE);
    //    boolean A = Boolean.parseBoolean(args[0]);
    //    boolean B = Boolean.parseBoolean(args[1]);
    //
    //    foo(A);
    //
    //    if (B) {
    //      System.out.println();
    //    }
  }

  private static void foo(boolean a) {
    if (a) {
      System.out.println();
    }
  }
}
