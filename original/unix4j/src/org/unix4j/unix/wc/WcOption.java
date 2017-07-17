package org.unix4j.unix.wc;

import org.unix4j.option.Option;
import org.unix4j.unix.Wc;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Wc wc} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Wc#Options}
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lines}</td><td>&nbsp;</td><td>Executes a count of lines and writes this count to the output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -w}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --words}</td><td>&nbsp;</td><td>Executes a count of words and writes this count to the output. A
 * word is a non-zero-length string of characters delimited by white
 * space as defined by {@link Character#isWhitespace(char)}.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>Executes a count of chars and writes this count to the output.</td></tr>
 * </table>
 */
public enum WcOption implements Option, WcOptions {
    /**
     * Option <b>{@code --lines}</b>, <b>{@code -l}</b>:
     * Executes a count of lines and writes this count to the output.
     */
    lines('l'),
    /**
     * Option <b>{@code --words}</b>, <b>{@code -w}</b>:
     * Executes a count of words and writes this count to the output. A
     * word is a non-zero-length string of characters delimited by white
     * space as defined by {@link Character#isWhitespace(char)}.
     */
    words('w'),
    /**
     * Option <b>{@code --chars}</b>, <b>{@code -m}</b>:
     * Executes a count of chars and writes this count to the output.
     */
    chars('m');

    private final char acronym;

    private WcOption(char acronym) {
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
    public static WcOption findByAcronym(char acronym) {
        for(final WcOption opt : values()) {
            if(opt.acronym() == acronym) {
                return opt;
            }
        }
        return null;
    }

    @Override
    public Class<WcOption> optionType() {
        return WcOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(WcOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<WcOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<WcOption> iterator() {
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
    public boolean useAcronymFor(WcOption option) {
        return true;
    }
}
