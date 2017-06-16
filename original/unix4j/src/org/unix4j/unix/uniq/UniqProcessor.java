package org.unix4j.unix.uniq;

import org.unix4j.context.ExecutionContext;
import org.unix4j.line.Line;
import org.unix4j.processor.AbstractLineProcessor;
import org.unix4j.processor.LineProcessor;

abstract class UniqProcessor extends AbstractLineProcessor<UniqArguments> {

	public UniqProcessor(UniqCommand command, ExecutionContext context, LineProcessor output) {
		super(command, context, output);
	}

	@Override
	public final boolean processLine(Line line) {
		return processLine(line, getOutput());
	}

	abstract protected boolean processLine(Line line, LineProcessor output);

}