package org.unix4j.unix.head;

import org.unix4j.unix.Head;

/**
 * Options for the {@link Head head} command with the
 * the following options:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The {@code count} argument is in units of characters instead of
 * lines. Starts from 1 and includes line ending characters.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -q}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --suppressHeaders}</td><td>&nbsp;</td><td>Suppresses printing of headers when multiple files are being
 * examined.</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code head} options
 * defined as an enum constant. With this explicit expansion of all possible
 * option combinations, options can be passed to the command in a very compact
 * form, such as:
 * <pre>
 * head(Head.Options.c, ...);
 * head(Head.Options.c.q, ...);
 * </pre>
 */
public final class HeadOptionSets {
    /**
     * The singleton instance.
     */
    public static final HeadOptionSets INSTANCE = new HeadOptionSets();

    /**
     * Option {@code "-c"}: The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #chars chars}{@code "} option.
     */
    public final HeadOptionSet_cq c = HeadOptionSet_cq.Active_c;
    /**
     * Option {@code "--chars"}: The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.
     * <p>
     * The option {@code "--chars"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     */
    public final HeadOptionSet_cq chars = HeadOptionSet_cq.Active_c_long;
    /**
     * Option {@code "-q"}: Suppresses printing of headers when multiple files are being
     * examined.
     * <p>
     * The option {@code "-q"} is equivalent to the {@code "--}{@link #suppressHeaders suppressHeaders}{@code "} option.
     */
    public final HeadOptionSet_cq q = HeadOptionSet_cq.Active_q;
    /**
     * Option {@code "--suppressHeaders"}: Suppresses printing of headers when multiple files are being
     * examined.
     * <p>
     * The option {@code "--suppressHeaders"} is equivalent to the {@code "-}{@link #q q}{@code "} option.
     */
    public final HeadOptionSet_cq suppressHeaders = HeadOptionSet_cq.Active_q_long;

}
