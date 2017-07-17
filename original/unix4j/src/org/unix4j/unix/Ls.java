package org.unix4j.unix;

import org.unix4j.command.CommandInterface;
import org.unix4j.unix.ls.LsFactory;
import org.unix4j.unix.ls.LsOption;
import org.unix4j.unix.ls.LsOptionSets;
import org.unix4j.unix.ls.LsOptions;

/**
 * Non-instantiable module with inner types making up the <b>ls</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * ls - list directory contents
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code ls}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code ls <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code ls <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code ls [-ahlRrt]}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code ls [-ahlRrt] <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code ls [-ahlRrt] <paths>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p> For each operand that names a file of a type other than directory or symbolic link to a directory, <code>ls</code> writes the name of the file as well as any requested, associated information. For each operand that names a file of type directory, <code>ls</code> writes the names of files contained within the directory as well as any requested, associated information. If the <b>-l</b> option is specified, for each operand that names a file of type symbolic link to a directory, <code>ls</code> writes the name of the file as well as any requested, associated information. If the <b>-l</b> option is not specified, for each operand that names a file of type symbolic link to a directory, <code>ls</code> writes the names of files contained within the directory as well as any requested, associated information. </p> <p> If no operands are specified, <code>ls</code> writes the contents of the current directory. If more than one operand is specified, <code>ls</code> writes non-directory operands first; it sorts directory and non-directory operands separately according to the name of the file or directory. </p> <p> TODO The <code>ls</code> utility detects infinite loops; that is, entering a previously visited directory that is an ancestor of the last file encountered. When it detects an infinite loop, <code>ls</code> aborts the recursion. </p>
 * <p>
 * <p>
 * <b>NOTES</b>
 * <p>
 * <ul>
 * <li>Infinite loop detection is currently NOT implemented.</li>
 * </ul>
 * <p>
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --allFiles}</td><td>&nbsp;</td><td>Lists all files in the given directory, including hidden files
 * (those whose names start with \".\" in Unix). By default, these
 * files are excluded from the list.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -h}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --humanReadable}</td><td>&nbsp;</td><td>Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --longFormat}</td><td>&nbsp;</td><td>Long format, displaying file types, permissions, number of hard
 * links, owner, group, size, date, and filename.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -R}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --recurseSubdirs}</td><td>&nbsp;</td><td>Recursively lists subdirectories encountered.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --reverseOrder}</td><td>&nbsp;</td><td>Reverses the order of the sort to get reverse collating sequence or
 * oldest first.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeSorted}</td><td>&nbsp;</td><td>Sorts with the primary key being time modified (most recently
 * modified first) and the secondary key being filename in the
 * collating sequence.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <files>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File...}</td><td>&nbsp;</td><td>The files or directories used as starting point for the listing;
 * relative paths are not resolved (use the string path argument to
 * enable relative path resolving based on the current working
 * directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <paths>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>The files or directories used as starting point for the listing;
 * wildcards * and ? are supported; relative paths are resolved on the
 * basis of the current working directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command.
 * Options can be specified by acronym (with a leading dash "-") or by
 * long name (with two leading dashes "--"). Operands other than the
 * default "--paths" operand have to be prefixed with the operand
 * name (e.g. "--count" for a subsequent count operand value).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code LsOptions}</td><td>&nbsp;</td><td>The options defining the output format.</td></tr>
 * </table>
 */
public final class Ls {
    /**
     * The "ls" command name.
     */
    public static final String NAME = "ls";
    /**
     * Options for the "ls" command: {@link LsOption#allFiles a}, {@link LsOption#humanReadable h}, {@link LsOption#longFormat l}, {@link LsOption#recurseSubdirs R}, {@link LsOption#reverseOrder r}, {@link LsOption#timeSorted t}.
     * <p>
     * <table>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --allFiles}</td><td>&nbsp;</td><td>Lists all files in the given directory, including hidden files
     * (those whose names start with \".\" in Unix). By default, these
     * files are excluded from the list.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -h}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --humanReadable}</td><td>&nbsp;</td><td>Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --longFormat}</td><td>&nbsp;</td><td>Long format, displaying file types, permissions, number of hard
     * links, owner, group, size, date, and filename.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -R}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --recurseSubdirs}</td><td>&nbsp;</td><td>Recursively lists subdirectories encountered.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --reverseOrder}</td><td>&nbsp;</td><td>Reverses the order of the sort to get reverse collating sequence or
     * oldest first.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeSorted}</td><td>&nbsp;</td><td>Sorts with the primary key being time modified (most recently
     * modified first) and the secondary key being filename in the
     * collating sequence.</td></tr>
     * </table>
     */
    public static final LsOptionSets Options = LsOptionSets.INSTANCE;
    /**
     * Singleton {@link LsFactory factory} instance for the "ls" command.
     */
    public static final LsFactory Factory = LsFactory.INSTANCE;

    // no instances
    private Ls() {
        super();
    }

    /**
     * Interface defining all method signatures for the "ls" command.
     *
     * @param <R> the generic return type for all command signature methods
     *            to support different implementor types; the methods of a
     *            command factory for instance returns a command instance;
     *            command builders can also implement this interface, but their
     *            methods return the builder itself enabling for chained method
     *            invocation to create joined commands
     */
    public static interface Interface<R> extends CommandInterface<R> {
        /**
         * Lists all files and directories in the user's current working
         * directory and writes them to the output.
         *
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R ls();

        /**
         * Prints the name of the specified files and lists all files contained
         * in directories for every directory in those files.
         * <p>
         * Options can be specified by acronym (with a leading dash "-") or by
         * long name (with two leading dashes "--"). Operands other than the
         * default "--paths" operand have to be prefixed with the operand
         * name.
         *
         * @param args String arguments defining the options and operands for the command.
         *             Options can be specified by acronym (with a leading dash "-") or by
         *             long name (with two leading dashes "--"). Operands other than the
         *             default "--paths" operand have to be prefixed with the operand
         *             name (e.g. "--count" for a subsequent count operand value).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R ls(String... args);

        /**
         * Prints the name of the given files and lists all files contained in
         * directories for every directory in {@code files}.
         *
         * @param files The files or directories used as starting point for the listing;
         *              relative paths are not resolved (use the string path argument to
         *              enable relative path resolving based on the current working
         *              directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R ls(java.io.File... files);

        /**
         * Lists all files and directories in the user's current working
         * directory and writes them to the output using the given options
         * specifying the details of the output format.
         *
         * @param options The options defining the output format.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R ls(LsOptions options);

        /**
         * Prints the name of the given files and lists all files contained in
         * directories for every directory in {@code files}. The given options
         * define the details of the output format.
         *
         * @param options The options defining the output format.
         * @param files   The files or directories used as starting point for the listing;
         *                relative paths are not resolved (use the string path argument to
         *                enable relative path resolving based on the current working
         *                directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R ls(LsOptions options, java.io.File... files);

        /**
         * Prints the name of the given files and lists all files contained in
         * directories for every directory in {@code files}. The given options
         * define the details of the output format.
         *
         * @param options The options defining the output format.
         * @param paths   The files or directories used as starting point for the listing;
         *                wildcards * and ? are supported; relative paths are resolved on the
         *                basis of the current working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R ls(LsOptions options, String... paths);
    }
}
