package edu.cmu.cs.mvelezce.features;

public class Dimension<T> {

    public static void main(String[] args) {
        int i = getInt(5);
        int j = 6;
        java.awt.Dimension dimension = new java.awt.Dimension(i, j);
        target(dimension);
    }

    private static void target(java.awt.Dimension dimension) {
        System.out.println(dimension);
        int h = dimension.height;
        int w = dimension.width;
        System.out.println(h);
        System.out.println(w);
    }

    private static int getInt(int b) {
        return b;
    }


}
