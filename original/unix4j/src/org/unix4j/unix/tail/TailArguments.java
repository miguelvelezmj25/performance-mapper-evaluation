package org.unix4j.unix.tail;

import org.unix4j.command.Arguments;
import org.unix4j.context.ExecutionContext;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.unix.Tail;
import org.unix4j.util.ArgsUtil;
import org.unix4j.util.ArrayUtil;
import org.unix4j.variable.Arg;
import org.unix4j.variable.VariableContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Arguments and options for the {@link Tail tail} command.
 */
public final class TailArguments implements Arguments<TailArguments> {

    private final TailOptions options;


    // operand: <count>
    private long count;
    private boolean countIsSet = false;

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
    public TailArguments() {
        this.options = TailOptions.EMPTY;
    }

    /**
     * Constructor with option set containing the selected command options.
     *
     * @param options the selected options
     * @throws NullPointerException if the argument is null
     */
    public TailArguments(TailOptions options) {
        if(options == null) {
            throw new NullPointerException("options argument cannot be null");
        }
        this.options = options;
    }

    /**
     * Constructor string arguments encoding options and arguments, possibly
     * also containing variable expressions.
     *
     * @param args string arguments for the command
     * @throws NullPointerException if args is null
     */
    public TailArguments(String... args) {
        this();
        this.args = args;
        this.argsIsSet = true;
    }

    private static String toString(Object value) {
        if(value != null && value.getClass().isArray()) {
            return ArrayUtil.toString(value);
        }
        return String.valueOf(value);
    }

    /**
     * Returns the options set containing the selected command options. Returns
     * an empty options set if no option has been selected.
     *
     * @return set with the selected options
     */
    public TailOptions getOptions() {
        return options;
    }

    private Object[] resolveVariables(VariableContext context, String... unresolved) {
        final Object[] resolved = new Object[unresolved.length];
        for(int i = 0; i < resolved.length; i++) {
            final String expression = unresolved[i];
            if(Arg.isVariable(expression)) {
                resolved[i] = resolveVariable(context, expression);
            }
            else {
                resolved[i] = expression;
            }
        }
        return resolved;
    }

    private <V> V convertList(ExecutionContext context, String operandName, Class<V> operandType, List<Object> values) {
        if(values.size() == 1) {
            final Object value = values.get(0);
            return convert(context, operandName, operandType, value);
        }
        return convert(context, operandName, operandType, values);
    }

    private Object resolveVariable(VariableContext context, String variable) {
        final Object value = context.getValue(variable);
        if(value != null) {
            return value;
        }
        throw new IllegalArgumentException("cannot resolve variable " + variable +
                " in command: tail " + this);
    }

