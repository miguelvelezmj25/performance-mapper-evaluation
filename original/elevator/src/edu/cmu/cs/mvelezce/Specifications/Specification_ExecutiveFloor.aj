package edu.cmu.cs.mvelezce.Specifications;

import edu.cmu.cs.mvelezce.ElevatorSystem.Elevator;
import edu.cmu.cs.mvelezce.TestSpecifications.SpecificationException;
import edu.cmu.cs.mvelezce.TestSpecifications.SpecificationManager;
import edu.cmu.cs.mvelezce.analysis.option.Sink;

public privileged aspect Specification_ExecutiveFloor extends AbstractSpecification {
    // specification 14
	/* Original: The Lift will answer requests from the executive Floor.
	 * 
	 * My Version: While there is a request from the executive Floor the lift will not open its doors somewhere else.
	 * 
	 */
    pointcut timeShift(Elevator e): execution(public void ElevatorSystem.Elevator.timeShift()) && target(e);

    after(Elevator e): timeShift(e) {
        if(Sink.getDecision(SpecificationManager.checkSpecification(14))) {
            if(Sink.getDecision(e.isExecutiveFloorCalling())) {
                if(Sink.getDecision(!e.isExecutiveFloor(e.getCurrentFloorID()) && e.areDoorsOpen())) {
                    if(Sink.getDecision(SpecificationManager.checkSpecification(14))) {
                        failure(new SpecificationException("Spec14", "(Spec14) Opened the Doors at " + e.getCurrentFloorID() + " although there was a call from the executive Suite."));
                    }
                }
            }
        }
    }
}
