package org.unix4j.unix.head;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;
import org.unix4j.unix.Head;

import java.util.Collections;
import java.util.Iterator;

/**
 * Interface implemented by all option sets for the {@link Head head} command.
 * It is recommended to use {@link Head#Options} to specify a valid
 * combination of options.
 * <p>
 * The options for the head command are:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The {@code count} argument is in units of characters instead of
 * lines. Starts from 1 and includes line ending characters.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -q}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --suppressHeaders}</td><td>&nbsp;</td><td>Suppresses printing of headers when multiple files are being
 * examined.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface HeadOptions extends OptionSet<HeadOption> {
    /**
     * Constant for an empty option set.
     */
    HeadOptions EMPTY = new HeadOptions() {
        @Override
        public Class<HeadOption> optionType() {
            return HeadOption.class;
        }

        @Override
        public boolean isSet(HeadOption option) {
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
        public java.util.Set<HeadOption> asSet() {
            return Collections.emptySet();
        }

        /**
         * Returns an iterator returning no elements.
         *
         * @return an immutable iterator with no elements.
         */
        @Override
        public Iterator<HeadOption> iterator() {
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
        public boolean useAcronymFor(HeadOption option) {
            return true;
        }
    };
    /**
     * Value converter for {@link HeadOptions} based on an {@link OptionSetConverter}.
     */
    ValueConverter<HeadOptions> CONVERTER = new ValueConverter<HeadOptions>() {
        private final OptionSetConverter<HeadOption> converter = new OptionSetConverter<HeadOption>(HeadOption.class);

        @Override
        public HeadOptions convert(Object value) {
            final OptionSet<HeadOption> set = converter.convert(value);
            return set == null ? null : new Default(set);
        }
    };

    /**
     * Default implementation for a modifiable option set.
     */
    class Default extends DefaultOptionSet<HeadOption> implements HeadOptions {
        /**
         * Default constructor for an empty option set with no active options.
         */
        public Default() {
            super(HeadOption.class);
        }

        /**
         * Constructor for an option set with a single active option.
         *
         * @param option the option to be set
         */
        public Default(HeadOption option) {
            super(option);
        }

        /**
         * Constructor for an option set with the given active options.
         *
         * @param options the options to be set
         */
        public Default(HeadOption... options) {
            this();
            setAll(options);
        }

        /**
         * Constructor for an option set initialized with the options given by
         * another option set.
         *
         * @param optionSet set with the options to be active
         */
        public Default(OptionSet<HeadOption> optionSet) {
            this();
            setAll(optionSet);
        }
    }
}
