# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}

# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}

# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}

# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}

# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
# 1 "Elevator.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Elevator.c"
# 1 "Elevator.h" 1






# 1 "featureselect.h" 1

	int landingButtons_spc1_0;
	int landingButtons_spc1_1;
	int landingButtons_spc1_2;
	int landingButtons_spc1_3;
	int landingButtons_spc1_4;




int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 2 "Elevator.c" 2
# 13 "Elevator.c"
int currentHeading = 1;

int currentFloorID = 0;

int persons_0;

int persons_1;

int persons_2;

int persons_3;

int persons_4;

int persons_5;


int doorState = 1;

int floorButtons_0;

int floorButtons_1;

int floorButtons_2;

int floorButtons_3;

int floorButtons_4;







void initTopDown() {
 currentFloorID = 4;
 currentHeading = 0;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}

void initBottomUp() {
 currentFloorID = 0;
 currentHeading = 1;
 floorButtons_0 = 0;
 floorButtons_1 = 0;
 floorButtons_2 = 0;
 floorButtons_3 = 0;
 floorButtons_4 = 0;
 persons_0 = 0;
 persons_1 = 0;
 persons_2 = 0;
 persons_3 = 0;
 persons_4 = 0;
 persons_5 = 0;
 initFloors();
}


int isBlocked__before__overloaded() {
 return 0;
}


int isBlocked__role__overloaded() {
  return blocked;
 }
 int
isBlocked() {
    if (__SELECTED_FEATURE_overloaded) {
        return isBlocked__role__overloaded();
    } else {
        return isBlocked__before__overloaded();
    }
}




void enterElevator__before__weight(int p) {
 if (p == 0) persons_0 = 1;
 else if (p == 1) persons_1 = 1;
 else if (p == 2) persons_2 = 1;
 else if (p == 3) persons_3 = 1;
 else if (p == 4) persons_4 = 1;
 else if (p == 5) persons_5 = 1;


}


void enterElevator__role__weight(int p) {
 enterElevator__before__weight(p);
 weight = weight + getWeight(p);
}

void
enterElevator(int p) {
    if (__SELECTED_FEATURE_weight) {
        enterElevator__role__weight(p);
    } else {
        enterElevator__before__weight(p);
    }
}



void leaveElevator__before__weight(int p) {
 if (p == 0) persons_0 = 0;
 else if (p == 1) persons_1 = 0;
 else if (p == 2) persons_2 = 0;
 else if (p == 3) persons_3 = 0;
 else if (p == 4) persons_4 = 0;
 else if (p == 5) persons_5 = 0;

}

void leaveElevator__role__weight(int p) {
 leaveElevator__before__weight(p);
 weight = weight - getWeight(p);
}

void
leaveElevator__before__empty(int p) {
    if (__SELECTED_FEATURE_weight) {
        leaveElevator__role__weight(p);
    } else {
        leaveElevator__before__weight(p);
    }
}



void leaveElevator__role__empty(int p) {
 leaveElevator__before__empty(p);

 if (isEmpty()) {
  floorButtons_0 = 0;
  floorButtons_1 = 0;
  floorButtons_2 = 0;
  floorButtons_3 = 0;
  floorButtons_4 = 0;
 }
}


void
leaveElevator(int p) {
    if (__SELECTED_FEATURE_empty) {
        leaveElevator__role__empty(p);
    } else {
        leaveElevator__before__empty(p);
    }
}



void pressInLiftFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 1;
 else if (floorID == 1) floorButtons_1 = 1;
 else if (floorID == 2) floorButtons_2 = 1;
 else if (floorID == 3) floorButtons_3 = 1;
 else if (floorID == 4) floorButtons_4 = 1;
}

void resetFloorButton(int floorID) {
 if (floorID == 0) floorButtons_0 = 0;
 else if (floorID == 1) floorButtons_1 = 0;
 else if (floorID == 2) floorButtons_2 = 0;
 else if (floorID == 3) floorButtons_3 = 0;
 else if (floorID == 4) floorButtons_4 = 0;
}

