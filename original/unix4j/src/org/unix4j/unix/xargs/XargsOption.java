package org.unix4j.unix.xargs;

import org.unix4j.option.Option;
import org.unix4j.unix.Xargs;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Xargs xargs} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Xargs#Options}
 * instead of the option constants defined here.
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
public enum XargsOption implements Option, XargsOptions {
    /**
     * Option <b>{@code --delimiter0}</b>, <b>{@code -z}</b>:
     * Input items are terminated by a null character instead of by
     * whitespace, and the quotes and backslash are not special (every
     * character is taken literally). Disables the end of file string,
     * which is treated like any other argument. Useful when input items
     * might contain white space, quote marks, or backslashes. The find
     * --print0 option produces input suitable for this mode.
     * <p>
     * (This option is ignored if an explicit delimiter operand is specified).
     */
    delimiter0('z'),
    /**
     * Option <b>{@code --exactArgs}</b>, <b>{@code -x}</b>:
     * Terminate immediately if {@code maxArgs} is specified but the found
     * number of variable items is less than {@code maxArgs}.
     * <p>
     * (This option is ignored if no {@code maxArgs} operand is specified).
     */
    exactArgs('x'),
    /**
     * Option <b>{@code --noRunIfEmpty}</b>, <b>{@code -r}</b>:
     * If the standard input does not contain any nonblanks, do not run the
     * command. Normally, the command is run once even if there is no
     * input.
     */
    noRunIfEmpty('r'),
    /**
     * Option <b>{@code --verbose}</b>, <b>{@code -t}</b>:
     * Print the command line on the standard error output before executing
     * it.
     */
    verbose('t');

    private final char acronym;

    private XargsOption(char acronym) {
        this.acronym = acronym;
    }

    /**
     * Returns the option with the given {@code acronym}, or {@code null} if no
     * such option is found.
     *
     * @param acronym the option {@link #acronym() acronym}
     * @return the option with the given {@code acronym} or {@code null} if it
     * is not found
     */
    public static XargsOption findByAcronym(char acronym) {
        for(final XargsOption opt : values()) {
            if(opt.acronym() == acronym) {
                return opt;
            }
        }
        return null;
    }

    @Override
    public Class<XargsOption> optionType() {
        return XargsOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(XargsOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<XargsOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<XargsOption> iterator() {
        return Collections.singleton(this).iterator();
    }

    /**
     * Returns 1 as this is a set with a single element: {@code this} option
     *
     * @return one
     */
    @Override
    public int size() {
        return 1;
    }

    /**
     * Returns true if the {@link Option#acronym() acronym} should be used for
     * the specified {@code option} in string representations.
     * <p>
     * This method returns always true for all options.
     *
     * @param option the option of interest
     * @return always true indicating that option acronyms should be used in
     * string representations for all options
     */
    @Override
    public boolean useAcronymFor(XargsOption option) {
        return true;
    }
}
