package org.unix4j.sed.unix.sed;

import org.unix4j.sed.line.Line;
import org.unix4j.sed.line.SimpleLine;
import org.unix4j.sed.processor.LineProcessor;

class InsertProcessor extends AbstractTextProcessor {
    public InsertProcessor(Command command, SedArguments args, LineProcessor output) {
        super(command, args, output);
    }

    public InsertProcessor(Command command, String script, SedArguments args, LineProcessor output) {
        super(command, script, args, output);
    }

    @Override
    public boolean processLine(Line line) {
        final boolean matches = regexp.matcher(line).find();
        if(matches) {
            if(!output.processLine(new SimpleLine(text, line.getLineEnding()))) {
                return false;
            }
        }
        if(matches || !args.isQuiet()) {
            return output.processLine(line);
        }
        return true;
    }
}