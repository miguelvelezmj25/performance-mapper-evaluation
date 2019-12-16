package edu.cmu.cs.mvelezce.analysis;

public class EarlyJoinExample {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);
    boolean D = Boolean.parseBoolean(args[3]);
    boolean E = Boolean.parseBoolean(args[4]);
    //    boolean f = F_5(Boolean.parseBoolean(args[5]);
    //    boolean g = G_6(Boolean.parseBoolean(args[6]);
    //    boolean h = H_7(Boolean.parseBoolean(args[7]);
    //    boolean j = I_8(Boolean.parseBoolean(args[8]);
    //    boolean x = J_9(Boolean.parseBoolean(args[9]);
    //    boolean y = K_10(Boolean.parseBoolean(args[10]);
    //    boolean z = L_11(Boolean.parseBoolean(args[11]);

    int i = 1;
    //    if (x) {
    //      i += 1;
    //    }
    //    if (y) {
    //      i += 1;
    //    }
    //    if (z) {
    //      i += 1;
    //    }
    if (A) {
      i += 1;
    }
    if (B) {
      i += 1;
    }
    i = 10; // early join
    if (C) {
      i += 1;
    }
    if (D) {
      i += 1;
    }
    if (E) {
      i += 1;
    }
    //    if (f) {
    //      i += 1;
    //    }
    //
    //    if (g) {
    //      i += 1;
    //    }
    //    if (h) {
    //      i += 1;
    //    }
    //    if (j) {
    //      i += 1;
    //    }

    i = 1000; // early join
    int sum = 0;
    for (int start = 1; start <= i; start++) {
      sum++;
    }
    if (sum > 15) {
      System.out.println("Error");
      return;
    }
    System.out.println(sum);
  }
}
