package org.unix4j.unix;

import org.unix4j.command.CommandInterface;

import org.unix4j.unix.wc.WcFactory;
import org.unix4j.unix.wc.WcOption;
import org.unix4j.unix.wc.WcOptions;
import org.unix4j.unix.wc.WcOptionSets;

/**
 * Non-instantiable module with inner types making up the <b>wc</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * wc - word, line, and byte or character count 
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code wc}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code wc <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code wc <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code wc [-lwm]}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code wc [-lwm] <files>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code wc [-lwm] <paths>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>The wc utility reads from the input and, by default, writes thenumber of lines, words, and characters to the output. If more than one input file is specified, a line of cumulative counts for all the files is displayed ona separate line after the output for the last file.</p><p>The wc utility considers a word to be a non-zero-length string of charactersdelimited by white space. White space characters are the set of characters for which {@link Character#isWhitespace(char)} returns true.</p><p>When any option is specified, wc reports only the information requested bythe specified options.</p><p>If only one count type is requested, the count is outputted as an integer. Ifmore than one count is requested, a fixed width formatting is used, with thecounts being right aligned. The width of each field is equal to the width ofthe widest field (count) plus two characters.</p>
 * 
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lines}</td><td>&nbsp;</td><td>Executes a count of lines and writes this count to the output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -w}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --words}</td><td>&nbsp;</td><td>Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>Executes a count of chars and writes this count to the output.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <paths>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String[]}</td><td>&nbsp;</td><td>Pathnames of the input files; wildcards * and ? are supported;
			relative paths are resolved on the basis of the current working 
			directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <files>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File...}</td><td>&nbsp;</td><td>The input files; relative paths are not resolved (use the string 
			paths argument to enable relative path resolving based on the
			current working directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--paths" operand have to be prefixed with the operand 
			name.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code WcOptions}</td><td>&nbsp;</td><td>The options defining command behavior.</td></tr>
 * </table>
 */
public final class Wc {
	/**
	 * The "wc" command name.
	 */
	public static final String NAME = "wc";

	/**
	 * Interface defining all method signatures for the "wc" command.
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
		 * Executes a count of lines, words and chars contained in the standard
			input and writes them to the standard output.
		 *
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R wc();
		/**
		 * One or several counts are executed and written to the standard 
			output. Counts include lines, words and chars (depending on the 
			provided options) and cumulative counts for all the files are 
			displayed on a separate line after the output for the last file if
			more than one input file is specified. 
<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--paths" operand have to be prefixed with the operand 
			name.
		 *
		 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--paths" operand have to be prefixed with the operand 
			name.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R wc(String... args);
		/**
		 * Executes a count of lines, words and chars contained in each input
			file and writes them to the standard output. If more than one input 
			file is specified, a line of cumulative counts for all the files is 
			displayed on a separate line after the output for the last file.
		 *
		 * @param files The input files; relative paths are not resolved (use the string 
			paths argument to enable relative path resolving based on the
			current working directory).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R wc(java.io.File... files);
		/**
		 * Executes a one or more counts, depending on the given options, in
			the standard input and writes them to the standard output.
		 *
		 * @param options The options defining command behavior.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R wc(WcOptions options);
		/**
		 * Executes a one or more counts, depending on the given options, in
			each of the given input files and writes them to the standard 
			output. If more than one input file is specified, a line of 
			cumulative counts for all the files is displayed on a separate line 
			after the output for the last file.
		 *
		 * @param options The options defining command behavior.
		 * @param files The input files; relative paths are not resolved (use the string 
			paths argument to enable relative path resolving based on the
			current working directory).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R wc(WcOptions options, java.io.File... files);
		/**
		 * Executes a one or more counts, depending on the given options, in
			each of the given input files and writes them to the standard 
			output. If more than one input file is specified, a line of 
			cumulative counts for all the files is displayed on a separate line
			after the output for the last file.
		 *
		 * @param options The options defining command behavior.
		 * @param paths Pathnames of the input files; wildcards * and ? are supported;
			relative paths are resolved on the basis of the current working 
			directory.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R wc(WcOptions options, String[] paths);
	}

	/**
	 * Options for the "wc" command: {@link WcOption#lines l}, {@link WcOption#words w}, {@link WcOption#chars m}.
	 * <p> 
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lines}</td><td>&nbsp;</td><td>Executes a count of lines and writes this count to the output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -w}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --words}</td><td>&nbsp;</td><td>Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>Executes a count of chars and writes this count to the output.</td></tr>
 * </table>
	 */
	public static final WcOptionSets Options = WcOptionSets.INSTANCE;

	/**
	 * Singleton {@link WcFactory factory} instance for the "wc" command.
	 */
	public static final WcFactory Factory = WcFactory.INSTANCE;

	// no instances
	private Wc() {
		super();
	}
}
