package edu.cmu.cs.mvelezce.analysis;

public class MultipleConstructors {

  public MultipleConstructors(boolean b) {
    if (b) {
      System.out.println();
    }
  }

  public MultipleConstructors(int i) {
    if (i == 0) {
      System.out.println();
    }
  }

  public MultipleConstructors(String s) {
    int l = s.length();

    if (l == 0) {
      System.out.println();
    }
  }

  public MultipleConstructors() {}
}
