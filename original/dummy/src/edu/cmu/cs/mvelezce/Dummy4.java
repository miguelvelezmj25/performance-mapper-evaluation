package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 6/16/17.
 */
public class Dummy4 {

    public static boolean ON = false;
    public static int integerFeature = 5;
    public static double doubleFeature = 5;

    public static void main(String[] args) {
        int i = 0;

        if(ON) {
            i = 1;
            i = 1;
            i = 1;
            i = 1;
        }
        else {
            i = 2;
            i = 2;
            i = 2;
            i = 2;
            i = 2;
        }

        integer(i);

        double d = 0;

        if(ON) {
            d = 1;
        }
        else {
            d = 2;
        }
//
//        doubleNumber(d);

//        int i = 0;
//
        if(integerFeature > 2) {
            i = 0;
        }

        integer(i);

//        int i = 0;
//
        if(doubleFeature > 0) {
            i = 0;
        }
//
//        integer(i);

//        int i = integerFeature;
//        integer(i);

//        double d = doubleFeature;
//        doubleNumber(d);
    }

    private static void doubleNumber(double d) {
        if(d > 0) {
            int a = 0;
        }

    }

    private static void integer(int i) {
        if(i > 0) {
            int a = 0;
        }

//        if((i + 5) > 2) {
//            int a = 0;
//        }

//        if(i > 1) {
//            int a = 0;
//        }

    }
}
