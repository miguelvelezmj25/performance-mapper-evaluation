package org.unix4j.unix.sed;

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

import org.unix4j.unix.Sed;

/**
 * Arguments and options for the {@link Sed sed} command.
 */
public final class SedArguments implements Arguments<SedArguments> {
	
	private final SedOptions options;

	
	// operand: <script>
	private String script;
	private boolean scriptIsSet = false;
	
	// operand: <regexp>
	private String regexp;
	private boolean regexpIsSet = false;
	
	// operand: <string1>
	private String string1;
	private boolean string1IsSet = false;
	
	// operand: <replacement>
	private String replacement;
	private boolean replacementIsSet = false;
	
	// operand: <string2>
	private String string2;
	private boolean string2IsSet = false;
	
	// operand: <occurrence>
	private int[] occurrence;
	private boolean occurrenceIsSet = false;
	
	// operand: <args>
	private String[] args;
	private boolean argsIsSet = false;
	
	/**
	 * Constructor to use if no options are specified.
	 */
	public SedArguments() {
		this.options = SedOptions.EMPTY;
	}

	/**
	 * Constructor with option set containing the selected command options.
	 * 
	 * @param options the selected options
	 * @throws NullPointerException if the argument is null
	 */
	public SedArguments(SedOptions options) {
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
	public SedOptions getOptions() {
		return options;
	}

	/**
	 * Constructor string arguments encoding options and arguments, possibly
	 * also containing variable expressions. 
	 * 
	 * @param args string arguments for the command
	 * @throws NullPointerException if args is null
	 */
	public SedArguments(String... args) {
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
				" in command: sed " + this);
	}
	private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
		final ValueConverter<V> converter = context.getValueConverterFor(operandType);
		final V convertedValue;
		if (converter != null) {
			convertedValue = converter.convert(value);
		} else {
			if (SedOptions.class.equals(operandType)) {
				convertedValue = operandType.cast(SedOptions.CONVERTER.convert(value));
			} else {
				convertedValue = null;
			}
		}
		if (convertedValue != null) {
			return convertedValue;
		}
		throw new IllegalArgumentException("cannot convert --" + operandName + 
				" value '" + value + "' into the type " + operandType.getName() + 
				" for sed command");
	}
	
	@Override
	public SedArguments getForContext(ExecutionContext context) {
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
		final List<String> defaultOperands = Arrays.asList("script");
		final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
		final SedOptions.Default options = new SedOptions.Default();
		final SedArguments argsForContext = new SedArguments(options);
		for (final Map.Entry<String, List<Object>> e : map.entrySet()) {
			if ("script".equals(e.getKey())) {
					
				final String value = convertList(context, "script", String.class, e.getValue());  
				argsForContext.setScript(value);
			} else if ("regexp".equals(e.getKey())) {
					
				final String value = convertList(context, "regexp", String.class, e.getValue());  
				argsForContext.setRegexp(value);
			} else if ("string1".equals(e.getKey())) {
					
				final String value = convertList(context, "string1", String.class, e.getValue());  
				argsForContext.setString1(value);
			} else if ("replacement".equals(e.getKey())) {
					
				final String value = convertList(context, "replacement", String.class, e.getValue());  
				argsForContext.setReplacement(value);
			} else if ("string2".equals(e.getKey())) {
					
				final String value = convertList(context, "string2", String.class, e.getValue());  
				argsForContext.setString2(value);
			} else if ("occurrence".equals(e.getKey())) {
					
				final int[] value = convertList(context, "occurrence", int[].class, e.getValue());  
				argsForContext.setOccurrence(value);
			} else if ("args".equals(e.getKey())) {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in sed command args: " + Arrays.toString(args));
			} else if ("options".equals(e.getKey())) {
					
				final SedOptions value = convertList(context, "options", SedOptions.class, e.getValue());  
				options.setAll(value);
			} else {
				throw new IllegalStateException("invalid operand '" + e.getKey() + "' in sed command args: " + Arrays.toString(args));
			}
		}
		return argsForContext;
	}
	
	/**
	 * Returns the {@code <script>} operand value (variables are NOT resolved): Sed script as one string, such as "s/original/replacement/g".
	 * 
	 * @return the {@code <script>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getScript(ExecutionContext)
	 */
	public String getScript() {
		if (scriptIsSet) {
			return script;
		}
		throw new IllegalStateException("operand has not been set: " + script);
	}
	/**
	 * Returns the {@code <script>} (variables are resolved): Sed script as one string, such as "s/original/replacement/g".
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <script>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getScript()
	 */
	public String getScript(ExecutionContext context) {
		final String value = getScript();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "script", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <script>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setScript(String)} method.
	 * 
	 * @return	true if the setter for the {@code <script>} operand has 
	 * 			been called at least once
	 */
	public boolean isScriptSet() {
		return scriptIsSet;
	}
	/**
	 * Sets {@code <script>}: Sed script as one string, such as "s/original/replacement/g".
	 * 
	 * @param script the value for the {@code <script>} operand
	 */
	public void setScript(String script) {
		this.script = script;
		this.scriptIsSet = true;
	}
	/**
	 * Returns the {@code <regexp>} operand value (variables are NOT resolved): Regular expression matched against a line.
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
	 * Returns the {@code <regexp>} (variables are resolved): Regular expression matched against a line.
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
	 * Sets {@code <regexp>}: Regular expression matched against a line.
	 * 
	 * @param regexp the value for the {@code <regexp>} operand
	 */
	public void setRegexp(String regexp) {
		this.regexp = regexp;
		this.regexpIsSet = true;
	}
	/**
	 * Returns the {@code <string1>} operand value (variables are NOT resolved): Regular expression matched against a line for all commands except 
			for command y where string1 contains the source characters for the 
			translation.
	 * 
	 * @return the {@code <string1>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getString1(ExecutionContext)
	 */
	public String getString1() {
		if (string1IsSet) {
			return string1;
		}
		throw new IllegalStateException("operand has not been set: " + string1);
	}
	/**
	 * Returns the {@code <string1>} (variables are resolved): Regular expression matched against a line for all commands except 
			for command y where string1 contains the source characters for the 
			translation.
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <string1>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getString1()
	 */
	public String getString1(ExecutionContext context) {
		final String value = getString1();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "string1", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <string1>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setString1(String)} method.
	 * 
	 * @return	true if the setter for the {@code <string1>} operand has 
	 * 			been called at least once
	 */
	public boolean isString1Set() {
		return string1IsSet;
	}
	/**
	 * Sets {@code <string1>}: Regular expression matched against a line for all commands except 
			for command y where string1 contains the source characters for the 
			translation.
	 * 
	 * @param string1 the value for the {@code <string1>} operand
	 */
	public void setString1(String string1) {
		this.string1 = string1;
		this.string1IsSet = true;
	}
	/**
	 * Returns the {@code <replacement>} operand value (variables are NOT resolved): Replacement string for substitute command. An ampersand ('&') 
			appearing in the replacement string is replaced by the string 
			matching the regular expression. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression. The special meaning of '&' and "\n" in 
			this context can be suppressed by preceding it by a backslash.
	 * 
	 * @return the {@code <replacement>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getReplacement(ExecutionContext)
	 */
	public String getReplacement() {
		if (replacementIsSet) {
			return replacement;
		}
		throw new IllegalStateException("operand has not been set: " + replacement);
	}
	/**
	 * Returns the {@code <replacement>} (variables are resolved): Replacement string for substitute command. An ampersand ('&') 
			appearing in the replacement string is replaced by the string 
			matching the regular expression. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression. The special meaning of '&' and "\n" in 
			this context can be suppressed by preceding it by a backslash.
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <replacement>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getReplacement()
	 */
	public String getReplacement(ExecutionContext context) {
		final String value = getReplacement();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "replacement", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <replacement>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setReplacement(String)} method.
	 * 
	 * @return	true if the setter for the {@code <replacement>} operand has 
	 * 			been called at least once
	 */
	public boolean isReplacementSet() {
		return replacementIsSet;
	}
	/**
	 * Sets {@code <replacement>}: Replacement string for substitute command. An ampersand ('&') 
			appearing in the replacement string is replaced by the string 
			matching the regular expression. The characters "\n", where n is a 
			digit, are replaced by the text matched by the corresponding 
			backreference expression. The special meaning of '&' and "\n" in 
			this context can be suppressed by preceding it by a backslash.
	 * 
	 * @param replacement the value for the {@code <replacement>} operand
	 */
	public void setReplacement(String replacement) {
		this.replacement = replacement;
		this.replacementIsSet = true;
	}
	/**
	 * Returns the {@code <string2>} operand value (variables are NOT resolved): Replacement string for substitute command s; appended, inserted or
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
	 * 
	 * @return the {@code <string2>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getString2(ExecutionContext)
	 */
	public String getString2() {
		if (string2IsSet) {
			return string2;
		}
		throw new IllegalStateException("operand has not been set: " + string2);
	}
	/**
	 * Returns the {@code <string2>} (variables are resolved): Replacement string for substitute command s; appended, inserted or
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
	 * 
	 * @param context the execution context used to resolve variables
	 * @return the {@code <string2>} operand value after resolving variables
	 * @throws IllegalStateException if this operand has never been set
	 * @see #getString2()
	 */
	public String getString2(ExecutionContext context) {
		final String value = getString2();
		if (Arg.isVariable(value)) {
			final Object resolved = resolveVariable(context.getVariableContext(), value);
			final String converted = convert(context, "string2", String.class, resolved);
			return converted;
		}
		return value;
	}

	/**
	 * Returns true if the {@code <string2>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setString2(String)} method.
	 * 
	 * @return	true if the setter for the {@code <string2>} operand has 
	 * 			been called at least once
	 */
	public boolean isString2Set() {
		return string2IsSet;
	}
	/**
	 * Sets {@code <string2>}: Replacement string for substitute command s; appended, inserted or
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
	 * 
	 * @param string2 the value for the {@code <string2>} operand
	 */
	public void setString2(String string2) {
		this.string2 = string2;
		this.string2IsSet = true;
	}
	/**
	 * Returns the {@code <occurrence>} operand value: Substitute for the given occurrences only of the regexp found within 
			the matched string; the occurrence indices are one-based. If empty 
			or omitted, all occurrences are substituted.
			<p>
			(This operand only applies to the substitute command and is ignored
			by all other commands).
	 * 
	 * @return the {@code <occurrence>} operand value (variables are not resolved)
	 * @throws IllegalStateException if this operand has never been set
	 * 
	 */
	public int[] getOccurrence() {
		if (occurrenceIsSet) {
			return occurrence;
		}
		throw new IllegalStateException("operand has not been set: " + occurrence);
	}

	/**
	 * Returns true if the {@code <occurrence>} operand has been set. 
	 * <p>
	 * Note that this method returns true even if {@code null} was passed to the
	 * {@link #setOccurrence(int[])} method.
	 * 
	 * @return	true if the setter for the {@code <occurrence>} operand has 
	 * 			been called at least once
	 */
	public boolean isOccurrenceSet() {
		return occurrenceIsSet;
	}
	/**
	 * Sets {@code <occurrence>}: Substitute for the given occurrences only of the regexp found within 
			the matched string; the occurrence indices are one-based. If empty 
			or omitted, all occurrences are substituted.
			<p>
			(This operand only applies to the substitute command and is ignored
			by all other commands).
	 * 
	 * @param occurrence the value for the {@code <occurrence>} operand
	 */
	public void setOccurrence(int... occurrence) {
		this.occurrence = occurrence;
		this.occurrenceIsSet = true;
	}
	/**
	 * Returns the {@code <args>} operand value: String arguments defining the options and operands for the command. 
			Options can be specified by acronym (with a leading dash "-") or by 
			long name (with two leading dashes "--"). Operands other than the
			default "--script" operand have to be prefixed with the operand name
			(e.g. "--occurrence" for subsequent occurrence indices).
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
	 * Returns true if the {@code --}{@link SedOption#quiet quiet} option
	 * is set. The option is also known as {@code -}n option.
	 * <p>
	 * Description: Suppress the default output (in which each line, after it is 
			examined for editing, is written to standard output). Only lines 
			explicitly selected for output are written.
	 * 
	 * @return true if the {@code --quiet} or {@code -n} option is set
	 */
	public boolean isQuiet() {
		return getOptions().isSet(SedOption.quiet);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#global global} option
	 * is set. The option is also known as {@code -}g option.
	 * <p>
	 * Description: Globally substitute for all non-overlapping instances of the regexp 
			rather than just the first one. 
			<p>
			(This option is ignored if the occurrence operand is specified).
	 * 
	 * @return true if the {@code --global} or {@code -g} option is set
	 */
	public boolean isGlobal() {
		return getOptions().isSet(SedOption.global);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#print print} option
	 * is set. The option is also known as {@code -}p option.
	 * <p>
	 * Description: Write the matched line to standard output.
	 * 
	 * @return true if the {@code --print} or {@code -p} option is set
	 */
	public boolean isPrint() {
		return getOptions().isSet(SedOption.print);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#lineNumber lineNumber} option
	 * is set. The option is also known as {@code -}l option.
	 * <p>
	 * Description: Writes the current line number on a separate line to the standard 
			output.
	 * 
	 * @return true if the {@code --lineNumber} or {@code -l} option is set
	 */
	public boolean isLineNumber() {
		return getOptions().isSet(SedOption.lineNumber);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#ignoreCase ignoreCase} option
	 * is set. The option is also known as {@code -}I option.
	 * <p>
	 * Description: Use case insensitive pattern matching.
	 * 
	 * @return true if the {@code --ignoreCase} or {@code -I} option is set
	 */
	public boolean isIgnoreCase() {
		return getOptions().isSet(SedOption.ignoreCase);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#substitute substitute} option
	 * is set. The option is also known as {@code -}s option.
	 * <p>
	 * Description: Substitutes the replacement string for instances of the regexp in 
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
	 * 
	 * @return true if the {@code --substitute} or {@code -s} option is set
	 */
	public boolean isSubstitute() {
		return getOptions().isSet(SedOption.substitute);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#append append} option
	 * is set. The option is also known as {@code -}a option.
	 * <p>
	 * Description: Append string2 as a separate line after the matched line.
	 * 
	 * @return true if the {@code --append} or {@code -a} option is set
	 */
	public boolean isAppend() {
		return getOptions().isSet(SedOption.append);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#insert insert} option
	 * is set. The option is also known as {@code -}i option.
	 * <p>
	 * Description: Insert string2 as a separate line before the matched line.
	 * 
	 * @return true if the {@code --insert} or {@code -i} option is set
	 */
	public boolean isInsert() {
		return getOptions().isSet(SedOption.insert);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#change change} option
	 * is set. The option is also known as {@code -}c option.
	 * <p>
	 * Description: Write string2 as a separate line instead of the matched line.
	 * 
	 * @return true if the {@code --change} or {@code -c} option is set
	 */
	public boolean isChange() {
		return getOptions().isSet(SedOption.change);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#delete delete} option
	 * is set. The option is also known as {@code -}d option.
	 * <p>
	 * Description: Delete the matched line.
	 * 
	 * @return true if the {@code --delete} or {@code -d} option is set
	 */
	public boolean isDelete() {
		return getOptions().isSet(SedOption.delete);
	}
	/**
	 * Returns true if the {@code --}{@link SedOption#translate translate} option
	 * is set. The option is also known as {@code -}y option.
	 * <p>
	 * Description: Replace all occurrences of characters in string1 with the 
			corresponding characters in string2. If the number of characters in 
			the two strings are not equal, or if any of the characters in 
			string1 appear more than once, the results are undefined.
	 * 
	 * @return true if the {@code --translate} or {@code -y} option is set
	 */
	public boolean isTranslate() {
		return getOptions().isSet(SedOption.translate);
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
			// operand: <script>
			if (scriptIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("script");
				sb.append(" ").append(toString(getScript()));
			}
			// operand: <regexp>
			if (regexpIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("regexp");
				sb.append(" ").append(toString(getRegexp()));
			}
			// operand: <string1>
			if (string1IsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("string1");
				sb.append(" ").append(toString(getString1()));
			}
			// operand: <replacement>
			if (replacementIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("replacement");
				sb.append(" ").append(toString(getReplacement()));
			}
			// operand: <string2>
			if (string2IsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("string2");
				sb.append(" ").append(toString(getString2()));
			}
			// operand: <occurrence>
			if (occurrenceIsSet) {
				if (sb.length() > 0) sb.append(' ');
				sb.append("--").append("occurrence");
				sb.append(" ").append(toString(getOccurrence()));
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
