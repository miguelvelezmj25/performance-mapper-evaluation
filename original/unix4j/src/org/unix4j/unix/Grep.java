package org.unix4j.unix;

import org.unix4j.command.CommandInterface;
import org.unix4j.unix.grep.GrepFactory;
import org.unix4j.unix.grep.GrepOption;
import org.unix4j.unix.grep.GrepOptionSets;
import org.unix4j.unix.grep.GrepOptions;

/**
 * Non-instantiable module with inner types making up the <b>grep</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * grep - print lines matching a pattern
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep <regexp>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep <regexp> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep <pattern>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep <pattern> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep <pattern> <paths>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep [-ivFnclx] <regexp>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep [-ivFnclx] <pattern>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep [-ivFnclx] <regexp> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep [-ivFnclx] <regexp> <paths>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep [-ivFnclx] <pattern> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code grep [-ivFnclx] <pattern> <paths>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>	The grep utility searches the input, selecting lines matching a pattern; 	the types of patterns are controlled by the options specified.</p><p>	By default, an input line is selected if any pattern, treated as an entire	regular expression matches any part of the line excluding the terminating	newline character(s). By default, each selected input line is written to the	output.</p><p>	Regular expression matching is based on text lines. Since newline 	character(s) separate or terminate patterns, regular expressions cannot 	contain newline character(s). Similarly, since patterns are matched against	individual lines (excluding the terminating newline character(s)) of the 	input, there is no way for a pattern to match newline character(s) found in	the input.</p><p>	Regular expressions used in this command must be based on the 	{@link java.util.regex.Pattern Java regular expression syntax}.</p>
 * <p>
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Match lines ignoring the case when comparing the strings, also known
 * from Unix with its acronym 'i'.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -v}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --invertMatch}</td><td>&nbsp;</td><td>Invert the match result, that is, a non-matching line is written to
 * the output and a matching line is not. This option is also known
 * from Unix with its acronym 'v'.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -F}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fixedStrings}</td><td>&nbsp;</td><td>Use fixed-strings matching instead of regular expressions. This is
 * usually faster than the standard regexp version.
 * <p>
 * (This option is ignored if a {@code pattern} operand is specified
 * instead of the {@code regexp} string).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Prefix each line of output with the line number within its input
 * file.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --count}</td><td>&nbsp;</td><td>Suppress normal output; instead print a count of matching lines for
 * each input file. With the {@code -v}, {@code --invertMatch} option,
 * count non-matching lines.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --matchingFiles}</td><td>&nbsp;</td><td>Suppress normal output; instead print the name of each input file
 * from which output would normally have been printed. The scanning
 * will stop on the first match.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --wholeLine}</td><td>&nbsp;</td><td>Select only those matches that exactly match the whole line
 * excluding the terminating line ending.
 * <p>
 * (This option is ignored if a {@code pattern} operand is specified
 * instead of the {@code regexp} string).</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <regexp>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Lines will be printed which match the given regular expression. The
 * {@code regexp} string is surrounded with ".*" on both sides unless
 * the {@code --wholeLine} option is specified. If the
 * {@code --fixedStrings} option is used, plain string comparison is
 * used instead of regular expression matching.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <pattern>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.util.regex.Pattern}</td><td>&nbsp;</td><td>Lines will be printed which match the given pattern.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <paths>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>Pathnames of the input files to be searched for the pattern;
 * wildcards * and ? are supported; relative paths are resolved on the
 * basis of the current working directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <files>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File...}</td><td>&nbsp;</td><td>The input files to be searched for the pattern; relative paths are
 * not resolved (use the string paths argument to enable relative path
 * resolving based on the current working directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command.
 * Options can be specified by acronym (with a leading dash "-") or by
 * long name (with two leading dashes "--"). Operands other than the
 * default "--pattern" and "--paths" operands have to be prefixed with
 * the operand name (e.g. "--files" for subsequent file operand values).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code GrepOptions}</td><td>&nbsp;</td><td>The options defining the types of patterns and command behavior.</td></tr>
 * </table>
 */
