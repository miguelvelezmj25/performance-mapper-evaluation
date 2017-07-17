package org.unix4j.unix.cut;

import org.unix4j.option.Option;
import org.unix4j.unix.Cut;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Cut cut} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Cut#Options}
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The list specifies character positions.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fields}</td><td>&nbsp;</td><td>The list specifies fields, separated in the input by the field
 * delimiter character (see the -d option.)  Output fields are
 * separated by a single occurrence of the field delimiter character.</td></tr>
 * </table>
 */
public enum CutOption implements Option, CutOptions {
    /**
     * Option <b>{@code --chars}</b>, <b>{@code -c}</b>:
     * The list specifies character positions.
     */
    chars('c'),
    /**
     * Option <b>{@code --fields}</b>, <b>{@code -f}</b>:
     * The list specifies fields, separated in the input by the field
     * delimiter character (see the -d option.)  Output fields are
     * separated by a single occurrence of the field delimiter character.
     */
    fields('f');

    private final char acronym;

    private CutOption(char acronym) {
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
    public static CutOption findByAcronym(char acronym) {
        for(final CutOption opt : values()) {
            if(opt.acronym() == acronym) {
                return opt;
            }
        }
        return null;
    }

    @Override
    public Class<CutOption> optionType() {
        return CutOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(CutOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<CutOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<CutOption> iterator() {
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
    public boolean useAcronymFor(CutOption option) {
        return true;
    }
}
