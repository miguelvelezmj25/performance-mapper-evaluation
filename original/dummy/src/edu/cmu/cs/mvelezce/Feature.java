package edu.cmu.cs.mvelezce;

/**
 * Created by miguelvelez on 6/14/17.
 */
public class Feature {

    public static boolean USE_WHEEL = false;

    public static void main(String[] args) {
        USE_WHEEL = true;
        int i = 0;

        if(USE_WHEEL) {
            i = 1;
        }
        else {
            i = 2;
        }

        i += 5;
    }
}
