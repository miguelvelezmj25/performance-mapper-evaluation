package family;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import family.ElevatorSystem.Elevator;
import family.ElevatorSystem.Environment;
import family.ElevatorSystem.Person;
import family.TestSpecifications.SpecificationManager;
import family.verificationClasses.FeatureSwitches;
import family.verificationClasses.SPLModelChecker;

import java.util.*;
import java.util.function.BooleanSupplier;

public class PL_Interface_impl implements PL_Interface {

    public static BooleanSupplier BASE;
    public static BooleanSupplier OVERLOADED;
    public static BooleanSupplier WEIGHT;
    public static BooleanSupplier EMPTY;
    public static BooleanSupplier TWOTHIRDSFULL;
    public static BooleanSupplier EXECUTIVEFLOOR;

    private static final int NUM_FLOORS = 50000;
    public static boolean executedUnimplementedAction = false;
    public static List<String> actionHistory = new ArrayList<String>();
    private static int cleanupTimeShifts = 24;
    private static boolean verbose = false;


    private static boolean isAbortedRun = false;

    private Stack<String> stack;
    private Set<String> options;

    public static void main(String[] args) {
//        try {
//            Sink.init();
//
//            BASE = Source.getBASE(Boolean.valueOf(args[0]));
//            OVERLOADED = Source.getOVERLOADED(Boolean.valueOf(args[1]));
//            WEIGHT = Source.getWEIGHT(Boolean.valueOf(args[2]));
//            EMPTY = Source.getEMPTY(Boolean.valueOf(args[3]));
//            TWOTHIRDSFULL = Source.getTWOTHIRDSFULL(Boolean.valueOf(args[4]));
//            EXECUTIVEFLOOR = Source.getEXECUTIVEFLOOR(Boolean.valueOf(args[5]));
//
//            if(!FeatureSwitches.valid_product()) {
//                return;
//            }
//
//            //verificationClasses.FeatureSwitches.select_features();
//            PL_Interface_impl impl = new PL_Interface_impl();
//            args = new String[1];
//            verbose = true;
//            SpecificationManager.checkOnlySpecification(-2);
//            impl.start(-3, -1);
//            System.out.println("no Exception");
//        } catch(Throwable e) {
//            System.out.println("Caught Exception: " + e.getClass() + " "
//                    + e.getMessage());
//            e.printStackTrace();
//        }
    }

    public PL_Interface_impl(Stack<String> stack) {
        this.stack = stack;
        this.options = new HashSet<>(stack);
    }

    public void push(String option) {
        if(this.options.contains(option)) {
            return;
        }

        this.stack.push(option);
        this.options.add(option);
    }

    public boolean getBASE(boolean option) {
        this.push("BASE");

        return option;
    }

    public boolean getOVERLOADED(boolean option) {
        this.push("OVERLOADED");
        return option;
    }

    public boolean getWEIGHT(boolean option) {
        this.push("WEIGHT");
        return option;
    }

    public boolean getEMPTY(boolean option) {
        this.push("EMPTY");
        return option;
    }

    public boolean getTWOTHIRDSFULL(boolean option) {
        this.push("TWOTHIRDSFULL");
        return option;
    }

    public boolean getEXECUTIVEFLOOR(boolean option) {
        this.push("EXECUTIVEFLOOR");
        return option;
    }

    public static Stack<String> splat(String[] args, Stack<String> stack) {
        PL_Interface_impl impl = new PL_Interface_impl(stack);

        try {
            Sink.init();
//            BASE = Source.getBASE(Boolean.valueOf(args[0]));
//            OVERLOADED = Source.getOVERLOADED(Boolean.valueOf(args[1]));
//            WEIGHT = Source.getWEIGHT(Boolean.valueOf(args[2]));
//            EMPTY = Source.getEMPTY(Boolean.valueOf(args[3]));
//            TWOTHIRDSFULL = Source.getTWOTHIRDSFULL(Boolean.valueOf(args[4]));
//            EXECUTIVEFLOOR = Source.getEXECUTIVEFLOOR(Boolean.valueOf(args[5]));

            BASE = () -> impl.getBASE(Boolean.valueOf(args[0]));
            OVERLOADED = () -> impl.getOVERLOADED(Boolean.valueOf(args[1]));
            WEIGHT = () -> impl.getWEIGHT(Boolean.valueOf(args[2]));
            EMPTY = () -> impl.getEMPTY(Boolean.valueOf(args[3]));
            TWOTHIRDSFULL = () -> impl.getTWOTHIRDSFULL(Boolean.valueOf(args[4]));
            EXECUTIVEFLOOR = () -> impl.getEXECUTIVEFLOOR(Boolean.valueOf(args[5]));

            if(!FeatureSwitches.valid_product()) {
                return impl.stack;
            }

            //verificationClasses.FeatureSwitches.select_features();
//            args = new String[1];
            verbose = true;
            SpecificationManager.checkOnlySpecification(-2);
            impl.start(-3, -1);
            System.out.println("no Exception");
        } catch(Throwable e) {
            System.out.println("Caught Exception: " + e.getClass() + " "
                    + e.getMessage());
            e.printStackTrace();
        }

        return impl.stack;
    }

