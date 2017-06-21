package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Sleep3 {

    public static boolean A = false;
    public static boolean B = false;

    public static final String FILENAME = Sleep3.class.getCanonicalName();
    public static final String PACKAGE = Sleep3.class.getPackage().getName();
    public static final String CLASS = Sleep3.class.getSimpleName();
    public static final String MAIN_METHOD = "main";
    public static final String METHOD_1 = "method1";
    public static final String METHOD_2 = "method2";

    public static void main(String[] args) throws InterruptedException {
        // Region program start
        System.out.println("main");

//        boolean a = Boolean.valueOf(args[0]);
//        boolean b = Boolean.valueOf(args[1]);
        A = Boolean.valueOf(args[0]);
        B = Boolean.valueOf(args[1]);

        boolean a;
        boolean b;

        if (A) {
            a = true;
        } else {
            a = false;
        }

        if (B) {
            b = true;
        } else {
            b = false;
        }

        Thread.sleep(200);

        // Region A start
        if (a) { // 28
            Thread.sleep(600);
            Sleep3.method1(a);
        }
        // Region A end

        Thread.sleep(100);

        // Region IA start
        if (b) { // 45
            Thread.sleep(600);
            Sleep3.method2(b);
        }
        // Region IA start

        // Region program end
    }

    public static void method1(boolean A) throws InterruptedException {
        System.out.println("method1");
        boolean a = A;
        Thread.sleep(200);

        // Region A start
        if (a) { // 16
            Thread.sleep(600);
        }
        // Region A end

        Thread.sleep(100);
    }

    public static void method2(boolean B) throws InterruptedException {
        System.out.println("method2");
        boolean b = B;
        Thread.sleep(300);

        // Region IA start
        if (b) { // 16
            Thread.sleep(600);
        }
        // Region IA end

        Thread.sleep(200);
    }

}
