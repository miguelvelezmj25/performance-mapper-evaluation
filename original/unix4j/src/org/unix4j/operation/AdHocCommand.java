package org.unix4j.operation;

import org.unix4j.command.AbstractCommand;
import org.unix4j.command.Arguments;
import org.unix4j.context.ExecutionContext;
import org.unix4j.line.Line;
import org.unix4j.operation.AdHocCommand.Args;
import org.unix4j.processor.LineProcessor;

/**
 * Implementation of an ad-hoc command based on a {@link LineOperation}.
 */
public class AdHocCommand extends AbstractCommand<Args> {

	/**
	 * The "adhoc" name for this command.
	 */
	public static final String NAME = "adhoc";

	public AdHocCommand(LineOperation operation) {
		super(NAME, new Args(operation));
	}

	/**
	 * Arguments for {@link AdHocCommand}.
	 */
	public static final class Args implements Arguments<Args> {
		private final LineOperation operation;

		/**
		 * Constructor with the single operation argument passed to the
		 * constructor of {@link AdHocCommand}.
		 * 
		 * @param operation
		 *            the operation argument
		 */
		public Args(LineOperation operation) {
			if (operation == null) {
				throw new NullPointerException("operation cannot be null");
			}
			this.operation = operation;
		}

		public final LineOperation getOperation() {
			return operation;
		}

		@Override
		public Args getForContext(ExecutionContext context) {
			return this;// no variable args, hence the same for all contexts
		}

		@Override
		public String toString() {
			return "--operation " + operation;
		}
	}

	@Override
	public LineProcessor execute(final ExecutionContext context, final LineProcessor output) {
		return new LineProcessor() {
			final OperationOutput operationOutput = new OperationOutput(output);
			final LineOperation operation = getArguments(context).getOperation();

			@Override
			public boolean processLine(Line line) {
				operation.operate(context, line, operationOutput);
				return operationOutput.isOpen();
			}

			@Override
			public void finish() {
				operationOutput.close();
			}
		};
	}

	private static class OperationOutput implements LineProcessor {
		private final LineProcessor output;
		private boolean open = true;

		public OperationOutput(LineProcessor output) {
			this.output = output;
		}

		@Override
		public boolean processLine(Line line) {
			if (open) {
				open = output.processLine(line);
				return open;
			}
			return false;
		}

		@Override
		public void finish() {
			open = false;
		}

		public boolean isOpen() {
			return open;
		}

		public void close() {
			finish();
			output.finish();
		}
	}

}