int getCurrentFloorID() {
 return currentFloorID;
}

int areDoorsOpen() {
 return doorState;
}

int buttonForFloorIsPressed(int floorID) {
 if (floorID == 0) return floorButtons_0;
 else if (floorID == 1) return floorButtons_1;
 else if (floorID == 2) return floorButtons_2;
 else if (floorID == 3) return floorButtons_3;
 else if (floorID == 4) return floorButtons_4;
 else return 0;
}

int getCurrentHeading() {
 return currentHeading;
}

int isEmpty() {
 if (persons_0 == 1) return 0;
 else if (persons_1 == 1) return 0;
 else if (persons_2 == 1) return 0;
 else if (persons_3 == 1) return 0;
 else if (persons_4 == 1) return 0;
 else if (persons_5 == 1) return 0;
 return 1;
}


int anyStopRequested () {
 if (isFloorCalling(0)) return 1;
 else if (floorButtons_0) return 1;
 else if (isFloorCalling(1)) return 1;
 else if (floorButtons_1) return 1;
 else if (isFloorCalling(2)) return 1;
 else if (floorButtons_2) return 1;
 else if (isFloorCalling(3)) return 1;
 else if (floorButtons_3) return 1;
 else if (isFloorCalling(4)) return 1;
 else if (floorButtons_4) return 1;
 return 0;
}

int isIdle() {
 return (anyStopRequested() == 0);
}

 int stopRequestedInDirection__before__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (dir == 1) {
   if (isTopFloor(currentFloorID)) return 0;
# 258 "Elevator.c"
   if (currentFloorID < 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID < 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID < 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID < 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID < 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID < 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID < 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID < 3 && respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID < 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID < 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  } else {
   if (currentFloorID == 0) return 0;
# 283 "Elevator.c"
   if (currentFloorID > 0 && respectFloorCalls && isFloorCalling(0)) return 1;
   else if (currentFloorID > 0 && respectInLiftCalls && floorButtons_0) return 1;

   else if (currentFloorID > 1 && respectFloorCalls && isFloorCalling(1)) return 1;
   else if (currentFloorID > 1 && respectInLiftCalls && floorButtons_1) return 1;

   else if (currentFloorID > 2 && respectFloorCalls && isFloorCalling(2)) return 1;
   else if (currentFloorID > 2 && respectInLiftCalls && floorButtons_2) return 1;

   else if (currentFloorID > 3 && respectFloorCalls && isFloorCalling(3)) return 1;
   else if (currentFloorID > 3 &&respectInLiftCalls && floorButtons_3) return 1;

   else if (currentFloorID > 4 && respectFloorCalls && isFloorCalling(4)) return 1;
   else if (currentFloorID > 4 && respectInLiftCalls && floorButtons_4) return 1;
   else return 0;
  }
 }

 int stopRequestedInDirection__role__twothirdsfull (int dir, int respectFloorCalls, int respectInLiftCalls) {
  int overload =weight > maximumWeight*2/3;
  int buttonPressed =isAnyLiftButtonPressed();
  if (overload && buttonPressed) {
   return stopRequestedInDirection__before__twothirdsfull(dir, 0, respectInLiftCalls);
  } else return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
 }

 int
