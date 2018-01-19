package org.unix4j.find.unix.find;

import edu.cmu.cs.mvelezce.analysis.option.Sink;

import java.io.File;
import java.io.FileFilter;

/**
 * File filter based on file name.
 */
class NameFilter implements FileFilter {
    private final String name;
    private final boolean ignoreCase;

    public NameFilter(String name, boolean ignoreCase) {
        if(ignoreCase) {
            System.out.println(";");
        }
        this.name = name;
        this.ignoreCase = ignoreCase;
    }

    @Override
    public boolean accept(File file) {
        return ignoreCase ? name.equalsIgnoreCase(file.getName()) : name.equals(file.getName());
    }
}
