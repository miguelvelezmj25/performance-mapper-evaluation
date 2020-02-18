package edu.cmu.cs.mvelezce.taints;

import edu.columbia.cs.psl.phosphor.control.ControlFlowStack;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {

    public Taint<Integer> PHOSPHOR_TAG;

    public static TaintedBooleanWithObjTag A_0$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(0);
        return ret;
    }

    public static TaintedBooleanWithObjTag B_1$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(1);
        return ret;
    }

    public static TaintedBooleanWithObjTag C_2$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(2);
        return ret;
    }

    public static TaintedBooleanWithObjTag D_3$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(3);
        return ret;
    }

    public static TaintedBooleanWithObjTag E_4$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(4);
        return ret;
    }

    public static TaintedBooleanWithObjTag F_5$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(5);
        return ret;
    }

    public static TaintedBooleanWithObjTag G_6$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(6);
        return ret;
    }

    public static boolean A_0(boolean option) {
        return option;
    }

    public static boolean B_1(boolean option) {
        return option;
    }

    public static boolean C_2(boolean option) {
        return option;
    }

    public static boolean D_3(boolean option) {
        return option;
    }

    public static boolean E_4(boolean option) {
        return option;
    }

    public static boolean F_5(boolean option) {
        return option;
    }

    public static boolean G_6(boolean option) {
        return option;
    }

    //  public static boolean F_5(boolean option) {
    //    return option;
    //  }
    //
    //  public static boolean G_6(boolean option) {
    //    return option;
    //  }
    //
    //  public static boolean H_7(boolean option) {
    //    return option;
    //  }
    //
    //  public static boolean I_8(boolean option) {
    //    return option;
    //  }
    //
    //  public static boolean J_9(boolean option) {
    //    return option;
    //  }
    //
    //  public static boolean K_10(boolean option) {
    //    return option;
    //  }
    //
    //  public static boolean L_11(boolean option) {
    //    return option;
    //  }

    @Override
    public Object getPHOSPHOR_TAG() {
        return this.PHOSPHOR_TAG;
    }

    @Override
    public void setPHOSPHOR_TAG(Object var1) {
        this.PHOSPHOR_TAG = (Taint) var1;
    }
}
