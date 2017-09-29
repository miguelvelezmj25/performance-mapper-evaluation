/*-
 * Copyright (C) 2002, 2017, Oracle and/or its affiliates. All rights reserved.
 *
 * This file was distributed by Oracle as part of a version of Oracle Berkeley
 * DB Java Edition made available at:
 *
 * http://www.oracle.com/technetwork/database/database-technologies/berkeleydb/downloads/index.html
 *
 * Please see the LICENSE file included in the top-level directory of the
 * appropriate version of Oracle Berkeley DB Java Edition for a copy of the
 * license and additional information.
 */

package berkeley.com.sleepycat.je.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.logging.Level;

import berkeley.com.sleepycat.je.Database;
import berkeley.com.sleepycat.je.DatabaseConfig;
import berkeley.com.sleepycat.je.DatabaseEntry;
import berkeley.com.sleepycat.je.DatabaseException;
import berkeley.com.sleepycat.je.DatabaseExistsException;
import berkeley.com.sleepycat.je.DatabaseNotFoundException;
import berkeley.com.sleepycat.je.DbInternal;
import berkeley.com.sleepycat.je.Environment;
import berkeley.com.sleepycat.je.EnvironmentConfig;
import berkeley.com.sleepycat.je.EnvironmentFailureException;
import berkeley.com.sleepycat.je.JEVersion;
import berkeley.com.sleepycat.je.OperationStatus;
import berkeley.com.sleepycat.je.utilint.CmdUtil;
import berkeley.com.sleepycat.je.utilint.LoggerUtils;

/**
 * Loads a database from a dump file generated by {@link DbDump}. 
 * This utility may be used programmatically or from the command line.
 *
 * <p>When using this utility as a command line program, and the
 * application uses custom key comparators, be sure to add the jars or
 * classes to the classpath that contain the application's comparator
 * classes.</p>
 *
 *<pre>
 * java { com.sleepycat.je.util.DbLoad |
 *        -jar je-&lt;version&gt;.jar DbLoad }
 *     -h &lt;dir&gt;            # environment home directory
 *    [-f &lt;fileName&gt;]      # input file
 *    [-n]                 # no overwrite mode
 *    [-T]                 # input file is in text mode
 *    [-I]                 # ignore unknown parameters
 *    [-c name=value]      # config values
 *    [-s &lt;databaseName&gt; ] # database to load
 *    [-v]                 # show progress
 *    [-V]                 # print JE version number
 *</pre>
 * See {@link DbLoad#main} for a full description of the 
 * command line arguments.
 * <p>
 * To load a database to a stream from code:
 * <pre>
 *    DbLoad loader = new DbLoad();
 *    loader.setEnv(env);
 *    loader.setDbName(dbName);
 *    loader.setInputStream(stream);
 *    loader.setNoOverwrite(noOvrwr);
 *    loader.setTextFileMode(tfm);
 *    loader.load();
 * </pre>
 *
 * <p>Because a <code>DATA=END</code> marker is used to terminate the dump of
 * each database, multiple databases can be dumped and loaded using a single
 * stream. The {@link DbDump#dump} method leaves the stream positioned after
 * the last line written and the {@link DbLoad#load} method leaves the stream
 * positioned after the last line read.</p>
 */
public class DbLoad {
    private static final boolean DEBUG = false;

    protected Environment env;
    private boolean formatUsingPrintable;
    private String dbName;
    private BufferedReader reader;
    private boolean noOverwrite;
    private boolean textFileMode;
    private boolean dupSort;
    private boolean ignoreUnknownConfig;
    private boolean commandLine;
    private long progressInterval;
    private long totalLoadBytes;

    private static final String usageString =
        "usage: " + CmdUtil.getJavaCommand(DbLoad.class) + "\n" +
        "       -h <dir>             # environment home directory\n" +
        "       [-f <fileName>]      # input file\n" +
        "       [-n]                 # no overwrite mode\n" +
        "       [-T]                 # input file is in text mode\n" +
        "       [-I]                 # ignore unknown parameters\n" +
        "       [-c name=value]      # config values\n" +
        "       [-s <databaseName> ] # database to load\n" +
        "       [-v]                 # show progress\n" +
        "       [-V]                 # print JE version number";

