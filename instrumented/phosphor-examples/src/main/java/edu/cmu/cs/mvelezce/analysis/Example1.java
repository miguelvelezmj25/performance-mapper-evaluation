package edu.cmu.cs.mvelezce.analysis;

public class Example1 {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    boolean x = false;

    if (!A) {
      //      TimerHelper.sleep("1", 1);;
      x = true;
    }

    if (x) {
      //      TimerHelper.sleep("2", 2);;
      System.out.println(200);

      if (B) {
        //        TimerHelper.sleep("3", 3);;
        System.out.println(300);
      }
    }
  }
}
