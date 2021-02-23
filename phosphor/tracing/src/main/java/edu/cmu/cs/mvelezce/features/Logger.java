package edu.cmu.cs.mvelezce.features;

import java.io.File;

public class Logger {

    public static void main(String[] rawArgs) {
        boolean b = getBoolean(false);
        File f = new File(".");
        Args args = new Args(b, f);
        DConvert convert = new DConvert();
        convert.start(args);
    }

    private static boolean getBoolean(boolean b) {
        return b;
    }

}
