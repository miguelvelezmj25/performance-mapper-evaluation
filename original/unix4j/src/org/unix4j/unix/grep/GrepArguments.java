package org.unix4j.unix.grep;

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

import org.unix4j.unix.Grep;

/**
 * Arguments and options for the {@link Grep grep} command.
 */
public final class GrepArguments implements Arguments<GrepArguments> {
	
	private final GrepOptions options;

	
	// operand: <regexp>
	private String regexp;
	private boolean regexpIsSet = false;
	
	// operand: <pattern>
	private java.util.regex.Pattern pattern;
	private boolean patternIsSet = false;
	
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
	public GrepArguments() {
		this.options = GrepOptions.EMPTY;
	}

	/**
	 * Constructor with option set containing the selected command options.
	 * 
	 * @param options the selected options
	 * @throws NullPointerException if the argument is null
	 */
	public GrepArguments(GrepOptions options) {
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
	public GrepOptions getOptions() {
		return options;
	}

	/**
	 * Constructor string arguments encoding options and arguments, possibly
	 * also containing variable expressions. 
	 * 
	 * @param args string arguments for the command
	 * @throws NullPointerException if args is null
	 */
	public GrepArguments(String... args) {
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
				" in command: grep " + this);
	}
	private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
		final ValueConverter<V> converter = context.getValueConverterFor(operandType);
		final V convertedValue;
		if (converter != null) {
			convertedValue = converter.convert(value);
		} else {
			if (GrepOptions.class.equals(operandType)) {
				convertedValue = operandType.cast(GrepOptions.CONVERTER.convert(value));
			} else {
				convertedValue = null;
			}
		}
		if (convertedValue != null) {
			return convertedValue;
		}
		throw new IllegalArgumentException("cannot convert --" + operandName + 
				" value '" + value + "' into the type " + operandType.getName() + 
				" for grep command");
	}
	
	@Override
	public GrepArguments getForContext(ExecutionContext context) {
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
		final List<String> defaultOperands = Arrays.asList("regexp", "paths");
		final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
		final GrepOptions.Default options = new GrepOptions.Default();
		final GrepArguments argsForContext = new GrepArguments(options);
		for (final Map.Entry<String, List<Object>> e : map.entrySet()) {
			if ("regexp".equals(e.getKey())) {
					
				final String value = convertList(context, "regexp", String.class, e.getValue());  
				argsForContext.setRegexp(value);
			} else if ("pattern".equals(e.getKey())) {
					
				final java.util.regex.Pattern value = convertList(context, "pattern", java.util.regex.Pattern.class, e.getValue());  
				argsForContext.setPattern(value);
			} else if ("paths".equals(e.getKey())) {
					
				final String[] value = convertList(context, "paths", String[].class, e.getValue());  
				argsForContext.setPaths(value);
			} else if ("files".equals(e.getKey())) {
					
				final java.io.File[] value = convertList(context, "files", java.io.File[].class, e.getValue());  
				argsForContext.setFiles(value);
			} else if ("args".equals(e.getKey())) {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in grep command args: " + Arrays.toString(args));
			} else if ("options".equals(e.getKey())) {
					
				final GrepOptions value = convertList(context, "options", GrepOptions.class, e.getValue());  
				options.setAll(value);
			} else {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in grep command args: " + Arrays.toString(args));
			}
		}
		return argsForContext;
	}
	
	/**
	 * Returns the {@code <regexp>} operand value (variables are NOT resolved): Lines will be printed which match the given regular expression. The 
			{@code regexp} string is surrounded with ".*" on both sides unless
			the {@code --wholeLine} option is specified. If the 
			{@code --fixedStrings} option is used, plain string comparison is
			used instead of regular expression matching.
	 * 
	 * @return the {@code <regexp>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getRegexp(ExecutionContext)
	 */
	public String getRegexp() {
		if (regexpIsSet) {
			return regexp;
		}
		throw new IllegalStateException("operand has not been set: " + regexp);
	}
	/**
	 * Returns the {@code <regexp>} (variables are resolved): Lines will be printed which match the given regular expression. The 
			{@code regexp} string is surrounded with ".*" on both sides unless
			the {@code --wholeLine} option is specified. If the 
			{@code --fixedStrings} option is used, plain string comparison is
			used instead of regular expression matching.
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <regexp>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getRegexp()
	 */
	public String getRegexp(ExecutionContext context) {
		final String value = getRegexp();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "regexp", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <regexp>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setRegexp(String)} method.
	 * 
	 * @return	true if the setter for the {@code <regexp>} operand has 
	 * 			been called at least once
	 */
	public boolean isRegexpSet() {
		return regexpIsSet;
	}
	/**
	 * Sets {@code <regexp>}: Lines will be printed which match the given regular expression. The 
			{@code regexp} string is surrounded with ".*" on both sides unless
			the {@code --wholeLine} option is specified. If the 
			{@code --fixedStrings} option is used, plain string comparison is
			used instead of regular expression matching.
	 * 
	 * @param regexp the value for the {@code <regexp>} operand
	 */
	public void setRegexp(String regexp) {
		this.regexp = regexp;
		this.regexpIsSet = true;
	}
	/**
	 * Returns the {@code <pattern>} operand value: Lines will be printed which match the given pattern.
	 * 
	 * @return the {@code <pattern>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public java.util.regex.Pattern getPattern() {
		if (patternIsSet) {
			return pattern;
		}
		throw new IllegalStateException("operand has not been set: " + pattern);
	}

	/**
	 * Returns true if the {@code <pattern>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setPattern(java.util.regex.Pattern)} method.
	 * 
	 * @return	true if the setter for the {@code <pattern>} operand has 
	 * 			been called at least once
	 */
	public boolean isPatternSet() {
		return patternIsSet;
	}
	/**
	 * Sets {@code <pattern>}: Lines will be printed which match the given pattern.
	 * 
	 * @param pattern the value for the {@code <pattern>} operand
	 */
	public void setPattern(java.util.regex.Pattern pattern) {
		this.pattern = pattern;
		this.patternIsSet = true;
	}
	/**
	 * Returns the {@code <paths>} operand value: Pathnames of the input files to be searched for the pattern;
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
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
	 * Sets {@code <paths>}: Pathnames of the input files to be searched for the pattern;
			wildcards * and ? are supported; relative paths are resolved on the
            basis of the current working directory.
	 * 
	 * @param paths the value for the {@code <paths>} operand
	 */
	public void setPaths(String... paths) {
		this.paths = paths;
		this.pathsIsSet = true;
	}
	/**
	 * Returns the {@code <files>} operand value: The input files to be searched for the pattern; relative paths are 
			not resolved (use the string paths argument to enable relative path 
			resolving based on the current working directory).
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
	 * Sets {@code <files>}: The input files to be searched for the pattern; relative paths are 
			not resolved (use the string paths argument to enable relative path 
			resolving based on the current working directory).
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
			default "--pattern" and "--paths" operands have to be prefixed with
			the operand name (e.g. "--files" for subsequent file operand values).
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
	 * Returns true if the {@code --}{@link GrepOption#ignoreCase ignoreCase} option
	 * is set. The option is also known as {@code -}i option.
	 * <p>
	 * Description: Match lines ignoring the case when comparing the strings, also known
			from Unix with its acronym 'i'.
	 * 
	 * @return true if the {@code --ignoreCase} or {@code -i} option is set
	 */
	public boolean isIgnoreCase() {
		return getOptions().isSet(GrepOption.ignoreCase);
	}
	/**
	 * Returns true if the {@code --}{@link GrepOption#invertMatch invertMatch} option
	 * is set. The option is also known as {@code -}v option.
	 * <p>
	 * Description: Invert the match result, that is, a non-matching line is written to
			the output and a matching line is not. This option is also known 
			from Unix with its acronym 'v'.
	 * 
	 * @return true if the {@code --invertMatch} or {@code -v} option is set
	 */
	public boolean isInvertMatch() {
		return getOptions().isSet(GrepOption.invertMatch);
	}
	/**
	 * Returns true if the {@code --}{@link GrepOption#fixedStrings fixedStrings} option
	 * is set. The option is also known as {@code -}F option.
	 * <p>
	 * Description: Use fixed-strings matching instead of regular expressions. This is
			usually faster than the standard regexp version.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).
	 * 
	 * @return true if the {@code --fixedStrings} or {@code -F} option is set
	 */
	public boolean isFixedStrings() {
		return getOptions().isSet(GrepOption.fixedStrings);
	}
	/**
	 * Returns true if the {@code --}{@link GrepOption#lineNumber lineNumber} option
	 * is set. The option is also known as {@code -}n option.
	 * <p>
	 * Description: Prefix each line of output with the line number within its input
			file.
	 * 
	 * @return true if the {@code --lineNumber} or {@code -n} option is set
	 */
	public boolean isLineNumber() {
		return getOptions().isSet(GrepOption.lineNumber);
	}
	/**
	 * Returns true if the {@code --}{@link GrepOption#count count} option
	 * is set. The option is also known as {@code -}c option.
	 * <p>
	 * Description: Suppress normal output; instead print a count of matching lines for
			each input file. With the {@code -v}, {@code --invertMatch} option,
			count non-matching lines.
	 * 
	 * @return true if the {@code --count} or {@code -c} option is set
	 */
	public boolean isCount() {
		return getOptions().isSet(GrepOption.count);
	}
	/**
	 * Returns true if the {@code --}{@link GrepOption#matchingFiles matchingFiles} option
	 * is set. The option is also known as {@code -}l option.
	 * <p>
	 * Description: Suppress normal output; instead print the name of each input file
			from which output would normally have been printed. The scanning
			will stop on the first match.
	 * 
	 * @return true if the {@code --matchingFiles} or {@code -l} option is set
	 */
	public boolean isMatchingFiles() {
		return getOptions().isSet(GrepOption.matchingFiles);
	}
	/**
	 * Returns true if the {@code --}{@link GrepOption#wholeLine wholeLine} option
	 * is set. The option is also known as {@code -}x option.
	 * <p>
	 * Description: Select only those matches that exactly match the whole line
			excluding the terminating line ending.
			<p>
			(This option is ignored if a {@code pattern} operand is specified
			instead of the {@code regexp} string).
	 * 
	 * @return true if the {@code --wholeLine} or {@code -x} option is set
	 */
	public boolean isWholeLine() {
		return getOptions().isSet(GrepOption.wholeLine);
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
			// operand: <regexp>
			if (regexpIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("regexp");
				sb.append(" ").append(toString(getRegexp()));
			}
			// operand: <pattern>
			if (patternIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("pattern");
				sb.append(" ").append(toString(getPattern()));
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
