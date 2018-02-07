package org.unix4j.sort.io;

import org.unix4j.sort.line.Line;
import org.unix4j.sort.processor.LineProcessor;

/**
 * Represents a line-by-line output device. This interface does not add any
 * functionality but refines the documentation for the generally defined methods
 * from {@link LineProcessor}.
 */
public interface Output extends LineProcessor {
    /**
     * Writes a line to the output.
     *
     * @param line the line to write to the output.
     * @return true if this {@code Output} device is ready to process more
     * lines, and false otherwise; output devices usually return true
     */
    @Override
    boolean processLine(Line line);

    /**
     * Indicates that all output has been written. Usually triggers a flush
     * operation or closes the underlying reader or stream.
     */
    @Override
    void finish();
}
