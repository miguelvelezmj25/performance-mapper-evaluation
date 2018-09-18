package edu.cmu.cs.mvelezce.objtag;

import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;

public class Simple {

  public static void main(String[] args) {
    boolean A = MultiTainter.taintedBoolean(true, "A");
    boolean B = MultiTainter.taintedBoolean(true, "B");

    int a = A ? 100 : 10;
    int b = B ? 100 : 10;
    int x = 0;

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        x++;
      }
    }
  }
}
