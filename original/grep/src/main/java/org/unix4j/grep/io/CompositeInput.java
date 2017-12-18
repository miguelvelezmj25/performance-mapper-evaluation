package org.unix4j.grep.io;

import org.unix4j.grep.line.Line;

import java.util.Arrays;
import java.util.List;

/**
 * An input composed from multiple other inputs returning all lines of the first
 * input, then all lines of the of the second input etc.
 */
public class CompositeInput extends AbstractInput {

    private final List<? extends Input> inputs;
    private int index;

    /**
     * Constructor with inputs to combine.
     *
     * @param inputs the inputs to combine
     */
    public CompositeInput(Input... inputs) {
        this(Arrays.asList(inputs));
    }

    /**
     * Constructor with inputs to combine.
     *
     * @param inputs the inputs to combine
     */
    public CompositeInput(List<? extends Input> inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean hasMoreLines() {
        while (index < inputs.size()) {
            if(inputs.get(index).hasMoreLines()) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Line readLine() {
        if(hasMoreLines()) {
            return inputs.get(index).readLine();
        }
        return null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(inputs=" + inputs + ")";
    }
}
