package org.unix4j.unix.from;

import org.unix4j.unix.From;

/**
 * Factory for the {@link From from} command returning
 * a new command instance from every signature method.
 */
public final class FromFactory implements From.Interface<FromCommand> {

    /**
     * The singleton instance of this factory.
     */
    public static final FromFactory INSTANCE = new FromFactory();

    /**
     * Private, only used to create singleton instance.
     */
    private FromFactory() {
        super();
    }

    @Override
    public FromCommand fromString(String string) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(new org.unix4j.io.StringInput(string));
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand fromStrings(String... strings) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(new org.unix4j.io.StringInput(strings));
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand from(java.util.Collection<? extends String> lines) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(new org.unix4j.io.StringInput(lines));
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand fromFile(String path) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setPath(path);
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand fromFile(java.io.File file) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(new org.unix4j.io.FileInput(file));
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand fromResource(String resource) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(new org.unix4j.io.ResourceInput(resource));
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand from(java.io.InputStream stream) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(new org.unix4j.io.StreamInput(stream));
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand from(java.io.Reader reader) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(new org.unix4j.io.ReaderInput(reader));
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand from(java.net.URL url) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(new org.unix4j.io.URLInput(url));
        return new FromCommand(fromArgs);
    }

    @Override
    public FromCommand from(org.unix4j.io.Input input) {
        final FromArguments fromArgs = new FromArguments();
        fromArgs.setInput(input);
        return new FromCommand(fromArgs);
    }
}
