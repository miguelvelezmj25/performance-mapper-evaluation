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

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 7, thenFeature = "overloaded", elseFeature = "base")
    public boolean
    isBlocked() {
        if (PL_Interface_impl.FEATUREOVERLOADED) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return blocked;
        }
        else {
            return false;
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 0, thenFeature = "weight", elseFeature = "base")
    public void
    enterElevator(Person p) {
        if (PL_Interface_impl.FEATUREWEIGHT) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            persons.add(p);
            p.enterElevator(this);
            if (verbose) {
                System.out.println(p.getName() + " entered the Elevator at Landing " + this.getCurrentFloorID() + ", going to " + p.getDestination());
            }
            weight += p.getWeight();
        }
        else {
            persons.add(p);
            p.enterElevator(this);
            if (verbose) {
                System.out.println(p.getName() + " entered the Elevator at Landing " + this.getCurrentFloorID() + ", going to " + p.getDestination());
            }
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 2, thenFeature = "empty", elseFeature = "featureSwitch")
    public boolean leaveElevator(Person p) {
        if (PL_Interface_impl.FEATUREEMPTY) {
            // empty
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            boolean result1;
            if (PL_Interface_impl.FEATUREWEIGHT) {
                boolean result;
                if (persons.contains(p)) {
                    persons.remove(p);
                    p.leaveElevator();
                    if (verbose) {
                        System.out.println(p.getName() + " left the Elevator at Landing " + currentFloorID);
                    }
                    result = true;
                }
                else {
                    result = false;
                }
                if (result) {
                    weight -= p.getWeight();
                    result1 = true;
                }
                else {
                    result1 = false;
                }
            }
            else {
                if (persons.contains(p)) {
                    persons.remove(p);
                    p.leaveElevator();
                    if (verbose) {
                        System.out.println(p.getName() + " left the Elevator at Landing " + currentFloorID);
                    }
                    result1 = true;
                }
                else {
                    result1 = false;
                }
            }
            if (result1) {
                if (this.persons.isEmpty()) {
                    Arrays.fill(this.floorButtons, false);
                }
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (PL_Interface_impl.FEATUREWEIGHT) {
                boolean result;
                if (persons.contains(p)) {
                    persons.remove(p);
                    p.leaveElevator();
                    if (verbose) {
                        System.out.println(p.getName() + " left the Elevator at Landing " + currentFloorID);
                    }
                    result = true;
                }
                else {
                    result = false;
                }
                if (result) {
                    weight -= p.getWeight();
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if (persons.contains(p)) {
                    persons.remove(p);
                    p.leaveElevator();
                    if (verbose) {
                        System.out.println(p.getName() + " left the Elevator at Landing " + currentFloorID);
                    }
                    return true;
                }
                else {
                    return false;
                }
            }
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

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 8, thenFeature = "overloaded", elseFeature = "base")
    public void
    timeShift() {
        if (PL_Interface_impl.FEATUREOVERLOADED) {
            if (areDoorsOpen() && weight > maximumWeight) {
                blocked = true;
                if (verbose) {
                    System.out.println("Elevator blocked due to overloading (weight:" + weight + " > maximumWeight:" + maximumWeight + ")");
                }
            }
            else {
                blocked = false;
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
                }
                else {
                    if (doors == DoorState.open) {
                        doors = DoorState.close;
                        //System.out.println("Doors Closing");
                    }
                    if (stopRequestedInDirection(currentHeading, true, true)) {
                        //System.out.println("Arriving at " + currentFloorID + ", continuing");
                        // continue
                        continueInDirection(currentHeading);
                    }
                    else if (stopRequestedInDirection(currentHeading.reverse(), true, true)) {
                        //System.out.println("Arriving at " + currentFloorID + ", reversing direction because of call in other direction");
                        // revert direction
                        continueInDirection(currentHeading.reverse());
                    }
                    else {
                        //idle
                        //System.out.println("Arriving at " + currentFloorID + ", idle->continuing");
                        continueInDirection(currentHeading);
                    }
                }
            }
        }
        else {
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
            }
            else {
                if (doors == DoorState.open) {
                    doors = DoorState.close;
                    //System.out.println("Doors Closing");
                }
                if (stopRequestedInDirection(currentHeading, true, true)) {
                    //System.out.println("Arriving at " + currentFloorID + ", continuing");
                    // continue
                    continueInDirection(currentHeading);
                }
                else if (stopRequestedInDirection(currentHeading.reverse(), true, true)) {
                    //System.out.println("Arriving at " + currentFloorID + ", reversing direction because of call in other direction");
                    // revert direction
                    continueInDirection(currentHeading.reverse());
                }
                else {
                    //idle
                    //System.out.println("Arriving at " + currentFloorID + ", idle->continuing");
                    continueInDirection(currentHeading);
                }
            }
        }
    }

    // alternative implementation: subclass of "ExecutiveFloor extends Floor"
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 5, thenFeature = "executivefloor", elseFeature = "featureSwitch")
    private boolean
    stopRequestedAtCurrentFloor() {
        if (PL_Interface_impl.FEATUREEXECUTIVEFLOOR) {
            //executive
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (isExecutiveFloorCalling() && !isExecutiveFloor(currentFloorID)) {
                return false;
            }
            else {
                if (PL_Interface_impl.FEATURETWOTHIRDSFULL) {
                    if (weight > maximumWeight * 2 / 3) {
                        return floorButtons[currentFloorID] == true;
                    }
                    else {
                        return env.getFloor(currentFloorID).hasCall()
                                || floorButtons[currentFloorID] == true;
                    }
                }
                else {
                    return env.getFloor(currentFloorID).hasCall()
                            || floorButtons[currentFloorID] == true;
                }
            }
        }
        else {
            if (PL_Interface_impl.FEATURETWOTHIRDSFULL) {
                if (weight > maximumWeight * 2 / 3) {
                    return floorButtons[currentFloorID] == true;
                }
                else {
                    return env.getFloor(currentFloorID).hasCall()
                            || floorButtons[currentFloorID] == true;
                }
            }
            else {
                return env.getFloor(currentFloorID).hasCall()
                        || floorButtons[currentFloorID] == true;
            }
        }
    }

    private void continueInDirection(Direction dir) {
        currentHeading = dir;
        if (currentHeading == Direction.up) {
            if (env.isTopFloor(currentFloorID)) {
                //System.out.println("Reversing at Top Floor");
                currentHeading = currentHeading.reverse();
            }
        }
        else {
            if (currentFloorID == 0) {
                //System.out.println("Reversing at Basement Floor");
                currentHeading = currentHeading.reverse();
            }
        }
        if (currentHeading == Direction.up) {
            currentFloorID = currentFloorID + 1;
        }
        else {
            currentFloorID = currentFloorID - 1;
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    private boolean isAnyLiftButtonPressed() {
        for (int i = 0; i < this.floorButtons.length; i++) {
            if (floorButtons[i]) {
                return true;
            }
        }
        return false;
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "featureSwitch")
//    @edu.cmu.cs.mvelezce.featureHouse.FeatureSwitchID(id = 6, thenFeature = "executivefloor", elseFeature = "featureSwitch")
    private boolean
    stopRequestedInDirection(Direction dir, boolean respectFloorCalls, boolean respectInLiftCalls) {
        if (PL_Interface_impl.FEATUREEXECUTIVEFLOOR) {
            if (isExecutiveFloorCalling()) {
                if (verbose) {
                    System.out.println("Giving Priority to Executive Floor");
                }
                return ((this.currentFloorID < executiveFloor) == (dir == Direction.up));

            }
            else {
                if (PL_Interface_impl.FEATURETWOTHIRDSFULL) {
                    if (weight > maximumWeight * 2 / 3 && isAnyLiftButtonPressed()) {
                        if (verbose) {
                            System.out.println("over 2/3 threshold, ignoring calls from FloorButtons until weight is below 2/3*threshold");
                        }
                        Floor[] floors = env.getFloors();
                        if (dir == Direction.up) {
                            if (env.isTopFloor(currentFloorID)) {
                                return false;
                            }
                            for (int i = currentFloorID + 1; i < floors.length; i++) {
                                if (false && floors[i].hasCall()) {
                                    return true;
                                }
                                if (respectInLiftCalls && this.floorButtons[i]) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        else {
                            if (currentFloorID == 0) {
                                return false;
                            }
                            for (int i = currentFloorID - 1; i >= 0; i--) {
                                if (false && floors[i].hasCall()) {
                                    return true;
                                }
                                if (respectInLiftCalls && this.floorButtons[i]) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                    else {
                        Floor[] floors = env.getFloors();
                        if (dir == Direction.up) {
                            if (env.isTopFloor(currentFloorID)) {
                                return false;
                            }
                            for (int i = currentFloorID + 1; i < floors.length; i++) {
                                if (respectFloorCalls && floors[i].hasCall()) {
                                    return true;
                                }
                                if (respectInLiftCalls && this.floorButtons[i]) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        else {
                            if (currentFloorID == 0) {
                                return false;
                            }
                            for (int i = currentFloorID - 1; i >= 0; i--) {
                                if (respectFloorCalls && floors[i].hasCall()) {
                                    return true;
                                }
                                if (respectInLiftCalls && this.floorButtons[i]) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
                else {
                    Floor[] floors = env.getFloors();
                    if (dir == Direction.up) {
                        if (env.isTopFloor(currentFloorID)) {
                            return false;
                        }
                        for (int i = currentFloorID + 1; i < floors.length; i++) {
                            if (respectFloorCalls && floors[i].hasCall()) {
                                return true;
                            }
                            if (respectInLiftCalls && this.floorButtons[i]) {
                                return true;
                            }
                        }
                        return false;
                    }
                    else {
                        if (currentFloorID == 0) {
                            return false;
                        }
                        for (int i = currentFloorID - 1; i >= 0; i--) {
                            if (respectFloorCalls && floors[i].hasCall()) {
                                return true;
                            }
                            if (respectInLiftCalls && this.floorButtons[i]) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
            }
        }
        else {
            if (PL_Interface_impl.FEATURETWOTHIRDSFULL) {
                if (weight > maximumWeight * 2 / 3 && isAnyLiftButtonPressed()) {
                    if (verbose) {
                        System.out.println("over 2/3 threshold, ignoring calls from FloorButtons until weight is below 2/3*threshold");
                    }
                    Floor[] floors = env.getFloors();
                    if (dir == Direction.up) {
                        if (env.isTopFloor(currentFloorID)) {
                            return false;
                        }
                        for (int i = currentFloorID + 1; i < floors.length; i++) {
                            if (false && floors[i].hasCall()) {
                                return true;
                            }
                            if (respectInLiftCalls && this.floorButtons[i]) {
                                return true;
                            }
                        }
                        return false;
                    }
                    else {
                        if (currentFloorID == 0) {
                            return false;
                        }
                        for (int i = currentFloorID - 1; i >= 0; i--) {
                            if (false && floors[i].hasCall()) {
                                return true;
                            }
                            if (respectInLiftCalls && this.floorButtons[i]) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                else {
                    Floor[] floors = env.getFloors();
                    if (dir == Direction.up) {
                        if (env.isTopFloor(currentFloorID)) {
                            return false;
                        }
                        for (int i = currentFloorID + 1; i < floors.length; i++) {
                            if (respectFloorCalls && floors[i].hasCall()) {
                                return true;
                            }
                            if (respectInLiftCalls && this.floorButtons[i]) {
                                return true;
                            }
                        }
                        return false;
                    }
                    else {
                        if (currentFloorID == 0) {
                            return false;
                        }
                        for (int i = currentFloorID - 1; i >= 0; i--) {
                            if (respectFloorCalls && floors[i].hasCall()) {
                                return true;
                            }
                            if (respectInLiftCalls && this.floorButtons[i]) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
            }
            else {
                Floor[] floors = env.getFloors();
                if (dir == Direction.up) {
                    if (env.isTopFloor(currentFloorID)) {
                        return false;
                    }
                    for (int i = currentFloorID + 1; i < floors.length; i++) {
                        if (respectFloorCalls && floors[i].hasCall()) {
                            return true;
                        }
                        if (respectInLiftCalls && this.floorButtons[i]) {
                            return true;
                        }
                    }
                    return false;
                }
                else {
                    if (currentFloorID == 0) {
                        return false;
                    }
                    for (int i = currentFloorID - 1; i >= 0; i--) {
                        if (respectFloorCalls && floors[i].hasCall()) {
                            return true;
                        }
                        if (respectInLiftCalls && this.floorButtons[i]) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
    }

    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    private boolean anyStopRequested() {
        Floor[] floors = env.getFloors();
        for (int i = 0; i < floors.length; i++) {
            if (floors[i].hasCall()) {
                return true;
            }
            else if (this.floorButtons[i]) {
                return true;
            }
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
            if (f.getFloorID() == executiveFloor && f.hasCall()) {
                return true;
            }
        return false;
    }


    //private boolean isExecutiveFloor(Floor floor) {return floor.getFloorID() == executiveFloor; }


}
