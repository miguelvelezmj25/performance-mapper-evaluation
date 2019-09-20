package edu.cmu.cs.mvelezce.implicit;

public class ControlStack {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);

    boolean a = get(A);
    boolean b = get(B);

    equalTaintAndStack(a, b);
  }

  private static boolean get(boolean option) {
    return option;
  }

  private static void equalTaintAndStack(boolean a, boolean b) {
    boolean x;

    if (a) { // [a.taints = A, stack.taints = {}]
      x = b;

      if (x) { // [x.taints = A, stack.taints = A]
        System.out.println();
      }
    }
  }
}
