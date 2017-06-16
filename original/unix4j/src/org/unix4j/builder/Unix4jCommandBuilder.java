package org.unix4j.builder;

import org.unix4j.builder.CommandBuilder;
import org.unix4j.command.Command;
import org.unix4j.operation.LineOperation;

import org.unix4j.unix.Cat;
import org.unix4j.unix.cat.CatOptions;
import org.unix4j.unix.Cd;
import org.unix4j.unix.Cut;
import org.unix4j.unix.cut.CutOptions;
import org.unix4j.unix.Echo;
import org.unix4j.unix.echo.EchoOptions;
import org.unix4j.unix.Find;
import org.unix4j.unix.find.FindOptions;
import org.unix4j.unix.From;
import org.unix4j.unix.Grep;
import org.unix4j.unix.grep.GrepOptions;
import org.unix4j.unix.Head;
import org.unix4j.unix.head.HeadOptions;
import org.unix4j.unix.Ls;
import org.unix4j.unix.ls.LsOptions;
import org.unix4j.unix.Sed;
import org.unix4j.unix.sed.SedOptions;
import org.unix4j.unix.Sort;
import org.unix4j.unix.sort.SortOptions;
import org.unix4j.unix.Tail;
import org.unix4j.unix.tail.TailOptions;
import org.unix4j.unix.Uniq;
import org.unix4j.unix.uniq.UniqOptions;
import org.unix4j.unix.Wc;
import org.unix4j.unix.wc.WcOptions;
import org.unix4j.unix.Xargs;
import org.unix4j.unix.xargs.XargsOptions;

/**
 * Builder for a <b>unix4j</b> command or a chain of joined commands. 
 * Application code does usually not directly refer to this class but uses it 
 * indirectly through the static methods in {@link org.unix4j.Unix4j Unix4j}.
 * <p>
 * Note that the command creation methods do not return a new command instance.
 * Instead, the builder stores the created commands and only returns a 
 * {@link Command} object when the {@link #build()} method is invoked. Most
 * applications, however, need not to call {@code build()} explicitly. The
 * command can be built and executed in a single step by calling one of the 
 * {@code toXXX(..)} methods, such as {@link #toStdOut()}, 
 * {@link #toFile(String)} or {@link #toStringResult()}. 
 * <p>
 * The {@link Command} object returned by the {@link #build()} method can
 * represent a single command or a chain of commands. In a command chain, the
 * previous command usually pipes its output as standard input into the
 * next command (the pipe symbol between two commands in unix). For come 
 * commands, however, chaining has a different interpretation. An example is the
 * {@code xargs} command: here, the next command after {@code xargs} receives 
 * <i>arguments</i> from {@code xargs} instead of (standard) input.
 */
