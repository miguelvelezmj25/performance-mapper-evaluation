//package edu.cmu.cs.mvelezce.inttag;
//
//public class Test {
//
//  public static void main(String[] args) {
//    testExample();
//  }
//
//  public static boolean source(boolean b) {
//    return b;
//  }
//
//  // sink method
//  public static void sink(Object o) {
//    System.out.println("Someone gave me a: " + o);
//  }
//
//  // flow from source to sink
//  public static void testExample() {
//    System.out.println("==> Expect exception");
//    boolean tainted = source(true);
//    sink(tainted);
//  }
//
////  public static void main(String[] args) {
////    testBranchNotTaken();
////  }
////
////  public static boolean HELP(boolean b) {
////    return b;
////  }
////
////  public static boolean VERSION(boolean b) {
////    return b;
////  }
////
////  // sink method
////  public static void sink(boolean b) {
////    System.out.println("Someone gave me a: " + b);
////  }
////
////  public static void testBranchNotTaken() {
////    System.out.println("==> Expect exception");
////    boolean help = HELP(true);
////    boolean version = VERSION(true);
////    boolean x = false;
////
////    if (help) {
////      if (version) {
////        x = true;
////      }
////    }
////
////    sink(x);
////  }
//}
