package org.unix4j.unix;

import org.unix4j.command.CommandInterface;

import org.unix4j.unix.find.FindFactory;
import org.unix4j.unix.find.FindOption;
import org.unix4j.unix.find.FindOptions;
import org.unix4j.unix.find.FindOptionSets;

/**
 * Non-instantiable module with inner types making up the <b>find</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * find - search for files in a directory hierarchy 
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find <path>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find <path> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find <size>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find <path> <size>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find <size> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find <path> <size> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <path> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <size>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <path> <size>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <time>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <path> <time>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <size> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <path> <size> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <time> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <path> <time> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <size> <time> <name>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code find [-dflxrinocamz] <path> <size> <time> <name>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>Find searches the directory tree by evaluating different file matching expressions. The names of the matching files found in or below the working directory or the directories specified by the {@code paths} operand are written to the standard output.</p>
 * 
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeDirectory}</td><td>&nbsp;</td><td>Consider only directories</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeFile}</td><td>&nbsp;</td><td>Consider only regular files</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeSymlink}</td><td>&nbsp;</td><td>Consider only symbolic links</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeOther}</td><td>&nbsp;</td><td>Consider only files that are neither of directory (d), 
			regular file (f) or symlink (l).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --regex}</td><td>&nbsp;</td><td>Use full regular expression syntax for the patterns specified by the
			name operand
<p>
			(This option is ignored if no name operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive matching when applying the file name pattern
			specified by the name operand
<p>
			(This option is ignored if no name operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeNewer}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
			after or at the time specified by the time operand (the default)
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -o}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeOlder}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
			before or at the time specified by the time operand
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeCreate}</td><td>&nbsp;</td><td>The time operand refers to the creation time of the file
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeAccess}</td><td>&nbsp;</td><td>The time operand refers to the last access time of the file
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeModified}</td><td>&nbsp;</td><td>The time operand refers to the last modification time of the file
			(the default)
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -z}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print0}</td><td>&nbsp;</td><td>Print the full file name on the standard output, followed by a null 
			character (instead of the newline character used by default). This
			allows file names that contain newlines or other types of white 
			space to be correctly interpreted by programs that process the find 
			output. This option corresponds to the --delimiter0 option of xargs.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <path>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <name>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <size>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code long}</td><td>&nbsp;</td><td>Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <time>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code java.util.Date}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--path" operand have to be prefixed with the operand name
			(e.g. "--name" for subsequent path operand values).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code FindOptions}</td><td>&nbsp;</td><td>Options for the file search.</td></tr>
 * </table>
 */
public final class Find {
	/**
	 * The "find" command name.
	 */
	public static final String NAME = "find";

