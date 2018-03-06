package family.EmailSystem;

import static family.PL_Interface_impl.*;

public class Email {


    static int emailCounter = 1;
    protected int id;
    protected String subject;
    protected String body;
    protected Client from;
    protected String to;
    protected boolean isEncrypted;
    protected int encryptionKey;
    protected boolean signed;
    protected int signkey;
    protected boolean isSignatureVerified;


    @featureHouse.FeatureAnnotation(name = "base")
    public Email(int id) {
        this.id = id;
    }

    static Email createEmail(Client from, String to, String subject, String body) {
        Email msg = new Email(emailCounter++);
        msg.setEmailFrom(from);
        msg.setEmailTo(to);
        msg.setEmailSubject(subject);
        msg.setEmailBody(body);
        return msg;
    }

    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 27, thenFeature = "verify", elseFeature = "featureSwitch")
    static void
    printMail(Email msg) {
        Util.prompt("ID:  " + msg.getId());
        Util.prompt("FROM: " + msg.getEmailFrom().getId());
        Util.prompt("TO: " + msg.getEmailTo());
        Util.prompt("SUBJECT: " + msg.getEmailSubject());
        Util.prompt("IS_READABLE " + msg.isReadable());
        Util.prompt("BODY: " + msg.getEmailBody());

        if(ENCRYPT) {
            Util.prompt("ENCRYPTED " + msg.isEncrypted());
            // Util.prompt("ENCRYPTION KEY  "+ msg.getEmailEncryptionKey());
        }

        if(SIGN) {
            Util.prompt("SIGNED " + msg.isSigned());
            Util.prompt("SIGNATURE " + msg.getEmailSignKey());
        }

        if(VERIFY) {
            Util.prompt("SIGNATURE VERIFIED " + msg.isSignatureVerified());
        }
    }

    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 12, thenFeature = "encrypt", elseFeature = "base")
    boolean
    isReadable() {
        if(ENCRYPT) {
            if(!isEncrypted()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
    }

    @featureHouse.FeatureAnnotation(name = "base")
    Email cloneEmail(Email msg) {
        try {
            return (Email) this.clone();
        } catch(CloneNotSupportedException e) {
            throw new Error("Clone not supported");
        }
    }

    @featureHouse.FeatureAnnotation(name = "base")
    Client getEmailFrom() {
        return from;
    }

    void setEmailFrom(Client value) {
        this.from = value;
    }

    @featureHouse.FeatureAnnotation(name = "base")
    int getId() {
        return id;
    }

    String getEmailSubject() {
        return subject;
    }

    void setEmailSubject(String value) {
        this.subject = value;
    }

    @featureHouse.FeatureAnnotation(name = "base")
    String getEmailTo() {
        return to;
    }

    @featureHouse.FeatureAnnotation(name = "base")
    void setEmailTo(String value) {
        to = value;
    }

    String getEmailBody() {
        return body;
    }

    void setEmailBody(String value) {
        body = value;
    }

    @featureHouse.FeatureAnnotation(name = "encrypt")
    boolean isEncrypted() {
        try {
            Thread.sleep(50);
        } catch(InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return isEncrypted;
    }

    @featureHouse.FeatureAnnotation(name = "encrypt")
    void setEmailIsEncrypted(boolean value) {
        isEncrypted = value;
    }

    int getEmailEncryptionKey() {
        return encryptionKey;
    }

    @featureHouse.FeatureAnnotation(name = "encrypt")
    void setEmailEncryptionKey(int value) {
        this.encryptionKey = value;
    }

    @featureHouse.FeatureAnnotation(name = "sign")
    void setEmailIsSigned(boolean value) {
        try {
            Thread.sleep(50);
        } catch(InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        signed = value;
    }

    @featureHouse.FeatureAnnotation(name = "sign")
    boolean isSigned() {
        return signed;
    }


    @featureHouse.FeatureAnnotation(name = "sign")
    int getEmailSignKey() {
        return signkey;
    }

    void setEmailSignKey(int value) {
        signkey = value;
    }

    @featureHouse.FeatureAnnotation(name = "verify")
    boolean isSignatureVerified() {
        return isSignatureVerified;
    }


    @featureHouse.FeatureAnnotation(name = "verify")
    void setIsSignatureVerified(boolean value) {
        try {
            Thread.sleep(50);
        } catch(InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        this.isSignatureVerified = value;
    }


}
