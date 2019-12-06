package edu.cmu.cs.mvelezce.analysis;

public class TryReturnCatch {

  public static void main(String[] args) {

    try {
      Thread.sleep(1000);
      return;
    } catch (InterruptedException ie) {
      System.out.println("There was an interrupt execption");
    }

    System.out.println("We did not execute the first statement");

    if (args.length > 0) {
      System.out.println("Hello");
    }
  }
}
