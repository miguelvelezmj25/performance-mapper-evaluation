package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Example7 {

  private static final int PERFECT_CUREVE = 4;
  private static final int PERFECT_STRAIGHT = 1;
  private static final int TIME_BONUS = 2;

  public static void main(String[] args) {
    boolean green = Sources.A_0(Boolean.valueOf(args[0]));
    boolean yellow = Sources.B_1(Boolean.valueOf(args[1]));
    boolean blue = Sources.C_2(Boolean.valueOf(args[2]));

    int totalScore = 0;
    int penalty = 0;

    if (blue) {
      penalty = 10;
    }

    int localTotalScore = PERFECT_CUREVE + PERFECT_STRAIGHT;

    if (green) {
      localTotalScore += TIME_BONUS;
    }

    if (blue) {
      localTotalScore -= penalty;
    }

    if (blue) {
      System.out.println(localTotalScore < 0);
    }

    if (yellow) {
      totalScore = localTotalScore;
    }

    if (blue) {
      System.out.println(localTotalScore < 0);
    }
  }
}
