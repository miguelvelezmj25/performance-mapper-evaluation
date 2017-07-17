package org.unix4j.unix;

import org.unix4j.command.CommandInterface;
import org.unix4j.unix.xargs.XargsFactory;
import org.unix4j.unix.xargs.XargsOption;
import org.unix4j.unix.xargs.XargsOptionSets;
import org.unix4j.unix.xargs.XargsOptions;

/**
 * Non-instantiable module with inner types making up the <b>xargs</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * xargs - build and execute command lines from standard input
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <delimiter>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <maxLines>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <maxLines> <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <delimiter> <maxLines>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <delimiter> <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <delimiter> <maxLines> <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs <delimiter> <eof> <maxLines> <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt]}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt] <delimiter>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt] <maxLines>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt] <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt] <maxLines> <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt] <delimiter> <maxLines>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt] <delimiter> <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt] <delimiter> <maxLines> <maxArgs>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code xargs [-zxrt] <delimiter> <eof> <maxLines> <maxArgs>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>The xargs utility reads items from the standard input, delimited by blanks (which can be protected with double or single quotes or a backslash) or newlines, and executes the command (default is /bin/echo) one or more times withany initial arguments followed by items read from standard input. Blank lines onthe standard input are ignored.</p><p>Because Unix filenames can contain blanks and newlines, this default behaviour is often problematic; filenames containing blanks and/or newlines are incorrectly processed by xargs. In these situations it is better to use the --null option, which prevents such problems. When using this option you will need to ensure that the program which produces the input for xargs also uses a null character as a separator. If that program is find for example, the --print0 option does this for you.If any invocation of the command exits with a status of 255, xargs will stop immediately without reading any further input. An error messageis issued on stderr when this happens.</p>
 * <p>
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -z}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delimiter0}</td><td>&nbsp;</td><td>Input items are terminated by a null character instead of by
 * whitespace, and the quotes and backslash are not special (every
 * character is taken literally). Disables the end of file string,
 * which is treated like any other argument. Useful when input items
 * might contain white space, quote marks, or backslashes. The find
 * --print0 option produces input suitable for this mode.
 * <p>
 * (This option is ignored if an explicit delimiter operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --exactArgs}</td><td>&nbsp;</td><td>Terminate immediately if {@code maxArgs} is specified but the found
 * number of variable items is less than {@code maxArgs}.
 * <p>
 * (This option is ignored if no {@code maxArgs} operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noRunIfEmpty}</td><td>&nbsp;</td><td>If the standard input does not contain any nonblanks, do not run the
 * command. Normally, the command is run once even if there is no
 * input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --verbose}</td><td>&nbsp;</td><td>Print the command line on the standard error output before executing
 * it.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <delimiter>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Input items are terminated by the specified characters.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <eof>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>If the end of file string occurs as a line of input, the rest of the
 * input is ignored.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <maxLines>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code long}</td><td>&nbsp;</td><td>Use at most maxLines nonblank input lines per command invocation.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <maxArgs>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code int}</td><td>&nbsp;</td><td>Use at most maxArgs arguments per command invocation.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command.
 * Options can be specified by acronym (with a leading dash "-") or by
 * long name (with two leading dashes "--"). Operands other than the
 * default "--maxArgs" operand have to be prefixed with the operand
 * name (e.g. "--maxLines" for a subsequent line count operand value).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code XargsOptions}</td><td>&nbsp;</td><td>The options defining command behavior.</td></tr>
 * </table>
 */
public final class Xargs {
    /**
     * The "xargs" command name.
     */
    public static final String NAME = "xargs";
    /**
     * Options for the "xargs" command: {@link XargsOption#delimiter0 z}, {@link XargsOption#exactArgs x}, {@link XargsOption#noRunIfEmpty r}, {@link XargsOption#verbose t}.
     * <p>
     * <table>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -z}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delimiter0}</td><td>&nbsp;</td><td>Input items are terminated by a null character instead of by
     * whitespace, and the quotes and backslash are not special (every
     * character is taken literally). Disables the end of file string,
     * which is treated like any other argument. Useful when input items
     * might contain white space, quote marks, or backslashes. The find
     * --print0 option produces input suitable for this mode.
     * <p>
     * (This option is ignored if an explicit delimiter operand is specified).</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --exactArgs}</td><td>&nbsp;</td><td>Terminate immediately if {@code maxArgs} is specified but the found
     * number of variable items is less than {@code maxArgs}.
     * <p>
     * (This option is ignored if no {@code maxArgs} operand is specified).</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noRunIfEmpty}</td><td>&nbsp;</td><td>If the standard input does not contain any nonblanks, do not run the
     * command. Normally, the command is run once even if there is no
     * input.</td></tr>
     * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --verbose}</td><td>&nbsp;</td><td>Print the command line on the standard error output before executing
     * it.</td></tr>
     * </table>
     */
    public static final XargsOptionSets Options = XargsOptionSets.INSTANCE;
    /**
     * Singleton {@link XargsFactory factory} instance for the "xargs" command.
     */
    public static final XargsFactory Factory = XargsFactory.INSTANCE;

