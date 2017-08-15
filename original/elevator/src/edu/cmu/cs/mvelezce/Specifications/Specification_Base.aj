package edu.cmu.cs.mvelezce.Specifications;

import edu.cmu.cs.mvelezce.ElevatorSystem.Elevator;
import edu.cmu.cs.mvelezce.ElevatorSystem.Elevator.Direction;
import edu.cmu.cs.mvelezce.ElevatorSystem.Floor;
import edu.cmu.cs.mvelezce.TestSpecifications.SpecificationException;
import edu.cmu.cs.mvelezce.TestSpecifications.SpecificationManager;
import edu.cmu.cs.mvelezce.analysis.option.Sink;

public aspect Specification_Base extends AbstractSpecification {
    int numFloors = 0;
    // initialization
    before(int numFloors):
            call(ElevatorSystem.Environment.new(int)) && args(numFloors) {
        if(Sink.getDecision(SpecificationManager.checkSpecification(1))) {
            calledAt_Spec1 = new boolean[numFloors];
            this.numFloors = numFloors;
        }
    }

    /*Specification 1:
     * Pressing a landing Button guarantees that the lift will arrive at that landing and open the doors.
     */
    boolean[] calledAt_Spec1;

    // collect all pressed buttons
    before(Floor floor):
            call(public void ElevatorSystem.Floor.callElevator()) && target(floor) {
        if(Sink.getDecision(SpecificationManager.checkSpecification(1))) {
            calledAt_Spec1[floor.getFloorID()] = true;
        }
    }
    // monitor if the floors are visited
    after(Elevator e):
            call(public void ElevatorSystem.Elevator.timeShift()) && target(e) {
        if(Sink.getDecision(SpecificationManager.checkSpecification(1))) {
            int floor = e.getCurrentFloorID();
            if(Sink.getDecision(calledAt_Spec1[floor] && e.areDoorsOpen())) {
                calledAt_Spec1[floor] = false; // reset
            }
        }
    }
    // fail if some floors were not visited in the end
    after(): programTermination() {
        if(Sink.getDecision(SpecificationManager.checkSpecification(1))) {
            for(int i = 0; i < calledAt_Spec1.length; i++) {
                if(Sink.getDecision(calledAt_Spec1[i] == true)) {
                    failure(new SpecificationException("Spec1", "(Spec1) Elevator did not stop at Floor" + i + " as requested (from outside)"));
                }
            }
        }
    }

    /*Specification 2:
     * Pressing a button inside the lift guarantees that the lift will arrive at that landing and open the doors.
     */
    boolean[] calledAt_Spec2;
    // initialization
    before(int numFloors):
            call(ElevatorSystem.Environment.new(int)) && args(numFloors) {
        if(Sink.getDecision(SpecificationManager.checkSpecification(2))) {
            calledAt_Spec2 = new boolean[numFloors];
        }
    }
    // collect all pressed buttons
    before(int floorID):
            call(public void ElevatorSystem.Elevator.pressInLiftFloorButton(int)) && args(floorID) {
        if(Sink.getDecision(SpecificationManager.checkSpecification(2))) {
            calledAt_Spec2[floorID] = true;
        }
    }
    // monitor if the floors are visited
    after(Elevator e):
            call(public void ElevatorSystem.Elevator.timeShift()) && target(e) {
        int floor = e.getCurrentFloorID();
        if(Sink.getDecision(SpecificationManager.checkSpecification(2))) {
            if(Sink.getDecision(calledAt_Spec2[floor] && e.areDoorsOpen())) {
                calledAt_Spec2[floor] = false; // reset
            }
        }
    }
    // fail if some floors were not visited in the end
    after(): programTermination() {
        if(Sink.getDecision(SpecificationManager.checkSpecification(2))) {
            for(int i = 0; i < calledAt_Spec2.length; i++) {
                if(Sink.getDecision(calledAt_Spec2[i] == true)) {
                    failure(new SpecificationException("Spec2", "(Spec2) Elevator did not stop at Floor" + i + " as requested (from inside)"));
                }
            }
        }
    }
    /*Specification 3:
     * The Lift will not change direction while there are calls in the direction it is traveling.
     */
    pointcut timeShift(Elevator e): execution(public void ElevatorSystem.Elevator.timeShift()) && target(e);
    byte expectedDirection = 0; // 0=unknown, 1=up, -1=down
    before(Elevator e): timeShift(e) {
        if(Sink.getDecision(SpecificationManager.checkSpecification(3))) {
            expectedDirection = 0;
            if(Sink.getDecision(e.getCurrentDirection() == Direction.up)) {
                for(int i = e.getCurrentFloorID() + 1; i < numFloors; i++) {
                    if(Sink.getDecision(e.buttonForFloorIsPressed(i))) {
                        expectedDirection = 1;
                        break;
                    }
                }
            }
            else {
                for(int i = e.getCurrentFloorID() - 1; i >= 0; i--) {
                    if(Sink.getDecision(e.buttonForFloorIsPressed(i))) {
                        expectedDirection = -1;
                        break;
                    }
                }
            }
        }
    }
    after(Elevator e): timeShift(e) {
        if(Sink.getDecision(SpecificationManager.checkSpecification(3))) {
            if(Sink.getDecision(expectedDirection == -1 && e.getCurrentDirection() == Direction.up)) {
                failure(new SpecificationException("Spec3", "(Spec3) Elevator changed directions even though there were still calls in the old direction."));
            }
            else if(Sink.getDecision(expectedDirection == 1 && e.getCurrentDirection() == Direction.down)) {
                failure(new SpecificationException("Spec3", "(Spec3) Elevator changed directions even though there were still calls in the old direction."));
            }
        }
    }

    //utility method
    static void printArrayReverse(boolean[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.println(i + " : " + arr[i]);
        }
    }
}
