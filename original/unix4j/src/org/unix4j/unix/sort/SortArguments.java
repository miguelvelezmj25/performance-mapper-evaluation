package org.unix4j.unix.sort;

import org.unix4j.command.Arguments;
import org.unix4j.context.ExecutionContext;
import org.unix4j.convert.ValueConverter;
import org.unix4j.option.DefaultOptionSet;
import org.unix4j.unix.Sort;
import org.unix4j.util.ArgsUtil;
import org.unix4j.util.ArrayUtil;
import org.unix4j.variable.Arg;
import org.unix4j.variable.VariableContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Arguments and options for the {@link Sort sort} command.
 */
public final class SortArguments implements Arguments<SortArguments> {

    private final SortOptions options;


    // operand: <paths>
    private String[] paths;
    private boolean pathsIsSet = false;

    // operand: <files>
    private java.io.File[] files;
    private boolean filesIsSet = false;

    // operand: <comparator>
    private java.util.Comparator<? super org.unix4j.line.Line> comparator;
    private boolean comparatorIsSet = false;

    // operand: <args>
    private String[] args;
    private boolean argsIsSet = false;

    /**
     * Constructor to use if no options are specified.
     */
    public SortArguments() {
        this.options = SortOptions.EMPTY;
    }

    /**
     * Constructor with option set containing the selected command options.
     *
     * @param options the selected options
     * @throws NullPointerException if the argument is null
     */
    public SortArguments(SortOptions options) {
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
    public SortArguments(String... args) {
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
    public SortOptions getOptions() {
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
                " in command: sort " + this);
    }

    private <V> V convert(ExecutionContext context, String operandName, Class<V> operandType, Object value) {
        final ValueConverter<V> converter = context.getValueConverterFor(operandType);
        final V convertedValue;
        if(converter != null) {
            convertedValue = converter.convert(value);
        }
        else {
            if(SortOptions.class.equals(operandType)) {
                convertedValue = operandType.cast(SortOptions.CONVERTER.convert(value));
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
                " for sort command");
    }

    @Override
    public SortArguments getForContext(ExecutionContext context) {
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
        final SortOptions.Default options = new SortOptions.Default();
        final SortArguments argsForContext = new SortArguments(options);
        for(final Map.Entry<String, List<Object>> e : map.entrySet()) {
            if("paths".equals(e.getKey())) {

                final String[] value = convertList(context, "paths", String[].class, e.getValue());
                argsForContext.setPaths(value);
            }
            else if("files".equals(e.getKey())) {

                final java.io.File[] value = convertList(context, "files", java.io.File[].class, e.getValue());
                argsForContext.setFiles(value);
            }
            else if("comparator".equals(e.getKey())) {
                @SuppressWarnings("unchecked")                final java.util.Comparator<? super org.unix4j.line.Line> value = convertList(context, "comparator", (Class<java.util.Comparator<? super org.unix4j.line.Line>>) (Class<?>) java.util.Comparator.class, e.getValue());
                argsForContext.setComparator(value);
            }
            else if("args".equals(e.getKey())) {
                throw new IllegalStateException("invalid operand '" + e.getKey() + "' in sort command args: " + Arrays.toString(args));
            }
            else if("options".equals(e.getKey())) {

                final SortOptions value = convertList(context, "options", SortOptions.class, e.getValue());
                options.setAll(value);
            }
            else {
                throw new IllegalStateException("invalid operand '" + e.getKey() + "' in sort command args: " + Arrays.toString(args));
            }
        }
        return argsForContext;
    }

    /**
     * Returns the {@code <paths>} operand value: Pathnames of the files to be sorted, merged, or checked; wildcards *
     * and ? are supported; relative paths are resolved on the
     * basis of the current working directory.
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
     * Sets {@code <paths>}: Pathnames of the files to be sorted, merged, or checked; wildcards *
     * and ? are supported; relative paths are resolved on the
     * basis of the current working directory.
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
     * Returns the {@code <files>} operand value: The files to be sorted or merged; relative paths are not resolved
     * (use the string paths argument to enable relative path resolving
     * based on the current working directory).
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
     * Sets {@code <files>}: The files to be sorted or merged; relative paths are not resolved
     * (use the string paths argument to enable relative path resolving
     * based on the current working directory).
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
     * Returns the {@code <comparator>} operand value: The comparator to use for the line comparisons.
     *
     * @return the {@code <comparator>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public java.util.Comparator<? super org.unix4j.line.Line> getComparator() {
        if(comparatorIsSet) {
            return comparator;
        }
        throw new IllegalStateException("operand has not been set: " + comparator);
    }

    /**
     * Sets {@code <comparator>}: The comparator to use for the line comparisons.
     *
     * @param comparator the value for the {@code <comparator>} operand
     */
    public void setComparator(java.util.Comparator<? super org.unix4j.line.Line> comparator) {
        this.comparator = comparator;
        this.comparatorIsSet = true;
    }

    /**
     * Returns true if the {@code <comparator>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setComparator(java.util.Comparator)} method.
     *
     * @return true if the setter for the {@code <comparator>} operand has
     * been called at least once
     */
    public boolean isComparatorSet() {
        return comparatorIsSet;
    }

    /**
     * Returns the {@code <args>} operand value: String arguments defining the options and operands for the command.
     * Options can be specified by acronym (with a leading dash "-") or by
     * long name (with two leading dashes "--"). Operands other than the
     * default "--paths" operand have to be prefixed with the operand
     * name (e.g. "--comparator" for a subsequent comparator operand value).
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
     * Returns true if the {@code --}{@link SortOption#check check} option
     * is set. The option is also known as {@code -}c option.
     * <p>
     * Description: Checks that the single input file is ordered as specified by the
     * arguments and the collating sequence of the current locale. No
     * output is produced; only the exit code is affected.
     *
     * @return true if the {@code --check} or {@code -c} option is set
     */
    public boolean isCheck() {
        return getOptions().isSet(SortOption.check);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#merge merge} option
     * is set. The option is also known as {@code -}m option.
     * <p>
     * Description: Merge only; the input file are assumed to be already sorted.
     *
     * @return true if the {@code --merge} or {@code -m} option is set
     */
    public boolean isMerge() {
        return getOptions().isSet(SortOption.merge);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#unique unique} option
     * is set. The option is also known as {@code -}u option.
     * <p>
     * Description: Unique: suppress all but one in each set of lines having equal keys.
     * If used with the {@code -c} option, checks that there are no lines
     * with duplicate keys, in addition to checking that the input file is
     * sorted.
     *
     * @return true if the {@code --unique} or {@code -u} option is set
     */
    public boolean isUnique() {
        return getOptions().isSet(SortOption.unique);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#ignoreLeadingBlanks ignoreLeadingBlanks} option
     * is set. The option is also known as {@code -}b option.
     * <p>
     * Description: Ignore leading blanks.
     * (This option is ignored if a comparator operand is present).
     *
     * @return true if the {@code --ignoreLeadingBlanks} or {@code -b} option is set
     */
    public boolean isIgnoreLeadingBlanks() {
        return getOptions().isSet(SortOption.ignoreLeadingBlanks);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#dictionaryOrder dictionaryOrder} option
     * is set. The option is also known as {@code -}d option.
     * <p>
     * Description: Consider only blanks and alphanumeric characters.
     * (This option is ignored if a comparator operand is present).
     *
     * @return true if the {@code --dictionaryOrder} or {@code -d} option is set
     */
    public boolean isDictionaryOrder() {
        return getOptions().isSet(SortOption.dictionaryOrder);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#ignoreCase ignoreCase} option
     * is set. The option is also known as {@code -}f option.
     * <p>
     * Description: Consider all lowercase characters that have uppercase equivalents to
     * be the uppercase equivalent for the purposes of comparison.
     * (This option is ignored if a comparator operand is present).
     *
     * @return true if the {@code --ignoreCase} or {@code -f} option is set
     */
    public boolean isIgnoreCase() {
        return getOptions().isSet(SortOption.ignoreCase);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#numericSort numericSort} option
     * is set. The option is also known as {@code -}n option.
     * <p>
     * Description: Sort numerically; the number begins each line and consists of
     * optional blanks, an optional minus sign, and zero or more digits
     * possibly separated by thousands separators, optionally followed by a
     * decimal-point character and zero or more digits. An empty number is
     * treated as '0'. The current local specifies the decimal-point
     * character and thousands separator.
     * <p>
     * Comparison is exact; there is no rounding error.
     * <p>
     * Neither a leading '+' nor exponential notation is recognized. To
     * compare such strings numerically, use the
     * {@code -genericNumericSort (-g)} option.
     * <p>
     * (This option is ignored if a comparator operand is present).
     *
     * @return true if the {@code --numericSort} or {@code -n} option is set
     */
    public boolean isNumericSort() {
        return getOptions().isSet(SortOption.numericSort);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#generalNumericSort generalNumericSort} option
     * is set. The option is also known as {@code -}g option.
     * <p>
     * Description: Sort numerically, using the standard {@link Double#parseDouble(String)}
     * function to convert a trimmed line to a double-precision floating
     * point number. This allows floating point numbers to be specified in
     * scientific notation, like 1.0e-34 and 10e100.
     * <p>
     * Uses the following collating sequence: Lines that cannot be parsed
     * because they do not represent valid double values (in alpha-numeric
     * order); "-Infinity"; finite numbers in ascending numeric order
     * (with -0 < +0); "Infinity"; "NaN".
     * <p>
     * This option is usually slower than {@code -numeric-sort (-n)} and it
     * can lose information when converting to floating point.
     * <p>
     * (This option is ignored if a comparator operand is present).
     *
     * @return true if the {@code --generalNumericSort} or {@code -g} option is set
     */
    public boolean isGeneralNumericSort() {
        return getOptions().isSet(SortOption.generalNumericSort);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#humanNumericSort humanNumericSort} option
     * is set. The option is also known as {@code -}h option.
     * <p>
     * Description: Sort numerically, first by numeric sign (negative, zero, or
     * positive); then by SI suffix (either empty, or 'k' or 'K', or one
     * of 'MGTPEZY', in that order); and finally by numeric value. For
     * example, '1023M' sorts before '1G' because 'M' (mega) precedes 'G'
     * (giga) as an SI suffix.
     * <p>
     * This option sorts values that are consistently scaled to the nearest
     * suffix, regardless of whether suffixes denote powers of 1000 or
     * 1024, and it therefore sorts the output of any single invocation of
     * the {@code ls} command that are invoked with the --human-readable
     * option.
     * <p>
     * The syntax for numbers is the same as for the
     * {@code --numericSort (-n)} option; the SI suffix must immediately
     * follow the number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     *
     * @return true if the {@code --humanNumericSort} or {@code -h} option is set
     */
    public boolean isHumanNumericSort() {
        return getOptions().isSet(SortOption.humanNumericSort);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#monthSort monthSort} option
     * is set. The option is also known as {@code -}M option.
     * <p>
     * Description: An initial string, consisting of any amount of blanks, followed by a
     * month name abbreviation, is folded to UPPER case and compared in the
     * order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
     * determines the month spellings.
     *
     * @return true if the {@code --monthSort} or {@code -M} option is set
     */
    public boolean isMonthSort() {
        return getOptions().isSet(SortOption.monthSort);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#versionSort versionSort} option
     * is set. The option is also known as {@code -}V option.
     * <p>
     * Description: Sort by version name and number. It behaves like a standard sort,
     * except that each sequence of decimal digits is treated numerically
     * as an index/version number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     *
     * @return true if the {@code --versionSort} or {@code -V} option is set
     */
    public boolean isVersionSort() {
        return getOptions().isSet(SortOption.versionSort);
    }

    /**
     * Returns true if the {@code --}{@link SortOption#reverse reverse} option
     * is set. The option is also known as {@code -}r option.
     * <p>
     * Description: Reverse the sense of comparisons.
     *
     * @return true if the {@code --reverse} or {@code -r} option is set
     */
    public boolean isReverse() {
        return getOptions().isSet(SortOption.reverse);
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
            // operand: <comparator>
            if(comparatorIsSet) {
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append("--").append("comparator");
                sb.append(" ").append(toString(getComparator()));
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
