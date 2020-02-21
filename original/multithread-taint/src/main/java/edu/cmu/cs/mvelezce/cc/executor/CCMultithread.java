package edu.cmu.cs.mvelezce.cc.executor;

import edu.cmu.cs.mvelezce.Multithread;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CCMultithread {

  public static void main(String[] args) throws IOException, InterruptedException {
    long start = System.nanoTime();
    Multithread.main(args);
    long end = System.nanoTime();
    String time = (end - start) + "";

    File outputFile = new File("data.ser");
    FileOutputStream fos = new FileOutputStream(outputFile);
    fos.write(time.getBytes());
    fos.flush();
    fos.close();
  }
}
