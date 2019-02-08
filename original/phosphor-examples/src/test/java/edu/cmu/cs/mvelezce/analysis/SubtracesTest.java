package edu.cmu.cs.mvelezce.analysis;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SubtracesTest {

  private static int pm(List<String> config) {
    int time = 0;
    if(Boolean.valueOf(config.get(0))) {
      time += 4;
    }

    if(Boolean.valueOf(config.get(1))) {
      time += 5;
    }

    if(Boolean.valueOf(config.get(0)) && Boolean.valueOf(config.get(1))) {
      time -= 3;
    }

    if(Boolean.valueOf(config.get(0)) && Boolean.valueOf(config.get(2))) {
      time += 4;
    }

    if(Boolean.valueOf(config.get(1)) && Boolean.valueOf(config.get(2))) {
      time += 4;
    }

    return time;
  }

  @Test
  public void test000() {
    List<String> config = new ArrayList<>();
    config.add("false");
    config.add("false");
    config.add("false");

    String[] args = new String[config.size()];
    args = config.toArray(args);

    int time = Subtraces.test(args);

    Assert.assertEquals(pm(config), time);
  }

  @Test
  public void test001() {
    List<String> config = new ArrayList<>();
    config.add("false");
    config.add("false");
    config.add("true");

    String[] args = new String[config.size()];
    args = config.toArray(args);

    int time = Subtraces.test(args);

    Assert.assertEquals(pm(config), time);
  }

  @Test
  public void test010() {
    List<String> config = new ArrayList<>();
    config.add("false");
    config.add("true");
    config.add("false");

    String[] args = new String[config.size()];
    args = config.toArray(args);

    int time = Subtraces.test(args);

    Assert.assertEquals(pm(config), time);
  }

  @Test
  public void test011() {
    List<String> config = new ArrayList<>();
    config.add("false");
    config.add("true");
    config.add("true");

    String[] args = new String[config.size()];
    args = config.toArray(args);

    int time = Subtraces.test(args);

    Assert.assertEquals(pm(config), time);
  }

  @Test
  public void test100() {
    List<String> config = new ArrayList<>();
    config.add("true");
    config.add("false");
    config.add("false");

    String[] args = new String[config.size()];
    args = config.toArray(args);

    int time = Subtraces.test(args);

    Assert.assertEquals(pm(config), time);
  }

  @Test
  public void test101() {
    List<String> config = new ArrayList<>();
    config.add("true");
    config.add("false");
    config.add("true");

    String[] args = new String[config.size()];
    args = config.toArray(args);

    int time = Subtraces.test(args);

    Assert.assertEquals(pm(config), time);
  }

  @Test
  public void test110() {
    List<String> config = new ArrayList<>();
    config.add("true");
    config.add("true");
    config.add("false");

    String[] args = new String[config.size()];
    args = config.toArray(args);

    int time = Subtraces.test(args);

    Assert.assertEquals(pm(config), time);
  }

  @Test
  public void test111() {
    List<String> config = new ArrayList<>();
    config.add("true");
    config.add("true");
    config.add("true");

    String[] args = new String[config.size()];
    args = config.toArray(args);

    int time = Subtraces.test(args);

    Assert.assertEquals(pm(config), time);
  }
}