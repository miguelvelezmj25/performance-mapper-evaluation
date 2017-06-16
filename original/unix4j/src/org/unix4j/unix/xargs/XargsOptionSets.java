package org.unix4j.unix.xargs;

import org.unix4j.unix.Xargs;

/**
 * Options for the {@link Xargs xargs} command with the 
 * the following options: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -z}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delimiter0}</td><td>&nbsp;</td><td>Input items are terminated by a null character instead of by 
			whitespace, and the quotes and backslash are not special (every
			character is taken literally). Disables the end of file string,
			which is treated like any other argument. Useful when input items 
			might contain white space, quote marks, or backslashes. The find 
			--print0 option produces input suitable for this mode.
			<p>
			(This option is ignored if an explicit delimiter operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --exactArgs}</td><td>&nbsp;</td><td>Terminate immediately if {@code maxArgs} is specified but the found
			number of variable items is less than {@code maxArgs}.		
<p>
			(This option is ignored if no {@code maxArgs} operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noRunIfEmpty}</td><td>&nbsp;</td><td>If the standard input does not contain any nonblanks, do not run the
 			command. Normally, the command is run once even if there is no 
 			input.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --verbose}</td><td>&nbsp;</td><td>Print the command line on the standard error output before executing
			it.</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code xargs} options
 * defined as an enum constant. With this explicit expansion of all possible 
 * option combinations, options can be passed to the command in a very compact 
 * form, such as:
 * <pre>
 * xargs(Xargs.Options.z, ...);
 * xargs(Xargs.Options.z.x, ...);
 * ...
 * xargs(Xargs.Options.z.x.r.t, ...);
 * </pre>
 */
public final class XargsOptionSets {
	/**
	 * The singleton instance.
	 */
	public static final XargsOptionSets INSTANCE = new XargsOptionSets();
	
	/**
	 * Option {@code "-z"}: Input items are terminated by a null character instead of by 
			whitespace, and the quotes and backslash are not special (every
			character is taken literally). Disables the end of file string,
			which is treated like any other argument. Useful when input items 
			might contain white space, quote marks, or backslashes. The find 
			--print0 option produces input suitable for this mode.
			<p>
			(This option is ignored if an explicit delimiter operand is specified).
	 * <p>
	 * The option {@code "-z"} is equivalent to the {@code "--}{@link #delimiter0 delimiter0}{@code "} option.
	 */
	public final XargsOptionSet_rtxz z = XargsOptionSet_rtxz.Active_z;  
	/**
	 * Option {@code "--delimiter0"}: Input items are terminated by a null character instead of by 
			whitespace, and the quotes and backslash are not special (every
			character is taken literally). Disables the end of file string,
			which is treated like any other argument. Useful when input items 
			might contain white space, quote marks, or backslashes. The find 
			--print0 option produces input suitable for this mode.
			<p>
			(This option is ignored if an explicit delimiter operand is specified).
	 * <p>
	 * The option {@code "--delimiter0"} is equivalent to the {@code "-}{@link #z z}{@code "} option.
	 */
	public final XargsOptionSet_rtxz delimiter0 = XargsOptionSet_rtxz.Active_z_long;  
	/**
	 * Option {@code "-x"}: Terminate immediately if {@code maxArgs} is specified but the found
			number of variable items is less than {@code maxArgs}.		
<p>
			(This option is ignored if no {@code maxArgs} operand is specified).
	 * <p>
	 * The option {@code "-x"} is equivalent to the {@code "--}{@link #exactArgs exactArgs}{@code "} option.
	 */
	public final XargsOptionSet_rtxz x = XargsOptionSet_rtxz.Active_x;  
	/**
	 * Option {@code "--exactArgs"}: Terminate immediately if {@code maxArgs} is specified but the found
			number of variable items is less than {@code maxArgs}.		
<p>
			(This option is ignored if no {@code maxArgs} operand is specified).
	 * <p>
	 * The option {@code "--exactArgs"} is equivalent to the {@code "-}{@link #x x}{@code "} option.
	 */
	public final XargsOptionSet_rtxz exactArgs = XargsOptionSet_rtxz.Active_x_long;  
	/**
	 * Option {@code "-r"}: If the standard input does not contain any nonblanks, do not run the
 			command. Normally, the command is run once even if there is no 
 			input.
	 * <p>
	 * The option {@code "-r"} is equivalent to the {@code "--}{@link #noRunIfEmpty noRunIfEmpty}{@code "} option.
	 */
	public final XargsOptionSet_rtxz r = XargsOptionSet_rtxz.Active_r;  
	/**
	 * Option {@code "--noRunIfEmpty"}: If the standard input does not contain any nonblanks, do not run the
 			command. Normally, the command is run once even if there is no 
 			input.
	 * <p>
	 * The option {@code "--noRunIfEmpty"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
	 */
	public final XargsOptionSet_rtxz noRunIfEmpty = XargsOptionSet_rtxz.Active_r_long;  
	/**
	 * Option {@code "-t"}: Print the command line on the standard error output before executing
			it.
	 * <p>
	 * The option {@code "-t"} is equivalent to the {@code "--}{@link #verbose verbose}{@code "} option.
	 */
	public final XargsOptionSet_rtxz t = XargsOptionSet_rtxz.Active_t;  
	/**
	 * Option {@code "--verbose"}: Print the command line on the standard error output before executing
			it.
	 * <p>
	 * The option {@code "--verbose"} is equivalent to the {@code "-}{@link #t t}{@code "} option.
	 */
	public final XargsOptionSet_rtxz verbose = XargsOptionSet_rtxz.Active_t_long;  
	
}
