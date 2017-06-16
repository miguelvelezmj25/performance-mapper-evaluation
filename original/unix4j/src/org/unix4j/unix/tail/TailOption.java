package org.unix4j.unix.tail;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

import org.unix4j.option.Option;
import org.unix4j.unix.Tail;

/**
 * Options for the {@link Tail tail} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Tail#Options} 
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The {@code count} argument is in units of characters instead of 
			lines. Starts from 1 and includes line ending characters.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -q}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --suppressHeaders}</td><td>&nbsp;</td><td>Suppresses printing of headers when multiple files are being
			examined.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --countFromStart}</td><td>&nbsp;</td><td>The {@code count} argument is relative to the beginning of the file
			instead of counting from the end of the file. For instance, 
			{@code tail -s 10} prints the lines starting from line 10;
			{@code tail -s 1} prints the whole file.</td></tr>
 * </table>
 */
public enum TailOption implements Option, TailOptions {
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
	suppressHeaders('q'),
	/**
	 * Option <b>{@code --countFromStart}</b>, <b>{@code -s}</b>: 
	 * The {@code count} argument is relative to the beginning of the file
			instead of counting from the end of the file. For instance, 
			{@code tail -s 10} prints the lines starting from line 10;
			{@code tail -s 1} prints the whole file.
	 */
	countFromStart('s');
	
	private final char acronym;
	private TailOption(char acronym) {
		this.acronym = acronym;
	}
	@Override
	public Class<TailOption> optionType() {
		return TailOption.class;
	}
	/**
	 * Returns the option with the given {@code acronym}, or {@code null} if no
	 * such option is found.
	 * 
	 * @param acronym the option {@link #acronym() acronym}
	 * @return	the option with the given {@code acronym} or {@code null} if it
	 * 			is not found
	 */
	public static TailOption findByAcronym(char acronym) {
		for (final TailOption opt : values()) {
			if (opt.acronym() == acronym) return opt;
		}
		return null;
	}
	@Override
	public char acronym() {
		return acronym;
	}
	@Override
	public boolean isSet(TailOption option) {
		return equals(option);
	}
	/**
	 * Returns a new set with {@code this} active option.
	 * 
	 * @return a new set containing this option
	 */
	@Override
	public EnumSet<TailOption> asSet() {
		return EnumSet.of(this);
	}
	
	/**
	 * Returns an immutable iterator returning o single element: {@code this} 
	 * option.
	 * 
	 * @return an immutable iterator with {@code this} active option.
	 */
	@Override
	public Iterator<TailOption> iterator() {
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
	public boolean useAcronymFor(TailOption option) {
		return true;
	}
}
