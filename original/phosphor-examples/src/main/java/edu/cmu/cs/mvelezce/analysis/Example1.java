package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Example1 {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    boolean x = false;

    if (!A) {
      TimerHelper.sleep("1", 1);
      x = true;
    }

    if (x) {
      TimerHelper.sleep("2", 2);
      Thread.sleep(200);

      if (B) {
        TimerHelper.sleep("3", 3);
        Thread.sleep(300);
      }
    }

    TimerHelper.printExecutionTime();
  }
}
