package org.unix4j.unix.uniq;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Uniq;

/**
 * Option sets for the {@link Uniq uniq} command with 
 * the following options: {@link #c c}, {@link #g g}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Uniq#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.uniq.UniqOptions} for more information.
 */
public enum UniqOptionSet_cg implements UniqOptions {
	/** Option set with the following active options: {@link #count c}, {@link #global g}.*/
	Active_cg(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, 
		true, 
		/*active:*/UniqOption.count, UniqOption.global
	),
	/** Option set with the following active options: {@link #count c}, {@link #global g}.*/
	Active_cg_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, 
		false, 
		/*active:*/UniqOption.count, UniqOption.global
	),
	/** Option set with the following active options: {@link #count c}.*/
	Active_c(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*g:*/Active_cg, /*global:*/Active_cg_long, 
		true, 
		/*active:*/UniqOption.count
	),
	/** Option set with the following active options: {@link #count c}.*/
	Active_c_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*g:*/Active_cg, /*global:*/Active_cg_long, 
		false, 
		/*active:*/UniqOption.count
	);
	private UniqOptionSet_cg(
		UniqOptionSet_cg c, UniqOptionSet_cg count, UniqOptionSet_cg g, UniqOptionSet_cg global, 
		boolean useAcronym,
		UniqOption... activeOptions
	) {
		this.c = c == null ? this : c;
		this.count = count == null ? this : count;
		this.g = g == null ? this : g;
		this.global = global == null ? this : global;
		this.useAcronym = useAcronym;
		this.options = activeOptions.length == 0 ? EnumSet.noneOf(UniqOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
	}
	private final boolean useAcronym;
	/**
	 * Option {@code "-c"}: Precedes each output line with a count of the number of times the
			line occurred in the input.
	 * <p>
	 * The option {@code "-c"} is equivalent to the {@code "--}{@link #count count}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-c"}. If the option {@code "-c"}
	 * is already set, the field {@code c} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final UniqOptionSet_cg c;
	/**
	 * Option {@code "--count"}: Precedes each output line with a count of the number of times the
			line occurred in the input.
	 * <p>
	 * The option {@code "--count"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--count"}. If the option {@code "--count"}
	 * is already set, the field {@code count} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final UniqOptionSet_cg count;
	/**
	 * Option {@code "-g"}: Suppresses repeated lines globally, that is, if lines are 
			non-adjacent. This option guarantees unique output lines even if the
			input lines are not sorted.
	 * <p>
	 * The option {@code "-g"} is equivalent to the {@code "--}{@link #global global}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-g"}. If the option {@code "-g"}
	 * is already set, the field {@code g} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final UniqOptionSet_cg g;
	/**
	 * Option {@code "--global"}: Suppresses repeated lines globally, that is, if lines are 
			non-adjacent. This option guarantees unique output lines even if the
			input lines are not sorted.
	 * <p>
	 * The option {@code "--global"} is equivalent to the {@code "-}{@link #g g}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--global"}. If the option {@code "--global"}
	 * is already set, the field {@code global} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final UniqOptionSet_cg global;
	private final EnumSet<UniqOption> options;
	
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
	 *    UniqOptionSet_cg.count.g;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    UniqOptionSet_cg.c.global;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    UniqOptionSet_cg.c.g.count;
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
	public boolean useAcronymFor(UniqOption option) {
		return useAcronym;
	}
}
