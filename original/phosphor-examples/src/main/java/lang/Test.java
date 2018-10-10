package lang;

import edu.cmu.cs.mvelezce.cc.Sinks;
import edu.cmu.cs.mvelezce.taints.Sources;

public class Test {

  private final char value[];

  public Test() {
    this.value = "".toCharArray();
  }

  public static void main(String[] args) {
    test();
  }

  public static void test() {
    boolean A = Sources.A_0(true);
    Test s = new Test();

    if (A) {
      s = new Test();
    }

    Test s1 = new Test();
    if (s.equals(s1)) {
      System.out.println("true");
    }

    Sinks.postProcessSinks("Test");
  }

  public void practice(int i, int j) {
    if (i < j) {
      System.out.println();
    }
  }

  public boolean equals(Object anObject) {
    if (this == anObject) {
      return true;
    }
    if (anObject instanceof Test) {
      Test anotherTest = (Test) anObject;
      int n = value.length;
      if (n == anotherTest.value.length) {
        char v1[] = value;
        char v2[] = anotherTest.value;
        int i = 0;
        while (n-- != 0) {
          if (v1[i] != v2[i]) return false;
          i++;
        }
        return true;
      }
    }
    return false;
  }
}
