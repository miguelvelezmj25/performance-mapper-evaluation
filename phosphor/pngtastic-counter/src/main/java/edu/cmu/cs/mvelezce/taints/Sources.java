package edu.cmu.cs.mvelezce.taints;

import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.ControlTaintTagStack;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {

  public Taint PHOSPHOR_TAG;

  public static boolean FREQTHRESHOLD_0(boolean option) {
    return option;
  }

  public static boolean DISTTHRESHOLD_1(boolean option) {
    return option;
  }

  public static boolean MINALPHA_2(boolean option) {
    return option;
  }

  public static boolean TIMEOUT_3(boolean option) {
    return option;
  }

  public static boolean LOGLEVEL_4(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag FREQTHRESHOLD_0$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(0);
    return ret;
  }

  public static TaintedBooleanWithObjTag DISTTHRESHOLD_1$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(1);
    return ret;
  }

  public static TaintedBooleanWithObjTag MINALPHA_2$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(2);
    return ret;
  }

  public static TaintedBooleanWithObjTag TIMEOUT_3$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(3);
    return ret;
  }

  public static TaintedBooleanWithObjTag LOGLEVEL_4$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(4);
    return ret;
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
