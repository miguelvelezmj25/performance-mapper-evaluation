package org.unix4j.unix.find;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import org.unix4j.command.Arguments;
import org.unix4j.context.ExecutionContext;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.unix.Find;
import org.unix4j.util.ArgsUtil;
import org.unix4j.util.ArrayUtil;
import org.unix4j.variable.Arg;
import org.unix4j.variable.VariableContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Arguments and options for the {@link Find find} command.
 */
public final class FindArguments implements Arguments<FindArguments> {

    private final FindOptions options;


    // operand: <path>
    private String path;
    private boolean pathIsSet = false;

    // operand: <name>
    private String name;
    private boolean nameIsSet = false;

    // operand: <size>
    private long size;
    private boolean sizeIsSet = false;

    // operand: <time>
    private java.util.Date time;
    private boolean timeIsSet = false;

    // operand: <args>
    private String[] args;
    private boolean argsIsSet = false;

    /**
     * Constructor to use if no options are specified.
     */
    public FindArguments() {
        this.options = FindOptions.EMPTY;
    }

    /**
     * Constructor with option set containing the selected command options.
     *
     * @param options the selected options
     * @throws NullPointerException if the argument is null
     */
    public FindArguments(FindOptions options) {
        if(Sink.getDecision(options == null)) {
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
    public FindArguments(String... args) {
        this();
        this.args = args;
        this.argsIsSet = true;
    }

    private static String toString(Object value) {
        if(Sink.getDecision(value != null && value.getClass().isArray())) {
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
    public FindOptions getOptions() {
        return options;
    }

    private Object[] resolveVariables(VariableContext context, String... unresolved) {
        final Object[] resolved = new Object[unresolved.length];
        for(int i = 0; i < resolved.length; i++) {
            final String expression = unresolved[i];
            if(Sink.getDecision(Arg.isVariable(expression))) {
                resolved[i] = resolveVariable(context, expression);
            }
            else {
                resolved[i] = expression;
            }
        }
        return resolved;
    }

    private <V> V convertList(ExecutionContext context, String operandName, Class<V> operandType, List<Object> values) {
        if(Sink.getDecision(values.size() == 1)) {
            final Object value = values.get(0);
            return convert(context, operandName, operandType, value);
        }
        return convert(context, operandName, operandType, values);
    }

    private Object resolveVariable(VariableContext context, String variable) {
        final Object value = context.getValue(variable);
        if(Sink.getDecision(value != null)) {
            return value;
        }
        throw new IllegalArgumentException("cannot resolve variable " + variable +
                " in command: find " + this);
    }

    private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
        final ValueConverter<V> converter = context.getValueConverterFor(operandType);
        final V convertedValue;
        if(Sink.getDecision(converter != null)) {
            convertedValue = converter.convert(value);
        }
        else {
            if(Sink.getDecision(FindOptions.class.equals(operandType))) {
                convertedValue = operandType.cast(FindOptions.CONVERTER.convert(value));
            }
            else {
                convertedValue = null;
            }
        }
        if(Sink.getDecision(convertedValue != null)) {
            return convertedValue;
        }
        throw new IllegalArgumentException("cannot convert --" + operandName +
                " value '" + value + "' into the type " + operandType.getName() +
                " for find command");
    }

    @Override
    public FindArguments getForContext(ExecutionContext context) {
        if(Sink.getDecision(context == null)) {
            throw new NullPointerException("context cannot be null");
        }
        if(Sink.getDecision(!argsIsSet || args.length == 0)) {
            //nothing to resolve
            return this;
        }

        //check if there is at least one variable
        boolean hasVariable = false;
        for(final String arg : args) {
            if(Sink.getDecision(arg != null && arg.startsWith("$"))) {
                hasVariable = true;
                break;
            }
        }
        //resolve variables
        final Object[] resolvedArgs = hasVariable ? resolveVariables(context.getVariableContext(), this.args) : this.args;

        //convert now
        final List<String> defaultOperands = Arrays.asList("path");
        final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
        final FindOptions.Default options = new FindOptions.Default();
        final FindArguments argsForContext = new FindArguments(options);
        for(final Map.Entry<String, List<Object>> e : map.entrySet()) {
            if(Sink.getDecision("path".equals(e.getKey()))) {

                final String value = convertList(context, "path", String.class, e.getValue());
                argsForContext.setPath(value);
            }
            else if(Sink.getDecision("name".equals(e.getKey()))) {

                final String value = convertList(context, "name", String.class, e.getValue());
                argsForContext.setName(value);
            }
            else if(Sink.getDecision("size".equals(e.getKey()))) {

                final long value = convertList(context, "size", long.class, e.getValue());
                argsForContext.setSize(value);
            }
            else if(Sink.getDecision("time".equals(e.getKey()))) {

                final java.util.Date value = convertList(context, "time", java.util.Date.class, e.getValue());
                argsForContext.setTime(value);
            }
            else if(Sink.getDecision("args".equals(e.getKey()))) {
                throw new IllegalStateException("invalid operand '" + e.getKey() + "' in find command args: " + Arrays.toString(args));
            }
            else if(Sink.getDecision("options".equals(e.getKey()))) {

                final FindOptions value = convertList(context, "options", FindOptions.class, e.getValue());
                options.setAll(value);
            }
            else {
                throw new IllegalStateException("invalid operand '" + e.getKey() + "' in find command args: " + Arrays.toString(args));
            }
        }
        return argsForContext;
    }

    /**
     * Returns the {@code <path>} operand value (variables are NOT resolved): Starting point for the search in the directory hierarchy;
     * wildcards * and ? are supported; relative paths are resolved on the
     * basis of the current working directory.
     *
     * @return the {@code <path>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     * @see #getPath(ExecutionContext)
     */
    public String getPath() {
        if(Sink.getDecision(pathIsSet)) {
            return path;
        }
        throw new IllegalStateException("operand has not been set: " + path);
    }

    /**
     * Sets {@code <path>}: Starting point for the search in the directory hierarchy;
     * wildcards * and ? are supported; relative paths are resolved on the
     * basis of the current working directory.
     *
     * @param path the value for the {@code <path>} operand
     */
    public void setPath(String path) {
        this.path = path;
        this.pathIsSet = true;
    }

    /**
     * Returns the {@code <path>} (variables are resolved): Starting point for the search in the directory hierarchy;
     * wildcards * and ? are supported; relative paths are resolved on the
     * basis of the current working directory.
     *
     * @param context the execution context used to resolve variables
     * @return the {@code <path>} operand value after resolving variables
     * @throws IllegalStateException if this operand has never been set
     * @see #getPath()
     */
    public String getPath(ExecutionContext context) {
        final String value = getPath();
        if(Sink.getDecision(Arg.isVariable(value))) {
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
     * @return true if the setter for the {@code <path>} operand has
     * been called at least once
     */
    public boolean isPathSet() {
        return pathIsSet;
    }

    /**
     * Returns the {@code <name>} operand value (variables are NOT resolved): Name pattern to match the file name after removing the path with the
     * leading directories; wildcards * and ? are supported, or full
     * regular expressions if either of the options {@code -regex (-r)} or
     * {@code -iregex (-i)} is specified.
     *
     * @return the {@code <name>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     * @see #getName(ExecutionContext)
     */
    public String getName() {
        if(Sink.getDecision(nameIsSet)) {
            return name;
        }
        throw new IllegalStateException("operand has not been set: " + name);
    }

    /**
     * Sets {@code <name>}: Name pattern to match the file name after removing the path with the
     * leading directories; wildcards * and ? are supported, or full
     * regular expressions if either of the options {@code -regex (-r)} or
     * {@code -iregex (-i)} is specified.
     *
     * @param name the value for the {@code <name>} operand
     */
    public void setName(String name) {
        this.name = name;
        this.nameIsSet = true;
    }

    /**
     * Returns the {@code <name>} (variables are resolved): Name pattern to match the file name after removing the path with the
     * leading directories; wildcards * and ? are supported, or full
     * regular expressions if either of the options {@code -regex (-r)} or
     * {@code -iregex (-i)} is specified.
     *
     * @param context the execution context used to resolve variables
     * @return the {@code <name>} operand value after resolving variables
     * @throws IllegalStateException if this operand has never been set
     * @see #getName()
     */
    public String getName(ExecutionContext context) {
        final String value = getName();
        if(Sink.getDecision(Arg.isVariable(value))) {
            final Object resolved = resolveVariable(context.getVariableContext(), value);
            final String converted = convert(context, "name", String.class, resolved);
            return converted;
        }
        return value;
    }

    /**
     * Returns true if the {@code <name>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setName(String)} method.
     *
     * @return true if the setter for the {@code <name>} operand has
     * been called at least once
     */
    public boolean isNameSet() {
        return nameIsSet;
    }

    /**
     * Returns the {@code <size>} operand value: Consider only files using at least {@code size} bytes if {@code size}
     * is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     * or negative.
     *
     * @return the {@code <size>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public long getSize() {
        if(Sink.getDecision(sizeIsSet)) {
            return size;
        }
        throw new IllegalStateException("operand has not been set: " + size);
    }

    /**
     * Sets {@code <size>}: Consider only files using at least {@code size} bytes if {@code size}
     * is positive, or at most {@code abs(size)} bytes if {@code size} is zero
     * or negative.
     *
     * @param size the value for the {@code <size>} operand
     */
    public void setSize(long size) {
        this.size = size;
        this.sizeIsSet = true;
    }

    /**
     * Returns true if the {@code <size>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setSize(long)} method.
     *
     * @return true if the setter for the {@code <size>} operand has
     * been called at least once
     */
    public boolean isSizeSet() {
        return sizeIsSet;
    }

    /**
     * Returns the {@code <time>} operand value: Consider only files that have been created, modified or accessed
     * before or after the specified {@code time} operand; consider the
     * {@code -time...} options for details of the comparison.
     *
     * @return the {@code <time>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public java.util.Date getTime() {
        if(Sink.getDecision(timeIsSet)) {
            return time;
        }
        throw new IllegalStateException("operand has not been set: " + time);
    }

    /**
     * Sets {@code <time>}: Consider only files that have been created, modified or accessed
     * before or after the specified {@code time} operand; consider the
     * {@code -time...} options for details of the comparison.
     *
     * @param time the value for the {@code <time>} operand
     */
    public void setTime(java.util.Date time) {
        this.time = time;
        this.timeIsSet = true;
    }

    /**
     * Returns true if the {@code <time>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setTime(java.util.Date)} method.
     *
     * @return true if the setter for the {@code <time>} operand has
     * been called at least once
     */
    public boolean isTimeSet() {
        return timeIsSet;
    }

    /**
     * Returns the {@code <args>} operand value: String arguments defining the options and operands for the command.
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--path" operand have to be prefixed with the operand name
     * (e.g. "--name" for subsequent path operand values).
     *
     * @return the {@code <args>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public String[] getArgs() {
        if(Sink.getDecision(argsIsSet)) {
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
     * Returns true if the {@code --}{@link FindOption#typeDirectory typeDirectory} option
     * is set. The option is also known as {@code -}d option.
     * <p>
     * Description: Consider only directories
     *
     * @return true if the {@code --typeDirectory} or {@code -d} option is set
     */
    public boolean isTypeDirectory() {
        return getOptions().isSet(FindOption.typeDirectory);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#typeFile typeFile} option
     * is set. The option is also known as {@code -}f option.
     * <p>
     * Description: Consider only regular files
     *
     * @return true if the {@code --typeFile} or {@code -f} option is set
     */
    public boolean isTypeFile() {
        return getOptions().isSet(FindOption.typeFile);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#typeSymlink typeSymlink} option
     * is set. The option is also known as {@code -}l option.
     * <p>
     * Description: Consider only symbolic links
     *
     * @return true if the {@code --typeSymlink} or {@code -l} option is set
     */
    public boolean isTypeSymlink() {
        return getOptions().isSet(FindOption.typeSymlink);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#typeOther typeOther} option
     * is set. The option is also known as {@code -}x option.
     * <p>
     * Description: Consider only files that are neither of directory (d),
     * regular file (f) or symlink (l).
     *
     * @return true if the {@code --typeOther} or {@code -x} option is set
     */
    public boolean isTypeOther() {
        return getOptions().isSet(FindOption.typeOther);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#regex regex} option
     * is set. The option is also known as {@code -}r option.
     * <p>
     * Description: Use full regular expression syntax for the patterns specified by the
     * name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     *
     * @return true if the {@code --regex} or {@code -r} option is set
     */
    public boolean isRegex() {
        return getOptions().isSet(FindOption.regex);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#ignoreCase ignoreCase} option
     * is set. The option is also known as {@code -}i option.
     * <p>
     * Description: Use case insensitive matching when applying the file name pattern
     * specified by the name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     *
     * @return true if the {@code --ignoreCase} or {@code -i} option is set
     */
    public boolean isIgnoreCase() {
        return getOptions().isSet(FindOption.ignoreCase);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#timeNewer timeNewer} option
     * is set. The option is also known as {@code -}n option.
     * <p>
     * Description: Consider only files that have been created, modified or accessed
     * after or at the time specified by the time operand (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     *
     * @return true if the {@code --timeNewer} or {@code -n} option is set
     */
    public boolean isTimeNewer() {
        return getOptions().isSet(FindOption.timeNewer);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#timeOlder timeOlder} option
     * is set. The option is also known as {@code -}o option.
     * <p>
     * Description: Consider only files that have been created, modified or accessed
     * before or at the time specified by the time operand
     * <p>
     * (This option is ignored if no time operand is specified).
     *
     * @return true if the {@code --timeOlder} or {@code -o} option is set
     */
    public boolean isTimeOlder() {
        return getOptions().isSet(FindOption.timeOlder);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#timeCreate timeCreate} option
     * is set. The option is also known as {@code -}c option.
     * <p>
     * Description: The time operand refers to the creation time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     *
     * @return true if the {@code --timeCreate} or {@code -c} option is set
     */
    public boolean isTimeCreate() {
        return getOptions().isSet(FindOption.timeCreate);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#timeAccess timeAccess} option
     * is set. The option is also known as {@code -}a option.
     * <p>
     * Description: The time operand refers to the last access time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     *
     * @return true if the {@code --timeAccess} or {@code -a} option is set
     */
    public boolean isTimeAccess() {
        return getOptions().isSet(FindOption.timeAccess);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#timeModified timeModified} option
     * is set. The option is also known as {@code -}m option.
     * <p>
     * Description: The time operand refers to the last modification time of the file
     * (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     *
     * @return true if the {@code --timeModified} or {@code -m} option is set
     */
    public boolean isTimeModified() {
        return getOptions().isSet(FindOption.timeModified);
    }

    /**
     * Returns true if the {@code --}{@link FindOption#print0 print0} option
     * is set. The option is also known as {@code -}z option.
     * <p>
     * Description: Print the full file name on the standard output, followed by a null
     * character (instead of the newline character used by default). This
     * allows file names that contain newlines or other types of white
     * space to be correctly interpreted by programs that process the find
     * output. This option corresponds to the --delimiter0 option of xargs.
     *
     * @return true if the {@code --print0} or {@code -z} option is set
     */
    public boolean isPrint0() {
        return getOptions().isSet(FindOption.print0);
    }

    @Override
    public String toString() {
        // ok, we have options or arguments or both
        final StringBuilder sb = new StringBuilder();

        if(Sink.getDecision(argsIsSet)) {
            for(String arg : args) {
                if(Sink.getDecision(sb.length() > 0)) {
                    sb.append(' ');
                }
                sb.append(arg);
            }
        }
        else {

            // first the options
            if(Sink.getDecision(options.size() > 0)) {
                sb.append(DefaultOptionSet.toString(options));
            }
            // operand: <path>
            if(Sink.getDecision(pathIsSet)) {
                if(Sink.getDecision(sb.length() > 0)) {
                    sb.append(' ');
                }
                sb.append("--").append("path");
                sb.append(" ").append(toString(getPath()));
            }
            // operand: <name>
            if(Sink.getDecision(nameIsSet)) {
                if(Sink.getDecision(sb.length() > 0)) {
                    sb.append(' ');
                }
                sb.append("--").append("name");
                sb.append(" ").append(toString(getName()));
            }
            // operand: <size>
            if(Sink.getDecision(sizeIsSet)) {
                if(Sink.getDecision(sb.length() > 0)) {
                    sb.append(' ');
                }
                sb.append("--").append("size");
                sb.append(" ").append(toString(getSize()));
            }
            // operand: <time>
            if(Sink.getDecision(timeIsSet)) {
                if(Sink.getDecision(sb.length() > 0)) {
                    sb.append(' ');
                }
                sb.append("--").append("time");
                sb.append(" ").append(toString(getTime()));
            }
            // operand: <args>
            if(Sink.getDecision(argsIsSet)) {
                if(Sink.getDecision(sb.length() > 0)) {
                    sb.append(' ');
                }
                sb.append("--").append("args");
                sb.append(" ").append(toString(getArgs()));
            }
        }

        return sb.toString();
    }
}
