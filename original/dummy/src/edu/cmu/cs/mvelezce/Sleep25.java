package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 7/13/17.
 */
public class Sleep25 {
    public static boolean A = false;
    public static boolean B = false;

    public static void main(String[] args) throws InterruptedException {
        A = Boolean.valueOf(args[0]);
        B = Boolean.valueOf(args[1]);

        Thread.sleep(200);

        if(A) {
            Thread.sleep(300);

            if(B)  {
                Thread.sleep(400);
            }
        }

    }
}
