package family.TestSpecifications;

import static family.PL_Interface_impl.*;

public class SpecificationManager {


    public static Specification1_8 spec1_8;
    public static Specification9 spec9;
    public static Specification6 spec6;
    public static Specification11 spec11;
    public static Specification3 spec3;
    public static Specification4 spec4;
    public static Specification7 spec7;
    public static Specification27 spec27;
    private static int singleSpecification = 0;

    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 26, thenFeature = "verify", elseFeature = "featureSwitch")
    public static void
    setupSpecifications() {
        if(VERIFY) {
            spec7 = new Specification7();
            spec27 = new Specification27();
        }

        if(SIGN) {
            spec3 = new Specification3();
            spec4 = new Specification4();
        }

        if(AUTORESPONDER) {
            spec11 = new Specification11();
        }

        if(ENCRYPT) {
            spec1_8 = new Specification1_8();
            spec9 = new Specification9();
            spec6 = new Specification6();
        }
    }

    /**
     * -1 : all Specifications of enabled Features
     * -2 : no Specifications
     * else : only specification with given number
     *
     * @param specificationID
     * @return
     */
    @featureHouse.FeatureAnnotation(name = "base")
    public static boolean checkSpecification(int id) {
        if(singleSpecification == -2) {
            return false;
        }
        else if(singleSpecification == -1) {
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
