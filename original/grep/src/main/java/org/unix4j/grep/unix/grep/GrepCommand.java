package org.unix4j.grep.unix.grep;

import org.unix4j.grep.command.AbstractCommand;
import org.unix4j.grep.context.ExecutionContext;
import org.unix4j.grep.io.FileInput;
import org.unix4j.grep.processor.InputProcessor;
import org.unix4j.grep.processor.LineProcessor;
import org.unix4j.grep.processor.MultipleInputLineProcessor;
import org.unix4j.grep.processor.RedirectInputLineProcessor;
import org.unix4j.grep.unix.Grep;
import org.unix4j.grep.util.FileUtil;

import java.io.File;
import java.util.List;

/**
 * Implementation of the {@link Grep grep} command.
 */
class GrepCommand extends AbstractCommand<GrepArguments> {
    public GrepCommand(GrepArguments arguments) {
        super(Grep.NAME, arguments);
    }

    @Override
    public LineProcessor execute(ExecutionContext context, LineProcessor output) {
        final GrepArguments args = getArguments(context);

        //from file?
        if(args.isFilesSet()) {
            final List<FileInput> inputs = FileInput.multiple(args.getFiles());
            return getFileInputProcessor(inputs, context, output, args);
        }
        else if(args.isPathsSet()) {
            final List<File> files = FileUtil.expandFiles(context.getCurrentDirectory(), args.getPaths());
            final List<FileInput> inputs = FileInput.multiple(files);
            return getFileInputProcessor(inputs, context, output, args);
        }

        //from standard input
        return getStandardInputProcessor(context, output, args);
    }

    private LineMatcher getMatcher(GrepArguments args) {
        final LineMatcher matcher;
        if(args.isFixedStrings()) {
            if(args.isWholeLine()) {
                matcher = args.isIgnoreCase() ? new FixedStringMatcher.WholeLineIgnoreCase(args) : new FixedStringMatcher.WholeLine(args);
            }
            else {
                matcher = args.isIgnoreCase() ? new FixedStringMatcher.IgnoreCase(args) : new FixedStringMatcher.Standard(args);
            }
        }
        else {
            matcher = new RegexpMatcher(args);
        }
        return args.isInvertMatch() ? new InvertedMatcher(matcher) : matcher;
    }

    private LineProcessor getStandardInputProcessor(ExecutionContext context, LineProcessor output, GrepArguments args) {
        final LineMatcher matcher = getMatcher(args);
        if(args.isCount()) {
            return new CountMatchingLinesProcessor(this, context, output, matcher);
        }
        else if(args.isMatchingFiles()) {
            return new WriteFilesWithMatchingLinesProcessor(this, context, output, matcher);
        }
        return new WriteMatchingLinesProcessor(this, context, output, matcher);
    }

    private LineProcessor getFileInputProcessor(List<FileInput> inputs, ExecutionContext context, LineProcessor output, GrepArguments args) {
        if(args.isCount()) {
            final LineMatcher matcher = getMatcher(args);
            final InputProcessor processor = new CountMatchingLinesProcessor(this, context, output, matcher);
            return new MultipleInputLineProcessor(inputs, processor, output);
        }
        else if(args.isMatchingFiles()) {
            final LineMatcher matcher = getMatcher(args);
            final InputProcessor processor = new WriteFilesWithMatchingLinesProcessor(this, context, output, matcher);
            return new MultipleInputLineProcessor(inputs, processor, output);
        }

        //standard grep output
        final LineProcessor standardInputProcessor = getStandardInputProcessor(context, output, args);
        return new RedirectInputLineProcessor(inputs, standardInputProcessor);
    }
}
