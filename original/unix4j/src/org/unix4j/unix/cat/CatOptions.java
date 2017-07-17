package org.unix4j.unix.cat;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;
import org.unix4j.unix.Cat;

import java.util.Collections;
import java.util.Iterator;

/**
 * Interface implemented by all option sets for the {@link Cat cat} command.
 * It is recommended to use {@link Cat#Options} to specify a valid
 * combination of options.
 * <p>
 * The options for the cat command are:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -b}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberNonBlankLines}</td><td>&nbsp;</td><td>Number the non-blank output lines, starting at 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberLines}</td><td>&nbsp;</td><td>Number the output lines, starting at 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --squeezeEmptyLines}</td><td>&nbsp;</td><td>Squeeze multiple adjacent empty lines, causing the output to be
 * single spaced.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface CatOptions extends OptionSet<CatOption> {
    /**
     * Constant for an empty option set.
     */
    CatOptions EMPTY = new CatOptions() {
        @Override
        public Class<CatOption> optionType() {
            return CatOption.class;
        }

        @Override
        public boolean isSet(CatOption option) {
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
        public java.util.Set<CatOption> asSet() {
            return Collections.emptySet();
        }

        /**
         * Returns an iterator returning no elements.
         *
         * @return an immutable iterator with no elements.
         */
        @Override
        public Iterator<CatOption> iterator() {
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
        public boolean useAcronymFor(CatOption option) {
            return true;
        }
    };
    /**
     * Value converter for {@link CatOptions} based on an {@link OptionSetConverter}.
     */
    ValueConverter<CatOptions> CONVERTER = new ValueConverter<CatOptions>() {
        private final OptionSetConverter<CatOption> converter = new OptionSetConverter<CatOption>(CatOption.class);

        @Override
        public CatOptions convert(Object value) {
            final OptionSet<CatOption> set = converter.convert(value);
            return set == null ? null : new Default(set);
        }
    };

    /**
     * Default implementation for a modifiable option set.
     */
    class Default extends DefaultOptionSet<CatOption> implements CatOptions {
        /**
         * Default constructor for an empty option set with no active options.
         */
        public Default() {
            super(CatOption.class);
        }

        /**
         * Constructor for an option set with a single active option.
         *
         * @param option the option to be set
         */
        public Default(CatOption option) {
            super(option);
        }

        /**
         * Constructor for an option set with the given active options.
         *
         * @param options the options to be set
         */
        public Default(CatOption... options) {
            this();
            setAll(options);
        }

        /**
         * Constructor for an option set initialized with the options given by
         * another option set.
         *
         * @param optionSet set with the options to be active
         */
        public Default(OptionSet<CatOption> optionSet) {
            this();
            setAll(optionSet);
        }
    }
}
