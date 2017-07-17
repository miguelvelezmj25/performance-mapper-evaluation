package org.unix4j.unix.uniq;

import org.unix4j.option.Option;
import org.unix4j.unix.Uniq;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Uniq uniq} command with
 * the following options: {@link #d d}, {@link #g g}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Uniq#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.uniq.UniqOptions} for more information.
 */
public enum UniqOptionSet_dg implements UniqOptions {
    /**
     * Option set with the following active options: {@link #duplicatedOnly d}, {@link #global g}.
     */
    Active_dg(
        /*d:*/null /*already set*/, /*duplicatedOnly:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/,
            true,
		/*active:*/UniqOption.duplicatedOnly, UniqOption.global
    ),
    /**
     * Option set with the following active options: {@link #duplicatedOnly d}, {@link #global g}.
     */
    Active_dg_long(
		/*d:*/null /*already set*/, /*duplicatedOnly:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/,
            false,
		/*active:*/UniqOption.duplicatedOnly, UniqOption.global
    ),
    /**
     * Option set with the following active options: {@link #duplicatedOnly d}.
     */
    Active_d(
		/*d:*/null /*already set*/, /*duplicatedOnly:*/null /*already set*/, /*g:*/Active_dg, /*global:*/Active_dg_long,
            true,
		/*active:*/UniqOption.duplicatedOnly
    ),
    /**
     * Option set with the following active options: {@link #duplicatedOnly d}.
     */
    Active_d_long(
		/*d:*/null /*already set*/, /*duplicatedOnly:*/null /*already set*/, /*g:*/Active_dg, /*global:*/Active_dg_long,
            false,
		/*active:*/UniqOption.duplicatedOnly
    );

    /**
     * Option {@code "-d"}: Suppresses the writing of lines that are not repeated in the input.
     * <p>
     * The option {@code "-d"} is equivalent to the {@code "--}{@link #duplicatedOnly duplicatedOnly}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-d"}. If the option {@code "-d"}
     * is already set, the field {@code d} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final UniqOptionSet_dg d;
    /**
     * Option {@code "--duplicatedOnly"}: Suppresses the writing of lines that are not repeated in the input.
     * <p>
     * The option {@code "--duplicatedOnly"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--duplicatedOnly"}. If the option {@code "--duplicatedOnly"}
     * is already set, the field {@code duplicatedOnly} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final UniqOptionSet_dg duplicatedOnly;
    /**
     * Option {@code "-g"}: Suppresses repeated lines globally, that is, if lines are
     * non-adjacent. This option guarantees unique output lines even if the
     * input lines are not sorted.
     * <p>
     * The option {@code "-g"} is equivalent to the {@code "--}{@link #global global}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-g"}. If the option {@code "-g"}
     * is already set, the field {@code g} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final UniqOptionSet_dg g;
    /**
     * Option {@code "--global"}: Suppresses repeated lines globally, that is, if lines are
     * non-adjacent. This option guarantees unique output lines even if the
     * input lines are not sorted.
     * <p>
     * The option {@code "--global"} is equivalent to the {@code "-}{@link #g g}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--global"}. If the option {@code "--global"}
     * is already set, the field {@code global} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final UniqOptionSet_dg global;
    private final boolean useAcronym;
    private final EnumSet<UniqOption> options;
    private UniqOptionSet_dg(
            UniqOptionSet_dg d, UniqOptionSet_dg duplicatedOnly, UniqOptionSet_dg g, UniqOptionSet_dg global,
            boolean useAcronym,
            UniqOption... activeOptions
    ) {
        this.d = d == null ? this : d;
        this.duplicatedOnly = duplicatedOnly == null ? this : duplicatedOnly;
        this.g = g == null ? this : g;
        this.global = global == null ? this : global;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(UniqOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    //inherit javadoc
    @Override
    public Class<UniqOption> optionType() {
        return UniqOption.class;
    }

    //inherit javadoc
    @Override
    public boolean isSet(UniqOption option) {
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
    public EnumSet<UniqOption> asSet() {
        return EnumSet.copyOf(options);
    }

    /**
     * Returns an immutable iterator with the active options of this option set.
     *
     * @return an immutable iterator for over the active options
     */
    @Override
    public Iterator<UniqOption> iterator() {
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
     *    UniqOptionSet_dg.duplicatedOnly.g;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    UniqOptionSet_dg.d.global;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    UniqOptionSet_dg.d.g.duplicatedOnly;
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
    public boolean useAcronymFor(UniqOption option) {
        return useAcronym;
    }
}
