package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 6/16/17.
 */
public class Dummy2 {

    private static boolean X = true;

    public static void main(String[] args) {
        int a = X ? 1 : 0;

        if (a == 0)
            System.out.println("foo");


        new X(a);
        new Y().foo(a);
    }


}

class X {

    public X(int a) {

        if (a > -10)
            System.out.println("foo");
    }
}

class Y{
    public void foo(int a) {
        if (a == 0)
            System.out.println("foo");

    }
}
