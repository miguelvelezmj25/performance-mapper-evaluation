package org.unix4j.unix.uniq;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;
import org.unix4j.unix.Uniq;

import java.util.Collections;
import java.util.Iterator;

/**
 * Interface implemented by all option sets for the {@link Uniq uniq} command.
 * It is recommended to use {@link Uniq#Options} to specify a valid
 * combination of options.
 * <p>
 * The options for the uniq command are:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --count}</td><td>&nbsp;</td><td>Precedes each output line with a count of the number of times the
 * line occurred in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --duplicatedOnly}</td><td>&nbsp;</td><td>Suppresses the writing of lines that are not repeated in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -u}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --uniqueOnly}</td><td>&nbsp;</td><td>Suppresses the writing of lines that are repeated in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Suppresses repeated lines globally, that is, if lines are
 * non-adjacent. This option guarantees unique output lines even if the
 * input lines are not sorted.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface UniqOptions extends OptionSet<UniqOption> {
    /**
     * Constant for an empty option set.
     */
    UniqOptions EMPTY = new UniqOptions() {
        @Override
        public Class<UniqOption> optionType() {
            return UniqOption.class;
        }

        @Override
        public boolean isSet(UniqOption option) {
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
        public java.util.Set<UniqOption> asSet() {
            return Collections.emptySet();
        }

        /**
         * Returns an iterator returning no elements.
         *
         * @return an immutable iterator with no elements.
         */
        @Override
        public Iterator<UniqOption> iterator() {
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
        public boolean useAcronymFor(UniqOption option) {
            return true;
        }
    };
    /**
     * Value converter for {@link UniqOptions} based on an {@link OptionSetConverter}.
     */
    ValueConverter<UniqOptions> CONVERTER = new ValueConverter<UniqOptions>() {
        private final OptionSetConverter<UniqOption> converter = new OptionSetConverter<UniqOption>(UniqOption.class);

        @Override
        public UniqOptions convert(Object value) {
            final OptionSet<UniqOption> set = converter.convert(value);
            return set == null ? null : new Default(set);
        }
    };

    /**
     * Default implementation for a modifiable option set.
     */
    class Default extends DefaultOptionSet<UniqOption> implements UniqOptions {
        /**
         * Default constructor for an empty option set with no active options.
         */
        public Default() {
            super(UniqOption.class);
        }

        /**
         * Constructor for an option set with a single active option.
         *
         * @param option the option to be set
         */
        public Default(UniqOption option) {
            super(option);
        }

        /**
         * Constructor for an option set with the given active options.
         *
         * @param options the options to be set
         */
        public Default(UniqOption... options) {
            this();
            setAll(options);
        }

        /**
         * Constructor for an option set initialized with the options given by
         * another option set.
         *
         * @param optionSet set with the options to be active
         */
        public Default(OptionSet<UniqOption> optionSet) {
            this();
            setAll(optionSet);
        }
    }
}
