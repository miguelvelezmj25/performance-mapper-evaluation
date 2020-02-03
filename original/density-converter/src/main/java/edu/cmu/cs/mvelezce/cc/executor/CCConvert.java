package edu.cmu.cs.mvelezce.cc.executor;

import at.favre.tools.dconvert.Convert;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CCConvert {

  public static void main(String[] args) throws IOException {
    long start = System.nanoTime();
    Convert.main(args);
    long end = System.nanoTime();
    String time = (end - start) + "";

    File outputFile = new File("data.ser");
    FileOutputStream fos = new FileOutputStream(outputFile);
    fos.write(time.getBytes());
    fos.flush();
    fos.close();
  }
}
