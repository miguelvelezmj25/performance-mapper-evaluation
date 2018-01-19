package TestSpecifications; 

import EmailSystem.Client; 

public  class  Specification4 {
	
	@featureHouse.FeatureAnnotation(name="sign")
public String getName() {
		return "4-Sign-Forward";
	}

	
	
	@featureHouse.FeatureAnnotation(name="sign")
public void callFromVerify(boolean isSigned, int msgSignKey, int senderKey) {
		if (isSigned) {
			if (Client.isKeyPairValid(senderKey, msgSignKey)) {
				throw new SpecificationException(getName(),
						"Cannot verify Mail because the signKey does not match the senderkey (TestCase 4 Error Condition)");
			}
		}
	}


}
