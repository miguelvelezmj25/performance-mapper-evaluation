package org.unix4j.grep.unix.grep;

import org.unix4j.grep.unix.Grep;

/**
 * Factory for the {@link Grep grep} command returning
 * a new command instance from every signature method.
 */
public final class GrepFactory implements Grep.Interface<GrepCommand> {

    /**
     * The singleton instance of this factory.
     */
    public static final GrepFactory INSTANCE = new GrepFactory();

    /**
     * Private, only used to create singleton instance.
     */
    private GrepFactory() {
        super();
    }

    @Override
    public GrepCommand grep(String... args) {
        final GrepArguments grepArgs = new GrepArguments(args);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(String regexp) {
        final GrepArguments grepArgs = new GrepArguments();
        grepArgs.setRegexp(regexp);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(String regexp, java.io.File... files) {
        final GrepArguments grepArgs = new GrepArguments();
        grepArgs.setRegexp(regexp);
        grepArgs.setFiles(files);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(java.util.regex.Pattern pattern) {
        final GrepArguments grepArgs = new GrepArguments();
        grepArgs.setPattern(pattern);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(java.util.regex.Pattern pattern, java.io.File... files) {
        final GrepArguments grepArgs = new GrepArguments();
        grepArgs.setPattern(pattern);
        grepArgs.setFiles(files);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(java.util.regex.Pattern pattern, String... paths) {
        final GrepArguments grepArgs = new GrepArguments();
        grepArgs.setPattern(pattern);
        grepArgs.setPaths(paths);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(GrepOptions options, String regexp) {
        final GrepArguments grepArgs = new GrepArguments(options);
        grepArgs.setRegexp(regexp);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(GrepOptions options, java.util.regex.Pattern pattern) {
        final GrepArguments grepArgs = new GrepArguments(options);
        grepArgs.setPattern(pattern);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(GrepOptions options, String regexp, java.io.File... files) {
        final GrepArguments grepArgs = new GrepArguments(options);
        grepArgs.setRegexp(regexp);
        grepArgs.setFiles(files);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(GrepOptions options, String regexp, String... paths) {
        final GrepArguments grepArgs = new GrepArguments(options);
        grepArgs.setRegexp(regexp);
        grepArgs.setPaths(paths);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(GrepOptions options, java.util.regex.Pattern pattern, java.io.File... files) {
        final GrepArguments grepArgs = new GrepArguments(options);
        grepArgs.setPattern(pattern);
        grepArgs.setFiles(files);
        return new GrepCommand(grepArgs);
    }

    @Override
    public GrepCommand grep(GrepOptions options, java.util.regex.Pattern pattern, String... paths) {
        final GrepArguments grepArgs = new GrepArguments(options);
        grepArgs.setPattern(pattern);
        grepArgs.setPaths(paths);
        return new GrepCommand(grepArgs);
    }

    public GrepCommand grep(boolean isIgnoreCase, boolean isInvertMatch, boolean isFixedStrings, boolean isLineNumber,
                            boolean isCount, boolean isMatchingFiles, boolean isWholeLine, String regexp, String... paths) {
        final GrepArguments grepArgs = new GrepArguments(isIgnoreCase, isInvertMatch, isFixedStrings, isLineNumber,
                isCount, isMatchingFiles, isWholeLine);
        grepArgs.setRegexp(regexp);
        grepArgs.setPaths(paths);
        return new GrepCommand(grepArgs);
    }

}