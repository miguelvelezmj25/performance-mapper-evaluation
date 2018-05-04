package edu.cmu.cs.mvelezce.tool.analysis.region;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by miguelvelez on 4/7/17.
 */
public class Regions {

    public static final String PROGRAM_REGION_ID = "program";

    // TODO change to method
    public static Map<String, Long> regionsToOverhead = new HashMap<>();

    private static Stack<String> executingRegions = new Stack<>();
    private static Stack<Long> executingRegionsStart = new Stack<>();
    private static Stack<Long> innerRegionsExecutionTime = new Stack<>();

    private static Map<String, Long> regionsToProcessedPerformance = new HashMap<>();

    public static void enter(String id) {
        long startRegion = System.nanoTime();

        Regions.executingRegions.push(id);
        Regions.executingRegionsStart.push(startRegion);
        Regions.innerRegionsExecutionTime.push(0L);

        long overhead = Regions.regionsToOverhead.get(id);
        long endProcess = System.nanoTime();
        Regions.regionsToOverhead.put(id, overhead + (endProcess - startRegion));
    }

    public static void forceExit() {
        while(!Regions.executingRegions.empty()) {
            Regions.exit(Regions.executingRegions.peek());
        }
    }

    public static void exit(String id) {
        long startRegion = System.nanoTime();

        if(!Regions.executingRegions.peek().equals(id)) {
            long overhead = Regions.regionsToOverhead.get(id);
            long endProcess = System.nanoTime();
            Regions.regionsToOverhead.put(id, overhead + (endProcess - startRegion));
            return;
        }

        long endRegion = System.nanoTime();
        long regionExecutionTime = Regions.processRegion(endRegion);

        if(Regions.executingRegions.isEmpty()) {
            return;
        }

        Regions.processOuterRegions(regionExecutionTime);

        long overhead = Regions.regionsToOverhead.get(id);
        long endProcess = System.nanoTime();
        Regions.regionsToOverhead.put(id, overhead + (endProcess - startRegion));
    }

    private static void processOuterRegions(long regionExecutionTime) {
        Stack<Long> temp = new Stack<>();

        while(!Regions.innerRegionsExecutionTime.isEmpty()) {
            long currentInnerRegionExecutionTime = Regions.innerRegionsExecutionTime.pop();
            temp.push(currentInnerRegionExecutionTime + regionExecutionTime);
        }

        while(!temp.isEmpty()) {
            Regions.innerRegionsExecutionTime.push(temp.pop());
        }
    }

    private static long processRegion(long endRegion) {
        long start = Regions.executingRegionsStart.pop();
        long innerTime = Regions.innerRegionsExecutionTime.pop();
        long regionExecutionTime = endRegion - start - innerTime;

        String region = Regions.executingRegions.pop();
        Long time = Regions.regionsToProcessedPerformance.get(region);
        long realExecutionTime = regionExecutionTime;

        if(time != null) {
            realExecutionTime += time;
        }

        Regions.regionsToProcessedPerformance.put(region, realExecutionTime);

        return regionExecutionTime;
    }


    public static Map<String, Long> getRegionsToOverhead() {
        return Regions.regionsToOverhead;
    }

    public static Stack<String> getExecutingRegions() {
        return Regions.executingRegions;
    }

    public static Stack<Long> getExecutingRegionsStart() {
        return Regions.executingRegionsStart;
    }

    public static Stack<Long> getInnerRegionsExecutionTime() {
        return Regions.innerRegionsExecutionTime;
    }

    public static Map<String, Long> getRegionsToProcessedPerformance() {
        return regionsToProcessedPerformance;
    }


}
