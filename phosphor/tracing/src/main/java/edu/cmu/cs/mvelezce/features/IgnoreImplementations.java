package edu.cmu.cs.mvelezce.features;

public class IgnoreImplementations {

    public static void main(String[] args) {
        int n = getInt(12);
        Animal animal = getAnimal(n, args.length == 0);
        int age = animal.getAge();
        System.out.println(age);
    }

    private static Animal getAnimal(int n, boolean b) {
        if (b) {
            return new Cat(n);
        }
        return new Dog(n);
    }

    private static int getInt(int n) {
        return n;
    }
}
