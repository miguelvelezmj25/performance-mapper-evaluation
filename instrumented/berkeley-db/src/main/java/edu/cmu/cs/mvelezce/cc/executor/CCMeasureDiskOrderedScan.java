package edu.cmu.cs.mvelezce.cc.executor;

import com.sleepycat.analysis.MeasureDiskOrderedScan;
import edu.cmu.cs.mvelezce.java.execute.region.RegionsManager;

import java.io.IOException;

public class CCMeasureDiskOrderedScan {

  public static void main(String[] args) throws IOException {
    RegionsManager rm = new RegionsManager();
    rm.execute();
    RegionsManager.enter(RegionsManager.PROGRAM_REGION_ID.toString());
    MeasureDiskOrderedScan.main(args);
    RegionsManager.exit(RegionsManager.PROGRAM_REGION_ID.toString());
    RegionsManager.exitProgram();
  }
}
