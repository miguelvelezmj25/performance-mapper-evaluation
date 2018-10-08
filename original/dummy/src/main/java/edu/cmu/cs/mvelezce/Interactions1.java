package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;

import java.util.HashMap;
import java.util.Map;

public class Interactions1 {

    static boolean A = Source.getOptionA(true);
    static boolean B = Source.getOptionB(true);

    public static void main(String[] args) {
        Sink.init();

        boolean a = false;
        boolean b = false;

        if(A) {
            a = true;
        }

        if(B) {
            b = true;
        }

        String Akey = "a";
        String Bkey = "b";

        Map<String, Object> map = new HashMap<>();
        map.put(Akey, a);
        map.put(Bkey, b);

        Sink.sink(map);
        Sink.sink(map.get(Akey));
        Sink.sink(map.get(Bkey));
    }

}
