package edu.cmu.cs.mvelezce.cc.executor;

import org.apache.lucene.demo.IndexFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CCIndexFiles {

  public static void main(String[] args) throws IOException, InterruptedException {
    long start = System.nanoTime();
    IndexFiles.main(args);
    long end = System.nanoTime();
    String time = (end - start) + "";

    File outputFile = new File("data.ser");
    FileOutputStream fos = new FileOutputStream(outputFile);
    fos.write(time.getBytes());
    fos.flush();
    fos.close();
  }
}
