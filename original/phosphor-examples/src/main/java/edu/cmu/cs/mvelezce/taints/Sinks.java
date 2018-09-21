package edu.cmu.cs.mvelezce.taints;

import edu.columbia.cs.psl.phosphor.Configuration;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.runtime.TaintSentinel;
import edu.columbia.cs.psl.phosphor.struct.ControlTaintTagStack;
import edu.columbia.cs.psl.phosphor.struct.LazyArrayObjTags;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.multid.MultiDTaintedArray;
import edu.columbia.cs.psl.phosphor.struct.multid.MultiDTaintedArrayWithObjTag;

@TaintInstrumented
public class Sinks implements TaintedWithObjTag {
  static final long serialVersionUID = -4448519827989177134L;
  public Taint PHOSPHOR_TAG;
  public static Taint serialVersionUIDPHOSPHOR_TAG;

  public Sinks(ControlTaintTagStack phosphorJumpControlTag, TaintSentinel var2) {
  }

  public static void sink$$PHOSPHORTAGGED(Object var0, ControlTaintTagStack var1) {
    Configuration.autoTainter.checkTaint(var0, "edu/cmu/cs/mvelezce/taints/Sinks.sink$$PHOSPHORTAGGED(Ljava/lang/Object;Ledu/columbia/cs/psl/phosphor/struct/ControlTaintTagStack;)V");
    Configuration.autoTainter.checkTaint(var1, "edu/cmu/cs/mvelezce/taints/Sinks.sink$$PHOSPHORTAGGED(Ljava/lang/Object;Ledu/columbia/cs/psl/phosphor/struct/ControlTaintTagStack;)V");
  }

  public boolean equals(Object other) {
    return super.equals(other);
  }

  public int hashCode() {
    return super.hashCode();
  }

  public Object getPHOSPHOR_TAG() {
    return this.PHOSPHOR_TAG;
  }

  public void setPHOSPHOR_TAG(Object var1) {
    this.PHOSPHOR_TAG = (Taint)var1;
  }

  public Sinks() {
    this(ControlTaintTagStack.getInstance(), (TaintSentinel)null);
  }

  public static void sink(Object o) {
    sink$$PHOSPHORTAGGED((Object)MultiDTaintedArray.boxIfNecessary(o), ControlTaintTagStack.getInstance());
  }

  public TaintedBooleanWithObjTag equals$$PHOSPHORTAGGED(Object phosphorNativeWrapArg1, ControlTaintTagStack var2, TaintedBooleanWithObjTag phosphorReturnHolder) {
    Object var10001 = phosphorNativeWrapArg1;
    if (phosphorNativeWrapArg1 instanceof LazyArrayObjTags[] | phosphorNativeWrapArg1 instanceof LazyArrayObjTags) {
      var10001 = MultiDTaintedArrayWithObjTag.unboxRaw(phosphorNativeWrapArg1);
    }

    phosphorReturnHolder.val = this.equals(var10001);
    phosphorReturnHolder.taint = null;
    return phosphorReturnHolder;
  }

  public TaintedIntWithObjTag hashCode$$PHOSPHORTAGGED(ControlTaintTagStack var1, TaintedIntWithObjTag phosphorReturnHolder) {
    phosphorReturnHolder.val = this.hashCode();
    phosphorReturnHolder.taint = null;
    return phosphorReturnHolder;
  }

  public Class getClass$$PHOSPHORTAGGED(ControlTaintTagStack var1) {
    return this.getClass();
  }

  public String toString$$PHOSPHORTAGGED(ControlTaintTagStack var1) {
    return this.toString();
  }
}
