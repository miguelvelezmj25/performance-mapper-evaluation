package edu.cmu.cs.mvelezce.cc.executor;

import edu.cmu.cs.mvelezce.analysis.Trivial;
import edu.cmu.cs.mvelezce.java.execute.region.RegionsManager;

public class CCTrivial {

  public static void main(String[] args) throws InterruptedException {
    RegionsManager rm = new RegionsManager();
    rm.execute();
    RegionsManager.enter(RegionsManager.PROGRAM_REGION_ID.toString());
    Trivial.main(args);
    RegionsManager.exit(RegionsManager.PROGRAM_REGION_ID.toString());
    RegionsManager.exitProgram();
  }
}
