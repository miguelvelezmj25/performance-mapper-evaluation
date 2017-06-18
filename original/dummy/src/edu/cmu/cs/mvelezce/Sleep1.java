package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Sleep1 {

    public static boolean A = false;

    public static final String FILENAME = Sleep1.class.getCanonicalName();
    public static final String PACKAGE = Sleep1.class.getPackage().getName();
    public static final String CLASS = Sleep1.class.getSimpleName();
    public static final String MAIN_METHOD = "main";

    public static void main(String[] args) throws InterruptedException {
        // Region program start
        System.out.println("main");

        if(Boolean.valueOf(args[0])) {
            A =  true;
        }
        else {
            A = false;
        }

        Thread.sleep(200);
        // Region A start
        if(A) { // 20
            Thread.sleep(600);
        }
        // Region A end

        Thread.sleep(100);
        // Region program end
    }

}
