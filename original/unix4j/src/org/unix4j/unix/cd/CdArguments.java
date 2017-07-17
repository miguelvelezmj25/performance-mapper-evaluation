package org.unix4j.unix.cd;


import org.unix4j.command.Arguments;
import org.unix4j.context.ExecutionContext;
import org.unix4j.convert.ValueConverter;
import org.unix4j.unix.Cd;
import org.unix4j.util.ArrayUtil;
import org.unix4j.variable.Arg;
import org.unix4j.variable.VariableContext;

/**
 * Arguments and options for the {@link Cd cd} command.
 */
public final class CdArguments implements Arguments<CdArguments> {


    // operand: <file>
    private java.io.File file;
    private boolean fileIsSet = false;

    // operand: <path>
    private String path;
    private boolean pathIsSet = false;

    /**
     * Constructor to use if no options are specified.
     */
    public CdArguments() {
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
                " in command: cd " + this);
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
                " for cd command");
    }

    @Override
    public CdArguments getForContext(ExecutionContext context) {
        if(context == null) {
            throw new NullPointerException("context cannot be null");
        }
        //no String... args for this command, hence nothing to resolve
        return this;
    }

    /**
     * Returns the {@code <file>} operand value: the file to use as input; relative paths are not resolved (use the
     * string path argument to enable relative path resolving based on the
     * current working directory).
     *
     * @return the {@code <file>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public java.io.File getFile() {
        if(fileIsSet) {
            return file;
        }
        throw new IllegalStateException("operand has not been set: " + file);
    }

    /**
     * Sets {@code <file>}: the file to use as input; relative paths are not resolved (use the
     * string path argument to enable relative path resolving based on the
     * current working directory).
     *
     * @param file the value for the {@code <file>} operand
     */
    public void setFile(java.io.File file) {
        this.file = file;
        this.fileIsSet = true;
    }

    /**
     * Returns true if the {@code <file>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setFile(java.io.File)} method.
     *
     * @return true if the setter for the {@code <file>} operand has
     * been called at least once
     */
    public boolean isFileSet() {
        return fileIsSet;
    }

    /**
     * Returns the {@code <path>} operand value (variables are NOT resolved): the directory to become the new current working directory;
     * wildcards * and ? are supported; relative paths are resolved on the
     * basis of the current working directory.
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
     * Sets {@code <path>}: the directory to become the new current working directory;
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
     * Returns the {@code <path>} (variables are resolved): the directory to become the new current working directory;
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

    @Override
    public String toString() {
        // ok, we have options or arguments or both
        final StringBuilder sb = new StringBuilder();

        {
            // operand: <file>
            if(fileIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("file");
                sb.append(" ").append(toString(getFile()));
            }
            // operand: <path>
            if(pathIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("path");
                sb.append(" ").append(toString(getPath()));
            }
        }

        return sb.toString();
    }
}
