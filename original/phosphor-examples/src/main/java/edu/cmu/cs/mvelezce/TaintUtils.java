package edu.cmu.cs.mvelezce;

import edu.columbia.cs.psl.phosphor.runtime.Taint;
import edu.columbia.cs.psl.phosphor.struct.SimpleHashSet;
import java.util.HashSet;
import java.util.Set;

public class TaintUtils {

  private TaintUtils() {
    throw new UnsupportedOperationException();
  }

  /**
   * TODO
   *
   * @param taint TODO
   * @return TODO
   */
  public static <T> Set<T> getLabels(Taint<T> taint) {
    Set<T> taints = new HashSet<>();

    if (taint == null) {
      return taints;
    }

    T label = taint.getLabel();

    if (label != null) {
      taints.add(label);
    }

    SimpleHashSet<T> dependencies = taint.getDependencies();

    for (T dependency : dependencies) {
      if (dependency != null) {
        taints.add(dependency);
      }
    }

    return taints;
  }

}
