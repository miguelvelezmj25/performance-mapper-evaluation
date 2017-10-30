package org.prevayler.demos.demo1;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.apache.commons.io.FileUtils;
import org.prevayler.Clock;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.foundation.monitor.Log4jMonitor;
import org.prevayler.foundation.monitor.LoggingMonitor;
import org.prevayler.foundation.monitor.SimpleMonitor;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;

import java.io.File;

public class PrimeNumbers {

    public static boolean JOURNALSERIALIZER;
    public static boolean SNAPSHOTSERIALIZER;
    public static boolean TRANSIENTMODE;
    public static boolean CLOCK;
    public static boolean DEEPCOPY;
    public static boolean DISKSYNC;
    public static boolean FILESIZETHRESHOLD;
    public static boolean FILEAGETHRESHOLD;
    public static boolean MONITOR;

    public static void main(String[] args) throws Exception {
        long start = System.nanoTime();
        System.out.println("Original");
        Sink.init();

        String dir = "prime";
        File output = new File(dir);

        if(output.exists()) {
            FileUtils.forceDelete(output);
        }

        TRANSIENTMODE = Source.getOptionTRANSIENTMODE(Boolean.valueOf(args[0]));
        CLOCK = Source.getOptionCLOCK(Boolean.valueOf(args[1]));
        DEEPCOPY = Source.getOptionDEEPCOPY(Boolean.valueOf(args[2]));
        DISKSYNC = Source.getOptionDISKSYNC(Boolean.valueOf(args[3]));
        FILESIZETHRESHOLD = Source.getOptionFILESIZETHRESHOLD(Boolean.valueOf(args[4]));
        FILEAGETHRESHOLD = Source.getOptionFILEAGETHRESHOLD(Boolean.valueOf(args[5]));
        MONITOR = Source.getOptionMONITOR(Boolean.valueOf(args[6]));
        JOURNALSERIALIZER = Source.getOptionJOURNALSERIALIZER(Boolean.valueOf(args[7]));
        SNAPSHOTSERIALIZER = Source.getOptionSNAPSHOTSERIALIZER(Boolean.valueOf(args[8]));

//        TRANSIENTMODE = Source.getOptionTRANSIENTMODE(false);
//        CLOCK = Source.getOptionCLOCK(false);
//        DEEPCOPY = Source.getOptionDEEPCOPY(false);
//        DISKSYNC = Source.getOptionDISKSYNC(false);
//        FILESIZETHRESHOLD = Source.getOptionFILESIZETHRESHOLD(false);
//        FILEAGETHRESHOLD = Source.getOptionFILEAGETHRESHOLD(false);
//        MONITOR = Source.getOptionMONITOR(false);
//        JOURNALSERIALIZER = Source.getOptionJOURNALSERIALIZER(false);
//        SNAPSHOTSERIALIZER = Source.getOptionSNAPSHOTSERIALIZER(false);

        boolean transientMode = false;
        Clock clock;
        boolean deepCopy = false;
        boolean diskSync = false;
        int fileSizeThreshold = 0;
        int fileAgeThreshold = 0;
        LoggingMonitor monitor;

        if(TRANSIENTMODE) {
            transientMode = true;
        }

        if(CLOCK) {
            clock = new PausableClock(new MachineClock());
        }
        else {
            clock = new MachineClock();
        }

        if(DEEPCOPY) {
            deepCopy = true;
        }

        if(DISKSYNC) {
            diskSync = true;
        }

        if(FILESIZETHRESHOLD) {
            fileSizeThreshold = 1000000;
        }

        if(FILEAGETHRESHOLD) {
            fileAgeThreshold = 1000000;
        }

        if(MONITOR) {
            monitor = new Log4jMonitor();
        }
        else {
            monitor = new SimpleMonitor();
        }

        PrevaylerFactory<NumberKeeper> factory = new PrevaylerFactory<>();
        factory.configurePrevalentSystem(new NumberKeeper());
        factory.configurePrevalenceDirectory(dir);

        factory.configureClock(clock);
        factory.configureMonitor(monitor);
        factory.configureTransientMode(transientMode);
        factory.configureTransactionDeepCopy(deepCopy);
        factory.configureJournalDiskSync(diskSync);
        factory.configureJournalFileSizeThreshold(fileSizeThreshold);
        factory.configureJournalFileAgeThreshold(fileAgeThreshold);


        if(JOURNALSERIALIZER) {
            factory.configureJournalSerializer(new XStreamSerializer());
        }
        else {
            factory.configureJournalSerializer(new JavaSerializer());
        }

        if(SNAPSHOTSERIALIZER) {
            factory.configureSnapshotSerializer(new XStreamSerializer());
        }
        else {
            factory.configureSnapshotSerializer(new JavaSerializer());
        }

        Prevayler<NumberKeeper> prevayler = factory.create();
        new PrimeCalculator(prevayler).start();

        factory = new PrevaylerFactory<>();
        factory.configurePrevalentSystem(new NumberKeeper());
        factory.configurePrevalenceDirectory(dir);

        factory.configureClock(clock);
        factory.configureMonitor(monitor);
        factory.configureTransientMode(transientMode);
        factory.configureTransactionDeepCopy(deepCopy);
        factory.configureJournalDiskSync(diskSync);
        factory.configureJournalFileSizeThreshold(fileSizeThreshold);
        factory.configureJournalFileAgeThreshold(fileAgeThreshold);


        if(JOURNALSERIALIZER) {
            factory.configureJournalSerializer(new XStreamSerializer());
        }
        else {
            factory.configureJournalSerializer(new JavaSerializer());
        }

        if(SNAPSHOTSERIALIZER) {
            factory.configureSnapshotSerializer(new XStreamSerializer());
        }
        else {
            factory.configureSnapshotSerializer(new JavaSerializer());
        }

        prevayler = factory.create();
        new PrimeCalculator(prevayler).start1();

        long end = System.nanoTime();

        System.out.println((end - start) / 1000000000.0);
    }
}
