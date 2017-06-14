package edu.cmu.cs.mvelezce;

import org.rauschig.jarchivelib.ArchiveFormat;
import org.rauschig.jarchivelib.Archiver;
import org.rauschig.jarchivelib.ArchiverFactory;
import org.rauschig.jarchivelib.CompressionType;

import java.io.File;
import java.io.IOException;

/**
 * Created by miguelvelez on 6/14/17.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        String archiveName = "miguel";
        File destination = new File("/Users/miguelvelez/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/jarchivelib/src/test/resources");
        File source = new File("/Users/miguelvelez/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/jarchivelib/src/test/resources/archive");

        Archiver archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.GZIP);
        File archive = archiver.create(archiveName, destination, source);
    }
}
