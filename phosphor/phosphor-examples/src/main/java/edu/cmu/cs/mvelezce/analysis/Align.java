package edu.cmu.cs.mvelezce.analysis;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Align {

  private static final Map<String, Integer> IDSTOCOUNT = new HashMap<>();
  private static final Deque<String> STACK = new ArrayDeque<>();

  public static void main(String[] args) {
    int i = 0;
    int t = 0;
    int x = 0;
    int z = 0;

    boolean P = true;
    boolean C1 = false;
    boolean C2 = false;
    boolean C3 = true;

    start("1");
    if (P) {
      t = 1;
      x = 1;
    }
    end("1");

    while (method(i, t)) {

      start("333");
      if (C1) {
        z++;
      }
      end("333");

      i++;
    }
    end("22");

    start("4444");
    if (C3) {

      start("55555");
      if (!C2) {
        z = x;
      }
      end("55555");
    }
    end("4444");
  }

  private static boolean method(int i, int t) {
    start("22");
    return i < t;
  }

  private static void start(String id) {
    int count = 0;

    if (IDSTOCOUNT.containsKey(id)) {
      count = IDSTOCOUNT.get(id);
      count++;
    }

    IDSTOCOUNT.put(id, count);
    STACK.addFirst(id);

    System.out.println("D" + id + "_S_" + count);
  }

  private static void end(String id) {
    int count = IDSTOCOUNT.get(id);

    while (!STACK.isEmpty() && STACK.peekFirst().equals(id)) {
      System.out.println("D" + id + "_E_" + count);

      count--;
      STACK.removeFirst();
    }
  }
}