    private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
        final ValueConverter<V> converter = context.getValueConverterFor(operandType);
        final V convertedValue;
        if(converter != null) {
            convertedValue = converter.convert(value);
        }
        else {
            if(TailOptions.class.equals(operandType)) {
                convertedValue = operandType.cast(TailOptions.CONVERTER.convert(value));
            }
            else {
                convertedValue = null;
            }
        }
        if(convertedValue != null) {
            return convertedValue;
        }
        throw new IllegalArgumentException("cannot convert --" + operandName +
                " value '" + value + "' into the type " + operandType.getName() +
                " for tail command");
    }

    @Override
    public TailArguments getForContext(ExecutionContext context) {
        if(context == null) {
            throw new NullPointerException("context cannot be null");
        }
        if(!argsIsSet || args.length == 0) {
            //nothing to resolve
            return this;
        }

        //check if there is at least one variable
        boolean hasVariable = false;
        for(final String arg : args) {
            if(arg != null && arg.startsWith("$")) {
                hasVariable = true;
                break;
            }
        }
        //resolve variables
        final Object[] resolvedArgs = hasVariable ? resolveVariables(context.getVariableContext(), this.args) : this.args;

        //convert now
        final List<String> defaultOperands = Arrays.asList("paths");
        final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
        final TailOptions.Default options = new TailOptions.Default();
        final TailArguments argsForContext = new TailArguments(options);
        for(final Map.Entry<String, List<Object>> e : map.entrySet()) {
            if("count".equals(e.getKey())) {

                final long value = convertList(context, "count", long.class, e.getValue());
                argsForContext.setCount(value);
            }
            else if("paths".equals(e.getKey())) {

                final String[] value = convertList(context, "paths", String[].class, e.getValue());
                argsForContext.setPaths(value);
            }
            else if("files".equals(e.getKey())) {

                final java.io.File[] value = convertList(context, "files", java.io.File[].class, e.getValue());
                argsForContext.setFiles(value);
            }
            else if("args".equals(e.getKey())) {
                throw new IllegalStateException("invalid operand '" + e.getKey() + "' in tail command args: " + Arrays.toString(args));
            }
            else if("options".equals(e.getKey())) {

                final TailOptions value = convertList(context, "options", TailOptions.class, e.getValue());
                options.setAll(value);
            }
            else {
                throw new IllegalStateException("invalid operand '" + e.getKey() + "' in tail command args: " + Arrays.toString(args));
            }
        }
        return argsForContext;
    }

    /**
     * Returns the {@code <count>} operand value: The last {@code count} lines of each input file are
     * copied to standard output, starting from 1 (characters instead of
     * lines if the {@code -c} option is specified, and offset from start
     * instead of end with {@code -s} option). Must be a non-negative
     * integer or an exception is thrown. If {@code count} is greater than
     * the number number of lines (characters) in the input, the
     * application will not error and send the whole file to the output.
     *
     * @return the {@code <count>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public long getCount() {
        if(countIsSet) {
            return count;
        }
        throw new IllegalStateException("operand has not been set: " + count);
    }

    /**
     * Sets {@code <count>}: The last {@code count} lines of each input file are
     * copied to standard output, starting from 1 (characters instead of
     * lines if the {@code -c} option is specified, and offset from start
     * instead of end with {@code -s} option). Must be a non-negative
     * integer or an exception is thrown. If {@code count} is greater than
     * the number number of lines (characters) in the input, the
     * application will not error and send the whole file to the output.
     *
     * @param count the value for the {@code <count>} operand
     */
    public void setCount(long count) {
        this.count = count;
        this.countIsSet = true;
    }

    /**
     * Returns true if the {@code <count>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setCount(long)} method.
     *
     * @return true if the setter for the {@code <count>} operand has
     * been called at least once
     */
    public boolean isCountSet() {
        return countIsSet;
    }

    /**
     * Returns the {@code <paths>} operand value: Pathnames of the input files to be filtered; wildcards * and ? are
     * supported; relative paths are resolved on the basis of the current
     * working directory.
     *
     * @return the {@code <paths>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public String[] getPaths() {
        if(pathsIsSet) {
            return paths;
        }
        throw new IllegalStateException("operand has not been set: " + paths);
    }

    /**
     * Sets {@code <paths>}: Pathnames of the input files to be filtered; wildcards * and ? are
     * supported; relative paths are resolved on the basis of the current
     * working directory.
     *
     * @param paths the value for the {@code <paths>} operand
     */
    public void setPaths(String... paths) {
        this.paths = paths;
        this.pathsIsSet = true;
    }

    /**
     * Returns true if the {@code <paths>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setPaths(String[])} method.
     *
     * @return true if the setter for the {@code <paths>} operand has
     * been called at least once
     */
    public boolean isPathsSet() {
        return pathsIsSet;
    }

    /**
     * Returns the {@code <files>} operand value: The input files to be filtered; relative paths are not resolved (use
     * the string paths argument to enable relative path resolving based on
     * the current working directory).
     *
     * @return the {@code <files>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public java.io.File[] getFiles() {
        if(filesIsSet) {
            return files;
        }
        throw new IllegalStateException("operand has not been set: " + files);
    }

    /**
     * Sets {@code <files>}: The input files to be filtered; relative paths are not resolved (use
     * the string paths argument to enable relative path resolving based on
     * the current working directory).
     *
     * @param files the value for the {@code <files>} operand
     */
    public void setFiles(java.io.File... files) {
        this.files = files;
        this.filesIsSet = true;
    }

    /**
     * Returns true if the {@code <files>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setFiles(java.io.File[])} method.
     *
     * @return true if the setter for the {@code <files>} operand has
     * been called at least once
     */
    public boolean isFilesSet() {
        return filesIsSet;
    }

    /**
     * Returns the {@code <args>} operand value: String arguments defining the options and operands for the command.
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--paths" operand have to be prefixed with the operand
     * name (e.g. "--count" for a subsequent count operand value).
     *
     * @return the {@code <args>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public String[] getArgs() {
        if(argsIsSet) {
            return args;
        }
        throw new IllegalStateException("operand has not been set: " + args);
    }

    /**
     * Returns true if the {@code <args>} operand has been set.
     *
     * @return true if the setter for the {@code <args>} operand has
     * been called at least once
     */
    public boolean isArgsSet() {
        return argsIsSet;
    }

    /**
     * Returns true if the {@code --}{@link TailOption#chars chars} option
     * is set. The option is also known as {@code -}c option.
     * <p>
     * Description: The {@code count} argument is in units of characters instead of
     * lines. Starts from 1 and includes line ending characters.
     *
     * @return true if the {@code --chars} or {@code -c} option is set
     */
    public boolean isChars() {
        return getOptions().isSet(TailOption.chars);
    }

    /**
     * Returns true if the {@code --}{@link TailOption#suppressHeaders suppressHeaders} option
     * is set. The option is also known as {@code -}q option.
     * <p>
     * Description: Suppresses printing of headers when multiple files are being
     * examined.
     *
     * @return true if the {@code --suppressHeaders} or {@code -q} option is set
     */
    public boolean isSuppressHeaders() {
        return getOptions().isSet(TailOption.suppressHeaders);
    }

    /**
     * Returns true if the {@code --}{@link TailOption#countFromStart countFromStart} option
     * is set. The option is also known as {@code -}s option.
     * <p>
     * Description: The {@code count} argument is relative to the beginning of the file
     * instead of counting from the end of the file. For instance,
     * {@code tail -s 10} prints the lines starting from line 10;
     * {@code tail -s 1} prints the whole file.
     *
     * @return true if the {@code --countFromStart} or {@code -s} option is set
     */
    public boolean isCountFromStart() {
        return getOptions().isSet(TailOption.countFromStart);
    }

    @Override
    public String toString() {
        // ok, we have options or arguments or both
        final StringBuilder sb = new StringBuilder();

        if(argsIsSet) {
            for(String arg : args) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(arg);
            }
        }
        else {

            // first the options
            if(options.size() > 0) {
                sb.append(DefaultOptionSet.toString(options));
            }
            // operand: <count>
            if(countIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("count");
                sb.append(" ").append(toString(getCount()));
            }
            // operand: <paths>
            if(pathsIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("paths");
                sb.append(" ").append(toString(getPaths()));
            }
            // operand: <files>
            if(filesIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("files");
                sb.append(" ").append(toString(getFiles()));
            }
            // operand: <args>
            if(argsIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("args");
                sb.append(" ").append(toString(getArgs()));
            }
        }

        return sb.toString();
    }
}
