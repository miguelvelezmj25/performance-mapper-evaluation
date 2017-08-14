package org.unix4j.unix.cat;

import org.unix4j.option.Option;
import org.unix4j.unix.Cat;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Cat cat} command with
 * the following options: {@link #n n}, {@link #s s}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Cat#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.cat.CatOptions} for more information.
 */
public enum CatOptionSet_ns implements CatOptions {
    /**
     * Option set with the following active options: {@link #numberLines n}, {@link #squeezeEmptyLines s}.
     */
    Active_ns(
        /*n:*/null /*already set*/, /*numberLines:*/null /*already set*/, /*s:*/null /*already set*/, /*squeezeEmptyLines:*/null /*already set*/,
            true,
        /*active:*/CatOption.numberLines, CatOption.squeezeEmptyLines
    ),
    /**
     * Option set with the following active options: {@link #numberLines n}, {@link #squeezeEmptyLines s}.
     */
    Active_ns_long(
		/*n:*/null /*already set*/, /*numberLines:*/null /*already set*/, /*s:*/null /*already set*/, /*squeezeEmptyLines:*/null /*already set*/,
            false,
		/*active:*/CatOption.numberLines, CatOption.squeezeEmptyLines
    ),
    /**
     * Option set with the following active options: {@link #numberLines n}.
     */
    Active_n(
		/*n:*/null /*already set*/, /*numberLines:*/null /*already set*/, /*s:*/Active_ns, /*squeezeEmptyLines:*/Active_ns_long,
            true,
		/*active:*/CatOption.numberLines
    ),
    /**
     * Option set with the following active options: {@link #numberLines n}.
     */
    Active_n_long(
		/*n:*/null /*already set*/, /*numberLines:*/null /*already set*/, /*s:*/Active_ns, /*squeezeEmptyLines:*/Active_ns_long,
            false,
		/*active:*/CatOption.numberLines
    );

    /**
     * Option {@code "-n"}: Number the output lines, starting at 1.
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #numberLines numberLines}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-n"}. If the option {@code "-n"}
     * is already set, the field {@code n} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final CatOptionSet_ns n;
    /**
     * Option {@code "--numberLines"}: Number the output lines, starting at 1.
     * <p>
     * The option {@code "--numberLines"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--numberLines"}. If the option {@code "--numberLines"}
     * is already set, the field {@code numberLines} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final CatOptionSet_ns numberLines;
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
    public final CatOptionSet_ns s;
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
    public final CatOptionSet_ns squeezeEmptyLines;
    private final boolean useAcronym;
    private final EnumSet<CatOption> options;

    private CatOptionSet_ns(
            CatOptionSet_ns n, CatOptionSet_ns numberLines, CatOptionSet_ns s, CatOptionSet_ns squeezeEmptyLines,
            boolean useAcronym,
            CatOption... activeOptions
    ) {
        this.n = n == null ? this : n;
        this.numberLines = numberLines == null ? this : numberLines;
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
     *    CatOptionSet_ns.numberLines.s;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    CatOptionSet_ns.n.squeezeEmptyLines;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    CatOptionSet_ns.n.s.numberLines;
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
