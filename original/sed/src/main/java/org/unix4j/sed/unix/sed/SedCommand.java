package org.unix4j.sed.unix.sed;

import org.unix4j.sed.context.ExecutionContext;
import org.unix4j.sed.processor.LineProcessor;

/**
 * Implementation of the {@link Sed sed} command.
 */
public class SedCommand {

    private SedArguments arguments;

    public SedCommand(SedArguments arguments) {
        this.arguments = arguments;
    }

    public LineProcessor execute(ExecutionContext context, final LineProcessor output) {
        final SedArguments args = this.arguments;
        if(args.isScriptSet()) {
            //command specified in script
            final String script = args.getScript();
            final Command command = Command.fromScript(script);
            if(command == null) {
                throw new IllegalArgumentException("command missing or invalid in sed script: " + script);
            }
            return command.createProcessorFor(script, args, output);
        }

        //command from args, or default if not specified
        Command command = Command.fromArgs(args);
        if(command == null) {
            //default command
            if(args.isReplacementSet() || args.isString2Set()) {
                command = Command.substitute;
            }
            else {
                command = Command.print;
            }
        }
        return command.createProcessorFor(args, output);
    }
}
