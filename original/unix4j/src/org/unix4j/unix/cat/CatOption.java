package org.unix4j.unix.cat;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

import org.unix4j.option.Option;
import org.unix4j.unix.Cat;

/**
 * Options for the {@link Cat cat} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Cat#Options} 
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -b}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberNonBlankLines}</td><td>&nbsp;</td><td>Number the non-blank output lines, starting at 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberLines}</td><td>&nbsp;</td><td>Number the output lines, starting at 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --squeezeEmptyLines}</td><td>&nbsp;</td><td>Squeeze multiple adjacent empty lines, causing the output to be 
			single spaced.</td></tr>
 * </table>
 */
public enum CatOption implements Option, CatOptions {
	/**
	 * Option <b>{@code --numberNonBlankLines}</b>, <b>{@code -b}</b>: 
	 * Number the non-blank output lines, starting at 1.
	 */
	numberNonBlankLines('b'),
	/**
	 * Option <b>{@code --numberLines}</b>, <b>{@code -n}</b>: 
	 * Number the output lines, starting at 1.
	 */
	numberLines('n'),
	/**
	 * Option <b>{@code --squeezeEmptyLines}</b>, <b>{@code -s}</b>: 
	 * Squeeze multiple adjacent empty lines, causing the output to be 
			single spaced.
	 */
	squeezeEmptyLines('s');
	
	private final char acronym;
	private CatOption(char acronym) {
		this.acronym = acronym;
	}
	@Override
	public Class<CatOption> optionType() {
		return CatOption.class;
	}
	/**
	 * Returns the option with the given {@code acronym}, or {@code null} if no
	 * such option is found.
	 * 
	 * @param acronym the option {@link #acronym() acronym}
	 * @return	the option with the given {@code acronym} or {@code null} if it
	 * 			is not found
	 */
	public static CatOption findByAcronym(char acronym) {
		for (final CatOption opt : values()) {
			if (opt.acronym() == acronym) return opt;
		}
		return null;
	}
	@Override
	public char acronym() {
		return acronym;
	}
	@Override
	public boolean isSet(CatOption option) {
		return equals(option);
	}
	/**
	 * Returns a new set with {@code this} active option.
	 * 
	 * @return a new set containing this option
	 */
	@Override
	public EnumSet<CatOption> asSet() {
		return EnumSet.of(this);
	}
	
	/**
	 * Returns an immutable iterator returning o single element: {@code this} 
	 * option.
	 * 
	 * @return an immutable iterator with {@code this} active option.
	 */
	@Override
	public Iterator<CatOption> iterator() {
		return Collections.singleton(this).iterator();
	}
	
	/**
	 * Returns 1 as this is a set with a single element: {@code this} option
	 * 
	 * @return one
	 */
	@Override
	public int size() {
		return 1;
	}

	/**
	 * Returns true if the {@link Option#acronym() acronym} should be used for
	 * the specified {@code option} in string representations. 
	 * <p>
	 * This method returns always true for all options.
	 *  
	 * @param option
	 *            the option of interest
	 * @return always true indicating that option acronyms should be used in
	 * 			string representations for all options
	 */
	@Override
	public boolean useAcronymFor(CatOption option) {
		return true;
	}
}
