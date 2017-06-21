package edu.cmu.cs.mvelezce.ElevatorSystem;

import edu.cmu.cs.mvelezce.PL_Interface_impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Elevator {

    private static final int maximumWeight = 100;
    //@Symbolic("false")
    Environment env;
    //@Symbolic("false")
    boolean verbose;
    //@Symbolic("false")
    int currentFloorID;
    //@Symbolic("false")
    Direction currentHeading;
    //@Symbolic("false")
    DoorState doors;
    //@Symbolic("false")
    boolean[] floorButtons;

    ;
    //TODO: implement the weight property in Persons in this Feature
    int weight;
    int executiveFloor = 4;
    //@Symbolic("false")
    private List<Person> persons = new ArrayList<Person>();
    private boolean blocked = false;


    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public Elevator(Environment env, boolean verbose) {
        this.verbose = verbose;
        this.currentHeading = Direction.up;
        this.currentFloorID = 0;
        this.doors = DoorState.open;
        this.env = env;
        this.floorButtons = new boolean[env.floors.length];
    }


    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public Elevator(Environment env, boolean verbose, int floor, boolean headingUp) {
        this.verbose = verbose;
        this.currentHeading = (headingUp ? Direction.up : Direction.down);
        this.currentFloorID = floor;
        this.doors = DoorState.open;
        this.env = env;
        this.floorButtons = new boolean[env.floors.length];
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public boolean isBlocked__before__overloaded() {
        return false;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "overloaded")
    public boolean isBlocked__role__overloaded() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return blocked;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 7, thenFeature = "overloaded", elseFeature = "base")
    public boolean
    isBlocked() {
        if (PL_Interface_impl.FEATUREOVERLOADED) {
            return isBlocked__role__overloaded();
        } else {
            return isBlocked__before__overloaded();
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public void enterElevator__before__weight(Person p) {
        persons.add(p);
        p.enterElevator(this);
        if (verbose)
            System.out.println(p.getName() + " entered the Elevator at Landing " + this.getCurrentFloorID() + ", going to " + p.getDestination());
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "weight")
    public void enterElevator__role__weight(Person p) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        enterElevator__before__weight(p);
        weight += p.getWeight();
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 0, thenFeature = "weight", elseFeature = "base")
    public void
    enterElevator(Person p) {
        if (PL_Interface_impl.FEATUREWEIGHT) {
            enterElevator__role__weight(p);
        } else {
            enterElevator__before__weight(p);
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public boolean leaveElevator__before__weight(Person p) {
        if (persons.contains(p)) {
            persons.remove(p);
            p.leaveElevator();
            if (verbose) System.out.println(p.getName() + " left the Elevator at Landing " + currentFloorID);
            return true;
        } else return false;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "weight")
    public boolean leaveElevator__role__weight(Person p) {
        if (leaveElevator__before__weight(p)) {
            weight -= p.getWeight();
            return true;
        } else return false;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 1, thenFeature = "weight", elseFeature = "base")
    public boolean
    leaveElevator__before__empty(Person p) {
        if (PL_Interface_impl.FEATUREWEIGHT) {
            return leaveElevator__role__weight(p);
        } else {
            return leaveElevator__before__weight(p);
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "empty")
    public boolean leaveElevator__role__empty(Person p) { // empty
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (leaveElevator__before__empty(p)) {
            if (this.persons.isEmpty())
                Arrays.fill(this.floorButtons, false);
            return true;
        } else return false;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 2, thenFeature = "empty", elseFeature = "featureSwitch")
    public boolean leaveElevator(Person p) {
        if (PL_Interface_impl.FEATUREEMPTY) {
            return leaveElevator__role__empty(p);
        } else {
            return leaveElevator__before__empty(p);
        }
    }

    /**
     * Activates the button for the given floor in the lift.
     *
     * @param floorID
     */

    public void pressInLiftFloorButton(int floorID) {
        floorButtons[floorID] = true;
    }

    private void resetFloorButton(int floorID) {
        floorButtons[floorID] = false;
    }

    public int getCurrentFloorID() {
        return currentFloorID;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public boolean areDoorsOpen() {
        return doors == DoorState.open;
    }

    // pre: elevator arrived at the current floor, next actions to be done
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public void timeShift__before__overloaded() {
        //System.out.println("--");

        if (stopRequestedAtCurrentFloor()) {
            //System.out.println("Arriving at " +  currentFloorID + ", Doors opening");
            doors = DoorState.open;
            // iterate over a copy of the original list, avoids concurrent modification exception
            for (Person p : new ArrayList<Person>(persons)) {
                if (p.getDestination() == currentFloorID) {
                    leaveElevator(p);
                }
            }
            env.getFloor(currentFloorID).processWaitingPersons(this);
            resetFloorButton(currentFloorID);
        } else {
            if (doors == DoorState.open) {
                doors = DoorState.close;
                //System.out.println("Doors Closing");
            }
            if (stopRequestedInDirection(currentHeading, true, true)) {
                //System.out.println("Arriving at " + currentFloorID + ", continuing");
                // continue
                continueInDirection(currentHeading);
            } else if (stopRequestedInDirection(currentHeading.reverse(), true, true)) {
                //System.out.println("Arriving at " + currentFloorID + ", reversing direction because of call in other direction");
                // revert direction
                continueInDirection(currentHeading.reverse());
            } else {
                //idle
                //System.out.println("Arriving at " + currentFloorID + ", idle->continuing");
                continueInDirection(currentHeading);
            }
        }
    }

    // pre: elevator arrived at the current floor, next actions to be done
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "overloaded")
    public void timeShift__role__overloaded() {
        if (areDoorsOpen() && weight > maximumWeight) {
            blocked = true;
            if (verbose)
                System.out.println("Elevator blocked due to overloading (weight:" + weight + " > maximumWeight:" + maximumWeight + ")");
        } else {
            blocked = false;
            timeShift__before__overloaded();
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 8, thenFeature = "overloaded", elseFeature = "base")
    public void
    timeShift() {
        if (PL_Interface_impl.FEATUREOVERLOADED) {
            timeShift__role__overloaded();
        } else {
            timeShift__before__overloaded();
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    private boolean stopRequestedAtCurrentFloor__before__twothirdsfull() {
        return env.getFloor(currentFloorID).hasCall()
                || floorButtons[currentFloorID] == true;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "twothirdsfull")
    private boolean stopRequestedAtCurrentFloor__role__twothirdsfull() {
        if (weight > maximumWeight * 2 / 3) {
            return floorButtons[currentFloorID] == true;
        } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 3, thenFeature = "twothirdsfull", elseFeature = "base")
    private boolean
    stopRequestedAtCurrentFloor__before__executivefloor() {
        if (PL_Interface_impl.FEATURETWOTHIRDSFULL) {
            return stopRequestedAtCurrentFloor__role__twothirdsfull();
        } else {
            return stopRequestedAtCurrentFloor__before__twothirdsfull();
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "executivefloor")
    private boolean stopRequestedAtCurrentFloor__role__executivefloor() { //executive
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (isExecutiveFloorCalling() && !isExecutiveFloor(currentFloorID)) {
            return false;
        } else return stopRequestedAtCurrentFloor__before__executivefloor();
    }

    // alternative implementation: subclass of "ExecutiveFloor extends Floor"
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 5, thenFeature = "executivefloor", elseFeature = "featureSwitch")
    private boolean
    stopRequestedAtCurrentFloor() {
        if (PL_Interface_impl.FEATUREEXECUTIVEFLOOR) {
            return stopRequestedAtCurrentFloor__role__executivefloor();
        } else {
            return stopRequestedAtCurrentFloor__before__executivefloor();
        }
    }

    private void continueInDirection(Direction dir) {
        currentHeading = dir;
        if (currentHeading == Direction.up) {
            if (env.isTopFloor(currentFloorID)) {
                //System.out.println("Reversing at Top Floor");
                currentHeading = currentHeading.reverse();
            }
        } else {
            if (currentFloorID == 0) {
                //System.out.println("Reversing at Basement Floor");
                currentHeading = currentHeading.reverse();
            }
        }
        if (currentHeading == Direction.up) {
            currentFloorID = currentFloorID + 1;
        } else {
            currentFloorID = currentFloorID - 1;
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    private boolean isAnyLiftButtonPressed() {
        for (int i = 0; i < this.floorButtons.length; i++) {
            if (floorButtons[i]) return true;
        }
        return false;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    private boolean stopRequestedInDirection__before__twothirdsfull(Direction dir, boolean respectFloorCalls, boolean respectInLiftCalls) {
        Floor[] floors = env.getFloors();
        if (dir == Direction.up) {
            if (env.isTopFloor(currentFloorID)) return false;
            for (int i = currentFloorID + 1; i < floors.length; i++) {
                if (respectFloorCalls && floors[i].hasCall()) return true;
                if (respectInLiftCalls && this.floorButtons[i]) return true;
            }
            return false;
        } else {
            if (currentFloorID == 0) return false;
            for (int i = currentFloorID - 1; i >= 0; i--) {
                if (respectFloorCalls && floors[i].hasCall()) return true;
                if (respectInLiftCalls && this.floorButtons[i]) return true;
            }
            return false;
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "twothirdsfull")
    private boolean stopRequestedInDirection__role__twothirdsfull(Direction dir, boolean respectFloorCalls, boolean respectInLiftCalls) {
        if (weight > maximumWeight * 2 / 3 && isAnyLiftButtonPressed()) {
            if (verbose)
                System.out.println("over 2/3 threshold, ignoring calls from FloorButtons until weight is below 2/3*threshold");
            return stopRequestedInDirection__before__twothirdsfull(dir, false, respectInLiftCalls);
        } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 4, thenFeature = "twothirdsfull", elseFeature = "base")
    private boolean
    stopRequestedInDirection__before__executivefloor(Direction dir, boolean respectFloorCalls, boolean respectInLiftCalls) {
        if (PL_Interface_impl.FEATURETWOTHIRDSFULL) {
            return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
        } else {
            return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "executivefloor")
    private boolean stopRequestedInDirection__role__executivefloor(Direction dir, boolean respectFloorCalls, boolean respectInLiftCalls) {
        if (isExecutiveFloorCalling()) {
            if (verbose) System.out.println("Giving Priority to Executive Floor");
            return ((this.currentFloorID < executiveFloor) == (dir == Direction.up));

        } else return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 6, thenFeature = "executivefloor", elseFeature = "featureSwitch")
    private boolean
    stopRequestedInDirection(Direction dir, boolean respectFloorCalls, boolean respectInLiftCalls) {
        if (PL_Interface_impl.FEATUREEXECUTIVEFLOOR) {
            return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
        } else {
            return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    private boolean anyStopRequested() {
        Floor[] floors = env.getFloors();
        for (int i = 0; i < floors.length; i++) {
            if (floors[i].hasCall()) return true;
            else if (this.floorButtons[i]) return true;
        }
        return false;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public boolean buttonForFloorIsPressed(int floorID) {
        return this.floorButtons[floorID];
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public Direction getCurrentDirection() {
        return currentHeading;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public Environment getEnv() {
        return env;
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public boolean isIdle() {
        return !anyStopRequested();
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    @Override
    public String toString() {
        return "Elevator " + (areDoorsOpen() ? "[_]" : "[] ") + " at " + currentFloorID + " heading " + currentHeading;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "executivefloor")
    public boolean isExecutiveFloor(int floorID) {
        return floorID == executiveFloor;
    }

    public boolean isExecutiveFloorCalling() {
        for (Floor f : env.floors)
            if (f.getFloorID() == executiveFloor && f.hasCall()) return true;
        return false;
    }


    //private boolean isExecutiveFloor(Floor floor) {return floor.getFloorID() == executiveFloor; }

    public enum Direction {
        up {
            @Override
            public Direction reverse() {
                return down;
            }
        },
        down {
            @Override
            public Direction reverse() {
                return up;
            }
        };

        //        @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
        public abstract Direction reverse();
    }


    enum DoorState {open, close}


}
