package edu.cmu.cs.mvelezce.analysis.option;

import edu.columbia.cs.psl.phosphor.control.ControlFlowStack;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedReferenceWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {
  // public class Sources {
  public Taint PHOSPHOR_TAG;

  public static String FILE_LOCK_0(String value) {
    return value;
  }

  public static TaintedReferenceWithObjTag FILE_LOCK_0$$PHOSPHORTAGGED(
      String value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(0);
    return ret;
  }

  public static boolean AUTOCOMMIT_1(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag AUTOCOMMIT_1$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(1);
    return ret;
  }

  public static String ACCESS_MODE_DATA_2(String accessModeData) {
    return accessModeData;
  }

  public static TaintedReferenceWithObjTag ACCESS_MODE_DATA_2$$PHOSPHORTAGGED(
      String value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(2);
    return ret;
  }

  public static String CIPHER_3(String cipher) {
    return cipher;
  }

  public static TaintedReferenceWithObjTag CIPHER_3$$PHOSPHORTAGGED(
      String value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(3);
    return ret;
  }

  public static String CACHE_TYPE_4(String cacheType) {
    return cacheType;
  }

  public static TaintedReferenceWithObjTag CACHE_TYPE_4$$PHOSPHORTAGGED(
      String value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(4);
    return ret;
  }

  public static int CACHE_SIZE_5(int cacheSize) {
    return cacheSize;
  }

  public static TaintedIntWithObjTag CACHE_SIZE_5$$PHOSPHORTAGGED(
      int value, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(5);
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
