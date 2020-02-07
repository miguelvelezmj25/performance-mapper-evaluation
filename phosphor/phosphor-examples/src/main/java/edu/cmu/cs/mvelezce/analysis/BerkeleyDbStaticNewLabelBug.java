package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.control.sink.SinkManager;

public class BerkeleyDbStaticNewLabelBug {

  public static void main(String[] args) {
    SinkManager.preProcessSinks(BerkeleyDbStaticNewLabelBug.class.getSimpleName());

    final String vendor = System.getProperty("java.vendor");
    final String vmName = System.getProperty("java.vm.name");

    boolean ZING_JVM = vendor != null && vmName != null &&
        vendor.equals("Azul Systems, Inc.") && vmName.contains("Zing");
  }
}
