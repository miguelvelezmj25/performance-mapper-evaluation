
package EmailSystem; 

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 

import TestSpecifications.SpecificationManager; 

public   class  Client {
	
	protected int id;

	
	protected String name;

	 // name does also serve as address at the moment


public int getId() {
		return id;
	}

	
	
	// incoming emails reach the user at this point. here they are put in a
	// mailbox.

static void deliver(Client client, Email msg) {
		Util.prompt("mail delivered\n");
	}

	

	// incoming emails are processed by this method before delivery.
	@featureHouse.FeatureAnnotation (name="base")
static void incoming__before__autoresponder(Client client, Email msg) {
		deliver(client, msg);
	}

	

	// incoming emails are processed by this method before delivery.
	@featureHouse.FeatureAnnotation(name="autoresponder")
static void  incoming__role__autoresponder(Client client, Email msg) {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		incoming__before__autoresponder(client, msg);
		if (client.isAutoResponse()) {
			autoRespond(client, msg);
		}
	}

	
	
	// incoming emails are processed by this method before delivery.
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=17, thenFeature="autoresponder", elseFeature="base")
static void
incoming__before__forward(Client client, Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_autoresponder) {
        incoming__role__autoresponder(client, msg);
    } else {
        incoming__before__autoresponder(client, msg);
    }
}



	
	
	// incoming emails are processed by this method before delivery.
	@featureHouse.FeatureAnnotation(name="forward")
static void  incoming__role__forward(Client client, Email msg) {
		incoming__before__forward(client, msg);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Client receiver = client.getForwardReceiver();
		if (receiver != null) {
			msg.setEmailTo(receiver.getName());
			forward(client, msg);
			incoming(receiver, msg);
		}
	}

	

	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=25, thenFeature="forward", elseFeature="featureSwitch")
static void
incoming__before__verify(Client client, Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_forward) {
        incoming__role__forward(client, msg);
    } else {
        incoming__before__forward(client, msg);
    }
}



	

	@featureHouse.FeatureAnnotation(name="verify")
static void  incoming__role__verify(Client client, Email msg) {
		verify(client, msg);
		incoming__before__verify(client, msg);
	}

	


	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=28, thenFeature="verify", elseFeature="featureSwitch")
static void
incoming__before__decrypt(Client client, Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_verify) {
        incoming__role__verify(client, msg);
    } else {
        incoming__before__verify(client, msg);
    }
}



	


	@featureHouse.FeatureAnnotation(name="decrypt")
static void  incoming__role__decrypt(Client client, Email msg) {
		// decrypt
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int privkey = client.getPrivateKey();
		if (privkey != 0) {
			if (msg.isEncrypted()
					&& isKeyPairValid(msg.getEmailEncryptionKey(), privkey)) {
				msg.setEmailIsEncrypted(false);
				msg.setEmailEncryptionKey(0);
			}
		}
		// end decrypt

		incoming__before__decrypt(client, msg);
	}

	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=29, thenFeature="decrypt", elseFeature="featureSwitch")
static void
incoming(Client client, Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_decrypt) {
        incoming__role__decrypt(client, msg);
    } else {
        incoming__before__decrypt(client, msg);
    }
}



	

	// outgoing emails leave the client at this point. here they are put in an
	// outgoing queue instead.

static void mail(Client client, Email msg) {
		Util.prompt("mail sent");
	}

	


	// emails to be sent are processed by this method before beeing mailed.
	@featureHouse.FeatureAnnotation (name="base")
static void outgoing__before__encrypt(Client client, Email msg) {
		msg.setEmailFrom(client);
		mail(client, msg);
	}

	


	// emails to be sent are processed by this method before beeing mailed.
	@featureHouse.FeatureAnnotation(name="encrypt")
static void  outgoing__role__encrypt(Client client, Email msg) {

		// encrypt
		Client receiver = getClientByAdress(msg.getEmailTo());
		int pubkey = client.getKeyringPublicKeyByClient(receiver);
		if (pubkey != 0) {
			msg.setEmailEncryptionKey(pubkey);
			msg.setEmailIsEncrypted(true);
			Util.prompt("Encrypted Mail " + msg.getId());
		}
		// msg.setEmailIsEncrypted(true); // von mir gelöscht, das macht keinen
		// sinn!

		// end encrypt

		outgoing__before__encrypt(client, msg);
	}

	
	// emails to be sent are processed by this method before being mailed.
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=14, thenFeature="encrypt", elseFeature="base")
static void
outgoing__before__addressbook(Client client, Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_encrypt) {
        outgoing__role__encrypt(client, msg);
    } else {
        outgoing__before__encrypt(client, msg);
    }
}



	
	// emails to be sent are processed by this method before being mailed.
	@featureHouse.FeatureAnnotation(name="addressbook")
