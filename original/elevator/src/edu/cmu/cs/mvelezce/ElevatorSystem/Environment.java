package edu.cmu.cs.mvelezce.ElevatorSystem;

//import gov.nasa.jpf.symbc.Symbolic;

public class Environment {

    //@Symbolic("false")
    Floor[] floors;


    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public Environment(int numFloors) {
        floors = new Floor[numFloors];
        for (int i = 0; i < numFloors; i++) {
            floors[i] = new Floor(i);
        }
    }


    public Floor getFloor(int id) {
        return floors[id];
    }


    public Floor[] getFloors() {
        return floors;
    }


    public boolean isTopFloor(int id) {
        return id == floors.length - 1;
    }


}