stopRequestedInDirection__before__executivefloor(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedInDirection__role__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__twothirdsfull(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int stopRequestedInDirection__role__executivefloor (int dir, int respectFloorCalls, int respectInLiftCalls) {
  if (isExecutiveFloorCalling()) {
   return ((getCurrentFloorID() < executiveFloor) == (dir == 1));
  } else {
   return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
  }
 }


 int
stopRequestedInDirection(int dir, int respectFloorCalls, int respectInLiftCalls) {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedInDirection__role__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    } else {
        return stopRequestedInDirection__before__executivefloor(dir, respectFloorCalls, respectInLiftCalls);
    }
}



 int isAnyLiftButtonPressed() {
  if (floorButtons_0) return 1;
  else if (floorButtons_1) return 1;
  else if (floorButtons_2) return 1;
  else if (floorButtons_3) return 1;
  else if (floorButtons_4) return 1;
  else return 0;
 }

 void continueInDirection(int dir) {
  currentHeading = dir;
  if (currentHeading == 1) {
   if (isTopFloor(currentFloorID)) {

    currentHeading = 0;
   }
  } else {
   if (currentFloorID == 0) {

    currentHeading = 1;
   }
  }
  if (currentHeading == 1) {
   currentFloorID = currentFloorID + 1;
  } else {
   currentFloorID = currentFloorID - 1;
  }
 }

 int stopRequestedAtCurrentFloor__before__twothirdsfull() {
  if (isFloorCalling(currentFloorID)) {
   return 1;
  } else if (buttonForFloorIsPressed(currentFloorID)) {
   return 1;
  } else {
   return 0;
  }
 }

 int stopRequestedAtCurrentFloor__role__twothirdsfull() {
  if (weight > maximumWeight*2/3) {
   return buttonForFloorIsPressed(getCurrentFloorID()) == 1;
  } else return stopRequestedAtCurrentFloor__before__twothirdsfull();
 }

 int
stopRequestedAtCurrentFloor__before__executivefloor() {
    if (__SELECTED_FEATURE_twothirdsfull) {
        return stopRequestedAtCurrentFloor__role__twothirdsfull();
    } else {
        return stopRequestedAtCurrentFloor__before__twothirdsfull();
    }
}



 int stopRequestedAtCurrentFloor__role__executivefloor() {
  if (isExecutiveFloorCalling() && ! (executiveFloor == getCurrentFloorID())) {
   return 0;
  } else return stopRequestedAtCurrentFloor__before__executivefloor();
 }


 int
stopRequestedAtCurrentFloor() {
    if (__SELECTED_FEATURE_executivefloor) {
        return stopRequestedAtCurrentFloor__role__executivefloor();
    } else {
        return stopRequestedAtCurrentFloor__before__executivefloor();
    }
}



 int getReverseHeading(int ofHeading) {
  if (ofHeading==0) {
   return 1;
  } else return 0;
 }


void processWaitingOnFloor(int floorID) {
  if (isPersonOnFloor(0,floorID)) {
   removePersonFromFloor(0, floorID);
   pressInLiftFloorButton(getDestination(0));
   enterElevator(0);
  }
  if (isPersonOnFloor(1,floorID)) {
   removePersonFromFloor(1, floorID);
   pressInLiftFloorButton(getDestination(1));
   enterElevator(1);
  }
  if (isPersonOnFloor(2,floorID)) {
   removePersonFromFloor(2, floorID);
   pressInLiftFloorButton(getDestination(2));
   enterElevator(2);
  }
  if (isPersonOnFloor(3,floorID)) {
   removePersonFromFloor(3, floorID);
   pressInLiftFloorButton(getDestination(3));
   enterElevator(3);
  }
  if (isPersonOnFloor(4,floorID)) {
   removePersonFromFloor(4, floorID);
   pressInLiftFloorButton(getDestination(4));
   enterElevator(4);
  }
  if (isPersonOnFloor(5,floorID)) {
   removePersonFromFloor(5, floorID);
   pressInLiftFloorButton(getDestination(5));
   enterElevator(5);
  }
  resetCallOnFloor(floorID);
 }


 void timeShift__before__overloaded() {


  if (stopRequestedAtCurrentFloor()) {

   doorState = 1;

   if (persons_0 && getDestination(0) == currentFloorID) leaveElevator(0);
   if (persons_1 && getDestination(1) == currentFloorID) leaveElevator(1);
   if (persons_2 && getDestination(2) == currentFloorID) leaveElevator(2);
   if (persons_3 && getDestination(3) == currentFloorID) leaveElevator(3);
   if (persons_4 && getDestination(4) == currentFloorID) leaveElevator(4);
   if (persons_5 && getDestination(5) == currentFloorID) leaveElevator(5);
   processWaitingOnFloor(currentFloorID);
   resetFloorButton(currentFloorID);
  } else {
   if (doorState == 1) {
    doorState = 0;

   }
   if (stopRequestedInDirection(currentHeading, 1, 1)) {


    continueInDirection(currentHeading);
   } else if (stopRequestedInDirection(getReverseHeading(currentHeading), 1, 1)) {


    continueInDirection(getReverseHeading(currentHeading));
   } else {


    continueInDirection(currentHeading);
   }
  }
 }


 void timeShift__role__overloaded() {
  if (areDoorsOpen() && weight > maximumWeight) {
   blocked = 1;
  } else {
   blocked = 0;
   timeShift__before__overloaded();
  }
 }



 void
timeShift() {
    if (__SELECTED_FEATURE_overloaded) {
        timeShift__role__overloaded();
    } else {
        timeShift__before__overloaded();
    }
		int floor = getCurrentFloorID();
		if (floor == 0 && landingButtons_spc1_0 && areDoorsOpen()) {
			landingButtons_spc1_0 = 0;
		} else 	if (floor == 1 && landingButtons_spc1_1 && areDoorsOpen()) {
			landingButtons_spc1_1 = 0;
		} else 	if (floor == 2 && landingButtons_spc1_2 && areDoorsOpen()) {
			landingButtons_spc1_2 = 0;
		} else 	if (floor == 3 && landingButtons_spc1_3 && areDoorsOpen()) {
			landingButtons_spc1_3 = 0;
		} else 	if (floor == 4 && landingButtons_spc1_4 && areDoorsOpen()) {
			landingButtons_spc1_4 = 0;
    }
}



 void printState__before__overloaded() {
# 539 "Elevator.c"
 }

 void printState__role__overloaded() {

  printState__before__overloaded();
 }

 void
printState() {
    if (__SELECTED_FEATURE_overloaded) {
        printState__role__overloaded();
    } else {
        printState__before__overloaded();
    }
}




 int existInLiftCallsInDirection(int d) {
   if (d == 1) {
     int i = 0;
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   } else if (d == 0) {
     int i = 0;
    for (i = currentFloorID - 1; i >= 0; i--)
    for (i = currentFloorID + 1; i < 5; i++) {
      if (i==0 && floorButtons_0) return 1;
      else if (i==1 && floorButtons_1) return 1;
      else if (i==2 && floorButtons_2) return 1;
      else if (i==3 && floorButtons_3) return 1;
      else if (i==4 && floorButtons_4) return 1;
    }
   }
   return 0;
 }
 int isExecutiveFloorCalling() {
  return isFloorCalling(executiveFloor);
 }

 int isExecutiveFloor(int floorID) {
  return (executiveFloor == floorID);
 }
# 1 "featureselect.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "featureselect.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "featureselect.c" 2




extern int __VERIFIER_nondet_int(void);
int select_one() {if (__VERIFIER_nondet_int()) return 1; else return 0;}

void select_features() {
 __SELECTED_FEATURE_base = 1;
 __SELECTED_FEATURE_weight = select_one();
 __SELECTED_FEATURE_empty = select_one();
 __SELECTED_FEATURE_twothirdsfull = select_one();
 __SELECTED_FEATURE_executivefloor = select_one();
 __SELECTED_FEATURE_overloaded = select_one();
}


void select_helpers() {
 __GUIDSL_ROOT_PRODUCTION = 1;
}

int valid_product() {
  return (( !__SELECTED_FEATURE_overloaded || __SELECTED_FEATURE_weight ) && ( !__SELECTED_FEATURE_twothirdsfull || __SELECTED_FEATURE_weight )) && ( __SELECTED_FEATURE_base );
}
# 1 "Floor.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Floor.c"



# 1 "Floor.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Floor.h" 2




int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 5 "Floor.c" 2


int calls_0;

int calls_1;

int calls_2;

int calls_3;

int calls_4;


int personOnFloor_0_0;

int personOnFloor_0_1;

int personOnFloor_0_2;

int personOnFloor_0_3;

int personOnFloor_0_4;

int personOnFloor_1_0;

int personOnFloor_1_1;

int personOnFloor_1_2;

int personOnFloor_1_3;

int personOnFloor_1_4;

int personOnFloor_2_0;

int personOnFloor_2_1;

int personOnFloor_2_2;

int personOnFloor_2_3;

int personOnFloor_2_4;

int personOnFloor_3_0;

int personOnFloor_3_1;

int personOnFloor_3_2;

int personOnFloor_3_3;

int personOnFloor_3_4;

int personOnFloor_4_0;

int personOnFloor_4_1;

int personOnFloor_4_2;

int personOnFloor_4_3;

int personOnFloor_4_4;

int personOnFloor_5_0;

int personOnFloor_5_1;

int personOnFloor_5_2;

int personOnFloor_5_3;

int personOnFloor_5_4;


void initFloors() {
 calls_0 = 0;
 calls_1 = 0;
 calls_2 = 0;
 calls_3 = 0;
 calls_4 = 0;
 personOnFloor_0_0 = 0;
 personOnFloor_0_1 = 0;
 personOnFloor_0_2 = 0;
 personOnFloor_0_3 = 0;
 personOnFloor_0_4 = 0;
 personOnFloor_1_0 = 0;
 personOnFloor_1_1 = 0;
 personOnFloor_1_2 = 0;
 personOnFloor_1_3 = 0;
 personOnFloor_1_4 = 0;
 personOnFloor_2_0 = 0;
 personOnFloor_2_1 = 0;
 personOnFloor_2_2 = 0;
 personOnFloor_2_3 = 0;
 personOnFloor_2_4 = 0;
 personOnFloor_3_0 = 0;
 personOnFloor_3_1 = 0;
 personOnFloor_3_2 = 0;
 personOnFloor_3_3 = 0;
 personOnFloor_3_4 = 0;
 personOnFloor_4_0 = 0;
 personOnFloor_4_1 = 0;
 personOnFloor_4_2 = 0;
 personOnFloor_4_3 = 0;
 personOnFloor_4_4 = 0;
 personOnFloor_5_0 = 0;
 personOnFloor_5_1 = 0;
 personOnFloor_5_2 = 0;
 personOnFloor_5_3 = 0;
 personOnFloor_5_4 = 0;
}


int isFloorCalling(int floorID) {
 if (floorID == 0) return calls_0;
 else if (floorID == 1) return calls_1;
 else if (floorID == 2) return calls_2;
 else if (floorID == 3) return calls_3;
 else if (floorID == 4) return calls_4;
 return 0;
}


void resetCallOnFloor(int floorID) {
 if (floorID == 0) calls_0 = 0;
 else if (floorID == 1) calls_1 = 0;
 else if (floorID == 2) calls_2 = 0;
 else if (floorID == 3) calls_3 = 0;
 else if (floorID == 4) calls_4 = 0;
}


void callOnFloor(int floorID) {
    	if (floorID == 0) landingButtons_spc1_0 = 1;
        else if (floorID == 1) landingButtons_spc1_1 = 1;
        else if (floorID == 2) landingButtons_spc1_2 = 1;
        else if (floorID == 3) landingButtons_spc1_3 = 1;
        else if (floorID == 4) landingButtons_spc1_4 = 1;
 if (floorID == 0) calls_0 = 1;
 else if (floorID == 1) calls_1 = 1;
 else if (floorID == 2) calls_2 = 1;
 else if (floorID == 3) calls_3 = 1;
 else if (floorID == 4) calls_4 = 1;
}


int isPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) return personOnFloor_0_0;
  else if (person == 1) return personOnFloor_1_0;
  else if (person == 2) return personOnFloor_2_0;
  else if (person == 3) return personOnFloor_3_0;
  else if (person == 4) return personOnFloor_4_0;
  else if (person == 5) return personOnFloor_5_0;
 } else if (floor == 1) {
  if (person == 0) return personOnFloor_0_1;
  else if (person == 1) return personOnFloor_1_1;
  else if (person == 2) return personOnFloor_2_1;
  else if (person == 3) return personOnFloor_3_1;
  else if (person == 4) return personOnFloor_4_1;
  else if (person == 5) return personOnFloor_5_1;
 } else if (floor == 2) {
  if (person == 0) return personOnFloor_0_2;
  else if (person == 1) return personOnFloor_1_2;
  else if (person == 2) return personOnFloor_2_2;
  else if (person == 3) return personOnFloor_3_2;
  else if (person == 4) return personOnFloor_4_2;
  else if (person == 5) return personOnFloor_5_2;
 } else if (floor == 3) {
  if (person == 0) return personOnFloor_0_3;
  else if (person == 1) return personOnFloor_1_3;
  else if (person == 2) return personOnFloor_2_3;
  else if (person == 3) return personOnFloor_3_3;
  else if (person == 4) return personOnFloor_4_3;
  else if (person == 5) return personOnFloor_5_3;
 } else if (floor == 4) {
  if (person == 0) return personOnFloor_0_4;
  else if (person == 1) return personOnFloor_1_4;
  else if (person == 2) return personOnFloor_2_4;
  else if (person == 3) return personOnFloor_3_4;
  else if (person == 4) return personOnFloor_4_4;
  else if (person == 5) return personOnFloor_5_4;
 }
 return 0;
}

void initPersonOnFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0 = 1;
  else if (person == 1) personOnFloor_1_0 = 1;
  else if (person == 2) personOnFloor_2_0 = 1;
  else if (person == 3) personOnFloor_3_0 = 1;
  else if (person == 4) personOnFloor_4_0 = 1;
  else if (person == 5) personOnFloor_5_0 = 1;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1 = 1;
  else if (person == 1) personOnFloor_1_1 = 1;
  else if (person == 2) personOnFloor_2_1 = 1;
  else if (person == 3) personOnFloor_3_1 = 1;
  else if (person == 4) personOnFloor_4_1 = 1;
  else if (person == 5) personOnFloor_5_1 = 1;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2 = 1;
  else if (person == 1) personOnFloor_1_2 = 1;
  else if (person == 2) personOnFloor_2_2 = 1;
  else if (person == 3) personOnFloor_3_2 = 1;
  else if (person == 4) personOnFloor_4_2 = 1;
  else if (person == 5) personOnFloor_5_2 = 1;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3 = 1;
  else if (person == 1) personOnFloor_1_3 = 1;
  else if (person == 2) personOnFloor_2_3 = 1;
  else if (person == 3) personOnFloor_3_3 = 1;
  else if (person == 4) personOnFloor_4_3 = 1;
  else if (person == 5) personOnFloor_5_3 = 1;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4 = 1;
  else if (person == 1) personOnFloor_1_4 = 1;
  else if (person == 2) personOnFloor_2_4 = 1;
  else if (person == 3) personOnFloor_3_4 = 1;
  else if (person == 4) personOnFloor_4_4 = 1;
  else if (person == 5) personOnFloor_5_4 = 1;
 }
 callOnFloor(floor);
}

