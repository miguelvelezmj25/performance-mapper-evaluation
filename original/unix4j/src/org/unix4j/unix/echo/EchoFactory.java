package org.unix4j.unix.echo;

import org.unix4j.unix.Echo;

/**
 * Factory for the {@link Echo echo} command returning 
 * a new command instance from every signature method.
 */
public final class EchoFactory implements Echo.Interface<EchoCommand> {
	
	/**
	 * The singleton instance of this factory.
	 */
	public static final EchoFactory INSTANCE = new EchoFactory();

	/**
	 * Private, only used to create singleton instance.
	 */
	private EchoFactory() {
		super();
	}

	@Override
	public EchoCommand echo(String... args) {
		final EchoArguments echoArgs = new EchoArguments(args);
		return new EchoCommand(echoArgs);
	}

	@Override
	public EchoCommand echo(EchoOptions options, String string) {
		final EchoArguments echoArgs = new EchoArguments(options);
		echoArgs.setString(string);
		return new EchoCommand(echoArgs);
	}

	@Override
	public EchoCommand echo(EchoOptions options, String... strings) {
		final EchoArguments echoArgs = new EchoArguments(options);
		echoArgs.setStrings(strings);
		return new EchoCommand(echoArgs);
	}
}
