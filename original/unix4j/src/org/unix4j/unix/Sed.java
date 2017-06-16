package org.unix4j.unix;

import org.unix4j.command.CommandInterface;

import org.unix4j.unix.sed.SedFactory;
import org.unix4j.unix.sed.SedOption;
import org.unix4j.unix.sed.SedOptions;
import org.unix4j.unix.sed.SedOptionSets;

/**
 * Non-instantiable module with inner types making up the <b>sed</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * sed - stream editor for filtering and transforming text 
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sed <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sed <script>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sed <regexp> <replacement>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sed <regexp> <replacement> <occurrence>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sed [-ngplIsaicdy] <regexp>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sed [-ngplIsaicdy] <string1> <string2>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code sed [-ngplIsaicdy] <string1> <string2> <occurrence>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>	Sed is a stream editor. A stream editor is used to perform basic text	transformations on an input stream (a file or input from a pipeline).	While in some ways similar to an editor which permits scripted edits	(such as ed), sed works by making only one pass over the input(s),	and is consequently more efficient. But it is sed's ability to filter	text in a pipeline which particularly distinguishes it from other	types of editors.</p><p>	<b>Some examples:</b>	<br/>	<pre>input day into sed("s/day/night/") This will output "night"</pre>	<br/>	<pre>input "day and night" into sed("s/\\sand\\s/-to-/") This will output "day-to-night"</pre>	(Note the use of \s whitespace character).	<br/>	Java regular expressions are used for searching and replacing. For an	overview of the Java pattern matching, and substitution, please see the	{@link java.util.regex.Pattern} documentation.</p>
 * 
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --quiet}</td><td>&nbsp;</td><td>Suppress the default output (in which each line, after it is 
			examined for editing, is written to standard output). Only lines 
			explicitly selected for output are written.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Globally substitute for all non-overlapping instances of the regexp 
			rather than just the first one. 
			<p>
			(This option is ignored if the occurrence operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -p}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print}</td><td>&nbsp;</td><td>Write the matched line to standard output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Writes the current line number on a separate line to the standard 
			output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -I}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive pattern matching.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --substitute}</td><td>&nbsp;</td><td>Substitutes the replacement string for instances of the regexp in 
			the matched line.
			<p>
			An ampersand ('&') appearing in the replacement is be replaced 
			by the line matching the regexp. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression.  The special meaning of '&' and "\n" 
			in this context can be suppressed by preceding it by a backslash. 
<p>
			A line can be split by substituting a newline ('\n') into it. 
			<p>
			A substitution is considered to have been performed even if the 
			replacement string is identical to the string that it replaces.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --append}</td><td>&nbsp;</td><td>Append string2 as a separate line after the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --insert}</td><td>&nbsp;</td><td>Insert string2 as a separate line before the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --change}</td><td>&nbsp;</td><td>Write string2 as a separate line instead of the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delete}</td><td>&nbsp;</td><td>Delete the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -y}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --translate}</td><td>&nbsp;</td><td>Replace all occurrences of characters in string1 with the 
			corresponding characters in string2. If the number of characters in 
			the two strings are not equal, or if any of the characters in 
			string1 appear more than once, the results are undefined.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <script>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Sed script as one string, such as "s/original/replacement/g".</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <regexp>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Regular expression matched against a line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <string1>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Regular expression matched against a line for all commands except 
			for command y where string1 contains the source characters for the 
			translation.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <replacement>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Replacement string for substitute command. An ampersand ('&') 
			appearing in the replacement string is replaced by the string 
			matching the regular expression. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression. The special meaning of '&' and "\n" in 
			this context can be suppressed by preceding it by a backslash.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <string2>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Replacement string for substitute command s; appended, inserted or
			changed text for a, i and c command; destination characters for
			translate command y; ignored by all other commands.
			<p>
			If string2 is a replacement string for the substitute command: an 
			ampersand ('&') appearing in the replacement string is replaced 
			by the string matching the regular expression; the characters "\n", 
			where n is a digit, are replaced by the text matched by the 
			corresponding backreference expression. The special meaning of 
			'&' and "\n" in this context can be suppressed by preceding it 
			by a backslash.
<p>
			(This operand only applies to the commands s, a, i, c and y and is 
			ignored by all other commands).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <occurrence>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code int...}</td><td>&nbsp;</td><td>Substitute for the given occurrences only of the regexp found within 
			the matched string; the occurrence indices are one-based. If empty 
			or omitted, all occurrences are substituted.
			<p>
			(This operand only applies to the substitute command and is ignored
			by all other commands).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--script" operand have to be prefixed with the operand name
			(e.g. "--occurrence" for subsequent occurrence indices).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code SedOptions}</td><td>&nbsp;</td><td>Sed options and commands</td></tr>
 * </table>
 */
