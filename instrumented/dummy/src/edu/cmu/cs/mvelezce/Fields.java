package edu.cmu.cs.mvelezce;

public class Fields implements Cloneable {

    private boolean a = false;
    private boolean b = false;
    private boolean c = false;

    public Fields() { ; }

    public Fields(boolean a, boolean b) {
        this.a = a;
        this.b = b;
    }

    public boolean isA() {
        return a;
    }

    public boolean isB() {
        return b;
    }

    public boolean isC() {
        return c;
    }

    public Fields clone() {
        try {
            return (Fields) super.clone();
        } catch (CloneNotSupportedException e) {
           return null;
        }
    }

}
