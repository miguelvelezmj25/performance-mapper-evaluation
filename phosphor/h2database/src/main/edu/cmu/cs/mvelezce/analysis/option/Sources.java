package edu.cmu.cs.mvelezce.analysis.option;

import edu.columbia.cs.psl.phosphor.control.ControlFlowStack;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedReferenceWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;
import org.h2.store.FileLockMethod;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {
  // public class Sources {
  public Taint PHOSPHOR_TAG;

  public static FileLockMethod FILE_LOCK_0(FileLockMethod value) {
    return value;
  }

  public static TaintedReferenceWithObjTag FILE_LOCK_0$$PHOSPHORTAGGED(
      FileLockMethod value,
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

  public static boolean MV_STORE_6(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag MV_STORE_6$$PHOSPHORTAGGED(
      boolean value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(6);
    return ret;
  }

  public static int ANALYZE_AUTO_7(int analyzeAuto) {
    return analyzeAuto;
  }

  public static TaintedIntWithObjTag ANALYZE_AUTO_7$$PHOSPHORTAGGED(
      int value, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(7);
    return ret;
  }

  public static boolean DEFRAG_ALWAYS_8(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag DEFRAG_ALWAYS_8$$PHOSPHORTAGGED(
      boolean value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(8);
    return ret;
  }

  public static boolean IF_EXISTS_9(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag IF_EXISTS_9$$PHOSPHORTAGGED(
      boolean value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(9);
    return ret;
  }

  public static boolean FORBID_CREATION_10(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag FORBID_CREATION_10$$PHOSPHORTAGGED(
      boolean value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(10);
    return ret;
  }

  public static boolean IGNORE_UNKNWON_SETTING_11(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag IGNORE_UNKNWON_SETTING_11$$PHOSPHORTAGGED(
      boolean value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(11);
    return ret;
  }

  public static int PAGE_SIZE_12(int pageSize) {
    return pageSize;
  }

  public static TaintedIntWithObjTag PAGE_SIZE_12$$PHOSPHORTAGGED(
      int value, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(12);
    return ret;
  }

  public static int ANALYZE_SAMPLE_13(int analyzeSample) {
    return analyzeSample;
  }

  public static TaintedIntWithObjTag ANALYZE_SAMPLE_13$$PHOSPHORTAGGED(
      int value, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(13);
    return ret;
  }

  public static boolean COMPRESS_14(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag COMPRESS_14$$PHOSPHORTAGGED(
      boolean value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(14);
    return ret;
  }

  public static boolean OPTIMIZE_DISTINCT_15(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag OPTIMIZE_DISTINCT_15$$PHOSPHORTAGGED(
      boolean value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(15);
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
