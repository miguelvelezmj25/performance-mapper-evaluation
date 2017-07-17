package org.unix4j.unix.ls;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;
import org.unix4j.unix.Ls;

import java.util.Collections;
import java.util.Iterator;

/**
 * Interface implemented by all option sets for the {@link Ls ls} command.
 * It is recommended to use {@link Ls#Options} to specify a valid
 * combination of options.
 * <p>
 * The options for the ls command are:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --allFiles}</td><td>&nbsp;</td><td>Lists all files in the given directory, including hidden files
 * (those whose names start with \".\" in Unix). By default, these
 * files are excluded from the list.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -h}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --humanReadable}</td><td>&nbsp;</td><td>Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --longFormat}</td><td>&nbsp;</td><td>Long format, displaying file types, permissions, number of hard
 * links, owner, group, size, date, and filename.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -R}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --recurseSubdirs}</td><td>&nbsp;</td><td>Recursively lists subdirectories encountered.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --reverseOrder}</td><td>&nbsp;</td><td>Reverses the order of the sort to get reverse collating sequence or
 * oldest first.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeSorted}</td><td>&nbsp;</td><td>Sorts with the primary key being time modified (most recently
 * modified first) and the secondary key being filename in the
 * collating sequence.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface LsOptions extends OptionSet<LsOption> {
    /**
     * Constant for an empty option set.
     */
    LsOptions EMPTY = new LsOptions() {
        @Override
        public Class<LsOption> optionType() {
            return LsOption.class;
        }

        @Override
        public boolean isSet(LsOption option) {
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
        public java.util.Set<LsOption> asSet() {
            return Collections.emptySet();
        }

        /**
         * Returns an iterator returning no elements.
         *
         * @return an immutable iterator with no elements.
         */
        @Override
        public Iterator<LsOption> iterator() {
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
        public boolean useAcronymFor(LsOption option) {
            return true;
        }
    };
    /**
     * Value converter for {@link LsOptions} based on an {@link OptionSetConverter}.
     */
    ValueConverter<LsOptions> CONVERTER = new ValueConverter<LsOptions>() {
        private final OptionSetConverter<LsOption> converter = new OptionSetConverter<LsOption>(LsOption.class);

        @Override
        public LsOptions convert(Object value) {
            final OptionSet<LsOption> set = converter.convert(value);
            return set == null ? null : new Default(set);
        }
    };

    /**
     * Default implementation for a modifiable option set.
     */
    class Default extends DefaultOptionSet<LsOption> implements LsOptions {
        /**
         * Default constructor for an empty option set with no active options.
         */
        public Default() {
            super(LsOption.class);
        }

        /**
         * Constructor for an option set with a single active option.
         *
         * @param option the option to be set
         */
        public Default(LsOption option) {
            super(option);
        }

        /**
         * Constructor for an option set with the given active options.
         *
         * @param options the options to be set
         */
        public Default(LsOption... options) {
            this();
            setAll(options);
        }

        /**
         * Constructor for an option set initialized with the options given by
         * another option set.
         *
         * @param optionSet set with the options to be active
         */
        public Default(OptionSet<LsOption> optionSet) {
            this();
            setAll(optionSet);
        }
    }
}
