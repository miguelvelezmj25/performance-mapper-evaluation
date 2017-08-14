package org.unix4j.unix.cat;

import org.unix4j.option.Option;
import org.unix4j.unix.Cat;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Cat cat} command with
 * the following options: {@link #b b}, {@link #s s}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Cat#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.cat.CatOptions} for more information.
 */
public enum CatOptionSet_bs implements CatOptions {
    /**
     * Option set with the following active options: {@link #numberNonBlankLines b}, {@link #squeezeEmptyLines s}.
     */
    Active_bs(
        /*b:*/null /*already set*/, /*numberNonBlankLines:*/null /*already set*/, /*s:*/null /*already set*/, /*squeezeEmptyLines:*/null /*already set*/,
            true,
        /*active:*/CatOption.numberNonBlankLines, CatOption.squeezeEmptyLines
    ),
    /**
     * Option set with the following active options: {@link #numberNonBlankLines b}, {@link #squeezeEmptyLines s}.
     */
    Active_bs_long(
		/*b:*/null /*already set*/, /*numberNonBlankLines:*/null /*already set*/, /*s:*/null /*already set*/, /*squeezeEmptyLines:*/null /*already set*/,
            false,
		/*active:*/CatOption.numberNonBlankLines, CatOption.squeezeEmptyLines
    ),
    /**
     * Option set with the following active options: {@link #numberNonBlankLines b}.
     */
    Active_b(
		/*b:*/null /*already set*/, /*numberNonBlankLines:*/null /*already set*/, /*s:*/Active_bs, /*squeezeEmptyLines:*/Active_bs_long,
            true,
		/*active:*/CatOption.numberNonBlankLines
    ),
    /**
     * Option set with the following active options: {@link #numberNonBlankLines b}.
     */
    Active_b_long(
		/*b:*/null /*already set*/, /*numberNonBlankLines:*/null /*already set*/, /*s:*/Active_bs, /*squeezeEmptyLines:*/Active_bs_long,
            false,
		/*active:*/CatOption.numberNonBlankLines
    );

    /**
     * Option {@code "-b"}: Number the non-blank output lines, starting at 1.
     * <p>
     * The option {@code "-b"} is equivalent to the {@code "--}{@link #numberNonBlankLines numberNonBlankLines}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-b"}. If the option {@code "-b"}
     * is already set, the field {@code b} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final CatOptionSet_bs b;
    /**
     * Option {@code "--numberNonBlankLines"}: Number the non-blank output lines, starting at 1.
     * <p>
     * The option {@code "--numberNonBlankLines"} is equivalent to the {@code "-}{@link #b b}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--numberNonBlankLines"}. If the option {@code "--numberNonBlankLines"}
     * is already set, the field {@code numberNonBlankLines} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final CatOptionSet_bs numberNonBlankLines;
    /**
     * Option {@code "-s"}: Squeeze multiple adjacent empty lines, causing the output to be
     * single spaced.
     * <p>
     * The option {@code "-s"} is equivalent to the {@code "--}{@link #squeezeEmptyLines squeezeEmptyLines}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-s"}. If the option {@code "-s"}
     * is already set, the field {@code s} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final CatOptionSet_bs s;
    /**
     * Option {@code "--squeezeEmptyLines"}: Squeeze multiple adjacent empty lines, causing the output to be
     * single spaced.
     * <p>
     * The option {@code "--squeezeEmptyLines"} is equivalent to the {@code "-}{@link #s s}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--squeezeEmptyLines"}. If the option {@code "--squeezeEmptyLines"}
     * is already set, the field {@code squeezeEmptyLines} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final CatOptionSet_bs squeezeEmptyLines;
    private final boolean useAcronym;
    private final EnumSet<CatOption> options;

    private CatOptionSet_bs(
            CatOptionSet_bs b, CatOptionSet_bs numberNonBlankLines, CatOptionSet_bs s, CatOptionSet_bs squeezeEmptyLines,
            boolean useAcronym,
            CatOption... activeOptions
    ) {
        this.b = b == null ? this : b;
        this.numberNonBlankLines = numberNonBlankLines == null ? this : numberNonBlankLines;
        this.s = s == null ? this : s;
        this.squeezeEmptyLines = squeezeEmptyLines == null ? this : squeezeEmptyLines;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(CatOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    //inherit javadoc
    @Override
    public Class<CatOption> optionType() {
        return CatOption.class;
    }

    //inherit javadoc
    @Override
    public boolean isSet(CatOption option) {
        return options.contains(option);
    }

    //inherit javadoc
    @Override
    public int size() {
        return options.size();
    }

    /**
     * Returns the set with the active options. The returned set a new defensive
     * copy instance created when this method is called, modifications of this
     * set will therefore not alter {@code this} option set.
     *
     * @return a copy of the set with the active options.
     */
    @Override
    public EnumSet<CatOption> asSet() {
        return EnumSet.copyOf(options);
    }

    /**
     * Returns an immutable iterator with the active options of this option set.
     *
     * @return an immutable iterator for over the active options
     */
    @Override
    public Iterator<CatOption> iterator() {
        return Collections.unmodifiableSet(options).iterator();
    }

    /**
     * Returns true if the {@link Option#acronym() acronym} should be used in
     * for the specified {@code option} string representations.
     * <p>
     * In particular and independent from the {@code option} argument, this
     * option set returns true if the last option added to this set was an
     * acronym, and false if it was a long option name.
     * <p>
     * For instance, the set defined as
     * <pre>
     *    CatOptionSet_bs.numberNonBlankLines.s;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    CatOptionSet_bs.b.squeezeEmptyLines;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    CatOptionSet_bs.b.s.numberNonBlankLines;
     * </pre>
     * <p>
     * This method always returns true for the empty set with no active options.
     *
     * @param option the option of interest, has no impact on the result returned
     *               by this method
     * @return true if option acronyms should be used for string representations
     * of any option of this option set
     */
    @Override
    public boolean useAcronymFor(CatOption option) {
        return useAcronym;
    }
}
