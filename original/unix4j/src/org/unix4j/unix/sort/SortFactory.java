package org.unix4j.unix.sort;

import org.unix4j.unix.Sort;

/**
 * Factory for the {@link Sort sort} command returning 
 * a new command instance from every signature method.
 */
public final class SortFactory implements Sort.Interface<SortCommand> {
	
	/**
	 * The singleton instance of this factory.
	 */
	public static final SortFactory INSTANCE = new SortFactory();

	/**
	 * Private, only used to create singleton instance.
	 */
	private SortFactory() {
		super();
	}

	@Override
	public SortCommand sort() {
		final SortArguments sortArgs = new SortArguments();
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(String... args) {
		final SortArguments sortArgs = new SortArguments(args);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(java.io.File... files) {
		final SortArguments sortArgs = new SortArguments();
		sortArgs.setFiles(files);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(java.util.Comparator<? super org.unix4j.line.Line> comparator) {
		final SortArguments sortArgs = new SortArguments();
		sortArgs.setComparator(comparator);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(java.util.Comparator<? super org.unix4j.line.Line> comparator, java.io.File... files) {
		final SortArguments sortArgs = new SortArguments();
		sortArgs.setComparator(comparator);
		sortArgs.setFiles(files);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(java.util.Comparator<? super org.unix4j.line.Line> comparator, String... paths) {
		final SortArguments sortArgs = new SortArguments();
		sortArgs.setComparator(comparator);
		sortArgs.setPaths(paths);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(SortOptions options) {
		final SortArguments sortArgs = new SortArguments(options);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(SortOptions options, java.io.File... files) {
		final SortArguments sortArgs = new SortArguments(options);
		sortArgs.setFiles(files);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(SortOptions options, String... paths) {
		final SortArguments sortArgs = new SortArguments(options);
		sortArgs.setPaths(paths);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator) {
		final SortArguments sortArgs = new SortArguments(options);
		sortArgs.setComparator(comparator);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator, java.io.File... files) {
		final SortArguments sortArgs = new SortArguments(options);
		sortArgs.setComparator(comparator);
		sortArgs.setFiles(files);
		return new SortCommand(sortArgs);
	}

	@Override
	public SortCommand sort(SortOptions options, java.util.Comparator<? super org.unix4j.line.Line> comparator, String... paths) {
		final SortArguments sortArgs = new SortArguments(options);
		sortArgs.setComparator(comparator);
		sortArgs.setPaths(paths);
		return new SortCommand(sortArgs);
	}
}
