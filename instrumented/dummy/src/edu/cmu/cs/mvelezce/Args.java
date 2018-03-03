package edu.cmu.cs.mvelezce;

public class Args {

    private boolean a;

    public Args(boolean a) {
        this.a = a;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public void exec(String s, boolean b) {
        if(this.ret() == null) {
            System.out.println();
        }

        if(s == null) {
            System.out.println();
        }

        if(b) {
            System.out.println();
        }
    }

    public Args ret() {
        return this;
    }
}
