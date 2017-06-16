package org.unix4j.unix.wc;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Wc;

/**
 * Option sets for the {@link Wc wc} command with 
 * the following options: {@link #m m}, {@link #l l}, {@link #w w}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Wc#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.wc.WcOptions} for more information.
 */
public enum WcOptionSet_lmw implements WcOptions {
	/** Option set with the following active options: {@link #chars m}, {@link #lines l}, {@link #words w}.*/
	Active_lmw(
		/*m:*/null /*already set*/, /*chars:*/null /*already set*/, /*l:*/null /*already set*/, /*lines:*/null /*already set*/, /*w:*/null /*already set*/, /*words:*/null /*already set*/, 
		true, 
		/*active:*/WcOption.chars, WcOption.lines, WcOption.words
	),
	/** Option set with the following active options: {@link #chars m}, {@link #lines l}, {@link #words w}.*/
	Active_lmw_long(
		/*m:*/null /*already set*/, /*chars:*/null /*already set*/, /*l:*/null /*already set*/, /*lines:*/null /*already set*/, /*w:*/null /*already set*/, /*words:*/null /*already set*/, 
		false, 
		/*active:*/WcOption.chars, WcOption.lines, WcOption.words
	),
	/** Option set with the following active options: {@link #lines l}, {@link #words w}.*/
	Active_lw(
		/*m:*/Active_lmw, /*chars:*/Active_lmw_long, /*l:*/null /*already set*/, /*lines:*/null /*already set*/, /*w:*/null /*already set*/, /*words:*/null /*already set*/, 
		true, 
		/*active:*/WcOption.lines, WcOption.words
	),
	/** Option set with the following active options: {@link #lines l}, {@link #words w}.*/
	Active_lw_long(
		/*m:*/Active_lmw, /*chars:*/Active_lmw_long, /*l:*/null /*already set*/, /*lines:*/null /*already set*/, /*w:*/null /*already set*/, /*words:*/null /*already set*/, 
		false, 
		/*active:*/WcOption.lines, WcOption.words
	),
	/** Option set with the following active options: {@link #chars m}, {@link #lines l}.*/
	Active_lm(
		/*m:*/null /*already set*/, /*chars:*/null /*already set*/, /*l:*/null /*already set*/, /*lines:*/null /*already set*/, /*w:*/Active_lmw, /*words:*/Active_lmw_long, 
		true, 
		/*active:*/WcOption.chars, WcOption.lines
	),
	/** Option set with the following active options: {@link #chars m}, {@link #lines l}.*/
	Active_lm_long(
		/*m:*/null /*already set*/, /*chars:*/null /*already set*/, /*l:*/null /*already set*/, /*lines:*/null /*already set*/, /*w:*/Active_lmw, /*words:*/Active_lmw_long, 
		false, 
		/*active:*/WcOption.chars, WcOption.lines
	),
	/** Option set with the following active options: {@link #chars m}, {@link #words w}.*/
	Active_mw(
		/*m:*/null /*already set*/, /*chars:*/null /*already set*/, /*l:*/Active_lmw, /*lines:*/Active_lmw_long, /*w:*/null /*already set*/, /*words:*/null /*already set*/, 
		true, 
		/*active:*/WcOption.chars, WcOption.words
	),
	/** Option set with the following active options: {@link #chars m}, {@link #words w}.*/
	Active_mw_long(
		/*m:*/null /*already set*/, /*chars:*/null /*already set*/, /*l:*/Active_lmw, /*lines:*/Active_lmw_long, /*w:*/null /*already set*/, /*words:*/null /*already set*/, 
		false, 
		/*active:*/WcOption.chars, WcOption.words
	),
	/** Option set with the following active options: {@link #lines l}.*/
	Active_l(
		/*m:*/Active_lm, /*chars:*/Active_lm_long, /*l:*/null /*already set*/, /*lines:*/null /*already set*/, /*w:*/Active_lw, /*words:*/Active_lw_long, 
		true, 
		/*active:*/WcOption.lines
	),
	/** Option set with the following active options: {@link #lines l}.*/
	Active_l_long(
		/*m:*/Active_lm, /*chars:*/Active_lm_long, /*l:*/null /*already set*/, /*lines:*/null /*already set*/, /*w:*/Active_lw, /*words:*/Active_lw_long, 
		false, 
		/*active:*/WcOption.lines
	),
	/** Option set with the following active options: {@link #words w}.*/
	Active_w(
		/*m:*/Active_mw, /*chars:*/Active_mw_long, /*l:*/Active_lw, /*lines:*/Active_lw_long, /*w:*/null /*already set*/, /*words:*/null /*already set*/, 
		true, 
		/*active:*/WcOption.words
	),
	/** Option set with the following active options: {@link #words w}.*/
	Active_w_long(
		/*m:*/Active_mw, /*chars:*/Active_mw_long, /*l:*/Active_lw, /*lines:*/Active_lw_long, /*w:*/null /*already set*/, /*words:*/null /*already set*/, 
		false, 
		/*active:*/WcOption.words
	),
	/** Option set with the following active options: {@link #chars m}.*/
	Active_m(
		/*m:*/null /*already set*/, /*chars:*/null /*already set*/, /*l:*/Active_lm, /*lines:*/Active_lm_long, /*w:*/Active_mw, /*words:*/Active_mw_long, 
		true, 
		/*active:*/WcOption.chars
	),
	/** Option set with the following active options: {@link #chars m}.*/
	Active_m_long(
		/*m:*/null /*already set*/, /*chars:*/null /*already set*/, /*l:*/Active_lm, /*lines:*/Active_lm_long, /*w:*/Active_mw, /*words:*/Active_mw_long, 
		false, 
		/*active:*/WcOption.chars
	);
	private WcOptionSet_lmw(
		WcOptionSet_lmw m, WcOptionSet_lmw chars, WcOptionSet_lmw l, WcOptionSet_lmw lines, WcOptionSet_lmw w, WcOptionSet_lmw words, 
		boolean useAcronym,
		WcOption... activeOptions
	) {
		this.m = m == null ? this : m;
		this.chars = chars == null ? this : chars;
		this.l = l == null ? this : l;
		this.lines = lines == null ? this : lines;
		this.w = w == null ? this : w;
		this.words = words == null ? this : words;
		this.useAcronym = useAcronym;
		this.options = activeOptions.length == 0 ? EnumSet.noneOf(WcOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
	}
	private final boolean useAcronym;
	/**
	 * Option {@code "-m"}: Executes a count of chars and writes this count to the output.
	 * <p>
	 * The option {@code "-m"} is equivalent to the {@code "--}{@link #chars chars}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-m"}. If the option {@code "-m"}
	 * is already set, the field {@code m} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final WcOptionSet_lmw m;
	/**
	 * Option {@code "--chars"}: Executes a count of chars and writes this count to the output.
	 * <p>
	 * The option {@code "--chars"} is equivalent to the {@code "-}{@link #m m}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--chars"}. If the option {@code "--chars"}
	 * is already set, the field {@code chars} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final WcOptionSet_lmw chars;
	/**
	 * Option {@code "-l"}: Executes a count of lines and writes this count to the output.
	 * <p>
	 * The option {@code "-l"} is equivalent to the {@code "--}{@link #lines lines}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-l"}. If the option {@code "-l"}
	 * is already set, the field {@code l} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final WcOptionSet_lmw l;
	/**
	 * Option {@code "--lines"}: Executes a count of lines and writes this count to the output.
	 * <p>
	 * The option {@code "--lines"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--lines"}. If the option {@code "--lines"}
	 * is already set, the field {@code lines} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final WcOptionSet_lmw lines;
	/**
	 * Option {@code "-w"}: Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.
	 * <p>
	 * The option {@code "-w"} is equivalent to the {@code "--}{@link #words words}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-w"}. If the option {@code "-w"}
	 * is already set, the field {@code w} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final WcOptionSet_lmw w;
	/**
	 * Option {@code "--words"}: Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.
	 * <p>
	 * The option {@code "--words"} is equivalent to the {@code "-}{@link #w w}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--words"}. If the option {@code "--words"}
	 * is already set, the field {@code words} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final WcOptionSet_lmw words;
	private final EnumSet<WcOption> options;
	
	//inherit javadoc
	@Override
	public Class<WcOption> optionType() {
		return WcOption.class;
	}
	//inherit javadoc
	@Override
	public boolean isSet(WcOption option) {
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
	public EnumSet<WcOption> asSet() {
		return EnumSet.copyOf(options);
	}
	/**
	 * Returns an immutable iterator with the active options of this option set.
	 * 
	 * @return an immutable iterator for over the active options
	 */
	@Override
	public Iterator<WcOption> iterator() {
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
	 *    WcOptionSet_lmw.chars.l;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    WcOptionSet_lmw.m.lines;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    WcOptionSet_lmw.m.l.chars;
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
	public boolean useAcronymFor(WcOption option) {
		return useAcronym;
	}
}