void removePersonFromFloor(int person, int floor) {
 if (floor == 0) {
  if (person == 0) personOnFloor_0_0= 0;
  else if (person == 1) personOnFloor_1_0= 0;
  else if (person == 2) personOnFloor_2_0= 0;
  else if (person == 3) personOnFloor_3_0= 0;
  else if (person == 4) personOnFloor_4_0= 0;
  else if (person == 5) personOnFloor_5_0= 0;
 } else if (floor == 1) {
  if (person == 0) personOnFloor_0_1= 0;
  else if (person == 1) personOnFloor_1_1= 0;
  else if (person == 2) personOnFloor_2_1= 0;
  else if (person == 3) personOnFloor_3_1= 0;
  else if (person == 4) personOnFloor_4_1= 0;
  else if (person == 5) personOnFloor_5_1= 0;
 } else if (floor == 2) {
  if (person == 0) personOnFloor_0_2= 0;
  else if (person == 1) personOnFloor_1_2= 0;
  else if (person == 2) personOnFloor_2_2= 0;
  else if (person == 3) personOnFloor_3_2= 0;
  else if (person == 4) personOnFloor_4_2= 0;
  else if (person == 5) personOnFloor_5_2= 0;
 } else if (floor == 3) {
  if (person == 0) personOnFloor_0_3= 0;
  else if (person == 1) personOnFloor_1_3= 0;
  else if (person == 2) personOnFloor_2_3= 0;
  else if (person == 3) personOnFloor_3_3= 0;
  else if (person == 4) personOnFloor_4_3= 0;
  else if (person == 5) personOnFloor_5_3= 0;
 } else if (floor == 4) {
  if (person == 0) personOnFloor_0_4= 0;
  else if (person == 1) personOnFloor_1_4= 0;
  else if (person == 2) personOnFloor_2_4= 0;
  else if (person == 3) personOnFloor_3_4= 0;
  else if (person == 4) personOnFloor_4_4= 0;
  else if (person == 5) personOnFloor_5_4= 0;
 }
 resetCallOnFloor(floor);
}

