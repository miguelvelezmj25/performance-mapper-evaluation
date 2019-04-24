package edu.cmu.cs.mvelezce.analysis;

public class BerkeleyDbStaticNewLabelBug {

  public static void main(String[] args) {
    final int x = getInt1();
    final int y = getInt2();

    boolean b = x != 0 && y != 0;

    System.out.println(b);

    //    boolean b;
    //
    //    if (x != 0) {
    //      if (y != 0) {
    //        b = true;
    //      } else {
    //        b = false;
    //      }
    //    } else {
    //      b = false;
    //    }

    //    final String vendor = getString1();
    //    final String vmName = getString2();
    //
    //    boolean ZING_JVM = vendor != null && vmName != null;
    //    //        && vendor.equals("Azul Systems, Inc.") && vmName.contains("Zing");
  }

  private static int getInt1() {
    return 0;
  }

  private static int getInt2() {
    return 0;
  }

  private static String getString1() {
    return "";
  }

  private static String getString2() {
    return "";
  }
}
