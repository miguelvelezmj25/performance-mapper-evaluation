package edu.cmu.cs.mvelezce.bench;

import edu.cmu.cs.mvelezce.bench.c.BenchC;
import org.h2.engine.Constants;
import org.h2.store.FileLockMethod;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.util.Properties;

public class RunBenchC {

  private static final String URL = "jdbc:h2:./data/test";
  private static final String DB_STRING = "H2, org.h2.Driver, " + URL + ", sa, sa";
  //    private static final int SIZE = 5000;
  private static final int SIZE = 50000;
  //  private static final int SIZE = 1;

  private static String FILE_LOCK;
  private static boolean AUTOCOMMIT;
  private static String ACCESS_MODE_DATA;
  private static String CIPHER;
  private static String CACHE_TYPE;
  private static int CACHE_SIZE;

  public static void main(String[] args) throws Exception {
    FILE_LOCK = fileLock(Boolean.parseBoolean(args[0]));
    AUTOCOMMIT = Boolean.parseBoolean(args[1]);
    ACCESS_MODE_DATA = accessModeData(Boolean.parseBoolean(args[2]));
    CIPHER = cipher(Boolean.parseBoolean(args[3]));
    CACHE_TYPE = cacheType(Boolean.parseBoolean(args[4]));
    CACHE_SIZE = cacheSize(Boolean.parseBoolean(args[5]));

    Database db = Database.parse(DB_STRING, 1, AUTOCOMMIT);
    System.out.println();
    System.out.println("Testing the performance of " + db.getName());

    Properties prop = new Properties();
    prop.put("user", "sa");
    prop.put("password", "sa");
    prop.put("FILE_LOCK", FILE_LOCK);
    prop.put("ACCESS_MODE_DATA", ACCESS_MODE_DATA);
    prop.put("CACHE_TYPE", CACHE_TYPE);
    prop.put("CACHE_SIZE", CACHE_SIZE + "");

    //            "IGNORE_UNKNOWN_SETTINGS",
    //            "IFEXISTS", "INIT", "FORBID_CREATION", "PASSWORD", "RECOVER", "RECOVER_TEST",
    //            "USER", "AUTO_SERVER", "AUTO_SERVER_PORT", "NO_UPGRADE",
    //            "AUTO_RECONNECT", "OPEN_NEW", "PAGE_SIZE", "PASSWORD_HASH", "JMX",
    //            "SCOPE_GENERATED_KEYS", "AUTHREALM", "AUTHZPWD"

    Connection conn = DriverManager.getConnection("jdbc:h2:./data/test", prop);
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

  private static int cacheSize(boolean option) {
    if (option) {
      return 8 * 1024;
    }

    return Constants.CACHE_SIZE_DEFAULT;
  }

  private static String cacheType(boolean option) {
    if (option) {
      return "SOFT_LRU";
    }

    return Constants.CACHE_TYPE_DEFAULT;
  }

  private static String cipher(boolean option) {
    if (option) {
      return "AES";
    }

    return "FOG";
  }

  private static String accessModeData(boolean option) {
    if (option) {
      return "rwd";
    }

    return "rw";
  }

  private static String fileLock(boolean option) {
    if (option) {
      return FileLockMethod.FILE.name();
    }

    return FileLockMethod.NO.name();
  }
}
