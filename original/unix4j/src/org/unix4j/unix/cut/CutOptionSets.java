package org.unix4j.unix.cut;

import org.unix4j.unix.Cut;

/**
 * Options for the {@link Cut cut} command with the 
 * the following options: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The list specifies character positions.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fields}</td><td>&nbsp;</td><td>The list specifies fields, separated in the input by the field
			delimiter character (see the -d option.)  Output fields are
			separated by a single occurrence of the field delimiter character.</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code cut} options
 * defined as an enum constant. With this explicit expansion of all possible 
 * option combinations, options can be passed to the command in a very compact 
 * form, such as:
 * <pre>
 * cut(Cut.Options.c, ...);
 * cut(Cut.Options.c.f, ...);
 * </pre>
 */
public final class CutOptionSets {
	/**
	 * The singleton instance.
	 */
	public static final CutOptionSets INSTANCE = new CutOptionSets();
	
	/**
	 * Option {@code "-c"}: The list specifies character positions.
	 * <p>
	 * The option {@code "-c"} is equivalent to the {@code "--}{@link #chars chars}{@code "} option.
	 */
	public final CutOptionSet_cf c = CutOptionSet_cf.Active_c;  
	/**
	 * Option {@code "--chars"}: The list specifies character positions.
	 * <p>
	 * The option {@code "--chars"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
	 */
	public final CutOptionSet_cf chars = CutOptionSet_cf.Active_c_long;  
	/**
	 * Option {@code "-f"}: The list specifies fields, separated in the input by the field
			delimiter character (see the -d option.)  Output fields are
			separated by a single occurrence of the field delimiter character.
	 * <p>
	 * The option {@code "-f"} is equivalent to the {@code "--}{@link #fields fields}{@code "} option.
	 */
	public final CutOptionSet_cf f = CutOptionSet_cf.Active_f;  
	/**
	 * Option {@code "--fields"}: The list specifies fields, separated in the input by the field
			delimiter character (see the -d option.)  Output fields are
			separated by a single occurrence of the field delimiter character.
	 * <p>
	 * The option {@code "--fields"} is equivalent to the {@code "-}{@link #f f}{@code "} option.
	 */
	public final CutOptionSet_cf fields = CutOptionSet_cf.Active_f_long;  
	
}
