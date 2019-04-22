package com.sleepycat.analysis;

import edu.columbia.cs.psl.phosphor.runtime.Taint;
import java.util.LinkedList;
import java.util.List;

public class Testing {

  public static void main(String[] args) {
    Taint t = Taint.createTaint();
    System.out.println(t);

    List<String> l = new LinkedList<>();
    l.add("DF");
    l.add("DF");
    System.out.println();
  }
}
