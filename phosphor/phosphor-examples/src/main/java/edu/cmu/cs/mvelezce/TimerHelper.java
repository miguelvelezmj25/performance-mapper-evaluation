package edu.cmu.cs.mvelezce;

import java.util.HashMap;
import java.util.Map;

public class TimerHelper {

  private static final Map<String, Integer> REGIONS_TO_TIME = new HashMap<>();

  static void sleep(String region, int time) {
    REGIONS_TO_TIME.put(region, time);
  }

  static void printExecutionTime() {
    int time = 0;

    for (Map.Entry<String, Integer> entry : REGIONS_TO_TIME.entrySet()) {
      int regionTime = entry.getValue();
      time += regionTime;
      System.out.println(entry.getKey() + " -> " + regionTime);
    }

    System.out.println("Total time: " + time);
  }
}
