package org.unix4j.unix;

import org.unix4j.command.CommandInterface;
import org.unix4j.unix.cat.CatFactory;
import org.unix4j.unix.cat.CatOption;
import org.unix4j.unix.cat.CatOptionSets;
import org.unix4j.unix.cat.CatOptions;

/**
 * Non-instantiable module with inner types making up the <b>cat</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * cat - concatenate and print files
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cat}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cat <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cat <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cat [-bns]}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cat [-bns] <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cat [-bns] <paths>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>	The cat utility reads files sequentially, writing them to the standard 	output. The file operands are processed in command-argument order. If no 	file argument is specified, cat reads from the standard input. </p>
 * <p>
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -b}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberNonBlankLines}</td><td>&nbsp;</td><td>Number the non-blank output lines, starting at 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberLines}</td><td>&nbsp;</td><td>Number the output lines, starting at 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --squeezeEmptyLines}</td><td>&nbsp;</td><td>Squeeze multiple adjacent empty lines, causing the output to be
 * single spaced.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <files>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File...}</td><td>&nbsp;</td><td>The input files to be printed; relative paths are not resolved (use
 * the string path argument to enable relative path resolving based on
 * the current working directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <paths>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>Pathnames of the input files to be printed; wildcards * and ? are
 * supported; relative paths are resolved on the basis of the current
 * working directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and file operands for the
 * command. Options can be specified by acronym (with a leading dash
 * "-") or by long name (with two leading dashes "--"). File arguments
 * are expanded if wildcards are used.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code CatOptions}</td><td>&nbsp;</td><td>Options for the cat command.</td></tr>
 * </table>
 */
public final class Cat {
    /**
     * The "cat" command name.
     */
    public static final String NAME = "cat";
    /**
     * Options for the "cat" command: {@link CatOption#numberNonBlankLines b}, {@link CatOption#numberLines n}, {@link CatOption#squeezeEmptyLines s}.
     * <p>
     * <table>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -b}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberNonBlankLines}</td><td>&nbsp;</td><td>Number the non-blank output lines, starting at 1.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberLines}</td><td>&nbsp;</td><td>Number the output lines, starting at 1.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --squeezeEmptyLines}</td><td>&nbsp;</td><td>Squeeze multiple adjacent empty lines, causing the output to be
     * single spaced.</td></tr>
     * </table>
     */
    public static final CatOptionSets Options = CatOptionSets.INSTANCE;
    /**
     * Singleton {@link CatFactory factory} instance for the "cat" command.
     */
    public static final CatFactory Factory = CatFactory.INSTANCE;

    // no instances
    private Cat() {
        super();
    }

    /**
     * Interface defining all method signatures for the "cat" command.
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
         * Reads the lines from the standard input and writes them to the
         * standard output.
         *
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R cat();

        /**
         * Reads the lines from files specified as arguments and writes them to
         * the standard output. Options can be specified by acronym (with a
         * leading dash "-") or by long name (with two leading dashes "--").
         * File arguments are expanded if wildcards are used. All file
         * arguments are processed in command-argument order.
         *
         * @param args String arguments defining the options and file operands for the
         *             command. Options can be specified by acronym (with a leading dash
         *             "-") or by long name (with two leading dashes "--"). File arguments
         *             are expanded if wildcards are used.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R cat(String... args);

        /**
         * Reads the lines from the specified files and writes them to the
         * standard output. The files are processed in command-argument order.
         *
         * @param files The input files to be printed; relative paths are not resolved (use
         *              the string path argument to enable relative path resolving based on
         *              the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R cat(java.io.File... files);

        /**
         * Reads the lines from the standard input and writes them to the
         * standard output; the given options define the details of the output
         * format.
         *
         * @param options Options for the cat command.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R cat(CatOptions options);

        /**
         * Reads the lines from the specified files and writes them to the
         * standard output; the given options define the details of the output
         * format. The files are processed in command-argument order.
         *
         * @param options Options for the cat command.
         * @param files   The input files to be printed; relative paths are not resolved (use
         *                the string path argument to enable relative path resolving based on
         *                the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R cat(CatOptions options, java.io.File... files);

        /**
         * Reads the lines from the specified files and writes them to the
         * standard output; the given options define the details of the output
         * format. The path arguments are expanded if wildcards are used and
         * processed in command-argument order.
         *
         * @param options Options for the cat command.
         * @param paths   Pathnames of the input files to be printed; wildcards * and ? are
         *                supported; relative paths are resolved on the basis of the current
         *                working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R cat(CatOptions options, String... paths);
    }
}
