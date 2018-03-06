package family;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import family.TestSpecifications.SpecificationManager;
import family.verificationClasses.FeatureSwitches;

import java.util.List;

public class PL_Interface_impl implements PL_Interface {

    public static boolean BASE;
    public static boolean KEYS;
    public static boolean ENCRYPT;
    public static boolean AUTORESPONDER;
    public static boolean ADDRESSBOOK;
    public static boolean SIGN;
    public static boolean FORWARD;
    public static boolean VERIFY;
    public static boolean DECRYPT;

    public static void main(String[] args) {
        try {
            Sink.init();

//            BASE = Source.getBASE(true);
//            KEYS = Source.getKEYS(true);
//            ENCRYPT = Source.getENCRYPT(true);
//            AUTORESPONDER = Source.getAUTORESPONDER(true);
//            ADDRESSBOOK = Source.getADDRESSBOOK(true);
//            SIGN = Source.getSIGN(true);
//            FORWARD = Source.getFORWARD(true);
//            VERIFY = Source.getVERIFY(true);
//            DECRYPT = Source.getDECRYPT(true);

            BASE = Source.getBASE(Boolean.valueOf(args[0]));
            KEYS = Source.getKEYS(Boolean.valueOf(args[1]));
            ENCRYPT = Source.getENCRYPT(Boolean.valueOf(args[2]));
            AUTORESPONDER = Source.getAUTORESPONDER(Boolean.valueOf(args[3]));
            ADDRESSBOOK = Source.getADDRESSBOOK(Boolean.valueOf(args[4]));
            SIGN = Source.getSIGN(Boolean.valueOf(args[5]));
            FORWARD = Source.getFORWARD(Boolean.valueOf(args[6]));
            VERIFY = Source.getVERIFY(Boolean.valueOf(args[7]));
            DECRYPT = Source.getDECRYPT(Boolean.valueOf(args[8]));

            if(!FeatureSwitches.valid_product()) {
                return;
            }

            PL_Interface_impl impl = new PL_Interface_impl();
            SpecificationManager.checkOnlySpecification(-2);// none
            impl.start(3, -1);
            System.out.println("no Exception");
        } catch(Throwable e) {
            System.out.println("Caught Exception: " + e.getClass() + " " + e.getMessage());
            e.printStackTrace();
        }
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_1_addressBook_encrypt() {
        Test_Actions.setup();
        Test_Actions.bobKeyAdd();
        Test_Actions.bobSetAddressBook();
        Test_Actions.bobToAlias();
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_3_sign_verify() {
        Test_Actions.setup();
        Test_Actions.rjhKeyAdd();
        Test_Actions.bobKeyChange();
        //for (int i = 0; i < 100000; i++) {
        Test_Actions.bobToRjh();
        //}
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_4_sign_forward() {
        Test_Actions.setup();
        Test_Actions.rjhDeletePrivateKey();
        Test_Actions.rjhKeyAdd();
        Test_Actions.chuckKeyAdd();
        Test_Actions.rjhEnableForwarding();
        Test_Actions.bobToRjh();
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_6_encrypt_decrypt() {
        Test_Actions.setup();
        Test_Actions.bobKeyAdd();
        Test_Actions.rjhKeyChange();
        Test_Actions.bobToRjh();
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_7_encrypt_verify() {
        Test_Actions.setup();
        Test_Actions.bobKeyAdd();
        // rjhKeyAdd();
        Test_Actions.rjhKeyChange();
        Test_Actions.bobToRjh();
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_8_Encrypt_Autoresponder() {
        Test_Actions.setup();
        Test_Actions.bobKeyAdd();
        Test_Actions.rjhSetAutoRespond();
        Test_Actions.bobToRjh();
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_9_Encrypt_Forward() {
        Test_Actions.setup();
        Test_Actions.bobKeyAdd();
        Test_Actions.rjhEnableForwarding();
        Test_Actions.bobToRjh();
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_11_decrypt_autoresponder() {
        Test_Actions.setup();
        Test_Actions.bobKeyAdd();
        Test_Actions.rjhSetAutoRespond();
        Test_Actions.rjhKeyChange();
        Test_Actions.bobToRjh();
    }

    @featureHouse.FeatureAnnotation(name = "base")
    static void test_27_verify_forward() {
        Test_Actions.setup();
        Test_Actions.rjhDeletePrivateKey();
        Test_Actions.rjhKeyAdd();
        Test_Actions.rjhEnableForwarding();
        Test_Actions.bobToRjh();
    }

    public void start(int specification, int variation) {
        if(variation == -1) {
            for(int i = 0; i < 10; i++) {
                test_1_addressBook_encrypt();
                test_3_sign_verify();
                test_4_sign_forward();
                test_6_encrypt_decrypt();
                test_7_encrypt_verify();
                test_8_Encrypt_Autoresponder();
                test_9_Encrypt_Forward();
                test_11_decrypt_autoresponder();
                test_27_verify_forward();
            }
			/* if (Test_Actions.executedUnimplementedAction) {
				System.out.println("Executed an unimplemented action!!");
			} */
        }
//        else {
//            runRandomActions(variation);
//        }
        //Scenario.test();
    }

    @featureHouse.FeatureAnnotation(name = "base")
    public void checkOnlySpecification(int specID) {
        SpecificationManager.checkOnlySpecification(specID);
    }

    @featureHouse.FeatureAnnotation(name = "base")
    public List<String> getExecutedActions() {
        return Test_Actions.actionHistory;
    }

    @featureHouse.FeatureAnnotation(name = "base")
    public boolean isAbortedRun() {
        return false;
    }

    @featureHouse.FeatureAnnotation(name = "base")
    public void runRandomActions(int maxLength) {
        Test_Actions.setup();
        int counter = 0;
        while(counter < maxLength) {
            counter++;

//			int action = SPLModelChecker.getIntMinMax(0, 13);
            int action = 0;

            switch(action) {
                case 0:
                    Test_Actions.bobKeyAdd();
                    break;
                case 1:
                    Test_Actions.bobKeyAddChuck();
                    break;
                case 2:
                    Test_Actions.bobKeyChange();
                    break;
                case 3:
                    Test_Actions.bobSetAddressBook();
                    break;
                case 4:
                    Test_Actions.chuckKeyAdd();
                    break;
                case 5:
                    Test_Actions.rjhDeletePrivateKey();
                    break;
                case 6:
                    Test_Actions.rjhEnableForwarding();
                    break;
                case 7:
                    Test_Actions.rjhKeyAdd();
                    break;
                case 8:
                    Test_Actions.rjhKeyAddChuck();
                    break;
                case 9:
                    Test_Actions.rjhKeyChange();
                    break;
                case 10:
                    Test_Actions.rjhSetAutoRespond();
                    break;

                case 11:
                    Test_Actions.bobToAlias();
                    break;
                case 12:
                    Test_Actions.bobToRjh();
                    break;
                case 13:
                    Test_Actions.rjhToBob();
                    break;
                default:
                    throw new InternalError("Missed a case!");
            }
            if(Test_Actions.executedUnimplementedAction) {
                //"invalid" path
                return;
            }
        }
    }


}
