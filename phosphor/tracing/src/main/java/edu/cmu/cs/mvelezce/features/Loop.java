package edu.cmu.cs.mvelezce.features;

public class Loop {

    public static void main(String[] args) {
        int n = getInt(12);
        int y = n;
        System.out.println(y);
        for (int i = 0; i < 10; i++) {
            moo();
            foo(n);
            bar();
        }
    }

    private static void bar() {
        System.out.println("bar");
    }

    private static void moo() {
        System.out.println("moo");
    }

    private static void foo(int x) {
        int y = x;
        System.out.println(y);
    }

    private static int getInt(int n) {
        return n;
    }
}
