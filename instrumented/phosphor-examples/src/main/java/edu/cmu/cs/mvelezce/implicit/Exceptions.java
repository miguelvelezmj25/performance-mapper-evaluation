package edu.cmu.cs.mvelezce.implicit;

import edu.cmu.cs.mvelezce.taints.Sources;
import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exceptions {

  private final int minAlpha;
  private final long timeout;

  public Exceptions(long timeout, int minAlpha) {
    this.timeout = timeout;
    this.minAlpha = minAlpha;
  }

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    Integer minAlpha;
    Integer timeout;

    if (A) {
      minAlpha = 1;
    } else {
      minAlpha = 50;
    }

    if (B) {
      timeout = 0;
    } else {
      timeout = 1_000_000;
    }

    Exceptions exceptions = new Exceptions(timeout, minAlpha);
    exceptions.counter(System.currentTimeMillis());

    //    exceptions(A, B);
    if (A || B) {
      System.out.println();
    }
  }

  private static void exceptions(boolean b, boolean e) {
    if (e) {
      //            throw new RuntimeException("FinallyBlock");
      System.out.println("error");
    } else {

      if (b) {
        System.out.println("hello");
      }

      if (b) {
        System.out.println("hello");
      }

      if (b) {
        System.out.println("hello");
      }

      if (b) {
        System.out.println("hello");
      }
    }
  }

  private void counter(long start) {
    final Map<String, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < 5; i++) {
      if (timeout > 0 && (System.currentTimeMillis() - start > timeout)) {
        throw new RuntimeException("Error");
      }

      if (5 > minAlpha) {
        map.put(null, 1);
      }
    }

    Taint taint = MultiTainter.getTaint(minAlpha);
    //    Sinks.sink(taint, "minAlpha", "minAlpha", 0);
    taint = MultiTainter.getTaint(timeout);
    //    Sinks.sink(taint, "timeout", "timeout", 0);
  }
}
