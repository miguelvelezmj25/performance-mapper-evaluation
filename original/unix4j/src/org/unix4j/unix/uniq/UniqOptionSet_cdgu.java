package org.unix4j.unix.uniq;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Uniq;

/**
 * Option sets for the {@link Uniq uniq} command with 
 * the following options: {@link #c c}, {@link #d d}, {@link #g g}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Uniq#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.uniq.UniqOptions} for more information.
 */
public enum UniqOptionSet_cdgu implements UniqOptions {
	/** Option set with the following active options: {@link #global g}.*/
	Active_g(
		/*c:*/UniqOptionSet_cg.Active_cg, /*count:*/UniqOptionSet_cg.Active_cg_long, /*d:*/UniqOptionSet_dg.Active_dg, /*duplicatedOnly:*/UniqOptionSet_dg.Active_dg_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*u:*/UniqOptionSet_gu.Active_gu, /*uniqueOnly:*/UniqOptionSet_gu.Active_gu_long, 
		true, 
		/*active:*/UniqOption.global
	),
	/** Option set with the following active options: {@link #global g}.*/
	Active_g_long(
		/*c:*/UniqOptionSet_cg.Active_cg, /*count:*/UniqOptionSet_cg.Active_cg_long, /*d:*/UniqOptionSet_dg.Active_dg, /*duplicatedOnly:*/UniqOptionSet_dg.Active_dg_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*u:*/UniqOptionSet_gu.Active_gu, /*uniqueOnly:*/UniqOptionSet_gu.Active_gu_long, 
		false, 
		/*active:*/UniqOption.global
	);
	private UniqOptionSet_cdgu(
		UniqOptionSet_cg c, UniqOptionSet_cg count, UniqOptionSet_dg d, UniqOptionSet_dg duplicatedOnly, UniqOptionSet_cdgu g, UniqOptionSet_cdgu global, UniqOptionSet_gu u, UniqOptionSet_gu uniqueOnly, 
		boolean useAcronym,
		UniqOption... activeOptions
	) {
		this.c = notNull(c);
		this.count = notNull(count);
		this.d = notNull(d);
		this.duplicatedOnly = notNull(duplicatedOnly);
		this.g = g == null ? this : g;
		this.global = global == null ? this : global;
		this.u = notNull(u);
		this.uniqueOnly = notNull(uniqueOnly);
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
	public final UniqOptionSet_cdgu g;
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
	public final UniqOptionSet_cdgu global;
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
	 * Checks that the given {@code value} is not null and throws an exception 
	 * otherwise.
	 * 
	 * @param the value to check
	 * @return the given {@code value} if it is not null
	 * @throws NullPointerException if {@code value==null} 
	 */
	private static <T> T notNull(T value) {
		if (value != null) return value;
		throw new NullPointerException();
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
	 *    UniqOptionSet_cdgu.count.d;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    UniqOptionSet_cdgu.c.duplicatedOnly;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    UniqOptionSet_cdgu.c.d.count;
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
