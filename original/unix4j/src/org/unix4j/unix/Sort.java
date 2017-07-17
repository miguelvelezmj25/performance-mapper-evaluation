package org.unix4j.unix;

import org.unix4j.command.CommandInterface;
import org.unix4j.unix.sort.SortFactory;
import org.unix4j.unix.sort.SortOption;
import org.unix4j.unix.sort.SortOptionSets;
import org.unix4j.unix.sort.SortOptions;

/**
 * Non-instantiable module with inner types making up the <b>sort</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * sort - sort, merge, or sequence check text files
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort <comparator>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort <comparator> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort <comparator> <paths>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort [-cmubdfnghMVr]}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort [-cmubdfnghMVr] <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort [-cmubdfnghMVr] <paths>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort [-cmubdfnghMVr] <comparator>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort [-cmubdfnghMVr] <comparator> <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sort [-cmubdfnghMVr] <comparator> <paths>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>	The sort utility performs one of the following functions:	<ol>		<li>			Sort lines of all the named files together and write the result to 			the specified output.		</li>		<li>			Merge lines of all the named (presorted) files together and write 			the result to the specified output.		</li>		<li>			Check that a single input file is correctly presorted.				</li>	</ol></p><p>	Comparisons are based on one or more sort keys/fields extracted from each 	line of input. If no sort keys/fields are specified, comparisons are based 	on the entire line up to, but not including, the terminating 	&lt;newline&gt;. All comparisons are performed using the collating sequence 	of the current locale.</p><p>	Sorting is stable, that is, the ordering of input lines is preserved if they	are considered equal according to the current comparison criteria (if two 	lines originate from different input files, the index of the file in the	input arguments list defines the ordering of the lines). </p>
 * <p>
 * <p>
 * <b>NOTES</b>
 * <p>
 * <ul>
 * <li>A <newline> is added to the end of an input line if it is not
 * properly terminated with a line ending (usually the last line in a file)</li>
 * <p>
 * <li>The following sort order options are currently not supported: {@code dictionaryOrder}, {@code humanNumericSort}, {@code monthSort}, {@code versionSort}</li>
 * </ul>
 * <p>
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
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
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <paths>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>Pathnames of the files to be sorted, merged, or checked; wildcards *
 * and ? are supported; relative paths are resolved on the
 * basis of the current working directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <files>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File...}</td><td>&nbsp;</td><td>The files to be sorted or merged; relative paths are not resolved
 * (use the string paths argument to enable relative path resolving
 * based on the current working directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <comparator>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.util.Comparator<? super org.unix4j.line.Line>}</td><td>&nbsp;</td><td>The comparator to use for the line comparisons.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command.
 * Options can be specified by acronym (with a leading dash "-") or by
 * long name (with two leading dashes "--"). Operands other than the
 * default "--paths" operand have to be prefixed with the operand
 * name (e.g. "--comparator" for a subsequent comparator operand value).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code SortOptions}</td><td>&nbsp;</td><td>The options for the sort command.</td></tr>
 * </table>
 */
public final class Sort {
    /**
     * The "sort" command name.
     */
    public static final String NAME = "sort";
    /**
     * Options for the "sort" command: {@link SortOption#check c}, {@link SortOption#merge m}, {@link SortOption#unique u}, {@link SortOption#ignoreLeadingBlanks b}, {@link SortOption#dictionaryOrder d}, {@link SortOption#ignoreCase f}, {@link SortOption#numericSort n}, {@link SortOption#generalNumericSort g}, {@link SortOption#humanNumericSort h}, {@link SortOption#monthSort M}, {@link SortOption#versionSort V}, {@link SortOption#reverse r}.
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
    public static final SortOptionSets Options = SortOptionSets.INSTANCE;
    /**
     * Singleton {@link SortFactory factory} instance for the "sort" command.
     */
    public static final SortFactory Factory = SortFactory.INSTANCE;

    // no instances
    private Sort() {
        super();
    }