public final class Grep {
    /**
     * The "grep" command name.
     */
    public static final String NAME = "grep";
    /**
     * Options for the "grep" command: {@link GrepOption#ignoreCase i}, {@link GrepOption#invertMatch v}, {@link GrepOption#fixedStrings F}, {@link GrepOption#lineNumber n}, {@link GrepOption#count c}, {@link GrepOption#matchingFiles l}, {@link GrepOption#wholeLine x}.
     * <p>
     * <table>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Match lines ignoring the case when comparing the strings, also known
     * from Unix with its acronym 'i'.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -v}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --invertMatch}</td><td>&nbsp;</td><td>Invert the match result, that is, a non-matching line is written to
     * the output and a matching line is not. This option is also known
     * from Unix with its acronym 'v'.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -F}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fixedStrings}</td><td>&nbsp;</td><td>Use fixed-strings matching instead of regular expressions. This is
     * usually faster than the standard regexp version.
     * <p>
     * (This option is ignored if a {@code pattern} operand is specified
     * instead of the {@code regexp} string).</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Prefix each line of output with the line number within its input
     * file.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --count}</td><td>&nbsp;</td><td>Suppress normal output; instead print a count of matching lines for
     * each input file. With the {@code -v}, {@code --invertMatch} option,
     * count non-matching lines.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --matchingFiles}</td><td>&nbsp;</td><td>Suppress normal output; instead print the name of each input file
     * from which output would normally have been printed. The scanning
     * will stop on the first match.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --wholeLine}</td><td>&nbsp;</td><td>Select only those matches that exactly match the whole line
     * excluding the terminating line ending.
     * <p>
     * (This option is ignored if a {@code pattern} operand is specified
     * instead of the {@code regexp} string).</td></tr>
     * </table>
     */
    public static final GrepOptionSets Options = GrepOptionSets.INSTANCE;
    /**
     * Singleton {@link GrepFactory factory} instance for the "grep" command.
     */
    public static final GrepFactory Factory = GrepFactory.INSTANCE;

    // no instances
    private Grep() {
        super();
    }

