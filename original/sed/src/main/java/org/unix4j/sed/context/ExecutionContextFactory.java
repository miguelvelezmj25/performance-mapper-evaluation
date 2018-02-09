package org.unix4j.sed.context;

/**
 * Factory for an {@link ExecutionContext}.
 */
public interface ExecutionContextFactory {
    /**
     * Creates and returns a new execution context instance.
     *
     * @return a new execution context instance
     */
    ExecutionContext createExecutionContext();
}
