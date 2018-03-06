package family.TestSpecifications;

import family.EmailSystem.Client;
import family.EmailSystem.Email;

import java.util.HashSet;
import java.util.Set;

public class Specification6 {


    private Set<Email> encryptedMails = new HashSet<Email>(2);


    @featureHouse.FeatureAnnotation(name = "encrypt")
    public String getName() {
        return "6-Encrypt-Decrypt";
    }


    @featureHouse.FeatureAnnotation(name = "encrypt")
    public void callFromIncoming__role__Decrypt(Email msg, int encryptionKey, int clientPrivateKey) {
        if(encryptedMails.contains(msg)) {
            if(!(Client.isKeyPairValid(encryptionKey, clientPrivateKey))) {
                throw new SpecificationException(getName(), "Received Mail is unreadable because encrypted with old Key (TestCase 6 Error Condition)");
            }
        }
    }


    @featureHouse.FeatureAnnotation(name = "encrypt")
    public void callFromMail(Email msg, boolean isEncrypted) {
        if(isEncrypted) {
            encryptedMails.add(msg);
        }
    }


}
