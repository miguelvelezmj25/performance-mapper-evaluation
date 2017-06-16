package org.unix4j.unix;

import org.unix4j.command.CommandInterface;

import org.unix4j.unix.cut.CutFactory;
import org.unix4j.unix.cut.CutOption;
import org.unix4j.unix.cut.CutOptions;
import org.unix4j.unix.cut.CutOptionSets;

/**
 * Non-instantiable module with inner types making up the <b>cut</b> command.
 * <p>
 * <b>NAME</b>
 * <p>
 * cut - remove sections from each line of the input 
 * <p>
 * <b>SYNOPSIS</b>
 * <p>
 * <table>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cut <args>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cut [-cf] <range>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cut [-cf] <indexes>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cut [-cf] <delimiter> <range>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cut [-cf] <delimiter> <indexes>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cut [-cf] <delimiter> <outputDelimiter> <range>}</td></tr>
 * <tr><td width="10px"></td><td nowrap="nowrap">{@code cut [-cf] <delimiter> <outputDelimiter> <indexes>}</td></tr>
 * </table>
 * <p>
 * See {@link Interface} for the corresponding command signature methods.
 * <p>
 * <b>DESCRIPTION</b>
 * <p>
 * <p>Print selected parts of lines from the input to the output.</p>
 * 
 * <p>
 * <b>Options</b>
 * <p>
 * The following options are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The list specifies character positions.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fields}</td><td>&nbsp;</td><td>The list specifies fields, separated in the input by the field
			delimiter character (see the -d option.)  Output fields are
			separated by a single occurrence of the field delimiter character.</td></tr>
 * </table>
 * <p>
 * <b>OPERANDS</b>
 * <p>
 * The following operands are supported:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <delimiter>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String}</td><td>&nbsp;</td><td>use as the output delimiter the default is to use the input delimiter</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <outputDelimiter>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code char}</td><td>&nbsp;</td><td>use as the output delimiter the default is to use the input delimiter</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <indexes>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code int...}</td><td>&nbsp;</td><td>select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <range>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code org.unix4j.util.Range}</td><td>&nbsp;</td><td>select only these fields</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <args>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code String...}</td><td>&nbsp;</td><td>String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--range" operand have to be prefixed with the operand name
			(e.g. "--indexes" for subsequent index operand values).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code <options>}</td><td>&nbsp;:&nbsp;</td><td nowrap="nowrap">{@code CutOptions}</td><td>&nbsp;</td><td>options for the cut command</td></tr>
 * </table>
 */
public final class Cut {
	/**
	 * The "cut" command name.
	 */
	public static final String NAME = "cut";

	/**
	 * Interface defining all method signatures for the "cut" command.
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
		 * Cuts the fields or characters from the input line and writes them to 
			the standard output. Depending on the provided options and operands, 
			range, delimiter or indexes define the cut.
		 *
		 * @param args String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--range" operand have to be prefixed with the operand name
			(e.g. "--indexes" for subsequent index operand values).
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cut(String... args);
		/**
		 * Cuts the fields or characters using the given range
			from the input line and writes them to the output.
		 *
		 * @param options options for the cut command
		 * @param range select only these fields
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cut(CutOptions options, org.unix4j.util.Range range);
		/**
		 * Cuts the fields or characters using the given indexes
			from the input line and writes them to the output.
		 *
		 * @param options options for the cut command
		 * @param indexes select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cut(CutOptions options, int... indexes);
		/**
		 * Cuts the fields using the given range
			from the input line and writes them to the output.
		 *
		 * @param options options for the cut command
		 * @param delimiter use as the output delimiter the default is to use the input delimiter
		 * @param range select only these fields
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cut(CutOptions options, String delimiter, org.unix4j.util.Range range);
		/**
		 * Cuts the fields using the given indexes
			from the input line and writes them to the output.
		 *
		 * @param options options for the cut command
		 * @param delimiter use as the output delimiter the default is to use the input delimiter
		 * @param indexes select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cut(CutOptions options, String delimiter, int... indexes);
		/**
		 * Cuts the fields using the given range and using the given delimiter
			from the input line and writes them to the output using the given outputDelimiter.
		 *
		 * @param options options for the cut command
		 * @param delimiter use as the output delimiter the default is to use the input delimiter
		 * @param outputDelimiter use as the output delimiter the default is to use the input delimiter
		 * @param range select only these fields
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cut(CutOptions options, String delimiter, char outputDelimiter, org.unix4j.util.Range range);
		/**
		 * Cuts the fields using the given indexes and using the given delimiter
			from the input line and writes them to the output using the given outputDelimiter.
		 *
		 * @param options options for the cut command
		 * @param delimiter use as the output delimiter the default is to use the input delimiter
		 * @param outputDelimiter use as the output delimiter the default is to use the input delimiter
		 * @param indexes select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.
		 * @return the generic type {@code <R>} defined by the implementing class;
		 *         the command itself returns no value and writes its result to the
		 *         standard output; see class level parameter comments for more 
		 *         details
		 */
		R cut(CutOptions options, String delimiter, char outputDelimiter, int... indexes);
	}

	/**
	 * Options for the "cut" command: {@link CutOption#chars c}, {@link CutOption#fields f}.
	 * <p> 
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --chars}</td><td>&nbsp;</td><td>The list specifies character positions.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --fields}</td><td>&nbsp;</td><td>The list specifies fields, separated in the input by the field
			delimiter character (see the -d option.)  Output fields are
			separated by a single occurrence of the field delimiter character.</td></tr>
 * </table>
	 */
	public static final CutOptionSets Options = CutOptionSets.INSTANCE;

	/**
	 * Singleton {@link CutFactory factory} instance for the "cut" command.
	 */
	public static final CutFactory Factory = CutFactory.INSTANCE;

	// no instances
	private Cut() {
		super();
	}
}
