
package ElevatorSystem; 

//import gov.nasa.jpf.symbc.Symbolic;

public  class  Person {
	
	//@Symbolic("false")
	private int weight;

	
	//@Symbolic("false")
	private int origin;

	
	//@Symbolic("false")
	private int destination;

	
	//@Symbolic("false")
	private String name;

	
	//@Symbolic("false")
	private boolean destinationReached = false;

	


public int getWeight() {
		return weight;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
public Person(String name, int weight, int origin, int destination, Environment env) {
		super();
		this.name = name;
		this.weight = weight;
		this.origin = origin;
		this.destination = destination;
		env.getFloor(origin).addWaitingPerson(this);
	}

	

	@featureHouse.FeatureAnnotation(name="base")
public String getName() {
		return name;
	}

	

public int getOrigin() {
		return origin;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
public int getDestination() {
		return destination;
	}

	


public void leaveElevator() {
		this.destinationReached = true;
	}

	

	@featureHouse.FeatureAnnotation(name="base")
public boolean isDestinationReached() {
		return destinationReached;
	}

	
	

public void enterElevator(Elevator e) {
		
		e.pressInLiftFloorButton(destination);
	}


}
