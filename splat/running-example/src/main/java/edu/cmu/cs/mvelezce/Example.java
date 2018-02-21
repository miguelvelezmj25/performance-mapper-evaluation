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

//        Thread.sleep(1);
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

    public boolean getOptionE(boolean option) {
        this.push("E");

        return option;
    }

    public boolean getOptionF(boolean option) {
        this.push("F");

        return option;
    }

    public boolean getOptionG(boolean option) {
        this.push("G");

        return option;
    }

    public boolean getOptionH(boolean option) {
        this.push("H");

        return option;
    }

    public boolean getOptionI(boolean option) {
        this.push("I");

        return option;
    }

    public boolean getOptionJ(boolean option) {
        this.push("J");

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
        BooleanSupplier e = () -> example.getOptionA(Boolean.valueOf(args[4]));
        BooleanSupplier f = () -> example.getOptionB(Boolean.valueOf(args[5]));
        BooleanSupplier g = () -> example.getOptionC(Boolean.valueOf(args[6]));
        BooleanSupplier h = () -> example.getOptionD(Boolean.valueOf(args[7]));
        BooleanSupplier i = () -> example.getOptionD(Boolean.valueOf(args[8]));
        BooleanSupplier j = () -> example.getOptionD(Boolean.valueOf(args[9]));
//
//        BooleanSupplier a = () -> source.getOptionA(Boolean.valueOf(false));
//        BooleanSupplier b = () -> source.getOptionB(Boolean.valueOf(false));
//        BooleanSupplier c = () -> source.getOptionC(Boolean.valueOf(false));
//        BooleanSupplier d = () -> source.getOptionD(Boolean.valueOf(false));

        Thread.sleep(1);

        if(Workload.ONE) {
            Example.foo(a, b, c, d, e, f, g, h, i);
        }

        return example.stack;
    }

    public static void foo(BooleanSupplier a, BooleanSupplier b, BooleanSupplier c, BooleanSupplier d,
                           BooleanSupplier e, BooleanSupplier f, BooleanSupplier g, BooleanSupplier h,
                           BooleanSupplier i) throws InterruptedException {
        boolean x = false;

        if(a.getAsBoolean()) {
            Thread.sleep(1);
            Example.moo(c);
            x = true;
        }

        if(b.getAsBoolean() && x) Thread.sleep(1);

        if(d.getAsBoolean() && e.getAsBoolean() && f.getAsBoolean()) Thread.sleep(1);

        if(a.getAsBoolean()) Thread.sleep(1);
        if(b.getAsBoolean()) Thread.sleep(1);
        if(c.getAsBoolean()) Thread.sleep(1);
        if(d.getAsBoolean()) Thread.sleep(1);
        if(e.getAsBoolean()) Thread.sleep(1);
        if(f.getAsBoolean()) Thread.sleep(1);
        if(g.getAsBoolean()) Thread.sleep(1);
        if(h.getAsBoolean()) Thread.sleep(1);
        if(i.getAsBoolean()) Thread.sleep(1);
    }

    private static void moo(BooleanSupplier c) throws InterruptedException {
        if(c.getAsBoolean()) {
            Thread.sleep(1);
        }
    }
}
