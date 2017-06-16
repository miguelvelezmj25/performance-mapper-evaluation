package org.unix4j.unix.tail;

import java.util.Collections;
import java.util.Iterator;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;

import org.unix4j.unix.Tail;
import org.unix4j.unix.tail.TailOption;

/**
 * Interface implemented by all option sets for the {@link Tail tail} command.
 * It is recommended to use {@link Tail#Options} to specify a valid 
 * combination of options.
 * <p>
 * The options for the tail command are: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The {@code count} argument is in units of characters instead of 
			lines. Starts from 1 and includes line ending characters.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -q}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --suppressHeaders}</td><td>&nbsp;</td><td>Suppresses printing of headers when multiple files are being
			examined.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --countFromStart}</td><td>&nbsp;</td><td>The {@code count} argument is relative to the beginning of the file
			instead of counting from the end of the file. For instance, 
			{@code tail -s 10} prints the lines starting from line 10;
			{@code tail -s 1} prints the whole file.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface TailOptions extends OptionSet<TailOption> {
	/**
	 * Constant for an empty option set.
	 */
	TailOptions EMPTY = new TailOptions() {
		@Override
		public Class<TailOption> optionType() {
			return TailOption.class;
		}
		@Override
		public boolean isSet(TailOption option) {
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
		public java.util.Set<TailOption> asSet() {
			return Collections.emptySet();
		}
		
		/**
		 * Returns an iterator returning no elements. 
		 * 
		 * @return an immutable iterator with no elements.
		 */
		@Override
		public Iterator<TailOption> iterator() {
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
		public boolean useAcronymFor(TailOption option) {
			return true;
		}
	};
	/**
	 * Default implementation for a modifiable option set.
	 */
	class Default extends DefaultOptionSet<TailOption> implements TailOptions {
		/**
		 * Default constructor for an empty option set with no active options.
		 */
		public Default() {
			super(TailOption.class);
		}
		/**
		 * Constructor for an option set with a single active option.
		 * @param option the option to be set
		 */
		public Default(TailOption option) {
			super(option);
		}
		/**
		 * Constructor for an option set with the given active options.
		 * @param options the options to be set
		 */
		public Default(TailOption... options) {
			this();
			setAll(options);
		}
		/**
		 * Constructor for an option set initialized with the options given by
		 * another option set.
		 * 
		 * @param optionSet set with the options to be active
		 */
		public Default(OptionSet<TailOption> optionSet) {
			this();
			setAll(optionSet);
		}
	}
	
	/**
	 * Value converter for {@link TailOptions} based on an {@link OptionSetConverter}. 
	 */
	ValueConverter<TailOptions> CONVERTER = new ValueConverter<TailOptions>() {
		private final OptionSetConverter<TailOption> converter = new OptionSetConverter<TailOption>(TailOption.class);
		@Override
		public TailOptions convert(Object value) {
			final OptionSet<TailOption> set = converter.convert(value);
			return set == null ? null : new Default(set);
		}
	};
}
