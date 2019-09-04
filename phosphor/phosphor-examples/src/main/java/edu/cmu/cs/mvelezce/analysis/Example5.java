package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Example5 {

  private static final int HTTP_UNAUTHORIZED = 401;
  private static final int HTTP_NOT_IMPLEMENTED = 501;
  private static String subject = "";
  private static int totalLength = 600;
  private static String REQUEST_GET = "GET";

  public static void main(String[] args) {
    boolean A = Sources.A_0(Boolean.valueOf(args[0]));
    boolean B = Sources.B_1(Boolean.valueOf(args[1]));
    boolean C = Sources.C_2(Boolean.valueOf(args[2]));
    boolean D = Sources.D_3(Boolean.valueOf(args[3]));

    if (B) {
      if (D) {
        sendHeaders(HTTP_UNAUTHORIZED, A);
      }
    }

    if (C) {
      if (!"POST".equals(REQUEST_GET)) {
        sendHeaders(HTTP_NOT_IMPLEMENTED, A);
      }
    }
  }

  private static void sendHeaders(int responseNum, boolean green) {
    int buf = 0;
    if (green) {
      buf = totalLength - responseNum;
      subject = "response header";
    }

    //    if (subject.isEmpty()) {
    //      subject = "Void response";
    //    }
    System.out.println("Done");
  }
}
