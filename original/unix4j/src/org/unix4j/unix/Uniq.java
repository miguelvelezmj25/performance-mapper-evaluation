package org.unix4j.unix;

import org.unix4j.command.CommandInterface;
import org.unix4j.unix.uniq.UniqFactory;
import org.unix4j.unix.uniq.UniqOption;
import org.unix4j.unix.uniq.UniqOptionSets;
import org.unix4j.unix.uniq.UniqOptions;

/**
 * Non-instantiable module with inner types making up the <b>uniq</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * uniq - report or filter out repeated lines in a usually pre-sorted file
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code uniq}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code uniq <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code uniq <file>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code uniq <path>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code uniq [-cdug]}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code uniq [-cdug] <file>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code uniq [-cdug] <path>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>	Reads from the standard input or from a specified input file and compares	adjacent lines, writing one copy  of each input line on the output. The	second and succeeding copies of repeated adjacent input lines are not 	written to the output. </p> <p>	Note that repeated non-adjacent lines in the input are only detected	with the --global or -g option. In other words, unique output lines	are guaranteed only if either (a) the --global or -g option is	specified, or (b) the input lines are sorted. </p>
 * <p>
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --count}</td><td>&nbsp;</td><td>Precedes each output line with a count of the number of times the
 * line occurred in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --duplicatedOnly}</td><td>&nbsp;</td><td>Suppresses the writing of lines that are not repeated in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -u}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --uniqueOnly}</td><td>&nbsp;</td><td>Suppresses the writing of lines that are repeated in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Suppresses repeated lines globally, that is, if lines are
 * non-adjacent. This option guarantees unique output lines even if the
 * input lines are not sorted.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <file>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File}</td><td>&nbsp;</td><td>The files or directories used as starting point for the listing;
 * relative paths are not resolved (use the string path argument to
 * enable relative path resolving based on the current working
 * directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <path>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>The files or directories used as starting point for the listing;
 * wildcards * and ? are supported; relative paths are resolved on the
 * basis of the current working directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command.
 * Options can be specified by acronym (with a leading dash "-") or by
 * long name (with two leading dashes "--"). Operands other than the
 * default "--path" operand have to be prefixed with the operand
 * name.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code UniqOptions}</td><td>&nbsp;</td><td>The options defining the uniqueness details for the output lines.</td></tr>
 * </table>
 */
public final class Uniq {
    /**
     * The "uniq" command name.
     */
    public static final String NAME = "uniq";
    /**
     * Options for the "uniq" command: {@link UniqOption#count c}, {@link UniqOption#duplicatedOnly d}, {@link UniqOption#uniqueOnly u}, {@link UniqOption#global g}.
     * <p>
     * <table>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --count}</td><td>&nbsp;</td><td>Precedes each output line with a count of the number of times the
     * line occurred in the input.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --duplicatedOnly}</td><td>&nbsp;</td><td>Suppresses the writing of lines that are not repeated in the input.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -u}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --uniqueOnly}</td><td>&nbsp;</td><td>Suppresses the writing of lines that are repeated in the input.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Suppresses repeated lines globally, that is, if lines are
     * non-adjacent. This option guarantees unique output lines even if the
     * input lines are not sorted.</td></tr>
     * </table>
     */
    public static final UniqOptionSets Options = UniqOptionSets.INSTANCE;
    /**
     * Singleton {@link UniqFactory factory} instance for the "uniq" command.
     */
    public static final UniqFactory Factory = UniqFactory.INSTANCE;

    // no instances
    private Uniq() {
        super();
    }

    /**
     * Interface defining all method signatures for the "uniq" command.
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
         * Reads from the standard input and compares adjacent lines, writing
         * one copy  of each input line to the standard output. The second and
         * succeeding copies of repeated adjacent input lines are not written
         * to the output.
         * <p>
         * Note that repeated lines in the input are not detected if they are
         * not adjacent (see --global or -g option); sorted input lines always
         * result in unique output lines.
         *
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R uniq();

        /**
         * Reads the file specified by the {@code "--path"} operand (the
         * default operand) and writes only unique lines to the standard
         * output. The second and succeeding copies of repeated input lines are
         * not written to the output.
         * <p>
         * Options can be specified by acronym (with a leading dash "-") or by
         * long name (with two leading dashes "--"). Operands other than the
         * default "--path" operand have to be prefixed with the operand name.
         * <p>
         * Note that repeated lines in the input are not detected if they are
         * not adjacent unless the --global is specified (sorted input lines
         * always result in unique output lines).
         *
         * @param args String arguments defining the options and operands for the command.
         *             Options can be specified by acronym (with a leading dash "-") or by
         *             long name (with two leading dashes "--"). Operands other than the
         *             default "--path" operand have to be prefixed with the operand
         *             name.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R uniq(String... args);

        /**
         * Reads from the specified input {@code file} and compares adjacent
         * lines, writing one copy of each input line to the standard output.
         * The second and succeeding copies of repeated adjacent input lines
         * are not written to the output.
         * <p>
         * Note that repeated lines in the input are not detected if they are
         * not adjacent (see --global or -g option); sorted input lines always
         * result in unique output lines.
         *
         * @param file The files or directories used as starting point for the listing;
         *             relative paths are not resolved (use the string path argument to
         *             enable relative path resolving based on the current working
         *             directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R uniq(java.io.File file);

        /**
         * Reads the file specified by its {@code path} and compares adjacent
         * lines, writing one copy of each input line to the standard output.
         * The second and succeeding copies of repeated adjacent input lines
         * are not written to the output.
         * <p>
         * Note that repeated lines in the input are not detected if they are
         * not adjacent (see --global or -g option); sorted input lines always
         * result in unique output lines.
         *
         * @param path The files or directories used as starting point for the listing;
         *             wildcards * and ? are supported; relative paths are resolved on the
         *             basis of the current working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R uniq(String path);

        /**
         * Reads from the standard input and compares adjacent lines, writing
         * one copy  of each input line to the standard output. The second and
         * succeeding copies of repeated adjacent input lines are not written
         * to the output.
         * <p>
         * Note that repeated non-adjacent lines in the input are only detected
         * with the --global or -g option. In other words, unique output lines
         * are guaranteed only if either (a) the --global or -g option is
         * specified, or (b) the input lines are sorted.
         *
         * @param options The options defining the uniqueness details for the output lines.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R uniq(UniqOptions options);

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
         *
         * @param options The options defining the uniqueness details for the output lines.
         * @param file    The files or directories used as starting point for the listing;
         *                relative paths are not resolved (use the string path argument to
         *                enable relative path resolving based on the current working
         *                directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R uniq(UniqOptions options, java.io.File file);

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
         *
         * @param options The options defining the uniqueness details for the output lines.
         * @param path    The files or directories used as starting point for the listing;
         *                wildcards * and ? are supported; relative paths are resolved on the
         *                basis of the current working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R uniq(UniqOptions options, String path);
    }
}
