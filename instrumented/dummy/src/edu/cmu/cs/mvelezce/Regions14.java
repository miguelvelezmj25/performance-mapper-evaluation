package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

/**
 * Removing regions. 4 regions are left
 */
public class Regions14 {

    static boolean A;
    static boolean B;

    public static void main(String[] args) throws InterruptedException {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));
        B = Source.getOptionB(Boolean.valueOf(args[1]));

        boolean a = false;
        boolean b = false;

        if(A) { // A
            a = true;
        }

        if(B) { // B
            b = true;
        }

        foo(a, b);
        moo(false, false);
    }

    public static void foo(boolean x, boolean y) throws InterruptedException {
        int total = 0;

        if(x) { // A
            Thread.sleep(1000);
            total = 4;
        }

        for(int i = 0; i < total; i++) { // A
            if(i % 2 == 0){ // A
                moo(true, y);
            }
            else {
                moo(false, y);
            }
        }
    }

    private static void moo(boolean a, boolean b) throws InterruptedException {
        if(a && b) { // A & AB
            Thread.sleep(2000);
            System.out.println();
        }
    }

}


/*
void foo() {

for(int i =0 ; i < 10; i++) {
    if(A) {
        ...
    }

    ...

}

if(C) {
...
}
}
 */