package edu.cmu.cs.mvelezce.features;

public class Main {

    public static void main(String[] args) {
        int n = getInt(12);
        Animal animal = new Dog(n);
        int age = animal.getAge();
        System.out.println(age);
    }

    private static int getInt(int n) {
        return n;
    }
}
