package edu.cmu.cs.mvelezce.implicit;


public class StringOps {

  public static void main(String[] args) {
    //    stringOps();
    carOps();
  }

  private static void carOps() {
    boolean A = false;
    boolean B = true;
    Car c;
    int y;

    if (A) {
      c = new Car("ford", 2019, false);
    } else {
      c = new Car("toyota", 2014, true);
    }

    if (B) {
      y = 20;
    } else {
      y = 10;
    }

//    Taint taint = MultiTainter.getTaint(c);
//
//    String name = c.getName();
//    taint = MultiTainter.getTaint(name);
//
//    int year = c.getYear();
//    taint = MultiTainter.getTaint(year);
//
//    boolean used = c.isUsed();
//    taint = MultiTainter.getTaint(used);
//
//    Car c1 = Car.copy(c);
//    taint = MultiTainter.getTaint(c1);
//
//    long now = year + 10L;
//    taint = MultiTainter.getTaint(now);
//
//    c1.setYear(year);
//    taint = MultiTainter.getTaint(c1);
//
//    c1.setName(name.toUpperCase());
//    taint = MultiTainter.getTaint(c1);
//
//    boolean equals = c1.equals(c);
//    taint = MultiTainter.getTaint(equals);
//
//    c.setYear(y + year);
//    taint = MultiTainter.getTaint(c);
  }

  private static void stringOps() {
    boolean A = false;
    String s;

    if (A) {
      s = "true";
    } else {
      s = "false";
    }

//    Taint taint = MultiTainter.getTaint(s); // {A}
//
//    boolean starts = s.startsWith("fal");
//    taint = MultiTainter.getTaint(starts);
//
//    char c = s.charAt(0);
//    taint = MultiTainter.getTaint(c);
//
//    String s1 = s.toUpperCase();
//    taint = MultiTainter.getTaint(s1);
//
//    boolean equals = s.equals("falsi");
//    taint = MultiTainter.getTaint(equals);
//
//    String s2 = new String(s);
//    taint = MultiTainter.getTaint(s2);
  }
}
