package edu.cmu.cs.mvelezce;

import edu.columbia.cs.psl.phosphor.runtime.MultiTainter;
import edu.columbia.cs.psl.phosphor.runtime.Taint;
import java.util.ArrayList;
import java.util.List;

public class Run {
  // OPTIONS
  public static boolean MINALPHA;
  public static boolean TIMEOUT;

  public static void main(String[] args) {
    MINALPHA = MultiTainter.taintedBoolean(true, "MINALPHA");
    TIMEOUT = MultiTainter.taintedBoolean(true, "TIMEOUT");

    Integer minAlpha;
    Integer timeout;

    if (MINALPHA) {
      minAlpha = 1;
    } else {
      minAlpha = 50;
    }

    if (TIMEOUT) {
      timeout = 0;
    } else {
      timeout = 1_000_000;
    }

    foo(timeout, minAlpha);

    Taint taint = MultiTainter.getTaint(MINALPHA);
    System.out.println("MINALPHA: " + taint);

    taint = MultiTainter.getTaint(TIMEOUT);
    System.out.println("TIMEOUT: " + taint);

    taint = MultiTainter.getTaint(minAlpha);
    System.out.println("minalpha: " + taint);

    taint = MultiTainter.getTaint(timeout);
    System.out.println("timeout: " + taint);
  }

  private static void foo(long timeout, int minAlpha) {
    List<Integer> list = new ArrayList<>();

    if (timeout > -1 && 5 > minAlpha) {
      list.add(1);
    }
  }
}
