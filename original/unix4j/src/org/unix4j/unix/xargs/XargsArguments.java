package org.unix4j.unix.xargs;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.unix4j.command.Arguments;
import org.unix4j.context.ExecutionContext;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.util.ArgsUtil;
import org.unix4j.util.ArrayUtil;
import org.unix4j.variable.Arg;
import org.unix4j.variable.VariableContext;

import org.unix4j.unix.Xargs;

/**
 * Arguments and options for the {@link Xargs xargs} command.
 */
public final class XargsArguments implements Arguments<XargsArguments> {
	
	private final XargsOptions options;

	
	// operand: <delimiter>
	private String delimiter;
	private boolean delimiterIsSet = false;
	
	// operand: <eof>
	private String eof;
	private boolean eofIsSet = false;
	
	// operand: <maxLines>
	private long maxLines;
	private boolean maxLinesIsSet = false;
	
	// operand: <maxArgs>
	private int maxArgs;
	private boolean maxArgsIsSet = false;
	
	// operand: <args>
	private String[] args;
	private boolean argsIsSet = false;
	
	/**
	 * Constructor to use if no options are specified.
	 */
	public XargsArguments() {
		this.options = XargsOptions.EMPTY;
	}

	/**
	 * Constructor with option set containing the selected command options.
	 * 
	 * @param options the selected options
	 * @throws NullPointerException if the argument is null
	 */
	public XargsArguments(XargsOptions options) {
		if (options == null) {
			throw new NullPointerException("options argument cannot be null");
		}
		this.options = options;
	}
	
	/**
	 * Returns the options set containing the selected command options. Returns
	 * an empty options set if no option has been selected.
	 * 
	 * @return set with the selected options
	 */
	public XargsOptions getOptions() {
		return options;
	}

	/**
	 * Constructor string arguments encoding options and arguments, possibly
	 * also containing variable expressions. 
	 * 
	 * @param args string arguments for the command
	 * @throws NullPointerException if args is null
	 */
	public XargsArguments(String... args) {
		this();
		this.args = args;
		this.argsIsSet = true;
	}
	private Object[] resolveVariables(VariableContext context, String... unresolved) {
		final Object[] resolved = new Object[unresolved.length];
		for (int i = 0; i < resolved.length; i++) {
			final String expression = unresolved[i];
			if (Arg.isVariable(expression)) {
				resolved[i] = resolveVariable(context, expression);
			} else {
				resolved[i] = expression;
			}
		}
		return resolved;
	}
	private <V> V convertList(ExecutionContext context, String operandName, Class<V> operandType, List<Object> values) {
		if (values.size() == 1) {
			final Object value = values.get(0);
			return convert(context, operandName, operandType, value);
		}
		return convert(context, operandName, operandType, values);
	}

