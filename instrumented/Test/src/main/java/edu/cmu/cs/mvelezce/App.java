package edu.cmu.cs.mvelezce;

import soot.PackManager;
import soot.Transform;
import soot.options.Options;

import java.io.File;

public class App {

    private static final String TEST = "edu.cmu.se355.hw6.MyTestSign1";
//    private static final String TEST = "edu.cmu.cs.mvelezce.Logger";

    public static void main(String[] args) {
        String libPath = System.getProperty("java.home") + File.separator + "lib"
                + File.separator + "rt.jar"
                + System.getProperty("path.separator") + System.getProperty("java.home") + File.separator + "lib"
                + File.separator + "jce.jar"
                + System.getProperty("path.separator")
//                + "./target/classes/";
                + "/Users/mvelezce/Documents/Programming/CMU-17-819O/mvelezce/hw6/sootOutput";

        args = new String[]{
                "-cp",
                libPath,
                "-keep-line-number",
                "-w",
                "-f", "none", TEST
        };
        PackManager.v().getPack("wjap").add(new Transform("wjap.linecount", LineCountAnalysis.instance()));

        Options.v().set_no_bodies_for_excluded(true);
//        Options.v().set_keep_line_number(true);
//        Options.v().set_whole_program(true);
        Options.v().set_main_class(TEST);

        soot.Main.main(args);
    }
}