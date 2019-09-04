package edu.cmu.cs.mvelezce.analysis;

/**
 * Example to showcase Phosphor's light control tracking. Taints are propagated through
 * control-flow, but are not propagated control dependencies between methods.
 */
public class Diff {

  public static void main(String[] args) {
    int x = 2;

    System.out.println(x | 0);
//    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
//
//    int x = 0;
//
//    if(A) {
//      x = 10_000_000;
//    }
//    else {
//      x = 5_000_000;
//    }
//
//    while(x > 0) {
//      x--;
//    }
  }
}
