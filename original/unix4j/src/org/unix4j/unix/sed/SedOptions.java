package org.unix4j.unix.sed;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;
import org.unix4j.unix.Sed;

import java.util.Collections;
import java.util.Iterator;

/**
 * Interface implemented by all option sets for the {@link Sed sed} command.
 * It is recommended to use {@link Sed#Options} to specify a valid
 * combination of options.
 * <p>
 * The options for the sed command are:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --quiet}</td><td>&nbsp;</td><td>Suppress the default output (in which each line, after it is
 * examined for editing, is written to standard output). Only lines
 * explicitly selected for output are written.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Globally substitute for all non-overlapping instances of the regexp
 * rather than just the first one.
 * <p>
 * (This option is ignored if the occurrence operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -p}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print}</td><td>&nbsp;</td><td>Write the matched line to standard output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Writes the current line number on a separate line to the standard
 * output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -I}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive pattern matching.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --substitute}</td><td>&nbsp;</td><td>Substitutes the replacement string for instances of the regexp in
 * the matched line.
 * <p>
 * An ampersand ('&') appearing in the replacement is be replaced
 * by the line matching the regexp. The characters "\n", where n is a
 * digit, are replaced by the text matched by the corresponding
 * backreference expression.  The special meaning of '&' and "\n"
 * in this context can be suppressed by preceding it by a backslash.
 * <p>
 * A line can be split by substituting a newline ('\n') into it.
 * <p>
 * A substitution is considered to have been performed even if the
 * replacement string is identical to the string that it replaces.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --append}</td><td>&nbsp;</td><td>Append string2 as a separate line after the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --insert}</td><td>&nbsp;</td><td>Insert string2 as a separate line before the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --change}</td><td>&nbsp;</td><td>Write string2 as a separate line instead of the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delete}</td><td>&nbsp;</td><td>Delete the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -y}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --translate}</td><td>&nbsp;</td><td>Replace all occurrences of characters in string1 with the
 * corresponding characters in string2. If the number of characters in
 * the two strings are not equal, or if any of the characters in
 * string1 appear more than once, the results are undefined.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface SedOptions extends OptionSet<SedOption> {
    /**
     * Constant for an empty option set.
     */
    SedOptions EMPTY = new SedOptions() {
        @Override
        public Class<SedOption> optionType() {
            return SedOption.class;
        }

        @Override
        public boolean isSet(SedOption option) {
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
        public java.util.Set<SedOption> asSet() {
            return Collections.emptySet();
        }

        /**
         * Returns an iterator returning no elements.
         *
         * @return an immutable iterator with no elements.
         */
        @Override
        public Iterator<SedOption> iterator() {
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
        public boolean useAcronymFor(SedOption option) {
            return true;
        }
    };
    /**
     * Value converter for {@link SedOptions} based on an {@link OptionSetConverter}.
     */
    ValueConverter<SedOptions> CONVERTER = new ValueConverter<SedOptions>() {
        private final OptionSetConverter<SedOption> converter = new OptionSetConverter<SedOption>(SedOption.class);

        @Override
        public SedOptions convert(Object value) {
            final OptionSet<SedOption> set = converter.convert(value);
            return set == null ? null : new Default(set);
        }
    };

    /**
     * Default implementation for a modifiable option set.
     */
    class Default extends DefaultOptionSet<SedOption> implements SedOptions {
        /**
         * Default constructor for an empty option set with no active options.
         */
        public Default() {
            super(SedOption.class);
        }

        /**
         * Constructor for an option set with a single active option.
         *
         * @param option the option to be set
         */
        public Default(SedOption option) {
            super(option);
        }

        /**
         * Constructor for an option set with the given active options.
         *
         * @param options the options to be set
         */
        public Default(SedOption... options) {
            this();
            setAll(options);
        }

        /**
         * Constructor for an option set initialized with the options given by
         * another option set.
         *
         * @param optionSet set with the options to be active
         */
        public Default(OptionSet<SedOption> optionSet) {
            this();
            setAll(optionSet);
        }
    }
}
