package org.unix4j.unix.head;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

import org.unix4j.option.Option;
import org.unix4j.unix.Head;

/**
 * Options for the {@link Head head} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Head#Options} 
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The {@code count} argument is in units of characters instead of 
			lines. Starts from 1 and includes line ending characters.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -q}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --suppressHeaders}</td><td>&nbsp;</td><td>Suppresses printing of headers when multiple files are being
			examined.</td></tr>
 * </table>
 */
public enum HeadOption implements Option, HeadOptions {
	/**
	 * Option <b>{@code --chars}</b>, <b>{@code -c}</b>: 
	 * The {@code count} argument is in units of characters instead of 
			lines. Starts from 1 and includes line ending characters.
	 */
	chars('c'),
	/**
	 * Option <b>{@code --suppressHeaders}</b>, <b>{@code -q}</b>: 
	 * Suppresses printing of headers when multiple files are being
			examined.
	 */
	suppressHeaders('q');
	
	private final char acronym;
	private HeadOption(char acronym) {
		this.acronym = acronym;
	}
	@Override
	public Class<HeadOption> optionType() {
		return HeadOption.class;
	}
	/**
	 * Returns the option with the given {@code acronym}, or {@code null} if no
	 * such option is found.
	 * 
	 * @param acronym the option {@link #acronym() acronym}
	 * @return	the option with the given {@code acronym} or {@code null} if it
	 * 			is not found
	 */
	public static HeadOption findByAcronym(char acronym) {
		for (final HeadOption opt : values()) {
			if (opt.acronym() == acronym) return opt;
		}
		return null;
	}
	@Override
	public char acronym() {
		return acronym;
	}
	@Override
	public boolean isSet(HeadOption option) {
		return equals(option);
	}
	/**
	 * Returns a new set with {@code this} active option.
	 * 
	 * @return a new set containing this option
	 */
	@Override
	public EnumSet<HeadOption> asSet() {
		return EnumSet.of(this);
	}
	
	/**
	 * Returns an immutable iterator returning o single element: {@code this} 
	 * option.
	 * 
	 * @return an immutable iterator with {@code this} active option.
	 */
	@Override
	public Iterator<HeadOption> iterator() {
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
	public boolean useAcronymFor(HeadOption option) {
		return true;
	}
}
