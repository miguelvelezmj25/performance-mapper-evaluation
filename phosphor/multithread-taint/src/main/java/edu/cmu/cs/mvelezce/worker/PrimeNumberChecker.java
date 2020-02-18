package edu.cmu.cs.mvelezce.worker;

public class PrimeNumberChecker implements Runnable {

  private final int maxNumberToCheck;

  public PrimeNumberChecker(boolean numberToCheck) {
    if (numberToCheck) {
      this.maxNumberToCheck = 300;
    } else {
      this.maxNumberToCheck = 800;
    }
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread() + " started");

    for (int numberToCheck = 1; numberToCheck <= this.maxNumberToCheck; numberToCheck++) {
      isPrime(numberToCheck);
    }

    System.out.println(Thread.currentThread() + " done");
  }

  private void isPrime(int numberToCheck) {
    for (int i = 2; i <= numberToCheck / 2; i++) {
      int remainder = numberToCheck % i;
      if (remainder == 0) {
        return;
      }
    }
  }
}
