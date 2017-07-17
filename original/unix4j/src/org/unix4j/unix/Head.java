package org.unix4j.unix;

import org.unix4j.command.CommandInterface;
import org.unix4j.unix.head.HeadFactory;
import org.unix4j.unix.head.HeadOption;
import org.unix4j.unix.head.HeadOptionSets;
import org.unix4j.unix.head.HeadOptions;

/**
 * Non-instantiable module with inner types making up the <b>head</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * head - display first lines of a file
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head <count>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head [-cq] <count>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head <count> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head <count> <paths>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head [-cq] <count> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code head [-cq] <count> <paths>}</td></tr>
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
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <count>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code long}</td><td>&nbsp;</td><td>The first {@code count} lines of each input file are
 * copied to standard output, starting from 1 (characters instead of
 * lines if the {@code -c} option is specified). Must be a non-negative
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
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code HeadOptions}</td><td>&nbsp;</td><td>Options for the head command.</td></tr>
 * </table>
 */
public final class Head {
    /**
     * The "head" command name.
     */
    public static final String NAME = "head";
    /**
     * Options for the "head" command: {@link HeadOption#chars c}, {@link HeadOption#suppressHeaders q}.
     * <p>
     * <table>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -q}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --suppressHeaders}</td><td>&nbsp;</td><td>Suppresses printing of headers when multiple files are being
     * examined.</td></tr>
     * </table>
     */
    public static final HeadOptionSets Options = HeadOptionSets.INSTANCE;
    /**
     * Singleton {@link HeadFactory factory} instance for the "head" command.
     */
    public static final HeadFactory Factory = HeadFactory.INSTANCE;

    // no instances
    private Head() {
        super();
    }

    /**
     * Interface defining all method signatures for the "head" command.
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
         * Reads the first 10 lines from the standard input and writes them to
         * the standard output.
         *
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R head();

        /**
         * Reads the first n lines from each of the files specified and writes
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
        R head(String... args);

        /**
         * Reads the first {@code count} lines from the standard input and
         * writes them to the standard output.
         *
         * @param count The first {@code count} lines of each input file are
         *              copied to standard output, starting from 1 (characters instead of
         *              lines if the {@code -c} option is specified). Must be a non-negative
         *              integer or an exception is thrown. If {@code count} is greater than
         *              the number number of lines (characters) in the input, the
         *              application will not error and send the whole file to the output.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R head(long count);

        /**
         * Reads the first {@code count} lines or characters from the standard
         * input and writes them to the standard output.
         *
         * @param options Options for the head command.
         * @param count   The first {@code count} lines of each input file are
         *                copied to standard output, starting from 1 (characters instead of
         *                lines if the {@code -c} option is specified). Must be a non-negative
         *                integer or an exception is thrown. If {@code count} is greater than
         *                the number number of lines (characters) in the input, the
         *                application will not error and send the whole file to the output.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R head(HeadOptions options, long count);

        /**
         * Reads the first 10 lines from each of the specified files and writes
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
        R head(java.io.File... files);

        /**
         * Reads the first {@code count} lines from each of the specified files
         * and writes them to the standard output. If more than a single file
         * is specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R head(long count, java.io.File... files);

        /**
         * Reads the first {@code count} lines from each of the specified files
         * and writes them to the standard output. If more than a single file
         * is specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R head(long count, String... paths);

        /**
         * Reads the first {@code count} lines or characters from each of the
         * specified files and writes them to the standard output. If more than
         * a single file is specified and the {@code -q} option is not
         * specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R head(HeadOptions options, long count, java.io.File... files);

        /**
         * Reads the first {@code count} lines or characters from each of the
         * specified files and writes them to the standard output. If more than
         * a single file is specified and the {@code -q} option is not
         * specified, each file is preceded by a header consisting of the
         * string {@code "==> XXX <=="} where {@code "XXX"} is the name
         * of the file.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R head(HeadOptions options, long count, String... paths);
    }
}
