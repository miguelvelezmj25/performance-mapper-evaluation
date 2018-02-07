package org.unix4j.sort.unix.sort;

import org.unix4j.sort.context.ExecutionContext;
import org.unix4j.sort.io.FileInput;
import org.unix4j.sort.io.Input;
import org.unix4j.sort.processor.*;
import org.unix4j.sort.util.FileUtil;

import java.io.File;
import java.util.Collections;
import java.util.List;

/**

 */
public class SortCommand {

    private SortArguments arguments;

    public SortCommand(SortArguments arguments) {
        this.arguments = arguments;
    }

    public LineProcessor execute(ExecutionContext context, LineProcessor output) {
        final SortArguments args = this.arguments;

        if(args.isMerge()) {
            return getMergeProcessor(context, output, args);
        }
        else if(args.isCheck()) {
            return getCheckProcessor(context, output, args);
        }
        else {
            return getSortProcessor(context, output, args);
        }
    }

    private LineProcessor getSortProcessor(ExecutionContext context, LineProcessor output, SortArguments args) {
        final LineProcessor standardInputProcessor;
        if(args.isUnique()) {
            standardInputProcessor = new UniqueSortProcessor(context, output, this.arguments);
        }
        else {
            standardInputProcessor = new SortProcessor(context, output, this.arguments);
        }
        //input from file?
        if(args.isFilesSet()) {
            final List<FileInput> inputs = FileInput.multiple(args.getFiles());
            return new RedirectInputLineProcessor(inputs, standardInputProcessor);
        }
        else if(args.isPathsSet()) {
            final List<File> files = FileUtil.expandFiles(context.getCurrentDirectory(), args.getPaths());
            final List<FileInput> inputs = FileInput.multiple(files);
            return new RedirectInputLineProcessor(inputs, standardInputProcessor);
        }
        return standardInputProcessor;
    }

    private LineProcessor getMergeProcessor(ExecutionContext context, LineProcessor output, SortArguments args) {
        //input from file?
        if(args.isFilesSet()) {
            final List<FileInput> inputs = FileInput.multiple(args.getFiles());
            return new MergeProcessor(context, output, inputs, this.arguments);
        }
        else if(args.isPathsSet()) {
            final List<File> files = FileUtil.expandFiles(context.getCurrentDirectory(), args.getPaths());
            final List<FileInput> inputs = FileInput.multiple(files);
            return new MergeProcessor(context, output, inputs, this.arguments);
        }
        else {
            final List<Input> empty = Collections.emptyList();
            return new MergeProcessor(context, output, empty, this.arguments);
        }
    }

    private LineProcessor getCheckProcessor(ExecutionContext context, LineProcessor output, SortArguments args) {
        final CheckProcessor standardInputProcessor = new CheckProcessor(context, output, this.arguments);
        //input from file?
        List<FileInput> inputs = null;
        if(args.isFilesSet()) {
            inputs = FileInput.multiple(args.getFiles());
        }
        else if(args.isPathsSet()) {
            final List<File> files = FileUtil.expandFiles(context.getCurrentDirectory(), args.getPaths());
            inputs = FileInput.multiple(files);
        }
        if(inputs != null) {
            if(inputs.size() < 2) {
                return new RedirectInputLineProcessor(inputs, standardInputProcessor);
            }
            final InputProcessor resetPerFileProcessor = new DefaultInputProcessor() {
                @Override
                public void finish(Input input, LineProcessor output) {
                    standardInputProcessor.reset();
                }
            };
            return new MultipleInputLineProcessor(inputs, resetPerFileProcessor, standardInputProcessor);
        }
        return standardInputProcessor;
    }

}
