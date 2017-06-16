package org.unix4j.unix.tail;

import java.util.LinkedList;

import org.unix4j.context.ExecutionContext;
import org.unix4j.line.Line;
import org.unix4j.processor.LineProcessor;

class TailLinesFromEndProcessor extends AbstractTailProcessor {
	
	private final LinkedList<Line> tailLines = new LinkedList<Line>();

    @Override
    public void resetCountersAndFlush() {
        final LineProcessor output = getOutput();
        boolean more = true;
        while (!tailLines.isEmpty() && more) {
            more = output.processLine(tailLines.removeFirst());//remove to free memory
        }
        tailLines.clear();
    }

    public TailLinesFromEndProcessor(TailCommand command, ExecutionContext context, LineProcessor output) {
		super(command, context, output);
	}

	@Override
	public boolean processLine(Line line) {
		tailLines.add(line);
		if (tailLines.size() > count) {
			tailLines.removeFirst();
		}
		return true;//we want all lines
	}

	@Override
	public void finish() {
		final LineProcessor output = getOutput();
		resetCountersAndFlush();
		output.finish();
	}
}
