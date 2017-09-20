package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Dummy7 {

    public static boolean A = false;

    public static void main(String[] args) throws InterruptedException {
        A = Boolean.valueOf(args[0]);

        boolean a;

        if(A) {
            a = true;
        }
        else {
            a = false;
        }
    }
}