public final class Sed {
	/**
	 * The "sed" command name.
	 */
	public static final String NAME = "sed";

	/**
	 * Interface defining all method signatures for the "sed" command.
	 * 
	 * @param <R>
	 *            the generic return type for all command signature methods
	 *            to support different implementor types; the methods of a 
	 *            command factory for instance returns a command instance; 
	 *            command builders can also implement this interface, but their
	 *            methods return the builder itself enabling for chained method
	 *            invocation to create joined commands
	 */
	public static interface Interface<R> extends CommandInterface<R> {
		/**
		 * Executes the sed script specified by the given arguments and writes
			the result to the standard output. 
			<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--script" operand have to be prefixed with the operand name.
		 *
		 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--script" operand have to be prefixed with the operand name
			(e.g. "--occurrence" for subsequent occurrence indices).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R sed(String... args);
		/**
		 * Executes the given sed script, such as "s/original/replacement/g".
		 *
		 * @param script Sed script as one string, such as "s/original/replacement/g".
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R sed(String script);
		/**
		 * Substitutes the replacement string for instances of the regexp in 
			the matched line.
			<p>
			An ampersand ('&') appearing in the replacement is be replaced 
			by the line matching the regexp. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression.  The special meaning of '&' and "\n" 
			in this context can be suppressed by preceding it by a backslash. 
<p>
			A line can be split by substituting a newline ('\n') into it. 
			<p>
			A substitution is considered to have been performed even if the 
			replacement string is identical to the string that it replaces.
		 *
		 * @param regexp Regular expression matched against a line.
		 * @param replacement Replacement string for substitute command. An ampersand ('&') 
			appearing in the replacement string is replaced by the string 
			matching the regular expression. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression. The special meaning of '&' and "\n" in 
			this context can be suppressed by preceding it by a backslash.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R sed(String regexp, String replacement);
		/**
		 * Substitutes the replacement string for instances of the regexp in 
			the matched line. Only the given occurrences of the regexp found 
			within the matched string are substituted. 
			<p>
			An ampersand ('&') appearing in the replacement is be replaced 
			by the line matching the regexp. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression.  The special meaning of '&' and "\n" 
			in this context can be suppressed by preceding it by a backslash. 
<p>
			A line can be split by substituting a newline ('\n') into it. 
			<p>
			A substitution is considered to have been performed even if the 
			replacement string is identical to the string that it replaces.
		 *
		 * @param regexp Regular expression matched against a line.
		 * @param replacement Replacement string for substitute command. An ampersand ('&') 
			appearing in the replacement string is replaced by the string 
			matching the regular expression. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression. The special meaning of '&' and "\n" in 
			this context can be suppressed by preceding it by a backslash.
		 * @param occurrence Substitute for the given occurrences only of the regexp found within 
			the matched string; the occurrence indices are one-based. If empty 
			or omitted, all occurrences are substituted.
			<p>
			(This operand only applies to the substitute command and is ignored
			by all other commands).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R sed(String regexp, String replacement, int... occurrence);
		/**
		 * Executes the sed command specified by the given options or executes
			the print command p if no command option has been declared.
		 *
		 * @param options Sed options and commands
		 * @param regexp Regular expression matched against a line.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R sed(SedOptions options, String regexp);
		/**
		 * Executes the sed command specified by the given options or executes
			the substitute command s if no command option has been declared.
		 *
		 * @param options Sed options and commands
		 * @param string1 Regular expression matched against a line for all commands except 
			for command y where string1 contains the source characters for the 
			translation.
		 * @param string2 Replacement string for substitute command s; appended, inserted or
			changed text for a, i and c command; destination characters for
			translate command y; ignored by all other commands.
			<p>
			If string2 is a replacement string for the substitute command: an 
			ampersand ('&') appearing in the replacement string is replaced 
			by the string matching the regular expression; the characters "\n", 
			where n is a digit, are replaced by the text matched by the 
			corresponding backreference expression. The special meaning of 
			'&' and "\n" in this context can be suppressed by preceding it 
			by a backslash.
<p>
			(This operand only applies to the commands s, a, i, c and y and is 
			ignored by all other commands).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R sed(SedOptions options, String string1, String string2);
		/**
		 * Executes the sed command specified by the given options or executes
			the substitute command s if no command option has been declared.
			<p>
			The string1 operand usually contains the regular expression matched 
			against a line for all commands except for command y where string1 
			contains the source characters for the translation.
			<p>
			The string2 operand contains the replacement string for the 
			substitute command s. It contains the appended, inserted or changed 
			text for the commands a, i and c, respectively, and the destination 
			characters for the translate command y. All other commands ignore
			the string2 operand.
		 *
		 * @param options Sed options and commands
		 * @param string1 Regular expression matched against a line for all commands except 
			for command y where string1 contains the source characters for the 
			translation.
		 * @param string2 Replacement string for substitute command s; appended, inserted or
			changed text for a, i and c command; destination characters for
			translate command y; ignored by all other commands.
			<p>
			If string2 is a replacement string for the substitute command: an 
			ampersand ('&') appearing in the replacement string is replaced 
			by the string matching the regular expression; the characters "\n", 
			where n is a digit, are replaced by the text matched by the 
			corresponding backreference expression. The special meaning of 
			'&' and "\n" in this context can be suppressed by preceding it 
			by a backslash.
<p>
			(This operand only applies to the commands s, a, i, c and y and is 
			ignored by all other commands).
		 * @param occurrence Substitute for the given occurrences only of the regexp found within 
			the matched string; the occurrence indices are one-based. If empty 
			or omitted, all occurrences are substituted.
			<p>
			(This operand only applies to the substitute command and is ignored
			by all other commands).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R sed(SedOptions options, String string1, String string2, int... occurrence);
	}

	/**
	 * Options for the "sed" command: {@link SedOption#quiet n}, {@link SedOption#global g}, {@link SedOption#print p}, {@link SedOption#lineNumber l}, {@link SedOption#ignoreCase I}, {@link SedOption#substitute s}, {@link SedOption#append a}, {@link SedOption#insert i}, {@link SedOption#change c}, {@link SedOption#delete d}, {@link SedOption#translate y}.
	 * <p> 
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --quiet}</td><td>&nbsp;</td><td>Suppress the default output (in which each line, after it is 
			examined for editing, is written to standard output). Only lines 
			explicitly selected for output are written.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Globally substitute for all non-overlapping instances of the regexp 
			rather than just the first one. 
			<p>
			(This option is ignored if the occurrence operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -p}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print}</td><td>&nbsp;</td><td>Write the matched line to standard output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Writes the current line number on a separate line to the standard 
			output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -I}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive pattern matching.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --substitute}</td><td>&nbsp;</td><td>Substitutes the replacement string for instances of the regexp in 
			the matched line.
			<p>
			An ampersand ('&') appearing in the replacement is be replaced 
			by the line matching the regexp. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression.  The special meaning of '&' and "\n" 
			in this context can be suppressed by preceding it by a backslash. 
<p>
			A line can be split by substituting a newline ('\n') into it. 
			<p>
			A substitution is considered to have been performed even if the 
			replacement string is identical to the string that it replaces.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --append}</td><td>&nbsp;</td><td>Append string2 as a separate line after the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --insert}</td><td>&nbsp;</td><td>Insert string2 as a separate line before the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --change}</td><td>&nbsp;</td><td>Write string2 as a separate line instead of the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delete}</td><td>&nbsp;</td><td>Delete the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -y}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --translate}</td><td>&nbsp;</td><td>Replace all occurrences of characters in string1 with the 
			corresponding characters in string2. If the number of characters in 
			the two strings are not equal, or if any of the characters in 
			string1 appear more than once, the results are undefined.</td></tr>
 * </table>
	 */
	public static final SedOptionSets Options = SedOptionSets.INSTANCE;

	/**
	 * Singleton {@link SedFactory factory} instance for the "sed" command.
	 */
	public static final SedFactory Factory = SedFactory.INSTANCE;

	// no instances
	private Sed() {
		super();
	}
}
