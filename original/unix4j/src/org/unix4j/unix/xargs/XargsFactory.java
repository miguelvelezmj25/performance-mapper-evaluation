package org.unix4j.unix.xargs;

import org.unix4j.unix.Xargs;

/**
 * Factory for the {@link Xargs xargs} command returning
 * a new command instance from every signature method.
 */
public final class XargsFactory implements Xargs.Interface<XargsCommand> {

    /**
     * The singleton instance of this factory.
     */
    public static final XargsFactory INSTANCE = new XargsFactory();

    /**
     * Private, only used to create singleton instance.
     */
    private XargsFactory() {
        super();
    }

    @Override
    public XargsCommand xargs() {
        final XargsArguments xargsArgs = new XargsArguments();
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(String... args) {
        final XargsArguments xargsArgs = new XargsArguments(args);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(String delimiter) {
        final XargsArguments xargsArgs = new XargsArguments();
        xargsArgs.setDelimiter(delimiter);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(long maxLines) {
        final XargsArguments xargsArgs = new XargsArguments();
        xargsArgs.setMaxLines(maxLines);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments();
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(long maxLines, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments();
        xargsArgs.setMaxLines(maxLines);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(String delimiter, long maxLines) {
        final XargsArguments xargsArgs = new XargsArguments();
        xargsArgs.setDelimiter(delimiter);
        xargsArgs.setMaxLines(maxLines);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(String delimiter, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments();
        xargsArgs.setDelimiter(delimiter);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(String delimiter, long maxLines, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments();
        xargsArgs.setDelimiter(delimiter);
        xargsArgs.setMaxLines(maxLines);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(String delimiter, String eof, long maxLines, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments();
        xargsArgs.setDelimiter(delimiter);
        xargsArgs.setEof(eof);
        xargsArgs.setMaxLines(maxLines);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options, String delimiter) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        xargsArgs.setDelimiter(delimiter);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options, long maxLines) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        xargsArgs.setMaxLines(maxLines);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options, long maxLines, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        xargsArgs.setMaxLines(maxLines);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options, String delimiter, long maxLines) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        xargsArgs.setDelimiter(delimiter);
        xargsArgs.setMaxLines(maxLines);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options, String delimiter, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        xargsArgs.setDelimiter(delimiter);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options, String delimiter, long maxLines, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        xargsArgs.setDelimiter(delimiter);
        xargsArgs.setMaxLines(maxLines);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }

    @Override
    public XargsCommand xargs(XargsOptions options, String delimiter, String eof, long maxLines, int maxArgs) {
        final XargsArguments xargsArgs = new XargsArguments(options);
        xargsArgs.setDelimiter(delimiter);
        xargsArgs.setEof(eof);
        xargsArgs.setMaxLines(maxLines);
        xargsArgs.setMaxArgs(maxArgs);
        return new XargsCommand(xargsArgs);
    }
}
