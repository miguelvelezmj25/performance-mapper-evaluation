package edu.cmu.cs.mvelezce.analysis;

public class BerkeleyDbTraceLoggingBug {

  public static void main(String[] args) {
    foo(2);
  }

  private static long[] foo(int size) {
    long[] a = new long[size];
    int next = 0;

    segments:
    for (int j = 0; j < size; j++) {
      for (int i = 0; i < size; i += 1) {
        if (next >= a.length) {
          break segments;
        }
        next += 1;
      }
    }

    return a;
  }
}
