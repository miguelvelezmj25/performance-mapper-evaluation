package org.unix4j.unix.cd;

import org.unix4j.unix.Cd;

/**
 * Factory for the {@link Cd cd} command returning
 * a new command instance from every signature method.
 */
public final class CdFactory implements Cd.Interface<CdCommand> {

    /**
     * The singleton instance of this factory.
     */
    public static final CdFactory INSTANCE = new CdFactory();

    /**
     * Private, only used to create singleton instance.
     */
    private CdFactory() {
        super();
    }

    @Override
    public CdCommand cd() {
        final CdArguments cdArgs = new CdArguments();
        return new CdCommand(cdArgs);
    }

    @Override
    public CdCommand cd(java.io.File file) {
        final CdArguments cdArgs = new CdArguments();
        cdArgs.setFile(file);
        return new CdCommand(cdArgs);
    }

    @Override
    public CdCommand cd(String path) {
        final CdArguments cdArgs = new CdArguments();
        cdArgs.setPath(path);
        return new CdCommand(cdArgs);
    }
}
