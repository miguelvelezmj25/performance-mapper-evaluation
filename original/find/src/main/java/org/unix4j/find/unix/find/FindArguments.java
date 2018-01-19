package org.unix4j.find.unix.find;

/**
 *
 */
public final class FindArguments {

    private boolean isTypeDirectory;
    private boolean isTypeFile;
    private boolean isTypeSymlink;
    private boolean isTypeOther;
    private boolean isRegex;
    private boolean isIgnoreCase;
    private boolean isTimeNewer;
    private boolean isTimeOlder;
    private boolean isTimeCreate;
    private boolean isTimeAccess;
    private boolean isTimeModified;
    private boolean isPrint0;
    private boolean isSize;

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

    public FindArguments(boolean isTypeDirectory, boolean isTypeFile, boolean isTypeSymlink, boolean isTypeOther,
                         boolean isRegex, boolean isIgnoreCase, boolean isTimeNewer, boolean isTimeOlder,
                         boolean isTimeCreate, boolean isTimeAccess, boolean isTimeModified, boolean isPrint0) {//,
//                         boolean isSize) {
        this.isTypeDirectory = isTypeDirectory;
        this.isTypeFile = isTypeFile;
        this.isTypeSymlink = isTypeSymlink;
        this.isTypeOther = isTypeOther;
        this.isRegex = isRegex;
        this.isIgnoreCase = isIgnoreCase;
        this.isTimeNewer = isTimeNewer;
        this.isTimeOlder = isTimeOlder;
        this.isTimeCreate = isTimeCreate;
        this.isTimeAccess = isTimeAccess;
        this.isTimeModified = isTimeModified;
        this.isPrint0 = isPrint0;
//        this.isSize = isSize;
    }

    /**
     * Returns the {@code <path>} operand value (variables are NOT resolved): Starting point for the search in the directory hierarchy;
     * wildcards * and ? are supported; relative paths are resolved on the
     * basis of the current working directory.
     *
     * @return the {@code <path>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public String getPath() {
        if(pathIsSet) {
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
     */
    public String getName() {
        if(nameIsSet) {
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
        if(sizeIsSet) {
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
        if(timeIsSet) {
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

    public boolean isTypeDirectory() {
        return isTypeDirectory;
    }

    public boolean isTypeFile() {
        return isTypeFile;
    }

    public boolean isTypeSymlink() {
        return isTypeSymlink;
    }

    public boolean isTypeOther() {
        return isTypeOther;
    }

    public boolean isRegex() {
        return isRegex;
    }

    public boolean isIgnoreCase() {
        return isIgnoreCase;
    }

    public boolean isTimeNewer() {
        return isTimeNewer;
    }

    public boolean isTimeOlder() {
        return isTimeOlder;
    }

    public boolean isTimeCreate() {
        return isTimeCreate;
    }

    public boolean isTimeAccess() {
        return isTimeAccess;
    }

    public boolean isTimeModified() {
        return isTimeModified;
    }

    public boolean isPrint0() {
        return isPrint0;
    }

}
