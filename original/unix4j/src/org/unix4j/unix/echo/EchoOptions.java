package org.unix4j.unix.echo;

import java.util.Collections;
import java.util.Iterator;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;

import org.unix4j.unix.Echo;
import org.unix4j.unix.echo.EchoOption;

/**
 * Interface implemented by all option sets for the {@link Echo echo} command.
 * It is recommended to use {@link Echo#Options} to specify a valid 
 * combination of options.
 * <p>
 * The options for the echo command are: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noNewline}</td><td>&nbsp;</td><td>Do not print the trailing newline character(s).</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface EchoOptions extends OptionSet<EchoOption> {
	/**
	 * Constant for an empty option set.
	 */
	EchoOptions EMPTY = new EchoOptions() {
		@Override
		public Class<EchoOption> optionType() {
			return EchoOption.class;
		}
		@Override
		public boolean isSet(EchoOption option) {
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
		public java.util.Set<EchoOption> asSet() {
			return Collections.emptySet();
		}
		
		/**
		 * Returns an iterator returning no elements. 
		 * 
		 * @return an immutable iterator with no elements.
		 */
		@Override
		public Iterator<EchoOption> iterator() {
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
		public boolean useAcronymFor(EchoOption option) {
			return true;
		}
	};
	/**
	 * Default implementation for a modifiable option set.
	 */
	class Default extends DefaultOptionSet<EchoOption> implements EchoOptions {
		/**
		 * Default constructor for an empty option set with no active options.
		 */
		public Default() {
			super(EchoOption.class);
		}
		/**
		 * Constructor for an option set with a single active option.
		 * @param option the option to be set
		 */
		public Default(EchoOption option) {
			super(option);
		}
		/**
		 * Constructor for an option set with the given active options.
		 * @param options the options to be set
		 */
		public Default(EchoOption... options) {
			this();
			setAll(options);
		}
		/**
		 * Constructor for an option set initialized with the options given by
		 * another option set.
		 * 
		 * @param optionSet set with the options to be active
		 */
		public Default(OptionSet<EchoOption> optionSet) {
			this();
			setAll(optionSet);
		}
	}
	
	/**
	 * Value converter for {@link EchoOptions} based on an {@link OptionSetConverter}. 
	 */
	ValueConverter<EchoOptions> CONVERTER = new ValueConverter<EchoOptions>() {
		private final OptionSetConverter<EchoOption> converter = new OptionSetConverter<EchoOption>(EchoOption.class);
		@Override
		public EchoOptions convert(Object value) {
			final OptionSet<EchoOption> set = converter.convert(value);
			return set == null ? null : new Default(set);
		}
	};
}
