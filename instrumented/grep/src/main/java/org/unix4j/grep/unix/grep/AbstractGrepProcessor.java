package org.unix4j.grep.unix.grep;

import org.unix4j.grep.context.ExecutionContext;
import org.unix4j.grep.line.Line;
import org.unix4j.grep.processor.AbstractLineProcessor;
import org.unix4j.grep.processor.LineProcessor;

abstract class AbstractGrepProcessor extends AbstractLineProcessor {

    private final LineMatcher matcher;

    public AbstractGrepProcessor(ExecutionContext context, LineProcessor output, LineMatcher matcher) {
        super(context, output);
        this.matcher = matcher;
    }

    @Override
    public boolean processLine(Line line) {
        final boolean isMatch = matcher.matches(line);
        return processLine(line, isMatch);
    }

    @Override
    public void finish() {
        getOutput().finish();
    }

    abstract protected boolean processLine(Line line, boolean isMatch);
}