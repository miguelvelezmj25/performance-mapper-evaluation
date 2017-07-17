package org.unix4j.unix.uniq;

import org.unix4j.option.Option;
import org.unix4j.unix.Uniq;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Uniq uniq} command with
 * the following options: {@link #g g}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Uniq#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.uniq.UniqOptions} for more information.
 */
public enum UniqOptionSet_gu implements UniqOptions {
    /**
     * Option set with the following active options: {@link #global g}, {@link #uniqueOnly u}.
     */
    Active_gu(
        /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*u:*/null /*already set*/, /*uniqueOnly:*/null /*already set*/,
            true,
		/*active:*/UniqOption.global, UniqOption.uniqueOnly
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #uniqueOnly u}.
     */
    Active_gu_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*u:*/null /*already set*/, /*uniqueOnly:*/null /*already set*/,
            false,
		/*active:*/UniqOption.global, UniqOption.uniqueOnly
    ),
    /**
     * Option set with the following active options: {@link #uniqueOnly u}.
     */
    Active_u(
		/*g:*/Active_gu, /*global:*/Active_gu_long, /*u:*/null /*already set*/, /*uniqueOnly:*/null /*already set*/,
            true,
		/*active:*/UniqOption.uniqueOnly
    ),
    /**
     * Option set with the following active options: {@link #uniqueOnly u}.
     */
    Active_u_long(
		/*g:*/Active_gu, /*global:*/Active_gu_long, /*u:*/null /*already set*/, /*uniqueOnly:*/null /*already set*/,
            false,
		/*active:*/UniqOption.uniqueOnly
    );

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
    public final UniqOptionSet_gu g;
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
    public final UniqOptionSet_gu global;
    /**
     * Option {@code "-u"}: Suppresses the writing of lines that are repeated in the input.
     * <p>
     * The option {@code "-u"} is equivalent to the {@code "--}{@link #uniqueOnly uniqueOnly}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-u"}. If the option {@code "-u"}
     * is already set, the field {@code u} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final UniqOptionSet_gu u;
    /**
     * Option {@code "--uniqueOnly"}: Suppresses the writing of lines that are repeated in the input.
     * <p>
     * The option {@code "--uniqueOnly"} is equivalent to the {@code "-}{@link #u u}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--uniqueOnly"}. If the option {@code "--uniqueOnly"}
     * is already set, the field {@code uniqueOnly} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final UniqOptionSet_gu uniqueOnly;
    private final boolean useAcronym;
    private final EnumSet<UniqOption> options;
    private UniqOptionSet_gu(
            UniqOptionSet_gu g, UniqOptionSet_gu global, UniqOptionSet_gu u, UniqOptionSet_gu uniqueOnly,
            boolean useAcronym,
            UniqOption... activeOptions
    ) {
        this.g = g == null ? this : g;
        this.global = global == null ? this : global;
        this.u = u == null ? this : u;
        this.uniqueOnly = uniqueOnly == null ? this : uniqueOnly;
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
     *    UniqOptionSet_gu.global.u;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    UniqOptionSet_gu.g.uniqueOnly;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    UniqOptionSet_gu.g.u.global;
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
