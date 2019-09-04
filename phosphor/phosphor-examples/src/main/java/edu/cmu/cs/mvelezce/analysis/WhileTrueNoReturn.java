package edu.cmu.cs.mvelezce.analysis;

public class WhileTrueNoReturn {

  public static void main(String[] args) {
  }

  int some(int x) {
    while (true) {
      this.notify();
    }
  }
}
