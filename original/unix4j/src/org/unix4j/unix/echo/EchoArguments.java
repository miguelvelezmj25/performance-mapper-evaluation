package org.unix4j.unix.echo;

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

import org.unix4j.unix.Echo;

/**
 * Arguments and options for the {@link Echo echo} command.
 */
public final class EchoArguments implements Arguments<EchoArguments> {
	
	private final EchoOptions options;

	
	// operand: <string>
	private String string;
	private boolean stringIsSet = false;
	
	// operand: <strings>
	private String[] strings;
	private boolean stringsIsSet = false;
	
	// operand: <args>
	private String[] args;
	private boolean argsIsSet = false;
	
	/**
	 * Constructor to use if no options are specified.
	 */
	public EchoArguments() {
		this.options = EchoOptions.EMPTY;
	}

	/**
	 * Constructor with option set containing the selected command options.
	 * 
	 * @param options the selected options
	 * @throws NullPointerException if the argument is null
	 */
	public EchoArguments(EchoOptions options) {
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
	public EchoOptions getOptions() {
		return options;
	}

	/**
	 * Constructor string arguments encoding options and arguments, possibly
	 * also containing variable expressions. 
	 * 
	 * @param args string arguments for the command
	 * @throws NullPointerException if args is null
	 */
	public EchoArguments(String... args) {
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
				" in command: echo " + this);
	}
	private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
		final ValueConverter<V> converter = context.getValueConverterFor(operandType);
		final V convertedValue;
		if (converter != null) {
			convertedValue = converter.convert(value);
		} else {
			if (EchoOptions.class.equals(operandType)) {
				convertedValue = operandType.cast(EchoOptions.CONVERTER.convert(value));
			} else {
				convertedValue = null;
			}
		}
		if (convertedValue != null) {
			return convertedValue;
		}
		throw new IllegalArgumentException("cannot convert --" + operandName + 
				" value '" + value + "' into the type " + operandType.getName() + 
				" for echo command");
	}
	
	@Override
	public EchoArguments getForContext(ExecutionContext context) {
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
		final List<String> defaultOperands = Arrays.asList("strings");
		final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
		final EchoOptions.Default options = new EchoOptions.Default();
		final EchoArguments argsForContext = new EchoArguments(options);
		for (final Map.Entry<String, List<Object>> e : map.entrySet()) {
			if ("string".equals(e.getKey())) {
					
				final String value = convertList(context, "string", String.class, e.getValue());  
				argsForContext.setString(value);
			} else if ("strings".equals(e.getKey())) {
					
				final String[] value = convertList(context, "strings", String[].class, e.getValue());  
				argsForContext.setStrings(value);
			} else if ("args".equals(e.getKey())) {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in echo command args: " + Arrays.toString(args));
			} else if ("options".equals(e.getKey())) {
					
				final EchoOptions value = convertList(context, "options", EchoOptions.class, e.getValue());  
				options.setAll(value);
			} else {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in echo command args: " + Arrays.toString(args));
			}
		}
		return argsForContext;
	}
	
	/**
	 * Returns the {@code <string>} operand value (variables are NOT resolved): A string to be written to standard output.
	 * 
	 * @return the {@code <string>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getString(ExecutionContext)
	 */
	public String getString() {
		if (stringIsSet) {
			return string;
		}
		throw new IllegalStateException("operand has not been set: " + string);
	}
	/**
	 * Returns the {@code <string>} (variables are resolved): A string to be written to standard output.
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <string>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getString()
	 */
	public String getString(ExecutionContext context) {
		final String value = getString();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "string", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <string>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setString(String)} method.
	 * 
	 * @return	true if the setter for the {@code <string>} operand has 
	 * 			been called at least once
	 */
	public boolean isStringSet() {
		return stringIsSet;
	}
	/**
	 * Sets {@code <string>}: A string to be written to standard output.
	 * 
	 * @param string the value for the {@code <string>} operand
	 */
	public void setString(String string) {
		this.string = string;
		this.stringIsSet = true;
	}
	/**
	 * Returns the {@code <strings>} operand value: Strings to be written to standard output, separated by single blank 
			characters.
	 * 
	 * @return the {@code <strings>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public String[] getStrings() {
		if (stringsIsSet) {
			return strings;
		}
		throw new IllegalStateException("operand has not been set: " + strings);
	}

	/**
	 * Returns true if the {@code <strings>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setStrings(String[])} method.
	 * 
	 * @return	true if the setter for the {@code <strings>} operand has 
	 * 			been called at least once
	 */
	public boolean isStringsSet() {
		return stringsIsSet;
	}
	/**
	 * Sets {@code <strings>}: Strings to be written to standard output, separated by single blank 
			characters.
	 * 
	 * @param strings the value for the {@code <strings>} operand
	 */
	public void setStrings(String... strings) {
		this.strings = strings;
		this.stringsIsSet = true;
	}
	/**
	 * Returns the {@code <args>} operand value: String arguments defining the options for the command and the 
			strings to be written to the output. Options can be specified by 
			acronym (with a leading dash "-") or by long name (with two leading 
			dashes "--").
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
	 * Returns true if the {@code --}{@link EchoOption#noNewline noNewline} option
	 * is set. The option is also known as {@code -}n option.
	 * <p>
	 * Description: Do not print the trailing newline character(s).
	 * 
	 * @return true if the {@code --noNewline} or {@code -n} option is set
	 */
	public boolean isNoNewline() {
		return getOptions().isSet(EchoOption.noNewline);
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
			// operand: <string>
			if (stringIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("string");
				sb.append(" ").append(toString(getString()));
			}
			// operand: <strings>
			if (stringsIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("strings");
				sb.append(" ").append(toString(getStrings()));
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
