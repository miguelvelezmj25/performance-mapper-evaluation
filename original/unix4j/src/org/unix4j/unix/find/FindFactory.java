package org.unix4j.unix.find;

import org.unix4j.unix.Find;

/**
 * Factory for the {@link Find find} command returning
 * a new command instance from every signature method.
 */
public final class FindFactory implements Find.Interface<FindCommand> {

    /**
     * The singleton instance of this factory.
     */
    public static final FindFactory INSTANCE = new FindFactory();

    /**
     * Private, only used to create singleton instance.
     */
    private FindFactory() {
        super();
    }

    @Override
    public FindCommand find(String... args) {
        final FindArguments findArgs = new FindArguments(args);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(String path) {
        final FindArguments findArgs = new FindArguments();
        findArgs.setPath(path);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(String path, String name) {
        final FindArguments findArgs = new FindArguments();
        findArgs.setPath(path);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(long size) {
        final FindArguments findArgs = new FindArguments();
        findArgs.setSize(size);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(String path, long size) {
        final FindArguments findArgs = new FindArguments();
        findArgs.setPath(path);
        findArgs.setSize(size);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(long size, String name) {
        final FindArguments findArgs = new FindArguments();
        findArgs.setSize(size);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(String path, long size, String name) {
        final FindArguments findArgs = new FindArguments();
        findArgs.setPath(path);
        findArgs.setSize(size);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, String name) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, String path, String name) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setPath(path);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, long size) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setSize(size);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, String path, long size) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setPath(path);
        findArgs.setSize(size);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, java.util.Date time) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setTime(time);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, String path, java.util.Date time) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setPath(path);
        findArgs.setTime(time);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, long size, String name) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setSize(size);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, String path, long size, String name) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setPath(path);
        findArgs.setSize(size);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, java.util.Date time, String name) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setTime(time);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, String path, java.util.Date time, String name) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setPath(path);
        findArgs.setTime(time);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, long size, java.util.Date time, String name) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setSize(size);
        findArgs.setTime(time);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }

    @Override
    public FindCommand find(FindOptions options, String path, long size, java.util.Date time, String name) {
        final FindArguments findArgs = new FindArguments(options);
        findArgs.setPath(path);
        findArgs.setSize(size);
        findArgs.setTime(time);
        findArgs.setName(name);
        return new FindCommand(findArgs);
    }
}
