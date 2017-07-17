package edu.cmu.cs.mvelezce.ElevatorSystem;
//import gov.nasa.jpf.symbc.Symbolic;

import edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation;

import java.util.ArrayList;
import java.util.List;


public class Floor {

    //@Symbolic("false")
    private final int thisFloorID;


    //@Symbolic("false")
    private boolean elevatorCall = false;


    //@Symbolic("false")
    private List<Person> waiting = new ArrayList<Person>();


    @FeatureAnnotation(name = "base")
    public Floor(int id) {
        thisFloorID = id;
    }


    @FeatureAnnotation(name = "base")
    public int getFloorID() {
        return this.thisFloorID;
    }


    public void callElevator() {
        elevatorCall = true;
    }


    public void reset() {
        elevatorCall = false;
    }


    public boolean hasCall() {
        return elevatorCall;
    }


    public void processWaitingPersons(Elevator e) {
        for(Person p : waiting) {
            e.enterElevator(p);
        }
        waiting.clear();
        reset();
    }


    public void addWaitingPerson(Person person) {
        waiting.add(person);
        callElevator();
    }


}
