package edu.cmu.cs.mvelezce.tracing;

import org.xml.sax.helpers.DefaultHandler;

public class Scratch {

    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler();
        System.out.println(handler);
//        int x = Taint.withLabel(5).hashCode();
//        int y = x;
//        something(y);
    }
//
//    public static void something(int z) {
//        int i = moo(z);
//        int j = z * 5;
//        System.out.println(j);
//        bar(i);
//    }
//
//    private static void bar(int i) {
//        if (i > 0) {
//
//        }
//    }
//
//    private static int moo(int z) {
//        return z;
//    }
//
//    private static void something() {
//        Trace1 t = new Trace1();
//        System.out.println(t);
//    }
}
