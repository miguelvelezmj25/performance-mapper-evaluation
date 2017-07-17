package org.unix4j.unix.ls;

import org.unix4j.option.Option;
import org.unix4j.unix.Ls;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Ls ls} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Ls#Options}
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --allFiles}</td><td>&nbsp;</td><td>Lists all files in the given directory, including hidden files
 * (those whose names start with \".\" in Unix). By default, these
 * files are excluded from the list.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -h}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --humanReadable}</td><td>&nbsp;</td><td>Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --longFormat}</td><td>&nbsp;</td><td>Long format, displaying file types, permissions, number of hard
 * links, owner, group, size, date, and filename.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -R}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --recurseSubdirs}</td><td>&nbsp;</td><td>Recursively lists subdirectories encountered.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --reverseOrder}</td><td>&nbsp;</td><td>Reverses the order of the sort to get reverse collating sequence or
 * oldest first.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeSorted}</td><td>&nbsp;</td><td>Sorts with the primary key being time modified (most recently
 * modified first) and the secondary key being filename in the
 * collating sequence.</td></tr>
 * </table>
 */
public enum LsOption implements Option, LsOptions {
	/**
     * Option <b>{@code --allFiles}</b>, <b>{@code -a}</b>:
     * Lists all files in the given directory, including hidden files
     * (those whose names start with \".\" in Unix). By default, these
     * files are excluded from the list.
     */
    allFiles('a'),
    /**
     * Option <b>{@code --humanReadable}</b>, <b>{@code -h}</b>:
     * Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)
     */
    humanReadable('h'),
    /**
     * Option <b>{@code --longFormat}</b>, <b>{@code -l}</b>:
     * Long format, displaying file types, permissions, number of hard
     * links, owner, group, size, date, and filename.
     */
    longFormat('l'),
    /**
     * Option <b>{@code --recurseSubdirs}</b>, <b>{@code -R}</b>:
     * Recursively lists subdirectories encountered.
     */
    recurseSubdirs('R'),
    /**
     * Option <b>{@code --reverseOrder}</b>, <b>{@code -r}</b>:
     * Reverses the order of the sort to get reverse collating sequence or
     * oldest first.
     */
    reverseOrder('r'),
    /**
     * Option <b>{@code --timeSorted}</b>, <b>{@code -t}</b>:
     * Sorts with the primary key being time modified (most recently
     * modified first) and the secondary key being filename in the
     * collating sequence.
     */
    timeSorted('t');

    private final char acronym;

    private LsOption(char acronym) {
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
    public static LsOption findByAcronym(char acronym) {
        for(final LsOption opt : values()) {
			if(opt.acronym() == acronym) {
				return opt;
			}
        }
        return null;
    }

    @Override
    public Class<LsOption> optionType() {
        return LsOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(LsOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<LsOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<LsOption> iterator() {
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
    public boolean useAcronymFor(LsOption option) {
        return true;
    }
}
