package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 6/16/17.
 */
public class Sleep14 {

    public static boolean A = false;
    public static int IA = 5;
    public static double DA = 5;

    public static final String FILENAME = Sleep14.class.getCanonicalName();
    public static final String PACKAGE = Sleep14.class.getPackage().getName();
    public static final String CLASS = Sleep14.class.getSimpleName();
    public static final String MAIN_METHOD = "main";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main");

        if(Boolean.valueOf(args[0])) {
            A =  true;
        }
        else {
            A = false;
        }

        if(Boolean.valueOf(args[4])) {
            IA = 0;
        }
        else {
            IA = 5;
        }

        if(Boolean.valueOf(args[5])) {
            DA = 0;
        }
        else {
            DA = 5;
        }

        integer(2);
        Thread.sleep(100);
        double d = 0;

        if(A) {
            Thread.sleep(200);
            d=1;
        } else if(IA > 4 && DA > 2) {
            integer(1);
            Thread.sleep(500);
        }

        doubleNumber(d);
    }

    private static void doubleNumber(double d) throws InterruptedException {
        if (d > 0) {
            Thread.sleep(600);
        }

    }

    private static void integer(int i) throws InterruptedException {
        if (i > 0) {
            Thread.sleep(700);
        }
    }
}

