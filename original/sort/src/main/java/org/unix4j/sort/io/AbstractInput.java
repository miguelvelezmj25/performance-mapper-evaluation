package org.unix4j.sort.io;

import org.unix4j.sort.line.Line;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Base implementation for {@link Input} providing the
 * {@link #iterator() iterator()} method.
 */
abstract public class AbstractInput implements Input {

    @Override
    public Iterator<Line> iterator() {
        return new Iterator<Line>() {
            @Override
            public boolean hasNext() {
                return hasMoreLines();
            }

            @Override
            public Line next() {
                final Line line = readLine();
                if(line != null) {
                    return line;
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove is not supported");
            }
        };
    }

}