int isTopFloor(int floorID) {
 return floorID == 5 -1;
}
# 1 "Person.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Person.c"



# 1 "Person.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Person.h" 2


int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 5 "Person.c" 2
# 18 "Person.c"
int getWeight(int person) {
 if (person == 0) {
  return 40;
 } else if (person == 1) {
  return 40;
 } else if (person == 2) {
  return 40;
 } else if (person == 3) {
  return 40;
 } else if (person == 4) {
  return 30;
 } else if (person == 5) {
  return 150;
 } else {
  return 0;
 }
}


int getOrigin(int person) {
 if (person == 0) {
  return 4;
 } else if (person == 1) {
  return 3;
 } else if (person == 2) {
  return 2;
 } else if (person == 3) {
  return 1;
 } else if (person == 4) {
  return 0;
 } else if (person == 5) {
  return 1;
 } else {
  return 0;
 }
}

int getDestination(int person) {
 if (person == 0) {
  return 0;
 } else if (person == 1) {
  return 0;
 } else if (person == 2) {
  return 1;
 } else if (person == 3) {
  return 3;
 } else if (person == 4) {
  return 1;
 } else if (person == 5) {
  return 3;
 } else {
  return 0;
 }
}
# 1 "scenario.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "scenario.c"
# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 2 "scenario.c" 2

