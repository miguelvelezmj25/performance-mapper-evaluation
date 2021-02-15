package edu.cmu.cs.mvelezce.features;
//https://plugins.jetbrains.com/docs/intellij/line-marker-provider.html?from=jetbrains.org#define-a-line-marker-provider
public abstract class Animal {

    protected final int age;

    public Animal(int age) {
        this.age = age;
    }

    public abstract int getAge();
}
