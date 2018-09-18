package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.TaintUtils;
import edu.cmu.cs.mvelezce.taints.A;
import edu.cmu.cs.mvelezce.taints.B;
import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import java.util.Set;

public class SimpleConditionals {

  public static void main(String[] args) throws InterruptedException {
    simpleConditional_forFalseTaintInControlFlow();
    simpleConditional_forTrueTaintInControlFlow();
    simpleConditional_forMultipleTaints();
    implicitFlow_forBranchNotTaken();
    implicitFlow_forBranchTaken();
    implicitFlow_forBranchTakenLoop();
    simpleNestedConditional_forBranchesTaken();
  }

  private static void simpleConditional_forFalseTaintInControlFlow() throws InterruptedException {
    System.out.println("Testing simpleConditional_forFalseTaintInControlFlow");
    edu.cmu.cs.mvelezce.taints.Taint optionA = A.getInstance();
    boolean A = MultiTainter.taintedBoolean(false, optionA);

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      Thread.sleep(300);
    }

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfA = TaintUtils.getTaints(taintOfA);
    assert (taintsOfA.size() == 1);
    assert (taintsOfA.contains(optionA));
  }

  private static void simpleConditional_forTrueTaintInControlFlow() throws InterruptedException {
    System.out.println("Testing simpleConditional_forTrueTaintInControlFlow");
    edu.cmu.cs.mvelezce.taints.Taint optionA = A.getInstance();
    boolean A = MultiTainter.taintedBoolean(true, optionA);

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      Thread.sleep(300);
    }

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfA = TaintUtils.getTaints(taintOfA);
    assert (taintsOfA.size() == 1);
    assert (taintsOfA.contains(optionA));
  }

  private static void simpleConditional_forMultipleTaints() throws InterruptedException {
    System.out.println("Testing simpleConditional_forMultipleTaints");
    edu.cmu.cs.mvelezce.taints.Taint optionA = A.getInstance();
    edu.cmu.cs.mvelezce.taints.Taint optionB = B.getInstance();
    boolean A = MultiTainter.taintedBoolean(true, optionA);
    boolean B = MultiTainter.taintedBoolean(false, optionB);

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      Thread.sleep(300);
    }

    Taint taintOfB = MultiTainter.getTaint(B);
    if (B) {
      Thread.sleep(300);
    }

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfA = TaintUtils.getTaints(taintOfA);
    assert (taintsOfA.size() == 1);
    assert (taintsOfA.contains(optionA));

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfB = TaintUtils.getTaints(taintOfB);
    assert (taintsOfB.size() == 1);
    assert (taintsOfB.contains(optionB));
  }

  private static void implicitFlow_forBranchNotTaken() throws InterruptedException {
    System.out.println("Testing implicitFlow_forBranchNotTaken");
    edu.cmu.cs.mvelezce.taints.Taint optionA = A.getInstance();
    boolean A = MultiTainter.taintedBoolean(false, optionA);
    boolean x = false;

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      x = true;
      Thread.sleep(300);
    }

    Taint taintOfx = MultiTainter.getTaint(x);
    if (x) {
      Thread.sleep(300);
    }

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfA = TaintUtils.getTaints(taintOfA);
    assert (taintsOfA.size() == 1);
    assert (taintsOfA.contains(optionA));

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfx = TaintUtils.getTaints(taintOfx);
    assert (taintsOfx.isEmpty());
  }

  private static void implicitFlow_forBranchTaken() throws InterruptedException {
    System.out.println("Testing implicitFlow_forBranchTaken");
    edu.cmu.cs.mvelezce.taints.Taint optionA = A.getInstance();
    boolean A = MultiTainter.taintedBoolean(true, optionA);
    boolean x = false;

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      x = true;
      Thread.sleep(300);
    }

    Taint taintOfx = MultiTainter.getTaint(x);
    if (x) {
      Thread.sleep(300);
    }

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfA = TaintUtils.getTaints(taintOfA);
    assert (taintsOfA.size() == 1);
    assert (taintsOfA.contains(optionA));

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfx = TaintUtils.getTaints(taintOfx);
    assert (taintsOfx.size() == 1);
    assert (taintsOfx.contains(optionA));
  }

  private static void implicitFlow_forBranchTakenLoop() throws InterruptedException {
    System.out.println("Testing implicitFlow_forBranchTakenLoop");
    edu.cmu.cs.mvelezce.taints.Taint optionA = A.getInstance();
    boolean A = MultiTainter.taintedBoolean(true, optionA);
    int l = 0;

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      l = 1000;
      Thread.sleep(300);
    }

    long sum = 0;

    Taint taintOfl = MultiTainter.getTaint(l);
    for (int i = 0; i < l; i++) {
      sum += Math.random();
    }

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfA = TaintUtils.getTaints(taintOfA);
    assert (taintsOfA.size() == 1);
    assert (taintsOfA.contains(optionA));

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfl = TaintUtils.getTaints(taintOfl);
    assert (taintsOfl.size() == 1);
    assert (taintsOfl.contains(optionA));
  }

  private static void simpleNestedConditional_forBranchesTaken() throws InterruptedException {
    System.out.println("Testing simpleNestedConditional_forBranchesTaken");
    edu.cmu.cs.mvelezce.taints.Taint optionA = A.getInstance();
    edu.cmu.cs.mvelezce.taints.Taint optionB = B.getInstance();
    boolean A = MultiTainter.taintedBoolean(true, optionA);
    boolean B = MultiTainter.taintedBoolean(true, optionB);

    Taint taintOfA = MultiTainter.getTaint(A);
    Taint taintOfB = null;
    Taint taintOfX = null;
    if (A) {
      int x = 0;
      taintOfX = MultiTainter.getTaint(x);
      taintOfB = MultiTainter.getTaint(B);
      taintOfX = Taint.combineTags(taintOfX, taintOfB);
      if (!B) {
        Thread.sleep(300);
      }
    }

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfA = TaintUtils.getTaints(taintOfA);
    assert (taintsOfA.size() == 1);
    assert (taintsOfA.contains(optionA));

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfB = TaintUtils.getTaints(taintOfB);
    assert (taintsOfB.size() == 1);
    assert (taintsOfB.contains(optionB));

    Set<edu.cmu.cs.mvelezce.taints.Taint> taintsOfX = TaintUtils.getTaints(taintOfX);
    assert (taintsOfX.size() == 2);
    assert (taintsOfX.contains(optionA));
    assert (taintsOfX.contains(optionB));
  }
}
