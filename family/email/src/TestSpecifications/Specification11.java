package TestSpecifications; 

public  class  Specification11 {
	
	
	@featureHouse.FeatureAnnotation(name="autoresponder")
public String getName() {
		return "11-Decrypt-AutoResponder";
	}

	
	
	@featureHouse.FeatureAnnotation(name="autoresponder")
public void callFromAutoRespond(boolean isReadable) {
		if (!isReadable) {
			throw new SpecificationException(getName(), "Mail was not decrypted before AutoRespond (TestCase 11 Error Condition)");
		}
	}


}
