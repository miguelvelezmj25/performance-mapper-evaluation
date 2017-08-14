package org.unix4j;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import org.unix4j.builder.DefaultUnix4jCommandBuilder;
import org.unix4j.builder.Unix4jCommandBuilder;
import org.unix4j.command.NoOp;
import org.unix4j.context.ExecutionContextFactory;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.unix.cat.CatOptions;
import org.unix4j.unix.echo.EchoOptions;
import org.unix4j.unix.find.FindOption;
import org.unix4j.unix.find.FindOptions;
import org.unix4j.unix.grep.GrepOptions;
import org.unix4j.unix.head.HeadOptions;
import org.unix4j.unix.ls.LsOptions;
import org.unix4j.unix.sed.SedOptions;
import org.unix4j.unix.sort.SortOptions;
import org.unix4j.unix.tail.TailOptions;
import org.unix4j.unix.uniq.UniqOptions;
import org.unix4j.unix.wc.WcOptions;

/**
 * Utility class with static methods serving as starting point to create a
 * command or build a command chain joining several commands.
 * <p>
 * Every method returns a new builder instance. For more information and a
 * detailed description of command building and chaining, see
 * {@link Unix4jCommandBuilder}.
 */
public final class Unix4j {

    // no instances
    private Unix4j() {
        super();
    }

    /**
     * Returns a builder to create a command or command chain. The builder is
     * initialized with a {@link NoOp} command which will be replaced by the
     * first command joined to this builder's command chain.
     *
     * @return the builder to create the command or command chain
     */
    public static Unix4jCommandBuilder builder() {
        return new DefaultUnix4jCommandBuilder();
    }

    /**
     * Returns a builder that uses the specified factory to create contexts for
     * command execution. The builder is initialized with a {@link NoOp} command
     * which will be replaced by the first command joined to this builder's
     * command chain.
     *
     * @param contextFactory the factory used to create execution contexts that are passed
     *                       to the execute method when a command is executed
     * @return the builder to create the command or command chain
     */
    public static Unix4jCommandBuilder use(ExecutionContextFactory contextFactory) {
        return new DefaultUnix4jCommandBuilder(contextFactory);
    }

