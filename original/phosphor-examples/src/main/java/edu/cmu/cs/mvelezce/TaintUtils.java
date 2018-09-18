package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.taints.Taint;
import edu.columbia.cs.psl.phosphor.struct.SimpleHashSet;
import java.util.HashSet;
import java.util.Set;

public class TaintUtils {

  private TaintUtils() {
    throw new UnsupportedOperationException();
  }

  public static boolean getSource(boolean b) {
    return b;
  }

  public static void getSink(boolean o) { ; }

  /**
   * TODO
   *
   * @param taint TODO
   * @return TODO
   */
  public static Set<Taint> getTaints(edu.columbia.cs.psl.phosphor.runtime.Taint taint) {
    Set<Taint> taints = new HashSet<>();

    if (taint == null) {
      return taints;
    }

    Object label = taint.getLabel();

    if (label != null) {
      taints.add((Taint) label);
    }

    SimpleHashSet dependencies = taint.getDependencies();

    for (Object dependency : dependencies) {
      if (dependency != null) {
        taints.add((Taint) dependency);
      }
    }

    return taints;
  }

  public static void sink(Object o) { }
}
