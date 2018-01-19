package TestSpecifications; 

import java.util.HashSet; 
import java.util.Set; 

import EmailSystem.Email; 

public  class  Specification9 {
	
	
	static private Set<Email> encryptedMails = new HashSet<Email>(2);

	
	@featureHouse.FeatureAnnotation(name="encrypt")
public String getName() {
		return "9-Encrypt-Forward";
	}

	
	
	@featureHouse.FeatureAnnotation(name="encrypt")
public void callFromMail(Email msg, boolean isEncrypted) {
		if (encryptedMails.contains(msg)) {
			if (!isEncrypted) {
				throw new SpecificationException(getName(), "Previously encrypted Mail is forwarded in clear (TestCase 9 Error Condition)");
			}
		}
	}

	
	
	@featureHouse.FeatureAnnotation(name="encrypt")
public void callFromIncoming(Email msg, boolean isEncrypted) {
		if (isEncrypted) {
			encryptedMails.add(msg);
		}
	}


}
