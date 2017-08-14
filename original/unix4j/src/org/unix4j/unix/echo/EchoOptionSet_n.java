package org.unix4j.unix.echo;

import org.unix4j.option.Option;
import org.unix4j.unix.Echo;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Echo echo} command with
 * the following options: {@link #n n}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Echo#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.echo.EchoOptions} for more information.
 */
public enum EchoOptionSet_n implements EchoOptions {
    /**
     * Option set with the following active options: {@link #noNewline n}.
     */
    Active_n(
        /*n:*/null /*already set*/, /*noNewline:*/null /*already set*/,
            true,
        /*active:*/EchoOption.noNewline
    ),
    /**
     * Option set with the following active options: {@link #noNewline n}.
     */
    Active_n_long(
		/*n:*/null /*already set*/, /*noNewline:*/null /*already set*/,
            false,
		/*active:*/EchoOption.noNewline
    );

    /**
     * Option {@code "-n"}: Do not print the trailing newline character(s).
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #noNewline noNewline}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-n"}. If the option {@code "-n"}
     * is already set, the field {@code n} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final EchoOptionSet_n n;
    /**
     * Option {@code "--noNewline"}: Do not print the trailing newline character(s).
     * <p>
     * The option {@code "--noNewline"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--noNewline"}. If the option {@code "--noNewline"}
     * is already set, the field {@code noNewline} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final EchoOptionSet_n noNewline;
    private final boolean useAcronym;
    private final EnumSet<EchoOption> options;

    private EchoOptionSet_n(
            EchoOptionSet_n n, EchoOptionSet_n noNewline,
            boolean useAcronym,
            EchoOption... activeOptions
    ) {
        this.n = n == null ? this : n;
        this.noNewline = noNewline == null ? this : noNewline;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(EchoOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    //inherit javadoc
    @Override
    public Class<EchoOption> optionType() {
        return EchoOption.class;
    }

    //inherit javadoc
    @Override
    public boolean isSet(EchoOption option) {
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
    public EnumSet<EchoOption> asSet() {
        return EnumSet.copyOf(options);
    }

    /**
     * Returns an immutable iterator with the active options of this option set.
     *
     * @return an immutable iterator for over the active options
     */
    @Override
    public Iterator<EchoOption> iterator() {
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
     *    EchoOptionSet_n.n;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    EchoOptionSet_n.noNewline;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    EchoOptionSet_n.n.noNewline;
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
    public boolean useAcronymFor(EchoOption option) {
        return useAcronym;
    }
}