static void  outgoing__role__addressbook(Client client, Email msg) {
		List<String> aliasReceivers = client
				.getAddressBookReceiversForAlias(msg.getEmailTo());
		if (!aliasReceivers.isEmpty()) {
			// found alias, sending to the addresses that are associated with
			// this alias (to addresses 1,2,...) address 0 will be handled by the other methods
			for (int i = 1; i < aliasReceivers.size(); i++) {
				String receiverAddress = aliasReceivers.get(i);
				msg.setEmailTo(receiverAddress);
				outgoing(client, msg);
				incoming(Client.getClientByAdress(receiverAddress), msg);
			}
			msg.setEmailTo(aliasReceivers.get(0));
			outgoing__before__addressbook(client, msg);
		} else {
			// no alias, must be a normal address
			outgoing__before__addressbook(client, msg);
		}
	}

	
	


	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=20, thenFeature="addressbook", elseFeature="featureSwitch")
static void
outgoing__before__sign(Client client, Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_addressbook) {
        outgoing__role__addressbook(client, msg);
    } else {
        outgoing__before__addressbook(client, msg);
    }
}



	
	



static void  outgoing__role__sign(Client client, Email msg) {
		sign(client, msg);
		outgoing__before__sign(client, msg);
	}

	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=23, thenFeature="sign", elseFeature="featureSwitch")
static void
outgoing(Client client, Email msg) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_sign) {
        outgoing__role__sign(client, msg);
    } else {
        outgoing__before__sign(client, msg);
    }
}



	


public static int sendEmail(Client sender, String receiverAddress,
			String subject, String body) {
		Email email = Email.createEmail(sender, receiverAddress, subject, body);
		Util.prompt("sending Mail " + email.getId());
		outgoing(sender, email);
		Client receiver = Client.getClientByAdress(email.getEmailTo());
		if (receiver != null) {
			incoming(receiver, email);
		} else {
			throw new IllegalArgumentException("Receiver " + receiverAddress + " Unknown");
		}
		return 0; // die Zeile kommt von mir
	}

	

	@featureHouse.FeatureAnnotation(name="base")
private Client(int id, String name) {
		this.id = id;
		this.name = name;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
public String getName() {
		return name;
	}

	

	static int clientCounter = 1;

	


public static Client createClient(String name) {
		Client client = new Client(clientCounter++, name);
		clients[client.getId()] = client;
		return client;
	}

	

	static Client[] clients = new Client[4];

	

	@featureHouse.FeatureAnnotation(name="base")
static Client getClientById(int id) {
		return clients[id];
	}

	

	/**
	 * address equals name for now
	 * 
	 * This method implements the EmailAddress to Receiver lookup. The method
	 * returns null if the address is not found!
	 */

static Client getClientByAdress(String address) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && clients[i].getName().equals(address)) {
				return clients[i];
			}
		}
		return null;
	}

	


public static void resetClients() {
		clientCounter = 1;
		for (int i = 0; i < clients.length; i++) {
			clients[i] = null;
		}
	}

	

	@featureHouse.FeatureAnnotation(name="base")
@Override
	public String toString() {
		return name;
	}

	
	/**
	 * Saves public keys of other clients
	 */
	protected ArrayList<KeyringEntry> keyring = new ArrayList<KeyringEntry>();

	

	protected int privateKey;

	


public void setPrivateKey(int privateKey) {
		this.privateKey = privateKey;
	}

	

	@featureHouse.FeatureAnnotation(name="keys")
public int getPrivateKey() {
		return privateKey;
	}

	

	/**
	 * Currently this method does only set the private key to seed
	 */

