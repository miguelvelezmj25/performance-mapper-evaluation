package edu.cmu.cs.mvelezce.analysis.option;

import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.ControlTaintTagStack;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;
import org.apache.lucene.core.index.IndexWriterConfig;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {
  // public class Sources {
  public Taint PHOSPHOR_TAG;

  //  public static MergeScheduler MERGE_SCHEDULER_0(boolean option) {
  //    if (option) {
  //      return new SerialMergeScheduler();
  //    }
  //
  //    return NoMergeScheduler.INSTANCE;
  //  }

  public static boolean CHECK_PENDING_FLUSH_UPDATE_0(boolean option) {
    return option;
  }

  public static int MAX_BUFFERED_DOCS_1(boolean option) {
    if (option) {
      return 500;
    }

    return IndexWriterConfig.DEFAULT_MAX_BUFFERED_DOCS;
  }
  //
  //  public static MergePolicy MERGE_POLICY_2(boolean option) {
  //    if (option) {
  //      return new TieredMergePolicy();
  //    }
  //
  //    return NoMergePolicy.INSTANCE;
  //  }

  public static boolean READER_POOLING_2(boolean option) {
    return option;
  }

  public static boolean COMMIT_ON_CLOSE_3(boolean option) {
    return option;
  }
  //
  //  public static MergeScheduler MERGE_SCHEDULER_0$$PHOSPHORTAGGED(
  //      Taint option$$PHOSPHORTAGGED, boolean option, ControlTaintTagStack phosphorJumpControlTag)
  // {
  //    MergeScheduler ret = MERGE_SCHEDULER_0(option);
  //    Taint taint = new Taint(0);
  //    ((TaintedWithObjTag) ret).setPHOSPHOR_TAG(taint);
  //
  //    return ret;
  //  }

  public static TaintedBooleanWithObjTag CHECK_PENDING_FLUSH_UPDATE_0$$PHOSPHORTAGGED(
      Taint option$$PHOSPHORTAGGED,
      boolean option,
      ControlTaintTagStack Phopshor$$ImplicitTaintTrackingFromParent,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(0);
    return ret;
  }

  public static TaintedIntWithObjTag MAX_BUFFERED_DOCS_1$$PHOSPHORTAGGED(
      Taint option$$PHOSPHORTAGGED,
      boolean option,
      ControlTaintTagStack phosphorJumpControlTag,
      TaintedIntWithObjTag ret) {
    ret.val = MAX_BUFFERED_DOCS_1(option);
    ret.taint = new Taint(1);
    return ret;
  }
  //
  //  public static MergePolicy MERGE_POLICY_2$$PHOSPHORTAGGED(
  //      Taint option$$PHOSPHORTAGGED, boolean option, ControlTaintTagStack phosphorJumpControlTag)
  // {
  //    MergePolicy ret = MERGE_POLICY_2(option);
  //    Taint taint = new Taint(2);
  //    ((TaintedWithObjTag) ret).setPHOSPHOR_TAG(taint);
  //
  //    return ret;
  //  }

  public static TaintedBooleanWithObjTag READER_POOLING_2$$PHOSPHORTAGGED(
      Taint option$$PHOSPHORTAGGED,
      boolean option,
      ControlTaintTagStack Phopshor$$ImplicitTaintTrackingFromParent,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(2);
    return ret;
  }

  public static TaintedBooleanWithObjTag COMMIT_ON_CLOSE_3$$PHOSPHORTAGGED(
      Taint option$$PHOSPHORTAGGED,
      boolean option,
      ControlTaintTagStack Phopshor$$ImplicitTaintTrackingFromParent,
      TaintedBooleanWithObjTag ret) {
    ret.val = option;
    ret.taint = new Taint(3);
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
