package edu.cmu.cs.mvelezce.analysis;

/**
 * There is an issue with the index of the IPD by one. It might be due to, first, exiting a
 * decision.
 */
public class BerkeleyDBIPDIndexBug {

  public static void main(String[] args) {
    boolean x = Boolean.valueOf(args[0]);
    String y = args[1];
    String z = args[2];

    if (x && y != null) {
      return;
    }

    if (z != null) {
      System.out.println();
    }
  }
}
