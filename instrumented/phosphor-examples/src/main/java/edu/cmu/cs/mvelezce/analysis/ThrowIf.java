package edu.cmu.cs.mvelezce.analysis;

public class ThrowIf {

  public static void main(String[] args) {
  }

  public void some(String[] args) {
    if (args.length == 0) {
      throw new RuntimeException();
    }

    System.out.println();
  }

}
