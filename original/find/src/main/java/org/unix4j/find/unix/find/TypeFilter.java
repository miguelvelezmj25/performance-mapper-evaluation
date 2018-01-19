package org.unix4j.find.unix.find;

import java.io.File;
import java.io.FileFilter;

/**
 * File filter based on file type.
 */
public abstract class TypeFilter implements FileFilter {

    public static class Directory extends TypeFilter {

        @Override
        public boolean accept(File file) {
            return FileAttributes.INSTANCE.isDirectory(file);
        }
    }

    public static class RegularFile extends TypeFilter {
        @Override
        public boolean accept(File file) {
            return FileAttributes.INSTANCE.isRegularFile(file);
        }
    }

    public static class SymbolicLink extends TypeFilter {
        @Override
        public boolean accept(File file) {
            return FileAttributes.INSTANCE.isSymbolicLink(file);
        }
    }

    public static class Other extends TypeFilter {
        @Override
        public boolean accept(File file) {
            return FileAttributes.INSTANCE.isOther(file);
        }
    }

    /**
     * Returns the (first) type filter constant if such an option is set, and
     * null if no type option is found.
     *
     * @param options the options
     * @return the type filter constant based on the given options, or null if
     * no type option is set
     */
    public static TypeFilter valueOf(FindArguments arguments) {
        TypeFilter typeFilter = null;

        if(arguments.isTypeDirectory()) {
            typeFilter = new Directory();
        }
        else if(arguments.isTypeFile()) {
            typeFilter = new RegularFile();
        }
        else if(arguments.isTypeOther()) {
            typeFilter = new Other();
        }
        else if(arguments.isTypeSymlink()) {
            typeFilter = new SymbolicLink();
        }

        return typeFilter;
    }
}
