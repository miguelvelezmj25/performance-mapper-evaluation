package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.taints.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Test {

  public static void main(String[] args) {
    testExample2();
  }

  public static void testExample2() {
    boolean A = Sources.A_0(true);
    boolean B = Sources.B_1(true);

    boolean x = false;
    String s = "Miguel";
    long l = 0L;
    Integer i = 0;

    if (A) {
      s = "Laura";
      x = true;
      if (B) {
        l = 1L;
        i = 1;
      }
    }

    Sinks.sink(x);
    Sinks.sink(s);
    Sinks.sink(s);
    Sinks.sink(l);
    Sinks.sink(i);
  }
}
