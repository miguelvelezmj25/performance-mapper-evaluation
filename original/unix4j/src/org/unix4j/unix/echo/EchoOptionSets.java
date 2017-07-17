package org.unix4j.unix.echo;

import org.unix4j.unix.Echo;

/**
 * Options for the {@link Echo echo} command with the
 * the following options:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noNewline}</td><td>&nbsp;</td><td>Do not print the trailing newline character(s).</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code echo} options
 * defined as an enum constant. With this explicit expansion of all possible
 * option combinations, options can be passed to the command in a very compact
 * form, such as:
 * <pre>
 * echo(Echo.Options.n, ...);
 * </pre>
 */
public final class EchoOptionSets {
    /**
     * The singleton instance.
     */
    public static final EchoOptionSets INSTANCE = new EchoOptionSets();

    /**
     * Option {@code "-n"}: Do not print the trailing newline character(s).
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #noNewline noNewline}{@code "} option.
     */
    public final EchoOptionSet_n n = EchoOptionSet_n.Active_n;
    /**
     * Option {@code "--noNewline"}: Do not print the trailing newline character(s).
     * <p>
     * The option {@code "--noNewline"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     */
    public final EchoOptionSet_n noNewline = EchoOptionSet_n.Active_n_long;

}
