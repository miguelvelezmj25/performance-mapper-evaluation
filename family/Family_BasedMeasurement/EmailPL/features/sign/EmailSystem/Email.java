package EmailSystem;

public class Email {
	protected boolean signed;
	protected int signkey;
	
	static void printMail(Email msg) {
		original(msg);
		Util.prompt("SIGNED " + msg.isSigned());
		Util.prompt("SIGNATURE " + msg.getEmailSignKey());
	}
	
	void setEmailIsSigned(boolean value) {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		signed = value;
	}

	void setEmailSignKey(int value) {
		signkey = value;
	}	
	
	boolean isSigned() {
		return signed;
	}
	
	int getEmailSignKey() {
		return signkey;
	}
}
