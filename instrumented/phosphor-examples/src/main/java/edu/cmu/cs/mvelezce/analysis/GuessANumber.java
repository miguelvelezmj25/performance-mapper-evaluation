package edu.cmu.cs.mvelezce.analysis;

public class GuessANumber {

  public static void main(String[] args) {
    boolean A = Boolean.valueOf(args[0]);
    boolean B = Boolean.valueOf(args[1]);
    boolean C = Boolean.valueOf(args[2]);

    int secret;
    int tries;
    Integer num;

    if (A) {
      secret = 5;
    } else {
      secret = 10;
    }

    if (B) {
      tries = 1;
    } else {
      tries = 2;
    }

    if (C) {
      num = 5;
    } else {
      num = 0;
    }

    int i = 0;
    if (num != null) {
      i = num.intValue();
    }

    if (i >= 1 && i <= 10) {
      if (tries > 0 && i == secret) {
        tries = 0;
        System.out.println("You win!");
      } else {
        tries--;
        if (tries > 0) {
          System.out.println("Try again");
        } else {
          System.out.println("Game over!");
        }
      }
    } else {
      System.out.println("Out of range");
    }
  }
}
