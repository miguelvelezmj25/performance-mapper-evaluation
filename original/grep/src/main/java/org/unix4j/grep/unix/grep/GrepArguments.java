package org.unix4j.grep.unix.grep;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import org.unix4j.grep.util.ArrayUtil;

/**
 */
public final class GrepArguments {

    private boolean isIgnoreCase = false;
    private boolean isInvertMatch = false;
    private boolean isFixedStrings = false;
    private boolean isLineNumber = false;
    private boolean isCount = false;
    private boolean isMatchingFiles = false;
    private boolean isWholeLine = false;


//    private final GrepOptions options;


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
//    public GrepArguments() {
//        this.options = GrepOptions.EMPTY;
//    }

//    /**
//     * Constructor with option set containing the selected command options.
//     *
//     * @param options the selected options
//     * @throws NullPointerException if the argument is null
//     */
//    public GrepArguments(GrepOptions options) {
//        if(options == null) {
//            throw new NullPointerException("options argument cannot be null");
//        }
//        this.options = options;
//    }
    public GrepArguments(boolean isIgnoreCase, boolean isInvertMatch, boolean isFixedStrings, boolean isLineNumber,
                         boolean isCount, boolean isMatchingFiles, boolean isWholeLine) {
        this.isIgnoreCase = isIgnoreCase;
        this.isInvertMatch = isInvertMatch;
        this.isFixedStrings = isFixedStrings;
        this.isLineNumber = isLineNumber;
        this.isCount = isCount;
        this.isMatchingFiles = isMatchingFiles;
        this.isWholeLine = isWholeLine;


        Sink.sink(this.isIgnoreCase);
        Sink.sink(this.isInvertMatch);
        Sink.sink(this.isFixedStrings);
        Sink.sink(this.isLineNumber);
        Sink.sink(this.isCount);
        Sink.sink(this.isMatchingFiles);
        Sink.sink(this.isWholeLine);

    }

//    /**
//     * Constructor string arguments encoding options and arguments, possibly
//     * also containing variable expressions.
//     *
//     * @param args string arguments for the command
//     * @throws NullPointerException if args is null
//     */
//    public GrepArguments(String... args) {
//        this();
//        this.args = args;
//        this.argsIsSet = true;
//    }

    private static String toString(Object value) {
        if(value != null && value.getClass().isArray()) {
            return ArrayUtil.toString(value);
        }
        return String.valueOf(value);
    }

//    /**
//     * Returns the options set containing the selected command options. Returns
//     * an empty options set if no option has been selected.
//     *
//     * @return set with the selected options
//     */
//    public GrepOptions getOptions() {
//        return options;
//    }

    /**
     * Returns the {@code <regexp>} operand value (variables are NOT resolved): Lines will be printed which match the given regular expression. The
     * {@code regexp} string is surrounded with ".*" on both sides unless
     * the {@code --wholeLine} option is specified. If the
     * {@code --fixedStrings} option is used, plain string comparison is
     * used instead of regular expression matching.
     *
     * @return the {@code <regexp>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public String getRegexp() {
        if(regexpIsSet) {
            return regexp;
        }
        throw new IllegalStateException("operand has not been set: " + regexp);
    }

    /**
     * Sets {@code <regexp>}: Lines will be printed which match the given regular expression. The
     * {@code regexp} string is surrounded with ".*" on both sides unless
     * the {@code --wholeLine} option is specified. If the
     * {@code --fixedStrings} option is used, plain string comparison is
     * used instead of regular expression matching.
     *
     * @param regexp the value for the {@code <regexp>} operand
     */
    public void setRegexp(String regexp) {
        this.regexp = regexp;
        this.regexpIsSet = true;
    }

    /**
     * Returns true if the {@code <regexp>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setRegexp(String)} method.
     *
     * @return true if the setter for the {@code <regexp>} operand has
     * been called at least once
     */
    public boolean isRegexpSet() {
        return regexpIsSet;
    }