    /**
     * Interface defining all method signatures for the "grep" command.
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
         * Filters the input lines from the standard input or the provided
         * input files and writes the matching lines to the standard output. A
         * line matches if it contains the given {@code "--regexp"} operand
         * value (default operand).
         * <p>
         * Options can be specified by acronym (with a leading dash "-") or by
         * long name (with two leading dashes "--"). Operands other than the
         * default "--regexp" and "--paths" operands have to be prefixed with
         * the operand name.
         *
         * @param args String arguments defining the options and operands for the command.
         *             Options can be specified by acronym (with a leading dash "-") or by
         *             long name (with two leading dashes "--"). Operands other than the
         *             default "--pattern" and "--paths" operands have to be prefixed with
         *             the operand name (e.g. "--files" for subsequent file operand values).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(String... args);

        /**
         * Filters the input lines from the standard input and writes the
         * matching lines to the standard output. A line matches if it contains
         * the given {@code regexp} using case-sensitive string comparison.
         *
         * @param regexp Lines will be printed which match the given regular expression. The
         *               {@code regexp} string is surrounded with ".*" on both sides unless
         *               the {@code --wholeLine} option is specified. If the
         *               {@code --fixedStrings} option is used, plain string comparison is
         *               used instead of regular expression matching.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(String regexp);

        /**
         * Filters the lines from the specified input files and writes the
         * matching lines to the standard output. Every line is matched against
         * the given {@code regexp} string using case-sensitive comparison.
         * Line endings are not relevant for the comparison.
         *
         * @param regexp Lines will be printed which match the given regular expression. The
         *               {@code regexp} string is surrounded with ".*" on both sides unless
         *               the {@code --wholeLine} option is specified. If the
         *               {@code --fixedStrings} option is used, plain string comparison is
         *               used instead of regular expression matching.
         * @param files  The input files to be searched for the pattern; relative paths are
         *               not resolved (use the string paths argument to enable relative path
         *               resolving based on the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(String regexp, java.io.File... files);

        /**
         * Filters the input lines from the standard input and writes the
         * matching lines to the standard output. Every line is matched against
         * the given regular expression {@code pattern} using case-sensitive
         * comparison. Line endings are not relevant for the comparison.
         *
         * @param pattern Lines will be printed which match the given pattern.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(java.util.regex.Pattern pattern);

        /**
         * Filters the lines from the specified input files and writes the
         * matching lines to the standard output. Every line is matched against
         * the given regular expression {@code pattern} using case-sensitive
         * comparison. Line endings are not relevant for the comparison.
         *
         * @param pattern Lines will be printed which match the given pattern.
         * @param files   The input files to be searched for the pattern; relative paths are
         *                not resolved (use the string paths argument to enable relative path
         *                resolving based on the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(java.util.regex.Pattern pattern, java.io.File... files);

        /**
         * Filters the lines from the specified input files and writes the
         * matching lines to the standard output. Every line is matched against
         * the given regular expression {@code pattern} using case-sensitive
         * comparison. Line endings are not relevant for the comparison.
         *
         * @param pattern Lines will be printed which match the given pattern.
         * @param paths   Pathnames of the input files to be searched for the pattern;
         *                wildcards * and ? are supported; relative paths are resolved on the
         *                basis of the current working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(java.util.regex.Pattern pattern, String... paths);

        /**
         * Filters the input lines from the standard input and writes the
         * matching lines to the standard output. Every line is matched against
         * the given {@code regexp} string; the exact comparison rules are
         * defined by the specified matching {@code options}.
         *
         * @param options The options defining the types of patterns and command behavior.
         * @param regexp  Lines will be printed which match the given regular expression. The
         *                {@code regexp} string is surrounded with ".*" on both sides unless
         *                the {@code --wholeLine} option is specified. If the
         *                {@code --fixedStrings} option is used, plain string comparison is
         *                used instead of regular expression matching.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(GrepOptions options, String regexp);

        /**
         * Filters the input lines from the standard input and writes the
         * matching lines to the standard output. Every line is matched against
         * the given regular expression {@code pattern}; the exact comparison
         * rules are defined by the specified matching {@code options}.
         *
         * @param options The options defining the types of patterns and command behavior.
         * @param pattern Lines will be printed which match the given pattern.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(GrepOptions options, java.util.regex.Pattern pattern);

        /**
         * Filters the input lines from the specified input files and writes
         * the matching lines to the standard output. Every line is matched
         * against the given {@code regexp} string; the exact comparison rules
         * are defined by the specified matching {@code options}.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(GrepOptions options, String regexp, java.io.File... files);

        /**
         * Filters the input lines from the specified input files and writes
         * the matching lines to the standard output. Every line is matched
         * against the given {@code regexp} string; the exact comparison rules
         * are defined by the specified matching {@code options}.
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
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(GrepOptions options, String regexp, String... paths);

        /**
         * Filters the input lines from the specified input files and writes
         * the matching lines to the standard output. Every line is matched
         * against the given regular expression {@code pattern}; the exact
         * comparison rules are defined by the specified matching
         * {@code options}.
         *
         * @param options The options defining the types of patterns and command behavior.
         * @param pattern Lines will be printed which match the given pattern.
         * @param files   The input files to be searched for the pattern; relative paths are
         *                not resolved (use the string paths argument to enable relative path
         *                resolving based on the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(GrepOptions options, java.util.regex.Pattern pattern, java.io.File... files);

        /**
         * Filters the input lines from the specified input files and writes
         * the matching lines to the standard output. Every line is matched
         * against the given regular expression {@code pattern}; the exact
         * comparison rules are defined by the specified matching
         * {@code options}.
         *
         * @param options The options defining the types of patterns and command behavior.
         * @param pattern Lines will be printed which match the given pattern.
         * @param paths   Pathnames of the input files to be searched for the pattern;
         *                wildcards * and ? are supported; relative paths are resolved on the
         *                basis of the current working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R grep(GrepOptions options, java.util.regex.Pattern pattern, String... paths);
    }
}
