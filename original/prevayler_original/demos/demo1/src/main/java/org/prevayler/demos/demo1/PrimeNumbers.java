package org.prevayler.demos.demo1;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.prevayler.Clock;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.foundation.monitor.Log4jMonitor;
import org.prevayler.foundation.monitor.LoggingMonitor;
import org.prevayler.foundation.monitor.SimpleMonitor;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;

import java.io.File;

public class PrimeNumbers {

    public static boolean TRANSIENTMODE;
    public static boolean CLOCK;
    public static boolean DEEPCOPY;
    public static boolean DISKSYNC;
    public static boolean FILESIZETHRESHOLD;
    public static boolean FILEAGETHRESHOLD;
    public static boolean MONITOR;

    public static void main(String[] args) throws Exception {
        Sink.init();
        System.out.println("Original");

        String dir = "prime";
        File output = new File(dir);

        if(output.exists()) {
//            FileUtils.forceDelete(output);
        }

        TRANSIENTMODE = Source.getOptionTRANSIENTMODE(Boolean.valueOf(args[0]));
        CLOCK = Source.getOptionCLOCK(Boolean.valueOf(args[1]));
        DEEPCOPY = Source.getOptionDEEPCOPY(Boolean.valueOf(args[2]));
        DISKSYNC = Source.getOptionDISKSYNC(Boolean.valueOf(args[3]));
        FILESIZETHRESHOLD = Source.getOptionFILESIZETHRESHOLD(Boolean.valueOf(args[4]));
        FILEAGETHRESHOLD = Source.getOptionFILEAGETHRESHOLD(Boolean.valueOf(args[5]));
        MONITOR = Source.getOptionMONITOR(Boolean.valueOf(args[6]));

//        TRANSIENTMODE = Source.getOptionTRANSIENTMODE(false);
//        CLOCK = Source.getOptionCLOCK(true);
//        DEEPCOPY = Source.getOptionDEEPCOPY(true);
//        DISKSYNC = Source.getOptionDISKSYNC(true);
//        FILESIZETHRESHOLD = Source.getOptionFILESIZETHRESHOLD(true);
//        FILEAGETHRESHOLD = Source.getOptionFILEAGETHRESHOLD(true);
//        MONITOR = Source.getOptionMONITOR(true);

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

        PrevaylerFactory<NumberKeeper> factory = new PrevaylerFactory<NumberKeeper>();
        factory.configurePrevalentSystem(new NumberKeeper());
        factory.configurePrevalenceDirectory(dir);

        factory.configureTransientMode(transientMode);
        factory.configureClock(clock);
        factory.configureTransactionDeepCopy(deepCopy);
        factory.configureJournalDiskSync(diskSync);
        factory.configureJournalFileSizeThreshold(fileSizeThreshold);
        factory.configureJournalFileAgeThreshold(fileAgeThreshold);
        factory.configureMonitor(monitor);

        Prevayler<NumberKeeper> prevayler = factory.create();
        new PrimeCalculator(prevayler).start();
    }
}