public static void generateKeyPair(Client client, int seed) {
	try {
		Thread.sleep(100);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		client.setPrivateKey(seed);
	}

	


public void addKeyringEntry(Client client, int publicKey) {
		this.keyring.add(new KeyringEntry(client, publicKey));
	}

	
	
	/**
	 * Returns the public key of client, if it is saved in this keyring. If not
	 * the method returns 0.
	 */
	@featureHouse.FeatureAnnotation(name="keys")
public int getKeyringPublicKeyByClient(Client client) {
		for (KeyringEntry e : keyring) {
			if (e.getKeyOwner().equals(client)) {
				return e.getPublicKey();
			}
		}
		return 0;
	}

	

	@featureHouse.FeatureAnnotation(name="keys")
public static boolean isKeyPairValid(int publicKey, int privateKey) {
		Util.prompt("keypair valid " + publicKey + " " + privateKey);
		if (publicKey == 0 || privateKey == 0)
			return false;
		return privateKey == publicKey;
	}

	
	

	static  class  KeyringEntry {
		
		private Client keyOwner;

		
		private int publicKey;

		

		@featureHouse.FeatureAnnotation(name="keys")
public KeyringEntry(Client keyOwner, int publicKey) {
			super();
			this.keyOwner = keyOwner;
			this.publicKey = publicKey;
		}

		

		@featureHouse.FeatureAnnotation(name="keys")
public Client getKeyOwner() {
			return keyOwner;
		}

		

		@featureHouse.FeatureAnnotation(name="keys")
public int getPublicKey() {
			return publicKey;
		}


	}

	
	protected boolean autoResponse;

	

public void setAutoResponse(boolean autoResponse) {
		this.autoResponse = autoResponse;
	}

	

	@featureHouse.FeatureAnnotation(name="autoresponder")
public boolean isAutoResponse() {
		return autoResponse;
	}

	
	@featureHouse.FeatureAnnotation(name="autoresponder")
static void autoRespond(Client client, Email msg) {
		Util.prompt("sending autoresponse\n");
		Client sender = msg.getEmailFrom();
		msg.setEmailTo(sender.getName());
		outgoing(client, msg);
		incoming(sender, msg);
	}

	
	/**
	 * stores an alias to List-of-adresses mapping. (by sending to one alias the
	 * email can be sent to multiple clients ~ mailing-lists?)
	 */
	protected ArrayList<AddressBookEntry> addressbook = new ArrayList<AddressBookEntry>();

	
	
	/**
	 * Returns the empty list if alias is unknown.
	 */
	@featureHouse.FeatureAnnotation(name="addressbook")
public List<String> getAddressBookReceiversForAlias(String alias) {
		for (AddressBookEntry e : addressbook) {
			if (e.getAlias().equals(alias)) {
				return e.getReceivers();
			}
		}
		return Collections.emptyList();
	}

	
	
	/**
	 * Adds a new receiver to the address book entry identified with alias. If
	 * the entry does not exist it is created.
	 */
	@featureHouse.FeatureAnnotation(name="addressbook")
public void addAddressbookEntry(String alias, String receiver) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (AddressBookEntry e : addressbook) {
			if (e.getAlias().equals(alias)) {
				e.addReceiver(receiver);
				return;
			}
		}
		AddressBookEntry newEntry = new AddressBookEntry(alias);
		newEntry.addReceiver(receiver);
		addressbook.add(newEntry);
	}

	

	static  class  AddressBookEntry {
		
		String alias;

		
		ArrayList<String> receivers;

		

		@featureHouse.FeatureAnnotation(name="addressbook")
public AddressBookEntry(String alias) {
			super();
			this.alias = alias;
			this.receivers = new ArrayList<String>();
		}

		

		@featureHouse.FeatureAnnotation(name="addressbook")
public void addReceiver(String address) {
			receivers.add(address);
		}

		

		@featureHouse.FeatureAnnotation(name="addressbook")
public String getAlias() {
			return alias;
		}

		

		@featureHouse.FeatureAnnotation(name="addressbook")
public ArrayList<String> getReceivers() {
			return receivers;
		}


	}

	
	/** adds the sign flag to message body
	 */

static void sign(Client client, Email msg) {
		int privkey = client.getPrivateKey();
		if (privkey == 0)
			return;
		msg.setEmailIsSigned(true);
		msg.setEmailSignKey(privkey);
	}

	
	protected Client forwardReceiver;

	
	

public void setForwardReceiver(Client forwardReceiver) {
		this.forwardReceiver = forwardReceiver;
	}

	

	@featureHouse.FeatureAnnotation(name="forward")
public Client getForwardReceiver() {
		return forwardReceiver;
	}

	

	@featureHouse.FeatureAnnotation(name="forward")
static void forward(Client client, Email msg) {
		Util.prompt("Forwarding message.\n");
		Email.printMail(msg);
		outgoing(client, msg);
	}

	

	/** checks for a valid signature and replaces it by a flag signaling a
	 * verified signature 
	 */
	@featureHouse.FeatureAnnotation(name="verify")
static void verify(Client client, Email msg) {
		int pubkey = client.getKeyringPublicKeyByClient(msg.getEmailFrom());
		if (pubkey != 0 && isKeyPairValid(msg.getEmailSignKey(), pubkey)) {
			msg.setIsSignatureVerified(true);
		}
	}


}
