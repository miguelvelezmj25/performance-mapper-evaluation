package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Sleep1 {

    public static boolean A = false;
    public static boolean B = false;

    public static final String FILENAME = Sleep1.class.getCanonicalName();
    public static final String PACKAGE = Sleep1.class.getPackage().getName();
    public static final String CLASS = Sleep1.class.getSimpleName();
    public static final String MAIN_METHOD = "main";

    public static void main(String[] args) throws InterruptedException {
        A = Boolean.valueOf(args[0]);
        B = Boolean.valueOf(args[1]);

        A=foo(A);

        if (A) {
            System.out.println(0);
        }

        if(B) {
            System.out.println(1);
        }


    }

    static boolean foo(boolean x) { return x; }

}
