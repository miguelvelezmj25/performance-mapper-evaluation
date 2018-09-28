package edu.cmu.cs.mvelezce.taints;

import edu.columbia.cs.psl.phosphor.runtime.Taint;

public class Test {

  public static void sink(Object o) { }

  public static void sink(Taint t) { }

}
