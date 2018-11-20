package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Example6 {

  public static void main(String[] args) {
    boolean green = Sources.A_0(Boolean.valueOf(args[0]));

    int foo = 1;

    if (green) {
      foo = 10;
    }

    foo = unnecessaryMethod(foo);

    if (foo > 0) {
      foo++;
    }

    foo = 42 / foo;
    System.out.println(foo);
  }

  private static int unnecessaryMethod(int foo) {
    int x = foo;

    if (x == 0) {
      return foo;
    }

    return x;
  }
}
