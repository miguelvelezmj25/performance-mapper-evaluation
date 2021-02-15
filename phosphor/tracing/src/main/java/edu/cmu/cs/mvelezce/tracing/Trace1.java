package edu.cmu.cs.mvelezce.tracing;

public class Trace1 {

  public static void main(String[] args) {
    boolean A = getOption(args);
    int x = 0;

    if (A) {
      x = 2500;
    } else {
      x = 5000;
    }

    if (x > 2500) {
      print(x);
    }
  }

  private static boolean getOption(String[] args) {
    return args.length != 5;
  }

  private static void print(int x) {}
}
