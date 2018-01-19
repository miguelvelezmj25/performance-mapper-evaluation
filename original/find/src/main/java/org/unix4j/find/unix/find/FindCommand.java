package org.unix4j.find.unix.find;

import org.unix4j.find.context.ExecutionContext;
import org.unix4j.find.line.Line;
import org.unix4j.find.line.SimpleLine;
import org.unix4j.find.processor.LineProcessor;
import org.unix4j.find.util.FileUtil;
import org.unix4j.find.util.RelativePathBase;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 *
 */
public class FindCommand {

    private final FileFilter staticFileFilter;
    private final RegexFilter regexFilter;
    private final String lineEnding;
    private FindArguments arguments;

    public FindCommand(FindArguments args) {
        this.arguments = args;
        this.regexFilter = createRegexFilterFromArgs(args);
        this.staticFileFilter = createFileFilterFromArgs(args);
        this.lineEnding = args.isPrint0() ? String.valueOf(Line.ZERO) : Line.LINE_ENDING;
    }

    private RegexFilter createRegexFilterFromArgs(FindArguments args) {
        if(args.isNameSet()) {
            if(args.isRegex()) {
                return new RegexFilter(args.getName(), args.isIgnoreCase());
            }
        }
        //no regex filter
        return null;
    }

    private FileFilter createFileFilterFromArgs(FindArguments args) {
        final CompositeFileFilter filter = new CompositeFileFilter();
        if(args.isNameSet()) {
            final String name = args.getName();
            if(!args.isRegex()) {
                if(name.contains("*") || name.contains("?")) {
                    final String pattern = name.replace(".", "\\.").replace('?', '.').replace("*", ".*");
                    filter.add(new RegexFilter(pattern, args.isIgnoreCase()));
                }
                else {
                    filter.add(new NameFilter(name, args.isIgnoreCase()));
                }
            }
        }
        if(args.isSizeSet()) {
            filter.add(new SizeFilter(args.getSize()));
        }
        if(args.isTimeSet()) {
            filter.add(new TimeFilter(args.getTime(), args));
        }
        filter.addIfNotNull(TypeFilter.valueOf(args));
        return filter.simplify();
    }

    private List<File> getArgumentPaths(ExecutionContext context, FindArguments args) {
        if(args.isPathSet()) {
            return FileUtil.expandFiles(context.getCurrentDirectory(), args.getPath());
        }
        else {
            //no input files or paths ==> use just the current directory
            final ArrayList<File> list = new ArrayList<File>(1);
            list.add(context.getCurrentDirectory());
            return list;
        }
    }

    public LineProcessor execute(final ExecutionContext context, final LineProcessor output) {
        final FindArguments args = this.arguments;
        final List<File> paths = getArgumentPaths(context, args);

        return new LineProcessor() {

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
                    if(!path.exists()) {
                        keepGoing = output.processLine(new SimpleLine(format("find: `%s': No such file or directory", path), lineEnding));
                    }
                    else if(path.isDirectory()) {
                        keepGoing = listFiles(fileFilter, base, path, output, args);
                    }
                    else {
                        keepGoing = outputFileLine(fileFilter, output, base, path);
                    }
                    if(!keepGoing) {
                        break;
                    }
                }
                output.finish();
            }

            private FileFilter getFileFilterFor(RelativePathBase base) {
                if(regexFilter == null) {
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
        if(outputFileLine(fileFilter, output, relativeTo, parent)) {
            final List<File> files = FileUtil.toList(parent.listFiles());
            for(File file : files) {
                //System.out.println("Examining file: " + file.getAbsolutePath());
                if(file.isDirectory()) {
                    if(!listFiles(fileFilter, relativeTo, file, output, args)) {
                        return false;
                    }
                }
                else {
                    if(!outputFileLine(fileFilter, output, relativeTo, file)) {
                        return false;
                    }
                }
            }
        }
        return true;//we want more output
    }

    private boolean outputFileLine(FileFilter fileFilter, LineProcessor output, RelativePathBase relativeTo, File file) {
        if(fileFilter.accept(file)) {
            final String filePath = relativeTo.getRelativePathFor(file);
            return output.processLine(new SimpleLine(filePath, lineEnding));
        }
        return true;
    }
}