    public static void randomSequenceOfActions(int maxLength) {
        cleanupTimeShifts = 6 * maxLength; // tests have shown that this is enough
        Environment env = new Environment(NUM_FLOORS);
        Elevator e;
        if(getBoolean()) {
            // elevator from 0 going up
            e = new Elevator(env, verbose);
            actionHistory.add("StartFromBottom");
        }
        else {
            // elevator from 4 going down
            e = new Elevator(env, verbose, 4, false);
            actionHistory.add("StartFromTop");
        }
        Actions a = new Actions(env, e);

        int counter = 0;
        while(counter < maxLength) {
            counter++;
            int action = getIntegerMinMax(0, 7);
            String actionName = "";
            switch(action) {
                case 0:
                    a.bobCall();
                    actionName = "bobCall";
                    break;
                case 1:
                    a.aliceCall();
                    actionName = "aliceCall";
                    break;
                case 2:
                    a.angelinaCall();
                    actionName = "angelinaCall";
                    break;
                case 3:
                    a.chuckCall();
                    actionName = "chuckCall";
                    break;
                case 4:
                    a.monicaCall();
                    actionName = "monicaCall";
                    break;
                case 5:
                    a.bigMacCall();
                    actionName = "bigMacCall";
                    break;
                case 6:
                    e.timeShift();
                    actionName = "1TS";
                    break; // execute one timestep
                case 7:
                    actionName = "3TS";// execute three timesteps
                    for(int i = 0; i < 3; i++) {
                        e.timeShift();
                    }
                    // nobody calls
                    break;
                default:
                    throw new InternalError(
                            "getIntegerMinMax produced illegal value:" + action);
            }
            actionHistory.add(actionName);
            //System.out.println(listToString(actionHistory));
            if(e.isBlocked()) {
                //System.out.println("Stopping Simulation path because Elevator is stuck (overloaded)");
                return;
            }
        }
        for(counter = 0; counter < cleanupTimeShifts && !e.isBlocked(); counter++) {
            if(e.isIdle()) {
                return;
            }
            e.timeShift();
        }
    }

    public static void modifiedrandomSequenceOfActions(int maxLength) {
        Environment env = new Environment(NUM_FLOORS);
        Elevator e;
        if(getBoolean()) {
            // elevator from 0 going up
            e = new Elevator(env, verbose);
            actionHistory.add("StartFromBottom");
        }
        else {
            // elevator from 4 going down
            e = new Elevator(env, verbose, 4, false);
            actionHistory.add("StartFromTop");
        }
        Actions a = new Actions(env, e);

        int counter = 0;
        while(counter < maxLength) {
            counter++;
            int action = getIntegerMinMax(0, 7);
            String actionName = "";

            boolean action0 = getBoolean();
            boolean action1 = getBoolean();
            boolean action2 = getBoolean();
            boolean action3 = getBoolean();
            boolean action4 = getBoolean();
            boolean action5 = getBoolean();
            boolean action6 = getBoolean();
            boolean action7 = action6 ? false : getBoolean();


            if(counter < maxLength && action0) {
                a.bobCall();
                actionHistory.add("bobCall");
                counter++;
            }
            if(counter < maxLength && action1) {
                a.aliceCall();
                actionHistory.add("aliceCall");
                counter++;
            }
            if(counter < maxLength && action2) {
                a.angelinaCall();
                actionHistory.add("angelinaCall");
                counter++;
            }
            if(counter < maxLength && action3) {
                a.chuckCall();
                actionHistory.add("chuckCall");
                counter++;
            }
            if(counter < maxLength && action4) {
                a.monicaCall();
                actionHistory.add("monicaCall");
                counter++;
            }
            if(counter < maxLength && action5) {
                a.bigMacCall();
                actionHistory.add("bigMacCall");
                counter++;
            }
            if(counter < maxLength && action6) {
                e.timeShift();
                actionHistory.add("1TS");
                counter++;
            } // execute one timestep
            if(counter < maxLength && action7) {
                actionHistory.add("3TS");// execute three timesteps
                for(int i = 0; i < 3; i++) {
                    e.timeShift();
                }
            }
            if(e.isBlocked()) {
                //System.out.println("Stopping Simulation path because Elevator is stuck (overloaded)");
                return;
            }
        }
        for(counter = 0; counter < cleanupTimeShifts && !e.isBlocked(); counter++) {
            if(e.isIdle()) {
                return;
            }
            e.timeShift();
        }
    }

