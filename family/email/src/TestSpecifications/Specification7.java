package TestSpecifications; 


public  class  Specification7 {
	
	@featureHouse.FeatureAnnotation(name="verify")
public String getName() {
		return "7-Encrypt-Verify";
	}

	
	
	@featureHouse.FeatureAnnotation(name="verify")
public void callFromVerify(boolean isReadable) {
		if (!isReadable) {
			throw new SpecificationException(getName(),
					"Email to be verified is not readable (TestCase 7 Error Message)");
		}
	}


}
