package edu.cmu.cs.mvelezce.analysis.option;

import edu.columbia.cs.psl.phosphor.control.ControlFlowStack;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.*;
import org.apache.lucene.core.codecs.Codec;
import org.apache.lucene.core.index.*;
import org.apache.lucene.core.search.similarities.Similarity;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {
  // public class Sources {
  public Taint PHOSPHOR_TAG;

  public static double RAM_BUFFER_SIZE_MB_0(double value) {
    return value;
  }

  public static MergePolicy MERGE_POLICY_1(MergePolicy mergePolicy) {
    return mergePolicy;
  }

  public static MergeScheduler MERGE_SCHEDULER_2(MergeScheduler mergeScheduler) {
    return mergeScheduler;
  }

  public static boolean COMMIT_ON_CLOSE_3(boolean option) {
    return option;
  }

  public static boolean CHECK_PENDING_FLUSH_UPDATE_4(boolean option) {
    return option;
  }

  public static boolean READER_POOLING_5(boolean option) {
    return option;
  }

  public static int MAX_BUFFERED_DOCS_6(int value) {
    return value;
  }

  public static Codec CODEC_7(Codec codec) {
    return codec;
  }

  public static boolean USE_COMPOUND_FILE_8(boolean option) {
    return option;
  }

  public static IndexDeletionPolicy INDEX_DELETION_POLICY_9(
      IndexDeletionPolicy indexDeletionPolicy) {
    return indexDeletionPolicy;
  }

  public static int MAX_TOKEN_LENGTH_10(int value) {
    return value;
  }

  public static double MAX_CFS_SEGMENT_SIZE_MB_11(double value) {
    return value;
  }

  public static double NO_CFS_RATIO_12(double value) {
    return value;
  }

  public static IndexCommit INDEX_COMMIT_13(IndexCommit indexCommit) {
    return indexCommit;
  }

  public static IndexWriter.IndexReaderWarmer MERGED_SEGMENT_WARMER_14(
      IndexWriter.IndexReaderWarmer mergedSegmentWarmer) {
    return mergedSegmentWarmer;
  }

  public static int RAM_PER_THREAD_HARD_LIMIT_15(int value) {
    return value;
  }

  public static Similarity SIMILARITY_16(Similarity similarity) {
    return similarity;
  }

  public static TaintedDoubleWithObjTag RAM_BUFFER_SIZE_MB_0$$PHOSPHORTAGGED(
      double value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedDoubleWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(0);
    return ret;
  }

  public static TaintedReferenceWithObjTag MERGE_POLICY_1$$PHOSPHORTAGGED(
      MergePolicy mergePolicy,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = mergePolicy;
    ret.taint = Taint.withLabel(1);
    return ret;
  }

  public static TaintedReferenceWithObjTag MERGE_SCHEDULER_2$$PHOSPHORTAGGED(
      MergeScheduler mergeScheduler,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = mergeScheduler;
    ret.taint = Taint.withLabel(2);
    return ret;
  }

  public static TaintedBooleanWithObjTag COMMIT_ON_CLOSE_3$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(3);
    return ret;
  }

  public static TaintedBooleanWithObjTag CHECK_PENDING_FLUSH_UPDATE_4$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(4);
    return ret;
  }

  public static TaintedBooleanWithObjTag READER_POOLING_5$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(5);
    return ret;
  }

  public static TaintedIntWithObjTag MAX_BUFFERED_DOCS_6$$PHOSPHORTAGGED(
      int value, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(6);
    return ret;
  }

  public static TaintedReferenceWithObjTag CODEC_7$$PHOSPHORTAGGED(
      Codec codec,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = codec;
    ret.taint = Taint.withLabel(7);
    return ret;
  }

  public static TaintedBooleanWithObjTag USE_COMPOUND_FILE_8$$PHOSPHORTAGGED(
      boolean option,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = Taint.withLabel(8);
    return ret;
  }

  public static TaintedReferenceWithObjTag INDEX_DELETION_POLICY_9$$PHOSPHORTAGGED(
      IndexDeletionPolicy indexDeletionPolicy,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = indexDeletionPolicy;
    ret.taint = Taint.withLabel(8);
    return ret;
  }

  public static TaintedIntWithObjTag MAX_TOKEN_LENGTH_10$$PHOSPHORTAGGED(
      int value, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(10);
    return ret;
  }

  public static TaintedDoubleWithObjTag MAX_CFS_SEGMENT_SIZE_MB_11$$PHOSPHORTAGGED(
      double value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedDoubleWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(11);
    return ret;
  }

  public static TaintedDoubleWithObjTag NO_CFS_RATIO_12$$PHOSPHORTAGGED(
      double value,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedDoubleWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(12);
    return ret;
  }

  public static TaintedReferenceWithObjTag INDEX_COMMIT_13$$PHOSPHORTAGGED(
      IndexCommit indexCommit,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    //    ((TaintedWithObjTag) (Object) indexCommit).setPHOSPHOR_TAG(Taint.withLabel(13));
    return ret;
  }

  public static TaintedReferenceWithObjTag MERGED_SEGMENT_WARMER_14$$PHOSPHORTAGGED(
      IndexWriter.IndexReaderWarmer indexReaderWarmer,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = indexReaderWarmer;
    ret.taint = Taint.withLabel(14);
    return ret;
  }

  public static TaintedIntWithObjTag RAM_PER_THREAD_HARD_LIMIT_15$$PHOSPHORTAGGED(
      int value, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = Taint.withLabel(15);
    return ret;
  }

  public static TaintedReferenceWithObjTag SIMILARITY_16$$PHOSPHORTAGGED(
      Similarity similarity,
      Taint<Integer> originalTag,
      ControlFlowStack ctrl,
      TaintedReferenceWithObjTag ret) {
    ret.val = similarity;
    ret.taint = Taint.withLabel(16);
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
