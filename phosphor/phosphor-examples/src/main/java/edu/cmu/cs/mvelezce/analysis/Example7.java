package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Example7 {

  private static final int PERFECT_CUREVE = 4;
  private static final int PERFECT_STRAIGHT = 1;
  private static final int TIME_BONUS = 2;

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));

    int totalScore = 0;
    int penalty = 0;

    if (C) {
      penalty = 10;
    }

    int localTotalScore = PERFECT_CUREVE + PERFECT_STRAIGHT;

    if (A) {
      localTotalScore += TIME_BONUS;
    }

    if (C) {
      localTotalScore -= penalty;
    }

    if (C) {
      System.out.println(localTotalScore < 0);
    }

    if (B) {
      totalScore = localTotalScore;
    }

    if (C) {
      System.out.println(localTotalScore < 0);
    }
  }
}