package org.unix4j.unix.tail;

import org.unix4j.option.Option;
import org.unix4j.unix.Tail;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Tail tail} command with
 * the following options: {@link #c c}, {@link #s s}, {@link #q q}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Tail#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.tail.TailOptions} for more information.
 */
public enum TailOptionSet_cqs implements TailOptions {
    /**
     * Option set with the following active options: {@link #chars c}, {@link #countFromStart s}, {@link #suppressHeaders q}.
     */
    Active_cqs(
        /*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*s:*/null /*already set*/, /*countFromStart:*/null /*already set*/, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/,
            true,
		/*active:*/TailOption.chars, TailOption.countFromStart, TailOption.suppressHeaders
    ),
    /**
     * Option set with the following active options: {@link #chars c}, {@link #countFromStart s}, {@link #suppressHeaders q}.
     */
    Active_cqs_long(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*s:*/null /*already set*/, /*countFromStart:*/null /*already set*/, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/,
            false,
		/*active:*/TailOption.chars, TailOption.countFromStart, TailOption.suppressHeaders
    ),
    /**
     * Option set with the following active options: {@link #chars c}, {@link #suppressHeaders q}.
     */
    Active_cq(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*s:*/Active_cqs, /*countFromStart:*/Active_cqs_long, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/,
            true,
		/*active:*/TailOption.chars, TailOption.suppressHeaders
    ),
    /**
     * Option set with the following active options: {@link #chars c}, {@link #suppressHeaders q}.
     */
    Active_cq_long(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*s:*/Active_cqs, /*countFromStart:*/Active_cqs_long, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/,
            false,
		/*active:*/TailOption.chars, TailOption.suppressHeaders
    ),
    /**
     * Option set with the following active options: {@link #chars c}, {@link #countFromStart s}.
     */
    Active_cs(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*s:*/null /*already set*/, /*countFromStart:*/null /*already set*/, /*q:*/Active_cqs, /*suppressHeaders:*/Active_cqs_long,
            true,
		/*active:*/TailOption.chars, TailOption.countFromStart
    ),
    /**
     * Option set with the following active options: {@link #chars c}, {@link #countFromStart s}.
     */
    Active_cs_long(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*s:*/null /*already set*/, /*countFromStart:*/null /*already set*/, /*q:*/Active_cqs, /*suppressHeaders:*/Active_cqs_long,
            false,
		/*active:*/TailOption.chars, TailOption.countFromStart
    ),
    /**
     * Option set with the following active options: {@link #countFromStart s}, {@link #suppressHeaders q}.
     */
    Active_qs(
		/*c:*/Active_cqs, /*chars:*/Active_cqs_long, /*s:*/null /*already set*/, /*countFromStart:*/null /*already set*/, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/,
            true,
		/*active:*/TailOption.countFromStart, TailOption.suppressHeaders
    ),
    /**
     * Option set with the following active options: {@link #countFromStart s}, {@link #suppressHeaders q}.
     */
    Active_qs_long(
		/*c:*/Active_cqs, /*chars:*/Active_cqs_long, /*s:*/null /*already set*/, /*countFromStart:*/null /*already set*/, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/,
            false,
		/*active:*/TailOption.countFromStart, TailOption.suppressHeaders
    ),
    /**
     * Option set with the following active options: {@link #chars c}.
     */
    Active_c(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*s:*/Active_cs, /*countFromStart:*/Active_cs_long, /*q:*/Active_cq, /*suppressHeaders:*/Active_cq_long,
            true,
		/*active:*/TailOption.chars
    ),
    /**
     * Option set with the following active options: {@link #chars c}.
     */
    Active_c_long(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*s:*/Active_cs, /*countFromStart:*/Active_cs_long, /*q:*/Active_cq, /*suppressHeaders:*/Active_cq_long,
            false,
		/*active:*/TailOption.chars
    ),
    /**
     * Option set with the following active options: {@link #suppressHeaders q}.
     */
    Active_q(
		/*c:*/Active_cq, /*chars:*/Active_cq_long, /*s:*/Active_qs, /*countFromStart:*/Active_qs_long, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/,
            true,
		/*active:*/TailOption.suppressHeaders
    ),
    /**
     * Option set with the following active options: {@link #suppressHeaders q}.
     */
    Active_q_long(
		/*c:*/Active_cq, /*chars:*/Active_cq_long, /*s:*/Active_qs, /*countFromStart:*/Active_qs_long, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/,
            false,
		/*active:*/TailOption.suppressHeaders
    ),
    /**
     * Option set with the following active options: {@link #countFromStart s}.
     */
    Active_s(
		/*c:*/Active_cs, /*chars:*/Active_cs_long, /*s:*/null /*already set*/, /*countFromStart:*/null /*already set*/, /*q:*/Active_qs, /*suppressHeaders:*/Active_qs_long,
            true,
		/*active:*/TailOption.countFromStart
    ),
    /**
     * Option set with the following active options: {@link #countFromStart s}.
     */
    Active_s_long(
		/*c:*/Active_cs, /*chars:*/Active_cs_long, /*s:*/null /*already set*/, /*countFromStart:*/null /*already set*/, /*q:*/Active_qs, /*suppressHeaders:*/Active_qs_long,
            false,
		/*active:*/TailOption.countFromStart
    );

    /**
     * Option {@code "-c"}: The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #chars chars}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-c"}. If the option {@code "-c"}
     * is already set, the field {@code c} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final TailOptionSet_cqs c;
    /**
     * Option {@code "--chars"}: The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.
     * <p>
     * The option {@code "--chars"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--chars"}. If the option {@code "--chars"}
     * is already set, the field {@code chars} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final TailOptionSet_cqs chars;
    /**
     * Option {@code "-s"}: The {@code count} argument is relative to the beginning of the file
     * instead of counting from the end of the file. For instance,
     * {@code tail -s 10} prints the lines starting from line 10;
     * {@code tail -s 1} prints the whole file.
     * <p>
     * The option {@code "-s"} is equivalent to the {@code "--}{@link #countFromStart countFromStart}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-s"}. If the option {@code "-s"}
     * is already set, the field {@code s} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final TailOptionSet_cqs s;
    /**
     * Option {@code "--countFromStart"}: The {@code count} argument is relative to the beginning of the file
     * instead of counting from the end of the file. For instance,
     * {@code tail -s 10} prints the lines starting from line 10;
     * {@code tail -s 1} prints the whole file.
     * <p>
     * The option {@code "--countFromStart"} is equivalent to the {@code "-}{@link #s s}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--countFromStart"}. If the option {@code "--countFromStart"}
     * is already set, the field {@code countFromStart} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final TailOptionSet_cqs countFromStart;
    /**
     * Option {@code "-q"}: Suppresses printing of headers when multiple files are being
     * examined.
     * <p>
     * The option {@code "-q"} is equivalent to the {@code "--}{@link #suppressHeaders suppressHeaders}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-q"}. If the option {@code "-q"}
     * is already set, the field {@code q} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final TailOptionSet_cqs q;
    /**
     * Option {@code "--suppressHeaders"}: Suppresses printing of headers when multiple files are being
     * examined.
     * <p>
     * The option {@code "--suppressHeaders"} is equivalent to the {@code "-}{@link #q q}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--suppressHeaders"}. If the option {@code "--suppressHeaders"}
     * is already set, the field {@code suppressHeaders} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final TailOptionSet_cqs suppressHeaders;
    private final boolean useAcronym;
    private final EnumSet<TailOption> options;
    private TailOptionSet_cqs(
            TailOptionSet_cqs c, TailOptionSet_cqs chars, TailOptionSet_cqs s, TailOptionSet_cqs countFromStart, TailOptionSet_cqs q, TailOptionSet_cqs suppressHeaders,
            boolean useAcronym,
            TailOption... activeOptions
    ) {
        this.c = c == null ? this : c;
        this.chars = chars == null ? this : chars;
        this.s = s == null ? this : s;
        this.countFromStart = countFromStart == null ? this : countFromStart;
        this.q = q == null ? this : q;
        this.suppressHeaders = suppressHeaders == null ? this : suppressHeaders;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(TailOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    //inherit javadoc
    @Override
    public Class<TailOption> optionType() {
        return TailOption.class;
    }

    //inherit javadoc
    @Override
    public boolean isSet(TailOption option) {
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
    public EnumSet<TailOption> asSet() {
        return EnumSet.copyOf(options);
    }

    /**
     * Returns an immutable iterator with the active options of this option set.
     *
     * @return an immutable iterator for over the active options
     */
    @Override
    public Iterator<TailOption> iterator() {
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
     *    TailOptionSet_cqs.chars.s;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    TailOptionSet_cqs.c.countFromStart;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    TailOptionSet_cqs.c.s.chars;
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
    public boolean useAcronymFor(TailOption option) {
        return useAcronym;
    }
}
