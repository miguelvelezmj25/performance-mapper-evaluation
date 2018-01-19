package TestSpecifications; 

public   class  SpecificationManager {
	
	
	@featureHouse.FeatureAnnotation (name="base")
public static void setupSpecifications__before__encrypt() {
	}

	
	
	@featureHouse.FeatureAnnotation(name="encrypt")
public static void  setupSpecifications__role__encrypt() {
		spec1_8 = new Specification1_8();
		spec9 = new Specification9();
		spec6 = new Specification6();
		setupSpecifications__before__encrypt();
	}

	
	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=11, thenFeature="encrypt", elseFeature="base")
public static void
setupSpecifications__before__autoresponder() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_encrypt) {
        setupSpecifications__role__encrypt();
    } else {
        setupSpecifications__before__encrypt();
    }
}



	
	
	@featureHouse.FeatureAnnotation(name="autoresponder")
public static void  setupSpecifications__role__autoresponder() {
		spec11 = new Specification11();
		setupSpecifications__before__autoresponder();
	}

	
	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=16, thenFeature="autoresponder", elseFeature="featureSwitch")
public static void
setupSpecifications__before__sign() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_autoresponder) {
        setupSpecifications__role__autoresponder();
    } else {
        setupSpecifications__before__autoresponder();
    }
}



	
	
	@featureHouse.FeatureAnnotation(name="sign")
public static void  setupSpecifications__role__sign() {
		spec3 = new Specification3();
		spec4 = new Specification4();
		setupSpecifications__before__sign();
	}

	
	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=21, thenFeature="sign", elseFeature="featureSwitch")
public static void
setupSpecifications__before__verify() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_sign) {
        setupSpecifications__role__sign();
    } else {
        setupSpecifications__before__sign();
    }
}



	
	
	@featureHouse.FeatureAnnotation(name="verify")
public static void  setupSpecifications__role__verify() {
		spec7 = new Specification7();
		spec27 = new Specification27();
		setupSpecifications__before__verify();
	}

	
	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=26, thenFeature="verify", elseFeature="featureSwitch")
public static void
setupSpecifications() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_verify) {
        setupSpecifications__role__verify();
    } else {
        setupSpecifications__before__verify();
    }
}



	
	
	/**
	 * -1 : all Specifications of enabled Features
	 * -2 : no Specifications
	 * else : only specification with given number
	 * @param specificationID
	 * @return
	 */
	@featureHouse.FeatureAnnotation(name="base")
public static boolean checkSpecification(int id) {
		if (singleSpecification == -2)
			return false;
		else if (singleSpecification == -1)
			return true;
		else 
			return singleSpecification == id;
	}

	

	private static int singleSpecification = 0;

	

	@featureHouse.FeatureAnnotation(name="base")
public static void checkOnlySpecification(int scenario) {
		singleSpecification  = scenario;
	}

		
	public static Specification1_8 spec1_8;

	
	public static Specification9 spec9;

	
	public static Specification6 spec6;

	
	public static Specification11 spec11;

	
	public static Specification3 spec3;

	
	public static Specification4 spec4;

	
	public static Specification7 spec7;

	
	public static Specification27 spec27;


}
