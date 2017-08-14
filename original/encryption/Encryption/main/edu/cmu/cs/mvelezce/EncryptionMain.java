package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import se.simbio.encryption.Encryption;
import third.part.android.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class EncryptionMain {

    private static boolean KEYLENGTH;
    private static boolean KEYALGORITHM;

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeySpecException {
        KEYLENGTH = Source.getOptionKEYLENGTH(Boolean.valueOf(args[0]));
        KEYALGORITHM = Source.getOptionKEYALGORITHM(Boolean.valueOf(args[1]));

//        KEYLENGTH = Source.getOptionKEYLENGTH(true);
//        KEYALGORITHM = Source.getOptionKEYALGORITHM(true);

        int keyLength;
        String keyAlgorithm;

        if(KEYLENGTH) {
            keyLength = 128;
        }
        else {
            keyLength = 32;
        }

        if(KEYALGORITHM) {
            keyAlgorithm = "AES";
        }
        else {
            keyAlgorithm = "DES";
        }

        Encryption.Builder builder = new Encryption.Builder();

        Encryption encryption = builder.setKeyLength(keyLength)
                .setKeyAlgorithm(keyAlgorithm)
                .setCharsetName("UTF8")
                .setIterationCount(65536)
                .setKey("mor€Z€cr€tKYss")
                .setDigestAlgorithm("SHA1")
                .setSalt("A beautiful salt")
                .setBase64Mode(Base64.DEFAULT)
                .setAlgorithm("AES/CBC/PKCS5Padding")
                .setSecureRandomAlgorithm("SHA1PRNG")
                .setSecretKeyType("PBKDF2WithHmacSHA1")
                .setIv(new byte[]{29, 88, -79, -101, -108, -38, -126, 90, 52, 101, -35, 114, 12, -48, -66, -30})
                .build();

//        if(Sink.getDecision(builder == null)) {
//            System.out.println(";");
//        }
//
//        if(Sink.getDecision(encryption == null)) {
//            System.out.println(":");
//        }

        String secretText = "This is a text to be encrypt, it can be any string that you want";

        String encrypted = encryption.encrypt(secretText);

////        if(Sink.getDecision(encrypted == null)) {
////            System.out.println(":");
////        }
//
//        System.out.println("This is our secret text: " + secretText);
//        System.out.println("And this is our encrypted text: " + encrypted);
//
//        String decrypted = encryption.decrypt(encrypted);
//
////        if(Sink.getDecision(decrypted == null)) {
////            System.out.println(":");
////        }
//
//        System.out.println("And finally this is our decrypted text: " + decrypted);
    }

}