void test() {
        bigMacCall();
        angelinaCall();
        cleanup();
}
# 1 "Test.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "Test.c"
# 10 "Test.c"
int cleanupTimeShifts = 12;



int get_nondet() {
    int nd;
    return nd;
}


int get_nondetMinMax07() {
    int nd;

    if (nd==0) {
 return 0;
    } else if (nd==1) {
 return 1;
    } else if (nd==2) {
 return 2;
    } else if (nd==3) {
 return 3;
    } else if (nd==4) {
 return 4;
    } else if (nd==5) {
 return 5;
    } else if (nd==6) {
 return 6;
    } else if (nd==7) {
 return 7;
    } else {
     exit(0);
    }
}


void bobCall() { initPersonOnFloor(0, getOrigin(0)); }

void aliceCall() { initPersonOnFloor(1, getOrigin(1)); }

void angelinaCall() { initPersonOnFloor(2, getOrigin(2)); }

void chuckCall() { initPersonOnFloor(3, getOrigin(3)); }

void monicaCall() { initPersonOnFloor(4, getOrigin(4)); }

void bigMacCall() { initPersonOnFloor(5, getOrigin(5)); }

void threeTS() { timeShift(); timeShift(); timeShift(); }

void cleanup() {


 timeShift();
 int i;
 for (i = 0; i < cleanupTimeShifts-1 && isBlocked()!=1; i++) {
  if (isIdle())
   return;
  else
   timeShift();

 }
}


