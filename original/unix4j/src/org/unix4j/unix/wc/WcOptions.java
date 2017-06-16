package org.unix4j.unix.wc;

import java.util.Collections;
import java.util.Iterator;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;

import org.unix4j.unix.Wc;
import org.unix4j.unix.wc.WcOption;

/**
 * Interface implemented by all option sets for the {@link Wc wc} command.
 * It is recommended to use {@link Wc#Options} to specify a valid 
 * combination of options.
 * <p>
 * The options for the wc command are: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lines}</td><td>&nbsp;</td><td>Executes a count of lines and writes this count to the output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -w}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --words}</td><td>&nbsp;</td><td>Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>Executes a count of chars and writes this count to the output.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface WcOptions extends OptionSet<WcOption> {
	/**
	 * Constant for an empty option set.
	 */
	WcOptions EMPTY = new WcOptions() {
		@Override
		public Class<WcOption> optionType() {
			return WcOption.class;
		}
		@Override
		public boolean isSet(WcOption option) {
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
		public java.util.Set<WcOption> asSet() {
			return Collections.emptySet();
		}
		
		/**
		 * Returns an iterator returning no elements. 
		 * 
		 * @return an immutable iterator with no elements.
		 */
		@Override
		public Iterator<WcOption> iterator() {
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
		public boolean useAcronymFor(WcOption option) {
			return true;
		}
	};
	/**
	 * Default implementation for a modifiable option set.
	 */
	class Default extends DefaultOptionSet<WcOption> implements WcOptions {
		/**
		 * Default constructor for an empty option set with no active options.
		 */
		public Default() {
			super(WcOption.class);
		}
		/**
		 * Constructor for an option set with a single active option.
		 * @param option the option to be set
		 */
		public Default(WcOption option) {
			super(option);
		}
		/**
		 * Constructor for an option set with the given active options.
		 * @param options the options to be set
		 */
		public Default(WcOption... options) {
			this();
			setAll(options);
		}
		/**
		 * Constructor for an option set initialized with the options given by
		 * another option set.
		 * 
		 * @param optionSet set with the options to be active
		 */
		public Default(OptionSet<WcOption> optionSet) {
			this();
			setAll(optionSet);
		}
	}
	
	/**
	 * Value converter for {@link WcOptions} based on an {@link OptionSetConverter}. 
	 */
	ValueConverter<WcOptions> CONVERTER = new ValueConverter<WcOptions>() {
		private final OptionSetConverter<WcOption> converter = new OptionSetConverter<WcOption>(WcOption.class);
		@Override
		public WcOptions convert(Object value) {
			final OptionSet<WcOption> set = converter.convert(value);
			return set == null ? null : new Default(set);
		}
	};
}
