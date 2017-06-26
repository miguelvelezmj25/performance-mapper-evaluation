package edu.cmu.cs.mvelezce.TestSpecifications;

public class SpecificationManager {


    private static int singleSpecification = -1;

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public static void setupSpecifications() {
    }

    /**
     * -1 : all Specifications of enabled Features
     * -2 : no Specifications
     * else : only specification with given number
     *
     * @param specificationID
     * @return
     */
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public static boolean checkSpecification(int id) {
        if (singleSpecification == -2) {
            return false;
        }
        else if (singleSpecification == -1) {
            return true;
        }
        else {
            return singleSpecification == id;
        }
    }

    public static void checkOnlySpecification(int scenario) {
        singleSpecification = scenario;
    }


}
