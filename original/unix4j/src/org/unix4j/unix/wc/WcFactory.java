package org.unix4j.unix.wc;

import org.unix4j.unix.Wc;

/**
 * Factory for the {@link Wc wc} command returning 
 * a new command instance from every signature method.
 */
public final class WcFactory implements Wc.Interface<WcCommand> {
	
	/**
	 * The singleton instance of this factory.
	 */
	public static final WcFactory INSTANCE = new WcFactory();

	/**
	 * Private, only used to create singleton instance.
	 */
	private WcFactory() {
		super();
	}

	@Override
	public WcCommand wc() {
		final WcArguments wcArgs = new WcArguments();
		return new WcCommand(wcArgs);
	}

	@Override
	public WcCommand wc(String... args) {
		final WcArguments wcArgs = new WcArguments(args);
		return new WcCommand(wcArgs);
	}

	@Override
	public WcCommand wc(java.io.File... files) {
		final WcArguments wcArgs = new WcArguments();
		wcArgs.setFiles(files);
		return new WcCommand(wcArgs);
	}

	@Override
	public WcCommand wc(WcOptions options) {
		final WcArguments wcArgs = new WcArguments(options);
		return new WcCommand(wcArgs);
	}

	@Override
	public WcCommand wc(WcOptions options, java.io.File... files) {
		final WcArguments wcArgs = new WcArguments(options);
		wcArgs.setFiles(files);
		return new WcCommand(wcArgs);
	}

	@Override
	public WcCommand wc(WcOptions options, String[] paths) {
		final WcArguments wcArgs = new WcArguments(options);
		wcArgs.setPaths(paths);
		return new WcCommand(wcArgs);
	}
}
