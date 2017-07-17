package org.unix4j.unix.find;

import org.unix4j.convert.OptionSetConverters.OptionSetConverter;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.option.Option;
import org.unix4j.option.OptionSet;
import org.unix4j.unix.Find;

import java.util.Collections;
import java.util.Iterator;

/**
 * Interface implemented by all option sets for the {@link Find find} command.
 * It is recommended to use {@link Find#Options} to specify a valid
 * combination of options.
 * <p>
 * The options for the find command are:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeDirectory}</td><td>&nbsp;</td><td>Consider only directories</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeFile}</td><td>&nbsp;</td><td>Consider only regular files</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeSymlink}</td><td>&nbsp;</td><td>Consider only symbolic links</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeOther}</td><td>&nbsp;</td><td>Consider only files that are neither of directory (d),
 * regular file (f) or symlink (l).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --regex}</td><td>&nbsp;</td><td>Use full regular expression syntax for the patterns specified by the
 * name operand
 * <p>
 * (This option is ignored if no name operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive matching when applying the file name pattern
 * specified by the name operand
 * <p>
 * (This option is ignored if no name operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeNewer}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
 * after or at the time specified by the time operand (the default)
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -o}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeOlder}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
 * before or at the time specified by the time operand
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeCreate}</td><td>&nbsp;</td><td>The time operand refers to the creation time of the file
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeAccess}</td><td>&nbsp;</td><td>The time operand refers to the last access time of the file
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeModified}</td><td>&nbsp;</td><td>The time operand refers to the last modification time of the file
 * (the default)
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -z}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print0}</td><td>&nbsp;</td><td>Print the full file name on the standard output, followed by a null
 * character (instead of the newline character used by default). This
 * allows file names that contain newlines or other types of white
 * space to be correctly interpreted by programs that process the find
 * output. This option corresponds to the --delimiter0 option of xargs.</td></tr>
 * </table>
 * <p>
 * This interface serves as an alias for the extended interface to simplify the
 * command signature methods by avoiding generic parameters.
 */
public interface FindOptions extends OptionSet<FindOption> {
    /**
     * Constant for an empty option set.
     */
    FindOptions EMPTY = new FindOptions() {
        @Override
        public Class<FindOption> optionType() {
            return FindOption.class;
        }

        @Override
        public boolean isSet(FindOption option) {
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
        public java.util.Set<FindOption> asSet() {
            return Collections.emptySet();
        }

        /**
         * Returns an iterator returning no elements.
         *
         * @return an immutable iterator with no elements.
         */
        @Override
        public Iterator<FindOption> iterator() {
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
        public boolean useAcronymFor(FindOption option) {
            return true;
        }
    };
    /**
     * Value converter for {@link FindOptions} based on an {@link OptionSetConverter}.
     */
    ValueConverter<FindOptions> CONVERTER = new ValueConverter<FindOptions>() {
        private final OptionSetConverter<FindOption> converter = new OptionSetConverter<FindOption>(FindOption.class);

        @Override
        public FindOptions convert(Object value) {
            final OptionSet<FindOption> set = converter.convert(value);
            return set == null ? null : new Default(set);
        }
    };

    /**
     * Default implementation for a modifiable option set.
     */
    class Default extends DefaultOptionSet<FindOption> implements FindOptions {
        /**
         * Default constructor for an empty option set with no active options.
         */
        public Default() {
            super(FindOption.class);
        }

        /**
         * Constructor for an option set with a single active option.
         *
         * @param option the option to be set
         */
        public Default(FindOption option) {
            super(option);
        }

        /**
         * Constructor for an option set with the given active options.
         *
         * @param options the options to be set
         */
        public Default(FindOption... options) {
            this();
            setAll(options);
        }

        /**
         * Constructor for an option set initialized with the options given by
         * another option set.
         *
         * @param optionSet set with the options to be active
         */
        public Default(OptionSet<FindOption> optionSet) {
            this();
            setAll(optionSet);
        }
    }
}
