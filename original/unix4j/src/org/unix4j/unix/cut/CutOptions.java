package org.unix4j.unix.cut;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;
import org.unix4j.unix.Cut;

import java.util.Collections;
import java.util.Iterator;

/**
 * Interface implemented by all option sets for the {@link Cut cut} command.
 * It is recommended to use {@link Cut#Options} to specify a valid
 * combination of options.
 * <p>
 * The options for the cut command are:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The list specifies character positions.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fields}</td><td>&nbsp;</td><td>The list specifies fields, separated in the input by the field
 * delimiter character (see the -d option.)  Output fields are
 * separated by a single occurrence of the field delimiter character.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface CutOptions extends OptionSet<CutOption> {
    /**
     * Constant for an empty option set.
     */
    CutOptions EMPTY = new CutOptions() {
        @Override
        public Class<CutOption> optionType() {
            return CutOption.class;
        }

        @Override
        public boolean isSet(CutOption option) {
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
        public java.util.Set<CutOption> asSet() {
            return Collections.emptySet();
        }

        /**
         * Returns an iterator returning no elements.
         *
         * @return an immutable iterator with no elements.
         */
        @Override
        public Iterator<CutOption> iterator() {
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
        public boolean useAcronymFor(CutOption option) {
            return true;
        }
    };
    /**
     * Value converter for {@link CutOptions} based on an {@link OptionSetConverter}.
     */
    ValueConverter<CutOptions> CONVERTER = new ValueConverter<CutOptions>() {
        private final OptionSetConverter<CutOption> converter = new OptionSetConverter<CutOption>(CutOption.class);

        @Override
        public CutOptions convert(Object value) {
            final OptionSet<CutOption> set = converter.convert(value);
            return set == null ? null : new Default(set);
        }
    };

    /**
     * Default implementation for a modifiable option set.
     */
    class Default extends DefaultOptionSet<CutOption> implements CutOptions {
        /**
         * Default constructor for an empty option set with no active options.
         */
        public Default() {
            super(CutOption.class);
        }

        /**
         * Constructor for an option set with a single active option.
         *
         * @param option the option to be set
         */
        public Default(CutOption option) {
            super(option);
        }

        /**
         * Constructor for an option set with the given active options.
         *
         * @param options the options to be set
         */
        public Default(CutOption... options) {
            this();
            setAll(options);
        }

        /**
         * Constructor for an option set initialized with the options given by
         * another option set.
         *
         * @param optionSet set with the options to be active
         */
        public Default(OptionSet<CutOption> optionSet) {
            this();
            setAll(optionSet);
        }
    }
}
