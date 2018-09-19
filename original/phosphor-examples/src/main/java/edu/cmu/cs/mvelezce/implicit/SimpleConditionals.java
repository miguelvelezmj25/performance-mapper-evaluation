package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.TaintUtils;
import edu.cmu.cs.mvelezce.taints.Sources;
import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.cc.TaintLabel;
import java.util.Iterator;
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
    boolean A = Sources.A_0(false);

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      Thread.sleep(300);
    }

    Set taintsOfA = TaintUtils.getLabels(taintOfA);
    assert (taintsOfA.size() == 1);
    TaintLabel taintLabelA = (TaintLabel) taintsOfA.iterator().next();
    assert (taintLabelA.getSource().equals("A"));
  }

  private static void simpleConditional_forTrueTaintInControlFlow() throws InterruptedException {
    System.out.println("Testing simpleConditional_forTrueTaintInControlFlow");
    boolean A = Sources.A_0(true);

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      Thread.sleep(300);
    }

    Set taintsOfA = TaintUtils.getLabels(taintOfA);
    assert (taintsOfA.size() == 1);
    TaintLabel taintLabelA = (TaintLabel) taintsOfA.iterator().next();
    assert (taintLabelA.getSource().equals("A"));
  }

  private static void simpleConditional_forMultipleTaints() throws InterruptedException {
    System.out.println("Testing simpleConditional_forMultipleTaints");
    boolean A = Sources.A_0(true);
    boolean B = Sources.B_1(false);

    Taint taintOfA = MultiTainter.getTaint(A);
    if (A) {
      Thread.sleep(300);
    }

    Taint taintOfB = MultiTainter.getTaint(B);
    if (B) {
      Thread.sleep(300);
    }

    Set taintsOfA = TaintUtils.getLabels(taintOfA);
    assert (taintsOfA.size() == 1);
    TaintLabel taintLabelA = (TaintLabel) taintsOfA.iterator().next();
    assert (taintLabelA.getSource().equals("A"));

    Set taintsOfB = TaintUtils.getLabels(taintOfB);
    assert (taintsOfB.size() == 1);
    TaintLabel taintLabelB = (TaintLabel) taintsOfB.iterator().next();
    assert (taintLabelB.getSource().equals("B"));
  }

  private static void implicitFlow_forBranchNotTaken() throws InterruptedException {
    System.out.println("Testing implicitFlow_forBranchNotTaken");
    boolean A = Sources.A_0(false);
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

    Set taintsOfA = TaintUtils.getLabels(taintOfA);
    assert (taintsOfA.size() == 1);
    TaintLabel taintLabelA = (TaintLabel) taintsOfA.iterator().next();
    assert (taintLabelA.getSource().equals("A"));

    Set taintsOfx = TaintUtils.getLabels(taintOfx);
    assert (taintsOfx.isEmpty());
  }

  private static void implicitFlow_forBranchTaken() throws InterruptedException {
    System.out.println("Testing implicitFlow_forBranchTaken");
    boolean A = Sources.A_0(true);
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

    Set taintsOfA = TaintUtils.getLabels(taintOfA);
    assert (taintsOfA.size() == 1);
    TaintLabel taintLabelA = (TaintLabel) taintsOfA.iterator().next();
    assert (taintLabelA.getSource().equals("A"));

    Set taintsOfx = TaintUtils.getLabels(taintOfx);
    assert (taintsOfx.size() == 1);
    TaintLabel taintLabelx = (TaintLabel) taintsOfx.iterator().next();
    assert (taintLabelx.getSource().equals("A"));
  }

  private static void implicitFlow_forBranchTakenLoop() throws InterruptedException {
    System.out.println("Testing implicitFlow_forBranchTakenLoop");
    boolean A = Sources.A_0(true);
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

    Set taintsOfA = TaintUtils.getLabels(taintOfA);
    assert (taintsOfA.size() == 1);
    TaintLabel taintLabelA = (TaintLabel) taintsOfA.iterator().next();
    assert (taintLabelA.getSource().equals("A"));

    Set taintsOfl = TaintUtils.getLabels(taintOfl);
    assert (taintsOfl.size() == 1);
    TaintLabel taintLabell = (TaintLabel) taintsOfl.iterator().next();
    assert (taintLabell.getSource().equals("A"));
  }

  private static void simpleNestedConditional_forBranchesTaken() throws InterruptedException {
    System.out.println("Testing simpleNestedConditional_forBranchesTaken");
    boolean A = Sources.A_0(true);
    boolean B = Sources.B_1(true);

    Taint taintOfA = MultiTainter.getTaint(A);
    Taint taintOfB = null;
    Taint taintOfx = null;
    if (A) {
      int x = 0;
      taintOfx = MultiTainter.getTaint(x);
      taintOfB = MultiTainter.getTaint(B);
      taintOfx = Taint.combineTags(taintOfx, taintOfB);
      if (!B) {
        Thread.sleep(300);
      }
    }

    Set taintsOfA = TaintUtils.getLabels(taintOfA);
    assert (taintsOfA.size() == 1);
    TaintLabel taintLabelA = (TaintLabel) taintsOfA.iterator().next();
    assert (taintLabelA.getSource().equals("A"));

    Set taintsOfB = TaintUtils.getLabels(taintOfB);
    assert (taintsOfB.size() == 1);
    TaintLabel taintLabelB = (TaintLabel) taintsOfB.iterator().next();
    assert (taintLabelB.getSource().equals("B"));

    Set taintsOfx = TaintUtils.getLabels(taintOfx);
    assert (taintsOfx.size() == 2);

    Iterator taintsOfxIter = taintsOfx.iterator();
    TaintLabel taintLabelx = (TaintLabel) taintsOfxIter.next();
    assert (taintLabelx.getSource().equals("A") || taintLabelx.getSource().equals("B"));
    taintLabelx = (TaintLabel) taintsOfxIter.next();
    assert (taintLabelx.getSource().equals("A") || taintLabelx.getSource().equals("B"));
  }
}
