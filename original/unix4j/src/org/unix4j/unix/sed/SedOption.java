package org.unix4j.unix.sed;

import org.unix4j.option.Option;
import org.unix4j.unix.Sed;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Sed sed} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Sed#Options}
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --quiet}</td><td>&nbsp;</td><td>Suppress the default output (in which each line, after it is
 * examined for editing, is written to standard output). Only lines
 * explicitly selected for output are written.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Globally substitute for all non-overlapping instances of the regexp
 * rather than just the first one.
 * <p>
 * (This option is ignored if the occurrence operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -p}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print}</td><td>&nbsp;</td><td>Write the matched line to standard output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Writes the current line number on a separate line to the standard
 * output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -I}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive pattern matching.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --substitute}</td><td>&nbsp;</td><td>Substitutes the replacement string for instances of the regexp in
 * the matched line.
 * <p>
 * An ampersand ('&') appearing in the replacement is be replaced
 * by the line matching the regexp. The characters "\n", where n is a
 * digit, are replaced by the text matched by the corresponding
 * backreference expression.  The special meaning of '&' and "\n"
 * in this context can be suppressed by preceding it by a backslash.
 * <p>
 * A line can be split by substituting a newline ('\n') into it.
 * <p>
 * A substitution is considered to have been performed even if the
 * replacement string is identical to the string that it replaces.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --append}</td><td>&nbsp;</td><td>Append string2 as a separate line after the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --insert}</td><td>&nbsp;</td><td>Insert string2 as a separate line before the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --change}</td><td>&nbsp;</td><td>Write string2 as a separate line instead of the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delete}</td><td>&nbsp;</td><td>Delete the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -y}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --translate}</td><td>&nbsp;</td><td>Replace all occurrences of characters in string1 with the
 * corresponding characters in string2. If the number of characters in
 * the two strings are not equal, or if any of the characters in
 * string1 appear more than once, the results are undefined.</td></tr>
 * </table>
 */
public enum SedOption implements Option, SedOptions {
    /**
     * Option <b>{@code --quiet}</b>, <b>{@code -n}</b>:
     * Suppress the default output (in which each line, after it is
     * examined for editing, is written to standard output). Only lines
     * explicitly selected for output are written.
     */
    quiet('n'),
    /**
     * Option <b>{@code --global}</b>, <b>{@code -g}</b>:
     * Globally substitute for all non-overlapping instances of the regexp
     * rather than just the first one.
     * <p>
     * (This option is ignored if the occurrence operand is specified).
     */
    global('g'),
    /**
     * Option <b>{@code --print}</b>, <b>{@code -p}</b>:
     * Write the matched line to standard output.
     */
    print('p'),
    /**
     * Option <b>{@code --lineNumber}</b>, <b>{@code -l}</b>:
     * Writes the current line number on a separate line to the standard
     * output.
     */
    lineNumber('l'),
    /**
     * Option <b>{@code --ignoreCase}</b>, <b>{@code -I}</b>:
     * Use case insensitive pattern matching.
     */
    ignoreCase('I'),
    /**
     * Option <b>{@code --substitute}</b>, <b>{@code -s}</b>:
     * Substitutes the replacement string for instances of the regexp in
     * the matched line.
     * <p>
     * An ampersand ('&') appearing in the replacement is be replaced
     * by the line matching the regexp. The characters "\n", where n is a
     * digit, are replaced by the text matched by the corresponding
     * backreference expression.  The special meaning of '&' and "\n"
     * in this context can be suppressed by preceding it by a backslash.
     * <p>
     * A line can be split by substituting a newline ('\n') into it.
     * <p>
     * A substitution is considered to have been performed even if the
     * replacement string is identical to the string that it replaces.
     */
    substitute('s'),
    /**
     * Option <b>{@code --append}</b>, <b>{@code -a}</b>:
     * Append string2 as a separate line after the matched line.
     */
    append('a'),
    /**
     * Option <b>{@code --insert}</b>, <b>{@code -i}</b>:
     * Insert string2 as a separate line before the matched line.
     */
    insert('i'),
    /**
     * Option <b>{@code --change}</b>, <b>{@code -c}</b>:
     * Write string2 as a separate line instead of the matched line.
     */
    change('c'),
    /**
     * Option <b>{@code --delete}</b>, <b>{@code -d}</b>:
     * Delete the matched line.
     */
    delete('d'),
    /**
     * Option <b>{@code --translate}</b>, <b>{@code -y}</b>:
     * Replace all occurrences of characters in string1 with the
     * corresponding characters in string2. If the number of characters in
     * the two strings are not equal, or if any of the characters in
     * string1 appear more than once, the results are undefined.
     */
    translate('y');

    private final char acronym;

    private SedOption(char acronym) {
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
    public static SedOption findByAcronym(char acronym) {
        for(final SedOption opt : values()) {
            if(opt.acronym() == acronym) {
                return opt;
            }
        }
        return null;
    }

    @Override
    public Class<SedOption> optionType() {
        return SedOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(SedOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<SedOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<SedOption> iterator() {
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
    public boolean useAcronymFor(SedOption option) {
        return true;
    }
}
