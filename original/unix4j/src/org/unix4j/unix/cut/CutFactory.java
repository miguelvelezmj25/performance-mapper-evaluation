package org.unix4j.unix.cut;

import org.unix4j.unix.Cut;

/**
 * Factory for the {@link Cut cut} command returning
 * a new command instance from every signature method.
 */
public final class CutFactory implements Cut.Interface<CutCommand> {

    /**
     * The singleton instance of this factory.
     */
    public static final CutFactory INSTANCE = new CutFactory();

    /**
     * Private, only used to create singleton instance.
     */
    private CutFactory() {
        super();
    }

    @Override
    public CutCommand cut(String... args) {
        final CutArguments cutArgs = new CutArguments(args);
        return new CutCommand(cutArgs);
    }

    @Override
    public CutCommand cut(CutOptions options, org.unix4j.util.Range range) {
        final CutArguments cutArgs = new CutArguments(options);
        cutArgs.setRange(range);
        return new CutCommand(cutArgs);
    }

    @Override
    public CutCommand cut(CutOptions options, int... indexes) {
        final CutArguments cutArgs = new CutArguments(options);
        cutArgs.setIndexes(indexes);
        return new CutCommand(cutArgs);
    }

    @Override
    public CutCommand cut(CutOptions options, String delimiter, org.unix4j.util.Range range) {
        final CutArguments cutArgs = new CutArguments(options);
        cutArgs.setDelimiter(delimiter);
        cutArgs.setRange(range);
        return new CutCommand(cutArgs);
    }

    @Override
    public CutCommand cut(CutOptions options, String delimiter, int... indexes) {
        final CutArguments cutArgs = new CutArguments(options);
        cutArgs.setDelimiter(delimiter);
        cutArgs.setIndexes(indexes);
        return new CutCommand(cutArgs);
    }

    @Override
    public CutCommand cut(CutOptions options, String delimiter, char outputDelimiter, org.unix4j.util.Range range) {
        final CutArguments cutArgs = new CutArguments(options);
        cutArgs.setDelimiter(delimiter);
        cutArgs.setOutputDelimiter(outputDelimiter);
        cutArgs.setRange(range);
        return new CutCommand(cutArgs);
    }

    @Override
    public CutCommand cut(CutOptions options, String delimiter, char outputDelimiter, int... indexes) {
        final CutArguments cutArgs = new CutArguments(options);
        cutArgs.setDelimiter(delimiter);
        cutArgs.setOutputDelimiter(outputDelimiter);
        cutArgs.setIndexes(indexes);
        return new CutCommand(cutArgs);
    }
}
