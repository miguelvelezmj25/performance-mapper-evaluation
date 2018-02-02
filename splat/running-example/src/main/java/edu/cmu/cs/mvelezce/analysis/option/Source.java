package edu.cmu.cs.mvelezce.analysis.option;

import java.util.Stack;

public class Source {

    private Stack<String> stack = new Stack<>();

    public boolean getOptionA(boolean option) {
        System.out.println("Hello");
        this.stack.push("A");

        return option;
    }

    public boolean getOptionB(boolean option) {
        System.out.println("Hello");
        this.stack.push("B");

        return option;
    }

    public boolean getOptionC(boolean option) {
        System.out.println("Hello");
        this.stack.push("C");

        return option;
    }

    public boolean getOptionD(boolean option) {
        System.out.println("Hello");
        this.stack.push("D");

        return option;
    }

    public Stack<String> getStack() {
        return stack;
    }
}
