package org.unix4j.unix.wc;

import org.unix4j.unix.Wc;

/**
 * Options for the {@link Wc wc} command with the 
 * the following options: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lines}</td><td>&nbsp;</td><td>Executes a count of lines and writes this count to the output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -w}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --words}</td><td>&nbsp;</td><td>Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>Executes a count of chars and writes this count to the output.</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code wc} options
 * defined as an enum constant. With this explicit expansion of all possible 
 * option combinations, options can be passed to the command in a very compact 
 * form, such as:
 * <pre>
 * wc(Wc.Options.l, ...);
 * wc(Wc.Options.l.w, ...);
 * ...
 * wc(Wc.Options.l.w.m, ...);
 * </pre>
 */
public final class WcOptionSets {
	/**
	 * The singleton instance.
	 */
	public static final WcOptionSets INSTANCE = new WcOptionSets();
	
	/**
	 * Option {@code "-m"}: Executes a count of chars and writes this count to the output.
	 * <p>
	 * The option {@code "-m"} is equivalent to the {@code "--}{@link #chars chars}{@code "} option.
	 */
	public final WcOptionSet_lmw m = WcOptionSet_lmw.Active_m;  
	/**
	 * Option {@code "--chars"}: Executes a count of chars and writes this count to the output.
	 * <p>
	 * The option {@code "--chars"} is equivalent to the {@code "-}{@link #m m}{@code "} option.
	 */
	public final WcOptionSet_lmw chars = WcOptionSet_lmw.Active_m_long;  
	/**
	 * Option {@code "-l"}: Executes a count of lines and writes this count to the output.
	 * <p>
	 * The option {@code "-l"} is equivalent to the {@code "--}{@link #lines lines}{@code "} option.
	 */
	public final WcOptionSet_lmw l = WcOptionSet_lmw.Active_l;  
	/**
	 * Option {@code "--lines"}: Executes a count of lines and writes this count to the output.
	 * <p>
	 * The option {@code "--lines"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
	 */
	public final WcOptionSet_lmw lines = WcOptionSet_lmw.Active_l_long;  
	/**
	 * Option {@code "-w"}: Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.
	 * <p>
	 * The option {@code "-w"} is equivalent to the {@code "--}{@link #words words}{@code "} option.
	 */
	public final WcOptionSet_lmw w = WcOptionSet_lmw.Active_w;  
	/**
	 * Option {@code "--words"}: Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.
	 * <p>
	 * The option {@code "--words"} is equivalent to the {@code "-}{@link #w w}{@code "} option.
	 */
	public final WcOptionSet_lmw words = WcOptionSet_lmw.Active_w_long;  
	
}
