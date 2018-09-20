package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Test {

  public static void main(String[] args) {
    testExample1();
    //    testExample2();
  }

  public static void testExample1() {
    boolean A = Sources.A_0(true);
    String s1 = "Miguel";

    String s = null;
    int i = 100;

    if (A) { // if<cond>
      i = 1000;
      s = "Miguel";
    }

    if (s != null) { // ifnonnull || ifnull
      System.out.println(s);
    }

    if (s == s1) { // if_acmp<cond>
      System.out.println(s);
    }

    if (i < 500) { // if_icmp<cond>
      System.out.println(s);
    }
    //      Sinks.sink(A);
  }
  //  public static void testExample2() {
  //    boolean A = Sources.A_0(true);
  //    boolean B = Sources.B_1(true);
  //
  //    boolean x = false;
  //    String s = "Miguel";
  //    long l = 0L;
  //    int i = 0;
  //
  //    if (A) {
  //      x = true;
  //      if (B) {
  //        l = 1L;
  //      }
  //    }
  //
  //    if(x) {
  //      i = 1;
  //    }
  //
  //    if (l > 0) {
  //      s = "Laura";
  //    }
  //
  //    Sinks.sink(x);
  //    Sinks.sink(s);
  //    Sinks.sink(l);
  //    Sinks.sink(i);
  //  }
}
