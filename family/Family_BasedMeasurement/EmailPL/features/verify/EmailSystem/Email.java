package EmailSystem;

public class Email {
	protected boolean isSignatureVerified;
	
	static void printMail(Email msg) {
		original(msg);
		Util.prompt("SIGNATURE VERIFIED " + msg.isSignatureVerified());
	}

	boolean isSignatureVerified() {
		return isSignatureVerified;
	}

	void setIsSignatureVerified(boolean value) {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.isSignatureVerified = value;
	}
}
