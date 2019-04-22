package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

/**
 * Example to showcase Phosphor's light control tracking. Taints are propagated through control-flow,
 * but are not propagated control dependencies between methods.
 */
public class LightControlTracking {

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));

    if (A) {
      System.out.println();
    }

    if (B) {
      System.out.println();
    }
  }
}
