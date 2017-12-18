package org.unix4j.sort.unix.sort;

import edu.cmu.cs.mvelezce.analysis.option.Sink;

/**
 * Arguments and options for the command.
 */
public final class SortArguments {

    private boolean isCheck;
    private boolean isMerge;
    private boolean isUnique;
    private boolean isIgnoreLeadingBlanks;
    private boolean isDictionaryOrder;
    private boolean isIgnoreCase;
    private boolean isNumericSort;
    private boolean isGeneralNumericSort;
    private boolean isHumanNumericSort;
    private boolean isMonthSort;
    private boolean isVersionSort;
    private boolean isReverse;

    // operand: <paths>
    private String[] paths;
    private boolean pathsIsSet = false;

    // operand: <files>
    private java.io.File[] files;
    private boolean filesIsSet = false;

    // operand: <comparator>
    private java.util.Comparator<? super org.unix4j.sort.line.Line> comparator;
    private boolean comparatorIsSet = false;

    // operand: <args>
    private String[] args;
    private boolean argsIsSet = false;

    public SortArguments(boolean isCheck, boolean isMerge, boolean isUnique, boolean isIgnoreLeadingBlanks,
                         boolean isDictionaryOrder, boolean isIgnoreCase, boolean isNumericSort,
                         boolean isGeneralNumericSort, boolean isHumanNumericSort, boolean isMonthSort,
                         boolean isVersionSort, boolean isReverse) {
        this.isCheck = isCheck;
        this.isMerge = isMerge;
        this.isUnique = isUnique;
        this.isIgnoreLeadingBlanks = isIgnoreLeadingBlanks;
        this.isDictionaryOrder = isDictionaryOrder;
        this.isIgnoreCase = isIgnoreCase;
        this.isNumericSort = isNumericSort;
        this.isGeneralNumericSort = isGeneralNumericSort;
        this.isHumanNumericSort = isHumanNumericSort;
        this.isMonthSort = isMonthSort;
        this.isVersionSort = isVersionSort;
        this.isReverse = isReverse;

        Sink.sink(this.isCheck);
        Sink.sink(this.isMerge);
        Sink.sink(this.isUnique);
        Sink.sink(this.isIgnoreLeadingBlanks);
        Sink.sink(this.isDictionaryOrder);
        Sink.sink(this.isIgnoreCase);
        Sink.sink(this.isNumericSort);
        Sink.sink(this.isGeneralNumericSort);
        Sink.sink(this.isHumanNumericSort);
        Sink.sink(this.isMonthSort);
        Sink.sink(this.isVersionSort);
        Sink.sink(this.isReverse);
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
    public java.util.Comparator<? super org.unix4j.sort.line.Line> getComparator() {
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
    public void setComparator(java.util.Comparator<? super org.unix4j.sort.line.Line> comparator) {
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

    public boolean isCheck() {
        return isCheck;
    }

    public boolean isMerge() {
        return isMerge;
    }

    public boolean isUnique() {
        return isUnique;
    }

    public boolean isIgnoreLeadingBlanks() {
        return isIgnoreLeadingBlanks;
    }

    public boolean isDictionaryOrder() {
        return isDictionaryOrder;
    }

    public boolean isIgnoreCase() {
        return isIgnoreCase;
    }

    public boolean isNumericSort() {
        return isNumericSort;
    }

    public boolean isGeneralNumericSort() {
        return isGeneralNumericSort;
    }

    public boolean isHumanNumericSort() {
        return isHumanNumericSort;
    }

    public boolean isMonthSort() {
        return isMonthSort;
    }

    public boolean isVersionSort() {
        return isVersionSort;
    }

    public boolean isReverse() {
        return isReverse;
    }

}
