package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.rauschig.jarchivelib.ArchiveFormat;
import org.rauschig.jarchivelib.Archiver;
import org.rauschig.jarchivelib.ArchiverFactory;
import org.rauschig.jarchivelib.CompressionType;

import java.io.File;
import java.io.IOException;

public class Jarchivelib {

    private static boolean COMPRESSIONTYPE;
    private static boolean ARCHIVEFORMAT;


    public static void main(String[] args) throws IOException {
        COMPRESSIONTYPE = Source.getOptionCOMPRESSIONTYPE(true);
        ARCHIVEFORMAT = Source.getOptionARCHIVEFORMAT(true);

        CompressionType compression;
        ArchiveFormat format;

        if(COMPRESSIONTYPE) {
            compression = CompressionType.GZIP;
        }
        else {
            compression = CompressionType.BZIP2;
        }

        if(ARCHIVEFORMAT) {
            format = ArchiveFormat.TAR;
        }
        else {
            format = ArchiveFormat.ZIP;
        }

        String archiveName = "what";
        File destination = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/jarchivelib/src/main/resources");
        File source = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/jarchivelib/src/main/resources/archive");

        Archiver archiver = ArchiverFactory.createArchiver(format, compression);

        File archive = archiver.create(archiveName, destination, source);
    }

}
