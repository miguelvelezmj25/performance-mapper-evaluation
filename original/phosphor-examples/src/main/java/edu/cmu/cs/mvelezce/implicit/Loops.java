//package edu.cmu.cs.mvelezce.implicit;
//
//import edu.cmu.cs.mvelezce.cc.Sinks;
//import edu.cmu.cs.mvelezce.taints.Sources;
//
//public class Loops {
//
//  public static void main(String[] args) {
//    counterLoop();
//  }
//
//  private static void sink(boolean a) { }
//
//  private static void counterLoop() {
//    boolean A = Sources.A_0(true);
//
//    boolean x = false;
//    int i = 2;
//
////    sink(A);
//    if(A) {
//      i = 4;
//    }
//
//    while(i != 0) {
//      i--;
//    }
//
////    sink(x);
//    if(x) {
//      System.out.println();
//    }
//
//    Sinks.postProcessSinks();
//  }
//
//}
