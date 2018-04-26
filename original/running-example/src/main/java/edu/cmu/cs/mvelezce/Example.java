package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Original");
        Sink.init();

        Options.A = Source.getOptionA(Boolean.valueOf(args[0]));
        Options.B = Source.getOptionB(Boolean.valueOf(args[1]));
        Options.C = Source.getOptionC(Boolean.valueOf(args[2]));
        Options.D = Source.getOptionD(Boolean.valueOf(args[3]));
        Options.E = Source.getOptionE(Boolean.valueOf(args[4]));
        Options.F = Source.getOptionF(Boolean.valueOf(args[5]));
        Options.G = Source.getOptionG(Boolean.valueOf(args[6]));
        Options.H = Source.getOptionH(Boolean.valueOf(args[7]));
        Options.I = Source.getOptionI(Boolean.valueOf(args[8]));
        Options.J = Source.getOptionJ(Boolean.valueOf(args[9]));

//        Options.A = Source.getOptionA(Boolean.valueOf(true));
//        Options.B = Source.getOptionB(Boolean.valueOf(true));
//        Options.C = Source.getOptionC(Boolean.valueOf(true));
//        Options.D = Source.getOptionD(Boolean.valueOf(true));
//        Options.E = Source.getOptionD(Boolean.valueOf(true));
//        Options.F = Source.getOptionD(Boolean.valueOf(true));
//        Options.G = Source.getOptionD(Boolean.valueOf(true));
//        Options.H = Source.getOptionD(Boolean.valueOf(true));
//        Options.I = Source.getOptionD(Boolean.valueOf(true));
//        Options.J = Source.getOptionD(Boolean.valueOf(false));
//        Options.K = Source.getOptionD(Boolean.valueOf(false));

        boolean a = Options.A;
        boolean b = Options.B;
        boolean c = Options.C;
        boolean d = Options.D;
        boolean e = Options.E;
        boolean f = Options.F;
        boolean g = Options.G;
        boolean h = Options.H;
        boolean i = Options.I;
        boolean j = Options.J;

        Thread.sleep(1000);

        if(Workload.ONE) {
            Example.foo(a, b, c, d, e, f, g, h, i);
        }
    }

    public static void foo(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean i) throws InterruptedException {
        boolean x = false;

        if(a) {
            Thread.sleep(2000);
            Example.moo(c);
            x = true;
        }

        if(b && x) Thread.sleep(3000);

        if(d && e && f) Thread.sleep(5000);

        if(a) Thread.sleep(100);
        if(b) Thread.sleep(200);
        if(c) Thread.sleep(300);
        if(d) Thread.sleep(400);
        if(e) Thread.sleep(500);
        if(f) Thread.sleep(600);
        if(g) Thread.sleep(700);
        if(h) Thread.sleep(800);
        if(i) Thread.sleep(900);
    }

    private static void moo(boolean c) throws InterruptedException {
        if(c) {
            Thread.sleep(4000);
        }
    }
}
