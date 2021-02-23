package edu.cmu.cs.mvelezce.features;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        int i = getInt(5);
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(2);
        int x = list.get(0);
        int y = list.get(1);
        System.out.println(x);
        System.out.println(y);
    }

    private static int getInt(int b) {
        return b;
    }
}
