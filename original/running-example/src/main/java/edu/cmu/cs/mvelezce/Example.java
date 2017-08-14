package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        Options.A = Source.getOptionA(Boolean.valueOf(args[0]));
        Options.B = Source.getOptionB(Boolean.valueOf(args[1]));
        Options.C = Source.getOptionC(Boolean.valueOf(args[2]));
        Options.D = Source.getOptionD(Boolean.valueOf(args[3]));

//        Options.A = Source.getOptionA(true);
//        Options.B = Source.getOptionB(true);
//        Options.C = Source.getOptionC(true);
//        Options.D = Source.getOptionD(true);

        boolean a = Options.A;
        boolean b = Options.B;
        boolean c = Options.C;
        boolean d = Options.D;

        if(Sink.getDecision(Workload.ONE)) {
            Example.foo(a, b, c);
        }
    }

    public static void foo(boolean a, boolean b, boolean c) throws InterruptedException {
        boolean x = false;

        if(Sink.getDecision(a)) {
            Thread.sleep(2000);
            Example.moo(c);
            x = true;
        }

        if(Sink.getDecision(b && x)) {
            Thread.sleep(4000);
        }
    }

    private static void moo(boolean c) throws InterruptedException {
        if(Sink.getDecision(c)) {
            Thread.sleep(7000);
        }
    }
}
