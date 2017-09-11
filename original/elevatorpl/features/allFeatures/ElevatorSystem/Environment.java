package ElevatorSystem;

//import gov.nasa.jpf.symbc.Symbolic;

public class Environment {

    //@Symbolic("false")
    Floor[] floors;


    @featureHouse.FeatureAnnotation(name = "base")
    public Environment(int numFloors) {
        floors = new Floor[numFloors];
        for(int i = 0; i < numFloors; i++) {
            floors[i] = new Floor(i);
        }
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public Floor getFloor(int id) {
        return floors[id];
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public Floor[] getFloors() {
        return floors;
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public boolean isTopFloor(int id) {
        return id == floors.length - 1;
    }


}