public interface Unix4jCommandBuilder extends CommandBuilder,
		Cat.Interface<Unix4jCommandBuilder>,
		Cd.Interface<Unix4jCommandBuilder>,
		Cut.Interface<Unix4jCommandBuilder>,
		Echo.Interface<Unix4jCommandBuilder>,
		Find.Interface<Unix4jCommandBuilder>,
		From.Interface<Unix4jCommandBuilder>,
		Grep.Interface<Unix4jCommandBuilder>,
		Head.Interface<Unix4jCommandBuilder>,
		Ls.Interface<Unix4jCommandBuilder>,
		Sed.Interface<Unix4jCommandBuilder>,
		Sort.Interface<Unix4jCommandBuilder>,
		Tail.Interface<Unix4jCommandBuilder>,
		Uniq.Interface<Unix4jCommandBuilder>,
		Wc.Interface<Unix4jCommandBuilder>,
		Xargs.Interface<Unix4jCommandBuilder> {


	/* ------------------ cat ------------------ */
	/**
	 * Reads the lines from the standard input and writes them to the
			standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cat();
	/**
	 * Reads the lines from files specified as arguments and writes them to
			the standard output. Options can be specified by acronym (with a
			leading dash "-") or by long name (with two leading dashes "--"). 
			File arguments are expanded if wildcards are used. All file 
			arguments are processed in command-argument order.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and file operands for the 
			command. Options can be specified by acronym (with a leading dash 
			"-") or by long name (with two leading dashes "--"). File arguments 
			are expanded if wildcards are used.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cat(String... args);
	/**
	 * Reads the lines from the specified files and writes them to the
			standard output. The files are processed in command-argument order.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param files The input files to be printed; relative paths are not resolved (use 
			the string path argument to enable relative path resolving based on 
			the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cat(java.io.File... files);
	/**
	 * Reads the lines from the standard input and writes them to the
			standard output; the given options define the details of the output
			format.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the cat command.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cat(CatOptions options);
	/**
	 * Reads the lines from the specified files and writes them to the
			standard output; the given options define the details of the output
			format. The files are processed in command-argument order.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the cat command.
	 * @param files The input files to be printed; relative paths are not resolved (use 
			the string path argument to enable relative path resolving based on 
			the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cat(CatOptions options, java.io.File... files);
	/**
	 * Reads the lines from the specified files and writes them to the
			standard output; the given options define the details of the output
			format. The path arguments are expanded if wildcards are used and
			processed in command-argument order.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the cat command.
	 * @param paths Pathnames of the input files to be printed; wildcards * and ? are
			supported; relative paths are resolved on the basis of the current 
			working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cat(CatOptions options, String... paths);

	/* ------------------ cd ------------------ */
	/**
	 * Changes the current directory to the user home directory as defined 
			by the execution context (usually the directory specified by the 
			{@code "user.home"} system property).
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cd();
	/**
	 * The current working directory is changed to the given file. If the 
			specified file argument does not represent a valid directory, an 
			exception is thrown. Note that relative paths are not resolved with 
			the (old) current working directory. Use the String path to enable 
			relative path resolving and wildcards.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param file the file to use as input; relative paths are not resolved (use the
			string path argument to enable relative path resolving based on the
			current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cd(java.io.File file);
	/**
	 * The current working directory is changed to the given file. Relative
			paths are resolved on the basis of the (old) current working 
			directory. Wildcards are possible if the first matching file 
			represents a directory. If the first file specified by the given 
			path argument is not a valid directory, an exception is thrown.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param path the directory to become the new current working directory; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cd(String path);

	/* ------------------ cut ------------------ */
	/**
	 * Cuts the fields or characters from the input line and writes them to 
			the standard output. Depending on the provided options and operands, 
			range, delimiter or indexes define the cut.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--range" operand have to be prefixed with the operand name
			(e.g. "--indexes" for subsequent index operand values).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cut(String... args);
	/**
	 * Cuts the fields or characters using the given range
			from the input line and writes them to the output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options options for the cut command
	 * @param range select only these fields
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cut(CutOptions options, org.unix4j.util.Range range);
	/**
	 * Cuts the fields or characters using the given indexes
			from the input line and writes them to the output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options options for the cut command
	 * @param indexes select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cut(CutOptions options, int... indexes);
	/**
	 * Cuts the fields using the given range
			from the input line and writes them to the output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options options for the cut command
	 * @param delimiter use as the output delimiter the default is to use the input delimiter
	 * @param range select only these fields
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cut(CutOptions options, String delimiter, org.unix4j.util.Range range);
	/**
	 * Cuts the fields using the given indexes
			from the input line and writes them to the output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options options for the cut command
	 * @param delimiter use as the output delimiter the default is to use the input delimiter
	 * @param indexes select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cut(CutOptions options, String delimiter, int... indexes);
	/**
	 * Cuts the fields using the given range and using the given delimiter
			from the input line and writes them to the output using the given outputDelimiter.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options options for the cut command
	 * @param delimiter use as the output delimiter the default is to use the input delimiter
	 * @param outputDelimiter use as the output delimiter the default is to use the input delimiter
	 * @param range select only these fields
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cut(CutOptions options, String delimiter, char outputDelimiter, org.unix4j.util.Range range);
	/**
	 * Cuts the fields using the given indexes and using the given delimiter
			from the input line and writes them to the output using the given outputDelimiter.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options options for the cut command
	 * @param delimiter use as the output delimiter the default is to use the input delimiter
	 * @param outputDelimiter use as the output delimiter the default is to use the input delimiter
	 * @param indexes select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder cut(CutOptions options, String delimiter, char outputDelimiter, int... indexes);

	/* ------------------ echo ------------------ */
	/**
	 * Writes any of the specified strings, separated by single blank 
			 ({@code ' '}) characters to the standard output suppressing the
			 trailing line ending if the {@code "-n"} option is specified.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options for the command and the 
			strings to be written to the output. Options can be specified by 
			acronym (with a leading dash "-") or by long name (with two leading 
			dashes "--").
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder echo(String... args);
	/**
	 * Writes the specified string followed by a newline character to 
			 the standard output suppressing the trailing line ending if the
			 {@code -n} option is specified.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the echo command.
	 * @param string A string to be written to standard output.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder echo(EchoOptions options, String string);
	/**
	 * Writes any of the specified strings, separated by single blank 
			 ({@code ' '}) characters to the standard output suppressing the
			 trailing line ending if the {@code -n} option is specified.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the echo command.
	 * @param strings Strings to be written to standard output, separated by single blank 
			characters.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder echo(EchoOptions options, String... strings);

	/* ------------------ find ------------------ */
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--path" operand have to be prefixed with the operand name
			(e.g. "--name" for subsequent path operand values).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(String... args);
	/**
	 * Finds all files in or below the directory specified by {@code path}
            and writes the file names to the standard output.
<p>
            The files names written to the output are paths relative to the
            specified {@code path} operand.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(String path);
	/**
	 * Finds all files matching the specified {@code name} in or below the 
			directory specified by {@code path} and writes the file names to
			the standard output. 
			<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(String path, String name);
	/**
	 * Finds all files matching the specified file {@code size} in or below 
			the user's current working directory and writes the file names to 
			the standard output. Matching files use at least {@code size} bytes
			on disk if {@code size} is positive, or at most {@code abs(size)} 
			bytes if {@code size} is zero or negative. 
			<p>
			The files names written to the output are relative paths referring
			to the working directory.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(long size);
	/**
	 * Finds all files matching the specified file {@code size} in or below
			the directory specified by {@code path} and writes the file names
			to the standard output. Matching files use at least {@code size} 
			bytes on disk if {@code size} is positive, or at most 
			{@code abs(size)} bytes if {@code size} is zero or negative. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(String path, long size);
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
	 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(long size, String name);
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(String path, long size, String name);
	/**
	 * Finds all files matching the specified {@code name} in or below the 
			user's current working directory and writes the file names to the
			standard output.
			 <p>
			The files names written to the output are relative paths referring
			to the working directory.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the file search.
	 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, String name);
	/**
	 * Finds all files matching the specified {@code name} in or below the 
			directory specified by {@code path} and writes the file names to
			the standard output. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the file search.
	 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, String path, String name);
	/**
	 * Finds all files matching the specified file {@code size} in or below 
			the user's current working directory and writes the file names to 
			the standard output. Matching files use at least {@code size} bytes
			on disk if {@code size} is positive, or at most {@code abs(size)} 
			bytes if {@code size} is zero or negative. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the file search.
	 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, long size);
	/**
	 * Finds all files matching the specified file {@code size} in or below
			the directory specified by {@code path} and writes the file names
			to the standard output. Matching files use at least {@code size} 
			bytes on disk if {@code size} is positive, or at most 
			{@code abs(size)} bytes if {@code size} is zero or negative. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the file search.
	 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, String path, long size);
	/**
	 * Finds all files that have been created, modified or accessed before 
			or after the specified {@code time} (depending on the given 
			{@code -time...} options). The names of the matching files found in 
			or below the user's current working directory are written to the 
			standard output. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the file search.
	 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, java.util.Date time);
	/**
	 * Finds all files that have been created, modified or accessed before 
			or after the specified {@code time} (depending on the given 
			{@code -time...} options). The names of the matching files found in 
			or below the directory specified by {@code path} are written to
			the standard output. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the file search.
	 * @param path Starting point for the search in the directory hierarchy;
            wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, String path, java.util.Date time);
	/**
	 * Finds all files matching the specified file {@code name} and 
			{@code size} in or below the user's current working directory and
			writes the file names to the standard output. Matching files use 
			at least {@code size} bytes on disk if {@code size} is positive, or 
			at most {@code abs(size)} bytes if {@code size} is zero or negative. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the file search.
	 * @param size Consider only files using at least {@code size} bytes if {@code size}
			is positive, or at most {@code abs(size)} bytes if {@code size} is zero
			or negative.
	 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, long size, String name);
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, String path, long size, String name);
	/**
	 * Finds all files matching the given {@code name} that have been 
			created, modified or accessed before or after the specified
			{@code time} (depending on the given {@code -time...} options). The
			names of the matching files found in or below the user's current 
			working directory are written to the standard output. 
<p>
			The files names written to the output are relative paths referring
			to the working directory.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the file search.
	 * @param time Consider only files that have been created, modified or accessed
			before or after the specified {@code time} operand; consider the
			{@code -time...} options for details of the comparison.
	 * @param name Name pattern to match the file name after removing the path with the
			leading directories; wildcards * and ? are supported, or full 
			regular expressions if either of the options {@code -regex (-r)} or
			{@code -iregex (-i)} is specified.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, java.util.Date time, String name);
	/**
	 * Finds all files matching the given {@code name} that have been 
			created, modified or accessed before or after the specified
			{@code time} (depending on the given {@code -time...} options). The 
			names of the matching files found in or below the directory 
			specified by {@code path} are written to the standard output. 
<p>
			The files names written to the output are paths relative to the
			specified {@code path} operand.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, String path, java.util.Date time, String name);
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, long size, java.util.Date time, String name);
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder find(FindOptions options, String path, long size, java.util.Date time, String name);

	/* ------------------ from ------------------ */
	/**
	 * Uses the given string as input for the next command. If the string
			contains line ending codes (UNIX or DOS independent from the host
			operating system), the string is split into multiple lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param string the string to use as input
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder fromString(String string);
	/**
	 * Uses the given strings as input for the next command. Each string
			usually represents a single line of the input; however, if any of 
			the strings contains line ending codes (UNIX or DOS independent from
			the host operating system), it is split into multiple lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param strings the input lines
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder fromStrings(String... strings);
	/**
	 * Uses the strings in the specified {@code input} collection as input
			lines for the next command. Each string usually represents a single
			line of the input; however, if any of the strings contains line
			ending codes (UNIX or DOS independent from the host operating 
			system), it is split into multiple lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param lines collection with input lines
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder from(java.util.Collection<? extends String> lines);
	/**
	 * Redirects the contents of the given file into the next command. This 
			is essentially equivalent to the following syntax in a unix command
			shell: {@code path > ...}
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param path the file to use as input; wildcards * and ? are supported; relative 
			paths are resolved on the basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder fromFile(String path);
	/**
	 * Redirects the contents of the given file into the next command. This 
			is essentially equivalent to the following syntax in a unix command
			shell: {@code file > ...}
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param file the file to use as input; relative paths are not resolved (use the
			string path argument to enable relative path resolving based on the
			current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder fromFile(java.io.File file);
	/**
	 * Reads from the given resource relative to the classpath and 
			redirects the contents into the next command. The resource is 
			usually a file or URL on the classpath. The resource is read using
			{@link Class#getResourceAsStream(String)}.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder fromResource(String resource);
	/**
	 * Reads from the given input stream and redirects the contents into 
			the next command.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param stream the input stream to read from
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder from(java.io.InputStream stream);
	/**
	 * Uses the given reader and redirects the read input into the next
			command.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param reader the reader used to read the input
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder from(java.io.Reader reader);
	/**
	 * Reads from the given URL and redirects the contents into the next
			command.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param url the URL to read from
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder from(java.net.URL url);
	/**
	 * Reads from the given input object and redirects the contents into 
			the next command.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param input the input object to read from
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder from(org.unix4j.io.Input input);

	/* ------------------ grep ------------------ */
	/**
	 * Filters the input lines from the standard input or the provided 
			input files and writes the matching lines to the standard output. A 
			line matches if it contains the given {@code "--regexp"} operand
			value (default operand).
			<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--regexp" and "--paths" operands have to be prefixed with 
			the operand name.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--pattern" and "--paths" operands have to be prefixed with
			the operand name (e.g. "--files" for subsequent file operand values).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(String... args);
	/**
	 * Filters the input lines from the standard input and writes the
			matching lines to the standard output. A line matches if it contains 
			the given {@code regexp} using case-sensitive string comparison.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param regexp Lines will be printed which match the given regular expression. The 
			{@code regexp} string is surrounded with ".*" on both sides unless
			the {@code --wholeLine} option is specified. If the 
			{@code --fixedStrings} option is used, plain string comparison is
			used instead of regular expression matching.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(String regexp);
	/**
	 * Filters the lines from the specified input files and writes the
			matching lines to the standard output. Every line is matched against
			the given {@code regexp} string using case-sensitive comparison. 
			Line endings are not relevant for the comparison.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param regexp Lines will be printed which match the given regular expression. The 
			{@code regexp} string is surrounded with ".*" on both sides unless
			the {@code --wholeLine} option is specified. If the 
			{@code --fixedStrings} option is used, plain string comparison is
			used instead of regular expression matching.
	 * @param files The input files to be searched for the pattern; relative paths are 
			not resolved (use the string paths argument to enable relative path 
			resolving based on the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(String regexp, java.io.File... files);
	/**
	 * Filters the input lines from the standard input and writes the
			matching lines to the standard output. Every line is matched against
			the given regular expression {@code pattern} using case-sensitive 
			comparison. Line endings are not relevant for the comparison.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param pattern Lines will be printed which match the given pattern.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(java.util.regex.Pattern pattern);
	/**
	 * Filters the lines from the specified input files and writes the
			matching lines to the standard output. Every line is matched against
			the given regular expression {@code pattern} using case-sensitive 
			comparison. Line endings are not relevant for the comparison.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param pattern Lines will be printed which match the given pattern.
	 * @param files The input files to be searched for the pattern; relative paths are 
			not resolved (use the string paths argument to enable relative path 
			resolving based on the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(java.util.regex.Pattern pattern, java.io.File... files);
	/**
	 * Filters the lines from the specified input files and writes the
			matching lines to the standard output. Every line is matched against
			the given regular expression {@code pattern} using case-sensitive 
			comparison. Line endings are not relevant for the comparison.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param pattern Lines will be printed which match the given pattern.
	 * @param paths Pathnames of the input files to be searched for the pattern;
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(java.util.regex.Pattern pattern, String... paths);
	/**
	 * Filters the input lines from the standard input and writes the
			matching lines to the standard output. Every line is matched against
			the given {@code regexp} string; the exact comparison rules are 
			defined by the specified matching {@code options}.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the types of patterns and command behavior.
	 * @param regexp Lines will be printed which match the given regular expression. The 
			{@code regexp} string is surrounded with ".*" on both sides unless
			the {@code --wholeLine} option is specified. If the 
			{@code --fixedStrings} option is used, plain string comparison is
			used instead of regular expression matching.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(GrepOptions options, String regexp);
	/**
	 * Filters the input lines from the standard input and writes the
			matching lines to the standard output. Every line is matched against
			the given regular expression {@code pattern}; the exact comparison
			rules are defined by the specified matching {@code options}.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the types of patterns and command behavior.
	 * @param pattern Lines will be printed which match the given pattern.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(GrepOptions options, java.util.regex.Pattern pattern);
	/**
	 * Filters the input lines from the specified input files and writes
			the matching lines to the standard output. Every line is matched 
			against the given {@code regexp} string; the exact comparison rules 
			are defined by the specified matching {@code options}.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the types of patterns and command behavior.
	 * @param regexp Lines will be printed which match the given regular expression. The 
			{@code regexp} string is surrounded with ".*" on both sides unless
			the {@code --wholeLine} option is specified. If the 
			{@code --fixedStrings} option is used, plain string comparison is
			used instead of regular expression matching.
	 * @param files The input files to be searched for the pattern; relative paths are 
			not resolved (use the string paths argument to enable relative path 
			resolving based on the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(GrepOptions options, String regexp, java.io.File... files);
	/**
	 * Filters the input lines from the specified input files and writes
			the matching lines to the standard output. Every line is matched 
			against the given {@code regexp} string; the exact comparison rules 
			are defined by the specified matching {@code options}.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the types of patterns and command behavior.
	 * @param regexp Lines will be printed which match the given regular expression. The 
			{@code regexp} string is surrounded with ".*" on both sides unless
			the {@code --wholeLine} option is specified. If the 
			{@code --fixedStrings} option is used, plain string comparison is
			used instead of regular expression matching.
	 * @param paths Pathnames of the input files to be searched for the pattern;
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(GrepOptions options, String regexp, String... paths);
	/**
	 * Filters the input lines from the specified input files and writes
			the matching lines to the standard output. Every line is matched 
			against the given regular expression {@code pattern}; the exact 
			comparison rules are defined by the specified matching 
			{@code options}.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the types of patterns and command behavior.
	 * @param pattern Lines will be printed which match the given pattern.
	 * @param files The input files to be searched for the pattern; relative paths are 
			not resolved (use the string paths argument to enable relative path 
			resolving based on the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(GrepOptions options, java.util.regex.Pattern pattern, java.io.File... files);
	/**
	 * Filters the input lines from the specified input files and writes
			the matching lines to the standard output. Every line is matched 
			against the given regular expression {@code pattern}; the exact 
			comparison rules are defined by the specified matching 
			{@code options}.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the types of patterns and command behavior.
	 * @param pattern Lines will be printed which match the given pattern.
	 * @param paths Pathnames of the input files to be searched for the pattern;
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder grep(GrepOptions options, java.util.regex.Pattern pattern, String... paths);

	/* ------------------ head ------------------ */
	/**
	 * Reads the first 10 lines from the standard input and writes them to
			the standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head();
	/**
	 * Reads the first n lines from each of the files specified and writes
			them to the standard output. If more than a single file is 
			specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--paths" operand have to be prefixed with the operand 
			name.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--paths" operand have to be prefixed with the operand 
			name (e.g. "--count" for a subsequent count operand value).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head(String... args);
	/**
	 * Reads the first {@code count} lines from the standard input and 
			writes them to the standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param count The first {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head(long count);
	/**
	 * Reads the first {@code count} lines or characters from the standard 
			input and writes them to the standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the head command.
	 * @param count The first {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head(HeadOptions options, long count);
	/**
	 * Reads the first 10 lines from each of the specified files and writes
			them to the standard output. If more than a single file is 
			specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param files The input files to be filtered; relative paths are not resolved (use 
			the string paths argument to enable relative path resolving based on 
			the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head(java.io.File... files);
	/**
	 * Reads the first {@code count} lines from each of the specified files
			and writes them to the standard output. If more than a single file 
			is specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param count The first {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @param files The input files to be filtered; relative paths are not resolved (use 
			the string paths argument to enable relative path resolving based on 
			the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head(long count, java.io.File... files);
	/**
	 * Reads the first {@code count} lines from each of the specified files
			and writes them to the standard output. If more than a single file 
			is specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param count The first {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @param paths Pathnames of the input files to be filtered; wildcards * and ? are 
			supported; relative paths are resolved on the basis of the current 
			working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head(long count, String... paths);
	/**
	 * Reads the first {@code count} lines or characters from each of the
			specified files and writes them to the standard output. If more than
			a single file is specified and the {@code -q} option is not 
			specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the head command.
	 * @param count The first {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @param files The input files to be filtered; relative paths are not resolved (use 
			the string paths argument to enable relative path resolving based on 
			the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head(HeadOptions options, long count, java.io.File... files);
	/**
	 * Reads the first {@code count} lines or characters from each of the
			specified files and writes them to the standard output. If more than
			a single file is specified and the {@code -q} option is not 
			specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the head command.
	 * @param count The first {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @param paths Pathnames of the input files to be filtered; wildcards * and ? are 
			supported; relative paths are resolved on the basis of the current 
			working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder head(HeadOptions options, long count, String... paths);

	/* ------------------ ls ------------------ */
	/**
	 * Lists all files and directories in the user's current working 
			directory and writes them to the output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder ls();
	/**
	 * Prints the name of the specified files and lists all files contained 
			in directories for every directory in those files. 
			<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--paths" operand have to be prefixed with the operand 
			name.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--paths" operand have to be prefixed with the operand 
			name (e.g. "--count" for a subsequent count operand value).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder ls(String... args);
	/**
	 * Prints the name of the given files and lists all files contained in 
			directories for every directory in {@code files}.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param files The files or directories used as starting point for the listing; 
			relative paths are not resolved (use the string path argument to 
			enable relative path resolving based on the current working 
			directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder ls(java.io.File... files);
	/**
	 * Lists all files and directories in the user's current working 
			directory and writes them to the output using the given options 
			specifying the details of the output format.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the output format.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder ls(LsOptions options);
	/**
	 * Prints the name of the given files and lists all files contained in
			directories for every directory in {@code files}. The given options
			define the details of the output format.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the output format.
	 * @param files The files or directories used as starting point for the listing; 
			relative paths are not resolved (use the string path argument to 
			enable relative path resolving based on the current working 
			directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder ls(LsOptions options, java.io.File... files);
	/**
	 * Prints the name of the given files and lists all files contained in
			directories for every directory in {@code files}. The given options
			define the details of the output format.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the output format.
	 * @param paths The files or directories used as starting point for the listing; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder ls(LsOptions options, String... paths);

	/* ------------------ sed ------------------ */
	/**
	 * Executes the sed script specified by the given arguments and writes
			the result to the standard output. 
			<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--script" operand have to be prefixed with the operand name.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--script" operand have to be prefixed with the operand name
			(e.g. "--occurrence" for subsequent occurrence indices).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sed(String... args);
	/**
	 * Executes the given sed script, such as "s/original/replacement/g".
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param script Sed script as one string, such as "s/original/replacement/g".
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sed(String script);
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param regexp Regular expression matched against a line.
	 * @param replacement Replacement string for substitute command. An ampersand ('&') 
			appearing in the replacement string is replaced by the string 
			matching the regular expression. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression. The special meaning of '&' and "\n" in 
			this context can be suppressed by preceding it by a backslash.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sed(String regexp, String replacement);
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sed(String regexp, String replacement, int... occurrence);
	/**
	 * Executes the sed command specified by the given options or executes
			the print command p if no command option has been declared.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Sed options and commands
	 * @param regexp Regular expression matched against a line.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sed(SedOptions options, String regexp);
	/**
	 * Executes the sed command specified by the given options or executes
			the substitute command s if no command option has been declared.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sed(SedOptions options, String string1, String string2);
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
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
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sed(SedOptions options, String string1, String string2, int... occurrence);

	/* ------------------ sort ------------------ */
	/**
	 * Sort the lines read from the standard input and writes the result to
			the standard output. 
			<p>
			Comparisons are based on the entire line without line ending. The 
			collating sequence of the current locale is used to perform the
			comparisons. 
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort();
	/**
	 * Sort the lines of all the specified files together and writes the
			result to the standard output.
			<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--paths" operand have to be prefixed with the operand 
			name. 
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort. If two lines 
			originate from different input files, the index of the file in the
			input arguments list defines the ordering of the lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--paths" operand have to be prefixed with the operand 
			name (e.g. "--comparator" for a subsequent comparator operand value).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(String... args);
	/**
	 * Sort the lines of all the specified files together and writes the
			result to the standard output. 
			<p>
			Comparisons are based on the entire line without line ending. The 
			collating sequence of the current locale is used to perform the
			comparisons. 
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort. If two lines 
			originate from different input files, the index of the file in the
			input arguments list defines the ordering of the lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param files The files to be sorted or merged; relative paths are not resolved 
			(use the string paths argument to enable relative path resolving 
			based on the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(java.io.File... files);
	/**
	 * Sort the lines read from the standard input and writes the result to
			the standard output. 
			<p>
			Line comparisons are based on the specified {@code comparator}.
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param comparator The comparator to use for the line comparisons.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(java.util.Comparator<? super org.unix4j.line.Line> comparator);
	/**
	 * Sort the lines of all the specified files together and writes the
			result to the standard output. 
			<p>
			Line comparisons are based on the specified {@code comparator}.
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort. If two lines 
			originate from different input files, the index of the file in the
			input arguments list defines the ordering of the lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param comparator The comparator to use for the line comparisons.
	 * @param files The files to be sorted or merged; relative paths are not resolved 
			(use the string paths argument to enable relative path resolving 
			based on the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(java.util.Comparator<? super org.unix4j.line.Line> comparator, java.io.File... files);
	/**
	 * Sort the lines of all the specified files together and writes the
			result to the standard output. 
			<p>
			Line comparisons are based on the specified {@code comparator}.
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort. If two lines 
			originate from different input files, the index of the file in the
			input arguments list defines the ordering of the lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param comparator The comparator to use for the line comparisons.
	 * @param paths Pathnames of the files to be sorted, merged, or checked; wildcards * 
			and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(java.util.Comparator<? super org.unix4j.line.Line> comparator, String... paths);
	/**
	 * Sorts, merges, or sequence checks the lines read from the standard
			input and writes the result to the standard output. 
			<p>
			Comparisons are based on the entire line without line ending. The 
			collating sequence of the current locale is used to perform the
			comparisons. 
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options for the sort command.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(SortOptions options);
	/**
	 * Sorts, merges, or sequence checks the lines the lines of all the
			specified files together and writes the result to the standard
			output. 
			<p>
			Comparisons are based on the entire line without line ending. The 
			collating sequence of the current locale is used to perform the
			comparisons. 
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort. If two lines 
			originate from different input files, the index of the file in the
			input arguments list defines the ordering of the lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options for the sort command.
	 * @param files The files to be sorted or merged; relative paths are not resolved 
			(use the string paths argument to enable relative path resolving 
			based on the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(SortOptions options, java.io.File... files);
	/**
	 * Sorts, merges, or sequence checks the lines the lines of all the
			specified files together and writes the result to the standard
			output. 
			<p>
			Comparisons are based on the entire line without line ending. The 
			collating sequence of the current locale is used to perform the
			comparisons. 
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort. If two lines 
			originate from different input files, the index of the file in the
			input arguments list defines the ordering of the lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options for the sort command.
	 * @param paths Pathnames of the files to be sorted, merged, or checked; wildcards * 
			and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(SortOptions options, String... paths);
	/**
	 * Sorts, merges, or sequence checks the lines read from the standard
			input and writes the result to the standard output. 
			<p>
			Line comparisons are based on the specified {@code comparator}. 
			All comparison related options are ignored except for
			{@code --reverse}.
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options for the sort command.
	 * @param comparator The comparator to use for the line comparisons.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator);
	/**
	 * Sorts, merges, or sequence checks the lines the lines of all the
			specified files together and writes the result to the standard
			output. 
			<p>
			Line comparisons are based on the specified {@code comparator}. 
			All comparison related options except for {@code --reverse} are 
			ignored.
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort. If two lines 
			originate from different input files, the index of the file in the
			input arguments list defines the ordering of the lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options for the sort command.
	 * @param comparator The comparator to use for the line comparisons.
	 * @param files The files to be sorted or merged; relative paths are not resolved 
			(use the string paths argument to enable relative path resolving 
			based on the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator, java.io.File... files);
	/**
	 * Sorts, merges, or sequence checks the lines the lines of all the
			specified files together and writes the result to the standard
			output. 
			<p>
			Line comparisons are based on the specified {@code comparator}. 
			All comparison related options except for {@code --reverse} are 
			ignored.
			<p>
			The sort algorithm used is guaranteed to be stable: lines considered
			equal will not be reordered as a result of the sort. If two lines 
			originate from different input files, the index of the file in the
			input arguments list defines the ordering of the lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options for the sort command.
	 * @param comparator The comparator to use for the line comparisons.
	 * @param paths Pathnames of the files to be sorted, merged, or checked; wildcards * 
			and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator, String... paths);

	/* ------------------ tail ------------------ */
	/**
	 * Reads the last 10 lines from the standard input and writes them to
			the standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail();
	/**
	 * Reads the last n lines from each of the files specified and writes
			them to the standard output. If more than a single file is 
			specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--paths" operand have to be prefixed with the operand 
			name.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--paths" operand have to be prefixed with the operand 
			name (e.g. "--count" for a subsequent count operand value).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail(String... args);
	/**
	 * Reads the last {@code count} lines from the standard input and 
			writes them to the standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param count The last {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified, and offset from start  
			instead of end with {@code -s} option). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail(long count);
	/**
	 * Reads the last {@code count} lines or characters from the standard 
			input and writes them to the standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the tail command.
	 * @param count The last {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified, and offset from start  
			instead of end with {@code -s} option). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail(TailOptions options, long count);
	/**
	 * Reads the last 10 lines from each of the specified files and writes
			them to the standard output. If more than a single file is 
			specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param files The input files to be filtered; relative paths are not resolved (use 
			the string paths argument to enable relative path resolving based on 
			the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail(java.io.File... files);
	/**
	 * Reads the last {@code count} lines from each of the specified files
			and writes them to the standard output. If more than a single file 
			is specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param count The last {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified, and offset from start  
			instead of end with {@code -s} option). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @param files The input files to be filtered; relative paths are not resolved (use 
			the string paths argument to enable relative path resolving based on 
			the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail(long count, java.io.File... files);
	/**
	 * Reads the last {@code count} lines from each of the specified files
			and writes them to the standard output. If more than a single file 
			is specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param count The last {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified, and offset from start  
			instead of end with {@code -s} option). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @param paths Pathnames of the input files to be filtered; wildcards * and ? are 
			supported; relative paths are resolved on the basis of the current 
			working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail(long count, String... paths);
	/**
	 * Reads the last {@code count} lines or characters from each of the
			specified files and writes them to the standard output. If more than
			a single file is specified and the {@code -q} option is not 
			specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the tail command.
	 * @param count The last {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified, and offset from start  
			instead of end with {@code -s} option). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @param files The input files to be filtered; relative paths are not resolved (use 
			the string paths argument to enable relative path resolving based on 
			the current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail(TailOptions options, long count, java.io.File... files);
	/**
	 * Reads the last {@code count} lines or characters from each of the
			specified files and writes them to the standard output. If more than
			a single file is specified and the {@code -q} option is not 
			specified, each file is preceded by a header consisting of the 
			string {@code "==> XXX <=="} where {@code "XXX"} is the name 
			of the file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options Options for the tail command.
	 * @param count The last {@code count} lines of each input file are
			copied to standard output, starting from 1 (characters instead of 
			lines if the {@code -c} option is specified, and offset from start  
			instead of end with {@code -s} option). Must be a non-negative 
			integer or an exception is thrown. If {@code count} is greater than 
			the number number of lines (characters) in the input, the
			application will not error and send the whole file to the output.
	 * @param paths Pathnames of the input files to be filtered; wildcards * and ? are 
			supported; relative paths are resolved on the basis of the current 
			working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder tail(TailOptions options, long count, String... paths);

	/* ------------------ uniq ------------------ */
	/**
	 * Reads from the standard input and compares adjacent lines, writing
			one copy  of each input line to the standard output. The second and 
			succeeding copies of repeated adjacent input lines are not written
			to the output.
			<p>
			Note that repeated lines in the input are not detected if they are 
			not adjacent (see --global or -g option); sorted input lines always
			result in unique output lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder uniq();
	/**
	 * Reads the file specified by the {@code "--path"} operand (the 
			default operand) and writes only unique lines to the standard 
			output. The second and succeeding copies of repeated input lines are 
			not written to the output.
			<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--path" operand have to be prefixed with the operand name. 
<p>
			Note that repeated lines in the input are not detected if they are 
			not adjacent unless the --global is specified (sorted input lines 
			always result in unique output lines).
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--path" operand have to be prefixed with the operand 
			name.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder uniq(String... args);
	/**
	 * Reads from the specified input {@code file} and compares adjacent
			lines, writing one copy of each input line to the standard output. 
			The second and succeeding copies of repeated adjacent input lines 
			are not written to the output.
			<p>
			Note that repeated lines in the input are not detected if they are 
			not adjacent (see --global or -g option); sorted input lines always
			result in unique output lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param file The files or directories used as starting point for the listing; 
			relative paths are not resolved (use the string path argument to 
			enable relative path resolving based on the current working 
			directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder uniq(java.io.File file);
	/**
	 * Reads the file specified by its {@code path} and compares adjacent
			lines, writing one copy of each input line to the standard output. 
			The second and succeeding copies of repeated adjacent input lines 
			are not written to the output.
			<p>
			Note that repeated lines in the input are not detected if they are 
			not adjacent (see --global or -g option); sorted input lines always
			result in unique output lines.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param path The files or directories used as starting point for the listing; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder uniq(String path);
	/**
	 * Reads from the standard input and compares adjacent lines, writing
			one copy  of each input line to the standard output. The second and 
			succeeding copies of repeated adjacent input lines are not written
			to the output.
			<p>
			Note that repeated non-adjacent lines in the input are only detected
			with the --global or -g option. In other words, unique output lines
			are guaranteed only if either (a) the --global or -g option is
			specified, or (b) the input lines are sorted.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the uniqueness details for the output lines.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder uniq(UniqOptions options);
	/**
	 * Reads from the specified input {@code file} and compares adjacent
			lines, writing one copy of each input line to the standard output. 
			The second and succeeding copies of repeated adjacent input lines 
			are not written to the output.
			<p>
			Note that repeated non-adjacent lines in the input are only detected
			with the --global or -g option. In other words, unique output lines
			are guaranteed only if either (a) the --global or -g option is
			specified, or (b) the input lines are sorted.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the uniqueness details for the output lines.
	 * @param file The files or directories used as starting point for the listing; 
			relative paths are not resolved (use the string path argument to 
			enable relative path resolving based on the current working 
			directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder uniq(UniqOptions options, java.io.File file);
	/**
	 * Reads the file specified by its {@code path} and compares adjacent
			lines, writing one copy of each input line to the standard output. 
			The second and succeeding copies of repeated adjacent input lines 
			are not written to the output.
			<p>
			Note that repeated non-adjacent lines in the input are only detected
			with the --global or -g option. In other words, unique output lines
			are guaranteed only if either (a) the --global or -g option is
			specified, or (b) the input lines are sorted.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining the uniqueness details for the output lines.
	 * @param path The files or directories used as starting point for the listing; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder uniq(UniqOptions options, String path);

	/* ------------------ wc ------------------ */
	/**
	 * Executes a count of lines, words and chars contained in the standard
			input and writes them to the standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder wc();
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
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--paths" operand have to be prefixed with the operand 
			name.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder wc(String... args);
	/**
	 * Executes a count of lines, words and chars contained in each input
			file and writes them to the standard output. If more than one input 
			file is specified, a line of cumulative counts for all the files is 
			displayed on a separate line after the output for the last file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param files The input files; relative paths are not resolved (use the string 
			paths argument to enable relative path resolving based on the
			current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder wc(java.io.File... files);
	/**
	 * Executes a one or more counts, depending on the given options, in
			the standard input and writes them to the standard output.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder wc(WcOptions options);
	/**
	 * Executes a one or more counts, depending on the given options, in
			each of the given input files and writes them to the standard 
			output. If more than one input file is specified, a line of 
			cumulative counts for all the files is displayed on a separate line 
			after the output for the last file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param files The input files; relative paths are not resolved (use the string 
			paths argument to enable relative path resolving based on the
			current working directory).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder wc(WcOptions options, java.io.File... files);
	/**
	 * Executes a one or more counts, depending on the given options, in
			each of the given input files and writes them to the standard 
			output. If more than one input file is specified, a line of 
			cumulative counts for all the files is displayed on a separate line
			after the output for the last file.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param paths Pathnames of the input files; wildcards * and ? are supported;
			relative paths are resolved on the basis of the current working 
			directory.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder wc(WcOptions options, String[] paths);

	/* ------------------ xargs ------------------ */
	/**
	 * Reads items from the standard input, delimited by blanks (which can 
			be protected with double or single quotes or a backslash) or 
			newlines, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every input line; the item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs();
	/**
	 * Reads items from the standard input, delimited by blanks and 
			newlines or a specified delimiter, and provides variables for the
			items read from the standard input. The command following after 
			xargs is executed once for every input line (or for multiple lines
			depending on the input options); the item variables are usually 
			passed to the invoked command as arguments.
			<p>
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the 
			default "--maxArgs" operand have to be prefixed with the operand 
			name.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--maxArgs" operand have to be prefixed with the operand 
			name (e.g. "--maxLines" for a subsequent line count operand value).
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(String... args);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every input line; the item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param delimiter Input items are terminated by the specified characters.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(String delimiter);
	/**
	 * Reads items from the standard input, delimited by blanks (which can 
			be protected with double or single quotes or a backslash) or 
			newlines, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxLines} nonblank input lines (or possibly fewer 
			for the last invocation with the remaining lines at the end of the 
			file). The item variables are usually passed to the invoked command 
			as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(long maxLines);
	/**
	 * Reads items from the standard input, delimited by blanks (which can 
			be protected with double or single quotes or a backslash) or 
			newlines, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxArgs} items read from the standard input (or 
			possibly fewer for the last invocation with the remaining items at
			the end of the file). The item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(int maxArgs);
	/**
	 * Reads items from the standard input, delimited by blanks (which can 
			be protected with double or single quotes or a backslash) or 
			newlines, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxLines} nonblank input lines or {@code maxArgs}
			items (whichever occurs first). Fewer lines or items may be used for
			the last invocation with the remaining lines at the end of the file. 
			The item variables are usually passed to the invoked command as 
			arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(long maxLines, int maxArgs);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxLines} nonblank input lines (or possibly fewer 
			for the last invocation with the remaining lines at the end of the 
			file). The item variables are usually passed to the invoked command 
			as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param delimiter Input items are terminated by the specified characters.
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(String delimiter, long maxLines);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxArgs} items read from the standard input (or 
			possibly fewer for the last invocation with the remaining items at
			the end of the file). The item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param delimiter Input items are terminated by the specified characters.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(String delimiter, int maxArgs);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxLines} nonblank input lines or {@code maxArgs}
			items (whichever occurs first). Fewer lines or items may be used for
			the last invocation with the remaining lines at the end of the file. 
			The item variables are usually passed to the invoked command as 
			arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param delimiter Input items are terminated by the specified characters.
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(String delimiter, long maxLines, int maxArgs);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. If the {@code eof} string occurs as a line of input, 
			the rest of the input is ignored. The command following after xargs
			is executed once for every {@code maxLines} nonblank input lines or
			{@code maxArgs} items (whichever occurs first). Fewer lines or items
			may be used for the last invocation with the remaining lines at the 
			end of the file. The item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param delimiter Input items are terminated by the specified characters.
	 * @param eof If the end of file string occurs as a line of input, the rest of the
			input is ignored.
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(String delimiter, String eof, long maxLines, int maxArgs);
	/**
	 * Reads items from the standard input, delimited by blanks (which can 
			be protected with double or single quotes or a backslash) or 
			newlines, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every input line; the item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every input line; the item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param delimiter Input items are terminated by the specified characters.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options, String delimiter);
	/**
	 * Reads items from the standard input, delimited by blanks (which can 
			be protected with double or single quotes or a backslash) or 
			newlines, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxLines} nonblank input lines (or possibly fewer 
			for the last invocation with the remaining lines at the end of the 
			file). The item variables are usually passed to the invoked command 
			as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options, long maxLines);
	/**
	 * Reads items from the standard input, delimited by blanks (which can 
			be protected with double or single quotes or a backslash) or 
			newlines, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxArgs} items read from the standard input (or 
			possibly fewer for the last invocation with the remaining items at
			the end of the file). The item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options, int maxArgs);
	/**
	 * Reads items from the standard input, delimited by blanks (which can 
			be protected with double or single quotes or a backslash) or 
			newlines, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxLines} nonblank input lines or {@code maxArgs}
			items (whichever occurs first). Fewer lines or items may be used for
			the last invocation with the remaining lines at the end of the file. 
			The item variables are usually passed to the invoked command as 
			arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options, long maxLines, int maxArgs);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxLines} nonblank input lines (or possibly fewer 
			for the last invocation with the remaining lines at the end of the 
			file). The item variables are usually passed to the invoked command 
			as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param delimiter Input items are terminated by the specified characters.
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options, String delimiter, long maxLines);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxArgs} items read from the standard input (or 
			possibly fewer for the last invocation with the remaining items at
			the end of the file). The item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param delimiter Input items are terminated by the specified characters.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options, String delimiter, int maxArgs);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. The command following after xargs is executed once 
			for every {@code maxLines} nonblank input lines or {@code maxArgs}
			items (whichever occurs first). Fewer lines or items may be used for
			the last invocation with the remaining lines at the end of the file. 
			The item variables are usually passed to the invoked command as 
			arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param delimiter Input items are terminated by the specified characters.
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options, String delimiter, long maxLines, int maxArgs);
	/**
	 * Reads items from the standard input using the specified delimiter to
			separate items, and provides variables for the items read from the 
			standard input. If the {@code eof} string occurs as a line of input, 
			the rest of the input is ignored. The command following after xargs
			is executed once for every {@code maxLines} nonblank input lines or
			{@code maxArgs} items (whichever occurs first). Fewer lines or items
			may be used for the last invocation with the remaining lines at the 
			end of the file. The item variables are usually passed to the 
			invoked command as arguments.
	 * <p>
	 * Note that the method returns {@code this} builder to allow for command 
	 * chaining. The command itself is returned by the {@link #build()} method. 
	 * See {@link Unix4jCommandBuilder class comments} for more information.
	 *
	 * @param options The options defining command behavior.
	 * @param delimiter Input items are terminated by the specified characters.
	 * @param eof If the end of file string occurs as a line of input, the rest of the
			input is ignored.
	 * @param maxLines Use at most maxLines nonblank input lines per command invocation.
	 * @param maxArgs Use at most maxArgs arguments per command invocation.
	 * @return	{@code this} builder to allow for method chaining; method
	 * 			chaining is used here to create command chains; adding a command 
	 * 			to the chain usually means that the previous command <i>pipes</i> 
	 * 			its output to the next command (the pipe symbol in unix)
	 */
	@Override
	Unix4jCommandBuilder xargs(XargsOptions options, String delimiter, String eof, long maxLines, int maxArgs);

	//override with specialized return type
	@Override
	Unix4jCommandBuilder join(Command<?> command);
	
	//override with specialized return type
	@Override
	Unix4jCommandBuilder apply(LineOperation operation);

	//override with specialized return type
	@Override
	Unix4jCommandBuilder reset();

}
