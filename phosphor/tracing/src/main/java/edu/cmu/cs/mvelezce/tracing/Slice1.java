package edu.cmu.cs.mvelezce.tracing;

public class Slice1 {

  public static void main(String[] args) {
    int A = Integer.parseInt(args[0]); // Source

    int a = A;
    int i = 0;
    if (a > 10) {
      i = a * 2;
    } else {
      i = a / 2;
    }

    print(i);
  }

  private static void print(int i) {}
}
