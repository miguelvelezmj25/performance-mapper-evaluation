package org.unix4j.unix.xargs;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;
import org.unix4j.unix.Xargs;

import java.util.Collections;
import java.util.Iterator;

/**
 * Interface implemented by all option sets for the {@link Xargs xargs} command.
 * It is recommended to use {@link Xargs#Options} to specify a valid
 * combination of options.
 * <p>
 * The options for the xargs command are:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -z}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delimiter0}</td><td>&nbsp;</td><td>Input items are terminated by a null character instead of by
 * whitespace, and the quotes and backslash are not special (every
 * character is taken literally). Disables the end of file string,
 * which is treated like any other argument. Useful when input items
 * might contain white space, quote marks, or backslashes. The find
 * --print0 option produces input suitable for this mode.
 * <p>
 * (This option is ignored if an explicit delimiter operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --exactArgs}</td><td>&nbsp;</td><td>Terminate immediately if {@code maxArgs} is specified but the found
 * number of variable items is less than {@code maxArgs}.
 * <p>
 * (This option is ignored if no {@code maxArgs} operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noRunIfEmpty}</td><td>&nbsp;</td><td>If the standard input does not contain any nonblanks, do not run the
 * command. Normally, the command is run once even if there is no
 * input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --verbose}</td><td>&nbsp;</td><td>Print the command line on the standard error output before executing
 * it.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface XargsOptions extends OptionSet<XargsOption> {
    /**
     * Constant for an empty option set.
     */
    XargsOptions EMPTY = new XargsOptions() {
        @Override
        public Class<XargsOption> optionType() {
            return XargsOption.class;
        }

        @Override
        public boolean isSet(XargsOption option) {
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
        public java.util.Set<XargsOption> asSet() {
            return Collections.emptySet();
        }

        /**
         * Returns an iterator returning no elements.
         *
         * @return an immutable iterator with no elements.
         */
        @Override
        public Iterator<XargsOption> iterator() {
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
        public boolean useAcronymFor(XargsOption option) {
            return true;
        }
    };
    /**
     * Value converter for {@link XargsOptions} based on an {@link OptionSetConverter}.
     */
    ValueConverter<XargsOptions> CONVERTER = new ValueConverter<XargsOptions>() {
        private final OptionSetConverter<XargsOption> converter = new OptionSetConverter<XargsOption>(XargsOption.class);

        @Override
        public XargsOptions convert(Object value) {
            final OptionSet<XargsOption> set = converter.convert(value);
            return set == null ? null : new Default(set);
        }
    };

    /**
     * Default implementation for a modifiable option set.
     */
    class Default extends DefaultOptionSet<XargsOption> implements XargsOptions {
        /**
         * Default constructor for an empty option set with no active options.
         */
        public Default() {
            super(XargsOption.class);
        }

        /**
         * Constructor for an option set with a single active option.
         *
         * @param option the option to be set
         */
        public Default(XargsOption option) {
            super(option);
        }

        /**
         * Constructor for an option set with the given active options.
         *
         * @param options the options to be set
         */
        public Default(XargsOption... options) {
            this();
            setAll(options);
        }

        /**
         * Constructor for an option set initialized with the options given by
         * another option set.
         *
         * @param optionSet set with the options to be active
         */
        public Default(OptionSet<XargsOption> optionSet) {
            this();
            setAll(optionSet);
        }
    }
}
