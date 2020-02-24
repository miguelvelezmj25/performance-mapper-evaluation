/*
 * Copyright 2004-2019 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (https://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package edu.cmu.cs.mvelezce.bench;

import org.h2.util.StringUtils;
import org.h2.util.Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/** Represents a database in the benchmark test application. */
public class Database {

  private static final boolean TRACE = true;
  private final ArrayList<String[]> replace = new ArrayList<>();
  private final Random random = new Random(1);
  private final ArrayList<Object[]> results = new ArrayList<>();
  private final AtomicInteger executedStatements = new AtomicInteger();
  private final boolean collect = true;
  private String name, url, user, password;
  private String currentAction;
  private long startTimeNs;
  private long initialGCTime;
  private Connection conn;
  private Statement stat;
  private long lastTrace;
  private int totalTime;
  private int totalGCTime;
  private int threadCount;

  /**
   * Parse a database configuration and create a database object from it.
   *
   * @param dbString the configuration string
   * @param threadCount the number of threads to use
   * @return a new database object with the given settings
   */
  static Database parse(String dbString, int threadCount) {
    try {
      StringTokenizer tokenizer = new StringTokenizer(dbString, ",");
      Database db = new Database();
      db.threadCount = threadCount;
      db.name = tokenizer.nextToken().trim();
      String driver = tokenizer.nextToken().trim();
      Class.forName(driver);
      db.url = tokenizer.nextToken().trim();
      db.user = tokenizer.nextToken().trim();
      db.password = "";
      if (tokenizer.hasMoreTokens()) {
        db.password = tokenizer.nextToken().trim();
      }
      return db;
    } catch (Exception e) {
      System.out.println("Cannot load database " + dbString + " :" + e.toString());
      return null;
    }
  }

  /**
   * Get the database name.
   *
   * @return the database name
   */
  String getName() {
    return name;
  }

  /**
   * Get the total measured time.
   *
   * @return the time
   */
  int getTotalTime() {
    return totalTime;
  }

  /**
   * Get the total measured GC time.
   *
   * @return the time in milliseconds
   */
  int getTotalGCTime() {
    return totalGCTime;
  }

  /**
   * Get the result array.
   *
   * @return the result array
   */
  ArrayList<Object[]> getResults() {
    return results;
  }

  /**
   * Get the random number generator.
   *
   * @return the generator
   */
  Random getRandom() {
    return random;
  }

  /**
   * Open a new database connection. This connection must be closed by calling conn.close().
   *
   * @return the opened connection
   */
  Connection openNewConnection() throws SQLException {
    Connection newConn = DriverManager.getConnection(url, user, password);
    if (url.startsWith("jdbc:derby:")) {
      // Derby: use higher cache size
      try (Statement s = newConn.createStatement()) {
        // stat.execute("CALL
        // SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY(
        // 'derby.storage.pageCacheSize', '64')");
        // stat.execute("CALL
        // SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY(
        // 'derby.storage.pageSize', '8192')");
      }
    } else if (url.startsWith("jdbc:hsqldb:")) {
      // HSQLDB: use a WRITE_DELAY of 1 second
      try (Statement s = newConn.createStatement()) {
        s.execute("SET WRITE_DELAY 1");
      }
    }
    return newConn;
  }

  /** Open the database connection. */
  public void openConnection() throws SQLException {
    conn = openNewConnection();
    stat = conn.createStatement();
  }

  /** Close the database connection. */
  public void closeConnection() throws SQLException {
    // if(!serverHSQLDB && url.startsWith("jdbc:hsqldb:")) {
    //     stat.execute("SHUTDOWN");
    // }
    conn.close();
    stat = null;
    conn = null;
  }

  /**
   * Initialize the SQL statement translation of this database.
   *
   * @param prop the properties with the translations to use
   */
  void setTranslations(Properties prop) {
    String databaseType = url.substring("jdbc:".length());
    databaseType = databaseType.substring(0, databaseType.indexOf(':'));
    for (Object k : prop.keySet()) {
      String key = (String) k;
      if (key.startsWith(databaseType + ".")) {
        String pattern = key.substring(databaseType.length() + 1);
        pattern = pattern.replace('_', ' ');
        pattern = StringUtils.toUpperEnglish(pattern);
        String replacement = prop.getProperty(key);
        replace.add(new String[] {pattern, replacement});
      }
    }
  }

  /**
   * Prepare a SQL statement.
   *
   * @param sql the SQL statement
   * @return the prepared statement
   */
  public PreparedStatement prepare(String sql) throws SQLException {
    sql = getSQL(sql);
    return conn.prepareStatement(sql);
  }