    /**
     * Returns the {@code <pattern>} operand value: Lines will be printed which match the given pattern.
     *
     * @return the {@code <pattern>} operand value (variables are not resolved)
     * @throws IllegalStateException if this operand has never been set
     */
    public java.util.regex.Pattern getPattern() {
        if(patternIsSet) {
            return pattern;
        }
        throw new IllegalStateException("operand has not been set: " + pattern);
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
     * Returns true if the {@code <pattern>} operand has been set.
     * <p>
     * Note that this method returns true even if {@code null} was passed to the
     * {@link #setPattern(java.util.regex.Pattern)} method.
     *
     * @return true if the setter for the {@code <pattern>} operand has
     * been called at least once
     */
    public boolean isPatternSet() {
        return patternIsSet;
    }

    /**
     * Returns the {@code <paths>} operand value: Pathnames of the input files to be searched for the pattern;
     * wildcards * and ? are supported; relative paths are resolved on the
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
     * Sets {@code <paths>}: Pathnames of the input files to be searched for the pattern;
     * wildcards * and ? are supported; relative paths are resolved on the
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
     * Returns the {@code <files>} operand value: The input files to be searched for the pattern; relative paths are
     * not resolved (use the string paths argument to enable relative path
     * resolving based on the current working directory).
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
     * Sets {@code <files>}: The input files to be searched for the pattern; relative paths are
     * not resolved (use the string paths argument to enable relative path
     * resolving based on the current working directory).
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
     * default "--pattern" and "--paths" operands have to be prefixed with
     * the operand name (e.g. "--files" for subsequent file operand values).
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

//    /**
//     * Returns true if the {@code --}{@link GrepOption#ignoreCase ignoreCase} option
//     * is set. The option is also known as {@code -}i option.
//     * <p>
//     * Description: Match lines ignoring the case when comparing the strings, also known
//     * from Unix with its acronym 'i'.
//     *
//     * @return true if the {@code --ignoreCase} or {@code -i} option is set
//     */
//    public boolean isIgnoreCase() {
//        return getOptions().isSet(GrepOption.ignoreCase);
//    }

    public boolean isIgnoreCase() {
        return this.isIgnoreCase;
    }

//    /**
//     * Returns true if the {@code --}{@link GrepOption#invertMatch invertMatch} option
//     * is set. The option is also known as {@code -}v option.
//     * <p>
//     * Description: Invert the match result, that is, a non-matching line is written to
//     * the output and a matching line is not. This option is also known
//     * from Unix with its acronym 'v'.
//     *
//     * @return true if the {@code --invertMatch} or {@code -v} option is set
//     */
//    public boolean isInvertMatch() {
//        return getOptions().isSet(GrepOption.invertMatch);
//    }

    public boolean isInvertMatch() {
        return this.isInvertMatch;
    }


//    /**
//     * Returns true if the {@code --}{@link GrepOption#fixedStrings fixedStrings} option
//     * is set. The option is also known as {@code -}F option.
//     * <p>
//     * Description: Use fixed-strings matching instead of regular expressions. This is
//     * usually faster than the standard regexp version.
//     * <p>
//     * (This option is ignored if a {@code pattern} operand is specified
//     * instead of the {@code regexp} string).
//     *
//     * @return true if the {@code --fixedStrings} or {@code -F} option is set
//     */
//    public boolean isFixedStrings() {
//        return getOptions().isSet(GrepOption.fixedStrings);
//    }


    public boolean isFixedStrings() {
        return this.isFixedStrings;
    }

//    /**
//     * Returns true if the {@code --}{@link GrepOption#lineNumber lineNumber} option
//     * is set. The option is also known as {@code -}n option.
//     * <p>
//     * Description: Prefix each line of output with the line number within its input
//     * file.
//     *
//     * @return true if the {@code --lineNumber} or {@code -n} option is set
//     */
//    public boolean isLineNumber() {
//        return getOptions().isSet(GrepOption.lineNumber);
//    }

    public boolean isLineNumber() {
        return this.isLineNumber;
    }


//    /**
//     * Returns true if the {@code --}{@link GrepOption#count count} option
//     * is set. The option is also known as {@code -}c option.
//     * <p>
//     * Description: Suppress normal output; instead print a count of matching lines for
//     * each input file. With the {@code -v}, {@code --invertMatch} option,
//     * count non-matching lines.
//     *
//     * @return true if the {@code --count} or {@code -c} option is set
//     */
//    public boolean isCount() {
//        return getOptions().isSet(GrepOption.count);
//    }

    public boolean isCount() {
        return this.isCount;
    }

//    /**
//     * Returns true if the {@code --}{@link GrepOption#matchingFiles matchingFiles} option
//     * is set. The option is also known as {@code -}l option.
//     * <p>
//     * Description: Suppress normal output; instead print the name of each input file
//     * from which output would normally have been printed. The scanning
//     * will stop on the first match.
//     *
//     * @return true if the {@code --matchingFiles} or {@code -l} option is set
//     */
//    public boolean isMatchingFiles() {
//        return getOptions().isSet(GrepOption.matchingFiles);
//    }


    public boolean isMatchingFiles() {
        return this.isMatchingFiles;
    }

//    /**
//     * Returns true if the {@code --}{@link GrepOption#wholeLine wholeLine} option
//     * is set. The option is also known as {@code -}x option.
//     * <p>
//     * Description: Select only those matches that exactly match the whole line
//     * excluding the terminating line ending.
//     * <p>
//     * (This option is ignored if a {@code pattern} operand is specified
//     * instead of the {@code regexp} string).
//     *
//     * @return true if the {@code --wholeLine} or {@code -x} option is set
//     */
//    public boolean isWholeLine() {
//        return getOptions().isSet(GrepOption.wholeLine);
//    }


    public boolean isWholeLine() {
        return this.isWholeLine;
    }

//    @Override
//    public String toString() {
//        // ok, we have options or arguments or both
//        final StringBuilder sb = new StringBuilder();
//
//        if(argsIsSet) {
//            for(String arg : args) {
//                if(sb.length() > 0) {
//                    sb.append(' ');
//                }
//                sb.append(arg);
//            }
//        }
//        else {
//
////            // first the options
////            if(options.size() > 0) {
////                sb.append(DefaultOptionSet.toString(options));
////            }
//            // operand: <regexp>
//            if(regexpIsSet) {
//                if(sb.length() > 0) {
//                    sb.append(' ');
//                }
//                sb.append("--").append("regexp");
//                sb.append(" ").append(toString(getRegexp()));
//            }
//            // operand: <pattern>
//            if(patternIsSet) {
//                if(sb.length() > 0) {
//                    sb.append(' ');
//                }
//                sb.append("--").append("pattern");
//                sb.append(" ").append(toString(getPattern()));
//            }
//            // operand: <paths>
//            if(pathsIsSet) {
//                if(sb.length() > 0) {
//                    sb.append(' ');
//                }
//                sb.append("--").append("paths");
//                sb.append(" ").append(toString(getPaths()));
//            }
//            // operand: <files>
//            if(filesIsSet) {
//                if(sb.length() > 0) {
//                    sb.append(' ');
//                }
//                sb.append("--").append("files");
//                sb.append(" ").append(toString(getFiles()));
//            }
//            // operand: <args>
//            if(argsIsSet) {
//                if(sb.length() > 0) {
//                    sb.append(' ');
//                }
//                sb.append("--").append("args");
//                sb.append(" ").append(toString(getArgs()));
//            }
//        }
//
//        return sb.toString();
//    }
}
