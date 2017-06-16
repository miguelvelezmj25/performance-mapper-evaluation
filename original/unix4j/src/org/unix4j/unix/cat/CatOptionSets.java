package org.unix4j.unix.cat;

import org.unix4j.unix.Cat;

/**
 * Options for the {@link Cat cat} command with the 
 * the following options: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -b}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberNonBlankLines}</td><td>&nbsp;</td><td>Number the non-blank output lines, starting at 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --numberLines}</td><td>&nbsp;</td><td>Number the output lines, starting at 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --squeezeEmptyLines}</td><td>&nbsp;</td><td>Squeeze multiple adjacent empty lines, causing the output to be 
			single spaced.</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code cat} options
 * defined as an enum constant. With this explicit expansion of all possible 
 * option combinations, options can be passed to the command in a very compact 
 * form, such as:
 * <pre>
 * cat(Cat.Options.b, ...);
 * cat(Cat.Options.b.n, ...);
 * ...
 * cat(Cat.Options.b.n.s, ...);
 * </pre>
 */
public final class CatOptionSets {
	/**
	 * The singleton instance.
	 */
	public static final CatOptionSets INSTANCE = new CatOptionSets();
	
	/**
	 * Option {@code "-n"}: Number the output lines, starting at 1.
	 * <p>
	 * The option {@code "-n"} is equivalent to the {@code "--}{@link #numberLines numberLines}{@code "} option.
	 */
	public final CatOptionSet_ns n = CatOptionSet_ns.Active_n;  
	/**
	 * Option {@code "--numberLines"}: Number the output lines, starting at 1.
	 * <p>
	 * The option {@code "--numberLines"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
	 */
	public final CatOptionSet_ns numberLines = CatOptionSet_ns.Active_n_long;  
	/**
	 * Option {@code "-b"}: Number the non-blank output lines, starting at 1.
	 * <p>
	 * The option {@code "-b"} is equivalent to the {@code "--}{@link #numberNonBlankLines numberNonBlankLines}{@code "} option.
	 */
	public final CatOptionSet_bs b = CatOptionSet_bs.Active_b;  
	/**
	 * Option {@code "--numberNonBlankLines"}: Number the non-blank output lines, starting at 1.
	 * <p>
	 * The option {@code "--numberNonBlankLines"} is equivalent to the {@code "-}{@link #b b}{@code "} option.
	 */
	public final CatOptionSet_bs numberNonBlankLines = CatOptionSet_bs.Active_b_long;  
	/**
	 * Option {@code "-s"}: Squeeze multiple adjacent empty lines, causing the output to be 
			single spaced.
	 * <p>
	 * The option {@code "-s"} is equivalent to the {@code "--}{@link #squeezeEmptyLines squeezeEmptyLines}{@code "} option.
	 */
	public final CatOptionSet_bns s = CatOptionSet_bns.Active_s;  
	/**
	 * Option {@code "--squeezeEmptyLines"}: Squeeze multiple adjacent empty lines, causing the output to be 
			single spaced.
	 * <p>
	 * The option {@code "--squeezeEmptyLines"} is equivalent to the {@code "-}{@link #s s}{@code "} option.
	 */
	public final CatOptionSet_bns squeezeEmptyLines = CatOptionSet_bns.Active_s_long;  
	
}
