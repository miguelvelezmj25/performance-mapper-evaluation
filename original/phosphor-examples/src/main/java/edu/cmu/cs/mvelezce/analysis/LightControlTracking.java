package edu.cmu.cs.mvelezce.analysis;

/**
 * Example to showcase Phosphor's light control tracking. Taints are propagated through
 * control-flow, but are not propagated control dependencies between methods.
 */
public class LightControlTracking {

  public static void main(String[] args) {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);

    if (A) {
      System.out.println();
    }

    if (B) {
      System.out.println();
    }
  }
}
