package org.prevayler.demos.demo1;

import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.prevayler.Clock;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;

public class PrimeNumbers {

    public static boolean TRANSIENTMODE;
    public static boolean CLOCK;

    public static void main(String[] args) throws Exception {
//        TRANSIENTMODE = Source.getOptionTRANSIENTMODE(Boolean.valueOf(args[0]));
//        CLOCK = Source.getOptionCLOCK(Boolean.valueOf(args[1]));

        TRANSIENTMODE = Source.getOptionTRANSIENTMODE(true);
        CLOCK = Source.getOptionCLOCK(true);

        boolean transientMode;
        Clock clock;

        if(TRANSIENTMODE) {
            transientMode = true;
        }
        else {
            transientMode = false;
        }

        if(CLOCK) {
            clock = new PausableClock(new MachineClock());
        }
        else {
            clock = new MachineClock();
        }

        PrevaylerFactory<NumberKeeper> factory = new PrevaylerFactory<NumberKeeper>();
        factory.configurePrevalentSystem(new NumberKeeper());
        factory.configurePrevalenceDirectory("prime");

        factory.configureTransientMode(transientMode);
        factory.configureClock(clock);

        Prevayler<NumberKeeper> prevayler = factory.create();
        new PrimeCalculator(prevayler).start();
    }
}
