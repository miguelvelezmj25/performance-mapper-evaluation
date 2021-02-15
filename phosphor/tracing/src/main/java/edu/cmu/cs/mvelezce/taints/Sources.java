package edu.cmu.cs.mvelezce.taints;

import edu.columbia.cs.psl.phosphor.control.ControlFlowStack;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {

  public Taint<Integer> PHOSPHOR_TAG;

  public static TaintedBooleanWithObjTag A_0$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(0);
    return ret;
  }

  public static TaintedBooleanWithObjTag B_1$$PHOSPHORTAGGED(
          boolean option,
          Taint<Integer> originalTag,
          ControlFlowStack ctrl,
          TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(1);
    return ret;
  }

  public static TaintedIntWithObjTag N_25$$PHOSPHORTAGGED(
          int value,
          Taint<Integer> originalTag,
          ControlFlowStack ctrl,
          TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(25);
    return ret;
  }

  public static boolean A_0(boolean option) {
    return option;
  }

  public static boolean B_1(boolean option) {
    return option;
  }

  public static int N_25(int value) {
    return value;
  }

  @Override
  public Object getPHOSPHOR_TAG() {
    return this.PHOSPHOR_TAG;
  }

  @Override
  public void setPHOSPHOR_TAG(Object var1) {
    this.PHOSPHOR_TAG = (Taint) var1;
  }
}
