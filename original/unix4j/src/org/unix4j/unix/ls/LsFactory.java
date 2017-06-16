package org.unix4j.unix.ls;

import org.unix4j.unix.Ls;

/**
 * Factory for the {@link Ls ls} command returning 
 * a new command instance from every signature method.
 */
public final class LsFactory implements Ls.Interface<LsCommand> {
	
	/**
	 * The singleton instance of this factory.
	 */
	public static final LsFactory INSTANCE = new LsFactory();

	/**
	 * Private, only used to create singleton instance.
	 */
	private LsFactory() {
		super();
	}

	@Override
	public LsCommand ls() {
		final LsArguments lsArgs = new LsArguments();
		return new LsCommand(lsArgs);
	}

	@Override
	public LsCommand ls(String... args) {
		final LsArguments lsArgs = new LsArguments(args);
		return new LsCommand(lsArgs);
	}

	@Override
	public LsCommand ls(java.io.File... files) {
		final LsArguments lsArgs = new LsArguments();
		lsArgs.setFiles(files);
		return new LsCommand(lsArgs);
	}

	@Override
	public LsCommand ls(LsOptions options) {
		final LsArguments lsArgs = new LsArguments(options);
		return new LsCommand(lsArgs);
	}

	@Override
	public LsCommand ls(LsOptions options, java.io.File... files) {
		final LsArguments lsArgs = new LsArguments(options);
		lsArgs.setFiles(files);
		return new LsCommand(lsArgs);
	}

	@Override
	public LsCommand ls(LsOptions options, String... paths) {
		final LsArguments lsArgs = new LsArguments(options);
		lsArgs.setPaths(paths);
		return new LsCommand(lsArgs);
	}
}
