package org.unix4j.unix.head;

import org.unix4j.unix.Head;

/**
 * Factory for the {@link Head head} command returning
 * a new command instance from every signature method.
 */
public final class HeadFactory implements Head.Interface<HeadCommand> {

    /**
     * The singleton instance of this factory.
     */
    public static final HeadFactory INSTANCE = new HeadFactory();

    /**
     * Private, only used to create singleton instance.
     */
    private HeadFactory() {
        super();
    }

    @Override
    public HeadCommand head() {
        final HeadArguments headArgs = new HeadArguments();
        return new HeadCommand(headArgs);
    }

    @Override
    public HeadCommand head(String... args) {
        final HeadArguments headArgs = new HeadArguments(args);
        return new HeadCommand(headArgs);
    }

    @Override
    public HeadCommand head(long count) {
        final HeadArguments headArgs = new HeadArguments();
        headArgs.setCount(count);
        return new HeadCommand(headArgs);
    }

    @Override
    public HeadCommand head(HeadOptions options, long count) {
        final HeadArguments headArgs = new HeadArguments(options);
        headArgs.setCount(count);
        return new HeadCommand(headArgs);
    }

    @Override
    public HeadCommand head(java.io.File... files) {
        final HeadArguments headArgs = new HeadArguments();
        headArgs.setFiles(files);
        return new HeadCommand(headArgs);
    }

    @Override
    public HeadCommand head(long count, java.io.File... files) {
        final HeadArguments headArgs = new HeadArguments();
        headArgs.setCount(count);
        headArgs.setFiles(files);
        return new HeadCommand(headArgs);
    }

    @Override
    public HeadCommand head(long count, String... paths) {
        final HeadArguments headArgs = new HeadArguments();
        headArgs.setCount(count);
        headArgs.setPaths(paths);
        return new HeadCommand(headArgs);
    }

    @Override
    public HeadCommand head(HeadOptions options, long count, java.io.File... files) {
        final HeadArguments headArgs = new HeadArguments(options);
        headArgs.setCount(count);
        headArgs.setFiles(files);
        return new HeadCommand(headArgs);
    }

    @Override
    public HeadCommand head(HeadOptions options, long count, String... paths) {
        final HeadArguments headArgs = new HeadArguments(options);
        headArgs.setCount(count);
        headArgs.setPaths(paths);
        return new HeadCommand(headArgs);
    }
}
