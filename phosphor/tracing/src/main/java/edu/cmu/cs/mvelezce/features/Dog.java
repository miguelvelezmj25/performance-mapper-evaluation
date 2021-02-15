package edu.cmu.cs.mvelezce.features;

public class Dog extends Animal {
    public Dog(int age) {
        super(age);
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
