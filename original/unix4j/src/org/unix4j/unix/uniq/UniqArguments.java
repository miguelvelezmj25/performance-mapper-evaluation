package org.unix4j.unix.uniq;

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

import org.unix4j.unix.Uniq;

/**
 * Arguments and options for the {@link Uniq uniq} command.
 */
public final class UniqArguments implements Arguments<UniqArguments> {
	
	private final UniqOptions options;

	
	// operand: <file>
	private java.io.File file;
	private boolean fileIsSet = false;
	
	// operand: <path>
	private String path;
	private boolean pathIsSet = false;
	
	// operand: <args>
	private String[] args;
	private boolean argsIsSet = false;
	
	/**
	 * Constructor to use if no options are specified.
	 */
	public UniqArguments() {
		this.options = UniqOptions.EMPTY;
	}

	/**
	 * Constructor with option set containing the selected command options.
	 * 
	 * @param options the selected options
	 * @throws NullPointerException if the argument is null
	 */
	public UniqArguments(UniqOptions options) {
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
	public UniqOptions getOptions() {
		return options;
	}

	/**
	 * Constructor string arguments encoding options and arguments, possibly
	 * also containing variable expressions. 
	 * 
	 * @param args string arguments for the command
	 * @throws NullPointerException if args is null
	 */
	public UniqArguments(String... args) {
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
				" in command: uniq " + this);
	}
	private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
		final ValueConverter<V> converter = context.getValueConverterFor(operandType);
		final V convertedValue;
		if (converter != null) {
			convertedValue = converter.convert(value);
		} else {
			if (UniqOptions.class.equals(operandType)) {
				convertedValue = operandType.cast(UniqOptions.CONVERTER.convert(value));
			} else {
				convertedValue = null;
			}
		}
		if (convertedValue != null) {
			return convertedValue;
		}
		throw new IllegalArgumentException("cannot convert --" + operandName + 
				" value '" + value + "' into the type " + operandType.getName() + 
				" for uniq command");
	}
	
	@Override
	public UniqArguments getForContext(ExecutionContext context) {
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
		final List<String> defaultOperands = Arrays.asList("path");
		final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
		final UniqOptions.Default options = new UniqOptions.Default();
		final UniqArguments argsForContext = new UniqArguments(options);
		for (final Map.Entry<String, List<Object>> e : map.entrySet()) {
			if ("file".equals(e.getKey())) {
					
				final java.io.File value = convertList(context, "file", java.io.File.class, e.getValue());  
				argsForContext.setFile(value);
			} else if ("path".equals(e.getKey())) {
					
				final String value = convertList(context, "path", String.class, e.getValue());  
				argsForContext.setPath(value);
			} else if ("args".equals(e.getKey())) {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in uniq command args: " + Arrays.toString(args));
			} else if ("options".equals(e.getKey())) {
					
				final UniqOptions value = convertList(context, "options", UniqOptions.class, e.getValue());  
				options.setAll(value);
			} else {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in uniq command args: " + Arrays.toString(args));
			}
		}
		return argsForContext;
	}
	
	/**
	 * Returns the {@code <file>} operand value: The files or directories used as starting point for the listing; 
			relative paths are not resolved (use the string path argument to 
			enable relative path resolving based on the current working 
			directory).
	 * 
	 * @return the {@code <file>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public java.io.File getFile() {
		if (fileIsSet) {
			return file;
		}
		throw new IllegalStateException("operand has not been set: " + file);
	}

	/**
	 * Returns true if the {@code <file>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setFile(java.io.File)} method.
	 * 
	 * @return	true if the setter for the {@code <file>} operand has 
	 * 			been called at least once
	 */
	public boolean isFileSet() {
		return fileIsSet;
	}
	/**
	 * Sets {@code <file>}: The files or directories used as starting point for the listing; 
			relative paths are not resolved (use the string path argument to 
			enable relative path resolving based on the current working 
			directory).
	 * 
	 * @param file the value for the {@code <file>} operand
	 */
	public void setFile(java.io.File file) {
		this.file = file;
		this.fileIsSet = true;
	}
	/**
	 * Returns the {@code <path>} operand value (variables are NOT resolved): The files or directories used as starting point for the listing; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * 
	 * @return the {@code <path>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getPath(ExecutionContext)
	 */
	public String getPath() {
		if (pathIsSet) {
			return path;
		}
		throw new IllegalStateException("operand has not been set: " + path);
	}
	/**
	 * Returns the {@code <path>} (variables are resolved): The files or directories used as starting point for the listing; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <path>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getPath()
	 */
	public String getPath(ExecutionContext context) {
		final String value = getPath();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "path", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <path>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setPath(String)} method.
	 * 
	 * @return	true if the setter for the {@code <path>} operand has 
	 * 			been called at least once
	 */
	public boolean isPathSet() {
		return pathIsSet;
	}
	/**
	 * Sets {@code <path>}: The files or directories used as starting point for the listing; 
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * 
	 * @param path the value for the {@code <path>} operand
	 */
	public void setPath(String path) {
		this.path = path;
		this.pathIsSet = true;
	}
	/**
	 * Returns the {@code <args>} operand value: String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--path" operand have to be prefixed with the operand 
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
	 * Returns true if the {@code --}{@link UniqOption#count count} option
	 * is set. The option is also known as {@code -}c option.
	 * <p>
	 * Description: Precedes each output line with a count of the number of times the
			line occurred in the input.
	 * 
	 * @return true if the {@code --count} or {@code -c} option is set
	 */
	public boolean isCount() {
		return getOptions().isSet(UniqOption.count);
	}
	/**
	 * Returns true if the {@code --}{@link UniqOption#duplicatedOnly duplicatedOnly} option
	 * is set. The option is also known as {@code -}d option.
	 * <p>
	 * Description: Suppresses the writing of lines that are not repeated in the input.
	 * 
	 * @return true if the {@code --duplicatedOnly} or {@code -d} option is set
	 */
	public boolean isDuplicatedOnly() {
		return getOptions().isSet(UniqOption.duplicatedOnly);
	}
	/**
	 * Returns true if the {@code --}{@link UniqOption#uniqueOnly uniqueOnly} option
	 * is set. The option is also known as {@code -}u option.
	 * <p>
	 * Description: Suppresses the writing of lines that are repeated in the input.
	 * 
	 * @return true if the {@code --uniqueOnly} or {@code -u} option is set
	 */
	public boolean isUniqueOnly() {
		return getOptions().isSet(UniqOption.uniqueOnly);
	}
	/**
	 * Returns true if the {@code --}{@link UniqOption#global global} option
	 * is set. The option is also known as {@code -}g option.
	 * <p>
	 * Description: Suppresses repeated lines globally, that is, if lines are 
			non-adjacent. This option guarantees unique output lines even if the
			input lines are not sorted.
	 * 
	 * @return true if the {@code --global} or {@code -g} option is set
	 */
	public boolean isGlobal() {
		return getOptions().isSet(UniqOption.global);
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
			// operand: <file>
			if (fileIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("file");
				sb.append(" ").append(toString(getFile()));
			}
			// operand: <path>
			if (pathIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("path");
				sb.append(" ").append(toString(getPath()));
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
