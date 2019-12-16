package edu.cmu.cs.mvelezce.implicit;

public class Test {

  public static void main(String[] args) {
    //    test();
    testAllTypesOfComparisons();
    testBranchNotTaken();
    testImplicitFlows();
    testFields1();
    testFields2();
  }

  //  public static void test() {
  //    boolean A = true);
  //
  //    String name = "Miguel";
  //
  //    if(A) {
  //      name = "Velez";
  //    }
  //
  //    if(name.equals("Miguel")) {
  //      System.out.println("First");
  //    }
  //
  //    long i = 100L;
  //
  //    if (i < 100) {
  //      i = 1000;
  //    }
  //
  //    System.out.println(i);
  //  }

  public static void testAllTypesOfComparisons() {
    System.out.println("\ntestAllTypesOfComparisons");
    boolean A = true;
    String s1 = "example1";

    String s = null;
    int i = 100;

    if (A) { // if<cond> {A}
      i = 1000;
      s = "example1";
    }

    if (s != null) { // ifnonnull || ifnull REFERENCES
      System.out.println(s);
    }

    if (s == s1) { // if_acmp<cond> REFERENCES
      System.out.println(s);
    }

    if (i < 500) { // if_icmp<cond> {A}
      System.out.println(s);
    }
  }

  public static void testBranchNotTaken() {
    System.out.println("\ntestBranchNotTaken");
    boolean A = false;
    String s1 = "example2";

    String s = null;
    int i = 100;

    if (A) { // {A}
      i = 1000;
      s = "example2";
    }

    if (s != null) { // REFERENCE
      System.out.println(s);
    }

    if (s == s1) { // REFERENCE
      System.out.println(s);
    }

    if (i < 500) {
      System.out.println(s);
    }
  }

  public static void testImplicitFlows() {
    System.out.println("\ntestImplicitFlows");
    boolean A = true;
    boolean B = true;

    boolean x = false;
    String s = "example3";
    long l = 0L;
    int i = 0;

    if (A) { // {A}
      x = true;
      if (B) { // {A,B}
        l = 1L;
      }
    }

    if (x) { // {A}
      i = 1;
    }

    if (l > 0) { // {A, B}
      s = "not example3";
    }

    if (s == "example3") { // REFERENCE
      System.out.println();
    }

    if (i == 0) { // {A}
      System.out.println();
    }
  }

  public static void testFields1() {
    System.out.println("\ntestFields1");
    boolean A = true;

    Car c = new Car("Ford", 2018, false);

    if (A) { // {A}
      c = new Car("Chevy", 2014, true);
    }

    Car copy = Car.copy(c);
    System.out.println(copy);

    int x = copy.getYear() + 5;

    if (x > 12) {
      System.out.println("something");
    }

    if (c == null) { // REFERENCE
      System.out.println("null car");
    }

    if (c.getYear() < 2015) { // {A}
      System.out.println("Chevy");
    }
  }

  public static void testFields2() {
    System.out.println("\ntestFields2");
    boolean A = true;

    Garage g = new Garage();
    Car c = new Car("Honda", 2018, false);

    //    if(A) {
    //      g.setCar(c);
    //    }

    if (A) { // {A}
      c.setName("Renault");
      c.setYear(2015);
    }

    int x = c.getYear() + 5;

    if (x > 20) {
      System.out.println("something");
    }

    if (c.getYear() == 2018) { // {A}
      System.out.println("Renault");
    }

    if (c.getName() == "Honda") {
      System.out.println("Honda");
    }

    Car copy = Car.copy(c);
    System.out.println(copy);
  }
}
