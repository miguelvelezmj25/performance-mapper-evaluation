package com.sleepycat.analysis;

import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.*;
import com.sleepycat.je.config.EnvironmentParams;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MeasureDiskOrderedScan {

  //  public static boolean ACTION;
  //  public static boolean RECORDS;
  //  public static boolean DATA;
  private static boolean DUPLICATES;
  private static boolean SEQUENTIAL;
  private static boolean KEYSONLY;
  private static String FILELOGGINGLEVEL;
  private static long JECACHESIZE;
  private static boolean LOCKING;
  private static boolean SHAREDCACHE;
  private static boolean REPLICATED;
  private static CacheMode CACHE_MODE;
  private static boolean TEMPORARY;
  private static boolean LOCK_DEADLOCK_DETECT;
  private static String ENV_BACKGROUND_READ_LIMIT;
  private boolean dupDb = false;
  //  public static boolean KEYSIZE;
  private boolean keysOnly = false;
  private boolean preload = false;
  private boolean sequentialWrites = false;
  private Action action = Action.Populate;
  //  private int nRecords = 25 * 1000 * 1000;
  private int nRecords = 500_000;
  //  private int nRecords = 10;
  private int keySize = 10;
  private int dataSize = 1000;
  private long lsnBatchSize = Long.MAX_VALUE;
  private long internalMemoryLimit = 100L * 1000 * 1000;
  private long jeCacheSize = 1000L * 1000 * 1000;
  private String homeDir = "tmp";
  private Environment env = null;
  private Database db = null;
  private Random random = new Random(10);
  private long startTime;
  private long endTime;

  public MeasureDiskOrderedScan(String args[]) {
    //    File dir = new File(this.homeDir);
    //    deleteFolder(dir);
    //    dir.mkdir();

    boolean dataSizeSpecified = false;

    //    if (ACTION) {
    //      this.action = null;
    //    }
    //
    //    if (RECORDS) {
    //      this.nRecords /= 50;
    //    }
    //
    //    if (DATA) {
    //      this.dataSize = 100;
    //      dataSizeSpecified = true;
    //    }
    //

    this.dupDb = DUPLICATES;
    this.sequentialWrites = SEQUENTIAL;
    this.keysOnly = KEYSONLY;
    this.jeCacheSize = JECACHESIZE;

    //    if (KEYSIZE) {
    //      this.keySize = 100;
    //    }
    //
    //    if(SEQUENTIAL) {
    //      this.sequentialWrites = true;
    //    }

    //        for (int i = 0; i < args.length; i += 1) {
    //            final String arg = args[i];
    //            if (arg.equals("-dupDb")) {
    //                dupDb = true;
    //            } else if (arg.equals("-keysOnly")) {
    //                keysOnly = true;
    //            } else if (arg.equals("-preload")) {
    //                preload = true;
    //            } else if (arg.equals("-sequentialWrites")) {
    //                sequentialWrites = true;
    //            } else {
    //                if (i + 1 >= args.length) {
    //                    throw new IllegalArgumentException
    //                            ("Missing value for arg: " + arg);
    //                }
    //                i += 1;
    //                final String value = args[i];
    //                if (arg.equals("-h")) {
    //                    homeDir = value;
    //                } else if (arg.equals("-action")) {
    //                    action = Enum.valueOf(Action.class, value);
    //                } else if (arg.equals("-nRecords")) {
    //                    nRecords = Integer.parseInt(value);
    //                } else if (arg.equals("-keySize")) {
    //                    keySize = Integer.parseInt(value);
    //                } else if (arg.equals("-dataSize")) {
    //                    dataSize = Integer.parseInt(value);
    //                    dataSizeSpecified = true;
    //                } else if (arg.equals("-lsnBatchSize")) {
    //                    lsnBatchSize = Long.parseLong(value);
    //                } else if (arg.equals("-internalMemoryLimit")) {
    //                    internalMemoryLimit = Long.parseLong(value);
    //                } else if (arg.equals("-jeCacheSize")) {
    //                    jeCacheSize = Long.parseLong(value);
    //                } else {
    //                    throw new IllegalArgumentException("Unknown arg: " + arg);
    //                }
    //            }
    //        }
    if (lsnBatchSize != Long.MAX_VALUE && internalMemoryLimit != Long.MAX_VALUE) {
      throw new IllegalArgumentException(
          "Only one of lsnBatchSize and internalMemoryLimit may be "
              + "specified (not equal to Long.MAX_VALUE)");
    }
    if (dupDb && !dataSizeSpecified) {
      dataSize = keySize;
    }
    printArgs(args);
  }

  public static void main(String[] args) throws IOException {
    DUPLICATES = Boolean.parseBoolean(args[0]);
    SEQUENTIAL = Boolean.parseBoolean(args[1]);
    //    KEYSONLY = Boolean.parseBoolean(args[2]);
    //    FILELOGGINGLEVEL = fileLoggingLevel(Boolean.parseBoolean(args[3]));
    JECACHESIZE = jeCacheSize(Boolean.parseBoolean(args[2]));
    SHAREDCACHE = Boolean.parseBoolean(args[3]);
    REPLICATED = Boolean.parseBoolean(args[4]);
    LOCKING = Boolean.parseBoolean(args[5]);
    CACHE_MODE = cacheMode(Boolean.parseBoolean(args[6]));
    TEMPORARY = Boolean.parseBoolean(args[7]);
    FILELOGGINGLEVEL = fileLoggingLevel(Boolean.parseBoolean(args[8]));
    ENV_BACKGROUND_READ_LIMIT = envBackgroundReadLimit(Boolean.parseBoolean(args[9]));
    //    LOCK_DEADLOCK_DETECT = Boolean.parseBoolean(args[5]);

    new MeasureDiskOrderedScan(args).run();
  }

  private static String envBackgroundReadLimit(boolean option) {
    if (option) {
      return EnvironmentParams.ENV_BACKGROUND_READ_LIMIT.getMax();
    }

    return EnvironmentParams.ENV_BACKGROUND_READ_LIMIT.getDefault();
  }

  private static CacheMode cacheMode(boolean option) {
    return option ? CacheMode.UNCHANGED : CacheMode.EVICT_LN;
  }

  private static long jeCacheSize(boolean option) {
    long value = 1000L * 1000;

    if (option) {
      return value * 1000;
    }

    return value;
  }

  private static String fileLoggingLevel(boolean option) {
    if (option) {
      return "INFO";
    }

    return "OFF";
  }

  //  public static void deleteFolder(File folder) {
  //    File[] files = folder.listFiles();
  //    if (files != null) { // some JVMs return null for empty dirs
  //      for (File f : files) {
  //        if (f.isDirectory()) {
  //          deleteFolder(f);
  //        } else {
  //          f.delete();
  //        }
  //      }
  //    }
  //    folder.delete();
  //  }

  private void printArgs(String[] args) {
    System.out.print("Command line arguments:");
    for (String arg : args) {
      System.out.print(' ');
      System.out.print(arg);
    }
    System.out.println();
    System.out.println(
        "Effective arguments:"
            + " action="
            + action
            + " dupDb="
            + dupDb
            + " keysOnly="
            + keysOnly
            + " preload="
            + preload
            + " sequentialWrites="
            + sequentialWrites
            + " nRecords="
            + nRecords
            + " keySize="
            + keySize
            + " dataSize="
            + dataSize
            + " lsnBatchSize="
            + lsnBatchSize
            + " internalMemoryLimit="
            + internalMemoryLimit
            + " jeCacheSize="
            + jeCacheSize);
  }

  private void run() throws IOException {

    open();
    if (preload) {
      db.preload(null); /* LNs are not loaded. */
    }
    final double startTime = System.currentTimeMillis();
    switch (action) {
      case Populate:
        populate();
        break;
      case DirtyReadScan:
        dirtyReadScan();
        break;
      case DiskOrderedScan:
        diskOrderedScan();
        break;
      default:
        fail(action);
    }
    final double endTime = System.currentTimeMillis();
    final double totalSecs = (endTime - startTime) / 1000;
    final double throughput = nRecords / totalSecs;
    System.out.println("\nTotal seconds: " + totalSecs + " txn/sec: " + throughput);
    close();
  }

  private void open() throws IOException {

    final long minMemory =
        (internalMemoryLimit != Long.MAX_VALUE ? internalMemoryLimit : 0)
            + jeCacheSize
            + (jeCacheSize / 2);

    if (Runtime.getRuntime().maxMemory() < minMemory) {
      throw new IllegalArgumentException(
          "Must set heap size to at least internalMemoryLimit (if "
              + "specified) plus 1.5 X jeCacheSize: "
              + minMemory);
    }

    final boolean create = (action == Action.Populate);

    final EnvironmentConfig envConfig = new EnvironmentConfig();
    envConfig.setTransactional(true);
    envConfig.setAllowCreate(create);
    envConfig.setConfigParam(EnvironmentConfig.LOG_FILE_MAX, String.valueOf(1000 * 1000 * 1000));

    envConfig.setCacheSize(jeCacheSize);
    envConfig.setConfigParam(EnvironmentConfig.FILE_LOGGING_LEVEL, FILELOGGINGLEVEL);
    envConfig.setTxnSerializableIsolation(LOCKING);
    envConfig.setSharedCache(SHAREDCACHE);

    /* Daemons interfere with cache size measurements. */
    envConfig.setConfigParam(EnvironmentConfig.ENV_RUN_EVICTOR, "false");
    envConfig.setConfigParam(EnvironmentConfig.ENV_RUN_OFFHEAP_EVICTOR, "false");
    envConfig.setConfigParam(EnvironmentConfig.ENV_RUN_IN_COMPRESSOR, "false");
    envConfig.setConfigParam(EnvironmentConfig.ENV_RUN_CHECKPOINTER, "false");
    envConfig.setConfigParam(EnvironmentConfig.ENV_RUN_CLEANER, "false");
    envConfig.setConfigParam(EnvironmentConfig.ENV_RUN_VERIFIER, "false");
    envConfig.setConfigParam(EnvironmentConfig.STATS_COLLECT, "false");
    /* Daemons interfere with cache size measurements. */
    envConfig.setConfigParam(
        EnvironmentConfig.ENV_BACKGROUND_READ_LIMIT, ENV_BACKGROUND_READ_LIMIT);

    env = new Environment(new File(homeDir), envConfig);

    final DatabaseConfig dbConfig = new DatabaseConfig();
    dbConfig.setAllowCreate(create);
    dbConfig.setExclusiveCreate(create);

    dbConfig.setSortedDuplicates(dupDb);
    dbConfig.setReplicated(REPLICATED);
    dbConfig.setCacheMode(CACHE_MODE);
    dbConfig.setTemporary(TEMPORARY);

    db = env.openDatabase(null, "foo", dbConfig);
  }

  private void close() {
    db.close();
    env.close();
  }

  private void populate() {
    final DatabaseEntry key = new DatabaseEntry();
    final DatabaseEntry data = new DatabaseEntry();
    for (long i = 0; i < nRecords; i += 1) {
      if (sequentialWrites) {
        makeLongKey(key, i);
      } else {
        makeRandomKey(key);
      }
      makeData(data);
      OperationStatus status;
      /* Insert */
      if (dupDb) {
        status = db.putNoDupData(null, key, data);
      } else {
        status = db.putNoOverwrite(null, key, data);
      }
      if (status != OperationStatus.SUCCESS) {
        fail(status);
      }
      /* Update to create waste */
      status = db.put(null, key, data);
      if (status != OperationStatus.SUCCESS) {
        fail(status);
      }
    }
  }

  private void dirtyReadScan() {
    final DatabaseEntry key = new DatabaseEntry();
    final DatabaseEntry data = new DatabaseEntry();
    if (keysOnly) {
      data.setPartial(0, 0, true);
    }
    final Cursor cursor = db.openCursor(null, null);
    int nScanned = 0;
    while (cursor.getNext(key, data, LockMode.READ_UNCOMMITTED) == OperationStatus.SUCCESS) {
      if (sequentialWrites) {
        checkLongKey(key, nScanned);
      } else {
        checkAnyKey(key);
      }
      if (!keysOnly) {
        checkData(data);
      }
      nScanned += 1;
    }
    cursor.close();
    checkEquals(nRecords, nScanned);
  }

  private void diskOrderedScan() {
    final DatabaseEntry key = new DatabaseEntry();
    final DatabaseEntry data = new DatabaseEntry();
    final DiskOrderedCursorConfig config = new DiskOrderedCursorConfig();
    config.setKeysOnly(keysOnly);
    config.setInternalMemoryLimit(internalMemoryLimit);
    config.setLSNBatchSize(lsnBatchSize);
    final DiskOrderedCursor cursor = db.openCursor(config);
    int nScanned = 0;
    while (cursor.getNext(key, data, LockMode.READ_UNCOMMITTED) == OperationStatus.SUCCESS) {
      checkAnyKey(key);
      if (!keysOnly) {
        checkData(data);
      }
      nScanned += 1;
    }
    cursor.close();
    checkEquals(nRecords, nScanned);
  }

  private void makeLongKey(DatabaseEntry key, long value) {
    final byte[] bytes = new byte[keySize];
    final TupleOutput out = new TupleOutput(bytes);
    out.writeLong(value);
    key.setData(bytes);
  }

  private void checkLongKey(DatabaseEntry key, long value) {
    checkEquals(keySize, key.getSize());
    final TupleInput in = new TupleInput(key.getData());
    checkEquals(value, in.readLong());
  }

  private void makeRandomKey(DatabaseEntry key) {
    final byte[] bytes = new byte[keySize];
    random.nextBytes(bytes);
    key.setData(bytes);
  }

  private void checkAnyKey(DatabaseEntry key) {
    checkEquals(keySize, key.getSize());
  }

  private void makeData(DatabaseEntry data) {
    final byte[] bytes = new byte[dataSize];
    for (int i = 0; i < bytes.length; i += 1) {
      bytes[i] = (byte) i;
    }
    data.setData(bytes);
  }

  private void checkData(DatabaseEntry data) {
    checkEquals(dataSize, data.getSize());
    final byte[] bytes = data.getData();
    for (int i = 0; i < bytes.length; i += 1) {
      checkEquals(bytes[i], (byte) i);
    }
  }

  private void fail(Object msg) {
    throw new IllegalStateException(msg.toString());
  }

  private void check(boolean cond) {
    if (!cond) {
      fail("check failed, see stack");
    }
  }

  private void checkEquals(Object o1, Object o2) {
    if (o1 == null || o2 == null) {
      if (o1 != null || o2 != null) {
        fail("Only one is null; o1=" + o1 + " o2=" + o2);
      }
    }
    if (!o1.equals(o2)) {
      fail("Not equal; o1=" + o1 + " o2=" + o2);
    }
  }

  private enum Action {
    Populate,
    DirtyReadScan,
    DiskOrderedScan
  }
}
