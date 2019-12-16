package edu.cmu.cs.mvelezce.analysis;

import java.util.HashSet;
import java.util.Set;

public class Maps {

  public static void main(String[] args) {
    Set<String> context = new HashSet<>();
    Set<String> condition = new HashSet<>();

    context.add("A");
    context.add("B");
    context.add("C");

    condition.add("A");
    condition.add("D");

    condition.removeAll(context);
    System.out.println();

    //    boolean A = Boolean.parseBoolean(args[0]);
    //    boolean B = Boolean.parseBoolean(args[1]);
    //
    //    Set<Boolean> booleans = new HashSet<>();
    //    booleans.add(A);
    //    booleans.add(B);
    //
    //    System.out.println();
  }
}
