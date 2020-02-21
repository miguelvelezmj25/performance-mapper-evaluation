package edu.cmu.cs.mvelezce.worker;

public class PrimeNumberChecker implements Runnable {

  private final int maxNumberToCheck;

  public PrimeNumberChecker(boolean numberToCheck) {
    if (numberToCheck) {
      this.maxNumberToCheck = 800_000;
    } else {
      this.maxNumberToCheck = 300_000;
    }
  }

  @Override
  public void run() {
    long start = System.nanoTime();
    System.out.println(Thread.currentThread().getName() + " started");

    for (int numberToCheck = 1; numberToCheck <= this.maxNumberToCheck; numberToCheck++) {
      isPrime(numberToCheck);
    }

    System.out.println(Thread.currentThread().getName() + " done");
    long end = System.nanoTime();
    System.out.println((end - start) / 1E9);
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
