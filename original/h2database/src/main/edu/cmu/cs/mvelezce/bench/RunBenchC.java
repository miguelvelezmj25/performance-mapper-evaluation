package edu.cmu.cs.mvelezce.bench;

import edu.cmu.cs.mvelezce.bench.c.BenchC;
import org.h2.engine.Constants;
import org.h2.engine.DbSettings;
import org.h2.jdbc.JdbcConnection;
import org.h2.pagestore.PageStore;
import org.h2.store.FileLock;
import org.h2.store.FileLockMethod;
import org.h2.store.fs.FileUtils;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.Properties;

public class RunBenchC {

  private static final String URL = "jdbc:h2:./data/test";
  private static final String DB_STRING = "H2, org.h2.Driver, " + URL + ", sa, sa";
  //  private static final int SIZE = 50000;
  private static final int SIZE = 100;
  //  private static final int SIZE = 5;

  private static FileLockMethod FILE_LOCK;
  private static boolean AUTOCOMMIT;
  private static String ACCESS_MODE_DATA;
  private static String CIPHER;
  private static String CACHE_TYPE;
  private static int CACHE_SIZE;
  private static boolean MV_STORE;
  private static int ANALYZE_AUTO;
  private static boolean DEFRAG_ALWAYS;
  private static boolean IF_EXISTS;
  private static boolean FORBID_CREATION;
  private static boolean IGNORE_UNKNWON_SETTING;
  private static int PAGE_SIZE;
  private static int ANALYZE_SAMPLE;
  private static boolean COMPRESS;
  private static boolean OPTIMIZE_DISTINCT;

  public static void main(String[] args) {
    try {
      File output = new File("./data");
      org.apache.commons.io.FileUtils.forceDelete(output);
      org.apache.commons.io.FileUtils.forceMkdir(output);
      run(args);
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println("PageStore.COUNT_COMPACT " + PageStore.COUNT_COMPACT);
    System.out.println("FileUtils.COUNT_WRITE " + FileUtils.COUNT_WRITE);
  }

  public static void run(String[] args) throws Exception {
    MV_STORE = true;
    PAGE_SIZE = pageSize(true);
    DEFRAG_ALWAYS = true;

    FILE_LOCK = fileLock(false);
    AUTOCOMMIT = false;
    ACCESS_MODE_DATA = accessModeData(false);
    CIPHER = cipher(false);
    CACHE_TYPE = cacheType(false);
    CACHE_SIZE = cacheSize(false);
    ANALYZE_AUTO = analyzeAuto(false);
    IF_EXISTS = false;
    FORBID_CREATION = false;
    IGNORE_UNKNWON_SETTING = false;
    ANALYZE_SAMPLE = analyzeSample(false);
    COMPRESS = false;
    OPTIMIZE_DISTINCT = false;

    Database db = Database.parse(DB_STRING, 1, AUTOCOMMIT);
    System.out.println();
    System.out.println("Testing the performance of " + db.getName());

    Properties prop = new Properties();
    prop.put("user", "sa");
    prop.put("password", "sa");
    prop.put("FILE_LOCK", fileLock(false).name());
    prop.put("ACCESS_MODE_DATA", accessModeData(false));
    prop.put("CACHE_TYPE", cacheType(false));
    prop.put("CACHE_SIZE", Integer.toString(cacheSize(false)));
    prop.put("PAGE_SIZE", Integer.toString(PAGE_SIZE));

    DbSettings.init(
        MV_STORE, ANALYZE_AUTO, DEFRAG_ALWAYS, ANALYZE_SAMPLE, COMPRESS, OPTIMIZE_DISTINCT);

    Connection conn =
        new JdbcConnection(
            "jdbc:h2:./data/test",
            prop,
            FILE_LOCK,
            ACCESS_MODE_DATA,
            CACHE_TYPE,
            CACHE_SIZE,
            false,
            false,
            IGNORE_UNKNWON_SETTING,
            PAGE_SIZE);
    DatabaseMetaData meta = conn.getMetaData();
    System.out.println(
        " " + meta.getDatabaseProductName() + " " + meta.getDatabaseProductVersion());

    Bench bench = new BenchC();
    bench.init(db, SIZE);
    bench.runTest();
    conn.close();

    db.log("Executed statements", "#", db.getExecutedStatements());
    db.log("Total time", "ms", db.getTotalTime());
    int statPerSec = (int) (db.getExecutedStatements() * 1000L / db.getTotalTime());
    db.log("Statements per second", "#", statPerSec);
    System.out.println("Statements per second: " + statPerSec);
    System.out.println("GC overhead: " + (100 * db.getTotalGCTime() / db.getTotalTime()) + "%");
  }

  private static int analyzeSample(boolean option) {
    if (option) {
      return 100;
    }

    return 10000;
  }

  private static int pageSize(boolean option) {
    if (option) {
      return 1024;
    }

    return Constants.DEFAULT_PAGE_SIZE;
  }

  private static int analyzeAuto(boolean option) {
    if (option) {
      return 0;
    }

    return 2000;
  }

  private static int cacheSize(boolean option) {
    if (option) {
      return 256 * 1024;
    }

    return Constants.CACHE_SIZE_DEFAULT;
  }

  private static String cacheType(boolean option) {
    //    if (option) {
    //      return "SOFT_LRU";
    //    }

    return Constants.CACHE_TYPE_DEFAULT;
  }

  private static String cipher(boolean option) {
    if (option) {
      return "AES";
    }

    return "FOG";
  }

  private static String accessModeData(boolean option) {
    //    if (option) {
    return "rwd";
    //    }

    //    return "rw";
  }

  private static FileLockMethod fileLock(boolean option) {
    if (option) {
      return FileLock.getFileLockMethod(FileLockMethod.FILE.name());
    }

    return FileLock.getFileLockMethod(FileLockMethod.NO.name());
  }
}
