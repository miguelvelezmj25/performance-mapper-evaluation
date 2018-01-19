package org.unix4j.find.processor;

import org.unix4j.find.context.ExecutionContext;

/**
 * Abstract base implementation for {@link LineProcessor} returned by the
 * execute method of commands constructed with a reference to the command plus
 * context and output passed to
 */
abstract public class AbstractLineProcessor implements LineProcessor {

    private final ExecutionContext context;
    private final LineProcessor output;

    /**
     * Constructor with command creating this processor, execution context and
     * output to write to.
     *
     * @param context the execution context passed to the command's execute method
     * @param output  the output object to write to when executing the command
     *                through this processor
     */
    public AbstractLineProcessor(ExecutionContext context, LineProcessor output) {
        this.context = context;
        this.output = output;
    }

    /**
     * Returns the execution context that was passed to the constructor
     *
     * @return the execution context
     */
    protected ExecutionContext getContext() {
        return context;
    }

    /**
     * Returns the output that was passed to the constructor of this line
     * processor, the object to write to when executing the command through the
     * this processor
     *
     * @return the output to write to when using this processor
     */
    protected LineProcessor getOutput() {
        return output;
    }
}