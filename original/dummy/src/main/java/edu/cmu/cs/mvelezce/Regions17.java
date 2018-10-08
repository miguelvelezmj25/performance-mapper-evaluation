package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Regions17 {

    static boolean A;

    public static void main(String[] args) {
        Sink.init();

        A = Source.getOptionA(Boolean.valueOf(args[0]));

        boolean a = false;

        if(A) { // A
            a = true;
        }

//        A taint = new A(null, a);
//        A not1 = new A();

//        List list = new LinkedList();
        List<I> list = new LinkedList<>();

        I b = new B();

        list.add(b);

        /*
        Iterator i = list.iterator();

        while(i.hasNext()) {
            Sink.sink(taint);
            Sink.sink(taint.object);
            ((I) i.next()).recieve(taint);
        }
        */

        /*
        for(int i = 0; i < list.size(); i++) {
            Sink.sink(taint);
            Sink.sink(taint.object);
            I ob = (I) list.get(i);
            ob.recieve(taint);
        }
        */


//        Iterator<I> i = list.iterator();
//
//        while(i.hasNext()) {
//            Sink.sink(taint);
//            Sink.sink(taint.object);
//            i.next().recieve(taint);
//        }



        for(int i = 0; i < list.size(); i++) {
//            Sink.sink(taint);
//            Sink.sink(taint.object);
            I ob = list.get(i);
            ob.recieve(a);
        }

//        b.recieve(a);


//        c.recieve(taint);
    }
}