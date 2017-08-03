package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Sleep31 {

    public static boolean A = false;
    public static boolean B = false;

    public static void main(String[] args) throws InterruptedException {
        A = Boolean.valueOf(args[0]);
        B = Boolean.valueOf(args[1]);

        boolean a;
        int b = 0;


        if(A) {
            a = true;
        }
        else {
            a = false;
        }

        if(B) {
            b = 10;
        }
        else {
            b = -5;
        }

        for(int i = 0; i < b; i++) {
//        if(b > 0) {
            Thread.sleep(100);

            if(a) {
                Thread.sleep(200);
            }

            Thread.sleep(300);
        }


        Thread.sleep(200);

        if(a) {
            Thread.sleep(100);
//            m1(a);
        }
//
//        if(b) {
//            Thread.sleep(300);
//            m1(b);
//        }
//
//        m1(true);
    }

    public static void m1(boolean x) throws InterruptedException {
        Thread.sleep(500);

        if(x) {
            Thread.sleep(200);
        }
    }

}
