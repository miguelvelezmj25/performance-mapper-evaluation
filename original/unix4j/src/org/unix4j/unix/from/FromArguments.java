package org.unix4j.unix.from;


import org.unix4j.command.Arguments;
import org.unix4j.context.ExecutionContext;
import org.unix4j.convert.ValueConverter;
import org.unix4j.unix.From;
import org.unix4j.util.ArrayUtil;
import org.unix4j.variable.Arg;
import org.unix4j.variable.VariableContext;

/**
 * Arguments and options for the {@link From from} command.
 */
public final class FromArguments implements Arguments<FromArguments> {


    // operand: <path>
    private String path;
    private boolean pathIsSet = false;

    // operand: <input>
    private org.unix4j.io.Input input;
    private boolean inputIsSet = false;

    /**
     * Constructor to use if no options are specified.
     */
    public FromArguments() {
        super();
    }

    private static String toString(Object value) {
        if(value != null && value.getClass().isArray()) {
            return ArrayUtil.toString(value);
        }
        return String.valueOf(value);
    }

    private Object resolveVariable(VariableContext context, String variable) {
        final Object value = context.getValue(variable);
        if(value != null) {
            return value;
        }
        throw new IllegalArgumentException("cannot resolve variable " + variable +
                " in command: from " + this);
    }

    private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
        final ValueConverter<V> converter = context.getValueConverterFor(operandType);
        final V convertedValue;
        if(converter != null) {
            convertedValue = converter.convert(value);
        }
        else {
            convertedValue = null;
        }
        if(convertedValue != null) {
            return convertedValue;
        }
        throw new IllegalArgumentException("cannot convert --" + operandName +
                " value '" + value + "' into the type " + operandType.getName() +
                " for from command");
    }

    @Override
    public FromArguments getForContext(ExecutionContext context) {
        if(context == null) {
            throw new NullPointerException("context cannot be null");
        }
        //no String... args for this command, hence nothing to resolve
        return this;
    }

    /**
     * Returns the {@code <path>} operand value (variables are NOT resolved): the file to use as input; wildcards * and ? are supported; relative
     * paths are resolved on the basis of the current working directory.
     *
     * @return the {@code <path>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     * @see #getPath(ExecutionContext)
     */
    public String getPath() {
        if(pathIsSet) {
            return path;
        }
        throw new IllegalStateException("operand has not been set: " + path);
    }

    /**
     * Sets {@code <path>}: the file to use as input; wildcards * and ? are supported; relative
     * paths are resolved on the basis of the current working directory.
     *
     * @param path the value for the {@code <path>} operand
     */
    public void setPath(String path) {
        this.path = path;
        this.pathIsSet = true;
    }

    /**
     * Returns the {@code <path>} (variables are resolved): the file to use as input; wildcards * and ? are supported; relative
     * paths are resolved on the basis of the current working directory.
     *
     * @param context the execution context used to resolve variables
     * @return the {@code <path>} operand value after resolving variables
     * @throws IllegalStateException if this operand has never been set
     * @see #getPath()
     */
    public String getPath(ExecutionContext context) {
        final String value = getPath();
        if(Arg.isVariable(value)) {
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
     * Returns the {@code <input>} operand value: the input object to read from
     *
     * @return the {@code <input>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public org.unix4j.io.Input getInput() {
        if(inputIsSet) {
            return input;
        }
        throw new IllegalStateException("operand has not been set: " + input);
    }

    /**
     * Sets {@code <input>}: the input object to read from
     *
     * @param input the value for the {@code <input>} operand
     */
    public void setInput(org.unix4j.io.Input input) {
        this.input = input;
        this.inputIsSet = true;
    }

    /**
     * Returns true if the {@code <input>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setInput(org.unix4j.io.Input)} method.
     *
     * @return true if the setter for the {@code <input>} operand has
     * been called at least once
     */
    public boolean isInputSet() {
        return inputIsSet;
    }

    @Override
    public String toString() {
        // ok, we have options or arguments or both
        final StringBuilder sb = new StringBuilder();

        {
            // operand: <path>
            if(pathIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("path");
                sb.append(" ").append(toString(getPath()));
            }
            // operand: <input>
            if(inputIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("input");
                sb.append(" ").append(toString(getInput()));
            }
        }

        return sb.toString();
    }
}
