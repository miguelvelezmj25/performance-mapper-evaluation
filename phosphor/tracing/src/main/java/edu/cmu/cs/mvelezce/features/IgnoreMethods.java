package edu.cmu.cs.mvelezce.features;

public class IgnoreMethods {

    public static void main(String[] args) {
        int x = getInt(args.length);
        int y;
        if (x == 0) {
            y = getOne(x);
        } else if (x < 5) {
            y = getTwo(x);
        } else {
            y = getThree(x);
        }
        System.out.println(y);
    }

    private static int getOne(int x) {
        int i = 1;
        i = i + x;
        return i;
    }

    private static int getTwo(int x) {
        int i = 2;
        i = i * x;
        return i;
    }

    private static int getThree(int x) {
        int i = 3;
        i = i * x;
        return i;
    }

    private static int getInt(int n) {
        return n;
    }
}
