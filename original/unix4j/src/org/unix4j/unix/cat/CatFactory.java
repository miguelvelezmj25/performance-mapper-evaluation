package org.unix4j.unix.cat;

import org.unix4j.unix.Cat;

/**
 * Factory for the {@link Cat cat} command returning 
 * a new command instance from every signature method.
 */
public final class CatFactory implements Cat.Interface<CatCommand> {
	
	/**
	 * The singleton instance of this factory.
	 */
	public static final CatFactory INSTANCE = new CatFactory();

	/**
	 * Private, only used to create singleton instance.
	 */
	private CatFactory() {
		super();
	}

	@Override
	public CatCommand cat() {
		final CatArguments catArgs = new CatArguments();
		return new CatCommand(catArgs);
	}

	@Override
	public CatCommand cat(String... args) {
		final CatArguments catArgs = new CatArguments(args);
		return new CatCommand(catArgs);
	}

	@Override
	public CatCommand cat(java.io.File... files) {
		final CatArguments catArgs = new CatArguments();
		catArgs.setFiles(files);
		return new CatCommand(catArgs);
	}

	@Override
	public CatCommand cat(CatOptions options) {
		final CatArguments catArgs = new CatArguments(options);
		return new CatCommand(catArgs);
	}

	@Override
	public CatCommand cat(CatOptions options, java.io.File... files) {
		final CatArguments catArgs = new CatArguments(options);
		catArgs.setFiles(files);
		return new CatCommand(catArgs);
	}

	@Override
	public CatCommand cat(CatOptions options, String... paths) {
		final CatArguments catArgs = new CatArguments(options);
		catArgs.setPaths(paths);
		return new CatCommand(catArgs);
	}
}
