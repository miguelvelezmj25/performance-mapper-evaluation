package org.unix4j.unix.echo;

import org.unix4j.option.Option;
import org.unix4j.unix.Echo;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Echo echo} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Echo#Options}
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noNewline}</td><td>&nbsp;</td><td>Do not print the trailing newline character(s).</td></tr>
 * </table>
 */
public enum EchoOption implements Option, EchoOptions {
    /**
     * Option <b>{@code --noNewline}</b>, <b>{@code -n}</b>:
     * Do not print the trailing newline character(s).
     */
    noNewline('n');

    private final char acronym;

    private EchoOption(char acronym) {
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
    public static EchoOption findByAcronym(char acronym) {
        for(final EchoOption opt : values()) {
            if(opt.acronym() == acronym) {
                return opt;
            }
        }
        return null;
    }

    @Override
    public Class<EchoOption> optionType() {
        return EchoOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(EchoOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<EchoOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<EchoOption> iterator() {
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
    public boolean useAcronymFor(EchoOption option) {
        return true;
    }
}
