package org.unix4j.grep.processor;

import org.unix4j.grep.io.Input;
import org.unix4j.grep.line.Line;

/**
 * The {@code DefaultInputProcessor} simply writes every line passed to
 * {@link #processLine(Input, Line, LineProcessor)} to the output. Subclasses
 * often override some of the methods to enhance or modify this default
 * behavior.
 */
public class DefaultInputProcessor implements InputProcessor {

    @Override
    public void begin(Input input, LineProcessor output) {
        // default: no op
    }

    @Override
    public boolean processLine(Input input, Line line, LineProcessor output) {
        output.processLine(line);
        return true;// we want all lines for this default implementation
    }

    @Override
    public boolean processLine(Line line) {
        return true;
    }

    @Override
    public void finish(Input input, LineProcessor output) {
        //default: no op
    }

}
