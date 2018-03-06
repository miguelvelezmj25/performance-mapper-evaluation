package family.EmailSystem;

public class Util {


    @featureHouse.FeatureAnnotation(name = "base")
    public static void prompt(String msg) {
        // System.out.println(msg);
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public static void prompt(int msg) {
        prompt(String.valueOf(msg));
    }


}
