package edu.cmu.cs.mvelezce.features;

public class Cat extends Animal {

    public Cat(int age) {
        super(age);
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
