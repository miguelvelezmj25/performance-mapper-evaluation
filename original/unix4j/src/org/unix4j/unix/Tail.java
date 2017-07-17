package org.unix4j.unix;

import org.unix4j.command.CommandInterface;
import org.unix4j.unix.tail.TailFactory;
import org.unix4j.unix.tail.TailOption;
import org.unix4j.unix.tail.TailOptionSets;
import org.unix4j.unix.tail.TailOptions;

/**
 * Non-instantiable module with inner types making up the <b>tail</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * tail - display the last part of a file
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail <count>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail [-cqs] <count>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail <count> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail <count> <paths>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail [-cqs] <count> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code tail [-cqs] <count> <paths>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>	This filter displays the first <i>count</i> lines or characters of each of	the specified files, or of the standard input if no files are specified. If 	<i>count</i> is omitted it defaults to 10. Both line and character counts 	start from 1. </p> <p>    If more than a single file is specified, each file is preceded by a header    consisting of the string {@code "==> XXX <=="} where {@code "XXX"} is the	name of the file. </p>
 * <p>
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The {@code count} argument is in units of characters instead of
 * lines. Starts from 1 and includes line ending characters.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -q}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --suppressHeaders}</td><td>&nbsp;</td><td>Suppresses printing of headers when multiple files are being
 * examined.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --countFromStart}</td><td>&nbsp;</td><td>The {@code count} argument is relative to the beginning of the file
 * instead of counting from the end of the file. For instance,
 * {@code tail -s 10} prints the lines starting from line 10;
 * {@code tail -s 1} prints the whole file.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <count>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code long}</td><td>&nbsp;</td><td>The last {@code count} lines of each input file are
 * copied to standard output, starting from 1 (characters instead of
 * lines if the {@code -c} option is specified, and offset from start
 * instead of end with {@code -s} option). Must be a non-negative
 * integer or an exception is thrown. If {@code count} is greater than
 * the number number of lines (characters) in the input, the
 * application will not error and send the whole file to the output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <paths>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>Pathnames of the input files to be filtered; wildcards * and ? are
 * supported; relative paths are resolved on the basis of the current
 * working directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <files>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File...}</td><td>&nbsp;</td><td>The input files to be filtered; relative paths are not resolved (use
 * the string paths argument to enable relative path resolving based on
 * the current working directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command.
 * Options can be specified by acronym (with a leading dash "-") or by
 * long name (with two leading dashes "--"). Operands other than the
 * default "--paths" operand have to be prefixed with the operand
 * name (e.g. "--count" for a subsequent count operand value).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code TailOptions}</td><td>&nbsp;</td><td>Options for the tail command.</td></tr>
 * </table>
 */
public final class Tail {
    /**
     * The "tail" command name.
     */
    public static final String NAME = "tail";
    /**
     * Options for the "tail" command: {@link TailOption#chars c}, {@link TailOption#suppressHeaders q}, {@link TailOption#countFromStart s}.
     * <p>
     * <table>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -q}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --suppressHeaders}</td><td>&nbsp;</td><td>Suppresses printing of headers when multiple files are being
     * examined.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --countFromStart}</td><td>&nbsp;</td><td>The {@code count} argument is relative to the beginning of the file
     * instead of counting from the end of the file. For instance,
     * {@code tail -s 10} prints the lines starting from line 10;
     * {@code tail -s 1} prints the whole file.</td></tr>
     * </table>
     */
    public static final TailOptionSets Options = TailOptionSets.INSTANCE;
    /**
     * Singleton {@link TailFactory factory} instance for the "tail" command.
     */
    public static final TailFactory Factory = TailFactory.INSTANCE;

    // no instances
    private Tail() {
        super();
    }

    /**
     * Interface defining all method signatures for the "tail" command.
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
         * Reads the last 10 lines from the standard input and writes them to
         * the standard output.
         *
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R tail();

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
        R tail(String... args);

        /**
         * Reads the last {@code count} lines from the standard input and
         * writes them to the standard output.
         *
         * @param count The last {@code count} lines of each input file are
         *              copied to standard output, starting from 1 (characters instead of
         *              lines if the {@code -c} option is specified, and offset from start
         *              instead of end with {@code -s} option). Must be a non-negative
         *              integer or an exception is thrown. If {@code count} is greater than
         *              the number number of lines (characters) in the input, the
         *              application will not error and send the whole file to the output.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R tail(long count);

        /**
         * Reads the last {@code count} lines or characters from the standard
         * input and writes them to the standard output.
         *
         * @param options Options for the tail command.
         * @param count   The last {@code count} lines of each input file are
         *                copied to standard output, starting from 1 (characters instead of
         *                lines if the {@code -c} option is specified, and offset from start
         *                instead of end with {@code -s} option). Must be a non-negative
         *                integer or an exception is thrown. If {@code count} is greater than
         *                the number number of lines (characters) in the input, the
         *                application will not error and send the whole file to the output.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R tail(TailOptions options, long count);

        /**
         * Reads the last 10 lines from each of the specified files and writes
         * them to the standard output. If more than a single file is
         * specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
         *
         * @param files The input files to be filtered; relative paths are not resolved (use
         *              the string paths argument to enable relative path resolving based on
         *              the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R tail(java.io.File... files);

        /**
         * Reads the last {@code count} lines from each of the specified files
         * and writes them to the standard output. If more than a single file
         * is specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R tail(long count, java.io.File... files);

        /**
         * Reads the last {@code count} lines from each of the specified files
         * and writes them to the standard output. If more than a single file
         * is specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R tail(long count, String... paths);

        /**
         * Reads the last {@code count} lines or characters from each of the
         * specified files and writes them to the standard output. If more than
         * a single file is specified and the {@code -q} option is not
         * specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R tail(TailOptions options, long count, java.io.File... files);

        /**
         * Reads the last {@code count} lines or characters from each of the
         * specified files and writes them to the standard output. If more than
         * a single file is specified and the {@code -q} option is not
         * specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R tail(TailOptions options, long count, String... paths);
    }
}
