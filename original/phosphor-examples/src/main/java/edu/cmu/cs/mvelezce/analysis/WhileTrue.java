package edu.cmu.cs.mvelezce.analysis;

public class WhileTrue {

  public static void main(String[] args) {
    int x = Integer.valueOf(args[0]);

    while (true) {
      try {
        System.out.println("miguel");
      }
      catch (Exception e) {
        if (x < 0) {
          break;
        }
      }
    }
  }
}
