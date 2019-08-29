package edu.cmu.cs.mvelezce.analysis;

public class WhileTrue2 {

  public static void main(String[] args) {

  }

  int some(int x) {
    while (true) {
      if (x == 0) {
        return 0;
      }

      x--;
    }
  }
}
