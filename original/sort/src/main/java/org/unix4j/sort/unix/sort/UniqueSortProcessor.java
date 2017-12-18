package org.unix4j.sort.unix.sort;

import org.unix4j.sort.context.ExecutionContext;
import org.unix4j.sort.line.Line;
import org.unix4j.sort.processor.LineProcessor;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

class UniqueSortProcessor extends AbstractSortProcessor {

    private final NavigableSet<Line> uniqueLines;

    public UniqueSortProcessor(ExecutionContext context, LineProcessor output, SortArguments arguments) {
        super(context, output, arguments);
        this.uniqueLines = new TreeSet<>(getComparator());
    }

    @Override
    public boolean processLine(Line line) {
        uniqueLines.add(line);//duplicate lines are not even added
        return true;//we want all lines
    }

    @Override
    public void finish() {
        final LineProcessor output = getOutput();
        final Iterator<Line> it = uniqueLines.iterator();
        while(it.hasNext()) {
            final Line line = it.next();
            if(!output.processLine(line)) {
                break;//they want no more lines
            }
            it.remove();//remove to free some memory
        }
        uniqueLines.clear();
        output.finish();
    }

}
