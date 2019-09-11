package edu.cmu.cs.mvelezce.analysis.option;

import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;

public class Testing {

  private int[] tags;

  public static void main(String[] args) {
    String s1 = "Miguel is going to graduate soon";
    String s2 = "Miguel is going to graduate soo";

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

    System.out.println();
//    Testing x = new Testing();
//    System.out.println(x);
  }

  public void testLoops() throws Exception {
    boolean A = MultiTainter.taintedBoolean(true, "A");

    boolean x = false;
    int i = MultiTainter.taintedInt(5, "I");

    boolean z = false;
    boolean y = false;
    int j = MultiTainter.taintedInt(10, "J");
    while (i != 0) {
      i--;
      y = true;
      while (j != 0) {
        x = true;
        j--;
      }
      j++;
    }

    x = true;
    //	    assertTaintHasOnlyLabel(MultiTainter.getTaint(i), "I");
    //	    assertTaintHasOnlyLabel(MultiTainter.getTaint(y), "I");
    //	    assertNull(MultiTainter.getTaint(x));
  }
}
