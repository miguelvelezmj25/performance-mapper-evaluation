package edu.cmu.cs.mvelezce.analysis;

/**
 * Method that does not have a return instruction and throws an exception at the end of the method.
 */
public class ThrowEnd {

  public static void main(String[] args) {

  }

  public void some(String[] args) {
    if (args.length == 0) {
      System.out.println();
    }

    throw new RuntimeException();
  }
}
