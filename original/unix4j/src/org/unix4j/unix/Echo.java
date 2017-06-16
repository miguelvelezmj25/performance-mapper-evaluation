package org.unix4j.unix;

import org.unix4j.command.CommandInterface;

import org.unix4j.unix.echo.EchoFactory;
import org.unix4j.unix.echo.EchoOption;
import org.unix4j.unix.echo.EchoOptions;
import org.unix4j.unix.echo.EchoOptionSets;

/**
 * Non-instantiable module with inner types making up the <b>echo</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * echo - write arguments to standard output 
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code echo <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code echo [-n] <string>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code echo [-n] <strings>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 *  <p>	The echo utility writes any specified operands, separated by single blank 	({@code ' '}) characters and followed by a line ending, to the standard	output. The line ending is usually one or two characters depending on the	operating system where the command is run. </p>
 * 
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noNewline}</td><td>&nbsp;</td><td>Do not print the trailing newline character(s).</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <string>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>A string to be written to standard output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <strings>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>Strings to be written to standard output, separated by single blank 
			characters.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options for the command and the 
			strings to be written to the output. Options can be specified by 
			acronym (with a leading dash "-") or by long name (with two leading 
			dashes "--").</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code EchoOptions}</td><td>&nbsp;</td><td>Options for the echo command.</td></tr>
 * </table>
 */
public final class Echo {
	/**
	 * The "echo" command name.
	 */
	public static final String NAME = "echo";

	/**
	 * Interface defining all method signatures for the "echo" command.
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
		 * Writes any of the specified strings, separated by single blank 
			 ({@code ' '}) characters to the standard output suppressing the
			 trailing line ending if the {@code "-n"} option is specified.
		 *
		 * @param args String arguments defining the options for the command and the 
			strings to be written to the output. Options can be specified by 
			acronym (with a leading dash "-") or by long name (with two leading 
			dashes "--").
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R echo(String... args);
		/**
		 * Writes the specified string followed by a newline character to 
			 the standard output suppressing the trailing line ending if the
			 {@code -n} option is specified.
		 *
		 * @param options Options for the echo command.
		 * @param string A string to be written to standard output.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R echo(EchoOptions options, String string);
		/**
		 * Writes any of the specified strings, separated by single blank 
			 ({@code ' '}) characters to the standard output suppressing the
			 trailing line ending if the {@code -n} option is specified.
		 *
		 * @param options Options for the echo command.
		 * @param strings Strings to be written to standard output, separated by single blank 
			characters.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R echo(EchoOptions options, String... strings);
	}

	/**
	 * Options for the "echo" command: {@link EchoOption#noNewline n}.
	 * <p> 
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --noNewline}</td><td>&nbsp;</td><td>Do not print the trailing newline character(s).</td></tr>
 * </table>
	 */
	public static final EchoOptionSets Options = EchoOptionSets.INSTANCE;

	/**
	 * Singleton {@link EchoFactory factory} instance for the "echo" command.
	 */
	public static final EchoFactory Factory = EchoFactory.INSTANCE;

	// no instances
	private Echo() {
		super();
	}
}
