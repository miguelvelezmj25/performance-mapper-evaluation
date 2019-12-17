package edu.cmu.cs.mvelezce.analysis.option;

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
      Taint originalTag, double value, ControlTaintTagStack ctrl, TaintedDoubleWithObjTag ret) {
    ret.val = value;
    ret.taint = new Taint(0);
    return ret;
  }

  public static MergePolicy MERGE_POLICY_1$$PHOSPHORTAGGED(
      MergePolicy mergePolicy, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) mergePolicy).setPHOSPHOR_TAG(new Taint(1));
    return mergePolicy;
  }

  public static MergeScheduler MERGE_SCHEDULER_2$$PHOSPHORTAGGED(
      MergeScheduler mergeScheduler, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) mergeScheduler).setPHOSPHOR_TAG(new Taint(2));
    return mergeScheduler;
  }

  public static TaintedBooleanWithObjTag COMMIT_ON_CLOSE_3$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(3);
    return ret;
  }

  public static TaintedBooleanWithObjTag CHECK_PENDING_FLUSH_UPDATE_4$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(4);
    return ret;
  }

  public static TaintedBooleanWithObjTag READER_POOLING_5$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(5);
    return ret;
  }

  public static TaintedIntWithObjTag MAX_BUFFERED_DOCS_6$$PHOSPHORTAGGED(
      Taint originalTag, int value, ControlTaintTagStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = new Taint(6);
    return ret;
  }

  public static Codec CODEC_7$$PHOSPHORTAGGED(Codec codec, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) codec).setPHOSPHOR_TAG(new Taint(7));
    return codec;
  }

  public static TaintedBooleanWithObjTag USE_COMPOUND_FILE_8$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(8);
    return ret;
  }

  public static IndexDeletionPolicy INDEX_DELETION_POLICY_9$$PHOSPHORTAGGED(
      IndexDeletionPolicy indexDeletionPolicy, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) indexDeletionPolicy).setPHOSPHOR_TAG(new Taint(9));
    return indexDeletionPolicy;
  }

  public static TaintedIntWithObjTag MAX_TOKEN_LENGTH_10$$PHOSPHORTAGGED(
      Taint originalTag, int value, ControlTaintTagStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = new Taint(10);
    return ret;
  }

  public static TaintedDoubleWithObjTag MAX_CFS_SEGMENT_SIZE_MB_11$$PHOSPHORTAGGED(
      Taint originalTag, double value, ControlTaintTagStack ctrl, TaintedDoubleWithObjTag ret) {
    ret.val = value;
    ret.taint = new Taint(11);
    return ret;
  }

  public static TaintedDoubleWithObjTag NO_CFS_RATIO_12$$PHOSPHORTAGGED(
      Taint originalTag, double value, ControlTaintTagStack ctrl, TaintedDoubleWithObjTag ret) {
    ret.val = value;
    ret.taint = new Taint(12);
    return ret;
  }

  public static IndexCommit INDEX_COMMIT_13$$PHOSPHORTAGGED(
      IndexCommit indexCommit, ControlTaintTagStack ctrl) {
    //    ((TaintedWithObjTag) (Object) indexCommit).setPHOSPHOR_TAG(new Taint(13));
    return indexCommit;
  }

  public static IndexWriter.IndexReaderWarmer MERGED_SEGMENT_WARMER_14$$PHOSPHORTAGGED(
      IndexWriter.IndexReaderWarmer indexReaderWarmer, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) indexReaderWarmer).setPHOSPHOR_TAG(new Taint(14));
    return indexReaderWarmer;
  }

  public static TaintedIntWithObjTag RAM_PER_THREAD_HARD_LIMIT_15$$PHOSPHORTAGGED(
      Taint originalTag, int value, ControlTaintTagStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = value;
    ret.taint = new Taint(15);
    return ret;
  }

  public static Similarity SIMILARITY_16$$PHOSPHORTAGGED(
      Similarity similarity, ControlTaintTagStack ctrl) {
    ((TaintedWithObjTag) (Object) similarity).setPHOSPHOR_TAG(new Taint(16));
    return similarity;
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
