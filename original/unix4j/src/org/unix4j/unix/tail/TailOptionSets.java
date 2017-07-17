package org.unix4j.unix.tail;

import org.unix4j.unix.Tail;

/**
 * Options for the {@link Tail tail} command with the
 * the following options:
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
 * This class serves as entry point to every possible set of {@code tail} options
 * defined as an enum constant. With this explicit expansion of all possible
 * option combinations, options can be passed to the command in a very compact
 * form, such as:
 * <pre>
 * tail(Tail.Options.c, ...);
 * tail(Tail.Options.c.q, ...);
 * ...
 * tail(Tail.Options.c.q.s, ...);
 * </pre>
 */
public final class TailOptionSets {
    /**
     * The singleton instance.
     */
    public static final TailOptionSets INSTANCE = new TailOptionSets();

    /**
     * Option {@code "-c"}: The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #chars chars}{@code "} option.
     */
    public final TailOptionSet_cqs c = TailOptionSet_cqs.Active_c;
    /**
     * Option {@code "--chars"}: The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.
     * <p>
     * The option {@code "--chars"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     */
    public final TailOptionSet_cqs chars = TailOptionSet_cqs.Active_c_long;
    /**
     * Option {@code "-s"}: The {@code count} argument is relative to the beginning of the file
     * instead of counting from the end of the file. For instance,
     * {@code tail -s 10} prints the lines starting from line 10;
     * {@code tail -s 1} prints the whole file.
     * <p>
     * The option {@code "-s"} is equivalent to the {@code "--}{@link #countFromStart countFromStart}{@code "} option.
     */
    public final TailOptionSet_cqs s = TailOptionSet_cqs.Active_s;
    /**
     * Option {@code "--countFromStart"}: The {@code count} argument is relative to the beginning of the file
     * instead of counting from the end of the file. For instance,
     * {@code tail -s 10} prints the lines starting from line 10;
     * {@code tail -s 1} prints the whole file.
     * <p>
     * The option {@code "--countFromStart"} is equivalent to the {@code "-}{@link #s s}{@code "} option.
     */
    public final TailOptionSet_cqs countFromStart = TailOptionSet_cqs.Active_s_long;
    /**
     * Option {@code "-q"}: Suppresses printing of headers when multiple files are being
     * examined.
     * <p>
     * The option {@code "-q"} is equivalent to the {@code "--}{@link #suppressHeaders suppressHeaders}{@code "} option.
     */
    public final TailOptionSet_cqs q = TailOptionSet_cqs.Active_q;
    /**
     * Option {@code "--suppressHeaders"}: Suppresses printing of headers when multiple files are being
     * examined.
     * <p>
     * The option {@code "--suppressHeaders"} is equivalent to the {@code "-}{@link #q q}{@code "} option.
     */
    public final TailOptionSet_cqs suppressHeaders = TailOptionSet_cqs.Active_q_long;

}
