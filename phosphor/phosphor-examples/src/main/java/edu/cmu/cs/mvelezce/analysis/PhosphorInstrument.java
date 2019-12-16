package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.cc.Sinks;

public class PhosphorInstrument {

  public static void main(String[] args) throws InterruptedException {
    Sinks.preProcessSinks(PhosphorInstrument.class.getSimpleName());

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    boolean b = Boolean.parseBoolean(args[2]);

    if (b) {
      System.out.println();
    }

    if (args[0] == null) {
      System.out.println();
    }

    if (x == y) {
      System.out.println();
    }

    if (args[0] == args[1]) {
      System.out.println();
    }

    switch (args[3]) {
      case "a":
        System.out.println("A");
        break;
      case "b":
        System.out.println("B");
        break;
      case "c":
        System.out.println("C");
        break;
      case "d":
        System.out.println("D");
        break;
      case "e":
        System.out.println("E");
        break;
      case "f":
        System.out.println("F");
        break;
      default:
        System.out.println("Z");
    }

    Sinks.postProcessSinks();
  }
}