	/**
	 * Interface defining all method signatures for the "find" command.
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
		 * Finds all files matching the search criteria specified by the given
			arguments and writes the file names to the standard output. 
			<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--name" operand have to be prefixed with the operand name. 
			<p>
			The files names written to the output are relative paths referring
			to the working directory (or -- if provided -- relative to the path 
			given after the {@code "--path"} operand name).
		 *
		 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--path" operand have to be prefixed with the operand name
			(e.g. "--name" for subsequent path operand values).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(String... args);
		/**
		 * Finds all files in or below the directory specified by {@code path}
            and writes the file names to the standard output.
<p>
            The files names written to the output are paths relative to the
            specified {@code path} operand.
		 *
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(String path);
		/**
		 * Finds all files matching the specified {@code name} in or below the 
			directory specified by {@code path} and writes the file names to
			the standard output. 
			<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(String path, String name);
		/**
		 * Finds all files matching the specified file {@code size} in or below 
			the user's current working directory and writes the file names to 
			the standard output. Matching files use at least {@code size} bytes
			on disk if {@code size} is positive, or at most {@code abs(size)} 
			bytes if {@code size} is zero or negative. 
			<p>
			The files names written to the output are relative paths referring
			to the working directory.
		 *
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(long size);
		/**
		 * Finds all files matching the specified file {@code size} in or below
			the directory specified by {@code path} and writes the file names
			to the standard output. Matching files use at least {@code size} 
			bytes on disk if {@code size} is positive, or at most 
			{@code abs(size)} bytes if {@code size} is zero or negative. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(String path, long size);
		/**
		 * Finds all files matching the specified file {@code name} and 
			{@code size} in or below the user's current working directory and
			writes the file names to the standard output. Matching files use 
			at least {@code size} bytes on disk if {@code size} is positive, 
			or at most {@code abs(size)} bytes if {@code size} is zero or 
			negative. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
		 *
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(long size, String name);
		/**
		 * Finds all files matching the specified file {@code name} and 
			{@code size} in or below the directory specified by {@code path} 
			and writes the file names to the standard output. Matching files 
			use at least {@code size} bytes on disk if {@code size} is positive, 
			or at most {@code abs(size)} bytes if {@code size} is zero or 
			negative. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(String path, long size, String name);
		/**
		 * Finds all files matching the specified {@code name} in or below the 
			user's current working directory and writes the file names to the
			standard output.
			 <p>
			The files names written to the output are relative paths referring
			to the working directory.
		 *
		 * @param options Options for the file search.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, String name);
		/**
		 * Finds all files matching the specified {@code name} in or below the 
			directory specified by {@code path} and writes the file names to
			the standard output. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param options Options for the file search.
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, String path, String name);
		/**
		 * Finds all files matching the specified file {@code size} in or below 
			the user's current working directory and writes the file names to 
			the standard output. Matching files use at least {@code size} bytes
			on disk if {@code size} is positive, or at most {@code abs(size)} 
			bytes if {@code size} is zero or negative. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
		 *
		 * @param options Options for the file search.
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, long size);
		/**
		 * Finds all files matching the specified file {@code size} in or below
			the directory specified by {@code path} and writes the file names
			to the standard output. Matching files use at least {@code size} 
			bytes on disk if {@code size} is positive, or at most 
			{@code abs(size)} bytes if {@code size} is zero or negative. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param options Options for the file search.
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, String path, long size);
		/**
		 * Finds all files that have been created, modified or accessed before 
			or after the specified {@code time} (depending on the given 
			{@code -time...} options). The names of the matching files found in 
			or below the user's current working directory are written to the 
			standard output. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
		 *
		 * @param options Options for the file search.
		 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, java.util.Date time);
		/**
		 * Finds all files that have been created, modified or accessed before 
			or after the specified {@code time} (depending on the given 
			{@code -time...} options). The names of the matching files found in 
			or below the directory specified by {@code path} are written to
			the standard output. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param options Options for the file search.
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, String path, java.util.Date time);
		/**
		 * Finds all files matching the specified file {@code name} and 
			{@code size} in or below the user's current working directory and
			writes the file names to the standard output. Matching files use 
			at least {@code size} bytes on disk if {@code size} is positive, or 
			at most {@code abs(size)} bytes if {@code size} is zero or negative. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
		 *
		 * @param options Options for the file search.
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, long size, String name);
		/**
		 * Finds all files matching the specified file {@code name} and 
			{@code size} in or below the directory specified by {@code path} 
			and writes the file names to the standard output. Matching files 
			use at least {@code size} bytes on disk if {@code size} is positive, 
			or at most {@code abs(size)} bytes if {@code size} is zero or 
			negative.
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param options Options for the file search.
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, String path, long size, String name);
		/**
		 * Finds all files matching the given {@code name} that have been 
			created, modified or accessed before or after the specified
			{@code time} (depending on the given {@code -time...} options). The
			names of the matching files found in or below the user's current 
			working directory are written to the standard output. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
		 *
		 * @param options Options for the file search.
		 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, java.util.Date time, String name);
		/**
		 * Finds all files matching the given {@code name} that have been 
			created, modified or accessed before or after the specified
			{@code time} (depending on the given {@code -time...} options). The 
			names of the matching files found in or below the directory 
			specified by {@code path} are written to the standard output. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param options Options for the file search.
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, String path, java.util.Date time, String name);
		/**
		 * Finds all files matching the given {@code name} and {@code size} and
			have been created, modified or accessed before or after the specified
			{@code time} (depending on the given {@code -time...} options). 
			<p>
			Matching files use at least {@code size} bytes on disk if 
			{@code size} is positive, or at most {@code abs(size)} bytes if 
			{@code size} is zero or negative. The names of the matching files 
			found in or below the user's current working directory are written 
			to the standard output.
<p>
			The files names written to the output are relative paths referring
			to the working directory.
		 *
		 * @param options Options for the file search.
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, long size, java.util.Date time, String name);
		/**
		 * Finds all files matching the given {@code name} and {@code size} and
			have been created, modified or accessed before or after the specified
			{@code time} (depending on the given {@code -time...} options). 
			<p>
			Matching files use at least {@code size} bytes on disk if 
			{@code size} is positive, or at most {@code abs(size)} bytes if 
			{@code size} is zero or negative. The names of the matching files 
			found in or below the directory specified by {@code path} are 
			written to the standard output. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
		 *
		 * @param options Options for the file search.
		 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
		 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
		 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
		 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R find(FindOptions options, String path, long size, java.util.Date time, String name);
	}

	/**
	 * Options for the "find" command: {@link FindOption#typeDirectory d}, {@link FindOption#typeFile f}, {@link FindOption#typeSymlink l}, {@link FindOption#typeOther x}, {@link FindOption#regex r}, {@link FindOption#ignoreCase i}, {@link FindOption#timeNewer n}, {@link FindOption#timeOlder o}, {@link FindOption#timeCreate c}, {@link FindOption#timeAccess a}, {@link FindOption#timeModified m}, {@link FindOption#print0 z}.
	 * <p> 
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeDirectory}</td><td>&nbsp;</td><td>Consider only directories</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeFile}</td><td>&nbsp;</td><td>Consider only regular files</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeSymlink}</td><td>&nbsp;</td><td>Consider only symbolic links</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeOther}</td><td>&nbsp;</td><td>Consider only files that are neither of directory (d), 
			regular file (f) or symlink (l).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --regex}</td><td>&nbsp;</td><td>Use full regular expression syntax for the patterns specified by the
			name operand
<p>
			(This option is ignored if no name operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive matching when applying the file name pattern
			specified by the name operand
<p>
			(This option is ignored if no name operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeNewer}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
			after or at the time specified by the time operand (the default)
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -o}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeOlder}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
			before or at the time specified by the time operand
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeCreate}</td><td>&nbsp;</td><td>The time operand refers to the creation time of the file
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeAccess}</td><td>&nbsp;</td><td>The time operand refers to the last access time of the file
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeModified}</td><td>&nbsp;</td><td>The time operand refers to the last modification time of the file
			(the default)
			<p>
			(This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -z}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print0}</td><td>&nbsp;</td><td>Print the full file name on the standard output, followed by a null 
			character (instead of the newline character used by default). This
			allows file names that contain newlines or other types of white 
			space to be correctly interpreted by programs that process the find 
			output. This option corresponds to the --delimiter0 option of xargs.</td></tr>
 * </table>
	 */
	public static final FindOptionSets Options = FindOptionSets.INSTANCE;

	/**
	 * Singleton {@link FindFactory factory} instance for the "find" command.
	 */
	public static final FindFactory Factory = FindFactory.INSTANCE;

	// no instances
	private Find() {
		super();
	}
}
