package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class EarlyJoinExample {

  public static void main(String[] args) throws Exception {
    boolean a = Sources.A_0(Boolean.valueOf(args[0]));
    boolean b = Sources.B_1(Boolean.valueOf(args[1]));
    boolean c = Sources.C_2(Boolean.valueOf(args[2]));
    boolean d = Sources.D_3(Boolean.valueOf(args[3]));
    boolean e = Sources.E_4(Boolean.valueOf(args[4]));
//    boolean f = Sources.F_5(Boolean.valueOf(args[5]));
//    boolean g = Sources.G_6(Boolean.valueOf(args[6]));
//    boolean h = Sources.H_7(Boolean.valueOf(args[7]));
//    boolean j = Sources.I_8(Boolean.valueOf(args[8]));
//    boolean x = Sources.J_9(Boolean.valueOf(args[9]));
//    boolean y = Sources.K_10(Boolean.valueOf(args[10]));
//    boolean z = Sources.L_11(Boolean.valueOf(args[11]));

//    int i = 1;
//    if (x) {
//      i += 1;
//    }
//    if (y) {
//      i += 1;
//    }
//    if (z) {
//      i += 1;
//    }
//    if (a) {
//      i += 1;
//    }
//    if (b) {
//      i += 1;
//    }
//    //			i = 10;// early join
//    if (c) {
//      i += 1;
//    }
//    if (d) {
//      i += 1;
//    }
//    if (e) {
//      i += 1;
//    }
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
//
//    //			i = 1000;// early join
//    int sum = 0;
//    for (int start = 1; start <= i; start++) {
//      sum++;
//    }
//    if (sum > 15) {
//      throw new Exception();
//    }
//    System.out.println(sum);
  }
}
