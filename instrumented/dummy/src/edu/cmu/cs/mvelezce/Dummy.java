package edu.cmu.cs.mvelezce;

import jdk.internal.org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mvelezce on 3/31/17.
 */
public class Dummy {

    public static void main(String[] args) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//
//        switch (Integer.valueOf(args[0])) {
//            case 1:
//                Dummy.inc1(1);
//                break;
//            case 2:
//                Dummy.inc2(2);
//                break;
//        }
//    }
//
//    public static void inc1(int a) {
//        int result = a + 1;
//        System.out.println(result);
//    }
//
//    public static void inc2(int a) {
//        int result = a + 1;
//        System.out.println(result);
    }

    public static List<MethodNode> test() throws InterruptedException {
        int i = 0;

        if(i >0) {
            return sleep(false);
        }
        return sleep(true);
    }

    public static List<MethodNode> test1() throws InterruptedException {
        int i = 0;

        if(i >0) {
            List<MethodNode> x = sleep(false);
            return x;
        }
        List<MethodNode> x = sleep(true);
        return x;
    }

    public static StringBuilder test2() throws InterruptedException {
        int i = 0;
        StringBuilder s = new StringBuilder();

        if(i >0) {
            return s.append("SDF");
        }
        return s.append("DSFSF'");
    }

    public static List<MethodNode> sleep(boolean x) throws InterruptedException {
        Thread.sleep(5);
        return new ArrayList<>();
    }

}
