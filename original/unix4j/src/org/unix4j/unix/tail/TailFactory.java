package org.unix4j.unix.tail;

import org.unix4j.unix.Tail;

/**
 * Factory for the {@link Tail tail} command returning
 * a new command instance from every signature method.
 */
public final class TailFactory implements Tail.Interface<TailCommand> {

    /**
     * The singleton instance of this factory.
     */
    public static final TailFactory INSTANCE = new TailFactory();

    /**
     * Private, only used to create singleton instance.
     */
    private TailFactory() {
        super();
    }

    @Override
    public TailCommand tail() {
        final TailArguments tailArgs = new TailArguments();
        return new TailCommand(tailArgs);
    }

    @Override
    public TailCommand tail(String... args) {
        final TailArguments tailArgs = new TailArguments(args);
        return new TailCommand(tailArgs);
    }

    @Override
    public TailCommand tail(long count) {
        final TailArguments tailArgs = new TailArguments();
        tailArgs.setCount(count);
        return new TailCommand(tailArgs);
    }

    @Override
    public TailCommand tail(TailOptions options, long count) {
        final TailArguments tailArgs = new TailArguments(options);
        tailArgs.setCount(count);
        return new TailCommand(tailArgs);
    }

    @Override
    public TailCommand tail(java.io.File... files) {
        final TailArguments tailArgs = new TailArguments();
        tailArgs.setFiles(files);
        return new TailCommand(tailArgs);
    }

    @Override
    public TailCommand tail(long count, java.io.File... files) {
        final TailArguments tailArgs = new TailArguments();
        tailArgs.setCount(count);
        tailArgs.setFiles(files);
        return new TailCommand(tailArgs);
    }

    @Override
    public TailCommand tail(long count, String... paths) {
        final TailArguments tailArgs = new TailArguments();
        tailArgs.setCount(count);
        tailArgs.setPaths(paths);
        return new TailCommand(tailArgs);
    }

    @Override
    public TailCommand tail(TailOptions options, long count, java.io.File... files) {
        final TailArguments tailArgs = new TailArguments(options);
        tailArgs.setCount(count);
        tailArgs.setFiles(files);
        return new TailCommand(tailArgs);
    }

    @Override
    public TailCommand tail(TailOptions options, long count, String... paths) {
        final TailArguments tailArgs = new TailArguments(options);
        tailArgs.setCount(count);
        tailArgs.setPaths(paths);
        return new TailCommand(tailArgs);
    }
}
