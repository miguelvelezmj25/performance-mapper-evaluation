package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.worker.PrimeNumberChecker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Multithread {
  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    boolean B = Boolean.parseBoolean(args[1]);
    boolean C = Boolean.parseBoolean(args[2]);

    //    Thread.sleep(2000);

    singleCall(A, B, C);
    multipleCalss();
  }

  private static void singleCall(boolean a, boolean b, boolean c) {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    executorService.submit(new PrimeNumberChecker(a));
    executorService.submit(new PrimeNumberChecker(b));
    executorService.submit(new PrimeNumberChecker(c));
    executorService.shutdown();

    while (!executorService.isTerminated()) {
      try {
        executorService.awaitTermination(1, TimeUnit.SECONDS);
      } catch (InterruptedException e) {
        //
      }
    }
  }

  private static void multipleCalss() {
    //    ExecutorService executorService = Executors.newFixedThreadPool(1);
    //    executorService.execute(new PrimeNumberChecker(200_000));
    //    executorService.shutdown();
    //
    //    while (!executorService.isTerminated()) {
    //      try {
    //        executorService.awaitTermination(1, TimeUnit.SECONDS);
    //      } catch (InterruptedException e) {
    //        //
    //      }
    //    }
    //
    //    executorService = Executors.newFixedThreadPool(2);
    //    executorService.execute(new PrimeNumberChecker(400_000));
    //    executorService.execute(new PrimeNumberChecker(700_000));
    //    executorService.shutdown();
    //
    //    while (!executorService.isTerminated()) {
    //      try {
    //        executorService.awaitTermination(1, TimeUnit.SECONDS);
    //      } catch (InterruptedException e) {
    //        //
    //      }
    //    }
  }
}
