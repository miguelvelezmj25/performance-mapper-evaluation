package edu.cmu.cs.mvelezce.ElevatorSystem;

//import gov.nasa.jpf.symbc.Symbolic;

import edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation;

public class Person {

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


    @FeatureAnnotation(name = "base")
    public Person(String name, int weight, int origin, int destination, Environment env) {
        super();
        this.name = name;
        this.weight = weight;
        this.origin = origin;
        this.destination = destination;
        env.getFloor(origin).addWaitingPerson(this);
    }

    public int getWeight() {
        return weight;
    }

    @FeatureAnnotation(name = "base")
    public String getName() {
        return name;
    }


    public int getOrigin() {
        return origin;
    }


    @FeatureAnnotation(name = "base")
    public int getDestination() {
        return destination;
    }


    public void leaveElevator() {
        this.destinationReached = true;
    }


    @FeatureAnnotation(name = "base")
    public boolean isDestinationReached() {
        return destinationReached;
    }


    public void enterElevator(Elevator e) {

        e.pressInLiftFloorButton(destination);
    }


}
