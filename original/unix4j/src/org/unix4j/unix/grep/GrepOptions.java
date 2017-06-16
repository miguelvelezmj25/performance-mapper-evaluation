package org.unix4j.unix.grep;

import java.util.Collections;
import java.util.Iterator;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;

import org.unix4j.unix.Grep;
import org.unix4j.unix.grep.GrepOption;

/**
 * Interface implemented by all option sets for the {@link Grep grep} command.
 * It is recommended to use {@link Grep#Options} to specify a valid 
 * combination of options.
 * <p>
 * The options for the grep command are: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Match lines ignoring the case when comparing the strings, also known
			from Unix with its acronym 'i'.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -v}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --invertMatch}</td><td>&nbsp;</td><td>Invert the match result, that is, a non-matching line is written to
			the output and a matching line is not. This option is also known 
			from Unix with its acronym 'v'.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -F}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fixedStrings}</td><td>&nbsp;</td><td>Use fixed-strings matching instead of regular expressions. This is
			usually faster than the standard regexp version.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Prefix each line of output with the line number within its input
			file.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --count}</td><td>&nbsp;</td><td>Suppress normal output; instead print a count of matching lines for
			each input file. With the {@code -v}, {@code --invertMatch} option,
			count non-matching lines.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --matchingFiles}</td><td>&nbsp;</td><td>Suppress normal output; instead print the name of each input file
			from which output would normally have been printed. The scanning
			will stop on the first match.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --wholeLine}</td><td>&nbsp;</td><td>Select only those matches that exactly match the whole line
			excluding the terminating line ending.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface GrepOptions extends OptionSet<GrepOption> {
	/**
	 * Constant for an empty option set.
	 */
	GrepOptions EMPTY = new GrepOptions() {
		@Override
		public Class<GrepOption> optionType() {
			return GrepOption.class;
		}
		@Override
		public boolean isSet(GrepOption option) {
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
		public java.util.Set<GrepOption> asSet() {
			return Collections.emptySet();
		}
		
		/**
		 * Returns an iterator returning no elements. 
		 * 
		 * @return an immutable iterator with no elements.
		 */
		@Override
		public Iterator<GrepOption> iterator() {
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
		public boolean useAcronymFor(GrepOption option) {
			return true;
		}
	};
	/**
	 * Default implementation for a modifiable option set.
	 */
	class Default extends DefaultOptionSet<GrepOption> implements GrepOptions {
		/**
		 * Default constructor for an empty option set with no active options.
		 */
		public Default() {
			super(GrepOption.class);
		}
		/**
		 * Constructor for an option set with a single active option.
		 * @param option the option to be set
		 */
		public Default(GrepOption option) {
			super(option);
		}
		/**
		 * Constructor for an option set with the given active options.
		 * @param options the options to be set
		 */
		public Default(GrepOption... options) {
			this();
			setAll(options);
		}
		/**
		 * Constructor for an option set initialized with the options given by
		 * another option set.
		 * 
		 * @param optionSet set with the options to be active
		 */
		public Default(OptionSet<GrepOption> optionSet) {
			this();
			setAll(optionSet);
		}
	}
	
	/**
	 * Value converter for {@link GrepOptions} based on an {@link OptionSetConverter}. 
	 */
	ValueConverter<GrepOptions> CONVERTER = new ValueConverter<GrepOptions>() {
		private final OptionSetConverter<GrepOption> converter = new OptionSetConverter<GrepOption>(GrepOption.class);
		@Override
		public GrepOptions convert(Object value) {
			final OptionSet<GrepOption> set = converter.convert(value);
			return set == null ? null : new Default(set);
		}
	};
}
