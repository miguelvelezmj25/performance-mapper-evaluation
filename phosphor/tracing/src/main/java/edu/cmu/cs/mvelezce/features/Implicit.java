package edu.cmu.cs.mvelezce.features;

public class Implicit {

    public static void main(String[] args) {
        int n = getInt(12);
        if (args.length > 0) {
            foo(n, args.length);
        }
    }

    private static void foo(int i, int j) {
        boolean b = i == j;
        b = target(b);
        if (b) {
            moo();
        }
    }

    private static boolean target(boolean b) {
        return b;
    }

    private static void moo() {
        System.out.println("moo");
    }

    private static int getInt(int n) {
        return n;
    }

}