    /**
     * The main used by the DbLoad utility.
     *
     * @param argv The arguments accepted by the DbLoad utility.
     *
     * <pre>
     * usage: java { com.sleepycat.je.util.DbLoad | -jar
     * je-&lt;version&gt;.jar DbLoad }
     *             [-f input-file] [-n] [-V] [-v] [-T] [-I]
     *             [-c name=value]
     *             [-s database] -h dbEnvHome
     * </pre>
     *
     * <p>-f - the file to load from (in DbDump format)<br>
     * -n - no overwrite mode.  Do not overwrite existing data.<br>
     * -V - display the version of the JE library.<br>
     * -T - input file is in Text mode.<br>
     * -I - ignore unknown parameters in the config file.<br></p>
     *
     * <p>If -f is not specified, the dump is read from System.in.</p>
     *
     * <p>The -T option allows JE applications to easily load text files into
     * databases.</p>
     *
     * <p>The -I option allows loading databases that were dumped with the
     * Berkeley DB C product, when the dump file contains parameters not known
     * to JE.</p>
     *
     * <p>The input must be paired lines of text, where the first line of the
     * pair is the key item, and the second line of the pair is its
     * corresponding data item.</p>
     *
     * <p>A simple escape mechanism, where newline and backslash (\) characters
     * are special, is applied to the text input. Newline characters are
     * interpreted as record separators. Backslash characters in the text will
     * be interpreted in one of two ways: If the backslash character precedes
     * another backslash character, the pair will be interpreted as a literal
     * backslash. If the backslash character precedes any other character, the
     * two characters following the backslash will be interpreted as a
     * hexadecimal specification of a single character; for example, \0a is a
     * newline character in the ASCII character set.</p>
     *
     * <p>For this reason, any backslash or newline characters that naturally
     * occur in the text input must be escaped to avoid misinterpretation by
     * db_load.</p>
     *
     * <p>-c name=value - Specify configuration options ignoring any value they
     * may have based on the input. The command-line format is name=value. See
     * the Supported Keywords section below for a list of keywords supported by
     * the -c option.</p>
     *
     * <p>-s database - the database to load.<br>
     * -h dbEnvHome - the directory containing the database environment.<br>
     * -v - report progress <br></p>
     *
     * <p>Supported Keywords<br>
     * version=N - specify the version of the input file.  Currently only
     * version 3 is supported.<br>
     * format - specify the format of the file.  Allowable values are "print"
     * and "bytevalue".<br>
     * dupsort - specify whether the database allows duplicates or not.
     * Allowable values are "true" and "false".<br>
     * type - specifies the type of database.  Only "btree" is allowed.<br>
     * database - specifies the name of the database to be loaded.<br></p>
     *
     * @throws EnvironmentFailureException if an unexpected, internal or
     * environment-wide failure occurs.
     */
    public static void main(String argv[])
        throws Exception {

        DbLoad loader = parseArgs(argv);
        try {
            loader.load();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        loader.env.close();
    }

    private static void printUsage(String msg) {
        System.err.println(msg);
        System.err.println(usageString);
        System.exit(-1);
    }

    private static DbLoad parseArgs(String argv[])
        throws Exception {

        boolean noOverwrite = false;
        boolean textFileMode = false;
        boolean ignoreUnknownConfig = false;
        boolean showProgressInterval = false;

        int argc = 0;
        int nArgs = argv.length;
        String inputFileName = null;
        File envHome = null;
        String dbName = null;
        long progressInterval = 0;
        DbLoad ret = new DbLoad();
        ret.setCommandLine(true);

        while (argc < nArgs) {
            String thisArg = argv[argc++].trim();
            if (thisArg.equals("-n")) {
                noOverwrite = true;
            } else if (thisArg.equals("-T")) {
                textFileMode = true;
            } else if (thisArg.equals("-I")) {
                ignoreUnknownConfig = true;
            } else if (thisArg.equals("-V")) {
                System.out.println(JEVersion.CURRENT_VERSION);
                System.exit(0);
            } else if (thisArg.equals("-f")) {
                if (argc < nArgs) {
                    inputFileName = argv[argc++];
                } else {
                    printUsage("-f requires an argument");
                }
            } else if (thisArg.equals("-h")) {
                if (argc < nArgs) {
                    envHome = new File(argv[argc++]);
                } else {
                    printUsage("-h requires an argument");
                }
            } else if (thisArg.equals("-s")) {
                if (argc < nArgs) {
                    dbName = argv[argc++];
                } else {
                    printUsage("-s requires an argument");
                }
            } else if (thisArg.equals("-c")) {
                if (argc < nArgs) {
                    try {
                        ret.loadConfigLine(argv[argc++]);
                    } catch (IllegalArgumentException e) {
                        printUsage("-c: " + e.getMessage());
                    }
                } else {
                    printUsage("-c requires an argument");
                }
            } else if (thisArg.equals("-v")) {
                showProgressInterval = true;
            }
        }

        if (envHome == null) {
            printUsage("-h is a required argument");
        }

        long totalLoadBytes = 0;
        InputStream is;
        if (inputFileName == null) {
            is = System.in;
            if (showProgressInterval) {

                /*
                 * Can't show progress if we don't know how big the stream
                 * is.
                 */
                printUsage("-v requires -f");
            }
        } else {
            is = new FileInputStream(inputFileName);
            if (showProgressInterval) {
                totalLoadBytes = ((FileInputStream) is).getChannel().size();
                /* Use 5% intervals. */
                progressInterval = totalLoadBytes / 20;
            }
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        EnvironmentConfig envConfig = new EnvironmentConfig();
        envConfig.setAllowCreate(true);
        Environment env = new Environment(envHome, envConfig);
        ret.setEnv(env);
        ret.setDbName(dbName);
        ret.setInputReader(reader);
        ret.setNoOverwrite(noOverwrite);
        ret.setTextFileMode(textFileMode);
        ret.setIgnoreUnknownConfig(ignoreUnknownConfig);
        ret.setProgressInterval(progressInterval);
        ret.setTotalLoadBytes(totalLoadBytes);
        return ret;
    }

    /*
     * Begin DbLoad API.  From here on there should be no calls to printUsage,
     * System.xxx.print, or System.exit.
     */

    /**
     * Creates a DbLoad object.
     */
    public DbLoad() {
    }

    /**
     * If true, enables output of warning messages.  Command line behavior is
     * not available via the public API.
     */
    private void setCommandLine(boolean commandLine) {
        this.commandLine = commandLine;
    }

    /**
     * Sets the Environment to load from.
     *
     * @param env The environment.
     */
    public void setEnv(Environment env) {
        this.env = env;
    }

    /**
     * Sets the database name to load.
     *
     * @param dbName database name
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * Sets the BufferedReader to load from.
     *
     * @param reader The BufferedReader.
     */
    public void setInputReader(BufferedReader reader) {
        this.reader = reader;
    }

    /**
     * Sets whether the load should overwrite existing data or not.
     *
     * @param noOverwrite True if existing data should not be overwritten.
     */
    public void setNoOverwrite(boolean noOverwrite) {
        this.noOverwrite = noOverwrite;
    }

    /**
     * Sets whether the load data is in text file format.
     *
     * @param textFileMode True if the load data is in text file format.
     */
    public void setTextFileMode(boolean textFileMode) {
        this.textFileMode = textFileMode;
    }

    /**
     * Sets whether to ignore unknown parameters in the config file. This
     * allows loading databases that were dumped with the Berkeley DB C
     * product, when the dump file contains parameters not known to JE.
     *
     * @param ignoreUnknownConfigMode True to ignore unknown parameters in
     * the config file.
     */
    public void setIgnoreUnknownConfig(boolean ignoreUnknownConfigMode) {
        this.ignoreUnknownConfig = ignoreUnknownConfigMode;
    }

    /**
     * If progressInterval is set, progress status messages are generated to
     * stdout at set percentages of the load.
     *
     * @param progressInterval Specifies the percentage intervals for status
     * messages. If 0, no messages are generated.
     */
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    /**
     * Used for progress status messages. Must be set to greater than
     * 0 if the progressInterval is greater than 0.
     *
     * @param totalLoadBytes number of input bytes to be loaded.
     */
    public void setTotalLoadBytes(long totalLoadBytes) {
        this.totalLoadBytes = totalLoadBytes;
    }

    public boolean load()
        throws IOException, DatabaseException {

        LoggerUtils.envLogMsg(Level.INFO, DbInternal.getNonNullEnvImpl(env),
                              "DbLoad.load of " + dbName + " starting");

        if (progressInterval > 0) {
            System.out.println("Load start: " + new Date());
        }

        if (textFileMode) {
            formatUsingPrintable = true;
        } else {
            loadHeader();
        }

        if (dbName == null) {
            throw new IllegalArgumentException
                ("Must supply a database name if -l not supplied.");
        }

        DatabaseConfig dbConfig = new DatabaseConfig();
        dbConfig.setSortedDuplicates(dupSort);
        dbConfig.setAllowCreate(true);
        Database db;
        try {
            db = env.openDatabase(null, dbName, dbConfig);
        } catch (DatabaseNotFoundException e) {
            /* Should never happen, AllowCreate is true. */
            throw EnvironmentFailureException.unexpectedException(e);
        } catch (DatabaseExistsException e) {
            /* Should never happen, ExclusiveCreate is false. */
            throw EnvironmentFailureException.unexpectedException(e);
        }

        loadData(db);

        db.close();

        LoggerUtils.envLogMsg(Level.INFO, DbInternal.getNonNullEnvImpl(env),
                              "DbLoad.load of " + dbName + " ending.");

        if (progressInterval > 0) {
            System.out.println("Load end: " + new Date());
        }

        return true;
    }

    private void loadConfigLine(String line) {
        int equalsIdx = line.indexOf('=');
        if (equalsIdx < 0) {
            throw new IllegalArgumentException
                ("Invalid header parameter: " + line);
        }

        String keyword = line.substring(0, equalsIdx).trim().toLowerCase();
        String value = line.substring(equalsIdx + 1).trim();

        if (keyword.equals("version")) {
            if (DEBUG) {
                System.out.println("Found version: " + line);
            }
            if (!value.equals("3")) {
                throw new IllegalArgumentException
                    ("Version " + value + " is not supported.");
            }
        } else if (keyword.equals("format")) {
            value = value.toLowerCase();
            if (value.equals("print")) {
                formatUsingPrintable = true;
            } else if (value.equals("bytevalue")) {
                formatUsingPrintable = false;
            } else {
                throw new IllegalArgumentException
                    (value + " is an unknown value for the format keyword");
            }
            if (DEBUG) {
                System.out.println("Found format: " + formatUsingPrintable);
            }
        } else if (keyword.equals("dupsort")) {
            value = value.toLowerCase();
            if (value.equals("true") ||
                value.equals("1")) {
                dupSort = true;
            } else if (value.equals("false") ||
                       value.equals("0")) {
                dupSort = false;
            } else {
                throw new IllegalArgumentException
                    (value + " is an unknown value for the dupsort keyword");
            }
            if (DEBUG) {
                System.out.println("Found dupsort: " + dupSort);
            }
        } else if (keyword.equals("type")) {
            value = value.toLowerCase();
            if (!value.equals("btree")) {
                throw new IllegalArgumentException
                    (value + " is not a supported database type.");
            }
            if (DEBUG) {
                System.out.println("Found type: " + line);
            }
        } else if (keyword.equals("database")) {
            if (dbName == null) {
                dbName = value;
            }
            if (DEBUG) {
                System.out.println("DatabaseImpl: " + dbName);
            }
        } else if (!ignoreUnknownConfig) {
            throw new IllegalArgumentException
                ("'" + line + "' is not understood.");
        }
    }

    private void loadHeader()
        throws IOException {

        if (DEBUG) {
            System.out.println("loading header");
        }
        String line = reader.readLine();
        while (line != null &&
               !line.equals("HEADER=END")) {
            loadConfigLine(line);
            line = reader.readLine();
        }
    }

    private void loadData(Database db)
        throws DatabaseException, IOException {

        String keyLine = reader.readLine();
        String dataLine = null;
        int count = 0;
        long totalBytesRead = 0;
        long lastTime = System.currentTimeMillis();
        long bytesReadThisInterval = 0;

        while (keyLine != null &&
               !keyLine.equals("DATA=END")) {
            dataLine = reader.readLine();
            if (dataLine == null) {
                throw new IllegalArgumentException("No data to match key " +
                                                   keyLine);
            }
            /* Add one for \n or \r. */
            bytesReadThisInterval += dataLine.length() + 1;
            byte[] keyBytes = loadLine(keyLine.trim());
            byte[] dataBytes = loadLine(dataLine.trim());

            DatabaseEntry key = new DatabaseEntry(keyBytes);
            DatabaseEntry data = new DatabaseEntry(dataBytes);

            if (noOverwrite) {
                if (db.putNoOverwrite(null, key, data) ==
                    OperationStatus.KEYEXIST) {
                    /* Calling println is OK only from command line. */
                    if (commandLine) {
                        System.err.println("Key exists: " + key);
                    }
                }
            } else {
                db.put(null, key, data);
            }

            count++;
            if ((progressInterval > 0) &&
                (bytesReadThisInterval > progressInterval)) {
                totalBytesRead += bytesReadThisInterval;
                bytesReadThisInterval -= progressInterval;
                long now = System.currentTimeMillis();
                System.out.println("loaded " + count + " records  " +
                                   (now - lastTime) + " ms - % completed: " +
                                   ((100 * totalBytesRead) / totalLoadBytes));
                lastTime = now;
            }

            keyLine = reader.readLine();
            if (keyLine == null) {
                throw new IllegalArgumentException("No \"DATA=END\"");
            }
            bytesReadThisInterval += keyLine.length() + 1;
        }
    }

    private byte[] loadLine(String line)
        throws DatabaseException {

        if (formatUsingPrintable) {
            return readPrintableLine(line);
        }
        int nBytes = line.length() / 2;
        byte[] ret = new byte[nBytes];
        int charIdx = 0;
        for (int i = 0; i < nBytes; i++, charIdx += 2) {
            int b2 = Character.digit(line.charAt(charIdx), 16);
            b2 <<= 4;
            b2 += Character.digit(line.charAt(charIdx + 1), 16);
            ret[i] = (byte) b2;
        }
        return ret;
    }

    private static byte backSlashValue =
        ((byte) ('\\')) & 0xff;

    private byte[] readPrintableLine(String line)
        throws DatabaseException {

        /* nBytes is the max number of bytes that this line could turn into. */
        int maxNBytes = line.length();
        byte[] ba = new byte[maxNBytes];
        int actualNBytes = 0;

        for (int charIdx = 0; charIdx < maxNBytes; charIdx++) {
            char c = line.charAt(charIdx);
            if (c == '\\') {
                if (++charIdx < maxNBytes) {
                    char c1 = line.charAt(charIdx);
                    if (c1 == '\\') {
                        ba[actualNBytes++] = backSlashValue;
                    } else {
                        if (++charIdx < maxNBytes) {
                            char c2 = line.charAt(charIdx);
                            int b = Character.digit(c1, 16);
                            b <<= 4;
                            b += Character.digit(c2, 16);
                            ba[actualNBytes++] = (byte) b;
                        } else {
                            throw 
                                new IllegalArgumentException("Corrupted file");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Corrupted file");
                }
            } else {
                ba[actualNBytes++] = (byte) (c & 0xff);
            }
        }

        if (maxNBytes == actualNBytes) {
            return ba;
        } else {
            byte[] ret = new byte[actualNBytes];
            System.arraycopy(ba, 0, ret, 0, actualNBytes);
            return ret;
        }
    }
}
