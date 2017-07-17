package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Sort sort} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Sort#Options}
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --check}</td><td>&nbsp;</td><td>Checks that the single input file is ordered as specified by the
 * arguments and the collating sequence of the current locale. No
 * output is produced; only the exit code is affected.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --merge}</td><td>&nbsp;</td><td>Merge only; the input file are assumed to be already sorted.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -u}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --unique}</td><td>&nbsp;</td><td>Unique: suppress all but one in each set of lines having equal keys.
 * If used with the {@code -c} option, checks that there are no lines
 * with duplicate keys, in addition to checking that the input file is
 * sorted.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -b}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreLeadingBlanks}</td><td>&nbsp;</td><td>Ignore leading blanks.
 * (This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --dictionaryOrder}</td><td>&nbsp;</td><td>Consider only blanks and alphanumeric characters.
 * (This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Consider all lowercase characters that have uppercase equivalents to
 * be the uppercase equivalent for the purposes of comparison.
 * (This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numericSort}</td><td>&nbsp;</td><td>Sort numerically; the number begins each line and consists of
 * optional blanks, an optional minus sign, and zero or more digits
 * possibly separated by thousands separators, optionally followed by a
 * decimal-point character and zero or more digits. An empty number is
 * treated as '0'. The current local specifies the decimal-point
 * character and thousands separator.
 * <p>
 * Comparison is exact; there is no rounding error.
 * <p>
 * Neither a leading '+' nor exponential notation is recognized. To
 * compare such strings numerically, use the
 * {@code -genericNumericSort (-g)} option.
 * <p>
 * (This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --generalNumericSort}</td><td>&nbsp;</td><td>Sort numerically, using the standard {@link Double#parseDouble(String)}
 * function to convert a trimmed line to a double-precision floating
 * point number. This allows floating point numbers to be specified in
 * scientific notation, like 1.0e-34 and 10e100.
 * <p>
 * Uses the following collating sequence: Lines that cannot be parsed
 * because they do not represent valid double values (in alpha-numeric
 * order); "-Infinity"; finite numbers in ascending numeric order
 * (with -0 < +0); "Infinity"; "NaN".
 * <p>
 * This option is usually slower than {@code -numeric-sort (-n)} and it
 * can lose information when converting to floating point.
 * <p>
 * (This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -h}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --humanNumericSort}</td><td>&nbsp;</td><td>Sort numerically, first by numeric sign (negative, zero, or
 * positive); then by SI suffix (either empty, or 'k' or 'K', or one
 * of 'MGTPEZY', in that order); and finally by numeric value. For
 * example, '1023M' sorts before '1G' because 'M' (mega) precedes 'G'
 * (giga) as an SI suffix.
 * <p>
 * This option sorts values that are consistently scaled to the nearest
 * suffix, regardless of whether suffixes denote powers of 1000 or
 * 1024, and it therefore sorts the output of any single invocation of
 * the {@code ls} command that are invoked with the --human-readable
 * option.
 * <p>
 * The syntax for numbers is the same as for the
 * {@code --numericSort (-n)} option; the SI suffix must immediately
 * follow the number.
 * <p>
 * (This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -M}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --monthSort}</td><td>&nbsp;</td><td>An initial string, consisting of any amount of blanks, followed by a
 * month name abbreviation, is folded to UPPER case and compared in the
 * order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
 * determines the month spellings.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -V}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --versionSort}</td><td>&nbsp;</td><td>Sort by version name and number. It behaves like a standard sort,
 * except that each sequence of decimal digits is treated numerically
 * as an index/version number.
 * <p>
 * (This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --reverse}</td><td>&nbsp;</td><td>Reverse the sense of comparisons.</td></tr>
 * </table>
 */
