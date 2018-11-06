package edu.cmu.cs.mvelezce.analysis;

import edu.cmu.cs.mvelezce.taints.Sources;

public class Example5 {

  private static final int HTTP_UNAUTHORIZED = 401;
  private static final int HTTP_NOT_IMPLEMENTED = 501;
  private static String subject = null;
  private static int totalLength = 600;
  private static String REQUEST_GET = "GET";

  public static void main(String[] args) {
    boolean green = Sources.A_0(Boolean.valueOf(args[0]));
    boolean yellow = Sources.B_1(Boolean.valueOf(args[1]));
    boolean blue = Sources.C_2(Boolean.valueOf(args[2]));
    boolean http_unauthorized = Sources.D_3(Boolean.valueOf(args[3]));

    if (yellow) {
      if (http_unauthorized) {
        sendHeaders(HTTP_UNAUTHORIZED, green);
      }
    }

    if (blue) {
      if (!"POST".equals(REQUEST_GET)) {
        sendHeaders(HTTP_NOT_IMPLEMENTED, green);
      }
    }

  }

  private static void sendHeaders(int responseNum, boolean green) {
    int buf = 0;
    if (green) {
      buf = totalLength - responseNum;
      subject = "response header";
    }

    if (subject.isEmpty()) {
      subject = "Void response";
    }
    System.out.println("Done");
  }
}