  private String getSQL(String sql) {
    for (String[] pair : replace) {
      String pattern = pair[0];
      String replacement = pair[1];
      sql = StringUtils.replaceAll(sql, pattern, replacement);
    }
    return sql;
  }

  /**
   * Start the benchmark.
   *
   * @param bench the benchmark
   * @param action the action
   */
  public void start(Bench bench, String action) {
    this.currentAction = bench.getName() + ": " + action;
    this.startTimeNs = System.nanoTime();
    this.initialGCTime = Utils.getGarbageCollectionTime();
  }

  /** This method is called when the test run ends. This will stop collecting data. */
  public void end() {
    long time = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTimeNs);
    long gcCollectionTime = Utils.getGarbageCollectionTime() - initialGCTime;
    log(currentAction, "ms", (int) time);
    if (collect) {
      totalTime += time;
      totalGCTime += gcCollectionTime;
    }
  }

  /**
   * Drop a table. Errors are ignored.
   *
   * @param table the table name
   */
  public void dropTable(String table) {
    try {
      update("DROP TABLE " + table);
    } catch (Exception e) {
      // ignore - table may not exist
    }
  }

  /**
   * Execute an SQL statement.
   *
   * @param prep the prepared statement
   * @param traceMessage the trace message
   */
  public void update(PreparedStatement prep, String traceMessage) throws SQLException {
    //    test.trace(traceMessage);
    prep.executeUpdate();
    if (collect) {
      executedStatements.incrementAndGet();
    }
  }

  /**
   * Execute an SQL statement.
   *
   * @param sql the SQL statement
   */
  public void update(String sql) throws SQLException {
    sql = getSQL(sql);
    if (sql.trim().length() > 0) {
      if (collect) {
        executedStatements.incrementAndGet();
      }
      stat.execute(sql);
    } else {
      System.out.println("?");
    }
  }

  /**
   * Enable or disable auto-commit.
   *
   * @param b false to disable
   */
  public void setAutoCommit(boolean b) throws SQLException {
    conn.setAutoCommit(b);
  }

  /** Commit a transaction. */
  public void commit() throws SQLException {
    conn.commit();
  }

  /** Roll a transaction back. */
  public void rollback() throws SQLException {
    conn.rollback();
  }

  /**
   * Print trace information if trace is enabled.
   *
   * @param action the action
   * @param i the current value
   * @param max the maximum value
   */
  public void trace(String action, int i, int max) {
    if (TRACE) {
      long time = System.nanoTime();
      if (i == 0 || lastTrace == 0) {
        lastTrace = time;
      } else if (time > lastTrace + TimeUnit.SECONDS.toNanos(1)) {
        System.out.println(action + ": " + ((100 * i / max) + "%"));
        lastTrace = time;
      }
    }
  }

  /**
   * If data collection is enabled, add the currently used memory size to the log.
   *
   * @param bench the benchmark
   * @param action the action
   */
  public void logMemory(Bench bench, String action) {
    //            log(bench.getName() + ": " + action, "MB", TestBase.getMemoryUsed());
  }

  /**
   * If data collection is enabled, add this information to the log.
   *
   * @param action the action
   * @param scale the scale
   * @param value the value
   */
  void log(String action, String scale, int value) {
    if (collect) {
      results.add(new Object[] {action, scale, Integer.valueOf(value)});
    }
  }

  /**
   * Execute a query.
   *
   * @param prep the prepared statement
   * @return the result set
   */
  public ResultSet query(PreparedStatement prep) throws SQLException {
    // long time = System.nanoTime();
    ResultSet rs = prep.executeQuery();
    // time = System.nanoTime() - time;
    // if(time > 100) {
    //     System.out.println("time="+time);
    // }
    if (collect) {
      executedStatements.incrementAndGet();
    }
    return rs;
  }

  /**
   * Execute a query and read all rows.
   *
   * @param prep the prepared statement
   */
  void queryReadResult(PreparedStatement prep) throws SQLException {
    ResultSet rs = query(prep);
    ResultSetMetaData meta = rs.getMetaData();
    int columnCount = meta.getColumnCount();
    while (rs.next()) {
      for (int i = 0; i < columnCount; i++) {
        rs.getString(i + 1);
      }
    }
  }

  /**
   * Get the number of executed statements.
   *
   * @return the number of statements
   */
  int getExecutedStatements() {
    return executedStatements.get();
  }

  int getThreadsCount() {
    return threadCount;
  }

  /** The interface used for a test. */
  public interface DatabaseTest {

    /**
     * Whether data needs to be collected.
     *
     * @return true if yes
     */
    boolean isCollect();

    /**
     * Print a message to system out if trace is enabled.
     *
     * @param msg the message
     */
    void trace(String msg);
  }
}
