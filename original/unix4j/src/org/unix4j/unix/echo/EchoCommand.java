package org.unix4j.unix.echo;

import org.unix4j.command.AbstractCommand;
import org.unix4j.context.ExecutionContext;
import org.unix4j.line.Line;
import org.unix4j.line.SimpleLine;
import org.unix4j.processor.LineProcessor;
import org.unix4j.unix.Echo;

/**
 * Implementation of the {@link Echo echo} command.
 */
class EchoCommand extends AbstractCommand<EchoArguments> {
	public EchoCommand(EchoArguments arguments) {
		super(Echo.NAME, arguments);
	}

	@Override
	public LineProcessor execute(ExecutionContext context, final LineProcessor output) {
		final EchoArguments args = getArguments(context);
		return new LineProcessor() {
			@Override
			public boolean processLine(Line line) {
				return false;//we want no input lines
			}
			
			@Override
			public void finish() {
				final String message = getMessage();
				if (args.isNoNewline()) {
					output.processLine(new SimpleLine(message, ""));
				} else {
					output.processLine(new SimpleLine(message));
				}
				output.finish();
			}

			private String getMessage() {
				if (args.isStringSet()) {
					return args.getString();
				} else if (args.isStringsSet()) {
					final StringBuilder sb = new StringBuilder();
					for (final String string : args.getStrings()) {
						if (sb.length() > 0) sb.append(' ');
						sb.append(string);
					}
					return sb.toString();
				}
				return "";
			}
		};
	}
}
