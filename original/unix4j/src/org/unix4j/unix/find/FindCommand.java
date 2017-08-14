package org.unix4j.unix.find;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import org.unix4j.command.AbstractCommand;
import org.unix4j.context.ExecutionContext;
import org.unix4j.line.Line;
import org.unix4j.line.SimpleLine;
import org.unix4j.processor.LineProcessor;
import org.unix4j.unix.Find;
import org.unix4j.util.FileUtil;
import org.unix4j.util.RelativePathBase;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * Implementation of the {@link Find find} command.
 */
class FindCommand extends AbstractCommand<FindArguments> {

    private final FileFilter staticFileFilter;
    private final RegexFilter regexFilter;
    private final String lineEnding;

    public FindCommand(FindArguments args) {
        super(Find.NAME, args);
        this.regexFilter = createRegexFilterFromArgs(args);
        this.staticFileFilter = createFileFilterFromArgs(args);
        this.lineEnding = args.isPrint0() ? String.valueOf(Line.ZERO) : Line.LINE_ENDING;
    }

    private RegexFilter createRegexFilterFromArgs(FindArguments args) {
        if(Sink.getDecision(args.isNameSet())) {
            if(Sink.getDecision(args.isRegex())) {
                return new RegexFilter(args.getName(), args.isIgnoreCase());
            }
        }
        //no regex filter
        return null;
    }

    private FileFilter createFileFilterFromArgs(FindArguments args) {
        final CompositeFileFilter filter = new CompositeFileFilter();
        if(Sink.getDecision(args.isNameSet())) {
            final String name = args.getName();
            if(Sink.getDecision(!args.isRegex())) {
                if(Sink.getDecision(name.contains("*") || name.contains("?"))) {
                    final String pattern = name.replace(".", "\\.").replace('?', '.').replace("*", ".*");
                    filter.add(new RegexFilter(pattern, args.isIgnoreCase()));
                }
                else {
                    filter.add(new NameFilter(name, args.isIgnoreCase()));
                }
            }
        }
        if(Sink.getDecision(args.isSizeSet())) {
            filter.add(new SizeFilter(args.getSize()));
        }
        if(Sink.getDecision(args.isTimeSet())) {
            filter.add(new TimeFilter(args.getTime(), args.getOptions()));
        }
        filter.addIfNotNull(TypeFilter.valueOf(args.getOptions()));
        return filter.simplify();
    }

    private List<File> getArgumentPaths(ExecutionContext context, FindArguments args) {
        if(Sink.getDecision(args.isPathSet())) {
            return FileUtil.expandFiles(context.getCurrentDirectory(), args.getPath());
        }
        else {
            //no input files or paths ==> use just the current directory
            final ArrayList<File> list = new ArrayList<File>(1);
            list.add(context.getCurrentDirectory());
            return list;
        }
    }

    @Override
    public LineProcessor execute(final ExecutionContext context, final LineProcessor output) {
        final FindArguments args = getArguments(context);
        final List<File> paths = getArgumentPaths(context, args);
        return new LineProcessor() {
            @Override
            public boolean processLine(Line line) {
                return false;//we ignore all input
            }

            @Override
            public void finish() {
                final RelativePathBase base = new RelativePathBase(context.getCurrentDirectory(), RelativePathBase.CHILDREN_WITHOUT_PREFIX);
                final FileFilter fileFilter = getFileFilterFor(base);
                for(File path : paths) {
                    final boolean keepGoing;

                    path = context.getRelativeToCurrentDirectory(path);
                    if(Sink.getDecision(!path.exists())) {
                        keepGoing = output.processLine(new SimpleLine(format("find: `%s': No such file or directory", path), lineEnding));
                    }
                    else if(Sink.getDecision(path.isDirectory())) {
                        keepGoing = listFiles(fileFilter, base, path, output, args);
                    }
                    else {
                        keepGoing = outputFileLine(fileFilter, output, base, path);
                    }
                    if(Sink.getDecision(!keepGoing)) {
                        break;
                    }
                }
                output.finish();
            }

            private FileFilter getFileFilterFor(RelativePathBase base) {
                if(Sink.getDecision(regexFilter == null)) {
                    return staticFileFilter;
                }
                final CompositeFileFilter compositeFilter = new CompositeFileFilter();
                compositeFilter.add(staticFileFilter);
                compositeFilter.add(regexFilter.getRelativePathFilterForBase(base));
                return compositeFilter;
            }
        };
    }

    private boolean listFiles(FileFilter fileFilter, RelativePathBase relativeTo, File parent, LineProcessor output, FindArguments args) {
        //print directory files and recurse
        if(Sink.getDecision(outputFileLine(fileFilter, output, relativeTo, parent))) {
            final List<File> files = FileUtil.toList(parent.listFiles());
            for(File file : files) {
                //System.out.println("Examining file: " + file.getAbsolutePath());
                if(Sink.getDecision(file.isDirectory())) {
                    if(Sink.getDecision(!listFiles(fileFilter, relativeTo, file, output, args))) {
                        return false;
                    }
                }
                else {
                    if(Sink.getDecision(!outputFileLine(fileFilter, output, relativeTo, file))) {
                        return false;
                    }
                }
            }
        }
        return true;//we want more output
    }

    private boolean outputFileLine(FileFilter fileFilter, LineProcessor output, RelativePathBase relativeTo, File file) {
        if(Sink.getDecision(fileFilter.accept(file))) {
            final String filePath = relativeTo.getRelativePathFor(file);
            return output.processLine(new SimpleLine(filePath, lineEnding));
        }
        return true;
    }
}