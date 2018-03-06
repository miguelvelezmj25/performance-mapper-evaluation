package family;

import family.EmailSystem.Client;
import family.EmailSystem.Util;
import family.TestSpecifications.SpecificationManager;

import java.util.ArrayList;
import java.util.List;

import static family.PL_Interface_impl.*;

/**
 * This class implements the actions that can be executed by the test scenarios.
 * (setup() is always executed first to setup the characters and their private keys)
 *
 * @author rhein
 */
public class Test_Actions {

    public static boolean executedUnimplementedAction = false;
    /* Filterfield is possible here.
     * It causes some speedup, but no advantage for family, or product based verification.
     * It might cause more problems than it helps.
     */
    //@FilterField
    public static List<String> actionHistory = new ArrayList<String>();
    static Client bob, rjh, chuck;


    /**
     * Bob gets Key of RJH
     */
    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 0, thenFeature = "keys", elseFeature = "base")
    static void
    bobKeyAdd() {
        if(KEYS) {
            actionHistory.add("bobKeyAdd");
            // unrealistic simplification. Private key == Public key
            bob.addKeyringEntry(rjh, rjh.getPrivateKey());
            Util.prompt("bob added rjhs key");
        }
        else {
            actionHistory.add("bobKeyAdd_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    /**
     * Bob gets Key of Chuck
     */
    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 1, thenFeature = "keys", elseFeature = "base")
    static void
    bobKeyAddChuck() {
        if(KEYS) {
            actionHistory.add("bobKeyAddChuck");
            // unrealistic simplification. Private key == Public key
            bob.addKeyringEntry(chuck, chuck.getPrivateKey());
        }
        else {
            actionHistory.add("bobKeyAddChuck_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 2, thenFeature = "keys", elseFeature = "base")
    static void
    bobKeyChange() {
        if(KEYS) {
            actionHistory.add("bobKeyChange");
            Client.generateKeyPair(bob, 777);
        }
        else {
            actionHistory.add("bobKeyChange_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 18, thenFeature = "addressbook", elseFeature = "base")
    static void
    bobSetAddressBook() {
        if(ADDRESSBOOK) {
            actionHistory.add("bobSetAddressBook");
            bob.addAddressbookEntry("AliasForRJHandChuck", rjh.getName());
            bob.addAddressbookEntry("AliasForRJHandChuck", chuck.getName());
        }
        else {
            actionHistory.add("bobSetAddressBook_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }

    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 19, thenFeature = "addressbook", elseFeature = "base")
    static void
    bobToAlias() {
        if(ADDRESSBOOK) {
            if(bob.getAddressBookReceiversForAlias("AliasForRJHandChuck").isEmpty()) {
                actionHistory.add("AbortedBobToAlias");
                return;
            }
            actionHistory.add("bobToAlias");
            String subject = "Subject";
            String body = "Body";
            Client.sendEmail(bob, "AliasForRJHandChuck", subject, body);
        }
        else {
            actionHistory.add("bobToAlias");
            executedUnimplementedAction = true;
        }
    }


    @featureHouse.FeatureAnnotation(name = "base")
    static void bobToRjh() {

        actionHistory.add("bobToRjh");
        String subject = "Subject";
        String body = "Body";
        Client.sendEmail(bob, rjh.getName(), subject, body);
    }


    /**
     * Chuck gets Key of Bob
     */
    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 3, thenFeature = "keys", elseFeature = "base")
    static void
    chuckKeyAdd() {
        if(KEYS) {
            actionHistory.add("chuckKeyAdd");
            chuck.addKeyringEntry(bob, bob.getPrivateKey());
        }
        else {
            actionHistory.add("chuckKeyAdd_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    /**
     * Delete RJHs private key
     */
    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 4, thenFeature = "keys", elseFeature = "base")
    static void
    rjhDeletePrivateKey() {
        if(KEYS) {
            actionHistory.add("rjhDeletePrivateKey");
            rjh.setPrivateKey(0);
        }
        else {
            actionHistory.add("rjhDeletePrivateKey_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 24, thenFeature = "forward", elseFeature = "base")
    static void
    rjhEnableForwarding() {
        if(FORWARD) {
            actionHistory.add("rjhEnableForwarding");
            rjh.setForwardReceiver(chuck);
        }
        else {
            actionHistory.add("rjhEnableForwarding_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    /**
     * RJH gets Key of Bob
     */
    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 5, thenFeature = "keys", elseFeature = "base")
    static void
    rjhKeyAdd() {
        if(KEYS) {
            actionHistory.add("rjhKeyAdd");
            rjh.addKeyringEntry(bob, bob.getPrivateKey());
        }
        else {
            actionHistory.add("rjhKeyAdd_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    // actions


    // actions


    // actions

    /**
     * RJH gets Key of Chuck
     */
    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 6, thenFeature = "keys", elseFeature = "base")
    static void
    rjhKeyAddChuck() {
        if(KEYS) {
            actionHistory.add("rjhKeyAddChuck");
            rjh.addKeyringEntry(chuck, chuck.getPrivateKey());
        }
        else {
            actionHistory.add("rjhKeyAddChuck_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 7, thenFeature = "keys", elseFeature = "base")
    static void
    rjhKeyChange() {
        if(KEYS) {
            actionHistory.add("rjhKeyChange");
            Client.generateKeyPair(rjh, 666);
        }
        else {
            actionHistory.add("rjhKeyChange_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 15, thenFeature = "autoresponder", elseFeature = "base")
    static void
    rjhSetAutoRespond() {
        if(AUTORESPONDER) {
            actionHistory.add("rjhSetAutoRespond");
            rjh.setAutoResponse(true);
        }
        else {
            actionHistory.add("rjhSetAutoRespond_NOTIMPL");
            executedUnimplementedAction = true;
        }
    }


    @featureHouse.FeatureAnnotation(name = "base")
    static void rjhToBob() {
        actionHistory.add("rjhToBob");
        String subject = "subject";
        String body = "body";
        Client.sendEmail(rjh, bob.getName(), subject, body);
    }


    static void setup() {
        actionHistory.add("setup");
        SpecificationManager.setupSpecifications();
        Client.resetClients();

        bob = Client.createClient("bob");
        setup_bob(bob);
        Util.prompt("bob: " + bob.getName() + "(ID: " + bob.getId() + ")");
        // rjh = createClient("rjh");
        rjh = Client.createClient("rjh");
        setup_rjh(rjh);
        Util.prompt("rjh: " + rjh.getName() + "(ID: " + rjh.getId() + ")");
        // chuck = createClient("chuck");
        chuck = Client.createClient("chuck");
        setup_chuck(chuck);
        Util
                .prompt("chuck: " + chuck.getName() + "(ID: " + chuck.getId()
                        + ")");
    }


    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 8, thenFeature = "keys", elseFeature = "base")
    static void
    setup_bob(Client bob) {
        if(KEYS) {
            bob.setPrivateKey(123);
        }
        else {
        }
    }


    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 9, thenFeature = "keys", elseFeature = "base")
    static void
    setup_chuck(Client chuck) {
        if(KEYS) {
            chuck.setPrivateKey(789);
        }
        else {
        }
    }


    @featureHouse.FeatureAnnotation(name = "featureSwitch")
    @featureHouse.FeatureSwitchID(id = 10, thenFeature = "keys", elseFeature = "base")
    static void
    setup_rjh(Client rjh) {
        if(KEYS) {
            rjh.setPrivateKey(456);
        }
        else {
        }
    }


}
