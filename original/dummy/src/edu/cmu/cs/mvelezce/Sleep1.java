package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Sleep1 {

    public static final String FILENAME = Sleep1.class.getCanonicalName();
    public static final String PACKAGE = Sleep1.class.getPackage().getName();
    public static final String CLASS = Sleep1.class.getSimpleName();
    public static final String MAIN_METHOD = "main";
    public static boolean A = false;

    public static void main(String[] args) throws InterruptedException {
        // Region program start
        System.out.println("main");

//        boolean a = Boolean.valueOf(args[0]);
        A = Boolean.valueOf(args[0]);

        boolean a;

        if(A) {
            a = true;
        }
        else {
            a = false;
        }

        Thread.sleep(200);
        // Region A start
        if(a) { // 20
            Thread.sleep(600);
        }
        // Region A end

        Thread.sleep(100);
        // Region program end
    }

    public void throwsMethod() throws InterruptedException {
        int i = 0;
        Thread.sleep(100);
        i += 1;
    }

    public void tryMethof() {
        int i = 0;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i += 1;
    }

}
