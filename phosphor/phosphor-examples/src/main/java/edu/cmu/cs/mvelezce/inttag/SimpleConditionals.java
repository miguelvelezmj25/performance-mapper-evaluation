// package edu.cmu.cs.mvelezce.inttag;
//
// import edu.columbia.cs.psl.phosphor.runtime.Tainter;
//
// public class SimpleConditionals {
//
////  public static void main(String[] args) throws InterruptedException {
////    simpleConditional1();
////    simpleConditional2();
////    implicitFlowNotExecutedNotCaught();
////    implicitFlowExecutedNotCaught1();
////    implicitFlowExecutedNotCaught2();
////  }
////
////  private static void simpleConditional1() throws InterruptedException {
////    System.out.println("Testing simpleConditional1");
////    boolean A = Tainter.taintedBoolean(true, 1);
////
////    int taintOfA = Tainter.getTaint(A);
////    if (A) {
////      System.out.println(1000);
////    }
////
////    assert (taintOfA == 1);
////  }
////
////  private static void simpleConditional2() throws InterruptedException {
////    System.out.println("Testing simpleConditional2");
////    boolean A = Tainter.taintedBoolean(true, 1);
////    boolean B = Tainter.taintedBoolean(false, 2);
////
////    int taintOfA = Tainter.getTaint(A);
////    if (A) {
////      System.out.println(1000);
////    }
////
////    int taintOfB = Tainter.getTaint(B);
////    if (B) {
////      System.out.println(1000);
////    }
////
////    assert (taintOfA == 1);
////    assert (taintOfB == 2);
////  }
////
////  private static void implicitFlowNotExecutedNotCaught() throws InterruptedException {
////    System.out.println("Testing implicitFlowNotExecutedNotCaught");
////    boolean A = Tainter.taintedBoolean(false, 1);
////    boolean x = false;
////
////    int taintOfA = Tainter.getTaint(A);
////    if (A) {
////      x = true;
////      System.out.println(1000);
////    }
////
////    int taintOfx = Tainter.getTaint(x);
////    if (x) {
////      System.out.println(1000);
////    }
////
////    assert (taintOfA == 1);
////    assert (taintOfx == 0);
////  }
////
////  private static void implicitFlowExecutedNotCaught1() throws InterruptedException {
////    System.out.println("Testing implicitFlowExecutedNotCaught1");
////    boolean A = Tainter.taintedBoolean(true, 1);
////    boolean x = false;
////
////    int taintOfA = Tainter.getTaint(A);
////    if (A) {
////      x = true;
////      System.out.println(1000);
////    }
////
////    int taintOfx = Tainter.getTaint(x);
////    if (x) {
////      System.out.println(1000);
////    }
////
////    assert (taintOfA == 1);
////    assert (taintOfx == 0);
////  }
////
////  private static void implicitFlowExecutedNotCaught2() throws InterruptedException {
////    System.out.println("Testing implicitFlowExecutedNotCaught2");
////    boolean A = Tainter.taintedBoolean(true, 1);
////    int l = 0;
////
////    int taintOfA = Tainter.getTaint(A);
////    if (A) {
////      l = 1000;
////      System.out.println(1000);
////    }
////
////    long sum = 0;
////
////    int taintOfl = Tainter.getTaint(l);
////    for(int i = 0; i < l; i++) {
////      sum += Math.random();
////    }
////
////    assert (taintOfA == 1);
////    assert (taintOfl == 0);
////  }
//
// }
