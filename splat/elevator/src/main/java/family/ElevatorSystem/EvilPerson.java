package family.ElevatorSystem;


public class EvilPerson extends Person {


    private int[] additionalButtons;


//    @featureHouse.FeatureAnnotation(name = "base")
    public EvilPerson(String name, int weight, int origin, int destination, int[] additionalButtons,
                      Environment env) {
        super(name, weight, origin, destination, env);
        this.additionalButtons = additionalButtons;
    }


//    @featureHouse.FeatureAnnotation(name = "base")
    @Override
    public void enterElevator(Elevator e) {
        super.enterElevator(e);
        for(Integer btnID : additionalButtons)
            e.pressInLiftFloorButton(btnID);
    }


}
