package org.unix4j.unix.sort;

import org.unix4j.unix.Sort;

/**
 * Options for the {@link Sort sort} command with the
 * the following options:
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
 * <p>
 * This class serves as entry point to every possible set of {@code sort} options
 * defined as an enum constant. With this explicit expansion of all possible
 * option combinations, options can be passed to the command in a very compact
 * form, such as:
 * <pre>
 * sort(Sort.Options.c, ...);
 * sort(Sort.Options.c.m, ...);
 * ...
 * sort(Sort.Options.c.m.u.b.d.f.n.g.h.M.V.r, ...);
 * </pre>
 */
public final class SortOptionSets {
    /**
     * The singleton instance.
     */
    public static final SortOptionSets INSTANCE = new SortOptionSets();

    /**
     * Option {@code "-c"}: Checks that the single input file is ordered as specified by the
     * arguments and the collating sequence of the current locale. No
     * output is produced; only the exit code is affected.
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #check check}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghnru c = SortOptionSet_MVbcdfghnru.Active_c;
    /**
     * Option {@code "--check"}: Checks that the single input file is ordered as specified by the
     * arguments and the collating sequence of the current locale. No
     * output is produced; only the exit code is affected.
     * <p>
     * The option {@code "--check"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghnru check = SortOptionSet_MVbcdfghnru.Active_c_long;
    /**
     * Option {@code "-d"}: Consider only blanks and alphanumeric characters.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-d"} is equivalent to the {@code "--}{@link #dictionaryOrder dictionaryOrder}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru d = SortOptionSet_MVbcdfghmnru.Active_d;
    /**
     * Option {@code "--dictionaryOrder"}: Consider only blanks and alphanumeric characters.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--dictionaryOrder"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru dictionaryOrder = SortOptionSet_MVbcdfghmnru.Active_d_long;
    /**
     * Option {@code "-g"}: Sort numerically, using the standard {@link Double#parseDouble(String)}
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
     * <p>
     * The option {@code "-g"} is equivalent to the {@code "--}{@link #generalNumericSort generalNumericSort}{@code "} option.
     */
    public final SortOptionSet_bcdfgmru g = SortOptionSet_bcdfgmru.Active_g;
    /**
     * Option {@code "--generalNumericSort"}: Sort numerically, using the standard {@link Double#parseDouble(String)}
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
     * <p>
     * The option {@code "--generalNumericSort"} is equivalent to the {@code "-}{@link #g g}{@code "} option.
     */
    public final SortOptionSet_bcdfgmru generalNumericSort = SortOptionSet_bcdfgmru.Active_g_long;
    /**
     * Option {@code "-h"}: Sort numerically, first by numeric sign (negative, zero, or
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
     * <p>
     * The option {@code "-h"} is equivalent to the {@code "--}{@link #humanNumericSort humanNumericSort}{@code "} option.
     */
    public final SortOptionSet_bcdfhmru h = SortOptionSet_bcdfhmru.Active_h;
    /**
     * Option {@code "--humanNumericSort"}: Sort numerically, first by numeric sign (negative, zero, or
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
     * <p>
     * The option {@code "--humanNumericSort"} is equivalent to the {@code "-}{@link #h h}{@code "} option.
     */
    public final SortOptionSet_bcdfhmru humanNumericSort = SortOptionSet_bcdfhmru.Active_h_long;
    /**
     * Option {@code "-f"}: Consider all lowercase characters that have uppercase equivalents to
     * be the uppercase equivalent for the purposes of comparison.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-f"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru f = SortOptionSet_MVbcdfghmnru.Active_f;
    /**
     * Option {@code "--ignoreCase"}: Consider all lowercase characters that have uppercase equivalents to
     * be the uppercase equivalent for the purposes of comparison.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #f f}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru ignoreCase = SortOptionSet_MVbcdfghmnru.Active_f_long;
    /**
     * Option {@code "-b"}: Ignore leading blanks.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-b"} is equivalent to the {@code "--}{@link #ignoreLeadingBlanks ignoreLeadingBlanks}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru b = SortOptionSet_MVbcdfghmnru.Active_b;
    /**
     * Option {@code "--ignoreLeadingBlanks"}: Ignore leading blanks.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--ignoreLeadingBlanks"} is equivalent to the {@code "-}{@link #b b}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru ignoreLeadingBlanks = SortOptionSet_MVbcdfghmnru.Active_b_long;
    /**
     * Option {@code "-m"}: Merge only; the input file are assumed to be already sorted.
     * <p>
     * The option {@code "-m"} is equivalent to the {@code "--}{@link #merge merge}{@code "} option.
     */
    public final SortOptionSet_MVbdfghmnru m = SortOptionSet_MVbdfghmnru.Active_m;
    /**
     * Option {@code "--merge"}: Merge only; the input file are assumed to be already sorted.
     * <p>
     * The option {@code "--merge"} is equivalent to the {@code "-}{@link #m m}{@code "} option.
     */
    public final SortOptionSet_MVbdfghmnru merge = SortOptionSet_MVbdfghmnru.Active_m_long;
    /**
     * Option {@code "-M"}: An initial string, consisting of any amount of blanks, followed by a
     * month name abbreviation, is folded to UPPER case and compared in the
     * order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
     * determines the month spellings.
     * <p>
     * The option {@code "-M"} is equivalent to the {@code "--}{@link #monthSort monthSort}{@code "} option.
     */
    public final SortOptionSet_Mbcdfmru M = SortOptionSet_Mbcdfmru.Active_M;
    /**
     * Option {@code "--monthSort"}: An initial string, consisting of any amount of blanks, followed by a
     * month name abbreviation, is folded to UPPER case and compared in the
     * order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
     * determines the month spellings.
     * <p>
     * The option {@code "--monthSort"} is equivalent to the {@code "-}{@link #M M}{@code "} option.
     */
    public final SortOptionSet_Mbcdfmru monthSort = SortOptionSet_Mbcdfmru.Active_M_long;
    /**
     * Option {@code "-n"}: Sort numerically; the number begins each line and consists of
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
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #numericSort numericSort}{@code "} option.
     */
    public final SortOptionSet_bcdfmnru n = SortOptionSet_bcdfmnru.Active_n;
    /**
     * Option {@code "--numericSort"}: Sort numerically; the number begins each line and consists of
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
     * <p>
     * The option {@code "--numericSort"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     */
    public final SortOptionSet_bcdfmnru numericSort = SortOptionSet_bcdfmnru.Active_n_long;
    /**
     * Option {@code "-r"}: Reverse the sense of comparisons.
     * <p>
     * The option {@code "-r"} is equivalent to the {@code "--}{@link #reverse reverse}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru r = SortOptionSet_MVbcdfghmnru.Active_r;
    /**
     * Option {@code "--reverse"}: Reverse the sense of comparisons.
     * <p>
     * The option {@code "--reverse"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru reverse = SortOptionSet_MVbcdfghmnru.Active_r_long;
    /**
     * Option {@code "-u"}: Unique: suppress all but one in each set of lines having equal keys.
     * If used with the {@code -c} option, checks that there are no lines
     * with duplicate keys, in addition to checking that the input file is
     * sorted.
     * <p>
     * The option {@code "-u"} is equivalent to the {@code "--}{@link #unique unique}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru u = SortOptionSet_MVbcdfghmnru.Active_u;
    /**
     * Option {@code "--unique"}: Unique: suppress all but one in each set of lines having equal keys.
     * If used with the {@code -c} option, checks that there are no lines
     * with duplicate keys, in addition to checking that the input file is
     * sorted.
     * <p>
     * The option {@code "--unique"} is equivalent to the {@code "-}{@link #u u}{@code "} option.
     */
    public final SortOptionSet_MVbcdfghmnru unique = SortOptionSet_MVbcdfghmnru.Active_u_long;
    /**
     * Option {@code "-V"}: Sort by version name and number. It behaves like a standard sort,
     * except that each sequence of decimal digits is treated numerically
     * as an index/version number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-V"} is equivalent to the {@code "--}{@link #versionSort versionSort}{@code "} option.
     */
    public final SortOptionSet_Vbcdfmru V = SortOptionSet_Vbcdfmru.Active_V;
    /**
     * Option {@code "--versionSort"}: Sort by version name and number. It behaves like a standard sort,
     * except that each sequence of decimal digits is treated numerically
     * as an index/version number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--versionSort"} is equivalent to the {@code "-}{@link #V V}{@code "} option.
     */
    public final SortOptionSet_Vbcdfmru versionSort = SortOptionSet_Vbcdfmru.Active_V_long;

}
