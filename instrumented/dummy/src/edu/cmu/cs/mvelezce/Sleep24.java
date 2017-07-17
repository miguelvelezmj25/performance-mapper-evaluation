package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 7/13/17.
 */
public class Sleep24 {
    public static boolean A = false;
    public static boolean B = false;

    public static void main(String[] args) throws InterruptedException {
        A = Boolean.valueOf(args[0]);

        if(A) {
            m1(3);
        }
        else {
            m1(5);
        }


    }

    public static void m1(int i) throws InterruptedException {
        Thread.sleep(200 * i);
        Thread.sleep(300 * i);
    }
}