void randomSequenceOfActions() {
  int maxLength = 4;
  if (get_nondet()) {

   initTopDown();


  } else {
   initBottomUp();



  }
  int counter = 0;
  while (counter < maxLength) {
   counter++;
   int action = get_nondetMinMax07();





   if (action < 6) {
    int origin = getOrigin(action);
    initPersonOnFloor(action, origin);
   } else if (action == 6) {
    timeShift();
   } else if (action == 7) {

    timeShift();
    timeShift();
    timeShift();

   }


   if (isBlocked()) {
    return;
   }
  }
  cleanup();
 }



void runTest_Simple() {
 bigMacCall();
 angelinaCall();
 cleanup();
}



 void Specification1() {
  bigMacCall();
  angelinaCall();
  cleanup();
 }


 void Specification2() {
  bigMacCall();
  cleanup();
 }

 void Specification3() {
  bobCall();
  timeShift();
  timeShift();
  timeShift();
  timeShift();

  timeShift();




  bobCall();
  cleanup();
 }



void setup() {
}


void __automaton_fail()
{
	goto error; 
	error:  ; 
}

void runTest() {
		landingButtons_spc1_0 = 0;
		landingButtons_spc1_1 = 0;
		landingButtons_spc1_2 = 0;
		landingButtons_spc1_3 = 0;
		landingButtons_spc1_4 = 0;

 test();
	if (landingButtons_spc1_0) { fail; }
	else if (landingButtons_spc1_1) { __automaton_fail(); }
	else if (landingButtons_spc1_2) { __automaton_fail(); }
	else if (landingButtons_spc1_3) { __automaton_fail(); }
	else if (landingButtons_spc1_4) { __automaton_fail(); }
}

int
main (void)
{
  select_helpers();
  select_features();
  if (valid_product()) {
      setup();
      runTest();
  }
  return 0;

}
# 1 "UnitTests.c"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "UnitTests.c"



# 1 "Elevator.h" 1






# 1 "featureselect.h" 1






int __SELECTED_FEATURE_base;

int __SELECTED_FEATURE_weight;

int __SELECTED_FEATURE_empty;

int __SELECTED_FEATURE_twothirdsfull;

int __SELECTED_FEATURE_executivefloor;

int __SELECTED_FEATURE_overloaded;

int __GUIDSL_ROOT_PRODUCTION;


int select_one();
void select_features();
void select_helpers();
int valid_product();
# 8 "Elevator.h" 2







# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 16 "Elevator.h" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 18 "Elevator.h" 2


void timeShift();

int isBlocked();

void printState();

int isEmpty();

int isAnyLiftButtonPressed();

int buttonForFloorIsPressed(int floorID);


void initTopDown();

void initBottomUp();


int areDoorsOpen();

int getCurrentFloorID();

int isIdle();


int weight = 0;

int maximumWeight = 100;







 int executiveFloor = 4;


 int isExecutiveFloorCalling();

 int isExecutiveFloor(int floorID);


int blocked = 0;
# 5 "UnitTests.c" 2

# 1 "Person.h" 1
# 10 "Person.h"
int getWeight(int person);

int getOrigin(int person);

int getDestination(int person);

void enterElevator(int person);
# 7 "UnitTests.c" 2

# 1 "Floor.h" 1
# 12 "Floor.h"
int isFloorCalling(int floorID);

void resetCallOnFloor(int floorID);

void callOnFloor(int floorID);

int isPersonOnFloor(int person, int floor);

void initPersonOnFloor(int person, int floor);

void removePersonFromFloor(int person, int floor);

int isTopFloor(int floorID);

void processWaitingPersons(int floorID);

void initFloors();
# 9 "UnitTests.c" 2


int cleanupTimeShifts = 12;
# 22 "UnitTests.c"
void spec1() {
 initBottomUp();
 initPersonOnFloor(5,getOrigin(5));
 printState();


 initPersonOnFloor(2,getOrigin(2));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}


void spec14() {
 initTopDown();
 initPersonOnFloor(5,getOrigin(5));
 printState();

 timeShift();
 timeShift();
 timeShift();
 timeShift();

 initPersonOnFloor(0,getOrigin(0));
 printState();


 int i;
 for (i = 0; i < cleanupTimeShifts && isBlocked()!=1; i++) {
  timeShift();
  printState();
 }
}
