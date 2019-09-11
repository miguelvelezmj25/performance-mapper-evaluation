package edu.cmu.cs.mvelezce.analysis.option;

import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.ControlTaintTagStack;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedLongWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {
  // public class Sources {
  public Taint PHOSPHOR_TAG;

  public static boolean getOptionACTION(boolean option) {
    return option;
  }

  public static boolean getOptionRECORDS(boolean option) {
    return option;
  }

  public static boolean getOptionDATA(boolean option) {
    return option;
  }

  public static boolean getOptionDUPLICATES(boolean option) {
    return option;
  }

  public static boolean getOptionKEYSIZE(boolean option) {
    return option;
  }

  public static boolean getOptionSEQUENTIAL(boolean option) {
    return option;
  }

  public static boolean getOptionKEYSONLY(boolean option) {
    return option;
  }

  public static boolean DUPLICATES_0(boolean option) {
    return option;
  }

  public static boolean SEQUENTIAL_1(boolean option) {
    return option;
  }

  public static boolean KEYSONLY_2(boolean option) {
    return option;
  }

  public static String FILELOGGINGLEVEL_3(boolean option) {
    if (option) {
      return "INFO";
    }

    return "OFF";
  }

  public static long JECACHESIZE_2(boolean option) {
    long value = 1000L * 1000;

    if (option) {
      return value * 1000;
    }

    return value;
  }

  public static boolean LOCKING_5(boolean option) {
    return option;
  }

  public static boolean SHAREDCACHE_3(boolean option) {
    return option;
  }

  public static boolean REPLICATED_4(boolean option) {
    return option;
  }

  public static TaintedBooleanWithObjTag DUPLICATES_0$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(0);
    return ret;
  }

  public static TaintedBooleanWithObjTag SEQUENTIAL_1$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(1);
    return ret;
  }

  public static TaintedBooleanWithObjTag KEYSONLY_2$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(2);
    return ret;
  }

  public static String FILELOGGINGLEVEL_3$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl) {
    Object level = FILELOGGINGLEVEL_3(option);
    ((TaintedWithObjTag) level).setPHOSPHOR_TAG(new Taint(3));
    return (String) level;
  }

  public static TaintedLongWithObjTag JECACHESIZE_2$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedLongWithObjTag ret) {
    ret.val = JECACHESIZE_2(option);
    ret.taint = new Taint(2);
    return ret;
  }

  public static TaintedBooleanWithObjTag LOCKING_5$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(5);
    return ret;
  }

  public static TaintedBooleanWithObjTag SHAREDCACHE_3$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(3);
    return ret;
  }

  public static TaintedBooleanWithObjTag REPLICATED_4$$PHOSPHORTAGGED(
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
