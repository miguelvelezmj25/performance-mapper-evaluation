// package edu.cmu.cs.mvelezce.debug;
//
// import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;
// import edu.columbia.cs.psl.phosphor.runtime.Taint;
// import edu.columbia.cs.psl.phosphor.struct.ControlTaintTagStack;
// import edu.columbia.cs.psl.phosphor.struct.EnqueuedTaint;
// import edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag;
//
// public class Debug {
//
//  //  public static void main(String[] args) throws InterruptedException {
//  //    main(args, ControlTaintTagStack.getInstance());
//  //  }
//  //
//  //  public static void sleep$$PHOSPHORTAGGED(Taint phosphorNativeWrapArg0, long
//  // phosphorNativeWrapArg1, ControlTaintTagStack var3) throws InterruptedException {
//  //    System.out.println(phosphorNativeWrapArg1);
//  //  }
//  //
//  //
////  private static void main(String[] args, ControlTaintTagStack phosphorJumpControlTag)
////      throws InterruptedException {
////    EnqueuedTaint phosphorJumpControlTag0 = null;
////
////    try {
////      TaintedBooleanWithObjTag var10000 = new TaintedBooleanWithObjTag();
////      Taint.combineTagsOnObject(var10000, phosphorJumpControlTag);
////      TaintedBooleanWithObjTag phosphorReturnPreAlloc0 = var10000;
////      //      System.out.println$$PHOSPHORTAGGED("Testing
////      // simpleConditional_forTrueTaintInControlFlow", phosphorJumpControlTag);
////      Taint.combineTagsOnObject("A", phosphorJumpControlTag);
////      String optionA = "A";
////      var10000 =
////          MultiTainter.taintedBoolean$$PHOSPHORTAGGED(
////              phosphorJumpControlTag.copyTag(), true, optionA, phosphorReturnPreAlloc0);
////      TaintedBooleanWithObjTag var10001 = var10000;
////      Taint var8 = var10000.taint;
////      boolean var10002 = var10001.val;
////      Taint var10 = var8;
////      boolean var9 = var10002;
////      Taint var11 = Taint.combineTags(var10, phosphorJumpControlTag);
////      boolean A = var9;
////      Taint phosphorShadowLV2 = Taint.copyTaint(var11);
////      phosphorJumpControlTag0 =
////          phosphorJumpControlTag.push(phosphorShadowLV2, phosphorJumpControlTag0);
////      if (A) {
////        System.out.println();
////      }
////
////      phosphorJumpControlTag.pop(phosphorJumpControlTag0);
////    } catch (Throwable var7) {
////      phosphorJumpControlTag.pop(phosphorJumpControlTag0);
////      throw var7;
////    }
////    }
//
////
//////    EnqueuedTaint phosphorJumpControlTag0 = null;
//////
//////    try {
//////      TaintedBooleanWithObjTag var10000 = new TaintedBooleanWithObjTag();
//////      Taint.combineTagsOnObject(var10000, phosphorJumpControlTag);
//////      TaintedBooleanWithObjTag phosphorReturnPreAlloc0 = var10000;
//////      var10000 = MultiTainter.taintedBoolean$$PHOSPHORTAGGED(phosphorJumpControlTag.copyTag(),
// true, "A", phosphorReturnPreAlloc0);
//////      TaintedBooleanWithObjTag var10001 = var10000;
//////      Taint var14 = var10000.taint;
//////      boolean var10002 = var10001.val;
//////      Taint var16 = var14;
//////      boolean var15 = var10002;
//////      Taint var17 = Taint.combineTags(var16, phosphorJumpControlTag);
//////      boolean A = var15;
//////      Taint phosphorShadowLV5 = Taint.copyTaint(var17);
//////      var17 = Taint.combineTags(phosphorJumpControlTag.copyTag(), phosphorJumpControlTag);
//////      byte x = 0;
//////      Taint phosphorShadowLV6 = Taint.copyTaint(var17);
//////      var17 = Taint.combineTags(phosphorJumpControlTag.copyTag(), phosphorJumpControlTag);
//////      byte y = 0;
//////      Taint phosphorShadowLV7 = Taint.copyTaint(var17);
//////      var17 = Taint.combineTags(phosphorJumpControlTag.copyTag(), phosphorJumpControlTag);
//////      byte w = 0;
//////      Taint phosphorShadowLV8 = Taint.copyTaint(var17);
//////      phosphorJumpControlTag0 = phosphorJumpControlTag.push(phosphorShadowLV5,
// phosphorJumpControlTag0);
//////      if (A) {
//////        var17 = Taint.combineTags(phosphorJumpControlTag.copyTag(), phosphorJumpControlTag);
//////        x = 0;
//////        phosphorShadowLV6 = Taint.copyTaint(var17);
//////        var17 = Taint.combineTags(phosphorJumpControlTag.copyTag(), phosphorJumpControlTag);
//////        y = 0;
//////        phosphorShadowLV7 = Taint.copyTaint(var17);
//////        var17 = Taint.combineTags(phosphorJumpControlTag.copyTag(), phosphorJumpControlTag);
//////        w = 0;
//////        phosphorShadowLV8 = Taint.copyTaint(var17);
//////      }
//////
//////      phosphorJumpControlTag.pop(phosphorJumpControlTag0);
//////      MultiTainter.getTaint$$PHOSPHORTAGGED(phosphorShadowLV6, x);
//////      MultiTainter.getTaint$$PHOSPHORTAGGED(phosphorShadowLV7, y);
//////      MultiTainter.getTaint$$PHOSPHORTAGGED(phosphorShadowLV8, w);
//////    } catch (Throwable var13) {
//////      phosphorJumpControlTag.pop(phosphorJumpControlTag0);
//////      throw var13;
//////    }
////
//////    EnqueuedTaint stack0 = null;
//////
//////    try {
//////      TaintedBooleanWithObjTag var10000 = new TaintedBooleanWithObjTag();
//////      Taint.combineTagsOnObject(var10000, stack);
//////      TaintedBooleanWithObjTag phosphorReturnPreAlloc0 = var10000;
//////      var10000 =
//////          MultiTainter.taintedBoolean$$PHOSPHORTAGGED(
//////              stack.copyTag(), true, "A", phosphorReturnPreAlloc0);
//////      TaintedBooleanWithObjTag var10001 = var10000;
//////      Taint var10 = var10000.taint;
//////      boolean var10002 = var10001.val;
//////      Taint var12 = var10;
//////      boolean var11 = var10002;
//////      Taint var13 = Taint.combineTags(var12, stack);
//////      boolean A = var11;
//////      Taint phosphorShadowLV3 = Taint.copyTaint(var13);
//////      var13 = Taint.combineTags(stack.copyTag(), stack);
//////      boolean x = false;
//////      Taint phosphorShadowLV4 = Taint.copyTaint(var13);
//////      stack0 = stack.push(phosphorShadowLV3, stack0);
//////      phosphorShadowLV4 = Taint.combineTags(phosphorShadowLV4, stack);
//////      if (A) {
//////        var13 = Taint.combineTags(stack.copyTag(), stack);
//////        x = true;
//////        phosphorShadowLV4 = Taint.copyTaint(var13);
//////      }
//////
//////      stack.pop(stack0);
//////      MultiTainter.getTaint$$PHOSPHORTAGGED(phosphorShadowLV4, x);
//////    } catch (Throwable var9) {
//////      stack.pop(stack0);
//////      throw var9;
//////    }
////  }
// }
