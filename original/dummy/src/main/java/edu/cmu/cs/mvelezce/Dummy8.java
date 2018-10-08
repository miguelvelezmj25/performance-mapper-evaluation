package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 7/8/17.
 */
public class Dummy8 {

    public static boolean A = false;
    public static boolean B = false;

    public static void main(String[] args) {
        A = Boolean.valueOf(args[0]);
        B = Boolean.valueOf(args[1]);

        A = foo(A);
        B = foo(B);

        if(A) {
            System.out.println(0);
        }

        if(B) {
            System.out.println(1);
        }


    }

    static boolean foo(boolean x) {
        return x;
    }
}
