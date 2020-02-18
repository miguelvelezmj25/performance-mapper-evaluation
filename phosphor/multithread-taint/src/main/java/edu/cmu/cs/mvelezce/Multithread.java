package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;
import edu.cmu.cs.mvelezce.taints.Sources;
import edu.cmu.cs.mvelezce.worker.PrimeNumberChecker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Multithread {
  public static void main(String[] args) {
    SinkManager.preProcessSinks(Multithread.class.getSimpleName());

    boolean A = Sources.A_0(Boolean.parseBoolean(args[0]));
    boolean B = Sources.B_1(Boolean.parseBoolean(args[1]));
    boolean C = Sources.C_2(Boolean.parseBoolean(args[2]));

    multipleCalss();
    singleCall(A, B, C);

    SinkManager.postProcessSinks();
  }

  private static void singleCall(boolean a, boolean b, boolean c) {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    executorService.execute(new PrimeNumberChecker(a));
    executorService.execute(new PrimeNumberChecker(b));
    executorService.execute(new PrimeNumberChecker(c));
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
