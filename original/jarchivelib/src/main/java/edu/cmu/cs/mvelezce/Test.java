package edu.cmu.cs.mvelezce;

import org.rauschig.jarchivelib.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by mvelezce on 6/14/17.
 */
public class Test {

    public static boolean useBZIP = false;
    public static boolean useGZIP = false;
    public static boolean usePACK = false;
    public static boolean useXZ = false;

    public static boolean useAR = false;
    public static boolean useCPIO = false;
    public static boolean useDUMP = false;
    public static boolean useJAR = false;
    public static boolean useSEVENZ = false;
    public static boolean useTAR = false;
    public static boolean useZIP = false;

    public static void main(String[] args) throws IOException {
        String archiveName = "miguel";
        File destination = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/jarchivelib/src/test/resources");
        File source = new File("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/jarchivelib/src/test/resources/archive");

//        int i = 0;
//
//        if(useGZIP) {
//            i = 0;
//        }
//        else {
//            i = 1;
//        }
//
//        if(TAR) {
//            i = 0;
//        }
//        else {
//            i = 1;
//        }

//        if(useGZIP) {
//            i = 0;
//        }
//        else if(useBZIP) {
//            i = 1;
//        }
//        else {
//            i = 2;
//        }

//        if(useGZIP) {
//            i = 0;
//        }
//
//        if(useBZIP2) {
//            i = 1;
//        }

        Archiver archiver = null;

//        archiver = method1();
//        archiver = method2();
//        archiver = method3();
//        archiver = method4();
//        archiver = method5();
//        archiver = method6();
//        archiver = method7();
        archiver = method8();

        // Create the file
        File archive = archiver.create(archiveName, destination, source);
    }

    /**
     * Sometimes compression types interact
     * @return
     */
    public static Archiver method1() {
        Archiver archiver = null;

        if(useGZIP) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.GZIP);
        }
        else if(useXZ) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.XZ);
        }
        else {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR);
        }

        return archiver;
    }

    /**
     * Compression types interact always
     * @return
     */
    public static Archiver method2() {
        Archiver archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR);

        if(useGZIP) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.GZIP);
        }
        else if(useXZ) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.XZ);
        }

        return archiver;
    }

    /**
     * No interaction between archiver and compressor
     * @return
     */
    public static Archiver method3() {
        CommonsArchiver commonsArchiver = null;

        if(useJAR) {
            commonsArchiver = new CommonsArchiver(ArchiveFormat.JAR);
        }

        if(useTAR) {
            commonsArchiver = new CommonsArchiver(ArchiveFormat.TAR);
        }

        CommonsCompressor compressor = null;

        if(useGZIP) {
            compressor = new CommonsCompressor(CompressionType.GZIP);
        }

        if(useXZ) {
            compressor = new CommonsCompressor(CompressionType.XZ);
        }

        return new ArchiverCompressorDecorator(commonsArchiver, compressor);
    }

    /**
     * Everything interacts with everything.
     *
     * @return
     */
    public static Archiver method4() {
        Archiver archiver = null;

        if(useJAR) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.JAR, CompressionType.GZIP);
        }

        if(useTAR) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.XZ);
        }

        if(useGZIP) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.JAR, CompressionType.GZIP);
        }

        if(useXZ) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.XZ);
        }

        return archiver;
    }

    /**
     * Only one compression appears
     * @return
     */
    public static Archiver method5() {
        Archiver archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR);

        if(useGZIP) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.GZIP);
        }
        else {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.XZ);
        }

        return archiver;
    }

    /**
     * Only one compression appears
     * @return
     */
    public static Archiver method6() {
        Archiver archiver = null;

        if(useGZIP) {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.GZIP);
        }
        else {
            archiver = ArchiverFactory.createArchiver(ArchiveFormat.TAR, CompressionType.XZ);
        }

        return archiver;
    }

    /**
     * Only the first feature appears in Lotrack
     * @return
     */
    public static Archiver method7() {
        CommonsArchiver commonsArchiver = null;

        if(useJAR) {
            commonsArchiver = new CommonsArchiver(ArchiveFormat.JAR);
        }
        else {
            commonsArchiver = new CommonsArchiver(ArchiveFormat.TAR);
        }

        CommonsCompressor compressor = null;

        if(useGZIP) {
            compressor = new CommonsCompressor(CompressionType.GZIP);
        }
        else {
            compressor = new CommonsCompressor(CompressionType.XZ);
        }

        return new ArchiverCompressorDecorator(commonsArchiver, compressor);
    }

    /**
     * Only the first feature appears in Lotrack
     * @return
     */
    public static Archiver method8() {
        CommonsCompressor compressor = null;

        if(useGZIP) {
            compressor = new CommonsCompressor(CompressionType.GZIP);
        }
        else {
            compressor = new CommonsCompressor(CompressionType.XZ);
        }

        CommonsArchiver commonsArchiver = null;

        if(useJAR) {
            commonsArchiver = new CommonsArchiver(ArchiveFormat.JAR);
        }
        else {
            commonsArchiver = new CommonsArchiver(ArchiveFormat.TAR);
        }

        return new ArchiverCompressorDecorator(commonsArchiver, compressor);
    }
}
