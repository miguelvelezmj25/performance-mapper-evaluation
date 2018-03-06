package family.TestSpecifications;

import family.EmailSystem.Client;
import family.EmailSystem.Email;

import java.util.HashSet;
import java.util.Set;

public class Specification3 {


    private Set<Email> signedMails = new HashSet<Email>(2);


    @featureHouse.FeatureAnnotation(name = "sign")
    public String getName() {
        return "3-Sign-Verify";
    }


    @featureHouse.FeatureAnnotation(name = "sign")
    public void callFromMail(Email msg, boolean isSigned) {
        if(isSigned) {
            signedMails.add(msg);
        }
    }


    @featureHouse.FeatureAnnotation(name = "sign")
    public void callFromVerify(Email msg, int msgSignKey, int bobPubKey_Old) {
        if(signedMails.contains(msg)) {
            if(!(Client.isKeyPairValid(bobPubKey_Old, msgSignKey))) {
                throw new SpecificationException(getName(), "Email signed with old key (Testcase 3 Error)");
            }
        }
    }


}