	private Object resolveVariable(VariableContext context, String variable) {
		final Object value = context.getValue(variable);
		if (value != null) {
			return value;
		}
		throw new IllegalArgumentException("cannot resolve variable " + variable + 
				" in command: xargs " + this);
	}
	private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
		final ValueConverter<V> converter = context.getValueConverterFor(operandType);
		final V convertedValue;
		if (converter != null) {
			convertedValue = converter.convert(value);
		} else {
			if (XargsOptions.class.equals(operandType)) {
				convertedValue = operandType.cast(XargsOptions.CONVERTER.convert(value));
			} else {
				convertedValue = null;
			}
		}
		if (convertedValue != null) {
			return convertedValue;
		}
		throw new IllegalArgumentException("cannot convert --" + operandName + 
				" value '" + value + "' into the type " + operandType.getName() + 
				" for xargs command");
	}
	
	@Override
	public XargsArguments getForContext(ExecutionContext context) {
		if (context == null) {
			throw new NullPointerException("context cannot be null");
		}
		if (!argsIsSet || args.length == 0) {
			//nothing to resolve
			return this;
		}

		//check if there is at least one variable
		boolean hasVariable = false;
		for (final String arg : args) {
			if (arg != null && arg.startsWith("$")) {
				hasVariable = true;
				break;
			}
		}
		//resolve variables
		final Object[] resolvedArgs = hasVariable ? resolveVariables(context.getVariableContext(), this.args) : this.args;
		
		//convert now
		final List<String> defaultOperands = Arrays.asList("maxArgs");
		final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
		final XargsOptions.Default options = new XargsOptions.Default();
		final XargsArguments argsForContext = new XargsArguments(options);
		for (final Map.Entry<String, List<Object>> e : map.entrySet()) {
			if ("delimiter".equals(e.getKey())) {
					
				final String value = convertList(context, "delimiter", String.class, e.getValue());  
				argsForContext.setDelimiter(value);
			} else if ("eof".equals(e.getKey())) {
					
				final String value = convertList(context, "eof", String.class, e.getValue());  
				argsForContext.setEof(value);
			} else if ("maxLines".equals(e.getKey())) {
					
				final long value = convertList(context, "maxLines", long.class, e.getValue());  
				argsForContext.setMaxLines(value);
			} else if ("maxArgs".equals(e.getKey())) {
					
				final int value = convertList(context, "maxArgs", int.class, e.getValue());  
				argsForContext.setMaxArgs(value);
			} else if ("args".equals(e.getKey())) {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in xargs command args: " + Arrays.toString(args));
			} else if ("options".equals(e.getKey())) {
					
				final XargsOptions value = convertList(context, "options", XargsOptions.class, e.getValue());  
				options.setAll(value);
			} else {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in xargs command args: " + Arrays.toString(args));
			}
		}
		return argsForContext;
	}
	
	/**
	 * Returns the {@code <delimiter>} operand value (variables are NOT resolved): Input items are terminated by the specified characters.
	 * 
	 * @return the {@code <delimiter>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getDelimiter(ExecutionContext)
	 */
	public String getDelimiter() {
		if (delimiterIsSet) {
			return delimiter;
		}
		throw new IllegalStateException("operand has not been set: " + delimiter);
	}
	/**
	 * Returns the {@code <delimiter>} (variables are resolved): Input items are terminated by the specified characters.
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <delimiter>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getDelimiter()
	 */
	public String getDelimiter(ExecutionContext context) {
		final String value = getDelimiter();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "delimiter", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <delimiter>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setDelimiter(String)} method.
	 * 
	 * @return	true if the setter for the {@code <delimiter>} operand has 
	 * 			been called at least once
	 */
	public boolean isDelimiterSet() {
		return delimiterIsSet;
	}
	/**
	 * Sets {@code <delimiter>}: Input items are terminated by the specified characters.
	 * 
	 * @param delimiter the value for the {@code <delimiter>} operand
	 */
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
		this.delimiterIsSet = true;
	}
	/**
	 * Returns the {@code <eof>} operand value (variables are NOT resolved): If the end of file string occurs as a line of input, the rest of the
			input is ignored.
	 * 
	 * @return the {@code <eof>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getEof(ExecutionContext)
	 */
	public String getEof() {
		if (eofIsSet) {
			return eof;
		}
		throw new IllegalStateException("operand has not been set: " + eof);
	}
	/**
	 * Returns the {@code <eof>} (variables are resolved): If the end of file string occurs as a line of input, the rest of the
			input is ignored.
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <eof>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getEof()
	 */
	public String getEof(ExecutionContext context) {
		final String value = getEof();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "eof", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <eof>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setEof(String)} method.
	 * 
	 * @return	true if the setter for the {@code <eof>} operand has 
	 * 			been called at least once
	 */
	public boolean isEofSet() {
		return eofIsSet;
	}
	/**
	 * Sets {@code <eof>}: If the end of file string occurs as a line of input, the rest of the
			input is ignored.
	 * 
	 * @param eof the value for the {@code <eof>} operand
	 */
	public void setEof(String eof) {
		this.eof = eof;
		this.eofIsSet = true;
	}
	/**
	 * Returns the {@code <maxLines>} operand value: Use at most maxLines nonblank input lines per command invocation.
	 * 
	 * @return the {@code <maxLines>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public long getMaxLines() {
		if (maxLinesIsSet) {
			return maxLines;
		}
		throw new IllegalStateException("operand has not been set: " + maxLines);
	}

	/**
	 * Returns true if the {@code <maxLines>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setMaxLines(long)} method.
	 * 
	 * @return	true if the setter for the {@code <maxLines>} operand has 
	 * 			been called at least once
	 */
	public boolean isMaxLinesSet() {
		return maxLinesIsSet;
	}
	/**
	 * Sets {@code <maxLines>}: Use at most maxLines nonblank input lines per command invocation.
	 * 
	 * @param maxLines the value for the {@code <maxLines>} operand
	 */
	public void setMaxLines(long maxLines) {
		this.maxLines = maxLines;
		this.maxLinesIsSet = true;
	}
	/**
	 * Returns the {@code <maxArgs>} operand value: Use at most maxArgs arguments per command invocation.
	 * 
	 * @return the {@code <maxArgs>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public int getMaxArgs() {
		if (maxArgsIsSet) {
			return maxArgs;
		}
		throw new IllegalStateException("operand has not been set: " + maxArgs);
	}

	/**
	 * Returns true if the {@code <maxArgs>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setMaxArgs(int)} method.
	 * 
	 * @return	true if the setter for the {@code <maxArgs>} operand has 
	 * 			been called at least once
	 */
	public boolean isMaxArgsSet() {
		return maxArgsIsSet;
	}
	/**
	 * Sets {@code <maxArgs>}: Use at most maxArgs arguments per command invocation.
	 * 
	 * @param maxArgs the value for the {@code <maxArgs>} operand
	 */
	public void setMaxArgs(int maxArgs) {
		this.maxArgs = maxArgs;
		this.maxArgsIsSet = true;
	}
	/**
	 * Returns the {@code <args>} operand value: String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--maxArgs" operand have to be prefixed with the operand 
			name (e.g. "--maxLines" for a subsequent line count operand value).
	 * 
	 * @return the {@code <args>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public String[] getArgs() {
		if (argsIsSet) {
			return args;
		}
		throw new IllegalStateException("operand has not been set: " + args);
	}

	/**
	 * Returns true if the {@code <args>} operand has been set. 
	 * 
	 * @return	true if the setter for the {@code <args>} operand has 
	 * 			been called at least once
	 */
	public boolean isArgsSet() {
		return argsIsSet;
	}
	
	/**
	 * Returns true if the {@code --}{@link XargsOption#delimiter0 delimiter0} option
	 * is set. The option is also known as {@code -}z option.
	 * <p>
	 * Description: Input items are terminated by a null character instead of by 
			whitespace, and the quotes and backslash are not special (every
			character is taken literally). Disables the end of file string,
			which is treated like any other argument. Useful when input items 
			might contain white space, quote marks, or backslashes. The find 
			--print0 option produces input suitable for this mode.
			<p>
			(This option is ignored if an explicit delimiter operand is specified).
	 * 
	 * @return true if the {@code --delimiter0} or {@code -z} option is set
	 */
	public boolean isDelimiter0() {
		return getOptions().isSet(XargsOption.delimiter0);
	}
	/**
	 * Returns true if the {@code --}{@link XargsOption#exactArgs exactArgs} option
	 * is set. The option is also known as {@code -}x option.
	 * <p>
	 * Description: Terminate immediately if {@code maxArgs} is specified but the found
			number of variable items is less than {@code maxArgs}.		
<p>
			(This option is ignored if no {@code maxArgs} operand is specified).
	 * 
	 * @return true if the {@code --exactArgs} or {@code -x} option is set
	 */
	public boolean isExactArgs() {
		return getOptions().isSet(XargsOption.exactArgs);
	}
	/**
	 * Returns true if the {@code --}{@link XargsOption#noRunIfEmpty noRunIfEmpty} option
	 * is set. The option is also known as {@code -}r option.
	 * <p>
	 * Description: If the standard input does not contain any nonblanks, do not run the
 			command. Normally, the command is run once even if there is no 
 			input.
	 * 
	 * @return true if the {@code --noRunIfEmpty} or {@code -r} option is set
	 */
	public boolean isNoRunIfEmpty() {
		return getOptions().isSet(XargsOption.noRunIfEmpty);
	}
	/**
	 * Returns true if the {@code --}{@link XargsOption#verbose verbose} option
	 * is set. The option is also known as {@code -}t option.
	 * <p>
	 * Description: Print the command line on the standard error output before executing
			it.
	 * 
	 * @return true if the {@code --verbose} or {@code -t} option is set
	 */
	public boolean isVerbose() {
		return getOptions().isSet(XargsOption.verbose);
	}

	@Override
	public String toString() {
		// ok, we have options or arguments or both
		final StringBuilder sb = new StringBuilder();

		if (argsIsSet) {
			for (String arg : args) {
				if (sb.length() > 0) sb.append(' ');
				sb.append(arg);
			}
		} else {
		
			// first the options
			if (options.size() > 0) {
				sb.append(DefaultOptionSet.toString(options));
			}
			// operand: <delimiter>
			if (delimiterIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("delimiter");
				sb.append(" ").append(toString(getDelimiter()));
			}
			// operand: <eof>
			if (eofIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("eof");
				sb.append(" ").append(toString(getEof()));
			}
			// operand: <maxLines>
			if (maxLinesIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("maxLines");
				sb.append(" ").append(toString(getMaxLines()));
			}
			// operand: <maxArgs>
			if (maxArgsIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("maxArgs");
				sb.append(" ").append(toString(getMaxArgs()));
			}
			// operand: <args>
			if (argsIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("args");
				sb.append(" ").append(toString(getArgs()));
			}
		}
		
		return sb.toString();
	}
	private static String toString(Object value) {
		if (value != null && value.getClass().isArray()) {
			return ArrayUtil.toString(value);
		}
		return String.valueOf(value);
	}
}
