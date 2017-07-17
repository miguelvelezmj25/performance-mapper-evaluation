package org.unix4j.unix.cut;

import org.unix4j.command.Arguments;
import org.unix4j.context.ExecutionContext;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.unix.Cut;
import org.unix4j.util.ArgsUtil;
import org.unix4j.util.ArrayUtil;
import org.unix4j.variable.Arg;
import org.unix4j.variable.VariableContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Arguments and options for the {@link Cut cut} command.
 */
public final class CutArguments implements Arguments<CutArguments> {

    private final CutOptions options;


    // operand: <delimiter>
    private String delimiter;
    private boolean delimiterIsSet = false;

    // operand: <outputDelimiter>
    private char outputDelimiter;
    private boolean outputDelimiterIsSet = false;

    // operand: <indexes>
    private int[] indexes;
    private boolean indexesIsSet = false;

    // operand: <range>
    private org.unix4j.util.Range range;
    private boolean rangeIsSet = false;

    // operand: <args>
    private String[] args;
    private boolean argsIsSet = false;

    /**
     * Constructor to use if no options are specified.
     */
    public CutArguments() {
        this.options = CutOptions.EMPTY;
    }

    /**
     * Constructor with option set containing the selected command options.
     *
     * @param options the selected options
     * @throws NullPointerException if the argument is null
     */
    public CutArguments(CutOptions options) {
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
    public CutArguments(String... args) {
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
    public CutOptions getOptions() {
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
                " in command: cut " + this);
    }

    private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
        final ValueConverter<V> converter = context.getValueConverterFor(operandType);
        final V convertedValue;
        if(converter != null) {
            convertedValue = converter.convert(value);
        }
        else {
            if(CutOptions.class.equals(operandType)) {
                convertedValue = operandType.cast(CutOptions.CONVERTER.convert(value));
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
                " for cut command");
    }

    @Override
    public CutArguments getForContext(ExecutionContext context) {
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
        final List<String> defaultOperands = Arrays.asList("range");
        final Map<String, List<Object>> map = ArgsUtil.parseArgs("options", defaultOperands, resolvedArgs);
        final CutOptions.Default options = new CutOptions.Default();
        final CutArguments argsForContext = new CutArguments(options);
        for(final Map.Entry<String, List<Object>> e : map.entrySet()) {
            if("delimiter".equals(e.getKey())) {

                final String value = convertList(context, "delimiter", String.class, e.getValue());
                argsForContext.setDelimiter(value);
            }
            else if("outputDelimiter".equals(e.getKey())) {

                final char value = convertList(context, "outputDelimiter", char.class, e.getValue());
                argsForContext.setOutputDelimiter(value);
            }
            else if("indexes".equals(e.getKey())) {

                final int[] value = convertList(context, "indexes", int[].class, e.getValue());
                argsForContext.setIndexes(value);
            }
            else if("range".equals(e.getKey())) {

                final org.unix4j.util.Range value = convertList(context, "range", org.unix4j.util.Range.class, e.getValue());
                argsForContext.setRange(value);
            }
            else if("args".equals(e.getKey())) {
                throw new IllegalStateException("invalid operand '" + e.getKey() + "' in cut command args: " + Arrays.toString(args));
            }
            else if("options".equals(e.getKey())) {

                final CutOptions value = convertList(context, "options", CutOptions.class, e.getValue());
                options.setAll(value);
            }
            else {
                throw new IllegalStateException("invalid operand '" + e.getKey() + "' in cut command args: " + Arrays.toString(args));
            }
        }
        return argsForContext;
    }

    /**
     * Returns the {@code <delimiter>} operand value (variables are NOT resolved): use as the output delimiter the default is to use the input delimiter
     *
     * @return the {@code <delimiter>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     * @see #getDelimiter(ExecutionContext)
     */
    public String getDelimiter() {
        if(delimiterIsSet) {
            return delimiter;
        }
        throw new IllegalStateException("operand has not been set: " + delimiter);
    }

    /**
     * Sets {@code <delimiter>}: use as the output delimiter the default is to use the input delimiter
     *
     * @param delimiter the value for the {@code <delimiter>} operand
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        this.delimiterIsSet = true;
    }

    /**
     * Returns the {@code <delimiter>} (variables are resolved): use as the output delimiter the default is to use the input delimiter
     *
     * @param context the execution context used to resolve variables
     * @return the {@code <delimiter>} operand value after resolving variables
     * @throws IllegalStateException if this operand has never been set
     * @see #getDelimiter()
     */
    public String getDelimiter(ExecutionContext context) {
        final String value = getDelimiter();
        if(Arg.isVariable(value)) {
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
     * @return true if the setter for the {@code <delimiter>} operand has
     * been called at least once
     */
    public boolean isDelimiterSet() {
        return delimiterIsSet;
    }

    /**
     * Returns the {@code <outputDelimiter>} operand value: use as the output delimiter the default is to use the input delimiter
     *
     * @return the {@code <outputDelimiter>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public char getOutputDelimiter() {
        if(outputDelimiterIsSet) {
            return outputDelimiter;
        }
        throw new IllegalStateException("operand has not been set: " + outputDelimiter);
    }

    /**
     * Sets {@code <outputDelimiter>}: use as the output delimiter the default is to use the input delimiter
     *
     * @param outputDelimiter the value for the {@code <outputDelimiter>} operand
     */
    public void setOutputDelimiter(char outputDelimiter) {
        this.outputDelimiter = outputDelimiter;
        this.outputDelimiterIsSet = true;
    }

    /**
     * Returns true if the {@code <outputDelimiter>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setOutputDelimiter(char)} method.
     *
     * @return true if the setter for the {@code <outputDelimiter>} operand has
     * been called at least once
     */
    public boolean isOutputDelimiterSet() {
        return outputDelimiterIsSet;
    }

    /**
     * Returns the {@code <indexes>} operand value: select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.
     *
     * @return the {@code <indexes>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public int[] getIndexes() {
        if(indexesIsSet) {
            return indexes;
        }
        throw new IllegalStateException("operand has not been set: " + indexes);
    }

    /**
     * Sets {@code <indexes>}: select these chars/field based on the given indexes. Indexes are 1 based.  i.e. the first character/field on a line has an index of 1.
     *
     * @param indexes the value for the {@code <indexes>} operand
     */
    public void setIndexes(int... indexes) {
        this.indexes = indexes;
        this.indexesIsSet = true;
    }

    /**
     * Returns true if the {@code <indexes>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setIndexes(int[])} method.
     *
     * @return true if the setter for the {@code <indexes>} operand has
     * been called at least once
     */
    public boolean isIndexesSet() {
        return indexesIsSet;
    }

    /**
     * Returns the {@code <range>} operand value: select only these fields
     *
     * @return the {@code <range>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public org.unix4j.util.Range getRange() {
        if(rangeIsSet) {
            return range;
        }
        throw new IllegalStateException("operand has not been set: " + range);
    }

    /**
     * Sets {@code <range>}: select only these fields
     *
     * @param range the value for the {@code <range>} operand
     */
    public void setRange(org.unix4j.util.Range range) {
        this.range = range;
        this.rangeIsSet = true;
    }

    /**
     * Returns true if the {@code <range>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setRange(org.unix4j.util.Range)} method.
     *
     * @return true if the setter for the {@code <range>} operand has
     * been called at least once
     */
    public boolean isRangeSet() {
        return rangeIsSet;
    }

    /**
     * Returns the {@code <args>} operand value: String arguments defining the options and operands for the command.
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--range" operand have to be prefixed with the operand name
     * (e.g. "--indexes" for subsequent index operand values).
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
     * Returns true if the {@code --}{@link CutOption#chars chars} option
     * is set. The option is also known as {@code -}c option.
     * <p>
     * Description: The list specifies character positions.
     *
     * @return true if the {@code --chars} or {@code -c} option is set
     */
    public boolean isChars() {
        return getOptions().isSet(CutOption.chars);
    }

    /**
     * Returns true if the {@code --}{@link CutOption#fields fields} option
     * is set. The option is also known as {@code -}f option.
     * <p>
     * Description: The list specifies fields, separated in the input by the field
     * delimiter character (see the -d option.)  Output fields are
     * separated by a single occurrence of the field delimiter character.
     *
     * @return true if the {@code --fields} or {@code -f} option is set
     */
    public boolean isFields() {
        return getOptions().isSet(CutOption.fields);
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
            // operand: <delimiter>
            if(delimiterIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("delimiter");
                sb.append(" ").append(toString(getDelimiter()));
            }
            // operand: <outputDelimiter>
            if(outputDelimiterIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("outputDelimiter");
                sb.append(" ").append(toString(getOutputDelimiter()));
            }
            // operand: <indexes>
            if(indexesIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("indexes");
                sb.append(" ").append(toString(getIndexes()));
            }
            // operand: <range>
            if(rangeIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("range");
                sb.append(" ").append(toString(getRange()));
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
