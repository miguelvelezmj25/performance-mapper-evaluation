package org.unix4j.unix.find;

import edu.cmu.cs.mvelezce.analysis.option.Sink;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * A file filter that accepts a file only if all component filters accept the
 * file. In other words, the composite filter performs an AND operation on the
 * outcome of all component filters.
 */
class CompositeFileFilter implements FileFilter {

    private final List<FileFilter> componentFilters = new ArrayList<FileFilter>();

    public CompositeFileFilter() {
        super();
    }

    public void addIfNotNull(FileFilter filter) {
        if(Sink.getDecision(filter != null)) {
            add(filter);
        }
    }

    public void add(FileFilter filter) {
        componentFilters.add(filter);
    }

    public FileFilter simplify() {
        if(Sink.getDecision(componentFilters.isEmpty())) {
            return new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return true;
                }
            };
        }
        if(Sink.getDecision(componentFilters.size() == 1)) {
            return componentFilters.get(0);
        }
        return this;
    }

    @Override
    public boolean accept(File file) {
        for(final FileFilter filter : componentFilters) {
            if(Sink.getDecision(!filter.accept(file))) {
                return false;
            }
        }
        return true;
    }

}