    // no instances
    private Xargs() {
        super();
    }

    /**
     * Interface defining all method signatures for the "xargs" command.
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
         * Reads items from the standard input, delimited by blanks (which can
         * be protected with double or single quotes or a backslash) or
         * newlines, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every input line; the item variables are usually passed to the
         * invoked command as arguments.
         *
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs();

        /**
         * Reads items from the standard input, delimited by blanks and
         * newlines or a specified delimiter, and provides variables for the
         * items read from the standard input. The command following after
         * xargs is executed once for every input line (or for multiple lines
         * depending on the input options); the item variables are usually
         * passed to the invoked command as arguments.
         * <p>
         * Options can be specified by acronym (with a leading dash "-") or by
         * long name (with two leading dashes "--"). Operands other than the
         * default "--maxArgs" operand have to be prefixed with the operand
         * name.
         *
         * @param args String arguments defining the options and operands for the command.
         *             Options can be specified by acronym (with a leading dash "-") or by
         *             long name (with two leading dashes "--"). Operands other than the
         *             default "--maxArgs" operand have to be prefixed with the operand
         *             name (e.g. "--maxLines" for a subsequent line count operand value).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(String... args);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every input line; the item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param delimiter Input items are terminated by the specified characters.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(String delimiter);

        /**
         * Reads items from the standard input, delimited by blanks (which can
         * be protected with double or single quotes or a backslash) or
         * newlines, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxLines} nonblank input lines (or possibly fewer
         * for the last invocation with the remaining lines at the end of the
         * file). The item variables are usually passed to the invoked command
         * as arguments.
         *
         * @param maxLines Use at most maxLines nonblank input lines per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(long maxLines);

        /**
         * Reads items from the standard input, delimited by blanks (which can
         * be protected with double or single quotes or a backslash) or
         * newlines, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxArgs} items read from the standard input (or
         * possibly fewer for the last invocation with the remaining items at
         * the end of the file). The item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param maxArgs Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(int maxArgs);

        /**
         * Reads items from the standard input, delimited by blanks (which can
         * be protected with double or single quotes or a backslash) or
         * newlines, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxLines} nonblank input lines or {@code maxArgs}
         * items (whichever occurs first). Fewer lines or items may be used for
         * the last invocation with the remaining lines at the end of the file.
         * The item variables are usually passed to the invoked command as
         * arguments.
         *
         * @param maxLines Use at most maxLines nonblank input lines per command invocation.
         * @param maxArgs  Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(long maxLines, int maxArgs);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxLines} nonblank input lines (or possibly fewer
         * for the last invocation with the remaining lines at the end of the
         * file). The item variables are usually passed to the invoked command
         * as arguments.
         *
         * @param delimiter Input items are terminated by the specified characters.
         * @param maxLines  Use at most maxLines nonblank input lines per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(String delimiter, long maxLines);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxArgs} items read from the standard input (or
         * possibly fewer for the last invocation with the remaining items at
         * the end of the file). The item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param delimiter Input items are terminated by the specified characters.
         * @param maxArgs   Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(String delimiter, int maxArgs);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxLines} nonblank input lines or {@code maxArgs}
         * items (whichever occurs first). Fewer lines or items may be used for
         * the last invocation with the remaining lines at the end of the file.
         * The item variables are usually passed to the invoked command as
         * arguments.
         *
         * @param delimiter Input items are terminated by the specified characters.
         * @param maxLines  Use at most maxLines nonblank input lines per command invocation.
         * @param maxArgs   Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(String delimiter, long maxLines, int maxArgs);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. If the {@code eof} string occurs as a line of input,
         * the rest of the input is ignored. The command following after xargs
         * is executed once for every {@code maxLines} nonblank input lines or
         * {@code maxArgs} items (whichever occurs first). Fewer lines or items
         * may be used for the last invocation with the remaining lines at the
         * end of the file. The item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param delimiter Input items are terminated by the specified characters.
         * @param eof       If the end of file string occurs as a line of input, the rest of the
         *                  input is ignored.
         * @param maxLines  Use at most maxLines nonblank input lines per command invocation.
         * @param maxArgs   Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(String delimiter, String eof, long maxLines, int maxArgs);

        /**
         * Reads items from the standard input, delimited by blanks (which can
         * be protected with double or single quotes or a backslash) or
         * newlines, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every input line; the item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param options The options defining command behavior.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every input line; the item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param options   The options defining command behavior.
         * @param delimiter Input items are terminated by the specified characters.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options, String delimiter);

        /**
         * Reads items from the standard input, delimited by blanks (which can
         * be protected with double or single quotes or a backslash) or
         * newlines, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxLines} nonblank input lines (or possibly fewer
         * for the last invocation with the remaining lines at the end of the
         * file). The item variables are usually passed to the invoked command
         * as arguments.
         *
         * @param options  The options defining command behavior.
         * @param maxLines Use at most maxLines nonblank input lines per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options, long maxLines);

        /**
         * Reads items from the standard input, delimited by blanks (which can
         * be protected with double or single quotes or a backslash) or
         * newlines, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxArgs} items read from the standard input (or
         * possibly fewer for the last invocation with the remaining items at
         * the end of the file). The item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param options The options defining command behavior.
         * @param maxArgs Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options, int maxArgs);

        /**
         * Reads items from the standard input, delimited by blanks (which can
         * be protected with double or single quotes or a backslash) or
         * newlines, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxLines} nonblank input lines or {@code maxArgs}
         * items (whichever occurs first). Fewer lines or items may be used for
         * the last invocation with the remaining lines at the end of the file.
         * The item variables are usually passed to the invoked command as
         * arguments.
         *
         * @param options  The options defining command behavior.
         * @param maxLines Use at most maxLines nonblank input lines per command invocation.
         * @param maxArgs  Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options, long maxLines, int maxArgs);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxLines} nonblank input lines (or possibly fewer
         * for the last invocation with the remaining lines at the end of the
         * file). The item variables are usually passed to the invoked command
         * as arguments.
         *
         * @param options   The options defining command behavior.
         * @param delimiter Input items are terminated by the specified characters.
         * @param maxLines  Use at most maxLines nonblank input lines per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options, String delimiter, long maxLines);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxArgs} items read from the standard input (or
         * possibly fewer for the last invocation with the remaining items at
         * the end of the file). The item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param options   The options defining command behavior.
         * @param delimiter Input items are terminated by the specified characters.
         * @param maxArgs   Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options, String delimiter, int maxArgs);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. The command following after xargs is executed once
         * for every {@code maxLines} nonblank input lines or {@code maxArgs}
         * items (whichever occurs first). Fewer lines or items may be used for
         * the last invocation with the remaining lines at the end of the file.
         * The item variables are usually passed to the invoked command as
         * arguments.
         *
         * @param options   The options defining command behavior.
         * @param delimiter Input items are terminated by the specified characters.
         * @param maxLines  Use at most maxLines nonblank input lines per command invocation.
         * @param maxArgs   Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options, String delimiter, long maxLines, int maxArgs);

        /**
         * Reads items from the standard input using the specified delimiter to
         * separate items, and provides variables for the items read from the
         * standard input. If the {@code eof} string occurs as a line of input,
         * the rest of the input is ignored. The command following after xargs
         * is executed once for every {@code maxLines} nonblank input lines or
         * {@code maxArgs} items (whichever occurs first). Fewer lines or items
         * may be used for the last invocation with the remaining lines at the
         * end of the file. The item variables are usually passed to the
         * invoked command as arguments.
         *
         * @param options   The options defining command behavior.
         * @param delimiter Input items are terminated by the specified characters.
         * @param eof       If the end of file string occurs as a line of input, the rest of the
         *                  input is ignored.
         * @param maxLines  Use at most maxLines nonblank input lines per command invocation.
         * @param maxArgs   Use at most maxArgs arguments per command invocation.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R xargs(XargsOptions options, String delimiter, String eof, long maxLines, int maxArgs);
    }
}
