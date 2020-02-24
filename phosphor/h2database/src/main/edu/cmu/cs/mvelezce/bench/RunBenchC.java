package edu.cmu.cs.mvelezce.bench;

import edu.cmu.cs.mvelezce.bench.c.BenchC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.util.Properties;

public class RunBenchC {

  private static final String DB_STRING = "H2, org.h2.Driver, jdbc:h2:./data/test, sa, sa";
  //  private static final int SIZE = 5000;
  private static final int SIZE = 1;

  public static void main(String[] args) throws Exception {
    Database db = Database.parse(DB_STRING, 1);
    System.out.println();
    System.out.println("Testing the performance of " + db.getName());

    Properties prop = new Properties();
    prop.put("user", "sa");
    prop.put("password", "sa");
    prop.put("FILE_LOCK", "FILE");

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
}
