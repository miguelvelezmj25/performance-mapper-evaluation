package org.unix4j.unix.ls;

import org.unix4j.line.SimpleLine;
import org.unix4j.processor.LineProcessor;
import org.unix4j.util.FileUtil;

import java.io.File;

class LsFormatterShort implements LsFormatter {

    static final LsFormatterShort INSTANCE = new LsFormatterShort();

    //constructor used only for singleton INSTANCE
    private LsFormatterShort() {
        super();
    }

    @Override
    public boolean writeFormatted(File relativeTo, File file, LsArguments args, LineProcessor output) {
        final String relativePath = FileUtil.getRelativePath(relativeTo, file);
        return output.processLine(new SimpleLine(relativePath));
    }
}
