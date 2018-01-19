package ElevatorSystem; 
//import gov.nasa.jpf.symbc.Symbolic;

import java.util.ArrayList; 
import java.util.List; 


public  class  Floor {
	
	//@Symbolic("false")
	private final int thisFloorID;

	
	//@Symbolic("false")
	private boolean elevatorCall = false;

	
	//@Symbolic("false")
	private List<Person> waiting = new ArrayList<Person>();

	
	
	@featureHouse.FeatureAnnotation(name="base")
public Floor(int id) {
		thisFloorID = id;
	}

	
	@featureHouse.FeatureAnnotation(name="base")
public int getFloorID() {
		return this.thisFloorID;
	}

	
	
	@featureHouse.FeatureAnnotation(name="base")
public void callElevator() {
		elevatorCall = true;
	}

	
	@featureHouse.FeatureAnnotation(name="base")
public void reset() {
		elevatorCall = false;
	}

	
	
	@featureHouse.FeatureAnnotation(name="base")
public boolean hasCall() {
		return elevatorCall;
	}

	
	@featureHouse.FeatureAnnotation(name="base")
public void processWaitingPersons(Elevator e) {
		for (Person p : waiting) {
			e.enterElevator(p);
		}
		waiting.clear();
		reset();
	}

	
	@featureHouse.FeatureAnnotation(name="base")
public void addWaitingPerson(Person person) {
		waiting.add(person);
		callElevator();
	}


}
