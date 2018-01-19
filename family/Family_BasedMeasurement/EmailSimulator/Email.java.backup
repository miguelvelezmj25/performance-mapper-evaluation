package EmailSystem; 

public   class  Email {
	

	protected int id;

	
	protected String subject;

	
	protected String body;

	
	protected Client from;

	
	protected String to;

	
	
	static int emailCounter = 1;

	

	@featureHouse.FeatureAnnotation(name="base")
public Email(int id) {
		this.id = id;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
static Email createEmail(Client from, String to, String subject, String body) {
		Email msg = new Email(emailCounter++);
		msg.setEmailFrom(from);
		msg.setEmailTo(to);
		msg.setEmailSubject(subject);
		msg.setEmailBody(body);
		return msg;
	}

	

	@featureHouse.FeatureAnnotation (name="base")
boolean isReadable__before__encrypt() {
		return true;
	}

	

	@featureHouse.FeatureAnnotation(name="encrypt")
boolean  isReadable__role__encrypt() {
		if (!isEncrypted())
			return isReadable__before__encrypt();
		else
			return false;
	}

	
	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=12, thenFeature="encrypt", elseFeature="base")
boolean
isReadable() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_encrypt) {
        return isReadable__role__encrypt();
    } else {
        return isReadable__before__encrypt();
    }
}



	

	@featureHouse.FeatureAnnotation (name="base")
static void printMail__before__encrypt(Email msg) {
		Util.prompt("ID:  " + msg.getId());
		Util.prompt("FROM: " + msg.getEmailFrom().getId());
		Util.prompt("TO: " + msg.getEmailTo());
		Util.prompt("SUBJECT: " + msg.getEmailSubject());
		Util.prompt("IS_READABLE " + msg.isReadable());
		Util.prompt("BODY: " + msg.getEmailBody());
	}

	

	@featureHouse.FeatureAnnotation(name="encrypt")
static void  printMail__role__encrypt(Email msg) {
		printMail__before__encrypt(msg);
		Util.prompt("ENCRYPTED " + msg.isEncrypted());
		// Util.prompt("ENCRYPTION KEY  "+ msg.getEmailEncryptionKey());
	}

	
	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=13, thenFeature="encrypt", elseFeature="base")
static void
printMail__before__sign(Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_encrypt) {
        printMail__role__encrypt(msg);
    } else {
        printMail__before__encrypt(msg);
    }
}



	
	
	@featureHouse.FeatureAnnotation(name="sign")
static void  printMail__role__sign(Email msg) {
		printMail__before__sign(msg);
		Util.prompt("SIGNED " + msg.isSigned());
		Util.prompt("SIGNATURE " + msg.getEmailSignKey());
	}

	
	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=22, thenFeature="sign", elseFeature="featureSwitch")
static void
printMail__before__verify(Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_sign) {
        printMail__role__sign(msg);
    } else {
        printMail__before__sign(msg);
    }
}



	
	
	@featureHouse.FeatureAnnotation(name="verify")
static void  printMail__role__verify(Email msg) {
		printMail__before__verify(msg);
		Util.prompt("SIGNATURE VERIFIED " + msg.isSignatureVerified());
	}

	
	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=27, thenFeature="verify", elseFeature="featureSwitch")
static void
printMail(Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_verify) {
        printMail__role__verify(msg);
    } else {
        printMail__before__verify(msg);
    }
}



	

	@featureHouse.FeatureAnnotation(name="base")
Email cloneEmail(Email msg) {
		try {
			return (Email) this.clone();
		} catch (CloneNotSupportedException e) {
			throw new Error("Clone not supported");
		}
	}

	

	@featureHouse.FeatureAnnotation(name="base")
Client getEmailFrom() {
		return from;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
int getId() {
		return id;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
String getEmailSubject() {
		return subject;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
String getEmailTo() {
		return to;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
void setEmailBody(String value) {
		body = value;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
void setEmailFrom(Client value) {
		this.from = value;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
void setEmailSubject(String value) {
		this.subject = value;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
void setEmailTo(String value) {
		to = value;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
String getEmailBody() {
		return body;
	}

	
	protected boolean isEncrypted;

	
	protected int encryptionKey;

	
	
	@featureHouse.FeatureAnnotation(name="encrypt")
boolean isEncrypted() {
		return isEncrypted;
	}

	


	@featureHouse.FeatureAnnotation(name="encrypt")
void setEmailIsEncrypted(boolean value) {
		isEncrypted = value;
	}

	

	@featureHouse.FeatureAnnotation(name="encrypt")
void setEmailEncryptionKey(int value) {
		this.encryptionKey = value;
	}

	

	@featureHouse.FeatureAnnotation(name="encrypt")
int getEmailEncryptionKey() {
		return encryptionKey;
	}

	
	protected boolean signed;

	
	protected int signkey;

	
	
	@featureHouse.FeatureAnnotation(name="sign")
void setEmailIsSigned(boolean value) {
		signed = value;
	}

	

	@featureHouse.FeatureAnnotation(name="sign")
void setEmailSignKey(int value) {
		signkey = value;
	}

		
	
	@featureHouse.FeatureAnnotation(name="sign")
boolean isSigned() {
		return signed;
	}

	
	
	@featureHouse.FeatureAnnotation(name="sign")
int getEmailSignKey() {
		return signkey;
	}

	
	protected boolean isSignatureVerified;

	

	@featureHouse.FeatureAnnotation(name="verify")
boolean isSignatureVerified() {
		return isSignatureVerified;
	}

	

	@featureHouse.FeatureAnnotation(name="verify")
void setIsSignatureVerified(boolean value) {
		this.isSignatureVerified = value;
	}


}
