package edu.cmu.cs.mvelezce.objtag;

import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;
import edu.columbia.cs.psl.phosphor.runtime.Taint;

public class SimpleConditionals {

//  public static void main(String[] args) throws InterruptedException {
//    simpleConditional1();
//    simpleConditional2();
//    implicitFlowNotExecutedNotCaught();
//    implicitFlowExecutedNotCaught1();
//    implicitFlowExecutedNotCaught2();
//  }
//
//  private static void simpleConditional1() throws InterruptedException {
//    System.out.println("Testing simpleConditional1");
//    String optionA = "A";
//    boolean A = MultiTainter.taintedBoolean(true, optionA);
//
//    Taint taintOfA = MultiTainter.getTaint(A);
//    if (A) {
//      Thread.sleep(1000);
//    }
//
//    assert (taintOfA != null);
//    assert (taintOfA.getLabel().equals(optionA));
//  }
//
//  private static void simpleConditional2() throws InterruptedException {
//    System.out.println("Testing simpleConditional2");
//    String optionA = "A";
//    String optionB = "B";
//    boolean A = MultiTainter.taintedBoolean(true, optionA);
//    boolean B = MultiTainter.taintedBoolean(false, optionB);
//
//    Taint taintOfA = MultiTainter.getTaint(A);
//    if (A) {
//      Thread.sleep(1000);
//    }
//
//    Taint taintOfB = MultiTainter.getTaint(B);
//    if (B) {
//      Thread.sleep(1000);
//    }
//
//    assert (taintOfA != null);
//    assert (taintOfA.getLabel().equals(optionA));
//    assert (taintOfB != null);
//    assert (taintOfB.getLabel().equals(optionB));
//  }
//
//  private static void implicitFlowNotExecutedNotCaught() throws InterruptedException {
//    System.out.println("Testing implicitFlowNotExecutedNotCaught");
//    String optionA = "A";
//    boolean A = MultiTainter.taintedBoolean(false, optionA);
//    boolean x = false;
//
//    Taint taintOfA = MultiTainter.getTaint(A);
//    if (A) {
//      x = true;
//      Thread.sleep(1000);
//    }
//
//    Taint taintOfx = MultiTainter.getTaint(x);
//    if (x) {
//      Thread.sleep(1000);
//    }
//
//    assert (taintOfA != null);
//    assert (taintOfA.getLabel().equals(optionA));
//    assert (taintOfx == null);
//  }
//
//  private static void implicitFlowExecutedNotCaught1() throws InterruptedException {
//    System.out.println("Testing implicitFlowExecutedNotCaught1");
//    String optionA = "A";
//    boolean A = MultiTainter.taintedBoolean(true, optionA);
//    boolean x = false;
//
//    Taint taintOfA = MultiTainter.getTaint(A);
//    if (A) {
//      x = true;
//      Thread.sleep(1000);
//    }
//
//    Taint taintOfx = MultiTainter.getTaint(x);
//    if (x) {
//      Thread.sleep(1000);
//    }
//
//    assert (taintOfA != null);
//    assert (taintOfA.getLabel().equals(optionA));
//    assert (taintOfx == null);
//  }
//
//  private static void implicitFlowExecutedNotCaught2() throws InterruptedException {
//    System.out.println("Testing implicitFlowExecutedNotCaught2");
//    String optionA = "A";
//    boolean A = MultiTainter.taintedBoolean(true, optionA);
//    int l = 0;
//
//    Taint taintOfA = MultiTainter.getTaint(A);
//    if (A) {
//      l = 1000;
//      Thread.sleep(1000);
//    }
//
//    long sum = 0;
//
//    Taint taintOfl = MultiTainter.getTaint(l);
//    for (int i = 0; i < l; i++) {
//      sum += Math.random();
//    }
//
//    assert (taintOfA != null);
//    assert (taintOfA.getLabel().equals(optionA));
//    assert (taintOfl == null);
//  }
}