public enum SortOption implements Option, SortOptions {
    /**
     * Option <b>{@code --check}</b>, <b>{@code -c}</b>:
     * Checks that the single input file is ordered as specified by the
     * arguments and the collating sequence of the current locale. No
     * output is produced; only the exit code is affected.
     */
    check('c'),
    /**
     * Option <b>{@code --merge}</b>, <b>{@code -m}</b>:
     * Merge only; the input file are assumed to be already sorted.
     */
    merge('m'),
    /**
     * Option <b>{@code --unique}</b>, <b>{@code -u}</b>:
     * Unique: suppress all but one in each set of lines having equal keys.
     * If used with the {@code -c} option, checks that there are no lines
     * with duplicate keys, in addition to checking that the input file is
     * sorted.
     */
    unique('u'),
    /**
     * Option <b>{@code --ignoreLeadingBlanks}</b>, <b>{@code -b}</b>:
     * Ignore leading blanks.
     * (This option is ignored if a comparator operand is present).
     */
    ignoreLeadingBlanks('b'),
    /**
     * Option <b>{@code --dictionaryOrder}</b>, <b>{@code -d}</b>:
     * Consider only blanks and alphanumeric characters.
     * (This option is ignored if a comparator operand is present).
     */
    dictionaryOrder('d'),
    /**
     * Option <b>{@code --ignoreCase}</b>, <b>{@code -f}</b>:
     * Consider all lowercase characters that have uppercase equivalents to
     * be the uppercase equivalent for the purposes of comparison.
     * (This option is ignored if a comparator operand is present).
     */
    ignoreCase('f'),
    /**
     * Option <b>{@code --numericSort}</b>, <b>{@code -n}</b>:
     * Sort numerically; the number begins each line and consists of
     * optional blanks, an optional minus sign, and zero or more digits
     * possibly separated by thousands separators, optionally followed by a
     * decimal-point character and zero or more digits. An empty number is
     * treated as '0'. The current local specifies the decimal-point
     * character and thousands separator.
     * <p>
     * Comparison is exact; there is no rounding error.
     * <p>
     * Neither a leading '+' nor exponential notation is recognized. To
     * compare such strings numerically, use the
     * {@code -genericNumericSort (-g)} option.
     * <p>
     * (This option is ignored if a comparator operand is present).
     */
    numericSort('n'),
    /**
     * Option <b>{@code --generalNumericSort}</b>, <b>{@code -g}</b>:
     * Sort numerically, using the standard {@link Double#parseDouble(String)}
     * function to convert a trimmed line to a double-precision floating
     * point number. This allows floating point numbers to be specified in
     * scientific notation, like 1.0e-34 and 10e100.
     * <p>
     * Uses the following collating sequence: Lines that cannot be parsed
     * because they do not represent valid double values (in alpha-numeric
     * order); "-Infinity"; finite numbers in ascending numeric order
     * (with -0 < +0); "Infinity"; "NaN".
     * <p>
     * This option is usually slower than {@code -numeric-sort (-n)} and it
     * can lose information when converting to floating point.
     * <p>
     * (This option is ignored if a comparator operand is present).
     */
    generalNumericSort('g'),
    /**
     * Option <b>{@code --humanNumericSort}</b>, <b>{@code -h}</b>:
     * Sort numerically, first by numeric sign (negative, zero, or
     * positive); then by SI suffix (either empty, or 'k' or 'K', or one
     * of 'MGTPEZY', in that order); and finally by numeric value. For
     * example, '1023M' sorts before '1G' because 'M' (mega) precedes 'G'
     * (giga) as an SI suffix.
     * <p>
     * This option sorts values that are consistently scaled to the nearest
     * suffix, regardless of whether suffixes denote powers of 1000 or
     * 1024, and it therefore sorts the output of any single invocation of
     * the {@code ls} command that are invoked with the --human-readable
     * option.
     * <p>
     * The syntax for numbers is the same as for the
     * {@code --numericSort (-n)} option; the SI suffix must immediately
     * follow the number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     */
    humanNumericSort('h'),
    /**
     * Option <b>{@code --monthSort}</b>, <b>{@code -M}</b>:
     * An initial string, consisting of any amount of blanks, followed by a
     * month name abbreviation, is folded to UPPER case and compared in the
     * order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
     * determines the month spellings.
     */
    monthSort('M'),
    /**
     * Option <b>{@code --versionSort}</b>, <b>{@code -V}</b>:
     * Sort by version name and number. It behaves like a standard sort,
     * except that each sequence of decimal digits is treated numerically
     * as an index/version number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     */
    versionSort('V'),
    /**
     * Option <b>{@code --reverse}</b>, <b>{@code -r}</b>:
     * Reverse the sense of comparisons.
     */
    reverse('r');

    private final char acronym;

    private SortOption(char acronym) {
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
    public static SortOption findByAcronym(char acronym) {
        for(final SortOption opt : values()) {
            if(opt.acronym() == acronym) {
                return opt;
            }
        }
        return null;
    }

    @Override
    public Class<SortOption> optionType() {
        return SortOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(SortOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<SortOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<SortOption> iterator() {
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
    public boolean useAcronymFor(SortOption option) {
        return true;
    }
}
