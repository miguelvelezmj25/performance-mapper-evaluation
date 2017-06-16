package org.unix4j.unix;

import org.unix4j.command.CommandInterface;

import org.unix4j.unix.cd.CdFactory;

/**
 * Non-instantiable module with inner types making up the <b>cd</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * cd - change the working directory 
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cd}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cd <file>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cd <path>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>The cd utility changes the working directory of the current command execution. If no directory operand is given, the cd utility changes to the user home directory as defined by the execution context (usually the directory specified by the {@code "user.home"} system property).  If the cd argument is a {@link java.io.File File} and it is a directory, the current working directory is changed to the given file (relative paths are not resolved with the current working directory). If a string argument is passed to the cd utility, it is treated as a file argument and relative paths are resolved on the basis of the (old) current working directory. Wildcards are possible if the first matching file represents a directory. If the specified file or path argument does not represent a valid directory, an exception is thrown.</p><p>See also:<ul>	<li>{@link java.lang.System#getProperties()}</li></ul></p>
 * 
 * <p>
 * <b>Options</b>
 * <p>
 * The command supports no options.
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <file>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File}</td><td>&nbsp;</td><td>the file to use as input; relative paths are not resolved (use the
			string path argument to enable relative path resolving based on the
			current working directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <path>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>the directory to become the new current working directory; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.</td></tr>
 * </table>
 */
public final class Cd {
	/**
	 * The "cd" command name.
	 */
	public static final String NAME = "cd";

	/**
	 * Interface defining all method signatures for the "cd" command.
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
		 * Changes the current directory to the user home directory as defined 
			by the execution context (usually the directory specified by the 
			{@code "user.home"} system property).
		 *
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cd();
		/**
		 * The current working directory is changed to the given file. If the 
			specified file argument does not represent a valid directory, an 
			exception is thrown. Note that relative paths are not resolved with 
			the (old) current working directory. Use the String path to enable 
			relative path resolving and wildcards.
		 *
		 * @param file the file to use as input; relative paths are not resolved (use the
			string path argument to enable relative path resolving based on the
			current working directory).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cd(java.io.File file);
		/**
		 * The current working directory is changed to the given file. Relative
			paths are resolved on the basis of the (old) current working 
			directory. Wildcards are possible if the first matching file 
			represents a directory. If the first file specified by the given 
			path argument is not a valid directory, an exception is thrown.
		 *
		 * @param path the directory to become the new current working directory; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cd(String path);
	}

	/**
	 * Singleton {@link CdFactory factory} instance for the "cd" command.
	 */
	public static final CdFactory Factory = CdFactory.INSTANCE;

	// no instances
	private Cd() {
		super();
	}
}
