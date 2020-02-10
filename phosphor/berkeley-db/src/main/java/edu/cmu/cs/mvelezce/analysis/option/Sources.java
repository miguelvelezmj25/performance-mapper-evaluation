package edu.cmu.cs.mvelezce.analysis.option;

import com.sleepycat.je.CacheMode;
import com.sleepycat.je.Durability;
import edu.columbia.cs.psl.phosphor.control.ControlFlowStack;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedLongWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedReferenceWithObjTag;
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
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(0);
    return ret;
  }

  public static TaintedBooleanWithObjTag SEQUENTIAL_1$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(1);
    return ret;
  }

  public static TaintedLongWithObjTag MAX_MEMORY_2$$PHOSPHORTAGGED(
      long value, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedLongWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(2);
    return ret;
  }

  public static TaintedBooleanWithObjTag ENV_SHARED_CACHE_3$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(3);
    return ret;
  }

  public static TaintedBooleanWithObjTag REPLICATED_4$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(4);
    return ret;
  }

  public static TaintedBooleanWithObjTag ENV_IS_LOCKING_5$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(5);
    return ret;
  }

  public static TaintedReferenceWithObjTag CACHE_MODE_6$$PHOSPHORTAGGED(
      CacheMode cacheMode,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = cacheMode;
    ret.taint = Taint.withLabel(6);
    return ret;
  }

  public static TaintedBooleanWithObjTag TEMPORARY_7$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(7);
    return ret;
  }

  public static TaintedReferenceWithObjTag JE_FILE_LEVEL_8$$PHOSPHORTAGGED(
      String fileLoggingLevel,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = fileLoggingLevel;
    ret.taint = Taint.withLabel(8);
    return ret;
  }

  public static TaintedReferenceWithObjTag ENV_BACKGROUND_READ_LIMIT_9$$PHOSPHORTAGGED(
      String envBackgroundReadLimit,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = envBackgroundReadLimit;
    ret.taint = Taint.withLabel(9);
    return ret;
  }

  public static TaintedBooleanWithObjTag LOCK_DEADLOCK_DETECT_10$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(10);
    return ret;
  }

  public static TaintedBooleanWithObjTag TXN_SERIALIZABLE_ISOLATION_11$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(11);
    return ret;
  }

  public static TaintedReferenceWithObjTag JE_DURABILITY_12$$PHOSPHORTAGGED(
      Durability jeDurability,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = jeDurability;
    ret.taint = Taint.withLabel(12);
    return ret;
  }

  public static TaintedReferenceWithObjTag ADLER32_CHUNK_SIZE_13$$PHOSPHORTAGGED(
      String adler32ChunkSize,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = adler32ChunkSize;
    ret.taint = Taint.withLabel(13);
    return ret;
  }

  public static TaintedReferenceWithObjTag CHECKPOINTER_BYTES_INTERVAL_14$$PHOSPHORTAGGED(
      String checkpointerBytesInterval,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = checkpointerBytesInterval;
    ret.taint = Taint.withLabel(14);
    return ret;
  }

  public static TaintedReferenceWithObjTag LOCK_DEADLOCK_DETECT_DELAY_15$$PHOSPHORTAGGED(
      String lockDeadlockDetectDelay,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = lockDeadlockDetectDelay;
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
