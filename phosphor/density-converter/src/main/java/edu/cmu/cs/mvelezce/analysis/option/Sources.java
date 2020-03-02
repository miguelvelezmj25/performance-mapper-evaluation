package edu.cmu.cs.mvelezce.analysis.option;

import edu.columbia.cs.psl.phosphor.control.ControlFlowStack;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.runtime.TaintInstrumented;
import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedFloatWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedReferenceWithObjTag;
import edu.columbia.cs.psl.phosphor.struct.TaintedWithObjTag;

@TaintInstrumented
public class Sources implements TaintedWithObjTag {
    // public class Sources {
    public Taint PHOSPHOR_TAG;

    public static float SCALE_0(float value) {
        return value;
    }

    public static boolean SCALE_IS_HEIGHT_DP_1(boolean option) {
        return option;
    }

    public static float COMPRESSION_QUALITY_2(float value) {
        return value;
    }

    public static String OUT_COMPRESSION_3(String outCompression) {
        return outCompression;
    }

    public static String PLATFORM_4(String platform) {
        return platform;
    }

    public static String UPSCALING_ALGO_5(String upScalingAlgo) {
        return upScalingAlgo;
    }

    public static String DOWNSCALING_ALGO_6(String downScalingAlgo) {
        return downScalingAlgo;
    }

    public static String ROUNDING_MODE_7(String roundingMode) {
        return roundingMode;
    }

    public static boolean SKIP_UPSCALING_8(boolean option) {
        return option;
    }

    public static boolean SKIP_EXISTING_9(boolean option) {
        return option;
    }

    public static boolean ANDROID_INCLUDE_LDPI_TVDPI_10(boolean option) {
        return option;
    }

    public static boolean VERBOSE_11(boolean option) {
        return option;
    }

    public static boolean ANDROID_MIPMAP_INSTEAD_OF_DRAWABLE_12(boolean option) {
        return option;
    }

    public static boolean ANTI_ALIASING_13(boolean option) {
        return option;
    }

    public static boolean POST_PROCESSOR_PNG_CRUSH_14(boolean option) {
        return option;
    }

    public static boolean POST_PROCESSOR_WEBP_15(boolean option) {
        return option;
    }

    public static boolean DRY_RUN_16(boolean option) {
        return option;
    }

    public static boolean POST_PROCESSOR_MOZ_JPEG_17(boolean option) {
        return option;
    }

    public static boolean KEEP_ORIGINAL_POST_PROCESSED_FILES_18(boolean option) {
        return option;
    }

    public static boolean IOS_CREATE_IMAGESET_FOLDERS_19(boolean option) {
        return option;
    }

    public static boolean CLEAN_20(boolean option) {
        return option;
    }

    public static boolean HALT_ON_ERROR_21(boolean option) {
        return option;
    }

    public static TaintedFloatWithObjTag SCALE_0$$PHOSPHORTAGGED(
            float value,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedFloatWithObjTag ret) {
        ret.val = value;
        ret.taint = Taint.withLabel(0);
        return ret;
    }

    public static TaintedBooleanWithObjTag SCALE_IS_HEIGHT_DP_1$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(1);
        return ret;
    }

    public static TaintedFloatWithObjTag COMPRESSION_QUALITY_2$$PHOSPHORTAGGED(
            float value,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedFloatWithObjTag ret) {
        ret.val = value;
        ret.taint = Taint.withLabel(2);
        return ret;
    }

    public static TaintedReferenceWithObjTag OUT_COMPRESSION_3$$PHOSPHORTAGGED(
            String outCompression,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedReferenceWithObjTag ret) {
        ret.val = outCompression;
        ret.taint = Taint.withLabel(3);
        return ret;
    }

    public static TaintedReferenceWithObjTag PLATFORM_4$$PHOSPHORTAGGED(
            String platform,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedReferenceWithObjTag ret) {
        ret.val = platform;
        ret.taint = Taint.withLabel(4);
        return ret;
    }

    public static TaintedReferenceWithObjTag UPSCALING_ALGO_5$$PHOSPHORTAGGED(
            String upscalingAlgo,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedReferenceWithObjTag ret) {
        ret.val = upscalingAlgo;
        ret.taint = Taint.withLabel(5);
        return ret;
    }

    public static TaintedReferenceWithObjTag DOWNSCALING_ALGO_6$$PHOSPHORTAGGED(
            String downScalingAlgo, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedReferenceWithObjTag ret) {
        ret.val = downScalingAlgo;
        ret.taint = Taint.withLabel(6);
        return ret;
    }

    public static TaintedReferenceWithObjTag ROUNDING_MODE_7$$PHOSPHORTAGGED(
            String roundingMode,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedReferenceWithObjTag ret) {
        ret.val = roundingMode;
        ret.taint = Taint.withLabel(7);
        return ret;
    }

    public static TaintedBooleanWithObjTag SKIP_UPSCALING_8$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(8);
        return ret;
    }

    public static TaintedBooleanWithObjTag SKIP_EXISTING_9$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(9);
        return ret;
    }

    public static TaintedBooleanWithObjTag ANDROID_INCLUDE_LDPI_TVDPI_10$$PHOSPHORTAGGED(
            boolean option, Taint<Integer> originalTag, ControlFlowStack ctrl, TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(10);
        return ret;
    }

    public static TaintedBooleanWithObjTag VERBOSE_11$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(11);
        return ret;
    }

    public static TaintedBooleanWithObjTag ANDROID_MIPMAP_INSTEAD_OF_DRAWABLE_12$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(12);
        return ret;
    }

    public static TaintedBooleanWithObjTag ANTI_ALIASING_13$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(13);
        return ret;
    }

    public static TaintedBooleanWithObjTag POST_PROCESSOR_PNG_CRUSH_14$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        return ret;
    }

    public static TaintedBooleanWithObjTag POST_PROCESSOR_WEBP_15$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        return ret;
    }

    public static TaintedBooleanWithObjTag DRY_RUN_16$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(16);
        return ret;
    }

    public static TaintedBooleanWithObjTag POST_PROCESSOR_MOZ_JPEG_17$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        return ret;
    }

    public static TaintedBooleanWithObjTag KEEP_ORIGINAL_POST_PROCESSED_FILES_18$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(18);
        return ret;
    }

    public static TaintedBooleanWithObjTag IOS_CREATE_IMAGESET_FOLDERS_19$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(19);
        return ret;
    }

    public static TaintedBooleanWithObjTag CLEAN_20$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(20);
        return ret;
    }

    public static TaintedBooleanWithObjTag HALT_ON_ERROR_21$$PHOSPHORTAGGED(
            boolean option,
            Taint<Integer> originalTag,
            ControlFlowStack ctrl,
            TaintedBooleanWithObjTag ret) {
        ret.val = option;
        ret.taint = Taint.withLabel(21);
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
