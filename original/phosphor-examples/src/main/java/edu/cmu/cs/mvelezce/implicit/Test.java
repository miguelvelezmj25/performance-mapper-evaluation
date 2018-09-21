package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Test {

  public static void main(String[] args) {
//    testExample1();
//    testExample2();
    testExample3();
  }

  public static void testExample1() {
    boolean A = Sources.A_0(true);
    String s1 = "example1";

    String s = null;
    int i = 100;

    if (A) { // if<cond>
      i = 1000;
      s = "example1";
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
  }

  public static void testExample2() {
    boolean A = Sources.A_0(false);
    String s1 = "example2";

    String s = null;
    int i = 100;

    if (A) { // {A}
      i = 1000;
      s = "example2";
    }

    if (s != null) {
      System.out.println(s);
    }

    if (s == s1) {
      System.out.println(s);
    }

    if (i < 500) {
      System.out.println(s);
    }
  }

  public static void testExample3() {
    boolean A = Sources.A_0(true);
    boolean B = Sources.B_1(true);

    boolean x = false;
    String s = "example3";
    long l = 0L;
    int i = 0;

    if (A) { // {A}
      x = true;
      if (B) { // {A,B}
        l = 1L;
      }
    }

    if (x) { // {A}
      i = 1;
    }

    if (l > 0) { // {A, B}
      s = "not example3";
    }

    if(s.equals("example3")) { // {A, B}
      System.out.println();
    }

    if(i == 0) { // {A}
      System.out.println();
    }
  }
}
