package org.unix4j.unix.grep;

import org.unix4j.option.Option;
import org.unix4j.unix.Grep;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Grep grep} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Grep#Options}
 * instead of the option constants defined here.
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
public enum GrepOption implements Option, GrepOptions {
    /**
     * Option <b>{@code --ignoreCase}</b>, <b>{@code -i}</b>:
     * Match lines ignoring the case when comparing the strings, also known
     * from Unix with its acronym 'i'.
     */
    ignoreCase('i'),
    /**
     * Option <b>{@code --invertMatch}</b>, <b>{@code -v}</b>:
     * Invert the match result, that is, a non-matching line is written to
     * the output and a matching line is not. This option is also known
     * from Unix with its acronym 'v'.
     */
    invertMatch('v'),
    /**
     * Option <b>{@code --fixedStrings}</b>, <b>{@code -F}</b>:
     * Use fixed-strings matching instead of regular expressions. This is
     * usually faster than the standard regexp version.
     * <p>
     * (This option is ignored if a {@code pattern} operand is specified
     * instead of the {@code regexp} string).
     */
    fixedStrings('F'),
    /**
     * Option <b>{@code --lineNumber}</b>, <b>{@code -n}</b>:
     * Prefix each line of output with the line number within its input
     * file.
     */
    lineNumber('n'),
    /**
     * Option <b>{@code --count}</b>, <b>{@code -c}</b>:
     * Suppress normal output; instead print a count of matching lines for
     * each input file. With the {@code -v}, {@code --invertMatch} option,
     * count non-matching lines.
     */
    count('c'),
    /**
     * Option <b>{@code --matchingFiles}</b>, <b>{@code -l}</b>:
     * Suppress normal output; instead print the name of each input file
     * from which output would normally have been printed. The scanning
     * will stop on the first match.
     */
    matchingFiles('l'),
    /**
     * Option <b>{@code --wholeLine}</b>, <b>{@code -x}</b>:
     * Select only those matches that exactly match the whole line
     * excluding the terminating line ending.
     * <p>
     * (This option is ignored if a {@code pattern} operand is specified
     * instead of the {@code regexp} string).
     */
    wholeLine('x');

    private final char acronym;

    private GrepOption(char acronym) {
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
    public static GrepOption findByAcronym(char acronym) {
        for(final GrepOption opt : values()) {
            if(opt.acronym() == acronym) {
                return opt;
            }
        }
        return null;
    }

    @Override
    public Class<GrepOption> optionType() {
        return GrepOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(GrepOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<GrepOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<GrepOption> iterator() {
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
    public boolean useAcronymFor(GrepOption option) {
        return true;
    }
}
