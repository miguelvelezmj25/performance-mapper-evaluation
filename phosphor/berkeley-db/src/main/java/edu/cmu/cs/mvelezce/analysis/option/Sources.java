package edu.cmu.cs.mvelezce.analysis.option;

import com.sleepycat.je.CacheMode;
import com.sleepycat.je.Durability;
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

  public static long MAX_MEMORY_2(long value) {
    return value;
  }

  public static boolean ENV_SHARED_CACHE_3(boolean option) {
    return option;
  }

  public static boolean REPLICATED_4(boolean option) {
    return option;
  }

  public static boolean ENV_IS_LOCKING_5(boolean option) {
    return option;
  }

  public static CacheMode CACHE_MODE_6(CacheMode cacheMode) {
    return cacheMode;
  }

  public static boolean TEMPORARY_7(boolean option) {
    return option;
  }

  public static String JE_FILE_LEVEL_8(String fileLoggingLevel) {
    return fileLoggingLevel;
  }

  public static String ENV_BACKGROUND_READ_LIMIT_9(String envBackgroundReadLimit) {
    return envBackgroundReadLimit;
  }

  public static boolean LOCK_DEADLOCK_DETECT_10(boolean option) {
    return option;
  }

  public static boolean TXN_SERIALIZABLE_ISOLATION_11(boolean option) {
    return option;
  }

  public static Durability JE_DURABILITY_12(Durability jeDurability) {
    return jeDurability;
  }

  public static String ADLER32_CHUNK_SIZE_13(String adler32ChunkSize) {
    return adler32ChunkSize;
  }

  public static String CHECKPOINTER_BYTES_INTERVAL_14(String checkpointerBytesInterval) {
    return checkpointerBytesInterval;
  }

  public static String LOCK_DEADLOCK_DETECT_DELAY_15(String lockDeadlockDetectDelay) {
    return lockDeadlockDetectDelay;
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

  public static TaintedLongWithObjTag MAX_MEMORY_2$$PHOSPHORTAGGED(
      Taint originalTag, long value, ControlTaintTagStack ctrl, TaintedLongWithObjTag ret) {
    ret.val = value;
    ret.taint = new Taint(2);
    return ret;
  }

  public static TaintedBooleanWithObjTag ENV_SHARED_CACHE_3$$PHOSPHORTAGGED(
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

  public static TaintedBooleanWithObjTag ENV_IS_LOCKING_5$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(5);
    return ret;
  }

  public static CacheMode CACHE_MODE_6$$PHOSPHORTAGGED(
      CacheMode cacheMode, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) cacheMode).setPHOSPHOR_TAG(new Taint(6));
    return cacheMode;
  }

  public static TaintedBooleanWithObjTag TEMPORARY_7$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(7);
    return ret;
  }

  public static String JE_FILE_LEVEL_8$$PHOSPHORTAGGED(
      String fileLoggingLevel, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) fileLoggingLevel).setPHOSPHOR_TAG(new Taint(8));
    return fileLoggingLevel;
  }

  public static String ENV_BACKGROUND_READ_LIMIT_9$$PHOSPHORTAGGED(
      String envBackgroundReadLimit, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) envBackgroundReadLimit).setPHOSPHOR_TAG(new Taint(9));
    return envBackgroundReadLimit;
  }

  public static TaintedBooleanWithObjTag LOCK_DEADLOCK_DETECT_10$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(10);
    return ret;
  }

  public static TaintedBooleanWithObjTag TXN_SERIALIZABLE_ISOLATION_11$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(11);
    return ret;
  }

  public static Durability JE_DURABILITY_12$$PHOSPHORTAGGED(
      Durability jeDurability, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) jeDurability).setPHOSPHOR_TAG(new Taint(12));
    return jeDurability;
  }

  public static String ADLER32_CHUNK_SIZE_13$$PHOSPHORTAGGED(
      String adler32ChunkSize, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) adler32ChunkSize).setPHOSPHOR_TAG(new Taint(13));
    return adler32ChunkSize;
  }

  public static String CHECKPOINTER_BYTES_INTERVAL_14$$PHOSPHORTAGGED(
      String checkpointerBytesInterval, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) checkpointerBytesInterval).setPHOSPHOR_TAG(new Taint(14));
    return checkpointerBytesInterval;
  }

  public static String LOCK_DEADLOCK_DETECT_DELAY_15$$PHOSPHORTAGGED(
          String lockDeadlockDetectDelay, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) lockDeadlockDetectDelay).setPHOSPHOR_TAG(new Taint(15));
    return lockDeadlockDetectDelay;
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
