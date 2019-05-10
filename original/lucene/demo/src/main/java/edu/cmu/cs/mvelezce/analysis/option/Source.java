package edu.cmu.cs.mvelezce.analysis.option;

import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.ControlTaintTagStack;
import edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;
import org.apache.lucene.index.IndexWriterConfig;

@TaintInstrumented
public class Source implements TaintedWithObjTag {
  // public class Sources {
  public Taint PHOSPHOR_TAG;

  public static int MAX_BUFFERED_DOCS_0(boolean option) {
    if (option) {
      return 500;
    }

    return IndexWriterConfig.DEFAULT_MAX_BUFFERED_DOCS;
  }

  //  public static boolean RAM_BUFFER_SIZE_1(boolean option) {
  //    return option;
  //  }
  //
  //  public static boolean MERGE_POLICY_2(boolean option) {
  //    return option;
  //  }
  //
  //  public static boolean CODEC_3(boolean option) {
  //    return option;
  //  }
  //
  //
  //  public static boolean USE_COMPOUND_FILE_5(boolean option) {
  //    return option;
  //  }
  //
  //  public static boolean MAX_TOKEN_LENGTH_6(boolean option) {
  //    return option;
  //  }

  public static TaintedIntWithObjTag MAX_BUFFERED_DOCS_0$$PHOSPHORTAGGED(
      Taint originalTag, boolean option, ControlTaintTagStack ctrl, TaintedIntWithObjTag ret) {
    ret.val = MAX_BUFFERED_DOCS_0(option);
    ret.taint = new Taint(0);
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
