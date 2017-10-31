package edu.cmu.cs.mvelezce;

public class A {

    private int count;
    public transient Object object = null;


    public A() {
        this.count = 0;
    }

    public A(Object object, boolean control) {
        if(control) {
            this.object = object;
        }
    }

    public void work() {
        if(object != null) {
            System.out.println("not null");
        }
    }

}