    public static int getIntegerMinMax(int min, int max) {
        return SPLModelChecker.getIntMinMax(min, max);
    }

    public static boolean getBoolean() {
        return SPLModelChecker.getBoolean();
    }

    static String listToString(List<String> list) {
        String ret = "";
        for(String s : list) {
            ret = ret + " " + s;
        }
        return ret;
    }

    public void start(int specification, int variation) throws Throwable {
        try {
            if(verbose) {
                System.out.print("Started Elevator PL with Specification " + specification + ", Variation: " + variation);
            }

            test(specification, variation);
        } catch(Throwable e) {
            throw e;
        } finally {
		/*System.out.println("Penalty");
		if (!isAbortedRun) {
			int x = 1;
			for (int i = 0; i < 6000000; i++) {
				x = i / x + 10;
			}
		}*/
        }
    }

    public void checkOnlySpecification(int specID) {
        SpecificationManager.checkOnlySpecification(specID);
    }

    public List<String> getExecutedActions() {
        return actionHistory;
    }

    public boolean isAbortedRun() {
        return isAbortedRun;
    }

    // this method is used as hook for the liveness properties.
    public void test(int specification, int variation) {
        if(variation < 0) {
            switch(specification) {
//                case -1:
//                    Specification1();
//                    break;
//                case -2:
//                    Specification2();
//                    break;
                case -3:
                    Specification3();
                    break;
//                case -8: /*Specification8();*/
//                    isAbortedRun = true;
//                    break;
//                case -9:
//                    Specification9();
//                    break;
//                case -10: /*Specification10();*/
//                    isAbortedRun = true;
//                    break;
//                case -11: /*Specification11();*/
//                    isAbortedRun = true;
//                    break;
//                case -13:
//                    Specification13();
//                    break;
//                case -14:
//                    Specification14();
//                    break;
            }
        }
//        else {
//            randomSequenceOfActions(variation);
//        }
    }

    public void Specification1() {
        Environment env = new Environment(5);
        Elevator e = new Elevator(env, false);
        Actions a = new Actions(env, e);

        a.bigMacCall();
        a.angelinaCall();
        for(int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
            e.timeShift();
    }

    public void Specification2() {
        Environment env = new Environment(5);
        Elevator e = new Elevator(env, false);
        Actions a = new Actions(env, e);

        a.bigMacCall();
        for(int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
            e.timeShift();
    }

    public void Specification3() {
        Environment env = new Environment(5);
        Elevator e = new Elevator(env, false, 4, false);
        Actions a = new Actions(env, e);
        for(int i = 0; i < 100; i++) {
            Person bob = a.bobCall();
            //a.bigMacCall();
            while(env.getFloor(bob.getOrigin()).hasCall())
                e.timeShift();
            // bob has been picked up in executive Suite

            e.timeShift();
            // executive suite calls again
            // (lift should reverse directions although in-lift button for bob's
            // destination is still pressed)
            // direction, is active)
            a.bobCall();

            while(!e.isEmpty()) e.timeShift();
        }
        for(int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
            e.timeShift();
    }

    public void Specification9() {
        Environment env = new Environment(5);
        Elevator e = new Elevator(env, false);
        Actions a = new Actions(env, e);

        a.bigMacCall();
        for(int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
            e.timeShift();
    }

    public void Specification13() {
        Environment env = new Environment(5);
        Elevator e = new Elevator(env, false);
        Actions a = new Actions(env, e);

        a.aliceCall();
        Person angelina = a.angelinaCall();
        while(env.getFloor(angelina.getOrigin()).hasCall()) {
            e.timeShift();
        }
        a.bobCall();
        for(int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
            e.timeShift();
    }

    public void Specification14() {
        Environment env = new Environment(5);
        Elevator e = new Elevator(env, false);
        Actions a = new Actions(env, e);

        Person bm = a.bigMacCall();

        while(env.getFloor(bm.getOrigin()).hasCall()) {
            e.timeShift();
        }
        a.bobCall();
        for(int i = 0; i < cleanupTimeShifts && !e.isBlocked(); i++)
            e.timeShift();
    }


}
