package org.unix4j.unix.head;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Head;

/**
 * Option sets for the {@link Head head} command with 
 * the following options: {@link #c c}, {@link #q q}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Head#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.head.HeadOptions} for more information.
 */
public enum HeadOptionSet_cq implements HeadOptions {
	/** Option set with the following active options: {@link #chars c}, {@link #suppressHeaders q}.*/
	Active_cq(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/, 
		true, 
		/*active:*/HeadOption.chars, HeadOption.suppressHeaders
	),
	/** Option set with the following active options: {@link #chars c}, {@link #suppressHeaders q}.*/
	Active_cq_long(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/, 
		false, 
		/*active:*/HeadOption.chars, HeadOption.suppressHeaders
	),
	/** Option set with the following active options: {@link #chars c}.*/
	Active_c(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*q:*/Active_cq, /*suppressHeaders:*/Active_cq_long, 
		true, 
		/*active:*/HeadOption.chars
	),
	/** Option set with the following active options: {@link #chars c}.*/
	Active_c_long(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*q:*/Active_cq, /*suppressHeaders:*/Active_cq_long, 
		false, 
		/*active:*/HeadOption.chars
	),
	/** Option set with the following active options: {@link #suppressHeaders q}.*/
	Active_q(
		/*c:*/Active_cq, /*chars:*/Active_cq_long, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/, 
		true, 
		/*active:*/HeadOption.suppressHeaders
	),
	/** Option set with the following active options: {@link #suppressHeaders q}.*/
	Active_q_long(
		/*c:*/Active_cq, /*chars:*/Active_cq_long, /*q:*/null /*already set*/, /*suppressHeaders:*/null /*already set*/, 
		false, 
		/*active:*/HeadOption.suppressHeaders
	);
	private HeadOptionSet_cq(
		HeadOptionSet_cq c, HeadOptionSet_cq chars, HeadOptionSet_cq q, HeadOptionSet_cq suppressHeaders, 
		boolean useAcronym,
		HeadOption... activeOptions
	) {
		this.c = c == null ? this : c;
		this.chars = chars == null ? this : chars;
		this.q = q == null ? this : q;
		this.suppressHeaders = suppressHeaders == null ? this : suppressHeaders;
		this.useAcronym = useAcronym;
		this.options = activeOptions.length == 0 ? EnumSet.noneOf(HeadOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
	}
	private final boolean useAcronym;
	/**
	 * Option {@code "-c"}: The {@code count} argument is in units of characters instead of 
			lines. Starts from 1 and includes line ending characters.
	 * <p>
	 * The option {@code "-c"} is equivalent to the {@code "--}{@link #chars chars}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-c"}. If the option {@code "-c"}
	 * is already set, the field {@code c} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final HeadOptionSet_cq c;
	/**
	 * Option {@code "--chars"}: The {@code count} argument is in units of characters instead of 
			lines. Starts from 1 and includes line ending characters.
	 * <p>
	 * The option {@code "--chars"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--chars"}. If the option {@code "--chars"}
	 * is already set, the field {@code chars} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final HeadOptionSet_cq chars;
	/**
	 * Option {@code "-q"}: Suppresses printing of headers when multiple files are being
			examined.
	 * <p>
	 * The option {@code "-q"} is equivalent to the {@code "--}{@link #suppressHeaders suppressHeaders}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-q"}. If the option {@code "-q"}
	 * is already set, the field {@code q} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final HeadOptionSet_cq q;
	/**
	 * Option {@code "--suppressHeaders"}: Suppresses printing of headers when multiple files are being
			examined.
	 * <p>
	 * The option {@code "--suppressHeaders"} is equivalent to the {@code "-}{@link #q q}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--suppressHeaders"}. If the option {@code "--suppressHeaders"}
	 * is already set, the field {@code suppressHeaders} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final HeadOptionSet_cq suppressHeaders;
	private final EnumSet<HeadOption> options;
	
	//inherit javadoc
	@Override
	public Class<HeadOption> optionType() {
		return HeadOption.class;
	}
	//inherit javadoc
	@Override
	public boolean isSet(HeadOption option) {
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
	public EnumSet<HeadOption> asSet() {
		return EnumSet.copyOf(options);
	}
	/**
	 * Returns an immutable iterator with the active options of this option set.
	 * 
	 * @return an immutable iterator for over the active options
	 */
	@Override
	public Iterator<HeadOption> iterator() {
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
	 *    HeadOptionSet_cq.chars.q;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    HeadOptionSet_cq.c.suppressHeaders;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    HeadOptionSet_cq.c.q.chars;
	 * </pre>
	 * <p>
	 * This method always returns true for the empty set with no active options.
	 *  
	 * @param option
	 *            the option of interest, has no impact on the result returned
	 *            by this method
	 * @return true if option acronyms should be used for string representations
	 *         of any option of this option set
	 */
	@Override
	public boolean useAcronymFor(HeadOption option) {
		return useAcronym;
	}
}
