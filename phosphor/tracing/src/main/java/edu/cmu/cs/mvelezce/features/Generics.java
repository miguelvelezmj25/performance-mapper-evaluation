package edu.cmu.cs.mvelezce.features;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {

    public static void main(String[] args) {
        Generics<Integer> generics = new Generics<>();
        List<Integer> list = new ArrayList<>();
        generics.start(list);
    }

    private static int getInt(int b) {
        return b;
    }

    private void start(List<T> list) {
        T x = list.get(0);
        System.out.println(x);
    }

}
