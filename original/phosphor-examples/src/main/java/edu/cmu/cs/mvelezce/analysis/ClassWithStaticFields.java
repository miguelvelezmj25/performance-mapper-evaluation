package edu.cmu.cs.mvelezce.analysis;

public class ClassWithStaticFields {

  public static String HELLO = "hello";
  public static String GOODBYE = "goodbye";
  public static String QUITO = "quito";
  public static String PITTSBURGH = "pittsburgh";

  static {
    System.out.println("This is where the static block is call");
//    HELLO = "";
  }
}
