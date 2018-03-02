package org.unix4j.sort.unix.sort;

import org.unix4j.sort.command.ExitValueException;
import org.unix4j.sort.context.ExecutionContext;
import org.unix4j.sort.line.Line;
import org.unix4j.sort.processor.LineProcessor;

/**
 * Checks whether a file is sorted or not, throws an
 * if the file is not sorted.
 */
class CheckProcessor extends AbstractSortProcessor {

    private Line lastLine = null;

    public CheckProcessor(ExecutionContext context, LineProcessor output, SortArguments arguments) {
        super(context, output, arguments);
    }

    @Override
    public boolean processLine(Line line) {
        if(lastLine != null) {
            if(getComparator().compare(lastLine, line) > 0) {
                throw new ExitValueException("file is not sorted, line: " + line, 1);
            }
        }
        lastLine = line;
        return true;//we want all lines
    }

    @Override
    public void finish() {
        getOutput().finish();
    }

    /**
     * Resets the last line, for instance when a new file should be checked.
     */
    public void reset() {
        lastLine = null;
    }

}
