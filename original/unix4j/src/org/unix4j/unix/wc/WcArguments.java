package org.unix4j.unix.wc;

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

import org.unix4j.unix.Wc;

/**
 * Arguments and options for the {@link Wc wc} command.
 */
public final class WcArguments implements Arguments<WcArguments> {
	
	private final WcOptions options;

	
	// operand: <paths>
	private String[] paths;
	private boolean pathsIsSet = false;
	
	// operand: <files>
	private java.io.File[] files;
	private boolean filesIsSet = false;
	
	// operand: <args>
	private String[] args;
	private boolean argsIsSet = false;
	
	/**
	 * Constructor to use if no options are specified.
	 */
	public WcArguments() {
		this.options = WcOptions.EMPTY;
	}

	/**
	 * Constructor with option set containing the selected command options.
	 * 
	 * @param options the selected options
	 * @throws NullPointerException if the argument is null
	 */
	public WcArguments(WcOptions options) {
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
	public WcOptions getOptions() {
		return options;
	}

	/**
	 * Constructor string arguments encoding options and arguments, possibly
	 * also containing variable expressions. 
	 * 
	 * @param args string arguments for the command
	 * @throws NullPointerException if args is null
	 */
	public WcArguments(String... args) {
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
				" in command: wc " + this);
	}
	private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
		final ValueConverter<V> converter = context.getValueConverterFor(operandType);
		final V convertedValue;
		if (converter != null) {
			convertedValue = converter.convert(value);
		} else {
			if (WcOptions.class.equals(operandType)) {
				convertedValue = operandType.cast(WcOptions.CONVERTER.convert(value));
			} else {
				convertedValue = null;
			}
		}
		if (convertedValue != null) {
			return convertedValue;
		}
		throw new IllegalArgumentException("cannot convert --" + operandName + 
				" value '" + value + "' into the type " + operandType.getName() + 
				" for wc command");
	}
	
	@Override
	public WcArguments getForContext(ExecutionContext context) {
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
		final List<String> defaultOperands = Arrays.asList("paths");
		final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
		final WcOptions.Default options = new WcOptions.Default();
		final WcArguments argsForContext = new WcArguments(options);
		for (final Map.Entry<String, List<Object>> e : map.entrySet()) {
			if ("paths".equals(e.getKey())) {
					
				final String[] value = convertList(context, "paths", String[].class, e.getValue());  
				argsForContext.setPaths(value);
			} else if ("files".equals(e.getKey())) {
					
				final java.io.File[] value = convertList(context, "files", java.io.File[].class, e.getValue());  
				argsForContext.setFiles(value);
			} else if ("args".equals(e.getKey())) {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in wc command args: " + Arrays.toString(args));
			} else if ("options".equals(e.getKey())) {
					
				final WcOptions value = convertList(context, "options", WcOptions.class, e.getValue());  
				options.setAll(value);
			} else {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in wc command args: " + Arrays.toString(args));
			}
		}
		return argsForContext;
	}
	
	/**
	 * Returns the {@code <paths>} operand value: Pathnames of the input files; wildcards * and ? are supported;
			relative paths are resolved on the basis of the current working 
			directory.
	 * 
	 * @return the {@code <paths>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public String[] getPaths() {
		if (pathsIsSet) {
			return paths;
		}
		throw new IllegalStateException("operand has not been set: " + paths);
	}

	/**
	 * Returns true if the {@code <paths>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setPaths(String[])} method.
	 * 
	 * @return	true if the setter for the {@code <paths>} operand has 
	 * 			been called at least once
	 */
	public boolean isPathsSet() {
		return pathsIsSet;
	}
	/**
	 * Sets {@code <paths>}: Pathnames of the input files; wildcards * and ? are supported;
			relative paths are resolved on the basis of the current working 
			directory.
	 * 
	 * @param paths the value for the {@code <paths>} operand
	 */
	public void setPaths(String[] paths) {
		this.paths = paths;
		this.pathsIsSet = true;
	}
	/**
	 * Returns the {@code <files>} operand value: The input files; relative paths are not resolved (use the string 
			paths argument to enable relative path resolving based on the
			current working directory).
	 * 
	 * @return the {@code <files>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public java.io.File[] getFiles() {
		if (filesIsSet) {
			return files;
		}
		throw new IllegalStateException("operand has not been set: " + files);
	}

	/**
	 * Returns true if the {@code <files>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setFiles(java.io.File[])} method.
	 * 
	 * @return	true if the setter for the {@code <files>} operand has 
	 * 			been called at least once
	 */
	public boolean isFilesSet() {
		return filesIsSet;
	}
	/**
	 * Sets {@code <files>}: The input files; relative paths are not resolved (use the string 
			paths argument to enable relative path resolving based on the
			current working directory).
	 * 
	 * @param files the value for the {@code <files>} operand
	 */
	public void setFiles(java.io.File... files) {
		this.files = files;
		this.filesIsSet = true;
	}
	/**
	 * Returns the {@code <args>} operand value: String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--paths" operand have to be prefixed with the operand 
			name.
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
	 * Returns true if the {@code --}{@link WcOption#lines lines} option
	 * is set. The option is also known as {@code -}l option.
	 * <p>
	 * Description: Executes a count of lines and writes this count to the output.
	 * 
	 * @return true if the {@code --lines} or {@code -l} option is set
	 */
	public boolean isLines() {
		return getOptions().isSet(WcOption.lines);
	}
	/**
	 * Returns true if the {@code --}{@link WcOption#words words} option
	 * is set. The option is also known as {@code -}w option.
	 * <p>
	 * Description: Executes a count of words and writes this count to the output. A
			word is a non-zero-length string of characters delimited by white
			space as defined by {@link Character#isWhitespace(char)}.
	 * 
	 * @return true if the {@code --words} or {@code -w} option is set
	 */
	public boolean isWords() {
		return getOptions().isSet(WcOption.words);
	}
	/**
	 * Returns true if the {@code --}{@link WcOption#chars chars} option
	 * is set. The option is also known as {@code -}m option.
	 * <p>
	 * Description: Executes a count of chars and writes this count to the output.
	 * 
	 * @return true if the {@code --chars} or {@code -m} option is set
	 */
	public boolean isChars() {
		return getOptions().isSet(WcOption.chars);
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
			// operand: <paths>
			if (pathsIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("paths");
				sb.append(" ").append(toString(getPaths()));
			}
			// operand: <files>
			if (filesIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("files");
				sb.append(" ").append(toString(getFiles()));
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
