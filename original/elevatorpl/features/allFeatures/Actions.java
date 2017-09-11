import ElevatorSystem.Elevator;
import ElevatorSystem.Environment;
import ElevatorSystem.Person;

public class Actions {


    Environment env;


    Elevator e;


    @featureHouse.FeatureAnnotation(name = "base")
    public Actions(Environment env, Elevator e) {
        super();
        if(env.getFloors().length < 5) {
            throw new IllegalArgumentException(
                    "These Actions assume at least 5 Floors!");
        }
        this.env = env;
        this.e = e;
    }


    // floor to person relation:
    /*
	 * floor 4: bob floor 3: alice floor 2: angelina floor 1: chuck, bigMac
	 * floor 0: monica
	 */
    @featureHouse.FeatureAnnotation(name = "base")
    public Person bobCall() {
        return new Person("bob", 40, 4, 0, env);
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public Person aliceCall() {
        return new Person("alice", 40, 3, 0, env);
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public Person angelinaCall() {
        return new Person("angelina", 40, 2, 1, env);
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public Person chuckCall() {
        return new Person("chuck", 40, 1, 3, env);
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public Person monicaCall() {
        return new Person("monica", 30, 0, 1, env);
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public Person bigMacCall() {
        return new Person("BigMac", 150, 1, 3, env);
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public void pressInLift0() {
        if(!e.isEmpty()) {
            e.pressInLiftFloorButton(0);
        }
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public void pressInLift1() {
        if(!e.isEmpty()) {
            e.pressInLiftFloorButton(1);
        }
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public void pressInLift2() {
        if(!e.isEmpty()) {
            e.pressInLiftFloorButton(2);
        }
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public void pressInLift3() {
        if(!e.isEmpty()) {
            e.pressInLiftFloorButton(3);
        }
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public void pressInLift4() {
        if(!e.isEmpty()) {
            e.pressInLiftFloorButton(4);
        }
    }


}
