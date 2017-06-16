package org.unix4j.unix.uniq;

import org.unix4j.unix.Uniq;

/**
 * Factory for the {@link Uniq uniq} command returning 
 * a new command instance from every signature method.
 */
public final class UniqFactory implements Uniq.Interface<UniqCommand> {
	
	/**
	 * The singleton instance of this factory.
	 */
	public static final UniqFactory INSTANCE = new UniqFactory();

	/**
	 * Private, only used to create singleton instance.
	 */
	private UniqFactory() {
		super();
	}

	@Override
	public UniqCommand uniq() {
		final UniqArguments uniqArgs = new UniqArguments();
		return new UniqCommand(uniqArgs);
	}

	@Override
	public UniqCommand uniq(String... args) {
		final UniqArguments uniqArgs = new UniqArguments(args);
		return new UniqCommand(uniqArgs);
	}

	@Override
	public UniqCommand uniq(java.io.File file) {
		final UniqArguments uniqArgs = new UniqArguments();
		uniqArgs.setFile(file);
		return new UniqCommand(uniqArgs);
	}

	@Override
	public UniqCommand uniq(String path) {
		final UniqArguments uniqArgs = new UniqArguments();
		uniqArgs.setPath(path);
		return new UniqCommand(uniqArgs);
	}

	@Override
	public UniqCommand uniq(UniqOptions options) {
		final UniqArguments uniqArgs = new UniqArguments(options);
		return new UniqCommand(uniqArgs);
	}

	@Override
	public UniqCommand uniq(UniqOptions options, java.io.File file) {
		final UniqArguments uniqArgs = new UniqArguments(options);
		uniqArgs.setFile(file);
		return new UniqCommand(uniqArgs);
	}

	@Override
	public UniqCommand uniq(UniqOptions options, String path) {
		final UniqArguments uniqArgs = new UniqArguments(options);
		uniqArgs.setPath(path);
		return new UniqCommand(uniqArgs);
	}
}
