package org.unix4j.unix.sed;

import org.unix4j.unix.Sed;

/**
 * Factory for the {@link Sed sed} command returning 
 * a new command instance from every signature method.
 */
public final class SedFactory implements Sed.Interface<SedCommand> {
	
	/**
	 * The singleton instance of this factory.
	 */
	public static final SedFactory INSTANCE = new SedFactory();

	/**
	 * Private, only used to create singleton instance.
	 */
	private SedFactory() {
		super();
	}

	@Override
	public SedCommand sed(String... args) {
		final SedArguments sedArgs = new SedArguments(args);
		return new SedCommand(sedArgs);
	}

	@Override
	public SedCommand sed(String script) {
		final SedArguments sedArgs = new SedArguments();
		sedArgs.setScript(script);
		return new SedCommand(sedArgs);
	}

	@Override
	public SedCommand sed(String regexp, String replacement) {
		final SedArguments sedArgs = new SedArguments();
		sedArgs.setRegexp(regexp);
		sedArgs.setReplacement(replacement);
		return new SedCommand(sedArgs);
	}

	@Override
	public SedCommand sed(String regexp, String replacement, int... occurrence) {
		final SedArguments sedArgs = new SedArguments();
		sedArgs.setRegexp(regexp);
		sedArgs.setReplacement(replacement);
		sedArgs.setOccurrence(occurrence);
		return new SedCommand(sedArgs);
	}

	@Override
	public SedCommand sed(SedOptions options, String regexp) {
		final SedArguments sedArgs = new SedArguments(options);
		sedArgs.setRegexp(regexp);
		return new SedCommand(sedArgs);
	}

	@Override
	public SedCommand sed(SedOptions options, String string1, String string2) {
		final SedArguments sedArgs = new SedArguments(options);
		sedArgs.setString1(string1);
		sedArgs.setString2(string2);
		return new SedCommand(sedArgs);
	}

	@Override
	public SedCommand sed(SedOptions options, String string1, String string2, int... occurrence) {
		final SedArguments sedArgs = new SedArguments(options);
		sedArgs.setString1(string1);
		sedArgs.setString2(string2);
		sedArgs.setOccurrence(occurrence);
		return new SedCommand(sedArgs);
	}
}
