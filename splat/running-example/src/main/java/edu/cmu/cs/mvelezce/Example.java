package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.function.BooleanSupplier;

public class Example {

    private Stack<String> stack;
    private Set<String> options;

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Original");
//        Sink.init();

//        Options.A = Source.getOptionA(Boolean.valueOf(args[0]));
//        Options.B = Source.getOptionB(Boolean.valueOf(args[1]));
//        Options.C = Source.getOptionC(Boolean.valueOf(args[2]));
//        Options.D = Source.getOptionD(Boolean.valueOf(args[3]));

//        Options.A = Source.getOptionA(true);
//        Options.B = Source.getOptionB(true);
//        Options.C = Source.getOptionC(true);
//        Options.D = Source.getOptionD(true);

//        BooleanSupplier a = () -> Source.getOptionA(Boolean.valueOf(true));
//        BooleanSupplier b = () -> Source.getOptionB(Boolean.valueOf(true));
//        BooleanSupplier c = () -> Source.getOptionC(Boolean.valueOf(true));
//        BooleanSupplier d = () -> Source.getOptionD(Boolean.valueOf(true));

//        boolean a = Options.A;
//        boolean b = Options.B;
//        boolean c = Options.C;
//        boolean d = Options.D;

//        Thread.sleep(1000);
//
//        if(Workload.ONE) {
//            Example.foo(a, b, c);
//        }
//        something(args);
    }

    public Example(Stack<String> stack) {
        this.stack = stack;
        this.options = new HashSet<>(stack);
    }

    public void push(String option) {
        if(this.options.contains(option)) {
            return;
        }

        this.stack.push(option);
        this.options.add(option);
    }

    public boolean getOptionA(boolean option) {
        this.push("A");

        return option;
    }

    public boolean getOptionB(boolean option) {
        this.push("B");

        return option;
    }

    public boolean getOptionC(boolean option) {
        this.push("C");

        return option;
    }

    public boolean getOptionD(boolean option) {
        this.push("D");

        return option;
    }

    public static Stack<String> splat(String[] args, Stack<String> stack) throws InterruptedException {
        System.out.println("SPLat");
        Sink.init();

        Example example = new Example(stack);

        BooleanSupplier a = () -> example.getOptionA(Boolean.valueOf(args[0]));
        BooleanSupplier b = () -> example.getOptionB(Boolean.valueOf(args[1]));
        BooleanSupplier c = () -> example.getOptionC(Boolean.valueOf(args[2]));
        BooleanSupplier d = () -> example.getOptionD(Boolean.valueOf(args[3]));
//
//        BooleanSupplier a = () -> source.getOptionA(Boolean.valueOf(false));
//        BooleanSupplier b = () -> source.getOptionB(Boolean.valueOf(false));
//        BooleanSupplier c = () -> source.getOptionC(Boolean.valueOf(false));
//        BooleanSupplier d = () -> source.getOptionD(Boolean.valueOf(false));

        Thread.sleep(1000);

        if(Workload.ONE) {
            Example.foo(a, b, c);
        }

        return example.stack;
    }

    public static void foo(BooleanSupplier a, BooleanSupplier b, BooleanSupplier c) throws InterruptedException {
        boolean x = false;

        if(a.getAsBoolean()) {
            Thread.sleep(2000);
            Example.moo(c);
            x = true;
        }

        if(b.getAsBoolean() && x) {
            Thread.sleep(4000);
        }
    }

    private static void moo(BooleanSupplier c) throws InterruptedException {
        if(c.getAsBoolean()) {
            Thread.sleep(7000);
        }
    }
}
