package org.unix4j.unix.uniq;

import org.unix4j.unix.Uniq;

/**
 * Options for the {@link Uniq uniq} command with the 
 * the following options: 
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
 * <p>
 * This class serves as entry point to every possible set of {@code uniq} options
 * defined as an enum constant. With this explicit expansion of all possible 
 * option combinations, options can be passed to the command in a very compact 
 * form, such as:
 * <pre>
 * uniq(Uniq.Options.c, ...);
 * uniq(Uniq.Options.c.d, ...);
 * ...
 * uniq(Uniq.Options.c.d.u.g, ...);
 * </pre>
 */
public final class UniqOptionSets {
	/**
	 * The singleton instance.
	 */
	public static final UniqOptionSets INSTANCE = new UniqOptionSets();
	
	/**
	 * Option {@code "-c"}: Precedes each output line with a count of the number of times the
			line occurred in the input.
	 * <p>
	 * The option {@code "-c"} is equivalent to the {@code "--}{@link #count count}{@code "} option.
	 */
	public final UniqOptionSet_cg c = UniqOptionSet_cg.Active_c;  
	/**
	 * Option {@code "--count"}: Precedes each output line with a count of the number of times the
			line occurred in the input.
	 * <p>
	 * The option {@code "--count"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
	 */
	public final UniqOptionSet_cg count = UniqOptionSet_cg.Active_c_long;  
	/**
	 * Option {@code "-d"}: Suppresses the writing of lines that are not repeated in the input.
	 * <p>
	 * The option {@code "-d"} is equivalent to the {@code "--}{@link #duplicatedOnly duplicatedOnly}{@code "} option.
	 */
	public final UniqOptionSet_dg d = UniqOptionSet_dg.Active_d;  
	/**
	 * Option {@code "--duplicatedOnly"}: Suppresses the writing of lines that are not repeated in the input.
	 * <p>
	 * The option {@code "--duplicatedOnly"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
	 */
	public final UniqOptionSet_dg duplicatedOnly = UniqOptionSet_dg.Active_d_long;  
	/**
	 * Option {@code "-g"}: Suppresses repeated lines globally, that is, if lines are 
			non-adjacent. This option guarantees unique output lines even if the
			input lines are not sorted.
	 * <p>
	 * The option {@code "-g"} is equivalent to the {@code "--}{@link #global global}{@code "} option.
	 */
	public final UniqOptionSet_cdgu g = UniqOptionSet_cdgu.Active_g;  
	/**
	 * Option {@code "--global"}: Suppresses repeated lines globally, that is, if lines are 
			non-adjacent. This option guarantees unique output lines even if the
			input lines are not sorted.
	 * <p>
	 * The option {@code "--global"} is equivalent to the {@code "-}{@link #g g}{@code "} option.
	 */
	public final UniqOptionSet_cdgu global = UniqOptionSet_cdgu.Active_g_long;  
	/**
	 * Option {@code "-u"}: Suppresses the writing of lines that are repeated in the input.
	 * <p>
	 * The option {@code "-u"} is equivalent to the {@code "--}{@link #uniqueOnly uniqueOnly}{@code "} option.
	 */
	public final UniqOptionSet_gu u = UniqOptionSet_gu.Active_u;  
	/**
	 * Option {@code "--uniqueOnly"}: Suppresses the writing of lines that are repeated in the input.
	 * <p>
	 * The option {@code "--uniqueOnly"} is equivalent to the {@code "-}{@link #u u}{@code "} option.
	 */
	public final UniqOptionSet_gu uniqueOnly = UniqOptionSet_gu.Active_u_long;  
	
}
