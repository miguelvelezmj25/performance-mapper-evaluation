package org.unix4j.unix;

import org.unix4j.command.CommandInterface;

import org.unix4j.unix.from.FromFactory;

/**
 * Non-instantiable module with inner types making up the <b>from</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * from - a pseudo command used to redirect the standard input 
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code fromString <string>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code fromStrings <strings>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code from <lines>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code fromFile <path>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code fromFile <file>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code fromResource <resource>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code from <stream>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code from <reader>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code from <url>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code from <input>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>Pseudo-command used to redirect an input source into a command or command chain.</p>
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
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <string>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>the string to use as input</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <strings>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>the input lines</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <lines>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.util.Collection<? extends String>}</td><td>&nbsp;</td><td>collection with input lines</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <path>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>the file to use as input; wildcards * and ? are supported; relative 
			paths are resolved on the basis of the current working directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <file>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.File}</td><td>&nbsp;</td><td>the file to use as input; relative paths are not resolved (use the
			string path argument to enable relative path resolving based on the
			current working directory).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <resource>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>a path to the file to redirect to the next command. The will need
			to be on the classpath. If the file is in the root directory, the 
			filename should be prefixed with a forward slash. e.g.:
		 	{@code "/test-file.txt"}
		 	<p>
		 	If the file is in a package, then the package should be specified
		 	prefixed with a forward slash, and with each dot "." replaced with a
		 	forward slash. e.g.:
			{@code "/org/company/mypackage/test-file.txt"}</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <stream>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.InputStream}</td><td>&nbsp;</td><td>the input stream to read from</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <reader>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.io.Reader}</td><td>&nbsp;</td><td>the reader used to read the input</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <url>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.net.URL}</td><td>&nbsp;</td><td>the URL to read from</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <input>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code org.unix4j.io.Input}</td><td>&nbsp;</td><td>the input object to read from</td></tr>
 * </table>
 */
public final class From {
	/**
	 * The "from" command name.
	 */
	public static final String NAME = "from";

	/**
	 * Interface defining all method signatures for the "from" command.
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
		 * Uses the given string as input for the next command. If the string
			contains line ending codes (UNIX or DOS independent from the host
			operating system), the string is split into multiple lines.
		 *
		 * @param string the string to use as input
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R fromString(String string);
		/**
		 * Uses the given strings as input for the next command. Each string
			usually represents a single line of the input; however, if any of 
			the strings contains line ending codes (UNIX or DOS independent from
			the host operating system), it is split into multiple lines.
		 *
		 * @param strings the input lines
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R fromStrings(String... strings);
		/**
		 * Uses the strings in the specified {@code input} collection as input
			lines for the next command. Each string usually represents a single
			line of the input; however, if any of the strings contains line
			ending codes (UNIX or DOS independent from the host operating 
			system), it is split into multiple lines.
		 *
		 * @param lines collection with input lines
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R from(java.util.Collection<? extends String> lines);
		/**
		 * Redirects the contents of the given file into the next command. This 
			is essentially equivalent to the following syntax in a unix command
			shell: {@code path > ...}
		 *
		 * @param path the file to use as input; wildcards * and ? are supported; relative 
			paths are resolved on the basis of the current working directory.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R fromFile(String path);
		/**
		 * Redirects the contents of the given file into the next command. This 
			is essentially equivalent to the following syntax in a unix command
			shell: {@code file > ...}
		 *
		 * @param file the file to use as input; relative paths are not resolved (use the
			string path argument to enable relative path resolving based on the
			current working directory).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R fromFile(java.io.File file);
		/**
		 * Reads from the given resource relative to the classpath and 
			redirects the contents into the next command. The resource is 
			usually a file or URL on the classpath. The resource is read using
			{@link Class#getResourceAsStream(String)}.
		 *
		 * @param resource a path to the file to redirect to the next command. The will need
			to be on the classpath. If the file is in the root directory, the 
			filename should be prefixed with a forward slash. e.g.:
		 	{@code "/test-file.txt"}
		 	<p>
		 	If the file is in a package, then the package should be specified
		 	prefixed with a forward slash, and with each dot "." replaced with a
		 	forward slash. e.g.:
			{@code "/org/company/mypackage/test-file.txt"}
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R fromResource(String resource);
		/**
		 * Reads from the given input stream and redirects the contents into 
			the next command.
		 *
		 * @param stream the input stream to read from
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R from(java.io.InputStream stream);
		/**
		 * Uses the given reader and redirects the read input into the next
			command.
		 *
		 * @param reader the reader used to read the input
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R from(java.io.Reader reader);
		/**
		 * Reads from the given URL and redirects the contents into the next
			command.
		 *
		 * @param url the URL to read from
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R from(java.net.URL url);
		/**
		 * Reads from the given input object and redirects the contents into 
			the next command.
		 *
		 * @param input the input object to read from
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R from(org.unix4j.io.Input input);
	}

	/**
	 * Singleton {@link FromFactory factory} instance for the "from" command.
	 */
	public static final FromFactory Factory = FromFactory.INSTANCE;

	// no instances
	private From() {
		super();
	}
}