    /**
     * Reads the lines from files specified as arguments and writes them to
     * the standard output. Options can be specified by acronym (with a
     * leading dash "-") or by long name (with two leading dashes "--").
     * File arguments are expanded if wildcards are used. All file
     * arguments are processed in command-argument order.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param args String arguments defining the options and file operands for the
     *             command. Options can be specified by acronym (with a leading dash
     *             "-") or by long name (with two leading dashes "--"). File arguments
     *             are expanded if wildcards are used.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder cat(String... args) {
        return builder().cat(args);
    }

    /**
     * Reads the lines from the specified files and writes them to the
     * standard output. The files are processed in command-argument order.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param files The input files to be printed; relative paths are not resolved (use
     *              the string path argument to enable relative path resolving based on
     *              the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder cat(java.io.File... files) {
        return builder().cat(files);
    }

    /**
     * Reads the lines from the specified files and writes them to the
     * standard output; the given options define the details of the output
     * format. The files are processed in command-argument order.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the cat command.
     * @param files   The input files to be printed; relative paths are not resolved (use
     *                the string path argument to enable relative path resolving based on
     *                the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder cat(CatOptions options, java.io.File... files) {
        return builder().cat(options, files);
    }

    /**
     * Reads the lines from the specified files and writes them to the
     * standard output; the given options define the details of the output
     * format. The path arguments are expanded if wildcards are used and
     * processed in command-argument order.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the cat command.
     * @param paths   Pathnames of the input files to be printed; wildcards * and ? are
     *                supported; relative paths are resolved on the basis of the current
     *                working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder cat(CatOptions options, String... paths) {
        return builder().cat(options, paths);
    }

    /**
     * Changes the current directory to the user home directory as defined
     * by the execution context (usually the directory specified by the
     * {@code "user.home"} system property).
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder cd() {
        return builder().cd();
    }

    /**
     * The current working directory is changed to the given file. If the
     * specified file argument does not represent a valid directory, an
     * exception is thrown. Note that relative paths are not resolved with
     * the (old) current working directory. Use the String path to enable
     * relative path resolving and wildcards.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param file the file to use as input; relative paths are not resolved (use the
     *             string path argument to enable relative path resolving based on the
     *             current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder cd(java.io.File file) {
        return builder().cd(file);
    }

    /**
     * The current working directory is changed to the given file. Relative
     * paths are resolved on the basis of the (old) current working
     * directory. Wildcards are possible if the first matching file
     * represents a directory. If the first file specified by the given
     * path argument is not a valid directory, an exception is thrown.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param path the directory to become the new current working directory;
     *             wildcards * and ? are supported; relative paths are resolved on the
     *             basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder cd(String path) {
        return builder().cd(path);
    }

    /**
     * Writes any of the specified strings, separated by single blank
     * ({@code ' '}) characters to the standard output suppressing the
     * trailing line ending if the {@code "-n"} option is specified.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param args String arguments defining the options for the command and the
     *             strings to be written to the output. Options can be specified by
     *             acronym (with a leading dash "-") or by long name (with two leading
     *             dashes "--").
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder echo(String... args) {
        return builder().echo(args);
    }

    /**
     * Writes the specified string followed by a newline character to
     * the standard output suppressing the trailing line ending if the
     * {@code -n} option is specified.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the echo command.
     * @param string  A string to be written to standard output.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder echo(EchoOptions options, String string) {
        return builder().echo(options, string);
    }

    /**
     * Writes any of the specified strings, separated by single blank
     * ({@code ' '}) characters to the standard output suppressing the
     * trailing line ending if the {@code -n} option is specified.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the echo command.
     * @param strings Strings to be written to standard output, separated by single blank
     *                characters.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder echo(EchoOptions options, String... strings) {
        return builder().echo(options, strings);
    }

    /**
     * Finds all files matching the search criteria specified by the given
     * arguments and writes the file names to the standard output.
     * <p>
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--name" operand have to be prefixed with the operand name.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory (or -- if provided -- relative to the path
     * given after the {@code "--path"} operand name).
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param args String arguments defining the options and operands for the command.
     *             Options can be specified by acronym (with a leading dash "-") or by
     *             long name (with two leading dashes "--"). Operands other than the
     *             default "--path" operand have to be prefixed with the operand name
     *             (e.g. "--name" for subsequent path operand values).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(String... args) {
        return builder().find(args);
    }

    /**
     * Finds all files in or below the directory specified by {@code path}
     * and writes the file names to the standard output.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param path Starting point for the search in the directory hierarchy;
     *             wildcards * and ? are supported; relative paths are resolved on the
     *             basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(String path) {
        return builder().find(path);
    }

    /**
     * Finds all files matching the specified {@code name} in or below the
     * directory specified by {@code path} and writes the file names to
     * the standard output.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param path Starting point for the search in the directory hierarchy;
     *             wildcards * and ? are supported; relative paths are resolved on the
     *             basis of the current working directory.
     * @param name Name pattern to match the file name after removing the path with the
     *             leading directories; wildcards * and ? are supported, or full
     *             regular expressions if either of the options {@code -regex (-r)} or
     *             {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(String path, String name) {
        return builder().find(path, name);
    }

    /**
     * Finds all files matching the specified file {@code size} in or below
     * the user's current working directory and writes the file names to
     * the standard output. Matching files use at least {@code size} bytes
     * on disk if {@code size} is positive, or at most {@code abs(size)}
     * bytes if {@code size} is zero or negative.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param size Consider only files using at least {@code size} bytes if {@code size}
     *             is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *             or negative.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(long size) {
        return builder().find(size);
    }

    /**
     * Finds all files matching the specified file {@code size} in or below
     * the directory specified by {@code path} and writes the file names
     * to the standard output. Matching files use at least {@code size}
     * bytes on disk if {@code size} is positive, or at most
     * {@code abs(size)} bytes if {@code size} is zero or negative.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param path Starting point for the search in the directory hierarchy;
     *             wildcards * and ? are supported; relative paths are resolved on the
     *             basis of the current working directory.
     * @param size Consider only files using at least {@code size} bytes if {@code size}
     *             is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *             or negative.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(String path, long size) {
        return builder().find(path, size);
    }

    /**
     * Finds all files matching the specified file {@code name} and
     * {@code size} in or below the user's current working directory and
     * writes the file names to the standard output. Matching files use
     * at least {@code size} bytes on disk if {@code size} is positive,
     * or at most {@code abs(size)} bytes if {@code size} is zero or
     * negative.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param size Consider only files using at least {@code size} bytes if {@code size}
     *             is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *             or negative.
     * @param name Name pattern to match the file name after removing the path with the
     *             leading directories; wildcards * and ? are supported, or full
     *             regular expressions if either of the options {@code -regex (-r)} or
     *             {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(long size, String name) {
        return builder().find(size, name);
    }

    /**
     * Finds all files matching the specified file {@code name} and
     * {@code size} in or below the directory specified by {@code path}
     * and writes the file names to the standard output. Matching files
     * use at least {@code size} bytes on disk if {@code size} is positive,
     * or at most {@code abs(size)} bytes if {@code size} is zero or
     * negative.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param path Starting point for the search in the directory hierarchy;
     *             wildcards * and ? are supported; relative paths are resolved on the
     *             basis of the current working directory.
     * @param size Consider only files using at least {@code size} bytes if {@code size}
     *             is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *             or negative.
     * @param name Name pattern to match the file name after removing the path with the
     *             leading directories; wildcards * and ? are supported, or full
     *             regular expressions if either of the options {@code -regex (-r)} or
     *             {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(String path, long size, String name) {
        return builder().find(path, size, name);
    }

    /**
     * Finds all files matching the specified {@code name} in or below the
     * user's current working directory and writes the file names to the
     * standard output.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param name    Name pattern to match the file name after removing the path with the
     *                leading directories; wildcards * and ? are supported, or full
     *                regular expressions if either of the options {@code -regex (-r)} or
     *                {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, String name) {
        return builder().find(options, name);
    }

    /**
     * Finds all files matching the specified {@code name} in or below the
     * directory specified by {@code path} and writes the file names to
     * the standard output.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param path    Starting point for the search in the directory hierarchy;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @param name    Name pattern to match the file name after removing the path with the
     *                leading directories; wildcards * and ? are supported, or full
     *                regular expressions if either of the options {@code -regex (-r)} or
     *                {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, String path, String name) {
        return builder().find(options, path, name);
    }

    /**
     * Finds all files matching the specified file {@code size} in or below
     * the user's current working directory and writes the file names to
     * the standard output. Matching files use at least {@code size} bytes
     * on disk if {@code size} is positive, or at most {@code abs(size)}
     * bytes if {@code size} is zero or negative.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param size    Consider only files using at least {@code size} bytes if {@code size}
     *                is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *                or negative.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, long size) {
        return builder().find(options, size);
    }

    /**
     * Finds all files matching the specified file {@code size} in or below
     * the directory specified by {@code path} and writes the file names
     * to the standard output. Matching files use at least {@code size}
     * bytes on disk if {@code size} is positive, or at most
     * {@code abs(size)} bytes if {@code size} is zero or negative.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param path    Starting point for the search in the directory hierarchy;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @param size    Consider only files using at least {@code size} bytes if {@code size}
     *                is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *                or negative.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, String path, long size) {
        return builder().find(options, path, size);
    }

    /**
     * Finds all files that have been created, modified or accessed before
     * or after the specified {@code time} (depending on the given
     * {@code -time...} options). The names of the matching files found in
     * or below the user's current working directory are written to the
     * standard output.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param time    Consider only files that have been created, modified or accessed
     *                before or after the specified {@code time} operand; consider the
     *                {@code -time...} options for details of the comparison.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, java.util.Date time) {
        return builder().find(options, time);
    }

    /**
     * Finds all files that have been created, modified or accessed before
     * or after the specified {@code time} (depending on the given
     * {@code -time...} options). The names of the matching files found in
     * or below the directory specified by {@code path} are written to
     * the standard output.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param path    Starting point for the search in the directory hierarchy;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @param time    Consider only files that have been created, modified or accessed
     *                before or after the specified {@code time} operand; consider the
     *                {@code -time...} options for details of the comparison.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, String path, java.util.Date time) {
        return builder().find(options, path, time);
    }

    /**
     * Finds all files matching the specified file {@code name} and
     * {@code size} in or below the user's current working directory and
     * writes the file names to the standard output. Matching files use
     * at least {@code size} bytes on disk if {@code size} is positive, or
     * at most {@code abs(size)} bytes if {@code size} is zero or negative.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param size    Consider only files using at least {@code size} bytes if {@code size}
     *                is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *                or negative.
     * @param name    Name pattern to match the file name after removing the path with the
     *                leading directories; wildcards * and ? are supported, or full
     *                regular expressions if either of the options {@code -regex (-r)} or
     *                {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, long size, String name) {
        return builder().find(options, size, name);
    }

    /**
     * Finds all files matching the specified file {@code name} and
     * {@code size} in or below the directory specified by {@code path}
     * and writes the file names to the standard output. Matching files
     * use at least {@code size} bytes on disk if {@code size} is positive,
     * or at most {@code abs(size)} bytes if {@code size} is zero or
     * negative.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param path    Starting point for the search in the directory hierarchy;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @param size    Consider only files using at least {@code size} bytes if {@code size}
     *                is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *                or negative.
     * @param name    Name pattern to match the file name after removing the path with the
     *                leading directories; wildcards * and ? are supported, or full
     *                regular expressions if either of the options {@code -regex (-r)} or
     *                {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, String path, long size, String name) {
        return builder().find(options, path, size, name);
    }

    /**
     * Finds all files matching the given {@code name} that have been
     * created, modified or accessed before or after the specified
     * {@code time} (depending on the given {@code -time...} options). The
     * names of the matching files found in or below the user's current
     * working directory are written to the standard output.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param time    Consider only files that have been created, modified or accessed
     *                before or after the specified {@code time} operand; consider the
     *                {@code -time...} options for details of the comparison.
     * @param name    Name pattern to match the file name after removing the path with the
     *                leading directories; wildcards * and ? are supported, or full
     *                regular expressions if either of the options {@code -regex (-r)} or
     *                {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, java.util.Date time, String name) {
        return builder().find(options, time, name);
    }

    /**
     * Finds all files matching the given {@code name} that have been
     * created, modified or accessed before or after the specified
     * {@code time} (depending on the given {@code -time...} options). The
     * names of the matching files found in or below the directory
     * specified by {@code path} are written to the standard output.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param path    Starting point for the search in the directory hierarchy;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @param time    Consider only files that have been created, modified or accessed
     *                before or after the specified {@code time} operand; consider the
     *                {@code -time...} options for details of the comparison.
     * @param name    Name pattern to match the file name after removing the path with the
     *                leading directories; wildcards * and ? are supported, or full
     *                regular expressions if either of the options {@code -regex (-r)} or
     *                {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, String path, java.util.Date time, String name) {
        DefaultOptionSet s = (DefaultOptionSet) options;
        if(Sink.getDecision(s == null)) {
            System.out.println(";");
        }
        if(Sink.getDecision(options == null)) {
            System.out.println(";");
        }
        if(Sink.getDecision(options.isSet(FindOption.ignoreCase))) {
            System.out.println(";");
        }
        return builder().find(options, path, time, name);
    }

    /**
     * Finds all files matching the given {@code name} and {@code size} and
     * have been created, modified or accessed before or after the specified
     * {@code time} (depending on the given {@code -time...} options).
     * <p>
     * Matching files use at least {@code size} bytes on disk if
     * {@code size} is positive, or at most {@code abs(size)} bytes if
     * {@code size} is zero or negative. The names of the matching files
     * found in or below the user's current working directory are written
     * to the standard output.
     * <p>
     * The files names written to the output are relative paths referring
     * to the working directory.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param size    Consider only files using at least {@code size} bytes if {@code size}
     *                is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *                or negative.
     * @param time    Consider only files that have been created, modified or accessed
     *                before or after the specified {@code time} operand; consider the
     *                {@code -time...} options for details of the comparison.
     * @param name    Name pattern to match the file name after removing the path with the
     *                leading directories; wildcards * and ? are supported, or full
     *                regular expressions if either of the options {@code -regex (-r)} or
     *                {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, long size, java.util.Date time, String name) {
        return builder().find(options, size, time, name);
    }

    /**
     * Finds all files matching the given {@code name} and {@code size} and
     * have been created, modified or accessed before or after the specified
     * {@code time} (depending on the given {@code -time...} options).
     * <p>
     * Matching files use at least {@code size} bytes on disk if
     * {@code size} is positive, or at most {@code abs(size)} bytes if
     * {@code size} is zero or negative. The names of the matching files
     * found in or below the directory specified by {@code path} are
     * written to the standard output.
     * <p>
     * The files names written to the output are paths relative to the
     * specified {@code path} operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the file search.
     * @param path    Starting point for the search in the directory hierarchy;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @param size    Consider only files using at least {@code size} bytes if {@code size}
     *                is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     *                or negative.
     * @param time    Consider only files that have been created, modified or accessed
     *                before or after the specified {@code time} operand; consider the
     *                {@code -time...} options for details of the comparison.
     * @param name    Name pattern to match the file name after removing the path with the
     *                leading directories; wildcards * and ? are supported, or full
     *                regular expressions if either of the options {@code -regex (-r)} or
     *                {@code -iregex (-i)} is specified.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder find(FindOptions options, String path, long size, java.util.Date time, String name) {
        return builder().find(options, path, size, time, name);
    }

    /**
     * Uses the given string as input for the next command. If the string
     * contains line ending codes (UNIX or DOS independent from the host
     * operating system), the string is split into multiple lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param string the string to use as input
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder fromString(String string) {
        return builder().fromString(string);
    }

    /**
     * Uses the given strings as input for the next command. Each string
     * usually represents a single line of the input; however, if any of
     * the strings contains line ending codes (UNIX or DOS independent from
     * the host operating system), it is split into multiple lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param strings the input lines
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder fromStrings(String... strings) {
        return builder().fromStrings(strings);
    }

    /**
     * Uses the strings in the specified {@code input} collection as input
     * lines for the next command. Each string usually represents a single
     * line of the input; however, if any of the strings contains line
     * ending codes (UNIX or DOS independent from the host operating
     * system), it is split into multiple lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param lines collection with input lines
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder from(java.util.Collection<? extends String> lines) {
        return builder().from(lines);
    }

    /**
     * Redirects the contents of the given file into the next command. This
     * is essentially equivalent to the following syntax in a unix command
     * shell: {@code path > ...}
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param path the file to use as input; wildcards * and ? are supported; relative
     *             paths are resolved on the basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder fromFile(String path) {
        return builder().fromFile(path);
    }

    /**
     * Redirects the contents of the given file into the next command. This
     * is essentially equivalent to the following syntax in a unix command
     * shell: {@code file > ...}
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param file the file to use as input; relative paths are not resolved (use the
     *             string path argument to enable relative path resolving based on the
     *             current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder fromFile(java.io.File file) {
        return builder().fromFile(file);
    }

    /**
     * Reads from the given resource relative to the classpath and
     * redirects the contents into the next command. The resource is
     * usually a file or URL on the classpath. The resource is read using
     * {@link Class#getResourceAsStream(String)}.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param resource a path to the file to redirect to the next command. The will need
     *                 to be on the classpath. If the file is in the root directory, the
     *                 filename should be prefixed with a forward slash. e.g.:
     *                 {@code "/test-file.txt"}
     *                 <p>
     *                 If the file is in a package, then the package should be specified
     *                 prefixed with a forward slash, and with each dot "." replaced with a
     *                 forward slash. e.g.:
     *                 {@code "/org/company/mypackage/test-file.txt"}
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder fromResource(String resource) {
        return builder().fromResource(resource);
    }

    /**
     * Reads from the given input stream and redirects the contents into
     * the next command.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param stream the input stream to read from
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder from(java.io.InputStream stream) {
        return builder().from(stream);
    }

    /**
     * Uses the given reader and redirects the read input into the next
     * command.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param reader the reader used to read the input
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder from(java.io.Reader reader) {
        return builder().from(reader);
    }

    /**
     * Reads from the given URL and redirects the contents into the next
     * command.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param url the URL to read from
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder from(java.net.URL url) {
        return builder().from(url);
    }

    /**
     * Reads from the given input object and redirects the contents into
     * the next command.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param input the input object to read from
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder from(org.unix4j.io.Input input) {
        return builder().from(input);
    }

    /**
     * Filters the lines from the specified input files and writes the
     * matching lines to the standard output. Every line is matched against
     * the given {@code regexp} string using case-sensitive comparison.
     * Line endings are not relevant for the comparison.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param regexp Lines will be printed which match the given regular expression. The
     *               {@code regexp} string is surrounded with ".*" on both sides unless
     *               the {@code --wholeLine} option is specified. If the
     *               {@code --fixedStrings} option is used, plain string comparison is
     *               used instead of regular expression matching.
     * @param files  The input files to be searched for the pattern; relative paths are
     *               not resolved (use the string paths argument to enable relative path
     *               resolving based on the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder grep(String regexp, java.io.File... files) {
        return builder().grep(regexp, files);
    }

    /**
     * Filters the lines from the specified input files and writes the
     * matching lines to the standard output. Every line is matched against
     * the given regular expression {@code pattern} using case-sensitive
     * comparison. Line endings are not relevant for the comparison.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param pattern Lines will be printed which match the given pattern.
     * @param files   The input files to be searched for the pattern; relative paths are
     *                not resolved (use the string paths argument to enable relative path
     *                resolving based on the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder grep(java.util.regex.Pattern pattern, java.io.File... files) {
        return builder().grep(pattern, files);
    }

    /**
     * Filters the lines from the specified input files and writes the
     * matching lines to the standard output. Every line is matched against
     * the given regular expression {@code pattern} using case-sensitive
     * comparison. Line endings are not relevant for the comparison.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param pattern Lines will be printed which match the given pattern.
     * @param paths   Pathnames of the input files to be searched for the pattern;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder grep(java.util.regex.Pattern pattern, String... paths) {
        return builder().grep(pattern, paths);
    }

    /**
     * Filters the input lines from the specified input files and writes
     * the matching lines to the standard output. Every line is matched
     * against the given {@code regexp} string; the exact comparison rules
     * are defined by the specified matching {@code options}.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the types of patterns and command behavior.
     * @param regexp  Lines will be printed which match the given regular expression. The
     *                {@code regexp} string is surrounded with ".*" on both sides unless
     *                the {@code --wholeLine} option is specified. If the
     *                {@code --fixedStrings} option is used, plain string comparison is
     *                used instead of regular expression matching.
     * @param files   The input files to be searched for the pattern; relative paths are
     *                not resolved (use the string paths argument to enable relative path
     *                resolving based on the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder grep(GrepOptions options, String regexp, java.io.File... files) {
        return builder().grep(options, regexp, files);
    }

    /**
     * Filters the input lines from the specified input files and writes
     * the matching lines to the standard output. Every line is matched
     * against the given {@code regexp} string; the exact comparison rules
     * are defined by the specified matching {@code options}.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the types of patterns and command behavior.
     * @param regexp  Lines will be printed which match the given regular expression. The
     *                {@code regexp} string is surrounded with ".*" on both sides unless
     *                the {@code --wholeLine} option is specified. If the
     *                {@code --fixedStrings} option is used, plain string comparison is
     *                used instead of regular expression matching.
     * @param paths   Pathnames of the input files to be searched for the pattern;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder grep(GrepOptions options, String regexp, String... paths) {
        return builder().grep(options, regexp, paths);
    }

    /**
     * Filters the input lines from the specified input files and writes
     * the matching lines to the standard output. Every line is matched
     * against the given regular expression {@code pattern}; the exact
     * comparison rules are defined by the specified matching
     * {@code options}.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the types of patterns and command behavior.
     * @param pattern Lines will be printed which match the given pattern.
     * @param files   The input files to be searched for the pattern; relative paths are
     *                not resolved (use the string paths argument to enable relative path
     *                resolving based on the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder grep(GrepOptions options, java.util.regex.Pattern pattern, java.io.File... files) {
        return builder().grep(options, pattern, files);
    }

    /**
     * Filters the input lines from the specified input files and writes
     * the matching lines to the standard output. Every line is matched
     * against the given regular expression {@code pattern}; the exact
     * comparison rules are defined by the specified matching
     * {@code options}.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the types of patterns and command behavior.
     * @param pattern Lines will be printed which match the given pattern.
     * @param paths   Pathnames of the input files to be searched for the pattern;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder grep(GrepOptions options, java.util.regex.Pattern pattern, String... paths) {
        return builder().grep(options, pattern, paths);
    }

    /**
     * Reads the first 10 lines from each of the specified files and writes
     * them to the standard output. If more than a single file is
     * specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param files The input files to be filtered; relative paths are not resolved (use
     *              the string paths argument to enable relative path resolving based on
     *              the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder head(java.io.File... files) {
        return builder().head(files);
    }

    /**
     * Reads the first {@code count} lines from each of the specified files
     * and writes them to the standard output. If more than a single file
     * is specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param count The first {@code count} lines of each input file are
     *              copied to standard output, starting from 1 (characters instead of
     *              lines if the {@code -c} option is specified). Must be a non-negative
     *              integer or an exception is thrown. If {@code count} is greater than
     *              the number number of lines (characters) in the input, the
     *              application will not error and send the whole file to the output.
     * @param files The input files to be filtered; relative paths are not resolved (use
     *              the string paths argument to enable relative path resolving based on
     *              the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder head(long count, java.io.File... files) {
        return builder().head(count, files);
    }

    /**
     * Reads the first {@code count} lines from each of the specified files
     * and writes them to the standard output. If more than a single file
     * is specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param count The first {@code count} lines of each input file are
     *              copied to standard output, starting from 1 (characters instead of
     *              lines if the {@code -c} option is specified). Must be a non-negative
     *              integer or an exception is thrown. If {@code count} is greater than
     *              the number number of lines (characters) in the input, the
     *              application will not error and send the whole file to the output.
     * @param paths Pathnames of the input files to be filtered; wildcards * and ? are
     *              supported; relative paths are resolved on the basis of the current
     *              working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder head(long count, String... paths) {
        return builder().head(count, paths);
    }

    /**
     * Reads the first {@code count} lines or characters from each of the
     * specified files and writes them to the standard output. If more than
     * a single file is specified and the {@code -q} option is not
     * specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the head command.
     * @param count   The first {@code count} lines of each input file are
     *                copied to standard output, starting from 1 (characters instead of
     *                lines if the {@code -c} option is specified). Must be a non-negative
     *                integer or an exception is thrown. If {@code count} is greater than
     *                the number number of lines (characters) in the input, the
     *                application will not error and send the whole file to the output.
     * @param files   The input files to be filtered; relative paths are not resolved (use
     *                the string paths argument to enable relative path resolving based on
     *                the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder head(HeadOptions options, long count, java.io.File... files) {
        return builder().head(options, count, files);
    }

    /**
     * Reads the first {@code count} lines or characters from each of the
     * specified files and writes them to the standard output. If more than
     * a single file is specified and the {@code -q} option is not
     * specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the head command.
     * @param count   The first {@code count} lines of each input file are
     *                copied to standard output, starting from 1 (characters instead of
     *                lines if the {@code -c} option is specified). Must be a non-negative
     *                integer or an exception is thrown. If {@code count} is greater than
     *                the number number of lines (characters) in the input, the
     *                application will not error and send the whole file to the output.
     * @param paths   Pathnames of the input files to be filtered; wildcards * and ? are
     *                supported; relative paths are resolved on the basis of the current
     *                working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder head(HeadOptions options, long count, String... paths) {
        return builder().head(options, count, paths);
    }

    /**
     * Lists all files and directories in the user's current working
     * directory and writes them to the output.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder ls() {
        return builder().ls();
    }

    /**
     * Prints the name of the specified files and lists all files contained
     * in directories for every directory in those files.
     * <p>
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--paths" operand have to be prefixed with the operand
     * name.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param args String arguments defining the options and operands for the command.
     *             Options can be specified by acronym (with a leading dash "-") or by
     *             long name (with two leading dashes "--"). Operands other than the
     *             default "--paths" operand have to be prefixed with the operand
     *             name (e.g. "--count" for a subsequent count operand value).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder ls(String... args) {
        return builder().ls(args);
    }

    /**
     * Prints the name of the given files and lists all files contained in
     * directories for every directory in {@code files}.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param files The files or directories used as starting point for the listing;
     *              relative paths are not resolved (use the string path argument to
     *              enable relative path resolving based on the current working
     *              directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder ls(java.io.File... files) {
        return builder().ls(files);
    }

    /**
     * Lists all files and directories in the user's current working
     * directory and writes them to the output using the given options
     * specifying the details of the output format.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the output format.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder ls(LsOptions options) {
        return builder().ls(options);
    }

    /**
     * Prints the name of the given files and lists all files contained in
     * directories for every directory in {@code files}. The given options
     * define the details of the output format.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the output format.
     * @param files   The files or directories used as starting point for the listing;
     *                relative paths are not resolved (use the string path argument to
     *                enable relative path resolving based on the current working
     *                directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder ls(LsOptions options, java.io.File... files) {
        return builder().ls(options, files);
    }

    /**
     * Prints the name of the given files and lists all files contained in
     * directories for every directory in {@code files}. The given options
     * define the details of the output format.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the output format.
     * @param paths   The files or directories used as starting point for the listing;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder ls(LsOptions options, String... paths) {
        return builder().ls(options, paths);
    }

    /**
     * Executes the sed script specified by the given arguments and writes
     * the result to the standard output.
     * <p>
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--script" operand have to be prefixed with the operand name.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param args String arguments defining the options and operands for the command.
     *             Options can be specified by acronym (with a leading dash "-") or by
     *             long name (with two leading dashes "--"). Operands other than the
     *             default "--script" operand have to be prefixed with the operand name
     *             (e.g. "--occurrence" for subsequent occurrence indices).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sed(String... args) {
        return builder().sed(args);
    }

    /**
     * Executes the given sed script, such as "s/original/replacement/g".
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param script Sed script as one string, such as "s/original/replacement/g".
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sed(String script) {
        return builder().sed(script);
    }

    /**
     * Substitutes the replacement string for instances of the regexp in
     * the matched line.
     * <p>
     * An ampersand ('&') appearing in the replacement is be replaced
     * by the line matching the regexp. The characters "\n", where n is a
     * digit, are replaced by the text matched by the corresponding
     * backreference expression.  The special meaning of '&' and "\n"
     * in this context can be suppressed by preceding it by a backslash.
     * <p>
     * A line can be split by substituting a newline ('\n') into it.
     * <p>
     * A substitution is considered to have been performed even if the
     * replacement string is identical to the string that it replaces.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param regexp      Regular expression matched against a line.
     * @param replacement Replacement string for substitute command. An ampersand ('&')
     *                    appearing in the replacement string is replaced by the string
     *                    matching the regular expression. The characters "\n", where n is a
     *                    digit, are replaced by the text matched by the corresponding
     *                    backreference expression. The special meaning of '&' and "\n" in
     *                    this context can be suppressed by preceding it by a backslash.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sed(String regexp, String replacement) {
        return builder().sed(regexp, replacement);
    }

    /**
     * Substitutes the replacement string for instances of the regexp in
     * the matched line. Only the given occurrences of the regexp found
     * within the matched string are substituted.
     * <p>
     * An ampersand ('&') appearing in the replacement is be replaced
     * by the line matching the regexp. The characters "\n", where n is a
     * digit, are replaced by the text matched by the corresponding
     * backreference expression.  The special meaning of '&' and "\n"
     * in this context can be suppressed by preceding it by a backslash.
     * <p>
     * A line can be split by substituting a newline ('\n') into it.
     * <p>
     * A substitution is considered to have been performed even if the
     * replacement string is identical to the string that it replaces.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param regexp      Regular expression matched against a line.
     * @param replacement Replacement string for substitute command. An ampersand ('&')
     *                    appearing in the replacement string is replaced by the string
     *                    matching the regular expression. The characters "\n", where n is a
     *                    digit, are replaced by the text matched by the corresponding
     *                    backreference expression. The special meaning of '&' and "\n" in
     *                    this context can be suppressed by preceding it by a backslash.
     * @param occurrence  Substitute for the given occurrences only of the regexp found within
     *                    the matched string; the occurrence indices are one-based. If empty
     *                    or omitted, all occurrences are substituted.
     *                    <p>
     *                    (This operand only applies to the substitute command and is ignored
     *                    by all other commands).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sed(String regexp, String replacement, int... occurrence) {
        return builder().sed(regexp, replacement, occurrence);
    }

    /**
     * Executes the sed command specified by the given options or executes
     * the print command p if no command option has been declared.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Sed options and commands
     * @param regexp  Regular expression matched against a line.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sed(SedOptions options, String regexp) {
        return builder().sed(options, regexp);
    }

    /**
     * Executes the sed command specified by the given options or executes
     * the substitute command s if no command option has been declared.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Sed options and commands
     * @param string1 Regular expression matched against a line for all commands except
     *                for command y where string1 contains the source characters for the
     *                translation.
     * @param string2 Replacement string for substitute command s; appended, inserted or
     *                changed text for a, i and c command; destination characters for
     *                translate command y; ignored by all other commands.
     *                <p>
     *                If string2 is a replacement string for the substitute command: an
     *                ampersand ('&') appearing in the replacement string is replaced
     *                by the string matching the regular expression; the characters "\n",
     *                where n is a digit, are replaced by the text matched by the
     *                corresponding backreference expression. The special meaning of
     *                '&' and "\n" in this context can be suppressed by preceding it
     *                by a backslash.
     *                <p>
     *                (This operand only applies to the commands s, a, i, c and y and is
     *                ignored by all other commands).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sed(SedOptions options, String string1, String string2) {
        return builder().sed(options, string1, string2);
    }

    /**
     * Executes the sed command specified by the given options or executes
     * the substitute command s if no command option has been declared.
     * <p>
     * The string1 operand usually contains the regular expression matched
     * against a line for all commands except for command y where string1
     * contains the source characters for the translation.
     * <p>
     * The string2 operand contains the replacement string for the
     * substitute command s. It contains the appended, inserted or changed
     * text for the commands a, i and c, respectively, and the destination
     * characters for the translate command y. All other commands ignore
     * the string2 operand.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options    Sed options and commands
     * @param string1    Regular expression matched against a line for all commands except
     *                   for command y where string1 contains the source characters for the
     *                   translation.
     * @param string2    Replacement string for substitute command s; appended, inserted or
     *                   changed text for a, i and c command; destination characters for
     *                   translate command y; ignored by all other commands.
     *                   <p>
     *                   If string2 is a replacement string for the substitute command: an
     *                   ampersand ('&') appearing in the replacement string is replaced
     *                   by the string matching the regular expression; the characters "\n",
     *                   where n is a digit, are replaced by the text matched by the
     *                   corresponding backreference expression. The special meaning of
     *                   '&' and "\n" in this context can be suppressed by preceding it
     *                   by a backslash.
     *                   <p>
     *                   (This operand only applies to the commands s, a, i, c and y and is
     *                   ignored by all other commands).
     * @param occurrence Substitute for the given occurrences only of the regexp found within
     *                   the matched string; the occurrence indices are one-based. If empty
     *                   or omitted, all occurrences are substituted.
     *                   <p>
     *                   (This operand only applies to the substitute command and is ignored
     *                   by all other commands).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sed(SedOptions options, String string1, String string2, int... occurrence) {
        return builder().sed(options, string1, string2, occurrence);
    }

    /**
     * Sort the lines of all the specified files together and writes the
     * result to the standard output.
     * <p>
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--paths" operand have to be prefixed with the operand
     * name.
     * <p>
     * The sort algorithm used is guaranteed to be stable: lines considered
     * equal will not be reordered as a result of the sort. If two lines
     * originate from different input files, the index of the file in the
     * input arguments list defines the ordering of the lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param args String arguments defining the options and operands for the command.
     *             Options can be specified by acronym (with a leading dash "-") or by
     *             long name (with two leading dashes "--"). Operands other than the
     *             default "--paths" operand have to be prefixed with the operand
     *             name (e.g. "--comparator" for a subsequent comparator operand value).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sort(String... args) {
        return builder().sort(args);
    }

    /**
     * Sort the lines of all the specified files together and writes the
     * result to the standard output.
     * <p>
     * Comparisons are based on the entire line without line ending. The
     * collating sequence of the current locale is used to perform the
     * comparisons.
     * <p>
     * The sort algorithm used is guaranteed to be stable: lines considered
     * equal will not be reordered as a result of the sort. If two lines
     * originate from different input files, the index of the file in the
     * input arguments list defines the ordering of the lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param files The files to be sorted or merged; relative paths are not resolved
     *              (use the string paths argument to enable relative path resolving
     *              based on the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sort(java.io.File... files) {
        return builder().sort(files);
    }

    /**
     * Sort the lines of all the specified files together and writes the
     * result to the standard output.
     * <p>
     * Line comparisons are based on the specified {@code comparator}.
     * <p>
     * The sort algorithm used is guaranteed to be stable: lines considered
     * equal will not be reordered as a result of the sort. If two lines
     * originate from different input files, the index of the file in the
     * input arguments list defines the ordering of the lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param comparator The comparator to use for the line comparisons.
     * @param files      The files to be sorted or merged; relative paths are not resolved
     *                   (use the string paths argument to enable relative path resolving
     *                   based on the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sort(java.util.Comparator<? super org.unix4j.line.Line> comparator, java.io.File... files) {
        return builder().sort(comparator, files);
    }

    /**
     * Sort the lines of all the specified files together and writes the
     * result to the standard output.
     * <p>
     * Line comparisons are based on the specified {@code comparator}.
     * <p>
     * The sort algorithm used is guaranteed to be stable: lines considered
     * equal will not be reordered as a result of the sort. If two lines
     * originate from different input files, the index of the file in the
     * input arguments list defines the ordering of the lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param comparator The comparator to use for the line comparisons.
     * @param paths      Pathnames of the files to be sorted, merged, or checked; wildcards *
     *                   and ? are supported; relative paths are resolved on the
     *                   basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sort(java.util.Comparator<? super org.unix4j.line.Line> comparator, String... paths) {
        return builder().sort(comparator, paths);
    }

    /**
     * Sorts, merges, or sequence checks the lines the lines of all the
     * specified files together and writes the result to the standard
     * output.
     * <p>
     * Comparisons are based on the entire line without line ending. The
     * collating sequence of the current locale is used to perform the
     * comparisons.
     * <p>
     * The sort algorithm used is guaranteed to be stable: lines considered
     * equal will not be reordered as a result of the sort. If two lines
     * originate from different input files, the index of the file in the
     * input arguments list defines the ordering of the lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options for the sort command.
     * @param files   The files to be sorted or merged; relative paths are not resolved
     *                (use the string paths argument to enable relative path resolving
     *                based on the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sort(SortOptions options, java.io.File... files) {
        return builder().sort(options, files);
    }

    /**
     * Sorts, merges, or sequence checks the lines the lines of all the
     * specified files together and writes the result to the standard
     * output.
     * <p>
     * Comparisons are based on the entire line without line ending. The
     * collating sequence of the current locale is used to perform the
     * comparisons.
     * <p>
     * The sort algorithm used is guaranteed to be stable: lines considered
     * equal will not be reordered as a result of the sort. If two lines
     * originate from different input files, the index of the file in the
     * input arguments list defines the ordering of the lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options for the sort command.
     * @param paths   Pathnames of the files to be sorted, merged, or checked; wildcards *
     *                and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sort(SortOptions options, String... paths) {
        return builder().sort(options, paths);
    }

    /**
     * Sorts, merges, or sequence checks the lines the lines of all the
     * specified files together and writes the result to the standard
     * output.
     * <p>
     * Line comparisons are based on the specified {@code comparator}.
     * All comparison related options except for {@code --reverse} are
     * ignored.
     * <p>
     * The sort algorithm used is guaranteed to be stable: lines considered
     * equal will not be reordered as a result of the sort. If two lines
     * originate from different input files, the index of the file in the
     * input arguments list defines the ordering of the lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options    The options for the sort command.
     * @param comparator The comparator to use for the line comparisons.
     * @param files      The files to be sorted or merged; relative paths are not resolved
     *                   (use the string paths argument to enable relative path resolving
     *                   based on the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator, java.io.File... files) {
        return builder().sort(options, comparator, files);
    }

    /**
     * Sorts, merges, or sequence checks the lines the lines of all the
     * specified files together and writes the result to the standard
     * output.
     * <p>
     * Line comparisons are based on the specified {@code comparator}.
     * All comparison related options except for {@code --reverse} are
     * ignored.
     * <p>
     * The sort algorithm used is guaranteed to be stable: lines considered
     * equal will not be reordered as a result of the sort. If two lines
     * originate from different input files, the index of the file in the
     * input arguments list defines the ordering of the lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options    The options for the sort command.
     * @param comparator The comparator to use for the line comparisons.
     * @param paths      Pathnames of the files to be sorted, merged, or checked; wildcards *
     *                   and ? are supported; relative paths are resolved on the
     *                   basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator, String... paths) {
        return builder().sort(options, comparator, paths);
    }

    /**
     * Reads the last n lines from each of the files specified and writes
     * them to the standard output. If more than a single file is
     * specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--paths" operand have to be prefixed with the operand
     * name.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param args String arguments defining the options and operands for the command.
     *             Options can be specified by acronym (with a leading dash "-") or by
     *             long name (with two leading dashes "--"). Operands other than the
     *             default "--paths" operand have to be prefixed with the operand
     *             name (e.g. "--count" for a subsequent count operand value).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder tail(String... args) {
        return builder().tail(args);
    }

    /**
     * Reads the last 10 lines from each of the specified files and writes
     * them to the standard output. If more than a single file is
     * specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param files The input files to be filtered; relative paths are not resolved (use
     *              the string paths argument to enable relative path resolving based on
     *              the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder tail(java.io.File... files) {
        return builder().tail(files);
    }

    /**
     * Reads the last {@code count} lines from each of the specified files
     * and writes them to the standard output. If more than a single file
     * is specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param count The last {@code count} lines of each input file are
     *              copied to standard output, starting from 1 (characters instead of
     *              lines if the {@code -c} option is specified, and offset from start
     *              instead of end with {@code -s} option). Must be a non-negative
     *              integer or an exception is thrown. If {@code count} is greater than
     *              the number number of lines (characters) in the input, the
     *              application will not error and send the whole file to the output.
     * @param files The input files to be filtered; relative paths are not resolved (use
     *              the string paths argument to enable relative path resolving based on
     *              the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder tail(long count, java.io.File... files) {
        return builder().tail(count, files);
    }

    /**
     * Reads the last {@code count} lines from each of the specified files
     * and writes them to the standard output. If more than a single file
     * is specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param count The last {@code count} lines of each input file are
     *              copied to standard output, starting from 1 (characters instead of
     *              lines if the {@code -c} option is specified, and offset from start
     *              instead of end with {@code -s} option). Must be a non-negative
     *              integer or an exception is thrown. If {@code count} is greater than
     *              the number number of lines (characters) in the input, the
     *              application will not error and send the whole file to the output.
     * @param paths Pathnames of the input files to be filtered; wildcards * and ? are
     *              supported; relative paths are resolved on the basis of the current
     *              working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder tail(long count, String... paths) {
        return builder().tail(count, paths);
    }

    /**
     * Reads the last {@code count} lines or characters from each of the
     * specified files and writes them to the standard output. If more than
     * a single file is specified and the {@code -q} option is not
     * specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the tail command.
     * @param count   The last {@code count} lines of each input file are
     *                copied to standard output, starting from 1 (characters instead of
     *                lines if the {@code -c} option is specified, and offset from start
     *                instead of end with {@code -s} option). Must be a non-negative
     *                integer or an exception is thrown. If {@code count} is greater than
     *                the number number of lines (characters) in the input, the
     *                application will not error and send the whole file to the output.
     * @param files   The input files to be filtered; relative paths are not resolved (use
     *                the string paths argument to enable relative path resolving based on
     *                the current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder tail(TailOptions options, long count, java.io.File... files) {
        return builder().tail(options, count, files);
    }

    /**
     * Reads the last {@code count} lines or characters from each of the
     * specified files and writes them to the standard output. If more than
     * a single file is specified and the {@code -q} option is not
     * specified, each file is preceded by a header consisting of the
     * string {@code "==> XXX <=="} where {@code "XXX"} is the name
     * of the file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options Options for the tail command.
     * @param count   The last {@code count} lines of each input file are
     *                copied to standard output, starting from 1 (characters instead of
     *                lines if the {@code -c} option is specified, and offset from start
     *                instead of end with {@code -s} option). Must be a non-negative
     *                integer or an exception is thrown. If {@code count} is greater than
     *                the number number of lines (characters) in the input, the
     *                application will not error and send the whole file to the output.
     * @param paths   Pathnames of the input files to be filtered; wildcards * and ? are
     *                supported; relative paths are resolved on the basis of the current
     *                working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder tail(TailOptions options, long count, String... paths) {
        return builder().tail(options, count, paths);
    }

    /**
     * Reads from the specified input {@code file} and compares adjacent
     * lines, writing one copy of each input line to the standard output.
     * The second and succeeding copies of repeated adjacent input lines
     * are not written to the output.
     * <p>
     * Note that repeated lines in the input are not detected if they are
     * not adjacent (see --global or -g option); sorted input lines always
     * result in unique output lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param file The files or directories used as starting point for the listing;
     *             relative paths are not resolved (use the string path argument to
     *             enable relative path resolving based on the current working
     *             directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder uniq(java.io.File file) {
        return builder().uniq(file);
    }

    /**
     * Reads the file specified by its {@code path} and compares adjacent
     * lines, writing one copy of each input line to the standard output.
     * The second and succeeding copies of repeated adjacent input lines
     * are not written to the output.
     * <p>
     * Note that repeated lines in the input are not detected if they are
     * not adjacent (see --global or -g option); sorted input lines always
     * result in unique output lines.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param path The files or directories used as starting point for the listing;
     *             wildcards * and ? are supported; relative paths are resolved on the
     *             basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder uniq(String path) {
        return builder().uniq(path);
    }

    /**
     * Reads from the specified input {@code file} and compares adjacent
     * lines, writing one copy of each input line to the standard output.
     * The second and succeeding copies of repeated adjacent input lines
     * are not written to the output.
     * <p>
     * Note that repeated non-adjacent lines in the input are only detected
     * with the --global or -g option. In other words, unique output lines
     * are guaranteed only if either (a) the --global or -g option is
     * specified, or (b) the input lines are sorted.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the uniqueness details for the output lines.
     * @param file    The files or directories used as starting point for the listing;
     *                relative paths are not resolved (use the string path argument to
     *                enable relative path resolving based on the current working
     *                directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder uniq(UniqOptions options, java.io.File file) {
        return builder().uniq(options, file);
    }

    /**
     * Reads the file specified by its {@code path} and compares adjacent
     * lines, writing one copy of each input line to the standard output.
     * The second and succeeding copies of repeated adjacent input lines
     * are not written to the output.
     * <p>
     * Note that repeated non-adjacent lines in the input are only detected
     * with the --global or -g option. In other words, unique output lines
     * are guaranteed only if either (a) the --global or -g option is
     * specified, or (b) the input lines are sorted.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining the uniqueness details for the output lines.
     * @param path    The files or directories used as starting point for the listing;
     *                wildcards * and ? are supported; relative paths are resolved on the
     *                basis of the current working directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder uniq(UniqOptions options, String path) {
        return builder().uniq(options, path);
    }

    /**
     * Executes a count of lines, words and chars contained in each input
     * file and writes them to the standard output. If more than one input
     * file is specified, a line of cumulative counts for all the files is
     * displayed on a separate line after the output for the last file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param files The input files; relative paths are not resolved (use the string
     *              paths argument to enable relative path resolving based on the
     *              current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder wc(java.io.File... files) {
        return builder().wc(files);
    }

    /**
     * Executes a one or more counts, depending on the given options, in
     * each of the given input files and writes them to the standard
     * output. If more than one input file is specified, a line of
     * cumulative counts for all the files is displayed on a separate line
     * after the output for the last file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining command behavior.
     * @param files   The input files; relative paths are not resolved (use the string
     *                paths argument to enable relative path resolving based on the
     *                current working directory).
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder wc(WcOptions options, java.io.File... files) {
        return builder().wc(options, files);
    }

    /**
     * Executes a one or more counts, depending on the given options, in
     * each of the given input files and writes them to the standard
     * output. If more than one input file is specified, a line of
     * cumulative counts for all the files is displayed on a separate line
     * after the output for the last file.
     * <p>
     * Note that the method returns the command builder to allow for command
     * chaining. The command itself is returned by the {@link Unix4jCommandBuilder#build() build()} method
     * of the returned builder (see {@link Unix4jCommandBuilder} for more information).
     *
     * @param options The options defining command behavior.
     * @param paths   Pathnames of the input files; wildcards * and ? are supported;
     *                relative paths are resolved on the basis of the current working
     *                directory.
     * @return the command builder to allow for method chaining. Method
     * chaining is used here to create command chains. Adding a command
     * to the chain usually means that the previous command <i>pipes</i>
     * its output to the added command (the pipe symbol in unix)
     */
    public static Unix4jCommandBuilder wc(WcOptions options, String[] paths) {
        return builder().wc(options, paths);
    }
}
