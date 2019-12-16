package edu.cmu.cs.mvelezce.analysis;

public class TryCatchFinally {

  /**
   * Program to showcase finally blocks, in which they are always executed even if there are no
   * issues. Look at the bytecode to see how the target of a jump instruction only has 1
   * predecessor.
   */
  public static void main(String[] args) {
    try {
      System.out.println("miguel");
    } catch (Exception e) {
      System.out.println("Exception");
      throw e;
    } finally {
      System.out.println("Finally");
    }
  }
}
