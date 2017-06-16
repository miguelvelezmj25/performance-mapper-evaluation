package org.unix4j.unix.uniq;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

import org.unix4j.option.Option;
import org.unix4j.unix.Uniq;

/**
 * Options for the {@link Uniq uniq} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Uniq#Options} 
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --count}</td><td>&nbsp;</td><td>Precedes each output line with a count of the number of times the
			line occurred in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --duplicatedOnly}</td><td>&nbsp;</td><td>Suppresses the writing of lines that are not repeated in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -u}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --uniqueOnly}</td><td>&nbsp;</td><td>Suppresses the writing of lines that are repeated in the input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Suppresses repeated lines globally, that is, if lines are 
			non-adjacent. This option guarantees unique output lines even if the
			input lines are not sorted.</td></tr>
 * </table>
 */
public enum UniqOption implements Option, UniqOptions {
	/**
	 * Option <b>{@code --count}</b>, <b>{@code -c}</b>: 
	 * Precedes each output line with a count of the number of times the
			line occurred in the input.
	 */
	count('c'),
	/**
	 * Option <b>{@code --duplicatedOnly}</b>, <b>{@code -d}</b>: 
	 * Suppresses the writing of lines that are not repeated in the input.
	 */
	duplicatedOnly('d'),
	/**
	 * Option <b>{@code --uniqueOnly}</b>, <b>{@code -u}</b>: 
	 * Suppresses the writing of lines that are repeated in the input.
	 */
	uniqueOnly('u'),
	/**
	 * Option <b>{@code --global}</b>, <b>{@code -g}</b>: 
	 * Suppresses repeated lines globally, that is, if lines are 
			non-adjacent. This option guarantees unique output lines even if the
			input lines are not sorted.
	 */
	global('g');
	
	private final char acronym;
	private UniqOption(char acronym) {
		this.acronym = acronym;
	}
	@Override
	public Class<UniqOption> optionType() {
		return UniqOption.class;
	}
	/**
	 * Returns the option with the given {@code acronym}, or {@code null} if no
	 * such option is found.
	 * 
	 * @param acronym the option {@link #acronym() acronym}
	 * @return	the option with the given {@code acronym} or {@code null} if it
	 * 			is not found
	 */
	public static UniqOption findByAcronym(char acronym) {
		for (final UniqOption opt : values()) {
			if (opt.acronym() == acronym) return opt;
		}
		return null;
	}
	@Override
	public char acronym() {
		return acronym;
	}
	@Override
	public boolean isSet(UniqOption option) {
		return equals(option);
	}
	/**
	 * Returns a new set with {@code this} active option.
	 * 
	 * @return a new set containing this option
	 */
	@Override
	public EnumSet<UniqOption> asSet() {
		return EnumSet.of(this);
	}
	
	/**
	 * Returns an immutable iterator returning o single element: {@code this} 
	 * option.
	 * 
	 * @return an immutable iterator with {@code this} active option.
	 */
	@Override
	public Iterator<UniqOption> iterator() {
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
	public boolean useAcronymFor(UniqOption option) {
		return true;
	}
}
