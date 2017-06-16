package org.unix4j.unix.grep;

import org.unix4j.unix.Grep;

/**
 * Options for the {@link Grep grep} command with the 
 * the following options: 
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Match lines ignoring the case when comparing the strings, also known
			from Unix with its acronym 'i'.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -v}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --invertMatch}</td><td>&nbsp;</td><td>Invert the match result, that is, a non-matching line is written to
			the output and a matching line is not. This option is also known 
			from Unix with its acronym 'v'.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -F}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fixedStrings}</td><td>&nbsp;</td><td>Use fixed-strings matching instead of regular expressions. This is
			usually faster than the standard regexp version.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Prefix each line of output with the line number within its input
			file.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --count}</td><td>&nbsp;</td><td>Suppress normal output; instead print a count of matching lines for
			each input file. With the {@code -v}, {@code --invertMatch} option,
			count non-matching lines.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --matchingFiles}</td><td>&nbsp;</td><td>Suppress normal output; instead print the name of each input file
			from which output would normally have been printed. The scanning
			will stop on the first match.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --wholeLine}</td><td>&nbsp;</td><td>Select only those matches that exactly match the whole line
			excluding the terminating line ending.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code grep} options
 * defined as an enum constant. With this explicit expansion of all possible 
 * option combinations, options can be passed to the command in a very compact 
 * form, such as:
 * <pre>
 * grep(Grep.Options.i, ...);
 * grep(Grep.Options.i.v, ...);
 * ...
 * grep(Grep.Options.i.v.F.n.c.l.x, ...);
 * </pre>
 */
public final class GrepOptionSets {
	/**
	 * The singleton instance.
	 */
	public static final GrepOptionSets INSTANCE = new GrepOptionSets();
	
	/**
	 * Option {@code "-c"}: Suppress normal output; instead print a count of matching lines for
			each input file. With the {@code -v}, {@code --invertMatch} option,
			count non-matching lines.
	 * <p>
	 * The option {@code "-c"} is equivalent to the {@code "--}{@link #count count}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx c = GrepOptionSet_Fcilnvx.Active_c;  
	/**
	 * Option {@code "--count"}: Suppress normal output; instead print a count of matching lines for
			each input file. With the {@code -v}, {@code --invertMatch} option,
			count non-matching lines.
	 * <p>
	 * The option {@code "--count"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx count = GrepOptionSet_Fcilnvx.Active_c_long;  
	/**
	 * Option {@code "-F"}: Use fixed-strings matching instead of regular expressions. This is
			usually faster than the standard regexp version.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).
	 * <p>
	 * The option {@code "-F"} is equivalent to the {@code "--}{@link #fixedStrings fixedStrings}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx F = GrepOptionSet_Fcilnvx.Active_F;  
	/**
	 * Option {@code "--fixedStrings"}: Use fixed-strings matching instead of regular expressions. This is
			usually faster than the standard regexp version.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).
	 * <p>
	 * The option {@code "--fixedStrings"} is equivalent to the {@code "-}{@link #F F}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx fixedStrings = GrepOptionSet_Fcilnvx.Active_F_long;  
	/**
	 * Option {@code "-i"}: Match lines ignoring the case when comparing the strings, also known
			from Unix with its acronym 'i'.
	 * <p>
	 * The option {@code "-i"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx i = GrepOptionSet_Fcilnvx.Active_i;  
	/**
	 * Option {@code "--ignoreCase"}: Match lines ignoring the case when comparing the strings, also known
			from Unix with its acronym 'i'.
	 * <p>
	 * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #i i}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx ignoreCase = GrepOptionSet_Fcilnvx.Active_i_long;  
	/**
	 * Option {@code "-v"}: Invert the match result, that is, a non-matching line is written to
			the output and a matching line is not. This option is also known 
			from Unix with its acronym 'v'.
	 * <p>
	 * The option {@code "-v"} is equivalent to the {@code "--}{@link #invertMatch invertMatch}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx v = GrepOptionSet_Fcilnvx.Active_v;  
	/**
	 * Option {@code "--invertMatch"}: Invert the match result, that is, a non-matching line is written to
			the output and a matching line is not. This option is also known 
			from Unix with its acronym 'v'.
	 * <p>
	 * The option {@code "--invertMatch"} is equivalent to the {@code "-}{@link #v v}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx invertMatch = GrepOptionSet_Fcilnvx.Active_v_long;  
	/**
	 * Option {@code "-n"}: Prefix each line of output with the line number within its input
			file.
	 * <p>
	 * The option {@code "-n"} is equivalent to the {@code "--}{@link #lineNumber lineNumber}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx n = GrepOptionSet_Fcilnvx.Active_n;  
	/**
	 * Option {@code "--lineNumber"}: Prefix each line of output with the line number within its input
			file.
	 * <p>
	 * The option {@code "--lineNumber"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx lineNumber = GrepOptionSet_Fcilnvx.Active_n_long;  
	/**
	 * Option {@code "-l"}: Suppress normal output; instead print the name of each input file
			from which output would normally have been printed. The scanning
			will stop on the first match.
	 * <p>
	 * The option {@code "-l"} is equivalent to the {@code "--}{@link #matchingFiles matchingFiles}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx l = GrepOptionSet_Fcilnvx.Active_l;  
	/**
	 * Option {@code "--matchingFiles"}: Suppress normal output; instead print the name of each input file
			from which output would normally have been printed. The scanning
			will stop on the first match.
	 * <p>
	 * The option {@code "--matchingFiles"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx matchingFiles = GrepOptionSet_Fcilnvx.Active_l_long;  
	/**
	 * Option {@code "-x"}: Select only those matches that exactly match the whole line
			excluding the terminating line ending.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).
	 * <p>
	 * The option {@code "-x"} is equivalent to the {@code "--}{@link #wholeLine wholeLine}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx x = GrepOptionSet_Fcilnvx.Active_x;  
	/**
	 * Option {@code "--wholeLine"}: Select only those matches that exactly match the whole line
			excluding the terminating line ending.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).
	 * <p>
	 * The option {@code "--wholeLine"} is equivalent to the {@code "-}{@link #x x}{@code "} option.
	 */
	public final GrepOptionSet_Fcilnvx wholeLine = GrepOptionSet_Fcilnvx.Active_x_long;  
	
}