    /**
     * Interface defining all method signatures for the "sort" command.
     *
     * @param <R> the generic return type for all command signature methods
     *            to support different implementor types; the methods of a
     *            command factory for instance returns a command instance;
     *            command builders can also implement this interface, but their
     *            methods return the builder itself enabling for chained method
     *            invocation to create joined commands
     */
    public static interface Interface<R> extends CommandInterface<R> {
        /**
         * Sort the lines read from the standard input and writes the result to
         * the standard output.
         * <p>
         * Comparisons are based on the entire line without line ending. The
         * collating sequence of the current locale is used to perform the
         * comparisons.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort.
         *
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort();

        /**
         * Sort the lines of all the specified files together and writes the
         * result to the standard output.
         * <p>
         * Options can be specified by acronym (with a leading dash "-") or by
         * long name (with two leading dashes "--"). Operands other than the
         * default "--paths" operand have to be prefixed with the operand
         * name.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort. If two lines
         * originate from different input files, the index of the file in the
         * input arguments list defines the ordering of the lines.
         *
         * @param args String arguments defining the options and operands for the command.
         *             Options can be specified by acronym (with a leading dash "-") or by
         *             long name (with two leading dashes "--"). Operands other than the
         *             default "--paths" operand have to be prefixed with the operand
         *             name (e.g. "--comparator" for a subsequent comparator operand value).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(String... args);

        /**
         * Sort the lines of all the specified files together and writes the
         * result to the standard output.
         * <p>
         * Comparisons are based on the entire line without line ending. The
         * collating sequence of the current locale is used to perform the
         * comparisons.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort. If two lines
         * originate from different input files, the index of the file in the
         * input arguments list defines the ordering of the lines.
         *
         * @param files The files to be sorted or merged; relative paths are not resolved
         *              (use the string paths argument to enable relative path resolving
         *              based on the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(java.io.File... files);

        /**
         * Sort the lines read from the standard input and writes the result to
         * the standard output.
         * <p>
         * Line comparisons are based on the specified {@code comparator}.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort.
         *
         * @param comparator The comparator to use for the line comparisons.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(java.util.Comparator<? super org.unix4j.line.Line> comparator);

        /**
         * Sort the lines of all the specified files together and writes the
         * result to the standard output.
         * <p>
         * Line comparisons are based on the specified {@code comparator}.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort. If two lines
         * originate from different input files, the index of the file in the
         * input arguments list defines the ordering of the lines.
         *
         * @param comparator The comparator to use for the line comparisons.
         * @param files      The files to be sorted or merged; relative paths are not resolved
         *                   (use the string paths argument to enable relative path resolving
         *                   based on the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(java.util.Comparator<? super org.unix4j.line.Line> comparator, java.io.File... files);

        /**
         * Sort the lines of all the specified files together and writes the
         * result to the standard output.
         * <p>
         * Line comparisons are based on the specified {@code comparator}.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort. If two lines
         * originate from different input files, the index of the file in the
         * input arguments list defines the ordering of the lines.
         *
         * @param comparator The comparator to use for the line comparisons.
         * @param paths      Pathnames of the files to be sorted, merged, or checked; wildcards *
         *                   and ? are supported; relative paths are resolved on the
         *                   basis of the current working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(java.util.Comparator<? super org.unix4j.line.Line> comparator, String... paths);

        /**
         * Sorts, merges, or sequence checks the lines read from the standard
         * input and writes the result to the standard output.
         * <p>
         * Comparisons are based on the entire line without line ending. The
         * collating sequence of the current locale is used to perform the
         * comparisons.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort.
         *
         * @param options The options for the sort command.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(SortOptions options);

        /**
         * Sorts, merges, or sequence checks the lines the lines of all the
         * specified files together and writes the result to the standard
         * output.
         * <p>
         * Comparisons are based on the entire line without line ending. The
         * collating sequence of the current locale is used to perform the
         * comparisons.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort. If two lines
         * originate from different input files, the index of the file in the
         * input arguments list defines the ordering of the lines.
         *
         * @param options The options for the sort command.
         * @param files   The files to be sorted or merged; relative paths are not resolved
         *                (use the string paths argument to enable relative path resolving
         *                based on the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(SortOptions options, java.io.File... files);

        /**
         * Sorts, merges, or sequence checks the lines the lines of all the
         * specified files together and writes the result to the standard
         * output.
         * <p>
         * Comparisons are based on the entire line without line ending. The
         * collating sequence of the current locale is used to perform the
         * comparisons.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort. If two lines
         * originate from different input files, the index of the file in the
         * input arguments list defines the ordering of the lines.
         *
         * @param options The options for the sort command.
         * @param paths   Pathnames of the files to be sorted, merged, or checked; wildcards *
         *                and ? are supported; relative paths are resolved on the
         *                basis of the current working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(SortOptions options, String... paths);

        /**
         * Sorts, merges, or sequence checks the lines read from the standard
         * input and writes the result to the standard output.
         * <p>
         * Line comparisons are based on the specified {@code comparator}.
         * All comparison related options are ignored except for
         * {@code --reverse}.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort.
         *
         * @param options    The options for the sort command.
         * @param comparator The comparator to use for the line comparisons.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator);

        /**
         * Sorts, merges, or sequence checks the lines the lines of all the
         * specified files together and writes the result to the standard
         * output.
         * <p>
         * Line comparisons are based on the specified {@code comparator}.
         * All comparison related options except for {@code --reverse} are
         * ignored.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort. If two lines
         * originate from different input files, the index of the file in the
         * input arguments list defines the ordering of the lines.
         *
         * @param options    The options for the sort command.
         * @param comparator The comparator to use for the line comparisons.
         * @param files      The files to be sorted or merged; relative paths are not resolved
         *                   (use the string paths argument to enable relative path resolving
         *                   based on the current working directory).
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator, java.io.File... files);

        /**
         * Sorts, merges, or sequence checks the lines the lines of all the
         * specified files together and writes the result to the standard
         * output.
         * <p>
         * Line comparisons are based on the specified {@code comparator}.
         * All comparison related options except for {@code --reverse} are
         * ignored.
         * <p>
         * The sort algorithm used is guaranteed to be stable: lines considered
         * equal will not be reordered as a result of the sort. If two lines
         * originate from different input files, the index of the file in the
         * input arguments list defines the ordering of the lines.
         *
         * @param options    The options for the sort command.
         * @param comparator The comparator to use for the line comparisons.
         * @param paths      Pathnames of the files to be sorted, merged, or checked; wildcards *
         *                   and ? are supported; relative paths are resolved on the
         *                   basis of the current working directory.
         * @return the generic type {@code <R>} defined by the implementing class;
         * the command itself returns no value and writes its result to the
         * standard output; see class level parameter comments for more
         * details
         */
        R sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator, String... paths);
    }
}
