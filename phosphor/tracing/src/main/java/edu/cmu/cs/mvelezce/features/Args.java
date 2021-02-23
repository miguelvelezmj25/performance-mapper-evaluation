package edu.cmu.cs.mvelezce.features;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Args {

    public final boolean clean;
    public final List<File> files;

    public Args(boolean clean, File file) {
        this.clean = clean;
        this.files = new ArrayList<>();
        files.add(file);
    }

    @Override
    public String toString() {
        return "Args{" +
                "clean=" + clean +
                ", files=" + files +
                '}';
    }
}
