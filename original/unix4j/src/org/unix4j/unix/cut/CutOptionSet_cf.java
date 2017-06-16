package org.unix4j.unix.cut;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Cut;

/**
 * Option sets for the {@link Cut cut} command with 
 * the following options: {@link #c c}, {@link #f f}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Cut#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.cut.CutOptions} for more information.
 */
public enum CutOptionSet_cf implements CutOptions {
	/** Option set with the following active options: {@link #chars c}, {@link #fields f}.*/
	Active_cf(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*f:*/null /*already set*/, /*fields:*/null /*already set*/, 
		true, 
		/*active:*/CutOption.chars, CutOption.fields
	),
	/** Option set with the following active options: {@link #chars c}, {@link #fields f}.*/
	Active_cf_long(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*f:*/null /*already set*/, /*fields:*/null /*already set*/, 
		false, 
		/*active:*/CutOption.chars, CutOption.fields
	),
	/** Option set with the following active options: {@link #chars c}.*/
	Active_c(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*f:*/Active_cf, /*fields:*/Active_cf_long, 
		true, 
		/*active:*/CutOption.chars
	),
	/** Option set with the following active options: {@link #chars c}.*/
	Active_c_long(
		/*c:*/null /*already set*/, /*chars:*/null /*already set*/, /*f:*/Active_cf, /*fields:*/Active_cf_long, 
		false, 
		/*active:*/CutOption.chars
	),
	/** Option set with the following active options: {@link #fields f}.*/
	Active_f(
		/*c:*/Active_cf, /*chars:*/Active_cf_long, /*f:*/null /*already set*/, /*fields:*/null /*already set*/, 
		true, 
		/*active:*/CutOption.fields
	),
	/** Option set with the following active options: {@link #fields f}.*/
	Active_f_long(
		/*c:*/Active_cf, /*chars:*/Active_cf_long, /*f:*/null /*already set*/, /*fields:*/null /*already set*/, 
		false, 
		/*active:*/CutOption.fields
	);
	private CutOptionSet_cf(
		CutOptionSet_cf c, CutOptionSet_cf chars, CutOptionSet_cf f, CutOptionSet_cf fields, 
		boolean useAcronym,
		CutOption... activeOptions
	) {
		this.c = c == null ? this : c;
		this.chars = chars == null ? this : chars;
		this.f = f == null ? this : f;
		this.fields = fields == null ? this : fields;
		this.useAcronym = useAcronym;
		this.options = activeOptions.length == 0 ? EnumSet.noneOf(CutOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
	}
	private final boolean useAcronym;
	/**
	 * Option {@code "-c"}: The list specifies character positions.
	 * <p>
	 * The option {@code "-c"} is equivalent to the {@code "--}{@link #chars chars}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-c"}. If the option {@code "-c"}
	 * is already set, the field {@code c} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final CutOptionSet_cf c;
	/**
	 * Option {@code "--chars"}: The list specifies character positions.
	 * <p>
	 * The option {@code "--chars"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--chars"}. If the option {@code "--chars"}
	 * is already set, the field {@code chars} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final CutOptionSet_cf chars;
	/**
	 * Option {@code "-f"}: The list specifies fields, separated in the input by the field
			delimiter character (see the -d option.)  Output fields are
			separated by a single occurrence of the field delimiter character.
	 * <p>
	 * The option {@code "-f"} is equivalent to the {@code "--}{@link #fields fields}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-f"}. If the option {@code "-f"}
	 * is already set, the field {@code f} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final CutOptionSet_cf f;
	/**
	 * Option {@code "--fields"}: The list specifies fields, separated in the input by the field
			delimiter character (see the -d option.)  Output fields are
			separated by a single occurrence of the field delimiter character.
	 * <p>
	 * The option {@code "--fields"} is equivalent to the {@code "-}{@link #f f}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--fields"}. If the option {@code "--fields"}
	 * is already set, the field {@code fields} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final CutOptionSet_cf fields;
	private final EnumSet<CutOption> options;
	
	//inherit javadoc
	@Override
	public Class<CutOption> optionType() {
		return CutOption.class;
	}
	//inherit javadoc
	@Override
	public boolean isSet(CutOption option) {
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
	public EnumSet<CutOption> asSet() {
		return EnumSet.copyOf(options);
	}
	/**
	 * Returns an immutable iterator with the active options of this option set.
	 * 
	 * @return an immutable iterator for over the active options
	 */
	@Override
	public Iterator<CutOption> iterator() {
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
	 *    CutOptionSet_cf.chars.f;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    CutOptionSet_cf.c.fields;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    CutOptionSet_cf.c.f.chars;
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
	public boolean useAcronymFor(CutOption option) {
		return useAcronym;
	}
}
