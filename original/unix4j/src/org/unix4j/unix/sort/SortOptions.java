package org.unix4j.unix.sort;

import java.util.Collections;
import java.util.Iterator;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;

import org.unix4j.unix.Sort;
import org.unix4j.unix.sort.SortOption;

/**
 * Interface implemented by all option sets for the {@link Sort sort} command.
 * It is recommended to use {@link Sort#Options} to specify a valid 
 * combination of options.
 * <p>
 * The options for the sort command are: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --check}</td><td>&nbsp;</td><td>Checks that the single input file is ordered as specified by the
			arguments and the collating sequence of the current locale. No 
			output is produced; only the exit code is affected.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --merge}</td><td>&nbsp;</td><td>Merge only; the input file are assumed to be already sorted.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -u}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --unique}</td><td>&nbsp;</td><td>Unique: suppress all but one in each set of lines having equal keys.
			If used with the {@code -c} option, checks that there are no lines 
			with duplicate keys, in addition to checking that the input file is 
			sorted.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -b}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreLeadingBlanks}</td><td>&nbsp;</td><td>Ignore leading blanks. 
			(This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --dictionaryOrder}</td><td>&nbsp;</td><td>Consider only blanks and alphanumeric characters.
			(This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Consider all lowercase characters that have uppercase equivalents to
			be the uppercase equivalent for the purposes of comparison.
			(This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numericSort}</td><td>&nbsp;</td><td>Sort numerically; the number begins each line and consists of 
			optional blanks, an optional minus sign, and zero or more digits
			possibly separated by thousands separators, optionally followed by a
			decimal-point character and zero or more digits. An empty number is
			treated as '0'. The current local specifies the decimal-point 
			character and thousands separator.
			<p>
			Comparison is exact; there is no rounding error.
			<p>
			Neither a leading '+' nor exponential notation is recognized. To 
			compare such strings numerically, use the
			{@code -genericNumericSort (-g)} option. 
<p>
			(This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --generalNumericSort}</td><td>&nbsp;</td><td>Sort numerically, using the standard {@link Double#parseDouble(String)}  
			function to convert a trimmed line to a double-precision floating 
			point number. This allows floating point numbers to be specified in 
			scientific notation, like 1.0e-34 and 10e100. 
			<p>
			Uses the following collating sequence: Lines that cannot be parsed 
			because they do not represent valid double values (in alpha-numeric
			order); "-Infinity"; finite numbers in ascending numeric order 
			(with -0 < +0); "Infinity"; "NaN".
<p>
			This option is usually slower than {@code -numeric-sort (-n)} and it
			can lose information when converting to floating point.		
		<p>
			(This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -h}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --humanNumericSort}</td><td>&nbsp;</td><td>Sort numerically, first by numeric sign (negative, zero, or 
			positive); then by SI suffix (either empty, or 'k' or 'K', or one 
			of 'MGTPEZY', in that order); and finally by numeric value. For
			example, '1023M' sorts before '1G' because 'M' (mega) precedes 'G' 
			(giga) as an SI suffix. 
			<p>
			This option sorts values that are consistently scaled to the nearest
			suffix, regardless of whether suffixes denote powers of 1000 or
			1024, and it therefore sorts the output of any single invocation of 
			the {@code ls} command that are invoked with the --human-readable 
			option. 
			<p>
			The syntax for numbers is the same as for the
			{@code --numericSort (-n)} option; the SI suffix must immediately 
			follow the number. 		
<p>
			(This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -M}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --monthSort}</td><td>&nbsp;</td><td>An initial string, consisting of any amount of blanks, followed by a
			month name abbreviation, is folded to UPPER case and compared in the
			order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
			determines the month spellings.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -V}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --versionSort}</td><td>&nbsp;</td><td>Sort by version name and number. It behaves like a standard sort, 
			except that each sequence of decimal digits is treated numerically 
			as an index/version number.
			<p>
			(This option is ignored if a comparator operand is present).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --reverse}</td><td>&nbsp;</td><td>Reverse the sense of comparisons.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface SortOptions extends OptionSet<SortOption> {
	/**
	 * Constant for an empty option set.
	 */
	SortOptions EMPTY = new SortOptions() {
		@Override
		public Class<SortOption> optionType() {
			return SortOption.class;
		}
		@Override
		public boolean isSet(SortOption option) {
			return false;
		}
		/**
		 * Returns 0 as this is a set with no active options.
		 * 
		 * @return zero
		 */
		@Override
		public int size() {
			return 0;
		}
		/**
		 * Returns an immutable empty set.
		 * 
		 * @return an immutable empty set.
		 */
		@Override
		public java.util.Set<SortOption> asSet() {
			return Collections.emptySet();
		}
		
		/**
		 * Returns an iterator returning no elements. 
		 * 
		 * @return an immutable iterator with no elements.
		 */
		@Override
		public Iterator<SortOption> iterator() {
			return asSet().iterator();
		}
		
		/**
		 * Returns true if the {@link Option#acronym() acronym} should be used
		 * for the specified {@code option} in string representations. 
		 * <p>
		 * This method returns always true;
		 *  
		 * @param option
		 *            the option of interest
		 * @return always true
		 */
		@Override
		public boolean useAcronymFor(SortOption option) {
			return true;
		}
	};
	/**
	 * Default implementation for a modifiable option set.
	 */
	class Default extends DefaultOptionSet<SortOption> implements SortOptions {
		/**
		 * Default constructor for an empty option set with no active options.
		 */
		public Default() {
			super(SortOption.class);
		}
		/**
		 * Constructor for an option set with a single active option.
		 * @param option the option to be set
		 */
		public Default(SortOption option) {
			super(option);
		}
		/**
		 * Constructor for an option set with the given active options.
		 * @param options the options to be set
		 */
		public Default(SortOption... options) {
			this();
			setAll(options);
		}
		/**
		 * Constructor for an option set initialized with the options given by
		 * another option set.
		 * 
		 * @param optionSet set with the options to be active
		 */
		public Default(OptionSet<SortOption> optionSet) {
			this();
			setAll(optionSet);
		}
	}
	
	/**
	 * Value converter for {@link SortOptions} based on an {@link OptionSetConverter}. 
	 */
	ValueConverter<SortOptions> CONVERTER = new ValueConverter<SortOptions>() {
		private final OptionSetConverter<SortOption> converter = new OptionSetConverter<SortOption>(SortOption.class);
		@Override
		public SortOptions convert(Object value) {
			final OptionSet<SortOption> set = converter.convert(value);
			return set == null ? null : new Default(set);
		}
	};
}
